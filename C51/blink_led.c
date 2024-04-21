#include <reg51.h>
#define lcd_data P1

int i;

sbit rs=P0^0;
sbit en=P0^2;

void msdelay(int ms)
{
  
	for(i=0;i<ms;i++)
	{
		TMOD = 0x01;
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
void LCD_init(void)
{
	msdelay(20);
	LCD_cmd(0x38);
	LCD_cmd(0x0C);
	LCD_cmd(0x06);
	LCD_cmd(0x01);
	LCD_cmd(0x80);
	
}

void LCD_char(char a)
{
	lcd_data = a;
	rs = 1;
	en = 1;
	msdelay(1);
	en = 0;
	msdelay(5);
	
}

void LCD_string(char *s)
{
	while(*s)
	{
		LCD_char(*s++);
	}
}



void main()
{
	
	LCD_init();
	msdelay(20);
	LCD_cmd(0x86);
	LCD_string("IIITG");
	while(1);
		
}