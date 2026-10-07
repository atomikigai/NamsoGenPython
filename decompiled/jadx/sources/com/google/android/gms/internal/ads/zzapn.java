package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzapn implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzapp zzc;

    public zzapn(zzapp zzappVar, String str, long j4) {
        this.zza = str;
        this.zzb = j4;
        this.zzc = zzappVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zza(this.zza, this.zzb);
        zzapp zzappVar = this.zzc;
        zzappVar.zza.zzb(zzappVar.toString());
    }
}
