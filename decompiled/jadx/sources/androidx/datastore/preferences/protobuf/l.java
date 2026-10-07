package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile l f665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f666b;

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        l lVar = new l();
        Map map = Collections.EMPTY_MAP;
        f666b = lVar;
    }

    public static l a() {
        l lVar;
        l lVar2 = f665a;
        if (lVar2 != null) {
            return lVar2;
        }
        synchronized (l.class) {
            try {
                lVar = f665a;
                if (lVar == null) {
                    Class cls = k.f661a;
                    if (cls != null) {
                        try {
                            lVar = (l) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                            lVar = f666b;
                        }
                    } else {
                        lVar = f666b;
                    }
                    f665a = lVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }
}
