package o3;

import android.os.DeadObjectException;
import com.google.android.gms.internal.play_billing.zzam;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzie;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7521d;

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, int i) {
        this.f7518a = i;
        this.f7519b = obj;
        this.f7520c = obj2;
        this.f7521d = obj3;
    }

    private final Object a() {
        zzam zzamVar;
        b bVar = (b) this.f7519b;
        String str = (String) this.f7520c;
        String str2 = (String) this.f7521d;
        try {
            synchronized (bVar.f7470a) {
                zzamVar = bVar.i;
            }
            return zzamVar == null ? zzc.zzd(x.f7537j, zzie.SERVICE_RESET_TO_NULL) : zzamVar.zzf(3, bVar.f7475g.getPackageName(), str, str2, null);
        } catch (DeadObjectException e) {
            return zzc.zze(x.f7537j, zzie.LAUNCH_BILLING_FLOW_EXCEPTION, v.a(e));
        } catch (Exception e4) {
            return zzc.zze(x.h, zzie.LAUNCH_BILLING_FLOW_EXCEPTION, v.a(e4));
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0335 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x071b */
    /* JADX WARN: Code duplicated, block: B:109:0x0286  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:116:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:121:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:125:0x0324 A[LOOP:1: B:334:0x0199->B:125:0x0324, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:140:0x0352  */
    /* JADX WARN: Code duplicated, block: B:141:0x035e  */
    /* JADX WARN: Code duplicated, block: B:351:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x02de A[SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call() throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.q.call():java.lang.Object");
    }
}
