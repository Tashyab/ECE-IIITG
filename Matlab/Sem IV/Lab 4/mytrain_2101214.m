N = 100; % 100 data points
fs = 10000; % 1kHz sampling frequency
T = 1/fs; % Sample period
f=200;
n = 0:N-1;
x = cos(2*pi*f*n*T);
t = linspace(-100, 100, 100);

% Plot the signal against time
subplot(2,2,1)
stem(n*T,x);
title('Sampled Signal Spike Train')
xlabel('Time')
ylabel('x(nT)')

subplot(2, 2, 2)
y=interp(x,10);
plot(y);
title('Interpolated Signal reconstruction')
xlabel('Time')
ylabel('x(nT)')

% Ideal low pass filter
f2 = 100;
x = cos(2*pi*f2*n*T); % Signal definition
z= sinc(pi*t/T);
C= conv(x, z, "same");

subplot(2, 2, 3)
plot(t, z)
set(gca,'xdir','reverse','ydir','reverse')
title("Sinc function (Low Pass Filter)")
xlabel('x')
ylabel('Time')

subplot(2,2,4);
plot(t,C);
title('Ideal Low Pass Filter reconstructed signal');
ylabel('x')
xlabel('Time')
