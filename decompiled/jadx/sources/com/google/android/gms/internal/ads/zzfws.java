package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfws implements Serializable, zzfwr {
    private final List zza;

    public final boolean equals(Object obj) {
        if (obj instanceof zzfws) {
            return this.zza.equals(((zzfws) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z4 = true;
        for (Object obj : this.zza) {
            if (!z4) {
                sb2.append(',');
            }
            sb2.append(obj);
            z4 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfwr
    public final boolean zza(Object obj) {
        for (int i = 0; i < this.zza.size(); i++) {
            if (!((zzfwr) this.zza.get(i)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
