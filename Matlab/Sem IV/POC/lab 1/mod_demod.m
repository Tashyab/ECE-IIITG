N = 1000; 
fs = 10000; 
T = 1/fs; 
fm = 100;
n = 0:N-1;
m = sin(2*pi*fm*n*T);

subplot(4, 1, 1)
plot(n*T, m);
xlabel("time")
ylabel("amp")
title("Message signal")
grid on

fc = 1000;
c = 2*sin(2*pi*fc*n*T);

subplot(4, 1, 2)
plot(n*T, c);
xlabel("time")
ylabel("amp")
title("Carrier signal")
grid on

mod = (1.5+m).*c;
subplot(4, 1, 3)
plot(n*T, mod);
xlabel("time")
ylabel("amp")
title("Modulated signal")
grid on

vec = 0;
vout = 1:length(mod);
for i = 1:length(mod)
    if (mod(i)>vec)
        vec = mod(i);
    else
         vec = vec*exp(-(T/0.001));  % rc = 0.001
    end
    vout(i) = vec;
end

subplot(4, 1, 4)
plot(n*T, vout, "r");
hold on
plot(n*T, mod, "b")
xlabel("time")
ylabel("demod")
title("Demodulated signal")
grid on
