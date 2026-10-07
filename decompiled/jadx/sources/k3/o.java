package k3;

import bd.s;
import h3.r2;
import java.util.concurrent.TimeUnit;
import rc.b0;
import rc.k0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f5963a;

    static {
        bd.r rVar = new bd.r();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        jc.i.e(timeUnit, "unit");
        rVar.f1651s = cd.b.b(15L, timeUnit);
        rVar.f1652t = cd.b.b(15L, timeUnit);
        jc.i.e(timeUnit, "unit");
        rVar.f1653u = cd.b.b(15L, timeUnit);
        f5963a = new s(rVar);
    }

    public static Object a(String str, ac.i iVar) {
        return b0.y(k0.f8293b, new r2(str, null, 1), iVar);
    }
}
