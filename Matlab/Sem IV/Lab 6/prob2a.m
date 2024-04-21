clear
clc

N = 100;
i = -N:1:N;
im = i==0;

im1 = i==1;
subplot(2, 2, 1);
plot(i, im1);

im2 = i==10;
subplot(2, 2, 2);
plot(i, im2);

im3 = i==50;
subplot(2, 2, 3);
plot(i, im3);

im4 = i == 80;
subplot(2, 2, 4);
plot(i, im4);


