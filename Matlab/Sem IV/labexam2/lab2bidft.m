fs = 4;
ts = 1/fs;
k = 0:fs-1;

x = 2- power(cos(0.75*pi*k), 2);
y = abs(fft(x));
stem(y)
title("4-point dft using in-built function")