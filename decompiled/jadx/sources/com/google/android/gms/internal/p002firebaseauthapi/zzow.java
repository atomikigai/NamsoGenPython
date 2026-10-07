package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzow {
    private final Class zza;
    private final zzzo zzb;

    public /* synthetic */ zzow(Class cls, zzzo zzzoVar, zzov zzovVar) {
        this.zza = cls;
        this.zzb = zzzoVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzow)) {
            return false;
        }
        zzow zzowVar = (zzow) obj;
        return zzowVar.zza.equals(this.zza) && zzowVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return v.u(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }
}
