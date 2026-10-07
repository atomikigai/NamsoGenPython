package od;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f7756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7759d;
    public final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q f7760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q f7761g;

    public q() {
        this.f7756a = new byte[8192];
        this.e = true;
        this.f7759d = false;
    }

    public final q a() {
        q qVar = this.f7760f;
        if (qVar == this) {
            qVar = null;
        }
        q qVar2 = this.f7761g;
        jc.i.b(qVar2);
        qVar2.f7760f = this.f7760f;
        q qVar3 = this.f7760f;
        jc.i.b(qVar3);
        qVar3.f7761g = this.f7761g;
        this.f7760f = null;
        this.f7761g = null;
        return qVar;
    }

    public final void b(q qVar) {
        jc.i.e(qVar, "segment");
        qVar.f7761g = this;
        qVar.f7760f = this.f7760f;
        q qVar2 = this.f7760f;
        jc.i.b(qVar2);
        qVar2.f7761g = qVar;
        this.f7760f = qVar;
    }

    public final q c() {
        this.f7759d = true;
        return new q(this.f7756a, this.f7757b, this.f7758c, true);
    }

    public final void d(q qVar, int i) {
        jc.i.e(qVar, "sink");
        byte[] bArr = qVar.f7756a;
        if (!qVar.e) {
            throw new IllegalStateException("only owner can write");
        }
        int i10 = qVar.f7758c;
        int i11 = i10 + i;
        if (i11 > 8192) {
            if (qVar.f7759d) {
                throw new IllegalArgumentException();
            }
            int i12 = qVar.f7757b;
            if (i11 - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            vb.h.J(bArr, 0, bArr, i12, i10);
            qVar.f7758c -= qVar.f7757b;
            qVar.f7757b = 0;
        }
        int i13 = qVar.f7758c;
        int i14 = this.f7757b;
        vb.h.J(this.f7756a, i13, bArr, i14, i14 + i);
        qVar.f7758c += i;
        this.f7757b += i;
    }

    public q(byte[] bArr, int i, int i10, boolean z4) {
        jc.i.e(bArr, "data");
        this.f7756a = bArr;
        this.f7757b = i;
        this.f7758c = i10;
        this.f7759d = z4;
        this.e = false;
    }
}
