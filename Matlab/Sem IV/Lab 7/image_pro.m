clear 
clc

i = imread('lena.jpg');
subplot(1, 2, 1)
imshow(i);

phase_only(i);

