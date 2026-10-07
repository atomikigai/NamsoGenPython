package d5;

import android.app.Application;
import r4.i;
import s4.h;
import w9.a0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e extends a {
    public e(Application application) {
        super(application);
    }

    public final void g(v9.d dVar) {
        fd.e eVar = new fd.e();
        eVar.f3913c = dVar;
        f(h.a(new r4.f(eVar.c())));
    }

    public final void h(i iVar, a0 a0Var) {
        if (!iVar.f()) {
            throw new IllegalStateException("Cannot mutate an unsuccessful response.");
        }
        fd.e eVar = new fd.e();
        eVar.f3912b = iVar.f8165a;
        eVar.f3914d = iVar.f8167c;
        eVar.e = iVar.f8168d;
        eVar.f3911a = iVar.e;
        eVar.f3913c = iVar.f8166b;
        eVar.f3911a = a0Var.f9803b.f9872c;
        f(h.c(eVar.c()));
    }
}
