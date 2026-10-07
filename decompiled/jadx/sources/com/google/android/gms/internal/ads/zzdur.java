package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdur implements zzddm {
    private final Bundle zza = new Bundle();

    @Override // com.google.android.gms.internal.ads.zzddm
    public final synchronized void zzb(String str, String str2) {
        this.zza.putInt(str, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final synchronized void zzc(String str) {
        this.zza.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final synchronized void zzd(String str) {
        this.zza.putInt(str, 2);
    }

    public final synchronized Bundle zzg() {
        return new Bundle(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final void zza(String str) {
    }
}
