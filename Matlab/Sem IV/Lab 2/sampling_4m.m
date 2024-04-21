% Generates a 400 Hz cosine wave 
%
N = 100; % 64 data points
fs = 10000;   % 1 kHz sampling frequency
T = 1/fs;    % sample period
f = 400; % signal frequency in Hz
n = 0:N-1;  % discrete time vector

x = cos(2*pi*f*n*T); % signal definition

% plot the signal against time

% 1.1
hold on

stem(n*T, x, "b");

% 1.2
plot(n*T, x, "r");
title("400 Hz cosine")
xlabel("Time");
ylabel("x(nT)");

hold off
drawnow