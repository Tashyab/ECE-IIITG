fs = 600;
fm = 10;
t = 0:1/fs:1;
msg = sin(2*pi*fm*t);

plot(msg);
subplot(2, 2, 1)
plot(m);
axis([0 100 -2 2]);
xlabel("time")
ylabel("msg")
title("Message signal")

fc = 200;
c = cos(2*pi*fc*t);

subplot(2, 2, 2)
plot(c);
axis([0 100 -2 2]);
xlabel("time")
ylabel("carrier")
title("Carrier signal")

mod = m.*c;
subplot(2, 2, 3)
plot(mod);
axis([0 100 -2 2]);
xlabel("time")
ylabel("mod")
title("Modulated signal")