package com.google.android.gms.internal.ads;

import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzpq extends Exception {
    public final int zza;
    public final boolean zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzpq(int i, int i10, int i11, int i12, zzad zzadVar, boolean z4, Exception exc) {
        String strValueOf = String.valueOf(zzadVar);
        StringBuilder sbD = b.d(i, i10, "AudioTrack init failed ", " Config(", ", ");
        sbD.append(i11);
        sbD.append(", ");
        sbD.append(i12);
        sbD.append(") ");
        sbD.append(strValueOf);
        sbD.append(true != z4 ? "" : " (recoverable)");
        super(sbD.toString(), exc);
        this.zza = i;
        this.zzb = z4;
    }
}
