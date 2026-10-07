package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzajs extends zzajw {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    public static boolean zzd(zzed zzedVar) {
        return zzk(zzedVar, zza);
    }

    private static boolean zzk(zzed zzedVar, byte[] bArr) {
        if (zzedVar.zzb() < 8) {
            return false;
        }
        int iZzd = zzedVar.zzd();
        byte[] bArr2 = new byte[8];
        zzedVar.zzH(bArr2, 0, 8);
        zzedVar.zzL(iZzd);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final long zza(zzed zzedVar) {
        return zzg(zzadm.zzd(zzedVar.zzN()));
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final void zzb(boolean z4) {
        super.zzb(z4);
        if (z4) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final boolean zzc(zzed zzedVar, long j4, zzajt zzajtVar) throws zzbh {
        if (zzk(zzedVar, zza)) {
            byte[] bArrCopyOf = Arrays.copyOf(zzedVar.zzN(), zzedVar.zze());
            int i = bArrCopyOf[9] & 255;
            List listZze = zzadm.zze(bArrCopyOf);
            if (zzajtVar.zza == null) {
                zzab zzabVar = new zzab();
                zzabVar.zzZ("audio/opus");
                zzabVar.zzz(i);
                zzabVar.zzaa(48000);
                zzabVar.zzM(listZze);
                zzajtVar.zza = zzabVar.zzaf();
                return true;
            }
        } else {
            if (!zzk(zzedVar, zzb)) {
                zzdb.zzb(zzajtVar.zza);
                return false;
            }
            zzdb.zzb(zzajtVar.zza);
            if (!this.zzc) {
                this.zzc = true;
                zzedVar.zzM(8);
                zzbd zzbdVarZzb = zzaed.zzb(zzfzo.zzm(zzaed.zzc(zzedVar, false, false).zza));
                if (zzbdVarZzb != null) {
                    zzab zzabVarZzb = zzajtVar.zza.zzb();
                    zzabVarZzb.zzS(zzbdVarZzb.zzd(zzajtVar.zza.zzl));
                    zzajtVar.zza = zzabVarZzb.zzaf();
                }
            }
        }
        return true;
    }
}
