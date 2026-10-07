package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzftl extends zzftk {
    private static zzftl zzd;

    private zzftl(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzftl zzj(Context context) {
        zzftl zzftlVar;
        synchronized (zzftl.class) {
            try {
                if (zzd == null) {
                    zzd = new zzftl(context);
                }
                zzftlVar = zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzftlVar;
    }

    public final zzfth zzh(long j4, boolean z4) throws IOException {
        zzfth zzfthVarZzb;
        synchronized (zzftl.class) {
            zzfthVarZzb = zzb(null, null, j4, z4);
        }
        return zzfthVarZzb;
    }

    public final zzfth zzi(String str, String str2, long j4, boolean z4) throws IOException {
        zzfth zzfthVarZzb;
        synchronized (zzftl.class) {
            zzfthVarZzb = zzb(str, str2, j4, z4);
        }
        return zzfthVarZzb;
    }

    public final void zzk() throws IOException {
        synchronized (zzftl.class) {
            zzf(false);
        }
    }

    public final void zzl() throws IOException {
        synchronized (zzftl.class) {
            zzf(true);
        }
    }
}
