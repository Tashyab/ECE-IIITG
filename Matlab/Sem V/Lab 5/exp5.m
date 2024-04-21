% BPSK SER

n = 1000000;  % number of bits
s = randn(1,n);  % genrating random number btw 0 and 1
for i = 1:n    % for loop to make 0.4 and 0.6 probabilty for 0 and 1 resp.
    if s(i) >=0
        s(i) = 1;
    else
        s(i) = 0;
    end
end

%subplot(3,1,1);
%stem(s);   % plotting the seq
T = 1;
Ts = 0.01;  % duration
E = 1;     % energy


E_db = [-10,-5,0,5,6,8,10];
E1 = -20;  % in db

E_sigma = power(10,(1/10)*(E_db));   % in linear
sigma = 1./E_sigma;  % sigma squ value

a = zeros(1,n);
r = zeros(1,n);
for i= 1:n
    if s(i) == 0
        a(i) = -sqrt(E);
        
    else
        a(i) = sqrt(E);
        
    end
end
%N = randn(1,n).*power(sigma,1/2);   % noise
for j = 1:length(E_db)
    for i= 1:n
        if s(i) == 0
            
            r(i) = -1 + randn(1)*sqrt(sigma(j));
        else
            
            r(i) = 1 + randn(1)*sqrt(sigma(j));
        end
    end
    new_seq=r>=0;
    err=new_seq~=s;
    cal_err(j)=sum(err)/n;
    inbuilt(j) = qfunc(sqrt(E/sigma(j)));
end


%q = qfunc(sqrt(E/sigma));
figure(1)

semilogy(E_db,inbuilt,'Marker','diamond','MarkerSize',10);
hold on
semilogy(E_db,cal_err,'Marker','square','MarkerSize',2);