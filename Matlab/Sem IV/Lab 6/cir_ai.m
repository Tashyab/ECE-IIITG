% Circular convolution of two signals without using inbuilt function

% Define two input signals
x = [1 2 3 4];
h = [-3 2 1];

% Determine the length of the output signal
N = 4;

% Pad the input signals with zeros
x = [x zeros(1,N-length(x))];
h = [h zeros(1,N-length(h))];

% Perform circular convolution using the convolution sum formula
y = zeros(1,N);
for n = 1:N
    for k = 1:N
        j = mod(n-k,N)+1;
        y(n) = y(n) + x(k)*h(j);
    end
end

% Display the input signals and the output signal
stem(y);
