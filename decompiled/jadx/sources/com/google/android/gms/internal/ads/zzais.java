package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzais {
    public final zzadx zza;
    public zzajh zzd;
    public zzaio zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private boolean zzl;
    public final zzajg zzb = new zzajg();
    public final zzed zzc = new zzed();
    private final zzed zzj = new zzed(1);
    private final zzed zzk = new zzed();

    public zzais(zzadx zzadxVar, zzajh zzajhVar, zzaio zzaioVar) {
        this.zza = zzadxVar;
        this.zzd = zzajhVar;
        this.zze = zzaioVar;
        zzh(zzajhVar, zzaioVar);
    }

    public final int zza() {
        int i;
        if (this.zzl) {
            i = this.zzb.zzj[this.zzf] ? 1 : 0;
        } else {
            i = this.zzd.zzg[this.zzf];
        }
        return zzf() != null ? i | 1073741824 : i;
    }

    public final int zzb() {
        return !this.zzl ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i, int i10) {
        zzed zzedVar;
        zzajf zzajfVarZzf = zzf();
        if (zzajfVarZzf == null) {
            return 0;
        }
        int i11 = zzajfVarZzf.zzd;
        if (i11 != 0) {
            zzedVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzajfVarZzf.zze;
            int i12 = zzen.zza;
            zzed zzedVar2 = this.zzk;
            int length = bArr.length;
            zzedVar2.zzJ(bArr, length);
            zzedVar = this.zzk;
            i11 = length;
        }
        boolean zZzb = this.zzb.zzb(this.zzf);
        boolean z4 = zZzb || i10 != 0;
        zzed zzedVar3 = this.zzj;
        zzedVar3.zzN()[0] = (byte) ((true != z4 ? 0 : 128) | i11);
        zzedVar3.zzL(0);
        this.zza.zzr(this.zzj, 1, 1);
        this.zza.zzr(zzedVar, i11, 1);
        if (!z4) {
            return i11 + 1;
        }
        if (!zZzb) {
            this.zzc.zzI(8);
            zzed zzedVar4 = this.zzc;
            byte[] bArrZzN = zzedVar4.zzN();
            bArrZzN[0] = 0;
            bArrZzN[1] = 1;
            bArrZzN[2] = 0;
            bArrZzN[3] = (byte) i10;
            bArrZzN[4] = (byte) ((i >> 24) & 255);
            bArrZzN[5] = (byte) ((i >> 16) & 255);
            bArrZzN[6] = (byte) ((i >> 8) & 255);
            bArrZzN[7] = (byte) (i & 255);
            this.zza.zzr(zzedVar4, 8, 1);
            return i11 + 9;
        }
        int i13 = i11 + 1;
        zzed zzedVar5 = this.zzb.zzn;
        int iZzq = zzedVar5.zzq();
        zzedVar5.zzM(-2);
        int i14 = (iZzq * 6) + 2;
        if (i10 != 0) {
            this.zzc.zzI(i14);
            byte[] bArrZzN2 = this.zzc.zzN();
            zzedVar5.zzH(bArrZzN2, 0, i14);
            int i15 = (((bArrZzN2[2] & 255) << 8) | (bArrZzN2[3] & 255)) + i10;
            bArrZzN2[2] = (byte) ((i15 >> 8) & 255);
            bArrZzN2[3] = (byte) (i15 & 255);
            zzedVar5 = this.zzc;
        }
        this.zza.zzr(zzedVar5, i14, 1);
        return i13 + i14;
    }

    public final long zzd() {
        return !this.zzl ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (!this.zzl) {
            return this.zzd.zzf[this.zzf];
        }
        zzajg zzajgVar = this.zzb;
        return zzajgVar.zzi[this.zzf];
    }

    public final zzajf zzf() {
        if (!this.zzl) {
            return null;
        }
        zzajg zzajgVar = this.zzb;
        zzaio zzaioVar = zzajgVar.zza;
        int i = zzen.zza;
        int i10 = zzaioVar.zza;
        zzajf zzajfVarZza = zzajgVar.zzm;
        if (zzajfVarZza == null) {
            zzajfVarZza = this.zzd.zza.zza(i10);
        }
        if (zzajfVarZza == null || !zzajfVarZza.zza) {
            return null;
        }
        return zzajfVarZza;
    }

    public final void zzh(zzajh zzajhVar, zzaio zzaioVar) {
        this.zzd = zzajhVar;
        this.zze = zzaioVar;
        this.zza.zzl(zzajhVar.zza.zzf);
        zzi();
    }

    public final void zzi() {
        zzajg zzajgVar = this.zzb;
        zzajgVar.zzd = 0;
        zzajgVar.zzp = 0L;
        zzajgVar.zzq = false;
        zzajgVar.zzk = false;
        zzajgVar.zzo = false;
        zzajgVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final boolean zzk() {
        this.zzf++;
        if (!this.zzl) {
            return false;
        }
        int i = this.zzg + 1;
        this.zzg = i;
        int[] iArr = this.zzb.zzg;
        int i10 = this.zzh;
        if (i != iArr[i10]) {
            return true;
        }
        this.zzh = i10 + 1;
        this.zzg = 0;
        return false;
    }
}
