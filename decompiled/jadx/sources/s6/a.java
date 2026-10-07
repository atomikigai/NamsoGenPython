package s6;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzbxw;
import d3.p;
import e6.t;
import w5.g;
import w5.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void load(Context context, String str, g gVar, b bVar) {
        i0.j(context, "Context cannot be null.");
        i0.j(str, "AdUnitId cannot be null.");
        i0.j(gVar, "AdRequest cannot be null.");
        i0.j(bVar, "LoadCallback cannot be null.");
        i0.d("#008 Must be called on the main UI thread.");
        zzbcn.zza(context);
        if (((Boolean) zzbel.zzk.zze()).booleanValue()) {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkP)).booleanValue()) {
                i6.b.f5218b.execute(new p(context, str, gVar, bVar, 5, false));
                return;
            }
        }
        new zzbxw(context, str).zza(gVar.f9647a, bVar);
    }

    public abstract w5.t getResponseInfo();

    public abstract void show(Activity activity, q qVar);

    public static void load(Context context, String str, x5.a aVar, b bVar) {
        i0.j(context, "Context cannot be null.");
        i0.j(str, "AdUnitId cannot be null.");
        i0.j(aVar, "AdManagerAdRequest cannot be null.");
        throw null;
    }
}
