xn = [1 1 1 1 2 2 2 2];
N = length(xn);

xn = bitrevorder(xn);
W = exp(-2j*pi/N * (0:N/2-1)); %twiddle factor

% Butterfly operation
for s = 2:log2(N)+1
    m = 2^s; % Number of points in this stage
    m_2 = m/2; % Number of butterflies in this stage
    for k = 0:m_2-1
        for j = 0:N/m-1
            % Calculate the indices of the butterfly inputs
            index1 = j*m + k + 1;
            index2 = j*m + k + m_2 + 1;
            % Calculate the butterfly output using twiddle factors
            temp = xn(index2) * W(mod(k*N/m_2, N/2) + 1);
            xn(index2) = xn(index1) - temp;
            xn(index1) = xn(index1) + temp;
        end
    end
end

% Display the DFT coefficients
subplot(2, 1, 1)
stem(abs(xn));
subplot(2, 1,2)
stem(fft2(xn));