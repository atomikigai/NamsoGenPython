package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzci {
    public static final zzci zza = new zzci(0, 0, 1.0f);
    public final int zzb;
    public final int zzc;
    public final float zzd;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public zzci(int i, int i10, float f10) {
        this.zzb = i;
        this.zzc = i10;
        this.zzd = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzci) {
            zzci zzciVar = (zzci) obj;
            if (this.zzb == zzciVar.zzb && this.zzc == zzciVar.zzc && this.zzd == zzciVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb + 217;
        float f10 = this.zzd;
        return Float.floatToRawIntBits(f10) + (((i * 31) + this.zzc) * 31);
    }
}
