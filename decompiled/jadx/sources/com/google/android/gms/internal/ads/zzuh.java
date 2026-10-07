package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzuh implements zzgd {
    private final zzgd zza;
    private final int zzb;
    private final zzug zzc;
    private final byte[] zzd;
    private int zze;

    public zzuh(zzgd zzgdVar, int i, zzug zzugVar) {
        zzdb.zzd(i > 0);
        this.zza = zzgdVar;
        this.zzb = i;
        this.zzc = zzugVar;
        this.zzd = new byte[1];
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzn
    public final int zza(byte[] bArr, int i, int i10) throws IOException {
        int i11 = this.zze;
        if (i11 == 0) {
            int i12 = 0;
            if (this.zza.zza(this.zzd, 0, 1) != -1) {
                int i13 = (this.zzd[0] & 255) << 4;
                if (i13 != 0) {
                    byte[] bArr2 = new byte[i13];
                    int i14 = i13;
                    while (i14 > 0) {
                        int iZza = this.zza.zza(bArr2, i12, i14);
                        if (iZza != -1) {
                            i12 += iZza;
                            i14 -= iZza;
                        }
                    }
                    while (i13 > 0) {
                        int i15 = i13 - 1;
                        if (bArr2[i15] != 0) {
                            break;
                        }
                        i13 = i15;
                    }
                    if (i13 > 0) {
                        this.zzc.zza(new zzed(bArr2, i13));
                    }
                }
                i11 = this.zzb;
                this.zze = i11;
            }
            return -1;
        }
        int iZza2 = this.zza.zza(bArr, i, Math.min(i11, i10));
        if (iZza2 != -1) {
            this.zze -= iZza2;
        }
        return iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final long zzb(zzgi zzgiVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final Map zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzf(zzhd zzhdVar) {
        zzhdVar.getClass();
        this.zza.zzf(zzhdVar);
    }
}
