package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.e;
import z5.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbif extends zzbhl {
    private final l zza;

    public zzbif(l lVar) {
        this.zza = lVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhm
    public final void zze(zzbhv zzbhvVar) {
        zzbhw zzbhwVar = new zzbhw(zzbhvVar);
        e eVar = (e) this.zza;
        eVar.getClass();
        com.google.ads.mediation.a aVar = new com.google.ads.mediation.a();
        aVar.f6057l = new Bundle();
        aVar.f6049a = zzbhwVar.zzh();
        aVar.f6050b = zzbhwVar.zzk();
        aVar.f6051c = zzbhwVar.zzf();
        aVar.f6052d = zzbhwVar.zzb();
        aVar.e = zzbhwVar.zzg();
        aVar.f6053f = zzbhwVar.zze();
        aVar.f6054g = zzbhwVar.zzc();
        aVar.h = zzbhwVar.zzj();
        aVar.i = zzbhwVar.zzi();
        aVar.f6056k = zzbhwVar.zzd();
        aVar.f6058m = true;
        aVar.f6059n = true;
        aVar.f6055j = zzbhwVar.zza();
        eVar.f1956b.onAdLoaded(eVar.f1955a, aVar);
    }
}
