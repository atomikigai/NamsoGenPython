package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbn {
    public final Object zza;
    public final int zzb;
    public final zzaw zzc;
    public final Object zzd;
    public final int zze;
    public final long zzf;
    public final long zzg;
    public final int zzh;
    public final int zzi;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public zzbn(Object obj, int i, zzaw zzawVar, Object obj2, int i10, long j4, long j10, int i11, int i12) {
        this.zza = obj;
        this.zzb = i;
        this.zzc = zzawVar;
        this.zzd = obj2;
        this.zze = i10;
        this.zzf = j4;
        this.zzg = j10;
        this.zzh = i11;
        this.zzi = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbn.class == obj.getClass()) {
            zzbn zzbnVar = (zzbn) obj;
            if (this.zzb == zzbnVar.zzb && this.zze == zzbnVar.zze && this.zzf == zzbnVar.zzf && this.zzg == zzbnVar.zzg && this.zzh == zzbnVar.zzh && this.zzi == zzbnVar.zzi && zzfwn.zza(this.zzc, zzbnVar.zzc) && zzfwn.zza(this.zza, zzbnVar.zza) && zzfwn.zza(this.zzd, zzbnVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd, Integer.valueOf(this.zze), Long.valueOf(this.zzf), Long.valueOf(this.zzg), Integer.valueOf(this.zzh), Integer.valueOf(this.zzi)});
    }
}
