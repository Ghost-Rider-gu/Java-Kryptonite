package corp.siendev.com.user32;

import com.sun.jna.platform.win32.WinDef;

public class User32DLL {
    public static void main(String[] args) {
        String messageText = "Hello from WinAPI";
        String captionText = "WinAPI";

        int result = User32Extended.INSTANCE.MessageBox(null, messageText, captionText, new WinDef.UINT(0x00000000L));
        System.out.println(result);
    }
}
