package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzon {
    public static final zzon zza;
    public final int zzb;
    public final int zzc;
    private final zzfzt zzd;

    static {
        zzon zzonVar;
        if (zzen.zza >= 33) {
            zzfzs zzfzsVar = new zzfzs();
            for (int i = 1; i <= 10; i++) {
                zzfzsVar.zzf(Integer.valueOf(zzen.zzi(i)));
            }
            zzonVar = new zzon(2, zzfzsVar.zzi());
        } else {
            zzonVar = new zzon(2, 10);
        }
        zza = zzonVar;
    }

    public zzon(int i, int i10) {
        this.zzb = i;
        this.zzc = i10;
        this.zzd = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzon)) {
            return false;
        }
        zzon zzonVar = (zzon) obj;
        return this.zzb == zzonVar.zzb && this.zzc == zzonVar.zzc && Objects.equals(this.zzd, zzonVar.zzd);
    }

    public final int hashCode() {
        zzfzt zzfztVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzfztVar == null ? 0 : zzfztVar.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.zzb + ", maxChannelCount=" + this.zzc + ", channelMasks=" + String.valueOf(this.zzd) + "]";
    }

    public final int zza(int i, zzg zzgVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (zzen.zza >= 29) {
            return zzol.zza(this.zzb, i, zzgVar);
        }
        Integer num = (Integer) zzop.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
        num.getClass();
        return num.intValue();
    }

    public final boolean zzb(int i) {
        if (this.zzd == null) {
            return i <= this.zzc;
        }
        int iZzi = zzen.zzi(i);
        if (iZzi == 0) {
            return false;
        }
        return this.zzd.contains(Integer.valueOf(iZzi));
    }

    public zzon(int i, Set set) {
        this.zzb = i;
        zzfzt zzfztVarZzl = zzfzt.zzl(set);
        this.zzd = zzfztVarZzl;
        zzgbu it = zzfztVarZzl.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = iMax;
    }
}
