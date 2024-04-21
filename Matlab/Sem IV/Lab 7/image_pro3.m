clear 
clc
i = imread("C:\Users\Acer\3D Objects\Projects\Matlab\Lab 7\Sample images\lena.jpg");

subplot(1, 2, 1);
imshow(i)
title("Original Image");

SimpleFiltering(i);