#include <reg51.h>
#include <stdio.h>
#include <stdlib.h>
#include <math.h>


#define BAUDRATE 4800

#define lcd_data P1

sbit rs = P0^0;
sbit en = P0^2;
int i=0;

void UART_Init() {
    TMOD = 0x20;    
    TH1 = 0xFA;
    TR1 = 1;        
    SCON = 0x50;    
}
void msdelay(int ms){
		for (i=0;i<ms;i++)
	{
		TH0=0xFC;
		TL0=0X66;
		TR0=1;
		while(TF0==0);
		TR0=0;
		TF0=0;
	}
}

void LCD_cmd(unsigned char a){
	lcd_data=a;
	rs=0;
	en=1;
	msdelay(1);
	en=0;
	msdelay(5);
	
}

void LCD_init(){
	TMOD=0x21;
	msdelay(20);
	LCD_cmd(0x38);
	LCD_cmd(0x0C);
	LCD_cmd(0X06);
	LCD_cmd(0X01);
	LCD_cmd(0X80);
}

void LCD_char(char a){
	lcd_data=a;
	rs=1;
	en=1;
	msdelay(1);
	en = 0;
	msdelay(2);
}

void LCD_string(char*s)
{
	while(*s){
		LCD_char(*s++);
	}
}


void UART_SendChar(char c) {
    SBUF = c;
    while (!TI);    
    TI = 0;         
}

char UART_ReceiveChar() {
    while (!RI);   
    RI = 0;         
    return SBUF;
}

void displayString(char* str) {
    while (*str != '\0') {
        UART_SendChar(*str++);
    }
}

void displayMenu() {
    char *menu = "\n\nThe Calculator\n\n"
                 "Choose Operation:\n"
                 "1: Addition\n"
                 "2: Subtraction\n"
                 "3: Multiplication\n"
                 "4: Division\n"
								 "5: Power\n"
								 "6: Logarithm\n"
								 "7: Sine\n"
                 "8: Cosine\n"
								 "9: Tangent\n"
                 "Enter your choice: ";
    displayString(menu);
}

float getOperand() {
    char buffer[10];
    char c;
    int i = 0;

    while ((c = UART_ReceiveChar()) != '\n' && i < 9) {
        buffer[i++] = c;
        UART_SendChar(c);
    }
    buffer[i] = '\0';

    return atof(buffer);
}

void performOperation(char choice, float operand1, float operand2) {
    float result;
    char result_str[20];

    switch (choice) {
        case '1':
            result = operand1 + operand2;
            break;
        case '2':
            result = operand1 - operand2;
            break;
        case '3':
            result = operand1 * operand2;
            break;
        case '4':
            if (operand2 != 0)
                result = operand1 / operand2;
            else {
                displayString("\nError: Division by zero\n");
                return;
            }
            break;
				case '5':
            result = pow(operand1, operand2);
//            while(operand2--) {
//                result *= operand1;
//            }
            break;
				case '6':
            if (operand1 > 0 && operand2 > 0)
                result = log(operand1) / log(operand2);
            else {
                displayString("\nError: Operand or base cannot be zero or negative\n");
                return;
            }
            break;
				case '7':
						operand1 = operand1 * 3.1416 / 180;
            result = sin(operand1);
            break;
        case '8':
						operand1 = operand1 * 3.1416 / 180;
            result = cos(operand1);
            break;
				case '9':
						operand1 = operand1 * 3.1416 / 180;
            result = tan(operand1);
            break;
        default:
            displayString("\nInvalid choice\n");
            return;
    }

    sprintf(result_str, "\nResult: %.2f\n", result);
    displayString(result_str);
		LCD_string(result_str);
}

void calculator(){
	
	 UART_Init();
    
    while(1){
        char choice;
			
        displayMenu();
        choice = UART_ReceiveChar();

				LCD_cmd(0x01);
			
        if(choice == '1' || choice == '2' || choice == '3' || choice == '4' || choice == '5' || choice == '6'){
            float operand1, operand2;

            displayString("\nEnter first number: ");
            operand1 = getOperand();

            displayString("\nEnter second number: ");
            operand2 = getOperand();

            performOperation(choice, operand1, operand2);
						return ;	
        } 
				else  if(choice == '7' || choice == '8' || choice == '9'){
            float operand1, operand2;

            displayString("\nEnter the number: ");
            operand1 = getOperand();
						operand2 = 0;
					
						performOperation(choice, operand1, operand2);
						return ;
				}
				else{
            displayString("\nInvalid choice. Retry.\n");
						return ;
        }
    }
}

void main(){
	LCD_init();
	while(1){
		calculator();
	}
}