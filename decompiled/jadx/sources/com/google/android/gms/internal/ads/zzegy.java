package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import i6.h;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzegy extends zzbwt implements zzcxw {
    private zzbwu zza;
    private zzcxv zzb;
    private zzdew zzc;

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final synchronized void zza(zzcxv zzcxvVar) {
        this.zzb = zzcxvVar;
    }

    public final synchronized void zzc(zzbwu zzbwuVar) {
        this.zza = zzbwuVar;
    }

    public final synchronized void zzd(zzdew zzdewVar) {
        this.zzc = zzdewVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final synchronized void zze(q7.a aVar) throws RemoteException {
        zzbwu zzbwuVar = this.zza;
        if (zzbwuVar != null) {
            ((zzekd) zzbwuVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final synchronized void zzf(q7.a aVar) throws RemoteException {
        zzbwu zzbwuVar = this.zza;
        if (zzbwuVar != null) {
            zzbwuVar.zzf(aVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final synchronized void zzg(q7.a aVar, int i) throws RemoteException {
        zzcxv zzcxvVar = this.zzb;
        if (zzcxvVar != null) {
            zzcxvVar.zza(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final synchronized void zzh(q7.a aVar) throws RemoteException {
        zzbwu zzbwuVar = this.zza;
        if (zzbwuVar != null) {
            ((zzekd) zzbwuVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final synchronized void zzi(q7.a aVar) throws RemoteException {
        zzcxv zzcxvVar = this.zzb;
        if (zzcxvVar != null) {
            zzcxvVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final synchronized void zzj(q7.a aVar) throws RemoteException {
        zzbwu zzbwuVar = this.zza;
        if (zzbwuVar != null) {
            ((zzekd) zzbwuVar).zza.zzdr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final synchronized void zzk(q7.a aVar, int i) throws RemoteException {
        zzdew zzdewVar = this.zzc;
        if (zzdewVar != null) {
            h.g("Fail to initialize adapter ".concat(String.valueOf(((zzekc) zzdewVar).zzc.zza)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final synchronized void zzl(q7.a aVar) throws RemoteException {
        zzdew zzdewVar = this.zzc;
        if (zzdewVar != null) {
            Executor executor = ((zzekc) zzdewVar).zzd.zzb;
            final zzekc zzekcVar = (zzekc) zzdewVar;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzekb
                @Override // java.lang.Runnable
                public final void run() {
                    zzekc zzekcVar2 = zzekcVar;
                    zzeke zzekeVar = zzekcVar2.zzd;
                    zzeke.zze(zzekcVar2.zza, zzekcVar2.zzb, zzekcVar2.zzc);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final synchronized void zzm(q7.a aVar, zzbwv zzbwvVar) throws RemoteException {
        zzbwu zzbwuVar = this.zza;
        if (zzbwuVar != null) {
            ((zzekd) zzbwuVar).zzd.zza(zzbwvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final synchronized void zzn(q7.a aVar) throws RemoteException {
        zzbwu zzbwuVar = this.zza;
        if (zzbwuVar != null) {
            ((zzekd) zzbwuVar).zzc.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final synchronized void zzo(q7.a aVar) throws RemoteException {
        zzbwu zzbwuVar = this.zza;
        if (zzbwuVar != null) {
            ((zzekd) zzbwuVar).zzd.zzc();
        }
    }
}
