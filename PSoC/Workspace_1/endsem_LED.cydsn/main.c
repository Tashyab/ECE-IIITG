/* ========================================
 *
 * Copyright YOUR COMPANY, THE YEAR
 * All Rights Reserved
 * UNPUBLISHED, LICENSED SOFTWARE.
 *
 * CONFIDENTIAL AND PROPRIETARY INFORMATION
 * WHICH IS THE PROPERTY OF your company.
 *
 * ========================================
*/
#include "project.h"
#include <stdio.h>


int main(void)
{
    CyGlobalIntEnable;
    for(;;)
    {
        LED1_Write(1);
        LED2_Write(0);
        CyDelay(500);
        LED1_Write(0);
        LED2_Write(1);
        CyDelay(500);
    }
}

