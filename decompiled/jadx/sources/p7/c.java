package p7;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f7824b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f7825a;

    static {
        c cVar = new c();
        cVar.f7825a = null;
        f7824b = cVar;
    }

    public static b a(Context context) {
        b bVar;
        c cVar = f7824b;
        synchronized (cVar) {
            try {
                if (cVar.f7825a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f7825a = new b(context);
                }
                bVar = cVar.f7825a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
