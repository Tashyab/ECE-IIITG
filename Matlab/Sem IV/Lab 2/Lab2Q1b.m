n = 0:20;
f1 = n.*(Step(0, 20, 0) - Step(0, 20, 10));
f2 = 10*2.303.^(-0.3*(n-10)).*(Step(0, 20, 10) - ...
    Step(0, 20, 20));
hold on
subplot(2,1,1)
plot(f1+f2)
title("(b) x(n) continuous");
subplot(2,1,2)
stem(f1+f2)
title("(b) x(n) discrete");
xlabel("n")
ylabel("f(x)")
hold off
drawnow