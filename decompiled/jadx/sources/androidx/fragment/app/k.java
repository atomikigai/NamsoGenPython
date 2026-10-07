package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends qd.b {
    public final /* synthetic */ m e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f908f;

    public k(l lVar, m mVar) {
        this.f908f = lVar;
        this.e = mVar;
    }

    @Override // qd.b
    public final View y(int i) {
        m mVar = this.e;
        if (mVar.z()) {
            return mVar.y(i);
        }
        Dialog dialog = this.f908f.f923q0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // qd.b
    public final boolean z() {
        return this.e.z() || this.f908f.f927u0;
    }
}
