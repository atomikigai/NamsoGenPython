package y5;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.ads.zzbab;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzbpc;
import com.google.android.gms.internal.ads.zzbuj;
import d3.p;
import e6.s;
import e6.t;
import i6.h;
import w5.g;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final int APP_OPEN_AD_ORIENTATION_LANDSCAPE = 2;
    public static final int APP_OPEN_AD_ORIENTATION_PORTRAIT = 1;

    public static boolean isAdAvailable(Context context, String str) {
        try {
            return s.f3427f.f3429b.f(context.getApplicationContext(), new zzbpc()).zzj(str);
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
            return false;
        }
    }

    @Deprecated
    public static void load(final Context context, final String str, final g gVar, final int i, final a aVar) {
        i0.j(context, "Context cannot be null.");
        i0.j(str, "adUnitId cannot be null.");
        i0.j(gVar, "AdRequest cannot be null.");
        i0.d("#008 Must be called on the main UI thread.");
        zzbcn.zza(context);
        if (((Boolean) zzbel.zzd.zze()).booleanValue()) {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkP)).booleanValue()) {
                i6.b.f5218b.execute(new Runnable() { // from class: y5.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        int i10 = i;
                        String str2 = str;
                        g gVar2 = gVar;
                        try {
                            new zzban(context2, str2, gVar2.f9647a, i10, aVar).zza();
                        } catch (IllegalStateException e) {
                            zzbuj.zza(context2).zzh(e, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzban(context, str, gVar.f9647a, i, aVar).zza();
    }

    public static b pollAd(Context context, String str) {
        try {
            zzbaf zzbafVarZze = s.f3427f.f3429b.f(context.getApplicationContext(), new zzbpc()).zze(str);
            if (zzbafVarZze != null) {
                return new zzbab(zzbafVarZze, str);
            }
            h.i("Failed to obtain an App Open ad from the preloader.", null);
            return null;
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
            return null;
        }
    }

    public abstract w5.t getResponseInfo();

    public abstract void show(Activity activity);

    public static void load(Context context, String str, g gVar, a aVar) {
        i0.j(context, "Context cannot be null.");
        i0.j(str, "adUnitId cannot be null.");
        i0.j(gVar, "AdRequest cannot be null.");
        i0.d("#008 Must be called on the main UI thread.");
        zzbcn.zza(context);
        if (((Boolean) zzbel.zzd.zze()).booleanValue()) {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkP)).booleanValue()) {
                i6.b.f5218b.execute(new p(context, str, gVar, aVar, 6, false));
                return;
            }
        }
        new zzban(context, str, gVar.f9647a, 3, aVar).zza();
    }

    @Deprecated
    public static void load(Context context, String str, x5.a aVar, int i, a aVar2) {
        i0.j(context, "Context cannot be null.");
        i0.j(str, "adUnitId cannot be null.");
        i0.j(aVar, "AdManagerAdRequest cannot be null.");
        throw null;
    }
}
