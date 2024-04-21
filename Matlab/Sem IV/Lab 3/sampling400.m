N=100;
fs=1000;
T=1/fs;
f=400;
n=0:N-1;
x=cos(2*pi*f*n*T);

stem(n*T,x, "b");
hold on;

plot(n*T,x, "r");
axis([0 0.01 -1 1])

title('Hz400 cosine')
xlabel('time');
ylabel('x(n*T)');