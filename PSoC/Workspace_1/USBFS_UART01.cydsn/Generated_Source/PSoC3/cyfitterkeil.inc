;
; File Name: cyfitterkeil.inc
; 
; PSoC Creator  4.4
;
; Description:
; 
;
;-------------------------------------------------------------------------------
; Copyright (c) 2007-2020 Cypress Semiconductor.  All rights reserved.
; You may use this file only in accordance with the license, terms, conditions, 
; disclaimers, and limitations in the end user license agreement accompanying 
; the software package with which this file was provided.
;-------------------------------------------------------------------------------

#ifndef INCLUDED_CYFITTERKEIL_INC
#define INCLUDED_CYFITTERKEIL_INC
$INCLUDE (cydevicekeil.inc)
$INCLUDE (cydevicekeil_trm.inc)

; LCD
LCD_LCDPort__0__INTTYPE EQU CYREG_PICU2_INTTYPE0
LCD_LCDPort__0__MASK EQU 0x01
LCD_LCDPort__0__PC EQU CYREG_PRT2_PC0
LCD_LCDPort__0__PORT EQU 2
LCD_LCDPort__0__SHIFT EQU 0
LCD_LCDPort__1__INTTYPE EQU CYREG_PICU2_INTTYPE1
LCD_LCDPort__1__MASK EQU 0x02
LCD_LCDPort__1__PC EQU CYREG_PRT2_PC1
LCD_LCDPort__1__PORT EQU 2
LCD_LCDPort__1__SHIFT EQU 1
LCD_LCDPort__2__INTTYPE EQU CYREG_PICU2_INTTYPE2
LCD_LCDPort__2__MASK EQU 0x04
LCD_LCDPort__2__PC EQU CYREG_PRT2_PC2
LCD_LCDPort__2__PORT EQU 2
LCD_LCDPort__2__SHIFT EQU 2
LCD_LCDPort__3__INTTYPE EQU CYREG_PICU2_INTTYPE3
LCD_LCDPort__3__MASK EQU 0x08
LCD_LCDPort__3__PC EQU CYREG_PRT2_PC3
LCD_LCDPort__3__PORT EQU 2
LCD_LCDPort__3__SHIFT EQU 3
LCD_LCDPort__4__INTTYPE EQU CYREG_PICU2_INTTYPE4
LCD_LCDPort__4__MASK EQU 0x10
LCD_LCDPort__4__PC EQU CYREG_PRT2_PC4
LCD_LCDPort__4__PORT EQU 2
LCD_LCDPort__4__SHIFT EQU 4
LCD_LCDPort__5__INTTYPE EQU CYREG_PICU2_INTTYPE5
LCD_LCDPort__5__MASK EQU 0x20
LCD_LCDPort__5__PC EQU CYREG_PRT2_PC5
LCD_LCDPort__5__PORT EQU 2
LCD_LCDPort__5__SHIFT EQU 5
LCD_LCDPort__6__INTTYPE EQU CYREG_PICU2_INTTYPE6
LCD_LCDPort__6__MASK EQU 0x40
LCD_LCDPort__6__PC EQU CYREG_PRT2_PC6
LCD_LCDPort__6__PORT EQU 2
LCD_LCDPort__6__SHIFT EQU 6
LCD_LCDPort__AG EQU CYREG_PRT2_AG
LCD_LCDPort__AMUX EQU CYREG_PRT2_AMUX
LCD_LCDPort__BIE EQU CYREG_PRT2_BIE
LCD_LCDPort__BIT_MASK EQU CYREG_PRT2_BIT_MASK
LCD_LCDPort__BYP EQU CYREG_PRT2_BYP
LCD_LCDPort__CTL EQU CYREG_PRT2_CTL
LCD_LCDPort__DM0 EQU CYREG_PRT2_DM0
LCD_LCDPort__DM1 EQU CYREG_PRT2_DM1
LCD_LCDPort__DM2 EQU CYREG_PRT2_DM2
LCD_LCDPort__DR EQU CYREG_PRT2_DR
LCD_LCDPort__INP_DIS EQU CYREG_PRT2_INP_DIS
LCD_LCDPort__INTTYPE_BASE EQU CYDEV_PICU_INTTYPE_PICU2_BASE
LCD_LCDPort__LCD_COM_SEG EQU CYREG_PRT2_LCD_COM_SEG
LCD_LCDPort__LCD_EN EQU CYREG_PRT2_LCD_EN
LCD_LCDPort__MASK EQU 0x7F
LCD_LCDPort__PORT EQU 2
LCD_LCDPort__PRT EQU CYREG_PRT2_PRT
LCD_LCDPort__PRTDSI__CAPS_SEL EQU CYREG_PRT2_CAPS_SEL
LCD_LCDPort__PRTDSI__DBL_SYNC_IN EQU CYREG_PRT2_DBL_SYNC_IN
LCD_LCDPort__PRTDSI__OE_SEL0 EQU CYREG_PRT2_OE_SEL0
LCD_LCDPort__PRTDSI__OE_SEL1 EQU CYREG_PRT2_OE_SEL1
LCD_LCDPort__PRTDSI__OUT_SEL0 EQU CYREG_PRT2_OUT_SEL0
LCD_LCDPort__PRTDSI__OUT_SEL1 EQU CYREG_PRT2_OUT_SEL1
LCD_LCDPort__PRTDSI__SYNC_OUT EQU CYREG_PRT2_SYNC_OUT
LCD_LCDPort__PS EQU CYREG_PRT2_PS
LCD_LCDPort__SHIFT EQU 0
LCD_LCDPort__SLW EQU CYREG_PRT2_SLW

