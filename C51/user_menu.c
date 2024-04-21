//User Menu

#include <reg51.h>

#define lcd_data P1

int i=0;
sbit rs=P0^0;
sbit en=P0^2;

void msdelay(int);
void LCD_cmd(unsigned char);
void LCD_char(char);
void LCD_string(char*);
void LCD_init(void);
void UART_Init();
void UART_SendChar(char);
char UART_ReceiveChar();
void rightshift(int);

void msdelay(int ms)
{
  
	for(i=0;i<ms;i++)
	{
		TH0 = 0xFC;
		TL0 = 0x18;
		TR0 = 1;
	
		while(TF0 != 1);
		TR0 = 0;
		TF0 = 0;
	}
}
void LCD_cmd(unsigned char a)
{
	lcd_data = a;
	rs = 0;
	en = 1;
	msdelay(1);
	en = 0;
	msdelay(5);
}

void LCD_char(char a)
{
    lcd_data = a;
    rs = 1;
    en = 1;
    msdelay(2);
    en= 0;
	msdelay(5);
}

void LCD_string(char *s)
{
	while(*s)
	{
		LCD_char(*s++);
	}
}

void LCD_init(void)
{
	TMOD=0x21;
	msdelay(20);
	LCD_cmd(0x38);
	LCD_cmd(0x0C);
	LCD_cmd(0x06);
	LCD_cmd(0x01);
	LCD_cmd(0x80);
}

void UART_Init() {
    TH1 = 0xFA;
    TR1 = 1;
    SCON = 0x50;
}

void UART_SendChar(unsigned char c) {
    SBUF = c;
    while (!TI);    
    TI = 0;
}
void UART_SendChar_string(unsigned char *d)
{
	while(*d){
		UART_SendChar(*d++);
	}
}
char UART_ReceiveChar() {
	  unsigned char OUT;
    while (!RI);    
    RI = 0; 
    OUT=SBUF;	
    return OUT;
}
void rightshift(int t){
	while(t--){
		LCD_cmd(0x1C);
	}
}
void main() {
		unsigned char receivedChar;
    LCD_init();
    while (1){
		UART_Init(); 
        receivedChar = UART_ReceiveChar();
        msdelay(5);
		if(receivedChar=='A'){
			UART_SendChar_string("A");
			LCD_cmd(0x01);
	        LCD_string("IIITG");
			rightshift(4);
		}
		else if(receivedChar=='B'){
			UART_SendChar_string("B");
			LCD_cmd(0x01);
	        LCD_string("2101214");
			rightshift(4);
		}
		else if(receivedChar=='C'){
			UART_SendChar_string("C");
			LCD_cmd(0x01);
	        LCD_string("09/10/2002");
			rightshift(4);
		}
		else {
			UART_SendChar_string("Incorrect option!!");
			LCD_cmd(0x01);
		}
    }
}
