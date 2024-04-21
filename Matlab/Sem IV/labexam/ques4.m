n1= -5;
n2 = 5;
xeven=0.5*(signum(0,n1,n2)-signum(-10,n1,n2)+signuminv(0,n1,n2)-signuminv(10,n1,n2));
xodd=0.5*(signum(0,n1,n2)-signum(-10,n1,n2)-signuminv(0,n1,n2)+signuminv(10,n1,n2));

subplot(2,1,1);
stem(xeven);
title("Even part");

subplot(2,1,2);
stem(xodd);
title("Odd part")