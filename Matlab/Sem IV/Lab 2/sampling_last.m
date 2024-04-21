% Generates a 200 Hz cosine wave 
%
N = 64; % 64 data points
fs = 1000;   % 1 kHz sampling frequency
T = 1/fs;    % sample period
f = 200;
fs2 = 10000;% signal frequency in Hz
T2 = 1/fs2;
n = 0:N-1;  % discrete time vector

x = cos(2*pi*f*n*T); % signal definition
x2 = cos(2*pi*f*n*T2);

% plot the signal against time

% 1.1
hold on
stem(n*T, x, "b");
plot(n*T, x, "r");
% 1.2
hold on
plot(n*T2, x2, "bl");
stem(n*T2, x2, "g");

axis([0 0.01 -2 2])
title("200 Hz cosine")
xlabel("Time");
ylabel("x(nT)");

