package da;

import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f3109d = new i(0);
    public static final j e = new j(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia.b f3110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3111b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3112c = null;

    public k(ia.b bVar) {
        this.f3110a = bVar;
    }

    public static void a(ia.b bVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            bVar.b(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e4) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e4);
        }
    }
}
