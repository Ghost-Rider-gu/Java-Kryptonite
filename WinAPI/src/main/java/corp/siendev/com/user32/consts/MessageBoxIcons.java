package corp.siendev.com.user32.consts;

import com.sun.jna.platform.win32.WinDef;

public enum MessageBoxIcons {
    EXCLAMATION_MARK(new WinDef.UINT(0x00000030L)),
    WARNING(new WinDef.UINT(0x00000030L)),
    INFORMATION(new WinDef.UINT(0x00000040L)),
    ASTERISK(new WinDef.UINT(0x00000040L)),
    QUESTION_MARK(new WinDef.UINT(0x00000020L)),
    STOP(new WinDef.UINT(0x00000010L)),
    ERROR(new WinDef.UINT(0x00000010L)),
    HAND(new WinDef.UINT(0x00000010L));

    public final WinDef.UINT iconType;

    MessageBoxIcons(WinDef.UINT iconType) {
        this.iconType = iconType;
    }
}
