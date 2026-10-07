package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzabf {
    private final Handler zza;
    private final zzabg zzb;

    public zzabf(Handler handler, zzabg zzabgVar) {
        this.zza = zzabgVar == null ? null : handler;
        this.zzb = zzabgVar;
    }

    public final void zza(final String str, final long j4, final long j10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaav
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzg(str, j4, j10);
                }
            });
        }
    }

    public final void zzb(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabe
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzh(str);
                }
            });
        }
    }

    public final void zzc(final zzhx zzhxVar) {
        zzhxVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabd
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzi(zzhxVar);
                }
            });
        }
    }

    public final void zzd(final int i, final long j4) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaax
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj(i, j4);
                }
            });
        }
    }

    public final void zze(final zzhx zzhxVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabb
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzk(zzhxVar);
                }
            });
        }
    }

    public final void zzf(final zzad zzadVar, final zzhy zzhyVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabc
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzl(zzadVar, zzhyVar);
                }
            });
        }
    }

    public final /* synthetic */ void zzg(String str, long j4, long j10) {
        int i = zzen.zza;
        this.zzb.zzp(str, j4, j10);
    }

    public final /* synthetic */ void zzh(String str) {
        int i = zzen.zza;
        this.zzb.zzq(str);
    }

    public final /* synthetic */ void zzi(zzhx zzhxVar) {
        zzhxVar.zza();
        int i = zzen.zza;
        this.zzb.zzr(zzhxVar);
    }

    public final /* synthetic */ void zzj(int i, long j4) {
        int i10 = zzen.zza;
        this.zzb.zzl(i, j4);
    }

    public final /* synthetic */ void zzk(zzhx zzhxVar) {
        int i = zzen.zza;
        this.zzb.zzs(zzhxVar);
    }

    public final /* synthetic */ void zzl(zzad zzadVar, zzhy zzhyVar) {
        int i = zzen.zza;
        this.zzb.zzu(zzadVar, zzhyVar);
    }

    public final /* synthetic */ void zzm(Object obj, long j4) {
        int i = zzen.zza;
        this.zzb.zzm(obj, j4);
    }

    public final /* synthetic */ void zzn(long j4, int i) {
        int i10 = zzen.zza;
        this.zzb.zzt(j4, i);
    }

    public final /* synthetic */ void zzo(Exception exc) {
        int i = zzen.zza;
        this.zzb.zzo(exc);
    }

    public final /* synthetic */ void zzp(zzci zzciVar) {
        int i = zzen.zza;
        this.zzb.zzv(zzciVar);
    }

    public final void zzq(final Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaay
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzm(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final void zzr(final long j4, final int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaaz
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzn(j4, i);
                }
            });
        }
    }

    public final void zzs(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaba
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzo(exc);
                }
            });
        }
    }

    public final void zzt(final zzci zzciVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaaw
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzp(zzciVar);
                }
            });
        }
    }
}
