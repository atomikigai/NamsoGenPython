package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.i0;
import e6.f2;
import e6.m0;
import e6.t;
import e6.y1;
import i6.h;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcoy extends zzbae {
    private final zzcox zza;
    private final m0 zzb;
    private final zzfar zzc;
    private boolean zzd = ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzaO)).booleanValue();
    private final zzdsm zze;

    public zzcoy(zzcox zzcoxVar, m0 m0Var, zzfar zzfarVar, zzdsm zzdsmVar) {
        this.zza = zzcoxVar;
        this.zzb = m0Var;
        this.zzc = zzfarVar;
        this.zze = zzdsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbaf
    public final m0 zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbaf
    public final f2 zzf() {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzgD)).booleanValue()) {
            return this.zza.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbaf
    public final void zzg(boolean z4) {
        this.zzd = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzbaf
    public final void zzh(y1 y1Var) {
        i0.d("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!y1Var.zzf()) {
                    this.zze.zze();
                }
            } catch (RemoteException e) {
                h.c("Error in making CSI ping for reporting paid event callback", e);
            }
            this.zzc.zzn(y1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbaf
    public final void zzi(q7.a aVar, zzbam zzbamVar) {
        try {
            this.zzc.zzp(zzbamVar);
            this.zza.zzd((Activity) b.I(aVar), zzbamVar, this.zzd);
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }
}
