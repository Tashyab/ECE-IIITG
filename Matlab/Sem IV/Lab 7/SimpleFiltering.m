%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% 
%
% Image Filtering
%
%       ima_out = SimpleFiltering(ima,type,cutoff)
%
% This function high or low pass filter an image
%     
%       ima : real input image
%       type : 0 for high, 1 for low
%       cutoff: cutoff frequency in [0,1]. 0 is corresponds to the minimum frequency and 1
%					 to the maximum frequency.
%       ima_out : output absolute filtered image
%   
%
%                                
%
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

function ima_out = SimpleFiltering(i)
    f = fft2(double(i)); % perform the FT of the image after converting it to Double type
    fshift = fftshift(f); % Shift the zero frequency of the image to the center of the spectrum

    % Set the high frequency components to zero
    rows = size(i, 1);
    cols = size(i, 2);
    crow = rows/2;
    ccol = cols/2;
    fshift(crow-30 : crow+30, ccol-30:ccol+30) = 0;

    f_ishift = ifftshift(fshift);
    ima_out = ifft2(f_ishift); % Perform inverse FT to get the result
    ima_out = uint8(real(ima_out));

    % Display the Image
    subplot(1, 2, 2);
    imshow(ima_out);
    title("Filtered Image");
    
