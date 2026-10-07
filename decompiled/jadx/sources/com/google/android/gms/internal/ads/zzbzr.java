package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import n7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbzr {
    final /* synthetic */ zzbzs zza;
    private long zzb = -1;
    private long zzc = -1;

    public zzbzr(zzbzs zzbzsVar) {
        this.zza = zzbzsVar;
    }

    public final long zza() {
        return this.zzc;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.zzb);
        bundle.putLong("tclose", this.zzc);
        return bundle;
    }

    public final void zzc() {
        ((b) this.zza.zza).getClass();
        this.zzc = SystemClock.elapsedRealtime();
    }

    public final void zzd() {
        ((b) this.zza.zza).getClass();
        this.zzb = SystemClock.elapsedRealtime();
    }
}
