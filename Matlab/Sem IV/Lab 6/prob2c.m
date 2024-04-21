clc 
clear

N = 100;
i = 1:1:N;

im1 = i==1;
im2 = i==10;
im3 = i==50;
im4 = i==80;

% n = 1:1:N;
% xn = zeros(1, N);
% for i = 1:50
%     xn(i) = 0.02*(i);
% end
% 
% for i = 50:100
%     xn(i) = 2 - 0.02*(i);
% end

xn = 2*(sawtooth(2*pi*(1:N)/N, 0.5)-0.5);
fft_xn = fft(xn);

p1 = fft_xn.*fft(im1);
p2 = fft_xn.*fft(im2);
p3 = fft_xn.*fft(im3);
p4 = fft_xn.*fft(im4);

invf_p1 = ifft(real(p1));
subplot(2, 2, 1)
plot(invf_p1);

invf_p2 = ifft(real(p2));
subplot(2, 2, 2)
plot(invf_p2);

invf_p3 = ifft(real(p3));
subplot(2, 2, 3)
plot(invf_p3);

invf_p4 = ifft(real(p4));
subplot(2, 2, 4)
plot(invf_p4);

