package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzcpk {
    private final zzcro zza;
    private final View zzb;
    private final zzfeu zzc;
    private final zzcfk zzd;

    public zzcpk(View view, zzcfk zzcfkVar, zzcro zzcroVar, zzfeu zzfeuVar) {
        this.zzb = view;
        this.zzd = zzcfkVar;
        this.zza = zzcroVar;
        this.zzc = zzfeuVar;
    }

    public final View zza() {
        return this.zzb;
    }

    public final zzcfk zzb() {
        return this.zzd;
    }

    public final zzcro zzc() {
        return this.zza;
    }

    public zzcxy zzd(Set set) {
        return new zzcxy(set);
    }

    public final zzfeu zze() {
        return this.zzc;
    }
}
