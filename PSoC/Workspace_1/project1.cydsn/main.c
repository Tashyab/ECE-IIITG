#include "project.h"
#include <stdio.h>
#include <string.h>

#define DOT_DELAY_MS 250
#define DASH_DELAY_MS 1000

char morseBuffer[100];
uint8_t bufferIndex = 0;
uint8_t charIndex = 0;

char decodeMorse(char *morseCode) {
    if (strcmp(morseCode, ".-") == 0) return 'A';
    else if (strcmp(morseCode, "-...") == 0) return 'B';
    else if (strcmp(morseCode, "-.-.") == 0) return 'C';
    else if (strcmp(morseCode, "-..") == 0) return 'D';
    else if (strcmp(morseCode, ".") == 0) return 'E';
    else if (strcmp(morseCode, "..-.") == 0) return 'F';
    else if (strcmp(morseCode, "--.") == 0) return 'G';
    else if (strcmp(morseCode, "....") == 0) return 'H';
    else if (strcmp(morseCode, "..") == 0) return 'I';
    else if (strcmp(morseCode, ".---") == 0) return 'J';
    else if (strcmp(morseCode, "-.-") == 0) return 'K';
    else if (strcmp(morseCode, ".-..") == 0) return 'L';
    else if (strcmp(morseCode, "--") == 0) return 'M';
    else if (strcmp(morseCode, "-.") == 0) return 'N';
    else if (strcmp(morseCode, "---") == 0) return 'O';
    else if (strcmp(morseCode, ".--.") == 0) return 'P';
    else if (strcmp(morseCode, "--.-") == 0) return 'Q';
    else if (strcmp(morseCode, ".-.") == 0) return 'R';
    else if (strcmp(morseCode, "...") == 0) return 'S';
    else if (strcmp(morseCode, "-") == 0) return 'T';
    else if (strcmp(morseCode, "..-") == 0) return 'U';
    else if (strcmp(morseCode, "...-") == 0) return 'V';
    else if (strcmp(morseCode, ".--") == 0) return 'W';
    else if (strcmp(morseCode, "-..-") == 0) return 'X';
    else if (strcmp(morseCode, "-.--") == 0) return 'Y';
    else if (strcmp(morseCode, "--..") == 0) return 'Z';
    else if (strcmp(morseCode, "-----") == 0) return '0';
    else if (strcmp(morseCode, ".----") == 0) return '1';
    else if (strcmp(morseCode, "..---") == 0) return '2';
    else if (strcmp(morseCode, "...--") == 0) return '3';
    else if (strcmp(morseCode, "....-") == 0) return '4';
    else if (strcmp(morseCode, ".....") == 0) return '5';
    else if (strcmp(morseCode, "-....") == 0) return '6';
    else if (strcmp(morseCode, "--...") == 0) return '7';
    else if (strcmp(morseCode, "---..") == 0) return '8';
    else if (strcmp(morseCode, "----.") == 0) return '9';
    else return ' ';
}

void handleMorseInput(char input) {
    if (input == '.') {
        LED_Write(1);
        CyDelay(DOT_DELAY_MS);
        LED_Write(0);
        LCD_Position(0, bufferIndex);
        LCD_PutChar('.');
        USBUART_PutString(".");
        morseBuffer[bufferIndex++] = input;
    } else if (input == '-') {
        LED_Write(1);
        CyDelay(DASH_DELAY_MS);
        LED_Write(0);
        LCD_Position(0, bufferIndex);
        LCD_PutChar('-');
        USBUART_PutString("-");
        morseBuffer[bufferIndex++] = input;
    } else if (input == ' ') {
        USBUART_PutString(" ");
        morseBuffer[bufferIndex] = '\0';
        char decodedChar = decodeMorse(morseBuffer);
        LCD_Position(1, charIndex++);
        LCD_PutChar(decodedChar);
        bufferIndex = 0;
        for(int i = 0; i<10; i++){
            LCD_Position(0, i);
            LCD_PutChar(' ');
        }
        
    } else if(input == 's' || input == 'S') {
        USBUART_PutString("Hello from PSoC!\r\n");
    }
}

int main(void)
{
    CyGlobalIntEnable;

    LCD_Start();
    USBUART_Start(0, USBUART_5V_OPERATION);
    for (;;) 
    {
        if (USBUART_IsConfigurationChanged()) 
        {
            if (USBUART_GetConfiguration()) 
            {
                USBUART_CDC_Init();
            }
        }

        if (USBUART_GetConfiguration()) 
        {
            if (USBUART_DataIsReady()) 
            {
                char input = USBUART_GetChar();
                handleMorseInput(input);
            }
        }
    }
}
    