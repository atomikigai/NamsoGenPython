package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhy {
    public final String zza;
    public final zzad zzb;
    public final zzad zzc;
    public final int zzd;
    public final int zze;

    public zzhy(String str, zzad zzadVar, zzad zzadVar2, int i, int i10) {
        boolean z4 = true;
        if (i != 0) {
            if (i10 == 0) {
                i10 = 0;
            } else {
                z4 = false;
            }
        }
        zzdb.zzd(z4);
        zzdb.zzc(str);
        this.zza = str;
        this.zzb = zzadVar;
        zzadVar2.getClass();
        this.zzc = zzadVar2;
        this.zzd = i;
        this.zze = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhy.class == obj.getClass()) {
            zzhy zzhyVar = (zzhy) obj;
            if (this.zzd == zzhyVar.zzd && this.zze == zzhyVar.zze && this.zza.equals(zzhyVar.zza) && this.zzb.equals(zzhyVar.zzb) && this.zzc.equals(zzhyVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzd + 527;
        String str = this.zza;
        int iHashCode = str.hashCode() + (((i * 31) + this.zze) * 31);
        int iHashCode2 = this.zzb.hashCode() + (iHashCode * 31);
        return this.zzc.hashCode() + (iHashCode2 * 31);
    }
}
