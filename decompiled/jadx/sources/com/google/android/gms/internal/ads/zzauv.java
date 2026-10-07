package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzauv implements Runnable {
    final /* synthetic */ zzauw zza;

    public zzauv(zzauw zzauwVar) {
        this.zza = zzauwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        if (this.zza.zzb != null) {
            return;
        }
        synchronized (zzauw.zzc) {
            if (this.zza.zzb != null) {
                return;
            }
            boolean z4 = false;
            try {
                zBooleanValue = ((Boolean) zzbcn.zzcE.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    zzauw.zza = zzfrr.zzb(this.zza.zze.zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z4 = zBooleanValue;
            this.zza.zzb = Boolean.valueOf(z4);
            zzauw.zzc.open();
        }
    }
}
