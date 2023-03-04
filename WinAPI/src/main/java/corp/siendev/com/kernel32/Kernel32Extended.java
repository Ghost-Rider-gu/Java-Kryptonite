package corp.siendev.com.kernel32;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.Kernel32;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinNT;
import com.sun.jna.win32.W32APIOptions;

public interface Kernel32Extended extends Kernel32 {
    Kernel32Extended INSTANCE = Native.load("kernel32", Kernel32Extended.class, W32APIOptions.DEFAULT_OPTIONS);

    WinDef.DWORD GetFileSize(
            WinNT.HANDLE  hFile,
            WinDef.DWORD lpFileSizeHigh);
}
