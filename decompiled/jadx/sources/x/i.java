package x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends o {
    @Override // x.d
    public final void a(d dVar) {
        f fVar = this.h;
        if (fVar.f9984c && !fVar.f9988j) {
            fVar.d((int) ((((f) fVar.f9990l.get(0)).f9987g * ((w.h) this.f10004b).f9437q0) + 0.5f));
        }
    }

    @Override // x.o
    public final void d() {
        w.d dVar = this.f10004b;
        w.h hVar = (w.h) dVar;
        int i = hVar.f9438r0;
        int i10 = hVar.f9439s0;
        int i11 = hVar.f9441u0;
        f fVar = this.h;
        if (i11 == 1) {
            if (i != -1) {
                fVar.f9990l.add(dVar.T.f9371d.h);
                this.f10004b.T.f9371d.h.f9989k.add(fVar);
                fVar.f9986f = i;
            } else if (i10 != -1) {
                fVar.f9990l.add(dVar.T.f9371d.i);
                this.f10004b.T.f9371d.i.f9989k.add(fVar);
                fVar.f9986f = -i10;
            } else {
                fVar.f9983b = true;
                fVar.f9990l.add(dVar.T.f9371d.i);
                this.f10004b.T.f9371d.i.f9989k.add(fVar);
            }
            m(this.f10004b.f9371d.h);
            m(this.f10004b.f9371d.i);
            return;
        }
        if (i != -1) {
            fVar.f9990l.add(dVar.T.e.h);
            this.f10004b.T.e.h.f9989k.add(fVar);
            fVar.f9986f = i;
        } else if (i10 != -1) {
            fVar.f9990l.add(dVar.T.e.i);
            this.f10004b.T.e.i.f9989k.add(fVar);
            fVar.f9986f = -i10;
        } else {
            fVar.f9983b = true;
            fVar.f9990l.add(dVar.T.e.i);
            this.f10004b.T.e.i.f9989k.add(fVar);
        }
        m(this.f10004b.e.h);
        m(this.f10004b.e.i);
    }

    @Override // x.o
    public final void e() {
        w.d dVar = this.f10004b;
        int i = ((w.h) dVar).f9441u0;
        f fVar = this.h;
        if (i == 1) {
            dVar.Y = fVar.f9987g;
        } else {
            dVar.Z = fVar.f9987g;
        }
    }

    @Override // x.o
    public final void f() {
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
