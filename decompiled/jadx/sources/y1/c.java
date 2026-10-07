package y1;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final s c(Context context, Class cls, String str) {
        jc.i.e(context, "context");
        if (pc.g.m0(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        if (str.equals(":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new s(context, cls, str);
    }

    public static final Object d(o oVar, String str, ac.c cVar) {
        Object objB = oVar.b(str, new h3.o(18), cVar);
        return objB == zb.a.f11555a ? objB : ub.k.f9073a;
    }

    public abstract void a(g2.c cVar, Object obj);

    public abstract String b();

    public void e(g2.a aVar, Object obj) {
        jc.i.e(aVar, "connection");
        if (obj == null) {
            return;
        }
        g2.c cVarR = aVar.R(b());
        try {
            a(cVarR, obj);
            cVarR.O();
            a.a.b(cVarR, null);
            qd.b.q(aVar);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a.a.b(cVarR, th);
                throw th2;
            }
        }
    }

    public void f(g2.a aVar, Object obj) {
        jc.i.e(aVar, "connection");
        g2.c cVarR = aVar.R(b());
        try {
            a(cVarR, obj);
            cVarR.O();
            a.a.b(cVarR, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a.a.b(cVarR, th);
                throw th2;
            }
        }
    }

    public long g(g2.a aVar, Object obj) {
        jc.i.e(aVar, "connection");
        g2.c cVarR = aVar.R(b());
        try {
            a(cVarR, obj);
            cVarR.O();
            a.a.b(cVarR, null);
            if (qd.b.q(aVar) == 0) {
                return -1L;
            }
            g2.c cVarR2 = aVar.R("SELECT last_insert_rowid()");
            try {
                cVarR2.O();
                long j4 = cVarR2.getLong(0);
                a.a.b(cVarR2, null);
                return j4;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    a.a.b(cVarR2, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                a.a.b(cVarR, th3);
                throw th4;
            }
        }
    }
}
