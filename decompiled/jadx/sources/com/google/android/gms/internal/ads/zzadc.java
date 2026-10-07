package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzadc {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final zzadb zzk;
    private final zzbd zzl;

    private zzadc(int i, int i10, int i11, int i12, int i13, int i14, int i15, long j4, zzadb zzadbVar, zzbd zzbdVar) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = zzi(i13);
        this.zzg = i14;
        this.zzh = i15;
        this.zzi = zzh(i15);
        this.zzj = j4;
        this.zzk = zzadbVar;
        this.zzl = zzbdVar;
    }

    private static int zzh(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int zzi(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long zza() {
        long j4 = this.zzj;
        if (j4 == 0) {
            return -9223372036854775807L;
        }
        return (j4 * 1000000) / ((long) this.zze);
    }

    public final long zzb(long j4) {
        return Math.max(0L, Math.min((j4 * ((long) this.zze)) / 1000000, this.zzj - 1));
    }

    public final zzad zzc(byte[] bArr, zzbd zzbdVar) {
        bArr[4] = -128;
        zzbd zzbdVarZzd = zzd(zzbdVar);
        zzab zzabVar = new zzab();
        zzabVar.zzZ("audio/flac");
        int i = this.zzd;
        if (i <= 0) {
            i = -1;
        }
        zzabVar.zzQ(i);
        zzabVar.zzz(this.zzg);
        zzabVar.zzaa(this.zze);
        zzabVar.zzT(zzen.zzn(this.zzh));
        zzabVar.zzM(Collections.singletonList(bArr));
        zzabVar.zzS(zzbdVarZzd);
        return zzabVar.zzaf();
    }

    public final zzbd zzd(zzbd zzbdVar) {
        zzbd zzbdVar2 = this.zzl;
        return zzbdVar2 == null ? zzbdVar : zzbdVar2.zzd(zzbdVar);
    }

    public final zzadc zze(List list) {
        return new zzadc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(new zzbd(list)));
    }

    public final zzadc zzf(zzadb zzadbVar) {
        return new zzadc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzadbVar, this.zzl);
    }

    public final zzadc zzg(List list) {
        return new zzadc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzaed.zzb(list)));
    }

    public zzadc(byte[] bArr, int i) {
        zzec zzecVar = new zzec(bArr, bArr.length);
        zzecVar.zzl(i * 8);
        this.zza = zzecVar.zzd(16);
        this.zzb = zzecVar.zzd(16);
        this.zzc = zzecVar.zzd(24);
        this.zzd = zzecVar.zzd(24);
        int iZzd = zzecVar.zzd(20);
        this.zze = iZzd;
        this.zzf = zzi(iZzd);
        this.zzg = zzecVar.zzd(3) + 1;
        int iZzd2 = zzecVar.zzd(5) + 1;
        this.zzh = iZzd2;
        this.zzi = zzh(iZzd2);
        this.zzj = zzecVar.zze(36);
        this.zzk = null;
        this.zzl = null;
    }
}
