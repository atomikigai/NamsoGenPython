package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzge extends IOException {
    public final int zza;

    public zzge(int i) {
        this.zza = i;
    }

    public zzge(String str, int i) {
        super(str);
        this.zza = i;
    }

    public zzge(String str, Throwable th, int i) {
        super(str, th);
        this.zza = i;
    }

    public zzge(Throwable th, int i) {
        super(th);
        this.zza = i;
    }
}
