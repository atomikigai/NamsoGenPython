package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzuj implements zzup, zzuo {
    public final zzur zza;
    private final long zzb;
    private zzut zzc;
    private zzup zzd;
    private zzuo zze;
    private long zzf = -9223372036854775807L;
    private final zzys zzg;

    public zzuj(zzur zzurVar, zzys zzysVar, long j4) {
        this.zza = zzurVar;
        this.zzg = zzysVar;
        this.zzb = j4;
    }

    private final long zzv(long j4) {
        long j10 = this.zzf;
        return j10 != -9223372036854775807L ? j10 : j4;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zza(long j4, zzls zzlsVar) {
        zzup zzupVar = this.zzd;
        int i = zzen.zza;
        return zzupVar.zza(j4, zzlsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final long zzb() {
        zzup zzupVar = this.zzd;
        int i = zzen.zza;
        return zzupVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final long zzc() {
        zzup zzupVar = this.zzd;
        int i = zzen.zza;
        return zzupVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zzd() {
        zzup zzupVar = this.zzd;
        int i = zzen.zza;
        return zzupVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zze(long j4) {
        zzup zzupVar = this.zzd;
        int i = zzen.zza;
        return zzupVar.zze(j4);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zzf(zzyd[] zzydVarArr, boolean[] zArr, zzwg[] zzwgVarArr, boolean[] zArr2, long j4) {
        long j10 = this.zzf;
        long j11 = (j10 == -9223372036854775807L || j4 != this.zzb) ? j4 : j10;
        this.zzf = -9223372036854775807L;
        zzup zzupVar = this.zzd;
        int i = zzen.zza;
        return zzupVar.zzf(zzydVarArr, zArr, zzwgVarArr, zArr2, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final /* bridge */ /* synthetic */ void zzg(zzwi zzwiVar) {
        zzuo zzuoVar = this.zze;
        int i = zzen.zza;
        zzuoVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final zzwr zzh() {
        zzup zzupVar = this.zzd;
        int i = zzen.zza;
        return zzupVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzi(zzup zzupVar) {
        zzuo zzuoVar = this.zze;
        int i = zzen.zza;
        zzuoVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzj(long j4, boolean z4) {
        zzup zzupVar = this.zzd;
        int i = zzen.zza;
        zzupVar.zzj(j4, false);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzk() throws IOException {
        zzup zzupVar = this.zzd;
        if (zzupVar != null) {
            zzupVar.zzk();
            return;
        }
        zzut zzutVar = this.zzc;
        if (zzutVar != null) {
            zzutVar.zzz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzl(zzuo zzuoVar, long j4) {
        this.zze = zzuoVar;
        zzup zzupVar = this.zzd;
        if (zzupVar != null) {
            zzupVar.zzl(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final void zzm(long j4) {
        zzup zzupVar = this.zzd;
        int i = zzen.zza;
        zzupVar.zzm(j4);
    }

    public final long zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final boolean zzo(zzko zzkoVar) {
        zzup zzupVar = this.zzd;
        return zzupVar != null && zzupVar.zzo(zzkoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final boolean zzp() {
        zzup zzupVar = this.zzd;
        return zzupVar != null && zzupVar.zzp();
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzur zzurVar) {
        long jZzv = zzv(this.zzb);
        zzut zzutVar = this.zzc;
        zzutVar.getClass();
        zzup zzupVarZzI = zzutVar.zzI(zzurVar, this.zzg, jZzv);
        this.zzd = zzupVarZzI;
        if (this.zze != null) {
            zzupVarZzI.zzl(this, jZzv);
        }
    }

    public final void zzs(long j4) {
        this.zzf = j4;
    }

    public final void zzt() {
        zzup zzupVar = this.zzd;
        if (zzupVar != null) {
            zzut zzutVar = this.zzc;
            zzutVar.getClass();
            zzutVar.zzG(zzupVar);
        }
    }

    public final void zzu(zzut zzutVar) {
        zzdb.zzf(this.zzc == null);
        this.zzc = zzutVar;
    }
}
