package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import q1.a;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzey extends zzcx {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzew zzd;

    public /* synthetic */ zzey(int i, int i10, int i11, zzew zzewVar, zzex zzexVar) {
        this.zza = i;
        this.zzd = zzewVar;
    }

    public static zzev zzc() {
        return new zzev(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzey)) {
            return false;
        }
        zzey zzeyVar = (zzey) obj;
        return zzeyVar.zza == this.zza && zzeyVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzey.class, Integer.valueOf(this.zza), 12, 16, this.zzd});
    }

    public final String toString() {
        return b.c(a.n("AesGcm Parameters (variant: ", String.valueOf(this.zzd), ", 12-byte IV, 16-byte tag, and "), this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        return this.zzd != zzew.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzew zzd() {
        return this.zzd;
    }
}
