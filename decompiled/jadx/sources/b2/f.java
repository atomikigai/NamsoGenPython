package b2;

import i2.k;
import java.io.IOException;
import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f1361d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h2.b bVar, String str) {
        super(bVar, str);
        i.e(bVar, "db");
        i.e(str, "sql");
        this.f1361d = bVar.k(str);
    }

    @Override // g2.c
    public final String F(int i) {
        c();
        jd.d.K(21, "no row");
        throw null;
    }

    @Override // g2.c
    public final boolean O() {
        c();
        this.f1361d.f5157b.execute();
        return false;
    }

    @Override // g2.c
    public final void b(int i, long j4) {
        c();
        this.f1361d.b(i, j4);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f1361d.close();
        this.f1364c = true;
    }

    @Override // g2.c
    public final int getColumnCount() {
        c();
        return 0;
    }

    @Override // g2.c
    public final String getColumnName(int i) {
        c();
        jd.d.K(21, "no row");
        throw null;
    }

    @Override // g2.c
    public final long getLong(int i) {
        c();
        jd.d.K(21, "no row");
        throw null;
    }

    @Override // g2.c
    public final boolean isNull(int i) {
        c();
        jd.d.K(21, "no row");
        throw null;
    }

    @Override // g2.c
    public final void n() {
        c();
        this.f1361d.I(4);
    }

    @Override // g2.c
    public final void q(int i, String str) {
        i.e(str, "value");
        c();
        this.f1361d.j(i, str);
    }

    @Override // g2.c
    public final void reset() {
    }
}
