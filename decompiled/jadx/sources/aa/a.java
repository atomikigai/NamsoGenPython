package aa;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import c3.j;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import fa.t0;
import java.util.HashMap;
import kb.h;
import l5.i;
import s5.f;
import s5.g;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements ya.a, Continuation, t5.b, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f258c;

    public /* synthetic */ a(Object obj, long j4, Object obj2) {
        this.f257b = obj;
        this.f256a = j4;
        this.f258c = obj2;
    }

    @Override // s5.g
    public Object apply(Object obj) {
        String str = (String) this.f257b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((o5.c) this.f258c).f7570a;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z4 = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j4 = this.f256a;
            if (z4) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j4 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j4));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // ya.a
    public void b(ya.b bVar) {
        ((b) bVar.get()).d((String) this.f257b, this.f256a, (t0) this.f258c);
    }

    @Override // t5.b
    public Object f() {
        j jVar = (j) this.f257b;
        i iVar = (i) this.f258c;
        s5.d dVar = (s5.d) jVar.f1761c;
        long jD = ((u5.a) jVar.f1764g).d() + this.f256a;
        s5.i iVar2 = (s5.i) dVar;
        iVar2.getClass();
        iVar2.g(new f(jD, iVar));
        return null;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((h) this.f257b).b(task, this.f256a, (HashMap) this.f258c);
    }

    public /* synthetic */ a(Object obj, Object obj2, long j4) {
        this.f257b = obj;
        this.f258c = obj2;
        this.f256a = j4;
    }
}
