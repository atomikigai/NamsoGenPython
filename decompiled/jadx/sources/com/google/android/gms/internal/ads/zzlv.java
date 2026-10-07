package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzlv implements zzkp {
    private boolean zza;
    private long zzb;
    private long zzc;
    private zzbj zzd = zzbj.zza;

    public zzlv(zzdc zzdcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final long zza() {
        long j4 = this.zzb;
        if (!this.zza) {
            return j4;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
        zzbj zzbjVar = this.zzd;
        return (zzbjVar.zzb == 1.0f ? zzen.zzs(jElapsedRealtime) : zzbjVar.zza(jElapsedRealtime)) + j4;
    }

    public final void zzb(long j4) {
        this.zzb = j4;
        if (this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final zzbj zzc() {
        return this.zzd;
    }

    public final void zzd() {
        if (this.zza) {
            return;
        }
        this.zzc = SystemClock.elapsedRealtime();
        this.zza = true;
    }

    public final void zze() {
        if (this.zza) {
            zzb(zza());
            this.zza = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zzg(zzbj zzbjVar) {
        if (this.zza) {
            zzb(zza());
        }
        this.zzd = zzbjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final /* synthetic */ boolean zzj() {
        return false;
    }
}
