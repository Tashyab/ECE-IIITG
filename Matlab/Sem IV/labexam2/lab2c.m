fs = 4;
ts = 1/fs;
k = 0:fs-1;

x =2- power(cos(0.75*pi*k), 2);
disp(x);

y = zeros(fs);
for a = 1:fs
    for b = 1:fs
         y(a, b) = exp((-1i*2*pi*(a-1)*(b-1))/fs);
    end
end
disp(y);

z1 = y*transpose(x);
subplot(2,1,1)
stem(abs(z1));

inv = zeros(fs);

for a = 1:fs
    for b = 1:fs
         inv(a,b)= exp((1i*2*pi*(a-1)*(b-1))/fs);
    end
end

z2 = (inv*z1)/fs;
subplot(2,1,2);
stem(z2);