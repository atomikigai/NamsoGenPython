package k;

import android.view.ActionProvider;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionProvider f5892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a4.b f5893b;

    public o(s sVar, ActionProvider actionProvider) {
        this.f5892a = actionProvider;
    }

    public final View a(n nVar) {
        return this.f5892a.onCreateActionView(nVar);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z4) {
        a4.b bVar = this.f5893b;
        if (bVar != null) {
            l lVar = ((n) bVar.f113b).f5890y;
            lVar.f5867s = true;
            lVar.p(true);
        }
    }
}
