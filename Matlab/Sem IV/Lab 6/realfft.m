function [cd] = realfft(x, n, dft)
xo = x(1:2:end); % Odd terms
xe = x(2:2:end); % Even terms
de = transpose(dft * transpose(xe));
disp(abs(de));

do = transpose(dft * transpose(xo));

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