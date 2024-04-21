%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% 
%
% Move image around by sx sy
%
%       ima_out = move_image(ima,sx,sy)
%
% This function shifts an image using only the phase.
% Following the convolution theorem, convolving a signal
% by a dirac delta(sx) is equivalent to shifting the signal by sx.
% In the fourier plane this is equivalent to multiplying the signal
% by a exponentional (exp(j*2*pi*u*sx/nsx) where nsx is the number of
% pixel in the x dimension and u the frequency. This is equivalent to
% applying a linear phase shift.
%
%                                  
%
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

function ima_out = move_image(i)
    fft_img = fft2(i);
    shifted_img = fftshift(fft_img);

    dx = 10; % translation dist. in x
    dy = -20; % translation dist. in y
    x = 1:size(i, 2);
    y = 1:size(i, 2);
    
    phase_shift = exp(-2*pi*1i*(dx*x/size(i,2) + dy*y/size(i,1))); 
    translated_fft_img = shifted_img.*phase_shift; % translated image in fourier domain
    ifft_shifted_img = ifftshift(translated_fft_img);
    ima_out = real(fft2(ifft_shifted_img));
    
    subplot(1, 2, 2);
    imshow(ima_out);
    title("Translated Image");
  
