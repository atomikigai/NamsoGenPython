package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import q1.a;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeh extends zzcx {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzef zzd;

    public /* synthetic */ zzeh(int i, int i10, int i11, zzef zzefVar, zzeg zzegVar) {
        this.zza = i;
        this.zzb = i10;
        this.zzd = zzefVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzeh)) {
            return false;
        }
        zzeh zzehVar = (zzeh) obj;
        return zzehVar.zza == this.zza && zzehVar.zzb == this.zzb && zzehVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzeh.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd});
    }

    public final String toString() {
        StringBuilder sbN = a.n("AesEax Parameters (variant: ", String.valueOf(this.zzd), ", ");
        sbN.append(this.zzb);
        sbN.append("-byte IV, 16-byte tag, and ");
        return b.c(sbN, this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        return this.zzd != zzef.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzef zzd() {
        return this.zzd;
    }
}
