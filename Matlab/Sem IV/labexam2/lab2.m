% 1 1.5 2 1.5
% 6 -1 0 -1

fs = 4;
ts = 1/fs;
k = 0:fs-1;

x = 2- power(cos(0.75*pi*k), 2);
disp(x);

y = zeros(fs);
for a = 1:fs
    for b = 1:fs
         y(a, b) = exp((-1i*2*pi*(a-1)*(b-1))/fs);
    end
end

disp(y);

z = y*transpose(x);
disp(z);
disp(abs(z));
stem(k, abs(z));