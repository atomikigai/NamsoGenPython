package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzk {
    private int zza;
    private int zzb;
    private int zzc;
    private byte[] zzd;
    private int zze;
    private int zzf;

    public zzk() {
        this.zza = -1;
        this.zzb = -1;
        this.zzc = -1;
        this.zze = -1;
        this.zzf = -1;
    }

    public final zzk zza(int i) {
        this.zzf = i;
        return this;
    }

    public final zzk zzb(int i) {
        this.zzb = i;
        return this;
    }

    public final zzk zzc(int i) {
        this.zza = i;
        return this;
    }

    public final zzk zzd(int i) {
        this.zzc = i;
        return this;
    }

    public final zzk zze(byte[] bArr) {
        this.zzd = bArr;
        return this;
    }

    public final zzk zzf(int i) {
        this.zze = i;
        return this;
    }

    public final zzm zzg() {
        return new zzm(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, null);
    }

    public /* synthetic */ zzk(zzm zzmVar, zzl zzlVar) {
        this.zza = zzmVar.zzb;
        this.zzb = zzmVar.zzc;
        this.zzc = zzmVar.zzd;
        this.zzd = zzmVar.zze;
        this.zze = zzmVar.zzf;
        this.zzf = zzmVar.zzg;
    }
}
