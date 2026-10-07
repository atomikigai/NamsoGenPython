package r6;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzbxl;
import d3.p;
import e6.t;
import i6.h;
import w5.g;
import w5.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static boolean isAdAvailable(Context context, String str) {
        i0.j(context, "Context cannot be null.");
        i0.j(str, "AdUnitId cannot be null.");
        return new zzbxl(context, str).zzc();
    }

    public static void load(Context context, String str, g gVar, d dVar) {
        i0.j(context, "Context cannot be null.");
        i0.j(str, "AdUnitId cannot be null.");
        i0.j(gVar, "AdRequest cannot be null.");
        i0.j(dVar, "LoadCallback cannot be null.");
        i0.d("#008 Must be called on the main UI thread.");
        zzbcn.zza(context);
        if (((Boolean) zzbel.zzk.zze()).booleanValue()) {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkP)).booleanValue()) {
                i6.b.f5218b.execute(new p(context, str, gVar, dVar, 4, false));
                return;
            }
        }
        h.b("Loading on UI thread");
        new zzbxl(context, str).zzb(gVar.f9647a, dVar);
    }

    public static c pollAd(Context context, String str) {
        i0.j(context, "Context cannot be null.");
        i0.j(str, "AdUnitId cannot be null.");
        return new zzbxl(context, str).zza();
    }

    public abstract w5.t getResponseInfo();

    public abstract void show(Activity activity, q qVar);

    public static void load(Context context, String str, x5.a aVar, d dVar) {
        i0.j(context, "Context cannot be null.");
        i0.j(str, "AdUnitId cannot be null.");
        i0.j(aVar, "AdManagerAdRequest cannot be null.");
        throw null;
    }
}
