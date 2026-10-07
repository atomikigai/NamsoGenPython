package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzapf implements Runnable {
    private final zzapp zza;
    private final zzapv zzb;
    private final Runnable zzc;

    public zzapf(zzapp zzappVar, zzapv zzapvVar, Runnable runnable) {
        this.zza = zzappVar;
        this.zzb = zzapvVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzw();
        zzapv zzapvVar = this.zzb;
        if (zzapvVar.zzc()) {
            this.zza.zzo(zzapvVar.zza);
        } else {
            this.zza.zzn(zzapvVar.zzc);
        }
        if (this.zzb.zzd) {
            this.zza.zzm("intermediate-response");
        } else {
            this.zza.zzp("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}
