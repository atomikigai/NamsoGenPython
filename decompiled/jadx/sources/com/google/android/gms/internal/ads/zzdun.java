package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import d6.p;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzdun implements zzgee {
    final /* synthetic */ zzdup zza;

    public zzdun(zzdup zzdupVar) {
        this.zza = zzdupVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
        synchronized (this) {
            this.zza.zzc = true;
            zzdup zzdupVar = this.zza;
            p.C.f2983j.getClass();
            zzdupVar.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (SystemClock.elapsedRealtime() - this.zza.zzd));
            this.zza.zze.zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zzb(Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            this.zza.zzc = true;
            zzdup zzdupVar = this.zza;
            p.C.f2983j.getClass();
            zzdupVar.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (SystemClock.elapsedRealtime() - this.zza.zzd));
            this.zza.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdum
                @Override // java.lang.Runnable
                public final void run() {
                    zzdup.zzj(this.zza.zza, str);
                }
            });
        }
    }
}
