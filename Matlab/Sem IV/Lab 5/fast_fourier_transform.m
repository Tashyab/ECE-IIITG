fs = 8;
ts = 1/fs;
k = 0:fs-1;

x = 5 + 2*cos(2*pi*ts*k-pi/2) + 3*cos(4*pi*ts*k);
y = abs(fft(x));
stem(y)
title("8-point dft using in-built function")
