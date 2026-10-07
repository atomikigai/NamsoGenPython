package i2;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends j implements h2.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f5157b;

    public k(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f5157b = sQLiteStatement;
    }

    public final int c() {
        return this.f5157b.executeUpdateDelete();
    }
}
