N = 64; % 64 data points
fs = 1000;   % 1 kHz sampling frequency
T = 1/fs;    % sample period
f = 100;
n = 0:N-1;

x1 = sin(2*pi*f*n*T); % signal definition
% subplot(2,2,1)
stem(n, x1);
axis([0 60 -2 2])
xlabel("n")
ylabel("sin(n)")
title("Sine Wave")

x2 = cos(2*pi*f*n*T);
% subplot(2,2,2)
stem(n, x2);
axis([0 60 -2 2])
xlabel("n")
ylabel("cos(n)")
title("Cos Wave")

%a
subplot(2,2,1)
stem(n, x1+x2)
axis([0 60 -2 2])
xlabel("n")
ylabel("sin(n)+cos(n)")
title("x1+x2")

%b
subplot(2,2,2)
stem(n, x1.*x2)
axis([0 60 -2 2])
xlabel("n")
ylabel("sin(n)+cos(n)")
title("x1*x2")

%c
subplot(2,2,3)
stem(n, 2.*x2);
axis([0 60 -2 2])
xlabel("n")
ylabel("cos(n)")
title("Scaled Cos Wave")

%d
subplot(2,2,4)
stem(n, -fliplr(x1+x2));
axis([0 60 -2 2])
xlabel("n")
ylabel("cos(n)")
title("Flipped around zero")