package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzapa implements Runnable {
    final /* synthetic */ zzapp zza;
    final /* synthetic */ zzapb zzb;

    public zzapa(zzapb zzapbVar, zzapp zzappVar) {
        this.zza = zzappVar;
        this.zzb = zzapbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
