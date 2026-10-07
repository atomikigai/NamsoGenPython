package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzoc {
    final /* synthetic */ zzod zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzur zze;
    private boolean zzf;
    private boolean zzg;

    public zzoc(zzod zzodVar, String str, int i, zzur zzurVar) {
        this.zza = zzodVar;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zzurVar == null ? -1L : zzurVar.zzd;
        if (zzurVar == null || !zzurVar.zzb()) {
            return;
        }
        this.zze = zzurVar;
    }

    public final void zzg(int i, zzur zzurVar) {
        if (this.zzd == -1 && i == this.zzc && zzurVar != null) {
            zzod zzodVar = this.zza;
            long j4 = zzurVar.zzd;
            if (j4 >= zzodVar.zzl()) {
                this.zzd = j4;
            }
        }
    }

    public final boolean zzj(int i, zzur zzurVar) {
        if (zzurVar == null) {
            return i == this.zzc;
        }
        zzur zzurVar2 = this.zze;
        if (zzurVar2 == null) {
            return !zzurVar.zzb() && zzurVar.zzd == this.zzd;
        }
        return zzurVar.zzd == zzurVar2.zzd && zzurVar.zzb == zzurVar2.zzb && zzurVar.zzc == zzurVar2.zzc;
    }

    public final boolean zzk(zzlx zzlxVar) {
        zzur zzurVar = zzlxVar.zzd;
        if (zzurVar == null) {
            return this.zzc != zzlxVar.zzc;
        }
        long j4 = this.zzd;
        if (j4 == -1) {
            return false;
        }
        if (zzurVar.zzd > j4) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzbv zzbvVar = zzlxVar.zzb;
        int iZza = zzbvVar.zza(zzurVar.zza);
        int iZza2 = zzbvVar.zza(this.zze.zza);
        zzur zzurVar2 = zzlxVar.zzd;
        if (zzurVar2.zzd < this.zze.zzd || iZza < iZza2) {
            return false;
        }
        if (iZza > iZza2) {
            return true;
        }
        if (!zzurVar2.zzb()) {
            int i = zzlxVar.zzd.zze;
            return i == -1 || i > this.zze.zzb;
        }
        zzur zzurVar3 = zzlxVar.zzd;
        int i10 = zzurVar3.zzb;
        int i11 = zzurVar3.zzc;
        zzur zzurVar4 = this.zze;
        int i12 = zzurVar4.zzb;
        if (i10 <= i12) {
            return i10 == i12 && i11 > zzurVar4.zzc;
        }
        return true;
    }

    public final boolean zzl(zzbv zzbvVar, zzbv zzbvVar2) {
        int i = this.zzc;
        if (i < zzbvVar.zzc()) {
            zzbvVar.zze(i, this.zza.zzc, 0L);
            int i10 = this.zza.zzc.zzn;
            while (true) {
                if (i10 > this.zza.zzc.zzo) {
                    i = -1;
                    break;
                }
                int iZza = zzbvVar2.zza(zzbvVar.zzf(i10));
                if (iZza != -1) {
                    i = zzbvVar2.zzd(iZza, this.zza.zzd, false).zzc;
                    break;
                }
                i10++;
            }
        } else if (i >= zzbvVar2.zzc()) {
            i = -1;
            break;
        }
        this.zzc = i;
        if (i == -1) {
            return false;
        }
        zzur zzurVar = this.zze;
        return zzurVar == null || zzbvVar2.zza(zzurVar.zza) != -1;
    }
}
