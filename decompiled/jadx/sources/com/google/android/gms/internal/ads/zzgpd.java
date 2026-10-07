package com.google.android.gms.internal.ads;

import da.v;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgpd {
    private final Class zza;
    private final zzgwu zzb;

    public /* synthetic */ zzgpd(Class cls, zzgwu zzgwuVar, zzgpf zzgpfVar) {
        this.zza = cls;
        this.zzb = zzgwuVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgpd)) {
            return false;
        }
        zzgpd zzgpdVar = (zzgpd) obj;
        return zzgpdVar.zza.equals(this.zza) && zzgpdVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return v.u(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }
}
