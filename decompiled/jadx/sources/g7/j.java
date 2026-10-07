package g7;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.gms.common.internal.i0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class j extends androidx.fragment.app.l {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public Dialog f4249v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f4250w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public AlertDialog f4251x0;

    @Override // androidx.fragment.app.l
    public final Dialog c0() {
        Dialog dialog = this.f4249v0;
        if (dialog != null) {
            return dialog;
        }
        this.f919m0 = false;
        if (this.f4251x0 == null) {
            Context contextR = r();
            i0.i(contextR);
            this.f4251x0 = new AlertDialog.Builder(contextR).create();
        }
        return this.f4251x0;
    }

    @Override // androidx.fragment.app.l, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f4250w0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
