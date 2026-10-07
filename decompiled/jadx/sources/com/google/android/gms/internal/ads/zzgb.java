package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgb extends zzfw {
    private zzgi zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzgb() {
        super(false);
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
        int i12 = zzen.zza;
        System.arraycopy(bArr2, this.zzc, bArr, i, iMin);
        this.zzc += iMin;
        this.zzd -= iMin;
        zzg(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final long zzb(zzgi zzgiVar) throws IOException {
        zzi(zzgiVar);
        this.zza = zzgiVar;
        Uri uriNormalizeScheme = zzgiVar.zza.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        zzdb.zze("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i = zzen.zza;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw zzbh.zzb("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.zzb = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw zzbh.zzb("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e);
            }
        } else {
            this.zzb = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j4 = zzgiVar.zze;
        int length = this.zzb.length;
        if (j4 > length) {
            this.zzb = null;
            throw new zzge(2008);
        }
        int i10 = (int) j4;
        this.zzc = i10;
        int i11 = length - i10;
        this.zzd = i11;
        long j10 = zzgiVar.zzf;
        if (j10 != -1) {
            this.zzd = (int) Math.min(i11, j10);
        }
        zzj(zzgiVar);
        long j11 = zzgiVar.zzf;
        return j11 != -1 ? j11 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final Uri zzc() {
        zzgi zzgiVar = this.zza;
        if (zzgiVar != null) {
            return zzgiVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzh();
        }
        this.zza = null;
    }
}
