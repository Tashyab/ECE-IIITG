a = Samp(-5, 5, -2);
b = Samp(-5, 5, 4);
hold on
subplot(2,1,1)
title("(a) x(n) continuous");
plot(2*a-b)

subplot(2,1,2)
stem(2*a-b)
title("(a) x(n) discrete");

xlabel("n")
ylabel("f(x)")
hold off
drawnow