package corp.siendev.com.kernel32;

import com.sun.jna.Platform;
import com.sun.jna.platform.win32.Kernel32;
import com.sun.jna.platform.win32.WinBase;
import com.sun.jna.ptr.IntByReference;

public class Kernel32DLL {
    public static void main(String[] args) {
        IntByReference intByReference = new IntByReference(0);
        char[] buffer = new char[WinBase.MAX_COMPUTERNAME_LENGTH + 1];
        intByReference.setValue(buffer.length);
        System.out.println(Kernel32.INSTANCE.GetComputerName(buffer, intByReference));
        System.out.println(Kernel32Extended.INSTANCE.GetFileSize(null, null));
    }

    public static boolean isWinPlatform() {
        return Platform.isWindows();
    }
}
