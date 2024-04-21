clc
clear
xn = [1, 2, 3, 4];
hn = [-3, 2, 1];
N=4;

hn = [hn, zeros(length(xn) - length(hn))];

xn_rev = zeros(1, length(xn));

% reversing the matrix
for i = 1:length(xn)
    xn_rev(i) = xn(length(xn)-i+1);
end

% Creating circular matrix
x_cir = zeros(length(xn));
k=zeros(1, length(xn));
xi = xn_rev;

for i = 1:length(xi)
    temp = xi(length(xi));
    for j = 2:length(xi)
        x_cir(i, j) = xi(j-1);
    end
    x_cir(i, 1) = temp;
    for j = 1:length(xi)
        xi(j) = x_cir(i, j);
    end
end

cconv = transpose(x_cir*transpose(hn));
stem(cconv);



