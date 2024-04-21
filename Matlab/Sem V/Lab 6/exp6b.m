% BFSK

clc
clear

N = 16;
Es = 1;
fs = 100;
Ts = 1/fs;
A = sqrt(2*Es/Ts);

f1 = 14;
t1 = 0:1/f1:1;
seq1 = A * cos(2*pi*t1);

m = 1;

f2 = f1 + m/(1/f1);
t2 = 0:1/f2:1;
seq2 = A*cos(2*pi*t2);

seq = zeros(1, N);
for i = 1:N
    if(rand(1)>0.67)
        seq(i) = 1;
    else
        seq(i) = 0;
    end
end
subplot(3, 1, 1)
xn = 1:N;
stem(xn, seq)

% plot(0:1/f1:1, seq1, color = 'blue')
% hold on
% plot(1:2/f2:3, seq2, color = 'red')

xi = 0;
xf = 0;
for i = 1:N
    subplot(3, 1, 2)
    if(seq(i) == 0)
        xi = xf;
        xf = xi+1;
        x = xi:1/f1:xf;
        plot(x, seq1, color = 'blue')
    else
        xi = xf;
        xf = xi + (1+m);
        x = xi:(1+m)*1/f2:xf;
        plot(x, seq2, color = 'red')
    end
    hold on
end

hold off
subplot(3, 1, 3)
for i=1:N
    if(seq(i) == 0)
        scatter(0, sqrt(Es), color = 'red')
    else
        scatter(sqrt(Es), 0, color = 'blue')
    end
    hold on
end


