package w3;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l4.f f9541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f9542c;

    public /* synthetic */ l(n nVar, l4.f fVar, int i) {
        this.f9540a = i;
        this.f9542c = nVar;
        this.f9541b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9540a) {
            case 0:
                l4.f fVar = this.f9541b;
                fVar.f6770b.a();
                synchronized (fVar.f6771c) {
                    synchronized (this.f9542c) {
                        try {
                            if (((ArrayList) this.f9542c.f9545a.f7715b).contains(new m(this.f9541b, p4.f.f7798b))) {
                                n nVar = this.f9542c;
                                l4.f fVar2 = this.f9541b;
                                nVar.getClass();
                                try {
                                    fVar2.i(nVar.B, 5);
                                } catch (Throwable th) {
                                    throw new b(th);
                                }
                            }
                            this.f9542c.d();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return;
            default:
                l4.f fVar3 = this.f9541b;
                fVar3.f6770b.a();
                synchronized (fVar3.f6771c) {
                    synchronized (this.f9542c) {
                        try {
                            if (((ArrayList) this.f9542c.f9545a.f7715b).contains(new m(this.f9541b, p4.f.f7798b))) {
                                this.f9542c.D.a();
                                n nVar2 = this.f9542c;
                                l4.f fVar4 = this.f9541b;
                                nVar2.getClass();
                                try {
                                    fVar4.k(nVar2.D, nVar2.f9558z, nVar2.G);
                                    this.f9542c.h(this.f9541b);
                                } catch (Throwable th3) {
                                    throw new b(th3);
                                }
                            }
                            this.f9542c.d();
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
                return;
        }
    }
}
