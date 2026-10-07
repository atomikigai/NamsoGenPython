package x;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends o {
    @Override // x.d
    public final void a(d dVar) {
        w.a aVar = (w.a) this.f10004b;
        int i = aVar.f9341s0;
        f fVar = this.h;
        ArrayList arrayList = fVar.f9990l;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            int i13 = ((f) obj).f9987g;
            if (i11 == -1 || i13 < i11) {
                i11 = i13;
            }
            if (i10 < i13) {
                i10 = i13;
            }
        }
        if (i == 0 || i == 2) {
            fVar.d(i11 + aVar.f9343u0);
        } else {
            fVar.d(i10 + aVar.f9343u0);
        }
    }

    @Override // x.o
    public final void d() {
        w.d dVar = this.f10004b;
        if (dVar instanceof w.a) {
            f fVar = this.h;
            fVar.f9983b = true;
            ArrayList arrayList = fVar.f9990l;
            w.a aVar = (w.a) dVar;
            int i = aVar.f9341s0;
            boolean z4 = aVar.f9342t0;
            int i10 = 0;
            if (i == 0) {
                fVar.e = 4;
                while (i10 < aVar.f9444r0) {
                    w.d dVar2 = aVar.f9443q0[i10];
                    if (z4 || dVar2.f9377g0 != 8) {
                        f fVar2 = dVar2.f9371d.h;
                        fVar2.f9989k.add(fVar);
                        arrayList.add(fVar2);
                    }
                    i10++;
                }
                m(this.f10004b.f9371d.h);
                m(this.f10004b.f9371d.i);
                return;
            }
            if (i == 1) {
                fVar.e = 5;
                while (i10 < aVar.f9444r0) {
                    w.d dVar3 = aVar.f9443q0[i10];
                    if (z4 || dVar3.f9377g0 != 8) {
                        f fVar3 = dVar3.f9371d.i;
                        fVar3.f9989k.add(fVar);
                        arrayList.add(fVar3);
                    }
                    i10++;
                }
                m(this.f10004b.f9371d.h);
                m(this.f10004b.f9371d.i);
                return;
            }
            if (i == 2) {
                fVar.e = 6;
                while (i10 < aVar.f9444r0) {
                    w.d dVar4 = aVar.f9443q0[i10];
                    if (z4 || dVar4.f9377g0 != 8) {
                        f fVar4 = dVar4.e.h;
                        fVar4.f9989k.add(fVar);
                        arrayList.add(fVar4);
                    }
                    i10++;
                }
                m(this.f10004b.e.h);
                m(this.f10004b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            fVar.e = 7;
            while (i10 < aVar.f9444r0) {
                w.d dVar5 = aVar.f9443q0[i10];
                if (z4 || dVar5.f9377g0 != 8) {
                    f fVar5 = dVar5.e.i;
                    fVar5.f9989k.add(fVar);
                    arrayList.add(fVar5);
                }
                i10++;
            }
            m(this.f10004b.e.h);
            m(this.f10004b.e.i);
        }
    }

    @Override // x.o
    public final void e() {
        w.d dVar = this.f10004b;
        if (dVar instanceof w.a) {
            int i = ((w.a) dVar).f9341s0;
            f fVar = this.h;
            if (i == 0 || i == 1) {
                dVar.Y = fVar.f9987g;
            } else {
                dVar.Z = fVar.f9987g;
            }
        }
    }

    @Override // x.o
    public final void f() {
        this.f10005c = null;
        this.h.c();
    }

    @Override // x.o
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.h;
        fVar2.f9989k.add(fVar);
        fVar.f9990l.add(fVar2);
    }
}
