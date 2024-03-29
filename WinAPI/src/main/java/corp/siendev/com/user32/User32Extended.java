package corp.siendev.com.user32;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.win32.W32APIOptions;

public interface User32Extended extends User32 {
    User32Extended INSTANCE = Native.load("user32", User32Extended.class, W32APIOptions.DEFAULT_OPTIONS);

    int MessageBox(WinDef.HWND hwnd,
                   String lpText,
                   String lpCaption,
                   WinDef.UINT uType);
}
