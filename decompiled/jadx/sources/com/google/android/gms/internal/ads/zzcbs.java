package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcbs implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcbt zzb;

    public zzcbs(zzcbt zzcbtVar, boolean z4) {
        this.zza = z4;
        this.zzb = zzcbtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
