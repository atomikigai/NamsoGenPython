package q0;

import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class e2 extends n9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Window f7896a;

    public e2(Window window, wa.d dVar) {
        this.f7896a = window;
    }

    @Override // n9.b
    public final void A(boolean z4) {
        if (!z4) {
            F(8192);
            return;
        }
        Window window = this.f7896a;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }

    public final void F(int i) {
        View decorView = this.f7896a.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
