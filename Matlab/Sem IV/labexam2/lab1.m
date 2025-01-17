% 1.9 1+0.9i 0.1 1-0.9i 1.9 1+0.9i 1.9 1+0.9i 0.1 1-0.9i
% 1.9 1.34 0.1 1.34 1.9 1.34 0.1 1.34

fs = 8;
ts = 1/fs;
k = 0:fs-1;

t = 0:1:7;
ip1 = t==0;
ip2 = t==6;
x = ip1 + 0.9*ip2;
subplot(2, 1, 1)
stem(t, x);
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
subplot(2,1, 2)
stem(k, abs(z));