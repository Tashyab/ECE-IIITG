clear
clc

N = 100;
n = 1:1:N;

xn = zeros(1, N);
for i = 1:50
    xn(i) = 0.02*(i);
end

for i = 50:100
    xn(i) = 2 - 0.02*(i);
end

subplot(2,1,1);
stem(n, xn);

yn = fft(xn);
subplot(2,1,2);
stem(n, abs(yn));
