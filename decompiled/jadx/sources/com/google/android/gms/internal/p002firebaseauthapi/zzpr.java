package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import q1.a;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzpr extends zzqs {
    private final int zza;
    private final int zzb;
    private final zzpp zzc;

    public /* synthetic */ zzpr(int i, int i10, zzpp zzppVar, zzpq zzpqVar) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = zzppVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpr)) {
            return false;
        }
        zzpr zzprVar = (zzpr) obj;
        return zzprVar.zza == this.zza && zzprVar.zzd() == zzd() && zzprVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzpr.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc});
    }

    public final String toString() {
        StringBuilder sbN = a.n("AES-CMAC Parameters (variant: ", String.valueOf(this.zzc), ", ");
        sbN.append(this.zzb);
        sbN.append("-byte tags, and ");
        return b.c(sbN, this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        return this.zzc != zzpp.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzpp zzppVar = this.zzc;
        if (zzppVar == zzpp.zzd) {
            return this.zzb;
        }
        if (zzppVar == zzpp.zza || zzppVar == zzpp.zzb || zzppVar == zzpp.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzpp zze() {
        return this.zzc;
    }
}
