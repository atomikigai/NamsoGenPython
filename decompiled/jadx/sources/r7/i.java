package r7;

import android.content.Context;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements e, u5.a, v1.e {
    @Override // u5.a
    public long d() {
        return SystemClock.elapsedRealtime();
    }

    @Override // r7.e
    public d k(Context context, String str, c cVar) {
        d dVar = new d();
        int iC = cVar.c(context, str, true);
        dVar.f8197b = iC;
        if (iC != 0) {
            dVar.f8198c = 1;
            return dVar;
        }
        int iG = cVar.g(context, str);
        dVar.f8196a = iG;
        if (iG != 0) {
            dVar.f8198c = -1;
        }
        return dVar;
    }

    @Override // v1.e
    public void e() {
    }

    @Override // v1.e
    public void f(int i, Object obj) {
    }
}
