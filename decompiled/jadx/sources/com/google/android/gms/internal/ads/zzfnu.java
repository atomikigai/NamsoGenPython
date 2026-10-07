package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfnu {
    private final zzfpi zza;
    private final String zzb;
    private final zzfnd zzc;
    private final String zzd = "Ad overlay";

    public zzfnu(View view, zzfnd zzfndVar, String str) {
        this.zza = new zzfpi(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzfndVar;
    }

    public final zzfnd zza() {
        return this.zzc;
    }

    public final zzfpi zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzb;
    }
}
