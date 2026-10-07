package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzanr implements zzacb {
    private final zzek zza;
    private final zzed zzb = new zzed();
    private final int zzc;

    public zzanr(int i, zzek zzekVar, int i10) {
        this.zzc = i;
        this.zza = zzekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacb
    public final zzaca zza(zzacs zzacsVar, long j4) throws IOException {
        int iZza;
        int iZza2;
        long jZzf = zzacsVar.zzf();
        int iMin = (int) Math.min(112800L, zzacsVar.zzd() - jZzf);
        this.zzb.zzI(iMin);
        zzacsVar.zzh(this.zzb.zzN(), 0, iMin);
        zzed zzedVar = this.zzb;
        int iZze = zzedVar.zze();
        long j10 = -1;
        long j11 = -9223372036854775807L;
        long j12 = -1;
        while (zzedVar.zzb() >= 188 && (iZza2 = (iZza = zzaoc.zza(zzedVar.zzN(), zzedVar.zzd(), iZze)) + 188) <= iZze) {
            long jZzb = zzaoc.zzb(zzedVar, iZza, this.zzc);
            if (jZzb != -9223372036854775807L) {
                long jZzb2 = this.zza.zzb(jZzb);
                if (jZzb2 > j4) {
                    return j11 == -9223372036854775807L ? zzaca.zzd(jZzb2, jZzf) : zzaca.zze(jZzf + j12);
                }
                j12 = iZza;
                if (100000 + jZzb2 > j4) {
                    return zzaca.zze(jZzf + j12);
                }
                j11 = jZzb2;
            }
            zzedVar.zzL(iZza2);
            j10 = iZza2;
        }
        return j11 != -9223372036854775807L ? zzaca.zzf(j11, jZzf + j10) : zzaca.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzacb
    public final void zzb() {
        byte[] bArr = zzen.zzf;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
    }
}
