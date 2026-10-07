package g6;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import d6.p;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4217a;

    public k(long j4) {
        this.f4217a = j4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (AdOverlayInfoParcel.K.remove(Long.valueOf(this.f4217a)) == null) {
            return null;
        }
        p.C.f2982g.zzw(new Exception("Key was non-null in AdOverlayObjectsCleanupTask"), "AdOverlayObjectsCleanupTask");
        return null;
    }
}
