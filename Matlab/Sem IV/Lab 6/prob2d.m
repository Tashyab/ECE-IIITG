clear
clc

N = 100;
xn = 2*(sawtooth(2*pi*(1:N)/N, 0.5)-0.5);
fft_xn = fft(xn);

p = fft_xn.*fft_xn;
plot(ifft(p));
