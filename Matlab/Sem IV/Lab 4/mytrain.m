N = 100; % 100 data points
fs = 10000; % 1kHz sampling frequency
T = 1/fs; % sample period
f=600;
n = 0:N-1;
x = cos(2*pi*f*n*T);
t = linspace(-100, 100, 100);

%plot the signal against time
subplot(2,2,1)
stem(n*T,x);
title('Sampled Signal Spike Train')
xlabel('Time')
ylabel('x(nT)')


% f2s=10000;
% T2= 1/f2s;
% x2=cos(2*pi*f*n*T2);
% subplot(2,2,2);
% plot(n*T2,x2);
% hold on
% stem(n*T2,x2);
% axis([0 0.01 -3 3]);


subplot(2, 2, 2)
y=interp(x,1);
plot(y);
title('Interpolated Signal reconstruction')
xlabel('Time')
ylabel('x(nT)')


%ideal low pass filter
f2 = 100;
% x = cos(2*pi*f2*n*T); %signal definition
z= sinc(pi*t/T);
C= conv(x,z, "same");

subplot(2, 2, 3)
plot(t, z)
set(gca,'xdir','reverse','ydir','reverse')
title("Sinc function (Low Pass Filter)")
xlabel('x')
ylabel('Time')

subplot(2,2,4);
plot(t,C);
dt = 0.06;
title('Ideal Low Pass Filter reconstructed signal');
ylabel('x')
xlabel('Time')