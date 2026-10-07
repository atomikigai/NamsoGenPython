package androidx.fragment.app;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends qd.b {
    public final /* synthetic */ s e;

    public m(s sVar) {
        this.e = sVar;
    }

    @Override // qd.b
    public final View y(int i) {
        s sVar = this.e;
        View view = sVar.P;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + sVar + " does not have a view");
    }

    @Override // qd.b
    public final boolean z() {
        return this.e.P != null;
    }
}
