package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzzp {
    private final Context zza;
    private final zzaap zzb;
    private zzcf zzc;
    private zzbq zzd;
    private zzdc zze = zzdc.zza;
    private boolean zzf;

    public zzzp(Context context, zzaap zzaapVar) {
        this.zza = context.getApplicationContext();
        this.zzb = zzaapVar;
    }

    public final zzzp zzd(zzdc zzdcVar) {
        this.zze = zzdcVar;
        return this;
    }

    public final zzaaa zze() {
        zzdb.zzf(!this.zzf);
        zzzz zzzzVar = null;
        if (this.zzd == null) {
            if (this.zzc == null) {
                this.zzc = new zzzt(null);
            }
            this.zzd = new zzzu(this.zzc);
        }
        zzaaa zzaaaVar = new zzaaa(this, zzzzVar);
        this.zzf = true;
        return zzaaaVar;
    }
}
