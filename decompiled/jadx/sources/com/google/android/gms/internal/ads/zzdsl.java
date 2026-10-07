package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdsl {
    final /* synthetic */ zzdsm zza;
    private final Map zzb = new ConcurrentHashMap();

    public zzdsl(zzdsm zzdsmVar) {
        this.zza = zzdsmVar;
    }

    public static /* bridge */ /* synthetic */ zzdsl zza(zzdsl zzdslVar) {
        zzdslVar.zzb.putAll(zzdslVar.zza.zzc);
        return zzdslVar;
    }

    public final zzdsl zzb(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdsl zzc(zzfet zzfetVar) {
        zzb("aai", zzfetVar.zzw);
        zzb("request_id", zzfetVar.zzan);
        zzb("ad_format", zzfet.zza(zzfetVar.zzb));
        return this;
    }

    public final zzdsl zzd(zzfew zzfewVar) {
        zzb("gqi", zzfewVar.zzb);
        return this;
    }

    public final String zze() {
        return this.zza.zza.zzb(this.zzb);
    }

    public final void zzf() {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsj
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh();
            }
        });
    }

    public final void zzg() {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsk
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzi();
            }
        });
    }

    public final /* synthetic */ void zzh() {
        this.zza.zza.zzf(this.zzb);
    }

    public final /* synthetic */ void zzi() {
        this.zza.zza.zze(this.zzb);
    }
}
