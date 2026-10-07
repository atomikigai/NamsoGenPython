package z7;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f3 f11060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e1 f11061c;

    public /* synthetic */ c1(e1 e1Var, f3 f3Var, int i) {
        this.f11059a = i;
        this.f11061c = e1Var;
        this.f11060b = f3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11059a) {
            case 0:
                z2 z2Var = this.f11061c.f11104a;
                z2Var.a();
                z2Var.l(this.f11060b);
                break;
            case 1:
                z2 z2Var2 = this.f11061c.f11104a;
                z2Var2.a();
                z2Var2.zzaB().c();
                z2Var2.b();
                f3 f3Var = this.f11060b;
                com.google.android.gms.common.internal.i0.e(f3Var.f11119a);
                z2Var2.E(f3Var);
                break;
            case 2:
                z2 z2Var3 = this.f11061c.f11104a;
                z2Var3.a();
                z2Var3.zzaB().c();
                z2Var3.b();
                f3 f3Var2 = this.f11060b;
                com.google.android.gms.common.internal.i0.e(f3Var2.f11119a);
                j1 j1VarB = j1.b(100, f3Var2.G);
                String str = f3Var2.f11119a;
                j1 j1VarI = z2Var3.I(str);
                z2Var3.zzaA().f11198y.d(str, "Setting consent, package, consent", j1VarB);
                z2Var3.n(str, j1VarB);
                if (j1VarB.g(j1VarI, (i1[]) j1VarB.f11215a.keySet().toArray(new i1[0]))) {
                    z2Var3.l(f3Var2);
                }
                break;
            default:
                z2 z2Var4 = this.f11061c.f11104a;
                z2Var4.a();
                z2Var4.i(this.f11060b);
                break;
        }
    }
}
