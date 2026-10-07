package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzawn implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzawo zza;

    public zzawn(zzawo zzawoVar) {
        this.zza = zzawoVar;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z4) {
        if (z4) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        zzawo zzawoVar = this.zza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (zzawoVar.zzc > 0) {
            zzawo zzawoVar2 = this.zza;
            if (jCurrentTimeMillis >= zzawoVar2.zzc) {
                zzawoVar2.zzd = jCurrentTimeMillis - zzawoVar2.zzc;
            }
        }
        this.zza.zze = false;
    }
}
