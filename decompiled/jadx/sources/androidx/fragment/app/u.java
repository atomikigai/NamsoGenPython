package androidx.fragment.app;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f994b;

    public /* synthetic */ u(w wVar, int i) {
        this.f993a = i;
        this.f994b = wVar;
    }

    @Override // d.a
    public final void a() {
        switch (this.f993a) {
            case 0:
                w wVar = this.f994b;
                a4.b bVar = wVar.E;
                v vVar = (v) bVar.f113b;
                vVar.f999s.b(vVar, vVar, null);
                Bundle bundleC = ((f2.d) wVar.e.f1939d).c("android:support:fragments");
                if (bundleC != null) {
                    ((v) bVar.f113b).f999s.P(bundleC.getParcelable("android:support:fragments"));
                }
                break;
            default:
                g.g gVar = (g.g) this.f994b;
                g.l lVarR = gVar.r();
                lVarR.d();
                ((f2.d) gVar.e.f1939d).c("androidx:appcompat");
                lVarR.h();
                break;
        }
    }
}
