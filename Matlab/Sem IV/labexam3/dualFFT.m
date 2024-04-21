function F=dualFFT(x,y,L)
v=y+1j*x;
xo=v(1:2:L);
xe=v(2:2:L);
w1=zeros(L/2);
w2=zeros(L/2);
for i=1:L/2
    for j=1:L/2
    w1(i,j)=exp((-1j*2*pi*(i-1)*(j-1))/(L/2));
    end
    w2=w1*exp((-1j*2*pi*(i-1))/(L/2));
end

 Fo=xo*w2;
 Fe=xe*w1;
 F=abs(Fo+Fe);
end