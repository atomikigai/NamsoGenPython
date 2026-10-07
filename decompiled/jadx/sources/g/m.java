package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import q0.e1;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f4060b;

    public /* synthetic */ m(u uVar, int i) {
        this.f4059a = i;
        this.f4060b = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.f4059a;
        u uVar = this.f4060b;
        switch (i) {
            case 0:
                if ((uVar.k0 & 1) != 0) {
                    uVar.z(0);
                }
                if ((uVar.k0 & 4096) != 0) {
                    uVar.z(108);
                }
                uVar.f4096j0 = false;
                uVar.k0 = 0;
                break;
            default:
                uVar.H.showAtLocation(uVar.G, 55, 0, 0);
                e1 e1Var = uVar.J;
                if (e1Var != null) {
                    e1Var.b();
                }
                if (uVar.K && (viewGroup = uVar.L) != null) {
                    WeakHashMap weakHashMap = v0.f7946a;
                    if (q0.g0.c(viewGroup)) {
                        uVar.G.setAlpha(0.0f);
                        e1 e1VarA = v0.a(uVar.G);
                        e1VarA.a(1.0f);
                        uVar.J = e1VarA;
                        e1VarA.d(new n(this, 0));
                    }
                }
                uVar.G.setAlpha(1.0f);
                uVar.G.setVisibility(0);
                break;
        }
    }
}
