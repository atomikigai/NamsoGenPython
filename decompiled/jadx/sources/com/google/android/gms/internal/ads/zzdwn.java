package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzdwn extends Exception {
    private final int zza;

    public zzdwn(int i) {
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }

    public zzdwn(int i, String str) {
        super(str);
        this.zza = i;
    }

    public zzdwn(int i, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}
