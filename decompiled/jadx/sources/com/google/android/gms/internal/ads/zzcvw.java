package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcvw {
    private final Context zza;
    private final zzffo zzb;
    private final Bundle zzc;
    private final zzffg zzd;
    private final zzcvo zze;
    private final zzefg zzf;

    public /* synthetic */ zzcvw(zzcvu zzcvuVar, zzcvv zzcvvVar) {
        this.zza = zzcvuVar.zza;
        this.zzb = zzcvuVar.zzb;
        this.zzc = zzcvuVar.zzc;
        this.zzd = zzcvuVar.zzd;
        this.zze = zzcvuVar.zze;
        this.zzf = zzcvuVar.zzf;
    }

    public final Context zza(Context context) {
        return this.zza;
    }

    public final Bundle zzb() {
        return this.zzc;
    }

    public final zzcvo zzc() {
        return this.zze;
    }

    public final zzcvu zzd() {
        zzcvu zzcvuVar = new zzcvu();
        zzcvuVar.zze(this.zza);
        zzcvuVar.zzi(this.zzb);
        zzcvuVar.zzf(this.zzc);
        zzcvuVar.zzg(this.zze);
        zzcvuVar.zzd(this.zzf);
        return zzcvuVar;
    }

    public final zzefg zze(String str) {
        zzefg zzefgVar = this.zzf;
        return zzefgVar != null ? zzefgVar : new zzefg(str);
    }

    public final zzffg zzf() {
        return this.zzd;
    }

    public final zzffo zzg() {
        return this.zzb;
    }
}
