package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzftn {
    private static zzftn zzb;
    final zzftj zza;

    private zzftn(Context context) {
        this.zza = zzftj.zzb(context);
        zzfti.zza(context);
    }

    public static final zzftn zza(Context context) {
        zzftn zzftnVar;
        synchronized (zzftn.class) {
            try {
                if (zzb == null) {
                    zzb = new zzftn(context);
                }
                zzftnVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzftnVar;
    }

    public final void zzb(zzfth zzfthVar) throws IOException {
        synchronized (zzftn.class) {
            this.zza.zze("vendor_scoped_gpid_v2_id");
            this.zza.zze("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
