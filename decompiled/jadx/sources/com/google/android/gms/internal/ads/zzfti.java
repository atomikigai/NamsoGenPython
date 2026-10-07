package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfti {
    private static zzfti zzb;
    final zzftj zza;

    private zzfti(Context context) {
        this.zza = zzftj.zzb(context);
    }

    public static final zzfti zza(Context context) {
        zzfti zzftiVar;
        synchronized (zzfti.class) {
            try {
                if (zzb == null) {
                    zzb = new zzfti(context);
                }
                zzftiVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzftiVar;
    }

    public final void zzb(boolean z4) throws IOException {
        synchronized (zzfti.class) {
            this.zza.zzd("paidv2_user_option", Boolean.valueOf(z4));
        }
    }

    public final void zzc(boolean z4) throws IOException {
        synchronized (zzfti.class) {
            try {
                this.zza.zzd("paidv2_publisher_option", Boolean.valueOf(z4));
                if (!z4) {
                    this.zza.zze("paidv2_creation_time");
                    this.zza.zze("paidv2_id");
                    this.zza.zze("vendor_scoped_gpid_v2_id");
                    this.zza.zze("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzd() {
        boolean zZzf;
        synchronized (zzfti.class) {
            zZzf = this.zza.zzf("paidv2_publisher_option", true);
        }
        return zZzf;
    }

    public final boolean zze() {
        boolean zZzf;
        synchronized (zzfti.class) {
            zZzf = this.zza.zzf("paidv2_user_option", true);
        }
        return zZzf;
    }
}
