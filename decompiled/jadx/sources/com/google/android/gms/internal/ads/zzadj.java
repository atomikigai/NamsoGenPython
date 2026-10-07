package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzadj {
    public int zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public zzadj() {
    }

    public final boolean zza(int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (!zzadk.zzm(i) || (i10 = (i >>> 19) & 3) == 1 || (i11 = (i >>> 17) & 3) == 0 || (i12 = (i >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i14 = i12 - 1;
        this.zza = i10;
        this.zzb = zzadk.zza[3 - i11];
        int i15 = zzadk.zzb[i13];
        this.zzd = i15;
        if (i10 == 2) {
            i15 /= 2;
            this.zzd = i15;
        } else if (i10 == 0) {
            i15 /= 4;
            this.zzd = i15;
        }
        int i16 = (i >>> 9) & 1;
        this.zzg = zzadk.zzl(i10, i11);
        if (i11 == 3) {
            int i17 = i10 == 3 ? zzadk.zzc[i14] : zzadk.zzd[i14];
            this.zzf = i17;
            this.zzc = (((i17 * 12) / i15) + i16) * 4;
        } else {
            if (i10 == 3) {
                int i18 = i11 == 2 ? zzadk.zze[i14] : zzadk.zzf[i14];
                this.zzf = i18;
                this.zzc = q1.a.u(i18, 144, i15, i16);
            } else {
                int i19 = zzadk.zzg[i14];
                this.zzf = i19;
                this.zzc = q1.a.u(i11 == 1 ? 72 : 144, i19, i15, i16);
            }
        }
        this.zze = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }

    public zzadj(zzadj zzadjVar) {
        this.zza = zzadjVar.zza;
        this.zzb = zzadjVar.zzb;
        this.zzc = zzadjVar.zzc;
        this.zzd = zzadjVar.zzd;
        this.zze = zzadjVar.zze;
        this.zzf = zzadjVar.zzf;
        this.zzg = zzadjVar.zzg;
    }
}
