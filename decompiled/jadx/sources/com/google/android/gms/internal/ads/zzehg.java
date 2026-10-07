package com.google.android.gms.internal.ads;

import android.content.Context;
import e6.t;
import w5.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzehg implements zzdgv {
    private final zzfet zza;
    private final zzbrf zzb;
    private final b zzc;
    private zzcxe zzd = null;

    public zzehg(zzfet zzfetVar, zzbrf zzbrfVar, b bVar) {
        this.zza = zzfetVar;
        this.zzb = zzbrfVar;
        this.zzc = bVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zza(boolean z4, Context context, zzcwz zzcwzVar) throws zzdgu {
        boolean zZzs;
        try {
            int iOrdinal = this.zzc.ordinal();
            if (iOrdinal == 1) {
                zZzs = this.zzb.zzs(new q7.b(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zZzs = this.zzb.zzr(new q7.b(context));
                    }
                    throw new zzdgu("Adapter failed to show.");
                }
                zZzs = this.zzb.zzt(new q7.b(context));
            }
            if (zZzs) {
                if (this.zzd == null) {
                    return;
                }
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbC)).booleanValue() || this.zza.zzY != 2) {
                    return;
                }
                this.zzd.zza();
                return;
            }
            throw new zzdgu("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdgu(th);
        }
    }

    public final void zzb(zzcxe zzcxeVar) {
        this.zzd = zzcxeVar;
    }
}
