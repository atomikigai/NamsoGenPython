package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import e6.t;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbce {
    private final int zza;
    private final String zzb;
    private final Object zzc;
    private final Object zzd;

    public zzbce(int i, String str, Object obj, Object obj2, zzbcd zzbcdVar) {
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        t.f3437d.f3438a.zzd(this);
    }

    public static zzbce zzf(int i, String str, float f10, float f11) {
        return new zzbcb(1, str, Float.valueOf(f10), Float.valueOf(f11));
    }

    public static zzbce zzg(int i, String str, int i10, int i11) {
        return new zzbbz(1, str, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static zzbce zzh(int i, String str, long j4, long j10) {
        return new zzbca(1, str, Long.valueOf(j4), Long.valueOf(j10));
    }

    public static zzbce zzi(int i, String str) {
        zzbcc zzbccVar = new zzbcc(1, "gads:sdk_core_constants:experiment_id", null, null);
        t.f3437d.f3438a.zzc(zzbccVar);
        return zzbccVar;
    }

    public abstract Object zza(JSONObject jSONObject);

    public abstract Object zzb(Bundle bundle);

    public abstract Object zzc(SharedPreferences sharedPreferences);

    public abstract void zzd(SharedPreferences.Editor editor, Object obj);

    public final int zze() {
        return this.zza;
    }

    public final Object zzj() {
        return t.f3437d.f3440c.zza(this);
    }

    public final Object zzk() {
        return t.f3437d.f3440c.zzf() ? this.zzd : this.zzc;
    }

    public final String zzl() {
        return this.zzb;
    }
}
