clc 
clear

N = 1000;
Ts = 0.01;
fc = 1/Ts;
t = 0:1/fc:1;
Es = 1;
A = sqrt(2*Es/Ts);
seq = zeros(1, N);

for i = 1:N
    if(rand(1)>0.5)
        seq(i) = 1;
    else 
        seq(i) = 0;
    end
end

seq0 = -A * cos(2*pi*t);
seq1 = A * cos(2*pi*t);

xi = 0;
xf = 1;
s = zeros(1, N*100);
k = 1;

db = -10; % db = (Es/sigma^2)dB
db_lin = power(10, (1/10)*(db));  % db_lin = (Es/sigma^2)linear
sigma_lin = Es/db_lin; % sigma_lin = (sigma^2)linear

r = zeros(1, N*100);
phi_sig = sqrt(2/Ts)*cos(2*pi*t);

p = zeros(1, N*100);

for i = 1:N
    if(seq(i) == 0)
        for j = 1:100
            s(k) = seq0(j);
            r(k) = s(k) + sigma_lin*randn(1);
            p(k) = r(k).*phi_sig(j);
            k = k+1;
        end
    else
        for j = 1:100
            s(k) = seq1(j);
            r(k) = s(k) + sigma_lin*randn(1);
            p(k) = r(k).*phi_sig(j);
            k = k+1;
        end
    end
    
    xi = xi+1;
    xf = xf+1;
end

% disp(s)

% disp(phi);

% disp(p);

reg_seq = zeros(1, N); 
for i = 1:N
    check = 0;
    for j = 1:100
        check = check + p((i-1)*100 +j);
    end
    if check > 0
        reg_seq(i) = 1;
    else 
        reg_seq(i) = 0;
    end
%     disp(seq)
%     disp(reg_seq)
end

er = (seq ~= reg_seq);
error_rate = (sum(er))/N;
disp(error_rate);

% qq = qfunc(sqrt(Es/sigma_lin));
% disp(qq)
er_th = 0.5*(erfc((Es/sigma_lin)/sqrt(2)));
disp(er_th)


        
    



