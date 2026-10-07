package j6;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzbml;
import com.google.android.gms.internal.ads.zzbpc;
import d3.p;
import e6.m0;
import e6.s;
import e6.t;
import i6.h;
import w5.g;
import w5.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static boolean isAdAvailable(Context context, String str) {
        try {
            return s.f3427f.f3429b.f(context.getApplicationContext(), new zzbpc()).zzk(str);
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
            return false;
        }
    }

    public static void load(Context context, String str, g gVar, b bVar) {
        i0.j(context, "Context cannot be null.");
        i0.j(str, "AdUnitId cannot be null.");
        i0.j(gVar, "AdRequest cannot be null.");
        i0.j(bVar, "LoadCallback cannot be null.");
        i0.d("#008 Must be called on the main UI thread.");
        zzbcn.zza(context);
        if (((Boolean) zzbel.zzi.zze()).booleanValue()) {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkP)).booleanValue()) {
                i6.b.f5218b.execute(new p(context, str, gVar, bVar, 1, false));
                return;
            }
        }
        new zzbml(context, str).zza(gVar.f9647a, bVar);
    }

    public static a pollAd(Context context, String str) {
        try {
            m0 m0VarZzf = s.f3427f.f3429b.f(context.getApplicationContext(), new zzbpc()).zzf(str);
            if (m0VarZzf != null) {
                return new zzbml(context, str, m0VarZzf);
            }
            h.i("Failed to obtain an Interstitial Ad from the preloader.", null);
            return null;
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
            return null;
        }
    }

    public abstract w5.t getResponseInfo();

    public abstract void setFullScreenContentCallback(k kVar);

    public abstract void setImmersiveMode(boolean z4);

    public abstract void show(Activity activity);
}
