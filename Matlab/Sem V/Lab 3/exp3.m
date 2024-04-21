% BPSK

clc
clear
seq = zeros(1, 15);
for i=1:15
    if(rand(1) > 0.4)
        seq(i) = 1;
    else
        seq(i) = 0;
    end
end
subplot(3, 1, 1)
stem(seq)
Es = 1;
Ts = 0.01;

A = sqrt(2*Es/Ts);
X = 0:0.1:2*pi;
seq_pos = A*cos(X);
seq_neg = -A*cos(X);

xi = 0;
xf = 2*pi;
for i = 1:15
    x = xi:0.1:xf;
    subplot(3, 1, 2)
    if(seq(i) == 0)
        plot(x, seq_neg, color = 'red')
    else
        plot(x, seq_pos, color = 'black')
    end
    xi = xi+2*pi;
    xf = xf+2*pi;
    hold on
end

hold off
subplot(3, 1, 3)
for i=1:15
    if(seq(i) == 0)
        scatter(-sqrt(A), 0, color = 'red')
    else
        scatter(sqrt(A), 0, color = 'black')
    end
    hold on
end



