package com.google.android.gms.internal.ads;

import android.content.Context;
import h6.r;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzboi {
    static final r zza = new zzbog();
    static final r zzb = new zzboh();
    private final zzbnu zzc;

    public zzboi(Context context, i6.a aVar, String str, zzfko zzfkoVar) {
        this.zzc = new zzbnu(context, aVar, str, zza, zzb, zzfkoVar);
    }

    public final zzbny zza(String str, zzbob zzbobVar, zzboa zzboaVar) {
        return new zzbom(this.zzc, str, zzbobVar, zzboaVar);
    }

    public final zzbor zzb() {
        return new zzbor(this.zzc);
    }
}
