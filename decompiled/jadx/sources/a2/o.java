package a2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements g2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2.c f56a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f57b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f58c;

    public o(v vVar, g2.c cVar) {
        jc.i.e(cVar, "delegate");
        this.f58c = vVar;
        this.f56a = cVar;
        this.f57b = jd.d.n();
    }

    @Override // g2.c
    public final String F(int i) {
        if (this.f58c.f86d.get()) {
            jd.d.K(21, "Statement is recycled");
            throw null;
        }
        if (this.f57b == jd.d.n()) {
            return this.f56a.F(i);
        }
        jd.d.K(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // g2.c
    public final boolean O() {
        if (this.f58c.f86d.get()) {
            jd.d.K(21, "Statement is recycled");
            throw null;
        }
        if (this.f57b == jd.d.n()) {
            return this.f56a.O();
        }
        jd.d.K(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // g2.c
    public final void b(int i, long j4) {
        if (this.f58c.f86d.get()) {
            jd.d.K(21, "Statement is recycled");
            throw null;
        }
        if (this.f57b == jd.d.n()) {
            this.f56a.b(i, j4);
        } else {
            jd.d.K(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.f58c.f86d.get()) {
            jd.d.K(21, "Statement is recycled");
            throw null;
        }
        if (this.f57b == jd.d.n()) {
            this.f56a.close();
        } else {
            jd.d.K(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // g2.c
    public final int getColumnCount() {
        if (this.f58c.f86d.get()) {
            jd.d.K(21, "Statement is recycled");
            throw null;
        }
        if (this.f57b == jd.d.n()) {
            return this.f56a.getColumnCount();
        }
        jd.d.K(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // g2.c
    public final String getColumnName(int i) {
        if (this.f58c.f86d.get()) {
            jd.d.K(21, "Statement is recycled");
            throw null;
        }
        if (this.f57b == jd.d.n()) {
            return this.f56a.getColumnName(i);
        }
        jd.d.K(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // g2.c
    public final long getLong(int i) {
        if (this.f58c.f86d.get()) {
            jd.d.K(21, "Statement is recycled");
            throw null;
        }
        if (this.f57b == jd.d.n()) {
            return this.f56a.getLong(i);
        }
        jd.d.K(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // g2.c
    public final boolean isNull(int i) {
        if (this.f58c.f86d.get()) {
            jd.d.K(21, "Statement is recycled");
            throw null;
        }
        if (this.f57b == jd.d.n()) {
            return this.f56a.isNull(i);
        }
        jd.d.K(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // g2.c
    public final void n() {
        if (this.f58c.f86d.get()) {
            jd.d.K(21, "Statement is recycled");
            throw null;
        }
        if (this.f57b == jd.d.n()) {
            this.f56a.n();
        } else {
            jd.d.K(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // g2.c
    public final void q(int i, String str) {
        jc.i.e(str, "value");
        if (this.f58c.f86d.get()) {
            jd.d.K(21, "Statement is recycled");
            throw null;
        }
        if (this.f57b == jd.d.n()) {
            this.f56a.q(i, str);
        } else {
            jd.d.K(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // g2.c
    public final void reset() {
        if (this.f58c.f86d.get()) {
            jd.d.K(21, "Statement is recycled");
            throw null;
        }
        if (this.f57b == jd.d.n()) {
            this.f56a.reset();
        } else {
            jd.d.K(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
