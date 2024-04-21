%QPSK BER
N=10000 ;

Eb=1 ;
Es=2;
SNR_db=-10:3:10 ;
SNR_lin=power(10,(SNR_db/10));
sigma=(1./(SNR_lin));
sym= randn(1,N);
xt=sym>0;


nseq=[];
for i = 1:N
    if(xt(i)==0)
        nseq=[nseq,-Eb];
    else
        nseq=[nseq,Eb];
    end

end
Qps_seq = reshape(nseq,2,N/2);
origSig=reshape(xt,2,N/2);


for j = 1: length(SNR_db)
    mseq=[];
    nt=sqrt(sigma(j)).*randn(1,N);
    
    % generation of modulated one
    mseq=nseq+nt;
   
    
    recSeq=mseq>=0;
    recQPSK=reshape(recSeq,2,N/2);

    %% calulating bit error Expected and Calulating one
    myERR_bit=recSeq~=xt;
    calc_errbit(j)=sum(myERR_bit)/N ;  % bit error
    exp_errbit(j)= qfunc(sqrt(1/sigma(j)));

    %% calulating Symbol error Expected and Calulating on
     
    count=0;
    for a = 1:N/2
        
        if(recQPSK(1,a)~=origSig(1,a) || recQPSK(2,a)~=origSig(2,a))
            count=count+1;
        end
    end
    
    se(j)=count/(N/2);
    expse(j)=2*expERR_bit(j)-expERR_bit(j)^2 ;
    

end

% Figure 1
figure(1)
semilogy(SNR_db, caluERR_bit, 'Marker', 'd', 'MarkerFaceColor', 'g', 'MarkerEdgeColor', 'm', 'LineWidth', 2);
hold on;
semilogy(SNR_db, expERR_bit, '--rs', 'Marker', 'd', 'MarkerFaceColor', 'r', 'MarkerEdgeColor', 'm', 'LineWidth', 2);
xlabel('SNR (dB)');
ylabel('Bit Error Rate');
legend('Calculated Bit Error Rate', 'Experimental Bit Error Rate');

% Figure 2
figure(2)
semilogy(SNR_db, se, 'Marker', 'd', 'MarkerFaceColor', 'g', 'MarkerEdgeColor', 'm', 'LineWidth', 2);
hold on;
semilogy(SNR_db, expse, '--rs', 'Marker', 'd', 'MarkerFaceColor', 'g', 'MarkerEdgeColor', 'm', 'LineWidth', 2);
xlabel('SNR (dB)');
ylabel('Symbol Error Rate');
legend('Calc. SER', 'Exp. SER');

