package a2;

import java.util.concurrent.locks.ReentrantLock;
import rc.b0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a f51b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f52c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i[] f54f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zc.h f55g;
    public final androidx.datastore.preferences.protobuf.h h;

    public n(int i, ic.a aVar) {
        this.f50a = i;
        this.f51b = aVar;
        this.f54f = new i[i];
        int i10 = zc.i.f11571a;
        this.f55g = new zc.h(i, 0);
        androidx.datastore.preferences.protobuf.h hVar = new androidx.datastore.preferences.protobuf.h();
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        hVar.f650c = i - 1;
        hVar.f651d = new Object[i];
        this.h = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ac.c cVar) {
        m mVar;
        int andDecrement;
        n nVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i = mVar.f49d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mVar.f49d = i - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object obj = mVar.f47b;
        zb.a aVar = zb.a.f11555a;
        int i10 = mVar.f49d;
        if (i10 == 0) {
            r7.g.G(obj);
            mVar.f46a = this;
            mVar.f49d = 1;
            zc.h hVar = this.f55g;
            hVar.getClass();
            int i11 = hVar.f11569a;
            do {
                andDecrement = zc.h.f11568r.getAndDecrement(hVar);
            } while (andDecrement > i11);
            Object obj2 = ub.k.f9073a;
            if (andDecrement <= 0) {
                rc.k kVarM = b0.m(qd.b.r(mVar));
                try {
                    if (!hVar.a(kVarM)) {
                        while (true) {
                            int andDecrement2 = zc.h.f11568r.getAndDecrement(hVar);
                            if (andDecrement2 <= i11) {
                                if (andDecrement2 > 0) {
                                    kVarM.f(obj2, hVar.f11570b);
                                    break;
                                }
                                if (hVar.a(kVarM)) {
                                    break;
                                }
                            }
                        }
                    }
                    Object objR = kVarM.r();
                    if (objR != aVar) {
                        objR = obj2;
                    }
                    if (objR == aVar) {
                        obj2 = objR;
                    }
                } catch (Throwable th) {
                    kVarM.z();
                    throw th;
                }
            }
            if (obj2 == aVar) {
                return aVar;
            }
            nVar = this;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = mVar.f46a;
            r7.g.G(obj);
        }
        try {
            ReentrantLock reentrantLock = nVar.f52c;
            androidx.datastore.preferences.protobuf.h hVar2 = nVar.h;
            reentrantLock.lock();
            try {
                if (nVar.e) {
                    jd.d.K(21, "Connection pool is closed");
                    throw null;
                }
                if (hVar2.f648a == hVar2.f649b && nVar.f53d < nVar.f50a) {
                    i iVar = new i((g2.a) nVar.f51b.a());
                    i[] iVarArr = nVar.f54f;
                    int i12 = nVar.f53d;
                    nVar.f53d = i12 + 1;
                    iVarArr[i12] = iVar;
                    hVar2.a(iVar);
                }
                int i13 = hVar2.f648a;
                if (i13 == hVar2.f649b) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                Object[] objArr = (Object[]) hVar2.f651d;
                Object obj3 = objArr[i13];
                objArr[i13] = null;
                hVar2.f648a = (i13 + 1) & hVar2.f650c;
                i iVar2 = (i) obj3;
                reentrantLock.unlock();
                return iVar2;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            nVar.f55g.b();
            throw th3;
        }
    }

    public final void b() {
        ReentrantLock reentrantLock = this.f52c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (i iVar : this.f54f) {
                if (iVar != null) {
                    iVar.close();
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void c(StringBuilder sb2) {
        androidx.datastore.preferences.protobuf.h hVar = this.h;
        ReentrantLock reentrantLock = this.f52c;
        reentrantLock.lock();
        try {
            wb.c cVar = new wb.c(10);
            int i = (hVar.f649b - hVar.f648a) & hVar.f650c;
            for (int i10 = 0; i10 < i; i10++) {
                if (i10 >= 0) {
                    int i11 = hVar.f649b;
                    int i12 = hVar.f648a;
                    int i13 = hVar.f650c;
                    if (i10 < ((i11 - i12) & i13)) {
                        Object obj = ((Object[]) hVar.f651d)[(i12 + i10) & i13];
                        jc.i.b(obj);
                        cVar.add(obj);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            wb.c cVarC = jd.d.c(cVar);
            sb2.append('\t' + toString() + " (");
            sb2.append("capacity=" + this.f50a + ", ");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("permits=");
            zc.h hVar2 = this.f55g;
            hVar2.getClass();
            sb3.append(Math.max(zc.h.f11568r.get(hVar2), 0));
            sb3.append(", ");
            sb2.append(sb3.toString());
            sb2.append("queue=(size=" + cVarC.d() + ")[" + vb.i.e0(cVarC, null, null, null, null, 63) + "], ");
            sb2.append(")");
            sb2.append('\n');
            i[] iVarArr = this.f54f;
            int length = iVarArr.length;
            int i14 = 0;
            for (int i15 = 0; i15 < length; i15++) {
                i iVar = iVarArr[i15];
                i14++;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("\t\t[");
                sb4.append(i14);
                sb4.append("] - ");
                sb4.append(iVar != null ? iVar.f30a.toString() : null);
                sb2.append(sb4.toString());
                sb2.append('\n');
                if (iVar != null) {
                    iVar.g(sb2);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(i iVar) {
        jc.i.e(iVar, "connection");
        ReentrantLock reentrantLock = this.f52c;
        reentrantLock.lock();
        try {
            this.h.a(iVar);
            reentrantLock.unlock();
            this.f55g.b();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
