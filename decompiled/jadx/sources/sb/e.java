package sb;

import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8473a = 0;

    public abstract void a(qb.a aVar);

    public abstract void b(int i);

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        setAlpha(z4 ? 1.0f : 0.38f);
    }
}
