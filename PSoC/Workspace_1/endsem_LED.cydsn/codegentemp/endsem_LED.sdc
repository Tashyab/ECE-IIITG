# THIS FILE IS AUTOMATICALLY GENERATED
# Project: C:\Users\Acer\3D Objects\Class Notes\PSoC\Workspace_1\endsem_LED.cydsn\endsem_LED.cyprj
# Date: Tue, 16 Apr 2024 09:38:00 GMT
#set_units -time ns
create_clock -name {CyILO} -period 1000000 -waveform {0 500000} [list [get_pins {ClockBlock/ilo}] [get_pins {ClockBlock/clk_100k}] [get_pins {ClockBlock/clk_1k}] [get_pins {ClockBlock/clk_32k}]]
create_clock -name {CyIMO} -period 333.33333333333331 -waveform {0 166.666666666667} [list [get_pins {ClockBlock/imo}]]
create_clock -name {CyPLL_OUT} -period 41.666666666666664 -waveform {0 20.8333333333333} [list [get_pins {ClockBlock/pllout}]]
create_clock -name {CyMASTER_CLK} -period 41.666666666666664 -waveform {0 20.8333333333333} [list [get_pins {ClockBlock/clk_sync}]]
create_generated_clock -name {CyBUS_CLK} -source [get_pins {ClockBlock/clk_sync}] -edges {1 2 3} [list [get_pins {ClockBlock/clk_bus_glb}]]


# Component constraints for C:\Users\Acer\3D Objects\Class Notes\PSoC\Workspace_1\endsem_LED.cydsn\TopDesign\TopDesign.cysch
# Project: C:\Users\Acer\3D Objects\Class Notes\PSoC\Workspace_1\endsem_LED.cydsn\endsem_LED.cyprj
# Date: Tue, 16 Apr 2024 09:37:58 GMT