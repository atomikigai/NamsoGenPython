package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzchr implements zzhfx {
    private final zzchn zza;

    public zzchr(zzchn zzchnVar) {
        this.zza = zzchnVar;
    }

    public static WeakReference zzc(zzchn zzchnVar) {
        WeakReference weakReferenceZzg = zzchnVar.zzg();
        zzhgf.zzb(weakReferenceZzg);
        return weakReferenceZzg;
    }

    public final WeakReference zza() {
        return zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
