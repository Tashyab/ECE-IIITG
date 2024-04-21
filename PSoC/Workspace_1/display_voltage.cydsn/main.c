//ADC VOLTAGE CONTROL

#include "project.h"
#include <stdio.h>

int main(void)
{
    CyGlobalIntEnable;
    
    int16 pot_data;
    float voltage;
    char voltageString[16];
    LCD_Start();
    LCD_Position(0, 0);
    LCD_PrintString("POT VOLTAGE");
    ADC_SAR_Start();
    ADC_SAR_StartConvert();
    uint8 brightness;
    
    for(;;)
    {
        ADC_SAR_IsEndConversion(ADC_SAR_WAIT_FOR_RESULT);
        pot_data = ADC_SAR_GetResult16();
        voltage = (float) pot_data * 5.0 / 255.0;
        sprintf(voltageString, "Voltage: %.2f V", voltage);
        
        LCD_Position(1, 0);
        LCD_PrintString(voltageString);
        
        brightness = (uint8)(255 * voltage / 5.0);
        PWM_WriteCompare(brightness);
        
        if(voltage >= 2.5)
        {
            LED_Write(1);
            LCD_Position(1, 0);
            LCD_PrintString("LED ON");
        }
        else
        {
            LED_Write(0);
            LCD_Position(1, 0);
            LCD_PrintString("LED OFF");
        }
        
        CyDelay(500);
        LCD_ClearDisplay();
    }
}

