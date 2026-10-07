package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzko {
    public final long zza;
    public final float zzb;
    public final long zzc;

    public /* synthetic */ zzko(zzkm zzkmVar, zzkn zzknVar) {
        this.zza = zzkmVar.zza;
        this.zzb = zzkmVar.zzb;
        this.zzc = zzkmVar.zzc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzko)) {
            return false;
        }
        zzko zzkoVar = (zzko) obj;
        return this.zza == zzkoVar.zza && this.zzb == zzkoVar.zzb && this.zzc == zzkoVar.zzc;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Float.valueOf(this.zzb), Long.valueOf(this.zzc)});
    }

    public final zzkm zza() {
        return new zzkm(this, null);
    }
}
