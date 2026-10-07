package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import q1.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgo extends zzcx {
    private final String zza;

    private zzgo(String str) {
        this.zza = str;
    }

    public static zzgo zzb(String str) throws GeneralSecurityException {
        return new zzgo(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgo) {
            return ((zzgo) obj).zza.equals(this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgo.class, this.zza});
    }

    public final String toString() {
        return a.m(new StringBuilder("LegacyKmsAead Parameters (keyUri: "), this.zza, ")");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        return false;
    }

    public final String zzc() {
        return this.zza;
    }
}
