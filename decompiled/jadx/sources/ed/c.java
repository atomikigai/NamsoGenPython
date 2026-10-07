package ed;

import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f3540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f3543d;
    public final ArrayList e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3544f;

    public c(d dVar, String str) {
        i.e(str, "name");
        this.f3540a = dVar;
        this.f3541b = str;
        this.e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = cd.b.f1822a;
        synchronized (this.f3540a) {
            if (b()) {
                this.f3540a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f3543d;
        if (aVar != null && aVar.f3536b) {
            this.f3544f = true;
        }
        ArrayList arrayList = this.e;
        boolean z4 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f3536b) {
                a aVar2 = (a) arrayList.get(size);
                wa.d dVar = d.h;
                if (d.f3545j.isLoggable(Level.FINE)) {
                    n9.b.a(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z4 = true;
            }
        }
        return z4;
    }

    public final void c(a aVar, long j4) {
        i.e(aVar, "task");
        synchronized (this.f3540a) {
            if (!this.f3542c) {
                if (d(aVar, j4, false)) {
                    this.f3540a.d(this);
                }
            } else if (aVar.f3536b) {
                wa.d dVar = d.h;
                if (d.f3545j.isLoggable(Level.FINE)) {
                    n9.b.a(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                wa.d dVar2 = d.h;
                if (d.f3545j.isLoggable(Level.FINE)) {
                    n9.b.a(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b A[LOOP:0: B:23:0x0069->B:27:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x007f A[EDGE_INSN: B:39:0x007f->B:29:0x007f BREAK  A[LOOP:0: B:23:0x0069->B:27:0x007b], SYNTHETIC] */
    public final boolean d(a aVar, long j4, boolean z4) {
        int size;
        int size2;
        int i;
        Object obj;
        String strConcat;
        i.e(aVar, "task");
        c cVar = aVar.f3537c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            aVar.f3537c = this;
        }
        long jNanoTime = System.nanoTime();
        long j10 = jNanoTime + j4;
        ArrayList arrayList = this.e;
        int iIndexOf = arrayList.indexOf(aVar);
        if (iIndexOf == -1) {
            aVar.f3538d = j10;
            wa.d dVar = d.h;
            if (d.f3545j.isLoggable(Level.FINE)) {
                if (z4) {
                    strConcat = "run again after ".concat(n9.b.l(j10 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(n9.b.l(j10 - jNanoTime));
                }
                n9.b.a(aVar, this, strConcat);
            }
            size = arrayList.size();
            size2 = 0;
            i = 0;
            while (true) {
                if (i < size) {
                    size2 = -1;
                    break;
                }
                obj = arrayList.get(i);
                i++;
                if (((a) obj).f3538d - jNanoTime > j4) {
                    break;
                }
                size2++;
            }
            if (size2 == -1) {
                size2 = arrayList.size();
            }
            arrayList.add(size2, aVar);
            if (size2 == 0) {
                return true;
            }
        } else if (aVar.f3538d <= j10) {
            wa.d dVar2 = d.h;
            if (d.f3545j.isLoggable(Level.FINE)) {
                n9.b.a(aVar, this, "already scheduled");
                return false;
            }
        } else {
            arrayList.remove(iIndexOf);
            aVar.f3538d = j10;
            wa.d dVar3 = d.h;
            if (d.f3545j.isLoggable(Level.FINE)) {
                if (z4) {
                    strConcat = "run again after ".concat(n9.b.l(j10 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(n9.b.l(j10 - jNanoTime));
                }
                n9.b.a(aVar, this, strConcat);
            }
            size = arrayList.size();
            size2 = 0;
            i = 0;
            while (true) {
                if (i < size) {
                    size2 = -1;
                    break;
                }
                obj = arrayList.get(i);
                i++;
                if (((a) obj).f3538d - jNanoTime > j4) {
                    break;
                    break;
                }
                size2++;
            }
            if (size2 == -1) {
                size2 = arrayList.size();
            }
            arrayList.add(size2, aVar);
            if (size2 == 0) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        byte[] bArr = cd.b.f1822a;
        synchronized (this.f3540a) {
            this.f3542c = true;
            if (b()) {
                this.f3540a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f3541b;
    }
}
