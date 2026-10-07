package i3;

import android.content.Context;
import android.content.SharedPreferences;
import app.namso_gen.spacehowen.data.NotesDatabase;
import y1.s;
import y1.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SharedPreferences f5195a;

    public static SharedPreferences b() {
        SharedPreferences sharedPreferences = f5195a;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        throw new IllegalStateException("Prefs.init(context) no llamado");
    }

    public static String c() {
        String string = b().getString("proxy_host", "");
        return string == null ? "" : string;
    }

    public static String d() {
        String string = b().getString("proxy_user", "");
        return string == null ? "" : string;
    }

    public NotesDatabase a(Context context) {
        NotesDatabase notesDatabase;
        NotesDatabase notesDatabase2 = NotesDatabase.f1306m;
        if (notesDatabase2 != null) {
            return notesDatabase2;
        }
        synchronized (this) {
            notesDatabase = NotesDatabase.f1306m;
            if (notesDatabase == null) {
                Context applicationContext = context.getApplicationContext();
                jc.i.d(applicationContext, "getApplicationContext(...)");
                s sVarC = y1.c.c(applicationContext, NotesDatabase.class, "notes_db");
                sVarC.a(NotesDatabase.f1307n, NotesDatabase.f1308o, NotesDatabase.f1309p, NotesDatabase.f1310q);
                v vVarB = sVarC.b();
                NotesDatabase.f1306m = (NotesDatabase) vVarB;
                notesDatabase = (NotesDatabase) vVarB;
            }
        }
        return notesDatabase;
    }
}
