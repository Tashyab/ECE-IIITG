% Noise
clc
clear
N = 100;
f = 4;
n = 0:0.1:N;

fs = 20;
Ts = 1/fs;
x = cos(2*pi*f*n*Ts);
plot(n*f, x)
hold on
axis([0 200 -4 4])

y = zeros(1, 1000);
for i = 1:1000
     y(i) = x(i) + randn(1)/2;
end
plot(y)
xlabel('time')
ylabel('Sound signal with noise')



