% BASK

clc 
clear

N = 16;
fc = 14;
Ts = 1/fc;
t = 0:Ts:1;
Es = 1;
A = sqrt(2*Es/Ts);
seq = zeros(1, N);

for i = 1:N
    if(rand(1)>0.5)
        seq(i) = 1;
    else 
        seq(i) = 0;
    end
end
subplot(3, 1, 1)
xn = 1:N;
stem(xn, seq)

seq0 = 0;
seq1 = A * cos(2*pi*t);

xi = 0;
xf = 1;

for i = 1:N
    x = xi:Ts:xf;
    subplot(3, 1, 2)
    if(seq(i) == 1)
        plot(x, seq1, color = 'red')
    else
        plot(x, seq0, color = 'blue')
    end
    xi = xi+1;
    xf = xf+1;
    hold on
end

hold off
subplot(3, 1, 3)
for i=1:N
    if(seq(i) == 0)
        scatter(0, 0, color = 'red')
    else
        scatter(sqrt(Es), 0, color = 'black')
    end
    hold on
end



