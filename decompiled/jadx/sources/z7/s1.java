package z7;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f11341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1 f11342c;

    public /* synthetic */ s1(x1 x1Var, AtomicReference atomicReference, int i) {
        this.f11340a = i;
        this.f11342c = x1Var;
        this.f11341b = atomicReference;
    }

    private final void a() {
        synchronized (this.f11341b) {
            try {
                try {
                    AtomicReference atomicReference = this.f11341b;
                    a1 a1Var = (a1) this.f11342c.f159a;
                    atomicReference.set(Integer.valueOf(a1Var.f11005r.f(a1Var.j().g(), z.N)));
                    this.f11341b.notify();
                } catch (Throwable th) {
                    this.f11341b.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.f11340a) {
            case 0:
                synchronized (this.f11341b) {
                    try {
                        try {
                            AtomicReference atomicReference = this.f11341b;
                            a1 a1Var = (a1) this.f11342c.f159a;
                            atomicReference.set(Boolean.valueOf(a1Var.f11005r.l(a1Var.j().g(), z.K)));
                            this.f11341b.notify();
                        } catch (Throwable th) {
                            this.f11341b.notify();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                synchronized (this.f11341b) {
                    try {
                        try {
                            AtomicReference atomicReference2 = this.f11341b;
                            a1 a1Var2 = (a1) this.f11342c.f159a;
                            g gVar = a1Var2.f11005r;
                            String strG = a1Var2.j().g();
                            y yVar = z.L;
                            if (strG == null) {
                                gVar.getClass();
                                str = (String) yVar.a(null);
                            } else {
                                str = (String) yVar.a(gVar.f11134c.a(strG, yVar.f11436a));
                            }
                            atomicReference2.set(str);
                            this.f11341b.notify();
                        } catch (Throwable th3) {
                            this.f11341b.notify();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
            case 2:
                synchronized (this.f11341b) {
                    try {
                        try {
                            AtomicReference atomicReference3 = this.f11341b;
                            a1 a1Var3 = (a1) this.f11342c.f159a;
                            atomicReference3.set(Long.valueOf(a1Var3.f11005r.h(a1Var3.j().g(), z.M)));
                            this.f11341b.notify();
                        } catch (Throwable th5) {
                            this.f11341b.notify();
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                return;
            case 3:
                a();
                return;
            default:
                synchronized (this.f11341b) {
                    try {
                        try {
                            AtomicReference atomicReference4 = this.f11341b;
                            a1 a1Var4 = (a1) this.f11342c.f159a;
                            atomicReference4.set(Double.valueOf(a1Var4.f11005r.e(a1Var4.j().g(), z.O)));
                            this.f11341b.notify();
                        } catch (Throwable th7) {
                            this.f11341b.notify();
                            throw th7;
                        }
                    } catch (Throwable th8) {
                        throw th8;
                    }
                }
                return;
        }
    }
}