; USBUART
USBUART_arb_int__ES2_PATCH EQU 0
USBUART_arb_int__INTC_CLR_EN_REG EQU CYREG_INTC_CLR_EN2
USBUART_arb_int__INTC_CLR_PD_REG EQU CYREG_INTC_CLR_PD2
USBUART_arb_int__INTC_MASK EQU 0x40
USBUART_arb_int__INTC_NUMBER EQU 22
USBUART_arb_int__INTC_PRIOR_NUM EQU 7
USBUART_arb_int__INTC_PRIOR_REG EQU CYREG_INTC_PRIOR22
USBUART_arb_int__INTC_SET_EN_REG EQU CYREG_INTC_SET_EN2
USBUART_arb_int__INTC_SET_PD_REG EQU CYREG_INTC_SET_PD2
USBUART_arb_int__INTC_VECT EQU (CYREG_INTC_VECT_MBASE+0x2C)
USBUART_bus_reset__ES2_PATCH EQU 0
USBUART_bus_reset__INTC_CLR_EN_REG EQU CYREG_INTC_CLR_EN2
USBUART_bus_reset__INTC_CLR_PD_REG EQU CYREG_INTC_CLR_PD2
USBUART_bus_reset__INTC_MASK EQU 0x80
USBUART_bus_reset__INTC_NUMBER EQU 23
USBUART_bus_reset__INTC_PRIOR_NUM EQU 7
USBUART_bus_reset__INTC_PRIOR_REG EQU CYREG_INTC_PRIOR23
USBUART_bus_reset__INTC_SET_EN_REG EQU CYREG_INTC_SET_EN2
USBUART_bus_reset__INTC_SET_PD_REG EQU CYREG_INTC_SET_PD2
USBUART_bus_reset__INTC_VECT EQU (CYREG_INTC_VECT_MBASE+0x2E)
USBUART_Dm__0__INTTYPE EQU CYREG_PICU15_INTTYPE7
USBUART_Dm__0__MASK EQU 0x80
USBUART_Dm__0__PC EQU CYREG_IO_PC_PRT15_7_6_PC1
USBUART_Dm__0__PORT EQU 15
USBUART_Dm__0__SHIFT EQU 7
USBUART_Dm__AG EQU CYREG_PRT15_AG
USBUART_Dm__AMUX EQU CYREG_PRT15_AMUX
USBUART_Dm__BIE EQU CYREG_PRT15_BIE
USBUART_Dm__BIT_MASK EQU CYREG_PRT15_BIT_MASK
USBUART_Dm__BYP EQU CYREG_PRT15_BYP
USBUART_Dm__CTL EQU CYREG_PRT15_CTL
USBUART_Dm__DM0 EQU CYREG_PRT15_DM0
USBUART_Dm__DM1 EQU CYREG_PRT15_DM1
USBUART_Dm__DM2 EQU CYREG_PRT15_DM2
USBUART_Dm__DR EQU CYREG_PRT15_DR
USBUART_Dm__INP_DIS EQU CYREG_PRT15_INP_DIS
USBUART_Dm__INTTYPE_BASE EQU CYDEV_PICU_INTTYPE_PICU15_BASE
USBUART_Dm__LCD_COM_SEG EQU CYREG_PRT15_LCD_COM_SEG
USBUART_Dm__LCD_EN EQU CYREG_PRT15_LCD_EN
USBUART_Dm__MASK EQU 0x80
USBUART_Dm__PORT EQU 15
USBUART_Dm__PRT EQU CYREG_PRT15_PRT
USBUART_Dm__PRTDSI__CAPS_SEL EQU CYREG_PRT15_CAPS_SEL
USBUART_Dm__PRTDSI__DBL_SYNC_IN EQU CYREG_PRT15_DBL_SYNC_IN
USBUART_Dm__PRTDSI__OE_SEL0 EQU CYREG_PRT15_OE_SEL0
USBUART_Dm__PRTDSI__OE_SEL1 EQU CYREG_PRT15_OE_SEL1
USBUART_Dm__PRTDSI__OUT_SEL0 EQU CYREG_PRT15_OUT_SEL0
USBUART_Dm__PRTDSI__OUT_SEL1 EQU CYREG_PRT15_OUT_SEL1
USBUART_Dm__PRTDSI__SYNC_OUT EQU CYREG_PRT15_SYNC_OUT
USBUART_Dm__PS EQU CYREG_PRT15_PS
USBUART_Dm__SHIFT EQU 7
USBUART_Dm__SLW EQU CYREG_PRT15_SLW
USBUART_Dp__0__INTTYPE EQU CYREG_PICU15_INTTYPE6
USBUART_Dp__0__MASK EQU 0x40
USBUART_Dp__0__PC EQU CYREG_IO_PC_PRT15_7_6_PC0
USBUART_Dp__0__PORT EQU 15
USBUART_Dp__0__SHIFT EQU 6
USBUART_Dp__AG EQU CYREG_PRT15_AG
USBUART_Dp__AMUX EQU CYREG_PRT15_AMUX
USBUART_Dp__BIE EQU CYREG_PRT15_BIE
USBUART_Dp__BIT_MASK EQU CYREG_PRT15_BIT_MASK
USBUART_Dp__BYP EQU CYREG_PRT15_BYP
USBUART_Dp__CTL EQU CYREG_PRT15_CTL
USBUART_Dp__DM0 EQU CYREG_PRT15_DM0
USBUART_Dp__DM1 EQU CYREG_PRT15_DM1
USBUART_Dp__DM2 EQU CYREG_PRT15_DM2
USBUART_Dp__DR EQU CYREG_PRT15_DR
USBUART_Dp__INP_DIS EQU CYREG_PRT15_INP_DIS
USBUART_Dp__INTSTAT EQU CYREG_PICU15_INTSTAT
USBUART_Dp__INTTYPE_BASE EQU CYDEV_PICU_INTTYPE_PICU15_BASE
USBUART_Dp__LCD_COM_SEG EQU CYREG_PRT15_LCD_COM_SEG
USBUART_Dp__LCD_EN EQU CYREG_PRT15_LCD_EN
USBUART_Dp__MASK EQU 0x40
USBUART_Dp__PORT EQU 15
USBUART_Dp__PRT EQU CYREG_PRT15_PRT
USBUART_Dp__PRTDSI__CAPS_SEL EQU CYREG_PRT15_CAPS_SEL
USBUART_Dp__PRTDSI__DBL_SYNC_IN EQU CYREG_PRT15_DBL_SYNC_IN
USBUART_Dp__PRTDSI__OE_SEL0 EQU CYREG_PRT15_OE_SEL0
USBUART_Dp__PRTDSI__OE_SEL1 EQU CYREG_PRT15_OE_SEL1
USBUART_Dp__PRTDSI__OUT_SEL0 EQU CYREG_PRT15_OUT_SEL0
USBUART_Dp__PRTDSI__OUT_SEL1 EQU CYREG_PRT15_OUT_SEL1
USBUART_Dp__PRTDSI__SYNC_OUT EQU CYREG_PRT15_SYNC_OUT
USBUART_Dp__PS EQU CYREG_PRT15_PS
USBUART_Dp__SHIFT EQU 6
USBUART_Dp__SLW EQU CYREG_PRT15_SLW
USBUART_Dp__SNAP EQU CYREG_PICU15_SNAP
USBUART_dp_int__ES2_PATCH EQU 0
USBUART_dp_int__INTC_CLR_EN_REG EQU CYREG_INTC_CLR_EN1
USBUART_dp_int__INTC_CLR_PD_REG EQU CYREG_INTC_CLR_PD1
USBUART_dp_int__INTC_MASK EQU 0x10
USBUART_dp_int__INTC_NUMBER EQU 12
USBUART_dp_int__INTC_PRIOR_NUM EQU 7
USBUART_dp_int__INTC_PRIOR_REG EQU CYREG_INTC_PRIOR12
USBUART_dp_int__INTC_SET_EN_REG EQU CYREG_INTC_SET_EN1
USBUART_dp_int__INTC_SET_PD_REG EQU CYREG_INTC_SET_PD1
USBUART_dp_int__INTC_VECT EQU (CYREG_INTC_VECT_MBASE+0x18)
USBUART_ep_0__ES2_PATCH EQU 0
USBUART_ep_0__INTC_CLR_EN_REG EQU CYREG_INTC_CLR_EN3
USBUART_ep_0__INTC_CLR_PD_REG EQU CYREG_INTC_CLR_PD3
USBUART_ep_0__INTC_MASK EQU 0x01
USBUART_ep_0__INTC_NUMBER EQU 24
USBUART_ep_0__INTC_PRIOR_NUM EQU 7
USBUART_ep_0__INTC_PRIOR_REG EQU CYREG_INTC_PRIOR24
USBUART_ep_0__INTC_SET_EN_REG EQU CYREG_INTC_SET_EN3
USBUART_ep_0__INTC_SET_PD_REG EQU CYREG_INTC_SET_PD3
USBUART_ep_0__INTC_VECT EQU (CYREG_INTC_VECT_MBASE+0x30)
USBUART_ep_1__ES2_PATCH EQU 0
USBUART_ep_1__INTC_CLR_EN_REG EQU CYREG_INTC_CLR_EN0
USBUART_ep_1__INTC_CLR_PD_REG EQU CYREG_INTC_CLR_PD0
USBUART_ep_1__INTC_MASK EQU 0x01
USBUART_ep_1__INTC_NUMBER EQU 0
USBUART_ep_1__INTC_PRIOR_NUM EQU 7
USBUART_ep_1__INTC_PRIOR_REG EQU CYREG_INTC_PRIOR0
USBUART_ep_1__INTC_SET_EN_REG EQU CYREG_INTC_SET_EN0
USBUART_ep_1__INTC_SET_PD_REG EQU CYREG_INTC_SET_PD0
USBUART_ep_1__INTC_VECT EQU (CYREG_INTC_VECT_MBASE+0x00)
USBUART_ep_2__ES2_PATCH EQU 0
USBUART_ep_2__INTC_CLR_EN_REG EQU CYREG_INTC_CLR_EN0
USBUART_ep_2__INTC_CLR_PD_REG EQU CYREG_INTC_CLR_PD0
USBUART_ep_2__INTC_MASK EQU 0x02
USBUART_ep_2__INTC_NUMBER EQU 1
USBUART_ep_2__INTC_PRIOR_NUM EQU 7
USBUART_ep_2__INTC_PRIOR_REG EQU CYREG_INTC_PRIOR1
USBUART_ep_2__INTC_SET_EN_REG EQU CYREG_INTC_SET_EN0
USBUART_ep_2__INTC_SET_PD_REG EQU CYREG_INTC_SET_PD0
USBUART_ep_2__INTC_VECT EQU (CYREG_INTC_VECT_MBASE+0x02)
USBUART_ep_3__ES2_PATCH EQU 0
USBUART_ep_3__INTC_CLR_EN_REG EQU CYREG_INTC_CLR_EN0
USBUART_ep_3__INTC_CLR_PD_REG EQU CYREG_INTC_CLR_PD0
USBUART_ep_3__INTC_MASK EQU 0x04
USBUART_ep_3__INTC_NUMBER EQU 2
USBUART_ep_3__INTC_PRIOR_NUM EQU 7
USBUART_ep_3__INTC_PRIOR_REG EQU CYREG_INTC_PRIOR2
USBUART_ep_3__INTC_SET_EN_REG EQU CYREG_INTC_SET_EN0
USBUART_ep_3__INTC_SET_PD_REG EQU CYREG_INTC_SET_PD0
USBUART_ep_3__INTC_VECT EQU (CYREG_INTC_VECT_MBASE+0x04)
USBUART_ord_int__ES2_PATCH EQU 0
USBUART_ord_int__INTC_CLR_EN_REG EQU CYREG_INTC_CLR_EN3
USBUART_ord_int__INTC_CLR_PD_REG EQU CYREG_INTC_CLR_PD3
USBUART_ord_int__INTC_MASK EQU 0x02
USBUART_ord_int__INTC_NUMBER EQU 25
USBUART_ord_int__INTC_PRIOR_NUM EQU 7
USBUART_ord_int__INTC_PRIOR_REG EQU CYREG_INTC_PRIOR25
USBUART_ord_int__INTC_SET_EN_REG EQU CYREG_INTC_SET_EN3
USBUART_ord_int__INTC_SET_PD_REG EQU CYREG_INTC_SET_PD3
USBUART_ord_int__INTC_VECT EQU (CYREG_INTC_VECT_MBASE+0x32)
USBUART_sof_int__ES2_PATCH EQU 0
USBUART_sof_int__INTC_CLR_EN_REG EQU CYREG_INTC_CLR_EN2
USBUART_sof_int__INTC_CLR_PD_REG EQU CYREG_INTC_CLR_PD2
USBUART_sof_int__INTC_MASK EQU 0x20
USBUART_sof_int__INTC_NUMBER EQU 21
USBUART_sof_int__INTC_PRIOR_NUM EQU 7
USBUART_sof_int__INTC_PRIOR_REG EQU CYREG_INTC_PRIOR21
USBUART_sof_int__INTC_SET_EN_REG EQU CYREG_INTC_SET_EN2
USBUART_sof_int__INTC_SET_PD_REG EQU CYREG_INTC_SET_PD2
USBUART_sof_int__INTC_VECT EQU (CYREG_INTC_VECT_MBASE+0x2A)
USBUART_USB__ARB_CFG EQU CYREG_USB_ARB_CFG
USBUART_USB__ARB_EP1_CFG EQU CYREG_USB_ARB_EP1_CFG
USBUART_USB__ARB_EP1_INT_EN EQU CYREG_USB_ARB_EP1_INT_EN
USBUART_USB__ARB_EP1_SR EQU CYREG_USB_ARB_EP1_SR
USBUART_USB__ARB_EP2_CFG EQU CYREG_USB_ARB_EP2_CFG
USBUART_USB__ARB_EP2_INT_EN EQU CYREG_USB_ARB_EP2_INT_EN
USBUART_USB__ARB_EP2_SR EQU CYREG_USB_ARB_EP2_SR
USBUART_USB__ARB_EP3_CFG EQU CYREG_USB_ARB_EP3_CFG
USBUART_USB__ARB_EP3_INT_EN EQU CYREG_USB_ARB_EP3_INT_EN
USBUART_USB__ARB_EP3_SR EQU CYREG_USB_ARB_EP3_SR
USBUART_USB__ARB_EP4_CFG EQU CYREG_USB_ARB_EP4_CFG
USBUART_USB__ARB_EP4_INT_EN EQU CYREG_USB_ARB_EP4_INT_EN
USBUART_USB__ARB_EP4_SR EQU CYREG_USB_ARB_EP4_SR
USBUART_USB__ARB_EP5_CFG EQU CYREG_USB_ARB_EP5_CFG
USBUART_USB__ARB_EP5_INT_EN EQU CYREG_USB_ARB_EP5_INT_EN
USBUART_USB__ARB_EP5_SR EQU CYREG_USB_ARB_EP5_SR
USBUART_USB__ARB_EP6_CFG EQU CYREG_USB_ARB_EP6_CFG
USBUART_USB__ARB_EP6_INT_EN EQU CYREG_USB_ARB_EP6_INT_EN
USBUART_USB__ARB_EP6_SR EQU CYREG_USB_ARB_EP6_SR
USBUART_USB__ARB_EP7_CFG EQU CYREG_USB_ARB_EP7_CFG
USBUART_USB__ARB_EP7_INT_EN EQU CYREG_USB_ARB_EP7_INT_EN
USBUART_USB__ARB_EP7_SR EQU CYREG_USB_ARB_EP7_SR
USBUART_USB__ARB_EP8_CFG EQU CYREG_USB_ARB_EP8_CFG
USBUART_USB__ARB_EP8_INT_EN EQU CYREG_USB_ARB_EP8_INT_EN
USBUART_USB__ARB_EP8_SR EQU CYREG_USB_ARB_EP8_SR
USBUART_USB__ARB_INT_EN EQU CYREG_USB_ARB_INT_EN
USBUART_USB__ARB_INT_SR EQU CYREG_USB_ARB_INT_SR
USBUART_USB__ARB_RW1_DR EQU CYREG_USB_ARB_RW1_DR
USBUART_USB__ARB_RW1_RA EQU CYREG_USB_ARB_RW1_RA
USBUART_USB__ARB_RW1_RA_MSB EQU CYREG_USB_ARB_RW1_RA_MSB
USBUART_USB__ARB_RW1_WA EQU CYREG_USB_ARB_RW1_WA
USBUART_USB__ARB_RW1_WA_MSB EQU CYREG_USB_ARB_RW1_WA_MSB
USBUART_USB__ARB_RW2_DR EQU CYREG_USB_ARB_RW2_DR
USBUART_USB__ARB_RW2_RA EQU CYREG_USB_ARB_RW2_RA
USBUART_USB__ARB_RW2_RA_MSB EQU CYREG_USB_ARB_RW2_RA_MSB
USBUART_USB__ARB_RW2_WA EQU CYREG_USB_ARB_RW2_WA
USBUART_USB__ARB_RW2_WA_MSB EQU CYREG_USB_ARB_RW2_WA_MSB
USBUART_USB__ARB_RW3_DR EQU CYREG_USB_ARB_RW3_DR
USBUART_USB__ARB_RW3_RA EQU CYREG_USB_ARB_RW3_RA
USBUART_USB__ARB_RW3_RA_MSB EQU CYREG_USB_ARB_RW3_RA_MSB
USBUART_USB__ARB_RW3_WA EQU CYREG_USB_ARB_RW3_WA
USBUART_USB__ARB_RW3_WA_MSB EQU CYREG_USB_ARB_RW3_WA_MSB
USBUART_USB__ARB_RW4_DR EQU CYREG_USB_ARB_RW4_DR
USBUART_USB__ARB_RW4_RA EQU CYREG_USB_ARB_RW4_RA
USBUART_USB__ARB_RW4_RA_MSB EQU CYREG_USB_ARB_RW4_RA_MSB
USBUART_USB__ARB_RW4_WA EQU CYREG_USB_ARB_RW4_WA
USBUART_USB__ARB_RW4_WA_MSB EQU CYREG_USB_ARB_RW4_WA_MSB
USBUART_USB__ARB_RW5_DR EQU CYREG_USB_ARB_RW5_DR
USBUART_USB__ARB_RW5_RA EQU CYREG_USB_ARB_RW5_RA
USBUART_USB__ARB_RW5_RA_MSB EQU CYREG_USB_ARB_RW5_RA_MSB
USBUART_USB__ARB_RW5_WA EQU CYREG_USB_ARB_RW5_WA
USBUART_USB__ARB_RW5_WA_MSB EQU CYREG_USB_ARB_RW5_WA_MSB
USBUART_USB__ARB_RW6_DR EQU CYREG_USB_ARB_RW6_DR
USBUART_USB__ARB_RW6_RA EQU CYREG_USB_ARB_RW6_RA
USBUART_USB__ARB_RW6_RA_MSB EQU CYREG_USB_ARB_RW6_RA_MSB
USBUART_USB__ARB_RW6_WA EQU CYREG_USB_ARB_RW6_WA
USBUART_USB__ARB_RW6_WA_MSB EQU CYREG_USB_ARB_RW6_WA_MSB
USBUART_USB__ARB_RW7_DR EQU CYREG_USB_ARB_RW7_DR
USBUART_USB__ARB_RW7_RA EQU CYREG_USB_ARB_RW7_RA
USBUART_USB__ARB_RW7_RA_MSB EQU CYREG_USB_ARB_RW7_RA_MSB
USBUART_USB__ARB_RW7_WA EQU CYREG_USB_ARB_RW7_WA
USBUART_USB__ARB_RW7_WA_MSB EQU CYREG_USB_ARB_RW7_WA_MSB
USBUART_USB__ARB_RW8_DR EQU CYREG_USB_ARB_RW8_DR
USBUART_USB__ARB_RW8_RA EQU CYREG_USB_ARB_RW8_RA
USBUART_USB__ARB_RW8_RA_MSB EQU CYREG_USB_ARB_RW8_RA_MSB
USBUART_USB__ARB_RW8_WA EQU CYREG_USB_ARB_RW8_WA
USBUART_USB__ARB_RW8_WA_MSB EQU CYREG_USB_ARB_RW8_WA_MSB
USBUART_USB__BUF_SIZE EQU CYREG_USB_BUF_SIZE
USBUART_USB__BUS_RST_CNT EQU CYREG_USB_BUS_RST_CNT
USBUART_USB__CR0 EQU CYREG_USB_CR0
USBUART_USB__CR1 EQU CYREG_USB_CR1
USBUART_USB__CWA EQU CYREG_USB_CWA
USBUART_USB__CWA_MSB EQU CYREG_USB_CWA_MSB
USBUART_USB__DMA_THRES EQU CYREG_USB_DMA_THRES
USBUART_USB__DMA_THRES_MSB EQU CYREG_USB_DMA_THRES_MSB
USBUART_USB__DYN_RECONFIG EQU CYREG_USB_DYN_RECONFIG
USBUART_USB__EP_ACTIVE EQU CYREG_USB_EP_ACTIVE
USBUART_USB__EP_TYPE EQU CYREG_USB_EP_TYPE
USBUART_USB__EP0_CNT EQU CYREG_USB_EP0_CNT
USBUART_USB__EP0_CR EQU CYREG_USB_EP0_CR
USBUART_USB__EP0_DR0 EQU CYREG_USB_EP0_DR0
USBUART_USB__EP0_DR1 EQU CYREG_USB_EP0_DR1
USBUART_USB__EP0_DR2 EQU CYREG_USB_EP0_DR2
USBUART_USB__EP0_DR3 EQU CYREG_USB_EP0_DR3
USBUART_USB__EP0_DR4 EQU CYREG_USB_EP0_DR4
USBUART_USB__EP0_DR5 EQU CYREG_USB_EP0_DR5
USBUART_USB__EP0_DR6 EQU CYREG_USB_EP0_DR6
USBUART_USB__EP0_DR7 EQU CYREG_USB_EP0_DR7
USBUART_USB__MEM_DATA EQU CYREG_USB_MEM_DATA_MBASE
USBUART_USB__OSCLK_DR0 EQU CYREG_USB_OSCLK_DR0
USBUART_USB__OSCLK_DR1 EQU CYREG_USB_OSCLK_DR1
USBUART_USB__PM_ACT_CFG EQU CYREG_PM_ACT_CFG5
USBUART_USB__PM_ACT_MSK EQU 0x01
USBUART_USB__PM_STBY_CFG EQU CYREG_PM_STBY_CFG5
USBUART_USB__PM_STBY_MSK EQU 0x01
USBUART_USB__SIE_EP_INT_EN EQU CYREG_USB_SIE_EP_INT_EN
USBUART_USB__SIE_EP_INT_SR EQU CYREG_USB_SIE_EP_INT_SR
USBUART_USB__SIE_EP1_CNT0 EQU CYREG_USB_SIE_EP1_CNT0
USBUART_USB__SIE_EP1_CNT1 EQU CYREG_USB_SIE_EP1_CNT1
USBUART_USB__SIE_EP1_CR0 EQU CYREG_USB_SIE_EP1_CR0
USBUART_USB__SIE_EP2_CNT0 EQU CYREG_USB_SIE_EP2_CNT0
USBUART_USB__SIE_EP2_CNT1 EQU CYREG_USB_SIE_EP2_CNT1
USBUART_USB__SIE_EP2_CR0 EQU CYREG_USB_SIE_EP2_CR0
USBUART_USB__SIE_EP3_CNT0 EQU CYREG_USB_SIE_EP3_CNT0
USBUART_USB__SIE_EP3_CNT1 EQU CYREG_USB_SIE_EP3_CNT1
USBUART_USB__SIE_EP3_CR0 EQU CYREG_USB_SIE_EP3_CR0
USBUART_USB__SIE_EP4_CNT0 EQU CYREG_USB_SIE_EP4_CNT0
USBUART_USB__SIE_EP4_CNT1 EQU CYREG_USB_SIE_EP4_CNT1
USBUART_USB__SIE_EP4_CR0 EQU CYREG_USB_SIE_EP4_CR0
USBUART_USB__SIE_EP5_CNT0 EQU CYREG_USB_SIE_EP5_CNT0
USBUART_USB__SIE_EP5_CNT1 EQU CYREG_USB_SIE_EP5_CNT1
USBUART_USB__SIE_EP5_CR0 EQU CYREG_USB_SIE_EP5_CR0
USBUART_USB__SIE_EP6_CNT0 EQU CYREG_USB_SIE_EP6_CNT0
USBUART_USB__SIE_EP6_CNT1 EQU CYREG_USB_SIE_EP6_CNT1
USBUART_USB__SIE_EP6_CR0 EQU CYREG_USB_SIE_EP6_CR0
USBUART_USB__SIE_EP7_CNT0 EQU CYREG_USB_SIE_EP7_CNT0
USBUART_USB__SIE_EP7_CNT1 EQU CYREG_USB_SIE_EP7_CNT1
USBUART_USB__SIE_EP7_CR0 EQU CYREG_USB_SIE_EP7_CR0
USBUART_USB__SIE_EP8_CNT0 EQU CYREG_USB_SIE_EP8_CNT0
USBUART_USB__SIE_EP8_CNT1 EQU CYREG_USB_SIE_EP8_CNT1
USBUART_USB__SIE_EP8_CR0 EQU CYREG_USB_SIE_EP8_CR0
USBUART_USB__SOF0 EQU CYREG_USB_SOF0
USBUART_USB__SOF1 EQU CYREG_USB_SOF1
USBUART_USB__USB_CLK_EN EQU CYREG_USB_USB_CLK_EN
USBUART_USB__USBIO_CR0 EQU CYREG_USB_USBIO_CR0
USBUART_USB__USBIO_CR1 EQU CYREG_USB_USBIO_CR1
USBUART_USB__USBIO_CR2 EQU CYREG_USB_USBIO_CR2

