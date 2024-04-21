N = 10^5;
seq = zeros(1, N);
for i = 1:N
    if(rand(1)>0.5)
        seq(i) = 1;
    else 
        seq(i) = 0;
    end
end

disp(seq);