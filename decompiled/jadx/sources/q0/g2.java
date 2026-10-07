package q0;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 extends n9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowInsetsController f7902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window f7903b;

    public g2(Window window, wa.d dVar) {
        this.f7902a = window.getInsetsController();
        this.f7903b = window;
    }

    @Override // n9.b
    public final void A(boolean z4) {
        Window window = this.f7903b;
        if (z4) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f7902a.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f7902a.setSystemBarsAppearance(0, 8);
    }

    @Override // n9.b
    public final void z(boolean z4) {
        Window window = this.f7903b;
        if (z4) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f7902a.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f7902a.setSystemBarsAppearance(0, 16);
    }
}
