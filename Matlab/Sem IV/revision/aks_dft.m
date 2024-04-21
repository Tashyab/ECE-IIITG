clc
clear

N=8;
%N=8;
k=0:N-1;
n=0:N-1;

y=exp(-1*j*2*pi/N);

%x1=x.';
M=zeros(N,N);

x = 6 .* (cos(pi*n/4)) .^ 2;
%x=[1 1 1 0];
x1=x.';


for i= 1:N
    for j= 1:N
        H(i,j) =y^((i-1)*(j-1));
    end
end

Z=H*x1;

subplot(221);
stem(n,abs(Z));
title('DFT of a sequence');
axis([-0.5 3.5 0.5 4]);

subplot(222);
f=fft(x1);
f1=f.';
f2=abs(f1);
stem(n,f2);
title('DFT of a sequence using inbuilt function');
axis([-0.5 3.5 0.5 4])

%IDFT of a sequence


% ift = dsp.IFFT
% ift = dsp.IFFT(Name,Value)