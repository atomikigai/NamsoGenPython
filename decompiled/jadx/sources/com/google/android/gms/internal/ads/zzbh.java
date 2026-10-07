package com.google.android.gms.internal.ads;

import java.io.IOException;
import u.e;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzbh extends IOException {
    public final boolean zza;
    public final int zzb;

    public zzbh(String str, Throwable th, boolean z4, int i) {
        super(str, th);
        this.zza = z4;
        this.zzb = i;
    }

    public static zzbh zza(String str, Throwable th) {
        return new zzbh(str, th, true, 1);
    }

    public static zzbh zzb(String str, Throwable th) {
        return new zzbh(str, th, true, 0);
    }

    public static zzbh zzc(String str) {
        return new zzbh(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sbC = e.c(super.getMessage(), " {contentIsMalformed=");
        sbC.append(this.zza);
        sbC.append(", dataType=");
        return b.c(sbC, this.zzb, "}");
    }
}
