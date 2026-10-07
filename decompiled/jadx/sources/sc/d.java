package sc;

import android.os.Handler;
import android.os.Looper;
import da.v;
import java.util.concurrent.CancellationException;
import rc.b0;
import rc.g0;
import rc.k0;
import rc.m0;
import rc.n1;
import rc.u1;
import rc.x;
import wc.o;
import yb.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends x implements g0 {
    private volatile d _immediate;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f8489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8490d;
    public final d e;

    public d(Handler handler, boolean z4) {
        this.f8489c = handler;
        this.f8490d = z4;
        this._immediate = z4 ? this : null;
        d dVar = this._immediate;
        if (dVar == null) {
            dVar = new d(handler, true);
            this._immediate = dVar;
        }
        this.e = dVar;
    }

    @Override // rc.x
    public final void S(i iVar, Runnable runnable) {
        if (this.f8489c.post(runnable)) {
            return;
        }
        U(iVar, runnable);
    }

    @Override // rc.x
    public final boolean T() {
        return (this.f8490d && jc.i.a(Looper.myLooper(), this.f8489c.getLooper())) ? false : true;
    }

    public final void U(i iVar, Runnable runnable) {
        b0.f(iVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        k0.f8293b.S(iVar, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && ((d) obj).f8489c == this.f8489c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f8489c);
    }

    @Override // rc.g0
    public final m0 o(long j4, final u1 u1Var, i iVar) {
        if (j4 > 4611686018427387903L) {
            j4 = 4611686018427387903L;
        }
        if (this.f8489c.postDelayed(u1Var, j4)) {
            return new m0() { // from class: sc.c
                @Override // rc.m0
                public final void f() {
                    this.f8487a.f8489c.removeCallbacks(u1Var);
                }
            };
        }
        U(iVar, u1Var);
        return n1.f8304a;
    }

    @Override // rc.x
    public final String toString() {
        d dVar;
        String str;
        yc.d dVar2 = k0.f8292a;
        d dVar3 = o.f9950a;
        if (this == dVar3) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar3.e;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f8489c.toString();
        return this.f8490d ? v.h(string, ".immediate") : string;
    }
}
