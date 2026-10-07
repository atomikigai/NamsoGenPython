package c1;

import android.content.Context;
import androidx.lifecycle.j0;
import java.util.List;
import rc.a0;
import z0.y;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.l f1722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f1723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1724d = new Object();
    public volatile a5.b e;

    public c(String str, ic.l lVar, a0 a0Var) {
        this.f1721a = str;
        this.f1722b = lVar;
        this.f1723c = a0Var;
    }

    public final a5.b a(Context context, nc.c cVar) {
        a5.b bVar;
        jc.i.e(context, "thisRef");
        jc.i.e(cVar, "property");
        a5.b bVar2 = this.e;
        if (bVar2 != null) {
            return bVar2;
        }
        synchronized (this.f1724d) {
            try {
                if (this.e == null) {
                    Context applicationContext = context.getApplicationContext();
                    ic.l lVar = this.f1722b;
                    jc.i.d(applicationContext, "applicationContext");
                    List list = (List) lVar.invoke(applicationContext);
                    a0 a0Var = this.f1723c;
                    b bVar3 = new b(applicationContext, this);
                    jc.i.e(list, "migrations");
                    this.e = new a5.b(new y(new j0(bVar3, 4), jd.d.D(new a2.g(list, (yb.d) null, 25)), new b9.e(1), a0Var), 9);
                }
                bVar = this.e;
                jc.i.b(bVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
