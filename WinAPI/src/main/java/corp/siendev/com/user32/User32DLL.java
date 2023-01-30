package corp.siendev.com.user32;

import corp.siendev.com.user32.consts.MessageBoxButtons;

public class User32DLL {
    public static void main(String[] args) {
        String messageText = "Hello from WinAPI";
        String captionText = "WinAPI";
        int result = User32Extended.INSTANCE.MessageBox(null, messageText, captionText, MessageBoxButtons.OK.buttonType);
        System.out.println(result);
    }
}
