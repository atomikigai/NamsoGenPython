package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfho implements zzfhm {
    private final String zza;

    public zzfho(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfhm
    public final boolean equals(Object obj) {
        if (obj instanceof zzfho) {
            return this.zza.equals(((zzfho) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfhm
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
