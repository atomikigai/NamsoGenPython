package com.google.android.gms.internal.ads;

import android.app.Activity;
import g6.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzede extends zzeeb {
    private Activity zza;
    private i zzb;
    private String zzc;
    private String zzd;

    @Override // com.google.android.gms.internal.ads.zzeeb
    public final zzeeb zza(Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Null activity");
        }
        this.zza = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeeb
    public final zzeeb zzb(i iVar) {
        this.zzb = iVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeeb
    public final zzeeb zzc(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeeb
    public final zzeeb zzd(String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeeb
    public final zzeec zze() {
        Activity activity = this.zza;
        if (activity != null) {
            return new zzedg(activity, this.zzb, this.zzc, this.zzd, null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
