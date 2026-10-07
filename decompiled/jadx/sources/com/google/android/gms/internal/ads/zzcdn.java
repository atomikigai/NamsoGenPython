package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcdn implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ int zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ zzcdr zzj;

    public zzcdn(zzcdr zzcdrVar, String str, String str2, int i, int i10, long j4, long j10, boolean z4, int i11, int i12) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i10;
        this.zze = j4;
        this.zzf = j10;
        this.zzg = z4;
        this.zzh = i11;
        this.zzi = i12;
        this.zzj = zzcdrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.zza);
        map.put("cachedSrc", this.zzb);
        map.put("bytesLoaded", Integer.toString(this.zzc));
        map.put("totalBytes", Integer.toString(this.zzd));
        map.put("bufferedDuration", Long.toString(this.zze));
        map.put("totalDuration", Long.toString(this.zzf));
        map.put("cacheReady", true != this.zzg ? "0" : "1");
        map.put("playerCount", Integer.toString(this.zzh));
        map.put("playerPreparedCount", Integer.toString(this.zzi));
        zzcdr.zze(this.zzj, "onPrecacheEvent", map);
    }
}
