clc
clear
xn = [1, 2, 3, 4];
hn = [-3, 2, 1];

xp = zeros(length(xn)+length(hn)-1, length(hn));

% Create shifted matrix
for i = 1:length(hn)
    xp(i:i+length(xn)-1, i) = xn;
end

% Compute linear convulation
lconv = transpose(sum(xp.*hn, 2)); % summing across columns, hence, 2

stem(lconv);