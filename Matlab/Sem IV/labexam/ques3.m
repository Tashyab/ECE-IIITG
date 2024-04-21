n = -2:10;

xna = 2.*fnshift(n, -5) - 3.*fnshift(n, 4);
subplot(2, 1, 1)
stem(xna(n));
xlabel("n")
ylabel("f(n)")
axis([-3 10 0 10])
title("Function I")

xnb = fnshift(-n, -3) - fn(n).*fnshift(n, 2);
subplot(2, 1, 2)
stem(xnb(n));
xlabel("n")
axis([-3 10 0 10])
title("Function II")