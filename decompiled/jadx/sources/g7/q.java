package g7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.f0;
import com.google.android.gms.common.internal.g0;
import com.google.android.gms.common.internal.h0;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f4263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f4264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile h0 f4265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f4266d;
    public static Context e;

    static {
        new m(n.y("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), 0);
        new m(n.y("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), 1);
        f4263a = new m(n.y("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), 2);
        f4264b = new m(n.y("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), 3);
        f4266d = new Object();
    }

    public static v a(String str, o oVar, boolean z4, boolean z10) {
        try {
            b();
            i0.i(e);
            t tVar = new t(str, oVar, z4, z10);
            try {
                h0 h0Var = f4265c;
                q7.b bVar = new q7.b(e.getPackageManager());
                f0 f0Var = (f0) h0Var;
                Parcel parcelZza = f0Var.zza();
                zzc.zzc(parcelZza, tVar);
                zzc.zze(parcelZza, bVar);
                Parcel parcelZzB = f0Var.zzB(5, parcelZza);
                boolean zZzf = zzc.zzf(parcelZzB);
                parcelZzB.recycle();
                return zZzf ? v.f4280d : new u(new l(z4, str, oVar));
            } catch (RemoteException e4) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
                return new v(false, "module call", e4);
            }
        } catch (r7.b e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            return new v(false, "module init: ".concat(String.valueOf(e10.getMessage())), e10);
        }
    }

    public static void b() {
        h0 f0Var;
        if (f4265c != null) {
            return;
        }
        i0.i(e);
        synchronized (f4266d) {
            try {
                if (f4265c == null) {
                    IBinder iBinderB = r7.f.c(e, r7.f.f8201d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = g0.f2190a;
                    if (iBinderB == null) {
                        f0Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        f0Var = iInterfaceQueryLocalInterface instanceof h0 ? (h0) iInterfaceQueryLocalInterface : new f0(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    }
                    f4265c = f0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
