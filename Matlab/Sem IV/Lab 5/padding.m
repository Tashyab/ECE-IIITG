clc
clear
fs = 4; % fs = N
ts = 1/fs;
k = 0:fs-1;

x = 5 + 2*cos(2*pi*ts*k-pi/2) + 3*cos(4*pi*ts*k); % function for x
y4 = abs(fft(x)); % absolute value for fft of x
subplot(2,1,1)
stem(y4)
title("4-point dft")

xp = [x, zeros(1, 4)]; % Adding 4 zeros to the end of x
y_pad = abs(fft(xp)); % absolute value for fft of z

subplot(2, 1, 2)
stem(y_pad)
title("8-point dft obtained by padding")