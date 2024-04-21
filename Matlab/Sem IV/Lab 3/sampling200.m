N=100;
fs=1000;
T=1/fs;
f=200;
n=0:N-1;
x=cos(2*pi*f*n*T);

stem(n*T,x, "b");
hold on;

plot(n*T,x, "g");
axis([0 0.01 -1 1])

title('200Hz cosine')
xlabel('time');
ylabel('x(n*T)');