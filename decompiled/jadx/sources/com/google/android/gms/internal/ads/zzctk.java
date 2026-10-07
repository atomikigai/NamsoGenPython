package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import e6.o3;
import n7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzctk implements zzcya, e6.a, zzczj, zzcxg, zzcwm, zzdbv {
    private final n7.a zza;
    private final zzbzs zzb;

    public zzctk(n7.a aVar, zzbzs zzbzsVar) {
        this.zza = aVar;
        this.zzb = zzbzsVar;
    }

    @Override // e6.a
    public final void onAdClicked() {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zza() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdo(zzfff zzfffVar) {
        n7.a aVar = this.zza;
        zzbzs zzbzsVar = this.zzb;
        ((b) aVar).getClass();
        zzbzsVar.zzk(SystemClock.elapsedRealtime());
    }

    public final String zzg() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzi(zzbbs.zzb zzbVar) {
        this.zzb.zzi();
    }

    public final void zzk(o3 o3Var) {
        this.zzb.zzj(o3Var);
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzm(zzbbs.zzb zzbVar) {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzr() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzs() {
        this.zzb.zzh(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdn(zzbvx zzbvxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzj(zzbbs.zzb zzbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzl(boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzn(boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzds(zzbwj zzbwjVar, String str, String str2) {
    }
}
