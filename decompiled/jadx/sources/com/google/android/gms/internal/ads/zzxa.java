package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzxa implements zzyd {
    protected final zzbw zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzad[] zzd;
    private int zze;

    public zzxa(zzbw zzbwVar, int[] iArr, int i) {
        int length = iArr.length;
        zzdb.zzf(length > 0);
        zzbwVar.getClass();
        this.zza = zzbwVar;
        this.zzb = length;
        this.zzd = new zzad[length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.zzd[i10] = zzbwVar.zzb(iArr[i10]);
        }
        Arrays.sort(this.zzd, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwz
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzad) obj2).zzj - ((zzad) obj).zzj;
            }
        });
        this.zzc = new int[this.zzb];
        for (int i11 = 0; i11 < this.zzb; i11++) {
            this.zzc[i11] = zzbwVar.zza(this.zzd[i11]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzxa zzxaVar = (zzxa) obj;
            if (this.zza.equals(zzxaVar.zza) && Arrays.equals(this.zzc, zzxaVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.zzc) + (System.identityHashCode(this.zza) * 31);
        this.zze = iHashCode;
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final int zza(int i) {
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final int zzb(int i) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            if (this.zzc[i10] == i) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final int zzc() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final zzad zzd(int i) {
        return this.zzd[i];
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final zzbw zze() {
        return this.zza;
    }
}
