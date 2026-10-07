package uc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends vc.b implements g, b, vc.h {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_state");
    private volatile Object _state;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9100d;

    public i(Object obj) {
        this._state = obj;
    }

    @Override // vc.h
    public final b a(yb.i iVar, int i, int i10) {
        return ((((i < 0 || i >= 2) && i != -2) || i10 != 2) && !((i == 0 || i == -3) && i10 == 1)) ? new vc.f(this, iVar, i, i10) : this;
    }

    @Override // vc.b
    public final vc.d b() {
        return new k();
    }

    @Override // uc.c
    public final Object c(Object obj, yb.d dVar) {
        if (obj == null) {
            obj = vc.c.f9318b;
        }
        g(null, obj);
        return ub.k.f9073a;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:? A[LOOP:0: B:71:0x0127->B:110:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x012e A[Catch: all -> 0x003d, TryCatch #2 {all -> 0x003d, blocks: (B:14:0x0037, B:49:0x00c1, B:51:0x00c9, B:54:0x00d0, B:55:0x00d6, B:57:0x00d9, B:67:0x00fa, B:70:0x010d, B:71:0x0127, B:77:0x0137, B:74:0x012e, B:76:0x0134, B:59:0x00df, B:63:0x00e6, B:21:0x0052, B:24:0x005d, B:48:0x00b2), top: B:105:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x010c -> B:49:0x00c1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // uc.b
    public final java.lang.Object d(uc.c r17, yb.d r18) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uc.i.d(uc.c, yb.d):java.lang.Object");
    }

    @Override // vc.b
    public final vc.d[] e() {
        return new k[2];
    }

    public final Object f() {
        i6.e eVar = vc.c.f9318b;
        Object obj = e.get(this);
        if (obj == eVar) {
            return null;
        }
        return obj;
    }

    public final boolean g(Object obj, Object obj2) {
        int i;
        vc.d[] dVarArr;
        i6.e eVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !jc.i.a(obj3, obj)) {
                return false;
            }
            if (jc.i.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i10 = this.f9100d;
            if ((i10 & 1) != 0) {
                this.f9100d = i10 + 2;
                return true;
            }
            int i11 = i10 + 1;
            this.f9100d = i11;
            vc.d[] dVarArr2 = this.f9314a;
            while (true) {
                k[] kVarArr = (k[]) dVarArr2;
                if (kVarArr != null) {
                    for (k kVar : kVarArr) {
                        if (kVar != null) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k.f9103a;
                            while (true) {
                                Object obj4 = atomicReferenceFieldUpdater2.get(kVar);
                                if (obj4 == null || obj4 == (eVar = j.f9102b)) {
                                    break;
                                }
                                i6.e eVar2 = j.f9101a;
                                if (obj4 != eVar2) {
                                    do {
                                        if (atomicReferenceFieldUpdater2.compareAndSet(kVar, obj4, eVar2)) {
                                            ((rc.k) obj4).resumeWith(ub.k.f9073a);
                                            break;
                                        }
                                    } while (atomicReferenceFieldUpdater2.get(kVar) == obj4);
                                } else {
                                    do {
                                        if (atomicReferenceFieldUpdater2.compareAndSet(kVar, obj4, eVar)) {
                                            break;
                                        }
                                    } while (atomicReferenceFieldUpdater2.get(kVar) == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f9100d;
                    if (i == i11) {
                        this.f9100d = i11 + 1;
                        return true;
                    }
                    dVarArr = this.f9314a;
                }
                dVarArr2 = dVarArr;
                i11 = i;
            }
        }
    }
}
