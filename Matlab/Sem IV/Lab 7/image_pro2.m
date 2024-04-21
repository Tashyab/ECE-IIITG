clear 
clc
i = imread('circuit.tif');

subplot(1, 2, 1);
imshow(i)
title("Original Image");

move_image(i);