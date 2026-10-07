package t2;

import android.content.Context;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements r7.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static m f8550b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8551a;

    public /* synthetic */ m(int i) {
        this.f8551a = i;
    }

    public static synchronized m d() {
        try {
            if (f8550b == null) {
                f8550b = new m(3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8550b;
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public void a(String str, String str2, Throwable... thArr) {
        if (this.f8551a <= 3) {
            if (thArr.length >= 1) {
                Log.d(str, str2, thArr[0]);
            } else {
                Log.d(str, str2);
            }
        }
    }

    public void b(String str, String str2, Throwable... thArr) {
        if (this.f8551a <= 6) {
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }
    }

    @Override // r7.c
    public int c(Context context, String str, boolean z4) {
        return 0;
    }

    public void e(String str, String str2, Throwable... thArr) {
        if (this.f8551a <= 4) {
            if (thArr.length >= 1) {
                Log.i(str, str2, thArr[0]);
            } else {
                Log.i(str, str2);
            }
        }
    }

    @Override // r7.c
    public int g(Context context, String str) {
        return this.f8551a;
    }

    public void h(String str, String str2, Throwable... thArr) {
        if (this.f8551a <= 5) {
            if (thArr.length >= 1) {
                Log.w(str, str2, thArr[0]);
            } else {
                Log.w(str, str2);
            }
        }
    }
}
