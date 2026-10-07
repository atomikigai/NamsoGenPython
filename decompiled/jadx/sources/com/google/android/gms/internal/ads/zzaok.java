package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaok {
    public static Pair zza(zzacs zzacsVar) throws IOException {
        zzacsVar.zzj();
        zzaoj zzaojVarZzd = zzd(1684108385, zzacsVar, new zzed(8));
        zzacsVar.zzk(8);
        return Pair.create(Long.valueOf(zzacsVar.zzf()), Long.valueOf(zzaojVarZzd.zzb));
    }

    public static zzaoi zzb(zzacs zzacsVar) throws IOException {
        byte[] bArr;
        zzed zzedVar = new zzed(16);
        zzaoj zzaojVarZzd = zzd(1718449184, zzacsVar, zzedVar);
        zzdb.zzf(zzaojVarZzd.zzb >= 16);
        zzacsVar.zzh(zzedVar.zzN(), 0, 16);
        zzedVar.zzL(0);
        int iZzk = zzedVar.zzk();
        int iZzk2 = zzedVar.zzk();
        int iZzj = zzedVar.zzj();
        int iZzj2 = zzedVar.zzj();
        int iZzk3 = zzedVar.zzk();
        int iZzk4 = zzedVar.zzk();
        int i = ((int) zzaojVarZzd.zzb) - 16;
        if (i > 0) {
            bArr = new byte[i];
            zzacsVar.zzh(bArr, 0, i);
        } else {
            bArr = zzen.zzf;
        }
        byte[] bArr2 = bArr;
        zzacsVar.zzk((int) (zzacsVar.zze() - zzacsVar.zzf()));
        return new zzaoi(iZzk, iZzk2, iZzj, iZzj2, iZzk3, iZzk4, bArr2);
    }

    public static boolean zzc(zzacs zzacsVar) throws IOException {
        zzed zzedVar = new zzed(8);
        int i = zzaoj.zza(zzacsVar, zzedVar).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        zzacsVar.zzh(zzedVar.zzN(), 0, 4);
        zzedVar.zzL(0);
        int iZzg = zzedVar.zzg();
        if (iZzg == 1463899717) {
            return true;
        }
        zzdt.zzc("WavHeaderReader", "Unsupported form type: " + iZzg);
        return false;
    }

    private static zzaoj zzd(int i, zzacs zzacsVar, zzed zzedVar) throws IOException {
        zzaoj zzaojVarZza = zzaoj.zza(zzacsVar, zzedVar);
        while (true) {
            int i10 = zzaojVarZza.zza;
            if (i10 == i) {
                return zzaojVarZza;
            }
            q1.a.o(i10, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j4 = zzaojVarZza.zzb;
            long j10 = 8 + j4;
            if ((1 & j4) != 0) {
                j10 = j4 + 9;
            }
            if (j10 > 2147483647L) {
                throw zzbh.zzc("Chunk is too large (~2GB+) to skip; id: " + zzaojVarZza.zza);
            }
            zzacsVar.zzk((int) j10);
            zzaojVarZza = zzaoj.zza(zzacsVar, zzedVar);
        }
    }
}
