package corp.siendev.com.user32.consts;

import com.sun.jna.platform.win32.WinDef;

public enum MessageBoxButtons {
    ABORT_RETRY_IGNORE(new WinDef.UINT(0x00000002L)),
    CANCEL_TRY_CONTINUE(new WinDef.UINT(0x00000006L)),
    HELP(new WinDef.UINT(0x00004000L)),
    OK(new WinDef.UINT(0x00000000L)),
    OK_CANCEL(new WinDef.UINT(0x00000001L)),
    RETRY_CANCEL(new WinDef.UINT(0x00000005L)),
    YES_NO(new WinDef.UINT(0x00000004L)),
    YES_NO_CANCEL(new WinDef.UINT(0x00000003L));

    public final WinDef.UINT buttonType;

    private MessageBoxButtons(WinDef.UINT buttonType) {
        this.buttonType = buttonType;
    }
}
