package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import q1.a;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zziw extends zzje {
    private final int zza;
    private final zziu zzb;

    public /* synthetic */ zziw(int i, zziu zziuVar, zziv zzivVar) {
        this.zza = i;
        this.zzb = zziuVar;
    }

    public static zzit zzc() {
        return new zzit(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zziw)) {
            return false;
        }
        zziw zziwVar = (zziw) obj;
        return zziwVar.zza == this.zza && zziwVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zziw.class, Integer.valueOf(this.zza), this.zzb});
    }

    public final String toString() {
        return b.c(a.n("AesSiv Parameters (variant: ", String.valueOf(this.zzb), ", "), this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        return this.zzb != zziu.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zziu zzd() {
        return this.zzb;
    }
}
