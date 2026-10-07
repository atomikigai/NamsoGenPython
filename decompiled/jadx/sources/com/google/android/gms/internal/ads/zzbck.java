package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbck implements zzbfc {
    final /* synthetic */ SharedPreferences zza;

    public zzbck(zzbcl zzbclVar, SharedPreferences sharedPreferences) {
        this.zza = sharedPreferences;
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final Boolean zza(String str, boolean z4) {
        try {
            return Boolean.valueOf(this.zza.getBoolean(str, z4));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.zza.getString(str, String.valueOf(z4)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final Double zzb(String str, double d10) {
        try {
            return Double.valueOf(this.zza.getFloat(str, (float) d10));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.zza.getString(str, String.valueOf(d10)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final Long zzc(String str, long j4) {
        try {
            return Long.valueOf(this.zza.getLong(str, j4));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.zza.getInt(str, (int) j4));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final String zzd(String str, String str2) {
        return this.zza.getString(str, str2);
    }
}
