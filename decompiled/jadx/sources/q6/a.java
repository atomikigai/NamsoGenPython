package q6;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzbtx;
import da.a0;
import e6.t;
import w5.g;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f8042a;

    public a(a0 a0Var) {
        this.f8042a = a0Var;
    }

    public static void a(Context context, g gVar, b bVar) {
        zzbcn.zza(context);
        if (((Boolean) zzbel.zzj.zze()).booleanValue()) {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkP)).booleanValue()) {
                i6.b.f5218b.execute(new b3.b(context, gVar, bVar, 16, false));
                return;
            }
        }
        new zzbtx(context, w5.b.BANNER, gVar.f9647a, null).zzb(bVar);
    }
}
