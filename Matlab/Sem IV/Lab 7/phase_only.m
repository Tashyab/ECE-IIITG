%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% 
%
% This function takes the fft of the input image, gets the phase of the spectrum and
% inverse Fourier transform it back.
%
%       ima_out = phase-only(ima)
%
%                                 
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

function ima_out = phase_only(ima)

 % Get fourier transform first
 imafft = fftn(single(ima));
 mag = abs(imafft);
 rp = 2*rand(1)*pi;
 phase = exp(1i*rp);
 k = mag.*phase;
 
 % Now use only the phase
%   newfft = imafft./abs(imafft);
 
 ima_out = ifft2(k);
 
 subplot(1, 2, 2);
 imagesc(abs(ima_out));
 axis image;
 title('Phase only version');
