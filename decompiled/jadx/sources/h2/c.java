package h2;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4608a;

    public static void a(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z4 = false;
        while (i <= length) {
            boolean z10 = i.f(str.charAt(!z4 ? i : length), 32) <= 0;
            if (z4) {
                if (!z10) {
                    break;
                } else {
                    length--;
                }
            } else if (z10) {
                i++;
            } else {
                z4 = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract void h(i2.d dVar);

    public abstract void i(i2.d dVar, int i, int i10);

    public abstract void j(i2.d dVar);

    public abstract void k(i2.d dVar, int i, int i10);

    public void g(i2.d dVar) {
    }
}
