clc
clear 

n = 0:50;
f1 = cos(0.04*pi*n) + 0.2.*randn(0, 1);
hold on
subplot(2,1,1)
plot(n, f1)
title("(c) x(n) continuous")

subplot(2,1,2)
stem(n, f1)
title("(c) x(n) discrete")

xlabel("n")
ylabel("f(x)")
hold off
drawnow