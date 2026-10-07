package q3;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f8026a = Log.isLoggable("Volley", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f8027b = q.class.getName();

    public static String a(String str, Object... objArr) {
        String string;
        String str2 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClassName().equals(f8027b)) {
                String className = stackTrace[i].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                StringBuilder sbC = u.e.c(strSubstring.substring(strSubstring.lastIndexOf(36) + 1), ".");
                sbC.append(stackTrace[i].getMethodName());
                string = sbC.toString();
                Locale locale = Locale.US;
                long id2 = Thread.currentThread().getId();
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(id2);
                sb2.append("] ");
                sb2.append(string);
                return q1.a.m(sb2, ": ", str2);
            }
        }
        string = "<unknown>";
        Locale locale2 = Locale.US;
        long id3 = Thread.currentThread().getId();
        StringBuilder sb3 = new StringBuilder("[");
        sb3.append(id3);
        sb3.append("] ");
        sb3.append(string);
        return q1.a.m(sb3, ": ", str2);
    }

    public static void b(String str, Object... objArr) {
        Log.d("Volley", a(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e("Volley", a(str, objArr));
    }

    public static void d(String str, Object... objArr) {
        if (f8026a) {
            Log.v("Volley", a(str, objArr));
        }
    }
}
