package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzqk {
    private final Context zza;
    private final zzop zzb;
    private boolean zzc;
    private final zzqj zzd;
    private zzqm zze;
    private zzqc zzf;

    @Deprecated
    public zzqk() {
        this.zza = null;
        this.zzb = zzop.zza;
        this.zzd = zzqj.zza;
    }

    public final zzqw zzc() {
        zzdb.zzf(!this.zzc);
        this.zzc = true;
        if (this.zze == null) {
            this.zze = new zzqm(new zzcm[0]);
        }
        if (this.zzf == null) {
            this.zzf = new zzqc(this.zza);
        }
        return new zzqw(this, null);
    }

    public zzqk(Context context) {
        this.zza = context;
        this.zzb = zzop.zza;
        this.zzd = zzqj.zza;
    }
}
