package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzajn extends zzajw {
    private zzadc zza;
    private zzajm zzb;

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final long zza(zzed zzedVar) {
        if (!zzd(zzedVar.zzN())) {
            return -1L;
        }
        int i = (zzedVar.zzN()[2] & 255) >> 4;
        if (i == 6) {
            zzedVar.zzM(4);
            zzedVar.zzx();
        } else if (i == 7) {
            i = 7;
            zzedVar.zzM(4);
            zzedVar.zzx();
        }
        int iZza = zzacy.zza(zzedVar, i);
        zzedVar.zzL(0);
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final void zzb(boolean z4) {
        super.zzb(z4);
        if (z4) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final boolean zzc(zzed zzedVar, long j4, zzajt zzajtVar) {
        byte[] bArrZzN = zzedVar.zzN();
        zzadc zzadcVar = this.zza;
        if (zzadcVar == null) {
            zzadc zzadcVar2 = new zzadc(bArrZzN, 17);
            this.zza = zzadcVar2;
            zzajtVar.zza = zzadcVar2.zzc(Arrays.copyOfRange(bArrZzN, 9, zzedVar.zze()), null);
            return true;
        }
        if ((bArrZzN[0] & 127) == 3) {
            zzadb zzadbVarZzb = zzacz.zzb(zzedVar);
            zzadc zzadcVarZzf = zzadcVar.zzf(zzadbVarZzb);
            this.zza = zzadcVarZzf;
            this.zzb = new zzajm(zzadcVarZzf, zzadbVarZzb);
            return true;
        }
        if (!zzd(bArrZzN)) {
            return true;
        }
        zzajm zzajmVar = this.zzb;
        if (zzajmVar != null) {
            zzajmVar.zza(j4);
            zzajtVar.zzb = this.zzb;
        }
        zzajtVar.zza.getClass();
        return false;
    }
}
