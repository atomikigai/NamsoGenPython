package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgxj extends zzgxm {
    private final int zzc;
    private final int zzd;

    public zzgxj(byte[] bArr, int i, int i10) {
        super(bArr);
        zzgxp.zzq(i, i + i10, bArr.length);
        this.zzc = i;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgxm, com.google.android.gms.internal.ads.zzgxp
    public final byte zza(int i) {
        zzgxp.zzy(i, this.zzd);
        return ((zzgxm) this).zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzgxm, com.google.android.gms.internal.ads.zzgxp
    public final byte zzb(int i) {
        return ((zzgxm) this).zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzgxm
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxm, com.google.android.gms.internal.ads.zzgxp
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxm, com.google.android.gms.internal.ads.zzgxp
    public final void zze(byte[] bArr, int i, int i10, int i11) {
        System.arraycopy(((zzgxm) this).zza, this.zzc + i, bArr, i10, i11);
    }
}
