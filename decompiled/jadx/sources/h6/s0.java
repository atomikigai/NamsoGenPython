package h6;

import android.os.Process;
import android.webkit.CookieManager;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class s0 extends a {
    public final CookieManager h() {
        d6.p pVar = d6.p.C;
        r0 r0Var = pVar.f2979c;
        int iMyUid = Process.myUid();
        if (iMyUid != 0 && iMyUid != 1000) {
            try {
                return CookieManager.getInstance();
            } catch (Throwable th) {
                i6.h.e("Failed to obtain CookieManager.", th);
                pVar.f2982g.zzv(th, "ApiLevelUtil.getCookieManager");
            }
        }
        return null;
    }
}
