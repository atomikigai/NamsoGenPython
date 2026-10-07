package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaqv implements zzaqk {
    final /* synthetic */ Context zza;
    private File zzb = null;

    public zzaqv(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaqk
    public final File zza() {
        if (this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}
