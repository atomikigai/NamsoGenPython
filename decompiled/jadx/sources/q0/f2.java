package q0;

import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends e2 {
    @Override // n9.b
    public final void z(boolean z4) {
        if (!z4) {
            F(16);
            return;
        }
        Window window = this.f7896a;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }
}
