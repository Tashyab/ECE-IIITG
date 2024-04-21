% QPSK

clc
clear

seq = zeros(1, 16);
for i = 1:16
    if(rand(i) > 0.2)
        seq(i) = 0;
    else
        seq(i) = 1;
    end
end

for i = 1:16
    disp(seq(i))
    if (rem(i, 2) == 0)
        disp(' ')
    end
end
seq = [0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0]; % Random seq to get all four signals

% 0 -> neg
% 1 -> pos

Es = 1;
Ts = 0.01;
A = sqrt(2*Es/Ts);

x1 = pi/4:0.1:2*pi+(pi/4);
s1 = A*cos(x1);

x2 = 3*pi/4:0.1:2*pi+(3*pi/4);
s2 = A*cos(x2);

x3 = 5*pi/4:0.1:2*pi+(5*pi/4);
s3 = A*cos(x3);

x4 = 7*pi/4:0.1:2*pi+(7*pi/4);
s4 = A*cos(x4);

xi = 0;
xf = 2*pi;
for i = 1:2:16
    subplot(2, 1, 1)
    x = xi:0.1:xf;
    if (seq(i) == 0 && seq(i+1) == 0)
        plot(x, s1, color = 'red');
    elseif(seq(i) == 0 && seq(i+1) == 1)
        plot(x, s2, color = 'blue');
    elseif(seq(i) == 1 && seq(i+1) == 0)
        plot(x, s3, color = 'green');
    else
        plot(x, s4, color = 'black');
    end
    xi = xi+2*pi;
    xf = xf+2*pi;
    hold on
end

hold off
for i=1:2:15
    subplot(2, 1, 2)
    if(seq(i) == 0 && seq(i+1) == 0)
        scatter(sqrt(A), sqrt(A), color = 'red')
    elseif(seq(i) == 0 && seq(i+1) == 1)
        scatter(-sqrt(A), sqrt(A), color = 'black')
    elseif(seq(i) == 1 && seq(i+1) == 0)
        scatter(sqrt(A), -sqrt(A), color = 'green')
    else
        scatter(-sqrt(A), -sqrt(A), color = 'blue')
    end
    hold on
end



