clc
clear
N = 100;
x = zeros(1, N);
y = zeros(1, N);

for i = 1:N
    x(i) = x(i) + 4*randn(1);
    y(i) = y(i) + 4*randn(1);
end

sum = 0;
z = zeros(1, N);
for i = 1:N
    z(i) = x(i)^2 + y(i)^2;
    sum = sum + z(i);
end

stem(z);
disp("Mean of rv Z is ");
disp(sum/N);