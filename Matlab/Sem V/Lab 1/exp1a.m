% Generate a sequence of uniform random number (continuous distribution) in the interval {Xmin, Xmax]
% Plot the cdf of the generalized sequence. 
% Use rand() function of matlab.

clc
clear
x = rand(1, 1000);
Xmin = 1;
Xmax = 4;
u = Xmin + (Xmax-Xmin)*x;

subplot(2, 2, 1)
plot(u)
xlabel('Sequence')
ylabel('Distribution')
axis([0 1000 1 4])

prob = zeros(1, 8);

for i = 1:1000
    if(u(i) < 1.5 && u(i) >= 1.0)
        prob(1) = prob(1) +1;
    elseif(u(i) < 2.0 && u(i) >= 1.5)
        prob(2) = prob(2) +1;
    elseif(u(i) < 2.33 && u(i) >= 2.0)
        prob(3) = prob(3) +1;
    elseif(u(i) < 2.67 && u(i) >= 2.33)
        prob(4) = prob(4) +1;
    elseif(u(i) < 3.0 && u(i) >= 2.67)
        prob(5) = prob(5) +1;
    elseif(u(i) < 3.33 && u(i) >= 3.0)
        prob(6) = prob(6) + 1;  
    elseif(u(i) < 3.67 && u(i) >= 3.33)
        prob(7) = prob(7) + 1;  
   elseif(u(i) < 4 && u(i) >= 3.67)
        prob(8) = prob(8) + 1;  
    end
end
prob = prob/1000;
subplot(2,2,2);
plot(prob);
xlabel('Sequence')
ylabel('Probability Distribution (Interval)')

cdf = zeros(1, 4);
sum = 0;
k = 1;
for i = 1:2:8
    sum = sum + prob(i) + prob(i+1);
    cdf(k) = sum;
    k = k+1;
end

subplot(2, 1, 2);
plot(cdf);
xlabel('Sequence')
ylabel('CDF')





