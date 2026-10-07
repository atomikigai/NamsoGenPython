package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcbd implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcbj zzc;

    public zzcbd(zzcbj zzcbjVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzcbjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbj zzcbjVar = this.zzc;
        if (zzcbjVar.zzq != null) {
            zzcbjVar.zzq.zzb(this.zza, this.zzb);
        }
    }
}
