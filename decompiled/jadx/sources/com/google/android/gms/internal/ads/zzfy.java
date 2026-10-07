package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfy extends zzfw {
    private Uri zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private final zzfx zzf;

    public zzfy(byte[] bArr) {
        zzfx zzfxVar = new zzfx(bArr);
        super(false);
        this.zzf = zzfxVar;
        zzdb.zzd(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.zzn
    public final int zza(byte[] bArr, int i, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.zzd;
        if (i11 == 0) {
            return -1;
        }
        int iMin = Math.min(i10, i11);
        byte[] bArr2 = this.zzb;
        zzdb.zzb(bArr2);
        System.arraycopy(bArr2, this.zzc, bArr, i, iMin);
        this.zzc += iMin;
        this.zzd -= iMin;
        zzg(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final long zzb(zzgi zzgiVar) throws IOException {
        zzi(zzgiVar);
        this.zza = zzgiVar.zza;
        byte[] bArr = this.zzf.zza;
        this.zzb = bArr;
        long j4 = zzgiVar.zze;
        int length = bArr.length;
        if (j4 > length) {
            throw new zzge(2008);
        }
        int i = (int) j4;
        this.zzc = i;
        int i10 = length - i;
        this.zzd = i10;
        long j10 = zzgiVar.zzf;
        if (j10 != -1) {
            this.zzd = (int) Math.min(i10, j10);
        }
        this.zze = true;
        zzj(zzgiVar);
        long j11 = zzgiVar.zzf;
        return j11 != -1 ? j11 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final Uri zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzd() {
        if (this.zze) {
            this.zze = false;
            zzh();
        }
        this.zza = null;
        this.zzb = null;
    }
}
