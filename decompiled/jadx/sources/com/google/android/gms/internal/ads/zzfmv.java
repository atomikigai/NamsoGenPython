package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfmv {
    private boolean zza;

    public final void zza(Context context) {
        zzfor.zzc(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzfnz.zzb().zzd(context);
        zzfnq.zza().zzd(context);
        zzfom.zzb(context);
        zzfon.zzd(context);
        zzfoq.zza(context);
        zzfnw.zzb().zzc(context);
        zzfnp.zza().zzd(context);
        zzfob.zza().zze(context);
    }

    public final boolean zzb() {
        return this.zza;
    }
}
