clc
clear
% xn = [1, 2, 3, 4, 5, 6, 7, 5, 4, 3, 2, 1];
x = zeros(1, 12);

t = -3:9;
for t = -3:3
    x(t+4) = t+4;
end
for t = 4:8
    x(t+4) = (8-t+1);
end
disp(x);

n = 1:1:12;

% a
x1n = 2*sighsift(n) - 3*x(n+4);
subplot(2, 1, 1);
stem(x1n);

% b
x2n = 2*x(3 - n) + x(n) * x(n - 2);
subplot(2, 1, 2);
stem(x2n);
