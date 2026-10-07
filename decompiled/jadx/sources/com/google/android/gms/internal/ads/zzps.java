package com.google.android.gms.internal.ads;

import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzps extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzps(long j4, long j10) {
        StringBuilder sbL = v.l("Unexpected audio track timestamp discontinuity: expected ", ", got ", j10);
        sbL.append(j4);
        super(sbL.toString());
    }
}
