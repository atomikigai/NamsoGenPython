package com.google.android.gms.internal.play_billing;

import da.v;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzen extends IOException {
    public zzen() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzen(long j4, long j10, int i, Throwable th) {
        Locale locale = Locale.US;
        StringBuilder sbL = v.l("Pos: ", ", limit: ", j4);
        sbL.append(j10);
        sbL.append(", len: ");
        sbL.append(i);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbL.toString()), th);
    }

    public zzen(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
