package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfmm implements zzgee {
    final /* synthetic */ zzfmo zza;

    public zzfmm(zzfmo zzfmoVar) {
        this.zza = zzfmoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
        this.zza.zzj.set(false);
        if ((th instanceof zzflt) && ((zzflt) th).zza() == 0) {
            throw null;
        }
        this.zza.zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zzb(Object obj) {
        this.zza.zzj.set(false);
        if (obj == null) {
            this.zza.zzo(true);
            return;
        }
        this.zza.zzi.zzc();
        this.zza.zzm(obj);
        this.zza.zzo(false);
    }
}
