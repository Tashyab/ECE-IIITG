% Generate a sinusoid of frequency  = 4
% (a) Undersample
% (b) Oversample
% (c) Sample at Nyqust rate
% Plot time domain signal.

clc
clear
N = 100;
fn = 4;
n = 0:0.2:N-1;

fs1 = 2;
T1 = 1/fs1;
x1 = sin(2*pi*fn*n*T1);

subplot(3, 1, 1)
plot(n*T1, x1);
ylabel('Undersampled sinusoid') % Aliasing will happend
xlabel('time')

fs2 = 18;
T2 = 1/fs2;
x2 = sin(2*pi*fn*n*T2);

subplot(3, 1, 2)
plot(n*T2, x2);
ylabel('Oversampled sinusoid') % Signal will become smoother
xlabel('time')

fs3 = 8.5;
T3 = 1/fs3;
x3 = sin(2*pi*fn*n*T3);

subplot(3, 1, 3)
plot(n*T3, x3);
ylabel('Sampled sinusoid at Nyqust Rate')
xlabel('time')
