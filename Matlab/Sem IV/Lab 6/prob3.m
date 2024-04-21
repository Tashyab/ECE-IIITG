clc;
clear;

n = 100; % signal length
x = 2*(sawtooth(2*pi*(1:n)/n, 0.5)-0.5); % Triangle signal

xo = x(1:2:end); % Odd terms
xe = x(2:2:end); % Even terms

% subplot(3,1,1);
% stem(1:n, x);
% 
% subplot(3,1,2);
% stem(1:2:n, xo);
% 
% subplot(3,1,3);
% stem(2:2:n, xe);


dft = zeros(n/2, n/2); % dft matrix
for i = 1:n/2
    for k = 1:n/2
        dft(i,k) = exp(-(1j*pi*2*(i-1)*(k-1))/(n/2));
    end
end

de = transpose(dft * transpose(xe));
disp(abs(de));

do = transpose(dft * transpose(xo));
disp(abs(do));

cd = zeros(1, n);
ep = zeros(1, n/2);
for i = 1:n
    if(i <= n/2)
        ep(i) = exp(-1j*2*pi*(i-1)/n);
        cd(1,i) = de(i) + ep(i)*do(i);
    else
         cd(1,i) = de(i-n/2) - ep(i-n/2)*do(i-n/2);
    end
end
disp(abs(cd));

fft_in = fft(x);
disp(abs(fft_in));

subplot(2,1,1);
stem(abs(cd));
title('DFT by two components');

subplot(2,1,2);
stem(1:n,abs(fft_in));
title('DFT by inbuilt function');