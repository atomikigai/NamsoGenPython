package h3;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Button;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p0 implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlertDialog f4800b;

    public /* synthetic */ p0(AlertDialog alertDialog, int i) {
        this.f4799a = i;
        this.f4800b = alertDialog;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f4799a) {
            case 0:
                AlertDialog alertDialog = this.f4800b;
                Button button = alertDialog.getButton(-1);
                if (button != null) {
                    button.setTextColor(-3159575);
                }
                Button button2 = alertDialog.getButton(-2);
                if (button2 != null) {
                    button2.setTextColor(-3159575);
                }
                break;
            case 1:
                AlertDialog alertDialog2 = this.f4800b;
                Button button3 = alertDialog2.getButton(-1);
                if (button3 != null) {
                    button3.setTextColor(-3159575);
                }
                Button button4 = alertDialog2.getButton(-2);
                if (button4 != null) {
                    button4.setTextColor(-3159575);
                }
                Button button5 = alertDialog2.getButton(-3);
                if (button5 != null) {
                    button5.setTextColor(-1754827);
                }
                break;
            default:
                AlertDialog alertDialog3 = this.f4800b;
                Button button6 = alertDialog3.getButton(-1);
                if (button6 != null) {
                    button6.setTextColor(-3159575);
                }
                Button button7 = alertDialog3.getButton(-2);
                if (button7 != null) {
                    button7.setTextColor(-3159575);
                }
                break;
        }
    }
}
