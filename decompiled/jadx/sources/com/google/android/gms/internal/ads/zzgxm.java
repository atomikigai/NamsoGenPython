package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
class zzgxm extends zzgxl {
    protected final byte[] zza;

    public zzgxm(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgxp) || zzd() != ((zzgxp) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgxm)) {
            return obj.equals(this);
        }
        zzgxm zzgxmVar = (zzgxm) obj;
        int iZzr = zzr();
        int iZzr2 = zzgxmVar.zzr();
        if (iZzr == 0 || iZzr2 == 0 || iZzr == iZzr2) {
            return zzg(zzgxmVar, 0, zzd());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public void zze(byte[] bArr, int i, int i10, int i11) {
        System.arraycopy(this.zza, i, bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final boolean zzg(zzgxp zzgxpVar, int i, int i10) {
        if (i10 > zzgxpVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + i10 + zzd());
        }
        int i11 = i + i10;
        if (i11 > zzgxpVar.zzd()) {
            int iZzd = zzgxpVar.zzd();
            StringBuilder sbD = b.d(i, i10, "Ran off end of other: ", ", ", ", ");
            sbD.append(iZzd);
            throw new IllegalArgumentException(sbD.toString());
        }
        if (!(zzgxpVar instanceof zzgxm)) {
            return zzgxpVar.zzk(i, i11).equals(zzk(0, i10));
        }
        zzgxm zzgxmVar = (zzgxm) zzgxpVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzgxmVar.zza;
        int iZzc = zzc() + i10;
        int iZzc2 = zzc();
        int iZzc3 = zzgxmVar.zzc() + i;
        while (iZzc2 < iZzc) {
            if (bArr[iZzc2] != bArr2[iZzc3]) {
                return false;
            }
            iZzc2++;
            iZzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final int zzi(int i, int i10, int i11) {
        return zzgzk.zzb(i, this.zza, zzc() + i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final int zzj(int i, int i10, int i11) {
        int iZzc = zzc() + i10;
        return zzhbz.zzf(i, this.zza, iZzc, i11 + iZzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final zzgxp zzk(int i, int i10) {
        int iZzq = zzgxp.zzq(i, i10, zzd());
        return iZzq == 0 ? zzgxp.zzb : new zzgxj(this.zza, zzc() + i, iZzq);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final zzgxv zzl() {
        return zzgxv.zzH(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final void zzo(zzgxg zzgxgVar) throws IOException {
        zzgxgVar.zza(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final boolean zzp() {
        int iZzc = zzc();
        return zzhbz.zzi(this.zza, iZzc, zzd() + iZzc);
    }
}
