package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgcp implements Serializable {
    private final int[] zza;
    private final int zzb;

    private zzgcp(int[] iArr, int i, int i10) {
        this.zza = iArr;
        this.zzb = i10;
    }

    public static zzgcp zzb(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        return new zzgcp(iArrCopyOf, 0, iArrCopyOf.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgcp)) {
            return false;
        }
        zzgcp zzgcpVar = (zzgcp) obj;
        if (this.zzb != zzgcpVar.zzb) {
            return false;
        }
        for (int i = 0; i < this.zzb; i++) {
            if (zza(i) != zzgcpVar.zza(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            i = (i * 31) + this.zza[i10];
        }
        return i;
    }

    public final String toString() {
        int i = this.zzb;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i * 5);
        sb2.append('[');
        sb2.append(this.zza[0]);
        for (int i10 = 1; i10 < this.zzb; i10++) {
            sb2.append(", ");
            sb2.append(this.zza[i10]);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public final int zza(int i) {
        zzfwq.zza(i, this.zzb, "index");
        return this.zza[i];
    }
}
