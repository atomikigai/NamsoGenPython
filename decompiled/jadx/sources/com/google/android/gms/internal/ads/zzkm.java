package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzkm {
    private long zza;
    private float zzb;
    private long zzc;

    public zzkm() {
        this.zza = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = -9223372036854775807L;
    }

    public final zzkm zzd(long j4) {
        boolean z4 = true;
        if (j4 < 0) {
            if (j4 == -9223372036854775807L) {
                j4 = -9223372036854775807L;
            } else {
                z4 = false;
            }
        }
        zzdb.zzd(z4);
        this.zzc = j4;
        return this;
    }

    public final zzkm zze(long j4) {
        this.zza = j4;
        return this;
    }

    public final zzkm zzf(float f10) {
        boolean z4 = true;
        if (f10 <= 0.0f && f10 != -3.4028235E38f) {
            z4 = false;
        }
        zzdb.zzd(z4);
        this.zzb = f10;
        return this;
    }

    public final zzko zzg() {
        return new zzko(this, null);
    }

    public /* synthetic */ zzkm(zzko zzkoVar, zzkn zzknVar) {
        this.zza = zzkoVar.zza;
        this.zzb = zzkoVar.zzb;
        this.zzc = zzkoVar.zzc;
    }
}
