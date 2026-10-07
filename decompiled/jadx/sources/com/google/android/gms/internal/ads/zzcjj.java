package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcjj {
    private zzchn zza;
    private zzcke zzb;
    private zzfjv zzc;
    private zzckr zzd;
    private zzfgr zze;

    private zzcjj() {
        throw null;
    }

    public final zzchk zza() {
        zzhgf.zzc(this.zza, zzchn.class);
        zzhgf.zzc(this.zzb, zzcke.class);
        if (this.zzc == null) {
            this.zzc = new zzfjv();
        }
        if (this.zzd == null) {
            this.zzd = new zzckr();
        }
        if (this.zze == null) {
            this.zze = new zzfgr();
        }
        return new zzciy(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
    }

    public final zzcjj zzb(zzchn zzchnVar) {
        this.zza = zzchnVar;
        return this;
    }

    public final zzcjj zzc(zzcke zzckeVar) {
        this.zzb = zzckeVar;
        return this;
    }

    public /* synthetic */ zzcjj(zzckd zzckdVar) {
    }
}
