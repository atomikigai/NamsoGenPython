package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbr {
    public static final zzbr zza = new zzbr();

    private zzbr() {
    }

    public static final zzp zza(int i) {
        if (i == 403) {
            return new zzp(zzn.zzl, zzl.zzV, null);
        }
        if (i != 404) {
            return i != 503 ? new zzp(zzn.zzc, zzl.zzW, null) : new zzp(zzn.zzl, zzl.zzV, null);
        }
        return new zzp(zzn.zze, zzl.zzs, null);
    }
}
