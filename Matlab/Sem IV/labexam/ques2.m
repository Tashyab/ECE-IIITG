N = 100; % Number of points
f = 20; % Frequency of signal
t = 1/f;
fs = 1000; % Sampling frequency
T = 1/fs;
n = 0:N-1;

fx = sin(2*pi*n*f*T);
% stem(fx);

power = t.*(abs(sin(2*pi*n*f*T)).^2);
p = sum(power);
disp("The power of the function is " + p);