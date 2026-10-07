package com.google.android.gms.internal.ads;

import android.os.Bundle;
import e6.t;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeoj implements zzevz {
    private final m9.a zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    public zzeoj(m9.a aVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = aVar;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        m9.a aVarZzn = zzgei.zzn(this.zza, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzeof
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                final String str = (String) obj;
                return zzgei.zzh(new zzevy() { // from class: com.google.android.gms.internal.ads.zzeoe
                    @Override // com.google.android.gms.internal.ads.zzevy
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putString("ms", str);
                    }
                });
            }
        }, this.zzb);
        zzbce zzbceVar = zzbcn.zzmg;
        t tVar = t.f3437d;
        if (((Integer) tVar.f3440c.zza(zzbceVar)).intValue() > 0) {
            aVarZzn = zzgei.zzo(aVarZzn, ((Integer) tVar.f3440c.zza(zzbceVar)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgei.zzf(aVarZzn, Throwable.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzeog
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return ((Throwable) obj) instanceof TimeoutException ? zzgei.zzh(new zzevy() { // from class: com.google.android.gms.internal.ads.zzeoh
                    @Override // com.google.android.gms.internal.ads.zzevy
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putString("ms", Integer.toString(17));
                    }
                }) : zzgei.zzh(new zzevy() { // from class: com.google.android.gms.internal.ads.zzeoi
                    @Override // com.google.android.gms.internal.ads.zzevy
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putString("ms", null);
                    }
                });
            }
        }, this.zzb);
    }
}
