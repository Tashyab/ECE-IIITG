fs = 8;
ts = 1/fs;
k = 0:fs-1;

x = 5 + 2*cos(2*pi*ts*k-pi/2) + 3*cos(4*pi*ts*k);
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
subplot(2,1,1);
stem(k, abs(z));
xlabel("t");
ylabel("DFT");
title("dft without using inbuilt function");

z2 = fft(x);
subplot(2,1,2);
stem(k, abs(z2));
xlabel("t");
ylabel("DFT");
title("dft using inbuilt function");