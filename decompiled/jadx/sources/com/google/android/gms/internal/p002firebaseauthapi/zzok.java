package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzok {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzok(Class cls, Class cls2, zzoj zzojVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzok)) {
            return false;
        }
        zzok zzokVar = (zzok) obj;
        return zzokVar.zza.equals(this.zza) && zzokVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return v.u(this.zza.getSimpleName(), " with primitive type: ", this.zzb.getSimpleName());
    }
}
