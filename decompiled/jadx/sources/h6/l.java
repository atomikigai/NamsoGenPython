package h6;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f5028d;

    public l(Context context, String str, boolean z4, boolean z10) {
        this.f5025a = context;
        this.f5026b = str;
        this.f5027c = z4;
        this.f5028d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r0 r0Var = d6.p.C.f2979c;
        AlertDialog.Builder builderI = r0.i(this.f5025a);
        builderI.setMessage(this.f5026b);
        if (this.f5027c) {
            builderI.setTitle("Error");
        } else {
            builderI.setTitle("Info");
        }
        if (this.f5028d) {
            builderI.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderI.setPositiveButton("Learn More", new h(this, 2));
            builderI.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderI.create().show();
    }
}
