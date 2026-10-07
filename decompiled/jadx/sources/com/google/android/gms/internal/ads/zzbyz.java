package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbyz implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzbza zza;
    private final String zzb;

    public zzbyz(zzbza zzbzaVar, String str) {
        this.zza = zzbzaVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zza) {
            try {
                for (zzbyy zzbyyVar : this.zza.zzb) {
                    zzbyyVar.zza.zzb(zzbyyVar.zzb, sharedPreferences, this.zzb, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
