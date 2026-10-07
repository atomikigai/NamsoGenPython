package u8;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f9045b;

    public /* synthetic */ o(View view, int i) {
        this.f9044a = i;
        this.f9045b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9044a) {
            case 0:
                View view = this.f9045b;
                ((InputMethodManager) e0.k.getSystemService(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                break;
            default:
                this.f9045b.requestFocus();
                break;
        }
    }
}
