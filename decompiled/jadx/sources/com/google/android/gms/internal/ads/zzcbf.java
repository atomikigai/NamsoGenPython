package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcbf implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcbj zzc;

    public zzcbf(zzcbj zzcbjVar, int i, int i10) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = zzcbjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbj zzcbjVar = this.zzc;
        if (zzcbjVar.zzq != null) {
            zzcbjVar.zzq.zzj(this.zza, this.zzb);
        }
    }
}
