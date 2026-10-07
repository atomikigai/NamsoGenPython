package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzefc implements zzefb {
    public final zzefb zza;
    private final zzfwh zzb;

    public zzefc(zzefb zzefbVar, zzfwh zzfwhVar) {
        this.zza = zzefbVar;
        this.zzb = zzfwhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final m9.a zza(zzfff zzfffVar, zzfet zzfetVar) {
        return zzgei.zzm(this.zza.zza(zzfffVar, zzfetVar), this.zzb, zzcaj.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final boolean zzb(zzfff zzfffVar, zzfet zzfetVar) {
        return this.zza.zzb(zzfffVar, zzfetVar);
    }
}
