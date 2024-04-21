clc
clear

seq = zeros(1, 16);
for i = 1:16
    if(rand(i) > 0.1)
        seq(i) = 0;
    else
        seq(i) = 1;
    end
end

for i = 1:16
    disp(seq(i))
    if (rem(i, 2) == 0)
        disp(' ')
    end 
end
seq = [0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0];
% 0 -> neg
% 1 -> pos

for i=1:8
    tp_ones = [1, 1];
    subplot(8, 1, i)
    if(seq(i) == 1)
        plot(i:i+1, tp_ones, color = 'black')
    end
    axis([0 16 0 2])
    hold off
end



