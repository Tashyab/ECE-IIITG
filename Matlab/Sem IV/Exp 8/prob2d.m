clear
clc

n = 5;
x = [1, 2, 4, 5, 6];
h = [7, 8, 9, 3]; % adding trailing zero for padding

h = [h, zeros(1, 1)];

% Circular dft step-by-step
y1 = zeros(1, n);
hrev = zeros(1, n); 
for i = 1:n
    hrev(i) = h(n-i+1);  % flipping h
end

% for h[0]

h1 = hrev;
for i = 1:n
    temp = h1(i);
    h1(i) = h1(n);
    h1(n) = temp;
end

y1(1) = sum(h1.*x);


% for h[1]
h2 = h1;
for i = 1:n
    temp = h2(i);
    h2(i) = h2(n);
    h2(n) = temp;
end

y1(2) = sum(h2.*x);

% for h[2]
h3 = h2;
for i = 1:n
    temp = h3(i);
    h3(i) = h3(n);
    h3(n) = temp;
end

y1(3) = sum(h3.*x);

% for h[3]
h4 = h3;
for i = 1:n
    temp = h4(i);
    h4(i) = h4(n);
    h4(n) = temp;
end

y1(4) = sum(h4.*x);

% for h[4]
h5 = h4;
for i = 1:n
    temp = h5(i);
    h5(i) = h5(n);
    h5(n) = temp;
end

y1(5) = sum(h5.*x);

disp(y1);


% Circular dft by rotation of x
xrot = zeros(n);

for i=1:n
    for j = 1:n
        xrot(i, j) = x((mod(i-j, n)) + 1);
    end
end
disp(transpose(xrot*transpose(h)));

% Circular dft by inbuilt method
x_fft = fft(x);
h_fft = fft(h);

y = ifft(x_fft .* h_fft);
disp(y);
