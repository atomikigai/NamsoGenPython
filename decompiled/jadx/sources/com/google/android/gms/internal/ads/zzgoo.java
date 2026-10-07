package com.google.android.gms.internal.ads;

import da.v;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgoo {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgoo(Class cls, Class cls2, zzgop zzgopVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgoo)) {
            return false;
        }
        zzgoo zzgooVar = (zzgoo) obj;
        return zzgooVar.zza.equals(this.zza) && zzgooVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return v.u(this.zza.getSimpleName(), " with primitive type: ", this.zzb.getSimpleName());
    }
}
