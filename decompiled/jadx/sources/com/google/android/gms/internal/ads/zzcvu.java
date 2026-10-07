package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcvu {
    private Context zza;
    private zzffo zzb;
    private Bundle zzc;
    private zzffg zzd;
    private zzcvo zze;
    private zzefg zzf;

    public final zzcvu zzd(zzefg zzefgVar) {
        this.zzf = zzefgVar;
        return this;
    }

    public final zzcvu zze(Context context) {
        this.zza = context;
        return this;
    }

    public final zzcvu zzf(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzcvu zzg(zzcvo zzcvoVar) {
        this.zze = zzcvoVar;
        return this;
    }

    public final zzcvu zzh(zzffg zzffgVar) {
        this.zzd = zzffgVar;
        return this;
    }

    public final zzcvu zzi(zzffo zzffoVar) {
        this.zzb = zzffoVar;
        return this;
    }

    public final zzcvw zzj() {
        return new zzcvw(this, null);
    }
}
