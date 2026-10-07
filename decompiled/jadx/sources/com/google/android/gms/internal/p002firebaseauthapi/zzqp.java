package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzqp extends zzqs {
    private final int zza;
    private final int zzb;
    private final zzqn zzc;
    private final zzqm zzd;

    public /* synthetic */ zzqp(int i, int i10, zzqn zzqnVar, zzqm zzqmVar, zzqo zzqoVar) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = zzqnVar;
        this.zzd = zzqmVar;
    }

    public static zzql zze() {
        return new zzql(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqp)) {
            return false;
        }
        zzqp zzqpVar = (zzqp) obj;
        return zzqpVar.zza == this.zza && zzqpVar.zzd() == zzd() && zzqpVar.zzc == this.zzc && zzqpVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzqp.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        StringBuilder sbE = b.e("HMAC Parameters (variant: ", String.valueOf(this.zzc), ", hashType: ", String.valueOf(this.zzd), ", ");
        sbE.append(this.zzb);
        sbE.append("-byte tags, and ");
        return b.c(sbE, this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        return this.zzc != zzqn.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzqn zzqnVar = this.zzc;
        if (zzqnVar == zzqn.zzd) {
            return this.zzb;
        }
        if (zzqnVar == zzqn.zza || zzqnVar == zzqn.zzb || zzqnVar == zzqn.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzqm zzf() {
        return this.zzd;
    }

    public final zzqn zzg() {
        return this.zzc;
    }
}
