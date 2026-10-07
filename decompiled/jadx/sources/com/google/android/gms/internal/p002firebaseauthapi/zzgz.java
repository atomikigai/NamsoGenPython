package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import q1.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgz extends zzcx {
    private final String zza;
    private final zzgx zzb;
    private final zzcx zzc;

    public /* synthetic */ zzgz(String str, zzgx zzgxVar, zzcx zzcxVar, zzgy zzgyVar) {
        this.zza = str;
        this.zzb = zzgxVar;
        this.zzc = zzcxVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgz)) {
            return false;
        }
        zzgz zzgzVar = (zzgz) obj;
        return zzgzVar.zzb.equals(this.zzb) && zzgzVar.zzc.equals(this.zzc) && zzgzVar.zza.equals(this.zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgz.class, this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        zzcx zzcxVar = this.zzc;
        String strValueOf = String.valueOf(this.zzb);
        String strValueOf2 = String.valueOf(zzcxVar);
        StringBuilder sb2 = new StringBuilder("LegacyKmsEnvelopeAead Parameters (kekUri: ");
        sb2.append(this.zza);
        sb2.append(", dekParsingStrategy: ");
        sb2.append(strValueOf);
        sb2.append(", dekParametersForNewKeys: ");
        return a.m(sb2, strValueOf2, ")");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        return false;
    }

    public final zzcx zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zza;
    }
}
