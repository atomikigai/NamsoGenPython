package fb;

import java.util.concurrent.Executor;
import jc.i;
import rc.b0;
import t9.b;
import t9.c;
import t9.d;
import x9.e;
import x9.q;
import x9.s;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f3891b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f3892c = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f3893d = new a(2);
    public static final a e = new a(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3894a;

    public /* synthetic */ a(int i) {
        this.f3894a = i;
    }

    @Override // x9.e
    public final Object d(s sVar) {
        switch (this.f3894a) {
            case 0:
                Object objF = sVar.f(new q(t9.a.class, Executor.class));
                i.d(objF, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return b0.j((Executor) objF);
            case 1:
                Object objF2 = sVar.f(new q(c.class, Executor.class));
                i.d(objF2, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return b0.j((Executor) objF2);
            case 2:
                Object objF3 = sVar.f(new q(b.class, Executor.class));
                i.d(objF3, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return b0.j((Executor) objF3);
            default:
                Object objF4 = sVar.f(new q(d.class, Executor.class));
                i.d(objF4, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return b0.j((Executor) objF4);
        }
    }
}
