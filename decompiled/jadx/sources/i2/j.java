package i2;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class j implements h2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f5156a;

    public j(SQLiteProgram sQLiteProgram) {
        jc.i.e(sQLiteProgram, "delegate");
        this.f5156a = sQLiteProgram;
    }

    @Override // h2.f
    public final void I(int i) {
        this.f5156a.bindNull(i);
    }

    @Override // h2.f
    public final void b(int i, long j4) {
        this.f5156a.bindLong(i, j4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5156a.close();
    }

    @Override // h2.f
    public final void j(int i, String str) {
        jc.i.e(str, "value");
        this.f5156a.bindString(i, str);
    }

    @Override // h2.f
    public final void l(int i, double d10) {
        this.f5156a.bindDouble(i, d10);
    }

    @Override // h2.f
    public final void w(int i, byte[] bArr) {
        this.f5156a.bindBlob(i, bArr);
    }
}
