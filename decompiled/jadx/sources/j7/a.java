package j7;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5703c;

    public a(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            string = sb2.toString();
        }
        this.f5702b = string;
        this.f5701a = str;
        int length = str.length();
        Object[] objArr = {str, 23};
        if (!(length <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.f5701a, i)) {
            i++;
        }
        this.f5703c = i;
    }

    public final void a(String str, Object... objArr) {
        if (this.f5703c <= 3) {
            Log.d(this.f5701a, d(str, objArr));
        }
    }

    public final void b(String str, Exception exc, Object... objArr) {
        Log.e(this.f5701a, d(str, objArr), exc);
    }

    public final void c(String str, Object... objArr) {
        Log.e(this.f5701a, d(str, objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f5702b.concat(str);
    }

    public final void e(String str, Object... objArr) {
        if (this.f5703c <= 2) {
            Log.v(this.f5701a, d(str, objArr));
        }
    }

    public final void f(String str, Object... objArr) {
        Log.w(this.f5701a, d(str, objArr));
    }
}
