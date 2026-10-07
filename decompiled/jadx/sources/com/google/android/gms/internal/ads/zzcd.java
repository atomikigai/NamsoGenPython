package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcd {
    public static final zzcd zza = new zzcd(zzfzo.zzn());
    private final zzfzo zzb;

    static {
        Integer.toString(0, 36);
    }

    public zzcd(List list) {
        this.zzb = zzfzo.zzl(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzcd.class != obj.getClass()) {
            return false;
        }
        return this.zzb.equals(((zzcd) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final zzfzo zza() {
        return this.zzb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzb(int i) {
        for (int i10 = 0; i10 < this.zzb.size(); i10++) {
            zzcc zzccVar = (zzcc) this.zzb.get(i10);
            if (zzccVar.zzc() && zzccVar.zza() == i) {
                return true;
            }
        }
        return false;
    }
}
