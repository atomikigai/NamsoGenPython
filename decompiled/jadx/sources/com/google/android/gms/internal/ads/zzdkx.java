package com.google.android.gms.internal.ads;

import e6.t;
import java.util.concurrent.Executor;
import r.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdkx implements zzcxg {
    private final zzdiy zza;
    private final zzdjd zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdkx(zzdiy zzdiyVar, zzdjd zzdjdVar, Executor executor, Executor executor2) {
        this.zza = zzdiyVar;
        this.zzb = zzdjdVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(final zzcfk zzcfkVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkv
            @Override // java.lang.Runnable
            public final void run() {
                zzcfkVar.zzd("onSdkImpression", new e(0));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzr() {
        if (this.zzb.zzd()) {
            zzdiy zzdiyVar = this.zza;
            zzeew zzeewVarZzu = zzdiyVar.zzu();
            if (zzeewVarZzu == null && zzdiyVar.zzw() != null && ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfk)).booleanValue()) {
                zzdiy zzdiyVar2 = this.zza;
                m9.a aVarZzw = zzdiyVar2.zzw();
                zzcao zzcaoVarZzp = zzdiyVar2.zzp();
                if (aVarZzw == null || zzcaoVarZzp == null) {
                    return;
                }
                zzgei.zzr(zzgei.zzl(aVarZzw, zzcaoVarZzp), new zzdkw(this), this.zzd);
                return;
            }
            if (zzeewVarZzu != null) {
                zzdiy zzdiyVar3 = this.zza;
                zzcfk zzcfkVarZzr = zzdiyVar3.zzr();
                zzcfk zzcfkVarZzs = zzdiyVar3.zzs();
                if (zzcfkVarZzr == null) {
                    zzcfkVarZzr = zzcfkVarZzs != null ? zzcfkVarZzs : null;
                }
                if (zzcfkVarZzr != null) {
                    zzb(zzcfkVarZzr);
                }
            }
        }
    }
}
