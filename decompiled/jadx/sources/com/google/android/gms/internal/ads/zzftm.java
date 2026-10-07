package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzftm extends zzftk {
    private static zzftm zzd;

    private zzftm(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzftm zzi(Context context) {
        zzftm zzftmVar;
        synchronized (zzftm.class) {
            try {
                if (zzd == null) {
                    zzd = new zzftm(context);
                }
                zzftmVar = zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzftmVar;
    }

    public final zzfth zzh(long j4, boolean z4) throws IOException {
        synchronized (zzftm.class) {
            try {
                if (this.zzc.zzd()) {
                    return zzb(null, null, j4, z4);
                }
                return new zzfth();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzftm.class) {
            try {
                if (zzg(false)) {
                    zzf(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
