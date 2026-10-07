package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.b;
import i6.h;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbbf implements b {
    final /* synthetic */ zzbax zza;
    final /* synthetic */ zzcao zzb;
    final /* synthetic */ zzbbh zzc;

    public zzbbf(zzbbh zzbbhVar, zzbax zzbaxVar, zzcao zzcaoVar) {
        this.zza = zzbaxVar;
        this.zzb = zzcaoVar;
        this.zzc = zzbbhVar;
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzc.zzd) {
            try {
                zzbbh zzbbhVar = this.zzc;
                if (zzbbhVar.zzb) {
                    return;
                }
                zzbbhVar.zzb = true;
                final zzbaw zzbawVar = this.zzc.zza;
                if (zzbawVar == null) {
                    return;
                }
                final m9.a aVarZza = zzcaj.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbc
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbbf zzbbfVar = this.zza;
                        zzbaw zzbawVar2 = zzbawVar;
                        try {
                            zzbaz zzbazVarZzq = zzbawVar2.zzq();
                            zzbau zzbauVarZzg = zzbawVar2.zzp() ? zzbazVarZzq.zzg(zzbbfVar.zza) : zzbazVarZzq.zzf(zzbbfVar.zza);
                            if (!zzbauVarZzg.zze()) {
                                zzbbfVar.zzb.zzd(new RuntimeException("No entry contents."));
                                zzbbh.zze(zzbbfVar.zzc);
                                return;
                            }
                            zzbbe zzbbeVar = new zzbbe(zzbbfVar, zzbauVarZzg.zzc(), 1);
                            int i = zzbbeVar.read();
                            if (i == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            zzbbeVar.unread(i);
                            zzbbfVar.zzb.zzc(zzbbj.zzb(zzbbeVar, zzbauVarZzg.zzd(), zzbauVarZzg.zzg(), zzbauVarZzg.zza(), zzbauVarZzg.zzf()));
                        } catch (RemoteException e) {
                            e = e;
                            h.e("Unable to obtain a cache service instance.", e);
                            zzbbfVar.zzb.zzd(e);
                            zzbbh.zze(zzbbfVar.zzc);
                        } catch (IOException e4) {
                            e = e4;
                            h.e("Unable to obtain a cache service instance.", e);
                            zzbbfVar.zzb.zzd(e);
                            zzbbh.zze(zzbbfVar.zzc);
                        }
                    }
                });
                this.zzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbd
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (this.zza.zzb.isCancelled()) {
                            aVarZza.cancel(true);
                        }
                    }
                }, zzcaj.zzf);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnectionSuspended(int i) {
    }
}
