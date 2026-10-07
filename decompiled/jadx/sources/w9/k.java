package w9;

import com.google.android.gms.internal.p002firebaseauthapi.zzzr;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j7.a f9846a = new j7.a("GetTokenResultFactory", new String[0]);

    public static v9.o a(String str) {
        Map map;
        try {
            map = l.b(str);
        } catch (zzzr e) {
            f9846a.b("Error parsing token claims", e, new Object[0]);
            map = new HashMap();
        }
        v9.o oVar = new v9.o();
        oVar.f9272a = str;
        oVar.f9273b = map;
        return oVar;
    }
}
