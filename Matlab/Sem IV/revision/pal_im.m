clc
clear
N=8;
n=0:N-1; 
x= n==0;
subplot(221)
plot(x);

z=transpose(x);
F=zeros(N);
for i=1:N
    for j=1:N
    F(i, j)=exp(-1j*(i-1).*(j-1).*2.*pi/N);
    end
end
y=F*z;
subplot(222);
stem(n,abs(y));
subplot(223);
r=fft(x);
stem(abs(r));