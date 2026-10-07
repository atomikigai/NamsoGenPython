package z7;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f11027d;
    public final /* synthetic */ e1 e;

    public /* synthetic */ b1(e1 e1Var, String str, String str2, String str3, int i) {
        this.f11024a = i;
        this.e = e1Var;
        this.f11025b = str;
        this.f11026c = str2;
        this.f11027d = str3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f11024a) {
            case 0:
                z2 z2Var = this.e.f11104a;
                z2Var.a();
                j jVar = z2Var.f11509c;
                z2.D(jVar);
                return jVar.G(this.f11025b, this.f11026c, this.f11027d);
            case 1:
                z2 z2Var2 = this.e.f11104a;
                z2Var2.a();
                j jVar2 = z2Var2.f11509c;
                z2.D(jVar2);
                return jVar2.G(this.f11025b, this.f11026c, this.f11027d);
            case 2:
                z2 z2Var3 = this.e.f11104a;
                z2Var3.a();
                j jVar3 = z2Var3.f11509c;
                z2.D(jVar3);
                return jVar3.D(this.f11025b, this.f11026c, this.f11027d);
            default:
                z2 z2Var4 = this.e.f11104a;
                z2Var4.a();
                j jVar4 = z2Var4.f11509c;
                z2.D(jVar4);
                return jVar4.D(this.f11025b, this.f11026c, this.f11027d);
        }
    }
}
