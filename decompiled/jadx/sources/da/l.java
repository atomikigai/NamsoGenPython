package da;

import android.util.Log;
import com.google.android.gms.common.api.internal.h0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f3113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f3114b;

    public l(h0 h0Var, ia.b bVar) {
        this.f3113a = h0Var;
        this.f3114b = new k(bVar);
    }

    public final void a(mb.e eVar) {
        String str = "App Quality Sessions session changed: " + eVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        k kVar = this.f3114b;
        String str2 = eVar.f7098a;
        synchronized (kVar) {
            if (!Objects.equals(kVar.f3112c, str2)) {
                k.a(kVar.f3110a, kVar.f3111b, str2);
                kVar.f3112c = str2;
            }
        }
    }

    public final void b(String str) {
        k kVar = this.f3114b;
        synchronized (kVar) {
            if (!Objects.equals(kVar.f3111b, str)) {
                k.a(kVar.f3110a, str, kVar.f3112c);
                kVar.f3111b = str;
            }
        }
    }
}
