package com.google.android.gms.internal.ads;

import d6.p;
import e6.t;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class zzcav {
    private final zzcao zza;
    private final AtomicInteger zzb;

    public zzcav() {
        zzcao zzcaoVar = new zzcao();
        this.zza = zzcaoVar;
        this.zzb = new AtomicInteger(0);
        zzgei.zzr(zzcaoVar, new zzcat(this), zzcaj.zzf);
    }

    @Deprecated
    public final int zze() {
        return this.zzb.get();
    }

    @Deprecated
    public final void zzg() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final void zzh(Throwable th, String str) {
        this.zza.zzd(th);
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzhq)).booleanValue()) {
            p.C.f2982g.zzv(th, str);
        }
    }

    @Deprecated
    public final void zzi(Object obj) {
        this.zza.zzc(obj);
    }

    @Deprecated
    public final void zzj(zzcas zzcasVar, zzcaq zzcaqVar) {
        zzgei.zzr(this.zza, new zzcau(this, zzcasVar, zzcaqVar), zzcaj.zzf);
    }
}
