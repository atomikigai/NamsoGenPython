package i2;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements h2.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f5132b = new String[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f5133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f5134d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f5135a;

    static {
        ub.d[] dVarArr = ub.d.f9064a;
        f5133c = qd.b.t(new c(0));
        f5134d = qd.b.t(new c(1));
    }

    public d(SQLiteDatabase sQLiteDatabase) {
        this.f5135a = sQLiteDatabase;
    }

    @Override // h2.b
    public final void C() {
        this.f5135a.endTransaction();
    }

    @Override // h2.b
    public final boolean M() {
        return this.f5135a.inTransaction();
    }

    @Override // h2.b
    public final boolean N() {
        return this.f5135a.isWriteAheadLoggingEnabled();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5135a.close();
    }

    @Override // h2.b
    public final void e() {
        this.f5135a.beginTransaction();
    }

    @Override // h2.b
    public final void i(String str) {
        jc.i.e(str, "sql");
        this.f5135a.execSQL(str);
    }

    @Override // h2.b
    public final boolean isOpen() {
        return this.f5135a.isOpen();
    }

    @Override // h2.b
    public final k k(String str) {
        jc.i.e(str, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f5135a.compileStatement(str);
        jc.i.d(sQLiteStatementCompileStatement, "compileStatement(...)");
        return new k(sQLiteStatementCompileStatement);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ub.c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, ub.c] */
    @Override // h2.b
    public final void m() throws IllegalAccessException, InvocationTargetException {
        ?? r10 = f5134d;
        if (((Method) r10.getValue()) != null) {
            ?? r11 = f5133c;
            if (((Method) r11.getValue()) != null) {
                Method method = (Method) r10.getValue();
                jc.i.b(method);
                Method method2 = (Method) r11.getValue();
                jc.i.b(method2);
                Object objInvoke = method2.invoke(this.f5135a, null);
                if (objInvoke == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                method.invoke(objInvoke, 0, null, 0, null);
                return;
            }
        }
        e();
    }

    @Override // h2.b
    public final Cursor p(h2.g gVar) {
        final a aVar = new a(gVar);
        Cursor cursorRawQueryWithFactory = this.f5135a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: i2.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                h2.g gVar2 = aVar.f5129a;
                jc.i.b(sQLiteQuery);
                gVar2.c(new j(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, gVar.o(), f5132b, null);
        jc.i.d(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }

    @Override // h2.b
    public final void s(Object[] objArr) {
        this.f5135a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override // h2.b
    public final void u() {
        this.f5135a.setTransactionSuccessful();
    }

    @Override // h2.b
    public final void v() {
        this.f5135a.beginTransactionNonExclusive();
    }
}
