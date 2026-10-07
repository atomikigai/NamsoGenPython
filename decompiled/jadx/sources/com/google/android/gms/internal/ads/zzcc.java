package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcc {
    public final int zza;
    private final zzbw zzb;
    private final boolean zzc;
    private final int[] zzd;
    private final boolean[] zze;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public zzcc(zzbw zzbwVar, boolean z4, int[] iArr, boolean[] zArr) {
        int i = zzbwVar.zza;
        this.zza = i;
        zzdb.zzd(i == iArr.length && i == zArr.length);
        this.zzb = zzbwVar;
        this.zzc = z4 && i > 1;
        this.zzd = (int[]) iArr.clone();
        this.zze = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcc.class == obj.getClass()) {
            zzcc zzccVar = (zzcc) obj;
            if (this.zzc == zzccVar.zzc && this.zzb.equals(zzccVar.zzb) && Arrays.equals(this.zzd, zzccVar.zzd) && Arrays.equals(this.zze, zzccVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() * 31;
        int[] iArr = this.zzd;
        int iHashCode2 = Arrays.hashCode(iArr) + ((iHashCode + (this.zzc ? 1 : 0)) * 31);
        return Arrays.hashCode(this.zze) + (iHashCode2 * 31);
    }

    public final int zza() {
        return this.zzb.zzc;
    }

    public final zzad zzb(int i) {
        return this.zzb.zzb(i);
    }

    public final boolean zzc() {
        for (boolean z4 : this.zze) {
            if (z4) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzd(int i) {
        return this.zze[i];
    }
}
