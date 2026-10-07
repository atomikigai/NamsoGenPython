package u8;

import android.widget.ImageButton;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9046a;

    public final void a(int i, boolean z4) {
        super.setVisibility(i);
        if (z4) {
            this.f9046a = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f9046a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        a(i, true);
    }
}
