% BPSK

clc
clear

n = 10;
seq = zeros(1, n);
for i=1:n
    if(rand(1) > 0.9)
        seq(i) = 1;
    else
        seq(i) = 0;
    end
end
subplot(4, 1, 1)
stem(seq)

fs = 10;
A = 3;

t1 = 0:1/fs:1;
x1 = A * cos(2*pi*t1);
x2 = -A * cos(2*pi*t1);

xi = 0;
xf = 1;
for i = 1:n
    subplot(4, 1, 2)
    xi = xi + 1;
    xf = xf + 1;
    x = xi:0.1:xf;
    if(seq(i) == 0)
        plot(x, x1, color = 'blue')
    else
        plot(x, x2, color = 'red')
    end
    hold on
end

x1_noise = zeros(1, length(x1));
x2_noise = zeros(1, length(x2));
for i = 1:length(x1)
    x1_noise(i) = x1(i) + 4*randn(1);
end

for i = 1:length(x2)
    x2_noise(i) = x2(i) + 4*randn(1);
end

xi = 0;
xf = 1;
for i = 1:n
    subplot(4, 1, 3)
    xi = xi + 1;
    xf = xf + 1;
    x = xi:0.1:xf;
    if(seq(i) == 0)
        plot(x, x1_noise, color = 'blue')
    else
        plot(x, x2_noise, color = 'red')
    end
    hold on
end

hold off
subplot(4, 1, 4)
for i=1:10
    if(seq(i) == 0)
        scatter(-A, 0, color = 'red')
    else
        scatter(A, 0, color = 'blue')
    end
    hold on
end





