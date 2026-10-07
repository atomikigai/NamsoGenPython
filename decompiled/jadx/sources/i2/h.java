package i2;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import androidx.datastore.preferences.protobuf.d1;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f5145r = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e7.i f5147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h2.c f5148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5149d;
    public final j2.a e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5150f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, String str, final e7.i iVar, final h2.c cVar) {
        String string;
        super(context, str, null, cVar.f4608a, new DatabaseErrorHandler() { // from class: i2.e
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = h.f5145r;
                jc.i.b(sQLiteDatabase);
                d dVarR = n9.b.r(iVar, sQLiteDatabase);
                cVar.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + dVarR + ".path");
                SQLiteDatabase sQLiteDatabase2 = dVarR.f5135a;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        h2.c.a(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                jc.i.d(obj, "second");
                                h2.c.a((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                h2.c.a(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    dVarR.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        jc.i.e(context, "context");
        jc.i.e(cVar, "callback");
        this.f5146a = context;
        this.f5147b = iVar;
        this.f5148c = cVar;
        if (str == null) {
            string = UUID.randomUUID().toString();
            jc.i.d(string, "toString(...)");
        } else {
            string = str;
        }
        this.e = new j2.a(string, context.getCacheDir(), false);
    }

    public final h2.b c(boolean z4) {
        j2.a aVar = this.e;
        try {
            aVar.a((this.f5150f || getDatabaseName() == null) ? false : true);
            this.f5149d = false;
            SQLiteDatabase sQLiteDatabaseD = d(z4);
            if (!this.f5149d) {
                return n9.b.r(this.f5147b, sQLiteDatabaseD);
            }
            close();
            return c(z4);
        } finally {
            aVar.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        j2.a aVar = this.e;
        try {
            aVar.a(aVar.f5638a);
            super.close();
            this.f5147b.f3489b = null;
            this.f5150f = false;
        } finally {
            aVar.b();
        }
    }

    public final SQLiteDatabase d(boolean z4) throws Throwable {
        SQLiteDatabase readableDatabase;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z10 = this.f5150f;
        if (databaseName != null && !z10 && (parentFile = this.f5146a.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z4) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                jc.i.b(writableDatabase);
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase2 = getReadableDatabase();
            jc.i.b(readableDatabase2);
            return readableDatabase2;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z4) {
                    readableDatabase = getWritableDatabase();
                    jc.i.b(readableDatabase);
                } else {
                    readableDatabase = getReadableDatabase();
                    jc.i.b(readableDatabase);
                }
                return readableDatabase;
            } catch (Throwable th) {
                th = th;
                if (th instanceof f) {
                    f fVar = (f) th;
                    int iOrdinal = fVar.f5138a.ordinal();
                    th = fVar.f5139b;
                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        throw th;
                    }
                    if (iOrdinal != 4) {
                        throw new d1();
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        jc.i.e(sQLiteDatabase, "db");
        boolean z4 = this.f5149d;
        h2.c cVar = this.f5148c;
        if (!z4 && cVar.f4608a != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            cVar.g(n9.b.r(this.f5147b, sQLiteDatabase));
        } catch (Throwable th) {
            throw new f(g.f5140a, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        jc.i.e(sQLiteDatabase, "sqLiteDatabase");
        try {
            this.f5148c.h(n9.b.r(this.f5147b, sQLiteDatabase));
        } catch (Throwable th) {
            throw new f(g.f5141b, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
        jc.i.e(sQLiteDatabase, "db");
        this.f5149d = true;
        try {
            this.f5148c.i(n9.b.r(this.f5147b, sQLiteDatabase), i, i10);
        } catch (Throwable th) {
            throw new f(g.f5143d, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        jc.i.e(sQLiteDatabase, "db");
        if (!this.f5149d) {
            try {
                this.f5148c.j(n9.b.r(this.f5147b, sQLiteDatabase));
            } catch (Throwable th) {
                throw new f(g.e, th);
            }
        }
        this.f5150f = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
        jc.i.e(sQLiteDatabase, "sqLiteDatabase");
        this.f5149d = true;
        try {
            this.f5148c.k(n9.b.r(this.f5147b, sQLiteDatabase), i, i10);
        } catch (Throwable th) {
            throw new f(g.f5142c, th);
        }
    }
}
