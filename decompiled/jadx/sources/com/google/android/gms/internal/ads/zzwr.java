package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzwr {
    public static final zzwr zza = new zzwr(new zzbw[0]);
    public final int zzb;
    private final zzfzo zzc;
    private int zzd;

    static {
        Integer.toString(0, 36);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zzwr(zzbw... zzbwVarArr) {
        this.zzc = zzfzo.zzm(zzbwVarArr);
        this.zzb = zzbwVarArr.length;
        int i = 0;
        while (i < this.zzc.size()) {
            int i10 = i + 1;
            for (int i11 = i10; i11 < this.zzc.size(); i11++) {
                if (((zzbw) this.zzc.get(i)).equals(this.zzc.get(i11))) {
                    zzdt.zzd("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzwr.class == obj.getClass()) {
            zzwr zzwrVar = (zzwr) obj;
            if (this.zzb == zzwrVar.zzb && this.zzc.equals(zzwrVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.zzc.hashCode();
        this.zzd = iHashCode;
        return iHashCode;
    }

    public final int zza(zzbw zzbwVar) {
        int iIndexOf = this.zzc.indexOf(zzbwVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzbw zzb(int i) {
        return (zzbw) this.zzc.get(i);
    }

    public final zzfzo zzc() {
        return zzfzo.zzl(zzgae.zzb(this.zzc, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzwq
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                zzwr zzwrVar = zzwr.zza;
                return Integer.valueOf(((zzbw) obj).zzc);
            }
        }));
    }
}
