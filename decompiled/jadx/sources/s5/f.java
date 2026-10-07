package s5;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f8434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l5.i f8435b;

    public /* synthetic */ f(long j4, l5.i iVar) {
        this.f8434a = j4;
        this.f8435b = iVar;
    }

    @Override // s5.g
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f8434a));
        l5.i iVar = this.f8435b;
        String str = iVar.f6822a;
        i5.c cVar = iVar.f6824c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(v5.a.a(cVar))}) < 1) {
            contentValues.put("backend_name", iVar.f6822a);
            contentValues.put("priority", Integer.valueOf(v5.a.a(cVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
