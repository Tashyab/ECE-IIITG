#include <reg51.h>

#define BAUDRATE 4800


void UART_Init() {
    TMOD = 0x20;    
    TH1 = 0xFA;
    TR1 = 1;        
    SCON = 0x50;    
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

void main() {
    UART_Init();   
    while (1) {
        char receivedChar;       
        receivedChar = UART_ReceiveChar();
        UART_SendChar(receivedChar);
    }
}