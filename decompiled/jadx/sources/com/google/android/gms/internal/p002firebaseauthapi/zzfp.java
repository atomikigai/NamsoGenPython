package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import q1.a;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfp extends zzcx {
    private final int zza;
    private final zzfn zzb;

    public /* synthetic */ zzfp(int i, zzfn zzfnVar, zzfo zzfoVar) {
        this.zza = i;
        this.zzb = zzfnVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfp)) {
            return false;
        }
        zzfp zzfpVar = (zzfp) obj;
        return zzfpVar.zza == this.zza && zzfpVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzfp.class, Integer.valueOf(this.zza), this.zzb});
    }

    public final String toString() {
        return b.c(a.n("AesGcmSiv Parameters (variant: ", String.valueOf(this.zzb), ", "), this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        return this.zzb != zzfn.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzfn zzc() {
        return this.zzb;
    }
}
