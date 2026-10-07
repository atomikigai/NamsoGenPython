package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzpm {
    private final Handler zza;
    private final zzpn zzb;

    public zzpm(Handler handler, zzpn zzpnVar) {
        this.zza = zzpnVar == null ? null : handler;
        this.zzb = zzpnVar;
    }

    public final void zza(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpg
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj(exc);
                }
            });
        }
    }

    public final void zzb(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzph
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzk(exc);
                }
            });
        }
    }

    public final void zzc(final zzpo zzpoVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpe
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzl(zzpoVar);
                }
            });
        }
    }

    public final void zzd(final zzpo zzpoVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpf
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzm(zzpoVar);
                }
            });
        }
    }

    public final void zze(final String str, final long j4, final long j10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpk
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzn(str, j4, j10);
                }
            });
        }
    }

    public final void zzf(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpl
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzo(str);
                }
            });
        }
    }

    public final void zzg(final zzhx zzhxVar) {
        zzhxVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpb
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzp(zzhxVar);
                }
            });
        }
    }

    public final void zzh(final zzhx zzhxVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpa
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzq(zzhxVar);
                }
            });
        }
    }

    public final void zzi(final zzad zzadVar, final zzhy zzhyVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpi
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzr(zzadVar, zzhyVar);
                }
            });
        }
    }

    public final /* synthetic */ void zzj(Exception exc) {
        int i = zzen.zza;
        this.zzb.zza(exc);
    }

    public final /* synthetic */ void zzk(Exception exc) {
        int i = zzen.zza;
        this.zzb.zzh(exc);
    }

    public final /* synthetic */ void zzl(zzpo zzpoVar) {
        int i = zzen.zza;
        this.zzb.zzi(zzpoVar);
    }

    public final /* synthetic */ void zzm(zzpo zzpoVar) {
        int i = zzen.zza;
        this.zzb.zzj(zzpoVar);
    }

    public final /* synthetic */ void zzn(String str, long j4, long j10) {
        int i = zzen.zza;
        this.zzb.zzb(str, j4, j10);
    }

    public final /* synthetic */ void zzo(String str) {
        int i = zzen.zza;
        this.zzb.zzc(str);
    }

    public final /* synthetic */ void zzp(zzhx zzhxVar) {
        zzhxVar.zza();
        int i = zzen.zza;
        this.zzb.zzd(zzhxVar);
    }

    public final /* synthetic */ void zzq(zzhx zzhxVar) {
        int i = zzen.zza;
        this.zzb.zze(zzhxVar);
    }

    public final /* synthetic */ void zzr(zzad zzadVar, zzhy zzhyVar) {
        int i = zzen.zza;
        this.zzb.zzf(zzadVar, zzhyVar);
    }

    public final /* synthetic */ void zzs(long j4) {
        int i = zzen.zza;
        this.zzb.zzg(j4);
    }

    public final /* synthetic */ void zzt(boolean z4) {
        int i = zzen.zza;
        this.zzb.zzn(z4);
    }

    public final /* synthetic */ void zzu(int i, long j4, long j10) {
        int i10 = zzen.zza;
        this.zzb.zzk(i, j4, j10);
    }

    public final void zzv(final long j4) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpc
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzs(j4);
                }
            });
        }
    }

    public final void zzw(final boolean z4) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpj
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzt(z4);
                }
            });
        }
    }

    public final void zzx(final int i, final long j4, final long j10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpd
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzu(i, j4, j10);
                }
            });
        }
    }
}
