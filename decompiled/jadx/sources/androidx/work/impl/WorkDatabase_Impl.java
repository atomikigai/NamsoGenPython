package androidx.work.impl;

import a2.l;
import a5.b;
import aa.c;
import android.content.Context;
import c3.j;
import com.bumptech.glide.manager.q;
import gb.r;
import h2.e;
import java.util.HashMap;
import y1.a;
import y1.i;
import y1.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f1253u = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile j f1254n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile c f1255o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile c f1256p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile l f1257q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile c f1258r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile r f1259s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile c f1260t;

    @Override // y1.v
    public final i e() {
        return new i(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // y1.v
    public final e g(a aVar) {
        x xVar = new x(aVar, new b(this, 29));
        Context context = aVar.f10394a;
        jc.i.e(context, "context");
        return aVar.f10396c.n(new q(context, aVar.f10395b, xVar, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c s() {
        c cVar;
        if (this.f1255o != null) {
            return this.f1255o;
        }
        synchronized (this) {
            try {
                if (this.f1255o == null) {
                    this.f1255o = new c(this, 7);
                }
                cVar = this.f1255o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c t() {
        c cVar;
        if (this.f1260t != null) {
            return this.f1260t;
        }
        synchronized (this) {
            try {
                if (this.f1260t == null) {
                    this.f1260t = new c(this, 8);
                }
                cVar = this.f1260t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final l u() {
        l lVar;
        if (this.f1257q != null) {
            return this.f1257q;
        }
        synchronized (this) {
            try {
                if (this.f1257q == null) {
                    this.f1257q = new l(this);
                }
                lVar = this.f1257q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c v() {
        c cVar;
        if (this.f1258r != null) {
            return this.f1258r;
        }
        synchronized (this) {
            try {
                if (this.f1258r == null) {
                    this.f1258r = new c(this, 9);
                }
                cVar = this.f1258r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final r w() {
        r rVar;
        if (this.f1259s != null) {
            return this.f1259s;
        }
        synchronized (this) {
            try {
                if (this.f1259s == null) {
                    r rVar2 = new r();
                    rVar2.f4493a = this;
                    rVar2.f4494b = new c3.b(this, 4);
                    rVar2.f4495c = new c3.e(this, 1);
                    rVar2.f4496d = new c3.e(this, 2);
                    this.f1259s = rVar2;
                }
                rVar = this.f1259s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final j x() {
        j jVar;
        if (this.f1254n != null) {
            return this.f1254n;
        }
        synchronized (this) {
            try {
                if (this.f1254n == null) {
                    this.f1254n = new j(this);
                }
                jVar = this.f1254n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c y() {
        c cVar;
        if (this.f1256p != null) {
            return this.f1256p;
        }
        synchronized (this) {
            try {
                if (this.f1256p == null) {
                    this.f1256p = new c(this, 10);
                }
                cVar = this.f1256p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }
}
