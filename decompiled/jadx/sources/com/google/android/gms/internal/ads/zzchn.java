package com.google.android.gms.internal.ads;

import android.content.Context;
import d6.h;
import d6.p;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzchn {
    private final i6.a zza;
    private final Context zzb;
    private final long zzc;
    private final WeakReference zzd;

    public /* synthetic */ zzchn(zzchl zzchlVar, zzchm zzchmVar) {
        this.zza = zzchlVar.zza;
        this.zzb = zzchlVar.zzb;
        this.zzd = zzchlVar.zzd;
        this.zzc = zzchlVar.zzc;
    }

    public final long zza() {
        return this.zzc;
    }

    public final Context zzb() {
        return this.zzb;
    }

    public final h zzc() {
        return new h(this.zzb, this.zza);
    }

    public final zzbfg zzd() {
        return new zzbfg(this.zzb);
    }

    public final i6.a zze() {
        return this.zza;
    }

    public final String zzf() {
        return p.C.f2979c.w(this.zzb, this.zza.f5213a);
    }

    public final WeakReference zzg() {
        return this.zzd;
    }
}
