function [y] = sigshift(x, n, a)
    y = zeros(n);
    y(n) = x(n-a);
end