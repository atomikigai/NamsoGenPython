package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f876b;

    public /* synthetic */ i(Object obj, int i) {
        this.f875a = i;
        this.f876b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f875a) {
            case 0:
                l lVar = (l) this.f876b;
                Dialog dialog = lVar.f923q0;
                if (dialog != null) {
                    lVar.onCancel(dialog);
                }
                break;
            default:
                ((h6.j) this.f876b).b();
                break;
        }
    }
}
