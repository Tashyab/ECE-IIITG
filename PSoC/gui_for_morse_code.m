% Create GUI
function text_to_psoc_gui()
    % Create figure
    fig = uifigure('Name', 'Text to PSoC Sender', 'Position', [100 100 300 200]);
 
    % Create UI components
    txtInput = uitextarea(fig, 'Position', [20 120 260 50], 'Value', '');
    btnSend = uibutton(fig, 'Position', [20 70 120 30], 'Text', 'Send to PSoC', 'ButtonPushedFcn', @sendButtonPushed);
    lblStatus = uilabel(fig, 'Position', [20 20 260 30], 'Text', 'Status: ');
 
    % Send button callback function
    function sendButtonPushed(~, ~)
        text = txtInput.Value;
        % Send text to PSoC
        sendToPSoC(text);
    end
 
    % Logic to send text to PSoC
    function sendToPSoC(text)
        % Open UART connection (replace COM port and baud rate with your PSoC settings)
        s = serial('COM4', 'BaudRate', 9600);
        fopen(s);
 
        % Send text to PSoC
        fprintf(s, text);
 
        % Close UART connection
        fclose(s);
        delete(s);
 
        % Update status label
        lblStatus.Text = 'Status: Text sent to PSoC';
    end
end