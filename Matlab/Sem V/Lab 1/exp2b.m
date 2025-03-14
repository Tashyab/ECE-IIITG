% Generate multitone signal such that Nyqust theorem holds and plot it.
clc
clear
N = 100;
f1 = 4;
f2 = 1;
n = 0:0.1:N;

fs = 10; % lcm/hcf
Ts = 1/fs;
x = sin(2*pi*f1*n*Ts) + cos(2*pi*f2*n*Ts);

plot(n*Ts, x);
xlabel('Time')
ylabel('multitone signal')
axis([0 10 -2 2])