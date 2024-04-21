% Generate sequence of discrete uniform random variables in the range [-(Xmin+Xmax/2), (Xmin+Xmax)/2]
% Plot the sequence, Plot the pmf and cdf of the generated sequence.

clc
clear
xmin = 1;
xmax = 4;

umin = round(-(xmax+xmin)/2);
umax = round((xmax+xmin)/2);
u = randi([umin, umax], 1, 1000);
disp(length(u));

subplot(2, 2, 1)
stem(u)
xlabel('sequence')
ylabel('f')

count=zeros(1, 7);

for i= 1:1000
    count(u(i) + 4) = count(u(i)+4) + 1;
end

x = -3:3;
pmf = count/1000;
subplot(2,2,2);
stem(x, pmf);
xlabel('u')
ylabel('pmf')

cdf = zeros(1, 7);
sum = 0;
for i = 1:7
    sum = pmf(i) + sum;
    cdf(i) = sum;
end

subplot(2,2,3);
stem(x, cdf);
xlabel('u')
ylabel('cdf')
    