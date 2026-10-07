package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzchl {
    private i6.a zza;
    private Context zzb;
    private long zzc;
    private WeakReference zzd;

    public final zzchl zzd(long j4) {
        this.zzc = j4;
        return this;
    }

    public final zzchl zze(Context context) {
        this.zzd = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.zzb = context;
        return this;
    }

    public final zzchl zzf(i6.a aVar) {
        this.zza = aVar;
        return this;
    }
}
