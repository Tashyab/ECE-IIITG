% Define the cosine signal
t = 0:0.01:10;
x = cos(2*pi*t);

% Define the sampling rate and threshold
Fs = 1000; % Hz
threshold = 0.5;

% Convert the continuous-time signal to a sampled signal
t_samples = 0:1/Fs:10;
x_samples = interp1(t, x, t_samples);

% Convert the sampled signal to a spike train
spike_train = zeros(size(x_samples));
spike_train(x_samples > threshold) = 1;

% Plot the original cosine signal and the spike train
figure;
subplot(2,1,1);
plot(t,x);
title('Original Cosine Signal');
subplot(2,1,2);
plot(t_samples,spike_train,'*');
title('Spike Train');