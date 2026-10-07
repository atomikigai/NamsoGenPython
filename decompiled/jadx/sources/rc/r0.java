package rc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class r0 implements Runnable, Comparable, m0 {
    private volatile Object _heap;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f8312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8313b;

    public final int a(long j4, s0 s0Var, t0 t0Var) {
        synchronized (this) {
            if (this._heap == b0.f8253b) {
                return 2;
            }
            synchronized (s0Var) {
                try {
                    r0[] r0VarArr = s0Var.f9966a;
                    r0 r0Var = r0VarArr != null ? r0VarArr[0] : null;
                    if (t0.f8320t.get(t0Var) != 0) {
                        return 1;
                    }
                    if (r0Var == null) {
                        s0Var.f8316c = j4;
                    } else {
                        long j10 = r0Var.f8312a;
                        if (j10 - j4 < 0) {
                            j4 = j10;
                        }
                        if (j4 - s0Var.f8316c > 0) {
                            s0Var.f8316c = j4;
                        }
                    }
                    long j11 = this.f8312a;
                    long j12 = s0Var.f8316c;
                    if (j11 - j12 < 0) {
                        this.f8312a = j12;
                    }
                    s0Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void b(s0 s0Var) {
        if (this._heap == b0.f8253b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = s0Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j4 = this.f8312a - ((r0) obj).f8312a;
        if (j4 > 0) {
            return 1;
        }
        return j4 < 0 ? -1 : 0;
    }

    @Override // rc.m0
    public final void f() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                i6.e eVar = b0.f8253b;
                if (obj == eVar) {
                    return;
                }
                s0 s0Var = obj instanceof s0 ? (s0) obj : null;
                if (s0Var != null) {
                    synchronized (s0Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof wc.z ? (wc.z) obj2 : null) != null) {
                            s0Var.b(this.f8313b);
                        }
                    }
                }
                this._heap = eVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f8312a + ']';
    }
}
