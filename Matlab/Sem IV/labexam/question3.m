n=-2:10;

xn = [1, 2, 3 , 4, 5, 6, 7, 6, 5, 4, 3, 2, 1];

[xn1,n1] = sigshift(xn,n,5);

[xn2,n2]=sigshift(xn,n,-4);

[xn3,n3]= sigadd(2*xn1,n1,-3*xn2,n2);

stem(n3,xn3,'r');

xlabel("n3");

ylabel("xn3");

title("2x(n - 5) - 3x(n + 4)");

n=-2:10;

xn = [1, 2, 3 , 4, 5, 6, 7, 6, 5, 4, 3, 2, 1];


[xn1,n1]=sigshift(xn,n,3);

[xn2,n2]=sigshift(xn,n,2);

[xn3,n3]=sigmult(xn,n,xn2,n2);

[xn4,n4]=sigadd(xn1,n1,xn3,n3);

stem(n4,xn4,'r');

xlabel("n4")

ylabel("xn4");

title("x(n - 3) + x(n) x(n - 2)");