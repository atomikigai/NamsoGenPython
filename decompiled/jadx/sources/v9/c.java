package v9;

import android.net.Uri;
import com.google.android.gms.internal.p002firebaseauthapi.zzap;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzap f9227d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9230c;

    static {
        HashMap map = new HashMap();
        map.put("recoverEmail", 2);
        map.put("resetPassword", 0);
        map.put("signIn", 4);
        map.put("verifyEmail", 1);
        map.put("verifyBeforeChangeEmail", 5);
        map.put("revertSecondFactorAddition", 6);
        f9227d = zzap.zzc(map.entrySet());
    }

    public c(String str) {
        String strA = a(str, "apiKey");
        String strA2 = a(str, "oobCode");
        String strA3 = a(str, "mode");
        if (strA == null || strA2 == null || strA3 == null) {
            throw new IllegalArgumentException("apiKey, oobCode and mode are required in a valid action code URL");
        }
        com.google.android.gms.common.internal.i0.e(strA);
        com.google.android.gms.common.internal.i0.e(strA2);
        this.f9228a = strA2;
        com.google.android.gms.common.internal.i0.e(strA3);
        this.f9229b = strA3;
        a(str, "continueUrl");
        a(str, "languageCode");
        this.f9230c = a(str, "tenantId");
    }

    public static String a(String str, String str2) {
        Uri uri = Uri.parse(str);
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return uri.getQueryParameter(str2);
            }
            if (!queryParameterNames.contains("link")) {
                return null;
            }
            String queryParameter = uri.getQueryParameter("link");
            com.google.android.gms.common.internal.i0.e(queryParameter);
            return Uri.parse(queryParameter).getQueryParameter(str2);
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }
}
