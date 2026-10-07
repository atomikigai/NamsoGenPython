package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzgu extends zzge {
    public final int zzb;

    public zzgu(zzgi zzgiVar, int i, int i10) {
        super(zzb(2008, 1));
        this.zzb = 1;
    }

    public static zzgu zza(IOException iOException, zzgi zzgiVar, int i) {
        int i10;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i10 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i10 = 1004;
        } else {
            i10 = (message == null || !zzfwa.zza(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i10 == 2007 ? new zzgt(iOException, zzgiVar) : new zzgu(iOException, zzgiVar, i10, i);
    }

    private static int zzb(int i, int i10) {
        if (i == 2000) {
            return i10 != 1 ? 2000 : 2001;
        }
        return i;
    }

    public zzgu(IOException iOException, zzgi zzgiVar, int i, int i10) {
        super(iOException, zzb(i, i10));
        this.zzb = i10;
    }

    public zzgu(String str, zzgi zzgiVar, int i, int i10) {
        super(str, zzb(i, i10));
        this.zzb = i10;
    }

    public zzgu(String str, IOException iOException, zzgi zzgiVar, int i, int i10) {
        super(str, iOException, zzb(i, i10));
        this.zzb = i10;
    }
}
