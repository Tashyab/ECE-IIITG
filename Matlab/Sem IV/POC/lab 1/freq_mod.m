N = 1000;
n = 0:N-1;
fs = 10000;
T = 1/fs;

fm = 100;
m = sin(2*pi*fm*n*T);
subplot(2, 1, 1)
plot(n*T, m);

fc = 1000;
mod = sin(2*pi*fc*n*T + 0.3*sin(2*pi*fm*n*T));
subplot(2,1,2)
plot(n*T, mod);