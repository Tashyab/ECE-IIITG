n = 100; % signal length
x = 2*(sawtooth(2*pi*(1:n)/n, 0.5)-0.5); % Triangle signal

dft = zeros(n/2, n/2);
for i = 1:n/2
    for k = 1:n/2
        dft(i,k) = exp(-(1j*pi*2*(i-1)*(k-1))/(n/2));
    end
end

cd = realfft(x, n, dft);
stem(abs(cd));
title('DFT by two components');