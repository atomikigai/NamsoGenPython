package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaet implements zzacb {
    private final zzadc zza;
    private final int zzb;
    private final zzacx zzc = new zzacx();

    public /* synthetic */ zzaet(zzadc zzadcVar, int i, zzaeu zzaeuVar) {
        this.zza = zzadcVar;
        this.zzb = i;
    }

    private final long zzc(zzacs zzacsVar) throws IOException {
        while (zzacsVar.zze() < zzacsVar.zzd() - 6) {
            zzadc zzadcVar = this.zza;
            int i = this.zzb;
            zzacx zzacxVar = this.zzc;
            long jZze = zzacsVar.zze();
            byte[] bArr = new byte[2];
            zzacsVar.zzh(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                zzacsVar.zzj();
                zzacsVar.zzg((int) (jZze - zzacsVar.zzf()));
            } else {
                zzed zzedVar = new zzed(16);
                System.arraycopy(bArr, 0, zzedVar.zzN(), 0, 2);
                zzedVar.zzK(zzacv.zza(zzacsVar, zzedVar.zzN(), 2, 14));
                zzacsVar.zzj();
                zzacsVar.zzg((int) (jZze - zzacsVar.zzf()));
                if (zzacy.zzc(zzedVar, zzadcVar, i, zzacxVar)) {
                    break;
                }
            }
            zzacsVar.zzg(1);
        }
        if (zzacsVar.zze() < zzacsVar.zzd() - 6) {
            return this.zzc.zza;
        }
        zzacsVar.zzg((int) (zzacsVar.zzd() - zzacsVar.zze()));
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzacb
    public final zzaca zza(zzacs zzacsVar, long j4) throws IOException {
        long jZzf = zzacsVar.zzf();
        long jZzc = zzc(zzacsVar);
        long jZze = zzacsVar.zze();
        zzacsVar.zzg(Math.max(6, this.zza.zzc));
        long jZzc2 = zzc(zzacsVar);
        long jZze2 = zzacsVar.zze();
        if (jZzc > j4 || jZzc2 <= j4) {
            return jZzc2 <= j4 ? zzaca.zzf(jZzc2, jZze2) : zzaca.zzd(jZzc, jZzf);
        }
        return zzaca.zze(jZze);
    }

    @Override // com.google.android.gms.internal.ads.zzacb
    public final /* synthetic */ void zzb() {
    }
}