; Miscellaneous
BCLK__BUS_CLK__HZ EQU 64000000
BCLK__BUS_CLK__KHZ EQU 64000
BCLK__BUS_CLK__MHZ EQU 64
CY_PROJECT_NAME LIT 'USBFS_UART01'
CY_VERSION LIT 'PSoC Creator  4.4'
CYDEV_CHIP_DIE_LEOPARD EQU 1
CYDEV_CHIP_DIE_PSOC4A EQU 26
CYDEV_CHIP_DIE_PSOC5LP EQU 2
CYDEV_CHIP_DIE_PSOC5TM EQU 3
CYDEV_CHIP_DIE_TMA4 EQU 4
CYDEV_CHIP_DIE_UNKNOWN EQU 0
CYDEV_CHIP_FAMILY_FM0P EQU 5
CYDEV_CHIP_FAMILY_FM3 EQU 6
CYDEV_CHIP_FAMILY_FM4 EQU 7
CYDEV_CHIP_FAMILY_PSOC3 EQU 1
CYDEV_CHIP_FAMILY_PSOC4 EQU 2
CYDEV_CHIP_FAMILY_PSOC5 EQU 3
CYDEV_CHIP_FAMILY_PSOC6 EQU 4
CYDEV_CHIP_FAMILY_UNKNOWN EQU 0
CYDEV_CHIP_FAMILY_USED EQU CYDEV_CHIP_FAMILY_PSOC3
CYDEV_CHIP_JTAG_ID EQU 0x1E028069
CYDEV_CHIP_MEMBER_3A EQU 1
CYDEV_CHIP_MEMBER_4A EQU 26
CYDEV_CHIP_MEMBER_4AA EQU 25
CYDEV_CHIP_MEMBER_4AB EQU 30
CYDEV_CHIP_MEMBER_4AC EQU 14
CYDEV_CHIP_MEMBER_4AD EQU 15
CYDEV_CHIP_MEMBER_4AE EQU 16
CYDEV_CHIP_MEMBER_4D EQU 20
CYDEV_CHIP_MEMBER_4E EQU 6
CYDEV_CHIP_MEMBER_4F EQU 27
CYDEV_CHIP_MEMBER_4G EQU 4
CYDEV_CHIP_MEMBER_4H EQU 24
CYDEV_CHIP_MEMBER_4I EQU 32
CYDEV_CHIP_MEMBER_4J EQU 21
CYDEV_CHIP_MEMBER_4K EQU 22
CYDEV_CHIP_MEMBER_4L EQU 31
CYDEV_CHIP_MEMBER_4M EQU 29
CYDEV_CHIP_MEMBER_4N EQU 11
CYDEV_CHIP_MEMBER_4O EQU 8
CYDEV_CHIP_MEMBER_4P EQU 28
CYDEV_CHIP_MEMBER_4Q EQU 17
CYDEV_CHIP_MEMBER_4R EQU 9
CYDEV_CHIP_MEMBER_4S EQU 12
CYDEV_CHIP_MEMBER_4T EQU 10
CYDEV_CHIP_MEMBER_4U EQU 5
CYDEV_CHIP_MEMBER_4V EQU 23
CYDEV_CHIP_MEMBER_4W EQU 13
CYDEV_CHIP_MEMBER_4X EQU 7
CYDEV_CHIP_MEMBER_4Y EQU 18
CYDEV_CHIP_MEMBER_4Z EQU 19
CYDEV_CHIP_MEMBER_5A EQU 3
CYDEV_CHIP_MEMBER_5B EQU 2
CYDEV_CHIP_MEMBER_6A EQU 33
CYDEV_CHIP_MEMBER_FM3 EQU 37
CYDEV_CHIP_MEMBER_FM4 EQU 38
CYDEV_CHIP_MEMBER_PDL_FM0P_TYPE1 EQU 34
CYDEV_CHIP_MEMBER_PDL_FM0P_TYPE2 EQU 35
CYDEV_CHIP_MEMBER_PDL_FM0P_TYPE3 EQU 36
CYDEV_CHIP_MEMBER_UNKNOWN EQU 0
CYDEV_CHIP_MEMBER_USED EQU CYDEV_CHIP_MEMBER_3A
CYDEV_CHIP_DIE_EXPECT EQU CYDEV_CHIP_MEMBER_USED
CYDEV_CHIP_DIE_ACTUAL EQU CYDEV_CHIP_DIE_EXPECT
CYDEV_CHIP_REV_LEOPARD_ES1 EQU 0
CYDEV_CHIP_REV_LEOPARD_ES2 EQU 1
CYDEV_CHIP_REV_LEOPARD_ES3 EQU 3
CYDEV_CHIP_REV_LEOPARD_PRODUCTION EQU 3
CYDEV_CHIP_REV_PSOC4A_ES0 EQU 17
CYDEV_CHIP_REV_PSOC4A_PRODUCTION EQU 17
CYDEV_CHIP_REV_PSOC5LP_ES0 EQU 0
CYDEV_CHIP_REV_PSOC5LP_PRODUCTION EQU 0
CYDEV_CHIP_REV_PSOC5TM_ES0 EQU 0
CYDEV_CHIP_REV_PSOC5TM_ES1 EQU 1
CYDEV_CHIP_REV_PSOC5TM_PRODUCTION EQU 1
CYDEV_CHIP_REV_TMA4_ES EQU 17
CYDEV_CHIP_REV_TMA4_ES2 EQU 33
CYDEV_CHIP_REV_TMA4_PRODUCTION EQU 17
CYDEV_CHIP_REVISION_3A_ES1 EQU 0
CYDEV_CHIP_REVISION_3A_ES2 EQU 1
CYDEV_CHIP_REVISION_3A_ES3 EQU 3
CYDEV_CHIP_REVISION_3A_PRODUCTION EQU 3
CYDEV_CHIP_REVISION_4A_ES0 EQU 17
CYDEV_CHIP_REVISION_4A_PRODUCTION EQU 17
CYDEV_CHIP_REVISION_4AA_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_4AB_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_4AC_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_4AD_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_4AE_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_4D_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_4E_CCG2_NO_USBPD EQU 0
CYDEV_CHIP_REVISION_4E_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_4F_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_4F_PRODUCTION_256DMA EQU 0
CYDEV_CHIP_REVISION_4F_PRODUCTION_256K EQU 0
CYDEV_CHIP_REVISION_4G_ES EQU 17
CYDEV_CHIP_REVISION_4G_ES2 EQU 33
CYDEV_CHIP_REVISION_4G_PRODUCTION EQU 17
CYDEV_CHIP_REVISION_4H_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_4I_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_4J_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_4K_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_4L_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_4M_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_4N_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_4O_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_4P_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_4Q_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_4R_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_4S_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_4T_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_4U_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_4V_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_4W_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_4X_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_4Y_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_4Z_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_5A_ES0 EQU 0
CYDEV_CHIP_REVISION_5A_ES1 EQU 1
CYDEV_CHIP_REVISION_5A_PRODUCTION EQU 1
CYDEV_CHIP_REVISION_5B_ES0 EQU 0
CYDEV_CHIP_REVISION_5B_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_6A_ES EQU 17
CYDEV_CHIP_REVISION_6A_NO_UDB EQU 33
CYDEV_CHIP_REVISION_6A_PRODUCTION EQU 33
CYDEV_CHIP_REVISION_FM3_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_FM4_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_PDL_FM0P_TYPE1_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_PDL_FM0P_TYPE2_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_PDL_FM0P_TYPE3_PRODUCTION EQU 0
CYDEV_CHIP_REVISION_USED EQU CYDEV_CHIP_REVISION_3A_PRODUCTION
CYDEV_CHIP_REV_EXPECT EQU CYDEV_CHIP_REVISION_USED
CYDEV_CONFIG_FASTBOOT_ENABLED EQU 1
CYDEV_CONFIG_UNUSED_IO_AllowButWarn EQU 0
CYDEV_CONFIG_UNUSED_IO EQU CYDEV_CONFIG_UNUSED_IO_AllowButWarn
CYDEV_CONFIG_UNUSED_IO_AllowWithInfo EQU 1
CYDEV_CONFIG_UNUSED_IO_Disallowed EQU 2
CYDEV_CONFIGURATION_CLEAR_SRAM EQU 1
CYDEV_CONFIGURATION_COMPRESSED EQU 1
CYDEV_CONFIGURATION_DMA EQU 0
CYDEV_CONFIGURATION_ECC EQU 0
CYDEV_CONFIGURATION_IMOENABLED EQU CYDEV_CONFIG_FASTBOOT_ENABLED
CYDEV_CONFIGURATION_MODE_COMPRESSED EQU 0
CYDEV_CONFIGURATION_MODE EQU CYDEV_CONFIGURATION_MODE_COMPRESSED
CYDEV_CONFIGURATION_MODE_DMA EQU 2
CYDEV_CONFIGURATION_MODE_UNCOMPRESSED EQU 1
CYDEV_DEBUG_ENABLE_MASK EQU 0x01
CYDEV_DEBUG_ENABLE_REGISTER EQU CYREG_MLOGIC_DEBUG
CYDEV_DEBUGGING_DPS_Disable EQU 3
CYDEV_DEBUGGING_DPS_JTAG_4 EQU 1
CYDEV_DEBUGGING_DPS_JTAG_5 EQU 0
CYDEV_DEBUGGING_DPS_SWD EQU 2
CYDEV_DEBUGGING_DPS_SWD_SWV EQU 6
CYDEV_DEBUGGING_DPS EQU CYDEV_DEBUGGING_DPS_SWD_SWV
CYDEV_DEBUGGING_ENABLE EQU 1
CYDEV_DEBUGGING_XRES EQU 1
CYDEV_DMA_CHANNELS_AVAILABLE EQU 24
CYDEV_ECC_ENABLE EQU 0
CYDEV_INSTRUCT_CACHE_ENABLED EQU 0
CYDEV_INTR_RISING EQU 0x00000000
CYDEV_IS_EXPORTING_CODE EQU 0
CYDEV_IS_IMPORTING_CODE EQU 0
CYDEV_PROJ_TYPE EQU 0
CYDEV_PROJ_TYPE_BOOTLOADER EQU 1
CYDEV_PROJ_TYPE_LAUNCHER EQU 5
CYDEV_PROJ_TYPE_LOADABLE EQU 2
CYDEV_PROJ_TYPE_LOADABLEANDBOOTLOADER EQU 4
CYDEV_PROJ_TYPE_MULTIAPPBOOTLOADER EQU 3
CYDEV_PROJ_TYPE_STANDARD EQU 0
CYDEV_PROTECTION_ENABLE EQU 0
CYDEV_USB_CLK_OSC_LOCKING_ENABLED_AT_PWR_UP EQU 1
CYDEV_VARIABLE_VDDA EQU 1
CYDEV_VDDA LIT '5.0'
CYDEV_VDDA_MV EQU 5000
CYDEV_VDDD LIT '5.0'
CYDEV_VDDD_MV EQU 5000
CYDEV_VDDIO0 LIT '5.0'
CYDEV_VDDIO0_MV EQU 5000
CYDEV_VDDIO1 LIT '5.0'
CYDEV_VDDIO1_MV EQU 5000
CYDEV_VDDIO2 LIT '5.0'
CYDEV_VDDIO2_MV EQU 5000
CYDEV_VDDIO3 LIT '5.0'
CYDEV_VDDIO3_MV EQU 5000
CYDEV_VIO0 LIT '5.0'
CYDEV_VIO0_MV EQU 5000
CYDEV_VIO1 LIT '5.0'
CYDEV_VIO1_MV EQU 5000
CYDEV_VIO2 LIT '5.0'
CYDEV_VIO2_MV EQU 5000
CYDEV_VIO3 LIT '5.0'
CYDEV_VIO3_MV EQU 5000
CYIPBLOCK_DP8051_VERSION EQU 0
CYIPBLOCK_P3_ANAIF_VERSION EQU 0
CYIPBLOCK_P3_CAN_VERSION EQU 0
CYIPBLOCK_P3_CAPSENSE_VERSION EQU 0
CYIPBLOCK_P3_COMP_VERSION EQU 0
CYIPBLOCK_P3_DECIMATOR_VERSION EQU 0
CYIPBLOCK_P3_DFB_VERSION EQU 0
CYIPBLOCK_P3_DMA_VERSION EQU 0
CYIPBLOCK_P3_DRQ_VERSION EQU 0
CYIPBLOCK_P3_DSM_VERSION EQU 0
CYIPBLOCK_P3_EMIF_VERSION EQU 0
CYIPBLOCK_P3_I2C_VERSION EQU 0
CYIPBLOCK_P3_LCD_VERSION EQU 0
CYIPBLOCK_P3_LPF_VERSION EQU 0
CYIPBLOCK_P3_OPAMP_VERSION EQU 0
CYIPBLOCK_P3_PM_VERSION EQU 0
CYIPBLOCK_P3_SCCT_VERSION EQU 0
CYIPBLOCK_P3_TIMER_VERSION EQU 0
CYIPBLOCK_P3_USB_VERSION EQU 0
CYIPBLOCK_P3_VIDAC_VERSION EQU 0
CYIPBLOCK_P3_VREF_VERSION EQU 0
CYIPBLOCK_S8_GPIO_VERSION EQU 0
CYIPBLOCK_S8_IRQ_VERSION EQU 0
CYIPBLOCK_S8_SIO_VERSION EQU 0
CYIPBLOCK_S8_UDB_VERSION EQU 0
CyScBoostClk__CFG0 EQU CYREG_CLKDIST_ACFG0_CFG0
CyScBoostClk__CFG1 EQU CYREG_CLKDIST_ACFG0_CFG1
CyScBoostClk__CFG2 EQU CYREG_CLKDIST_ACFG0_CFG2
CyScBoostClk__CFG2_SRC_SEL_MASK EQU 0x07
CyScBoostClk__CFG3 EQU CYREG_CLKDIST_ACFG0_CFG3
CyScBoostClk__CFG3_PHASE_DLY_MASK EQU 0x0F
CyScBoostClk__INDEX EQU 0x00
CyScBoostClk__PM_ACT_CFG EQU CYREG_PM_ACT_CFG1
CyScBoostClk__PM_ACT_MSK EQU 0x01
CyScBoostClk__PM_STBY_CFG EQU CYREG_PM_STBY_CFG1
CyScBoostClk__PM_STBY_MSK EQU 0x01
DMA_CHANNELS_USED__MASK0 EQU 0x00000000
CYDEV_BOOTLOADER_ENABLE EQU 0

#endif /* INCLUDED_CYFITTERKEIL_INC */
