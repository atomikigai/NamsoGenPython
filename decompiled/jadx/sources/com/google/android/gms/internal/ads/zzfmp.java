package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.ClientApi;
import e6.h3;
import e6.s0;
import e6.t;
import java.util.concurrent.ScheduledExecutorService;
import w5.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfmp {
    private final Context zza;
    private final i6.a zzb;
    private final ScheduledExecutorService zzc;
    private final ClientApi zzd = new ClientApi();
    private zzbpg zze;
    private final n7.a zzf;

    public zzfmp(Context context, i6.a aVar, ScheduledExecutorService scheduledExecutorService, n7.a aVar2) {
        this.zza = context;
        this.zzb = aVar;
        this.zzc = scheduledExecutorService;
        this.zzf = aVar2;
    }

    private static zzflx zzc() {
        zzbce zzbceVar = zzbcn.zzu;
        t tVar = t.f3437d;
        return new zzflx(((Long) tVar.f3440c.zza(zzbceVar)).longValue(), 2.0d, ((Long) tVar.f3440c.zza(zzbcn.zzv)).longValue(), 0.2d);
    }

    public final zzfmo zza(h3 h3Var, s0 s0Var) {
        b bVarA = b.a(h3Var.f3319b);
        if (bVarA == null) {
            return null;
        }
        int iOrdinal = bVarA.ordinal();
        if (iOrdinal == 1) {
            return new zzflz(this.zzd, this.zza, this.zzb.f5215c, this.zze, h3Var, s0Var, this.zzc, zzc(), this.zzf);
        }
        if (iOrdinal == 2) {
            return new zzfms(this.zzd, this.zza, this.zzb.f5215c, this.zze, h3Var, s0Var, this.zzc, zzc(), this.zzf);
        }
        if (iOrdinal != 5) {
            return null;
        }
        return new zzflw(this.zzd, this.zza, this.zzb.f5215c, this.zze, h3Var, s0Var, this.zzc, zzc(), this.zzf);
    }

    public final void zzb(zzbpg zzbpgVar) {
        this.zze = zzbpgVar;
    }
}
