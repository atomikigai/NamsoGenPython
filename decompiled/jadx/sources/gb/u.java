package gb;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f4505d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4508c;

    public u(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f4505d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(da.v.i("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f4506a = strSubstring;
        this.f4507b = str;
        this.f4508c = da.v.u(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f4506a.equals(uVar.f4506a) && this.f4507b.equals(uVar.f4507b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4507b, this.f4506a});
    }
}
