function [x,n] = signuminv(n0,n1,n2)
for n = n1:n2
    if -n > 0
        x = n-n0;
    else
        x = n-n0-2;
    end
end