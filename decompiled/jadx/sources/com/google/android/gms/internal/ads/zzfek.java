package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.i0;
import d6.p;
import e6.f2;
import e6.o3;
import e6.t;
import e6.w1;
import e6.y1;
import h6.r0;
import i6.h;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfek extends zzbxb {
    private final zzfeg zza;
    private final zzfdw zzb;
    private final String zzc;
    private final zzffg zzd;
    private final Context zze;
    private final i6.a zzf;
    private final zzavc zzg;
    private final zzdsm zzh;
    private zzdor zzi;
    private boolean zzj = ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzaL)).booleanValue();

    public zzfek(String str, zzfeg zzfegVar, Context context, zzfdw zzfdwVar, zzffg zzffgVar, i6.a aVar, zzavc zzavcVar, zzdsm zzdsmVar) {
        this.zzc = str;
        this.zza = zzfegVar;
        this.zzb = zzfdwVar;
        this.zzd = zzffgVar;
        this.zze = context;
        this.zzf = aVar;
        this.zzg = zzavcVar;
        this.zzh = zzdsmVar;
    }

    private final synchronized void zzu(o3 o3Var, zzbxj zzbxjVar, int i) throws RemoteException {
        try {
            boolean z4 = false;
            if (!o3Var.f3373c.getBoolean("is_sdk_preload", false)) {
                if (((Boolean) zzbel.zzk.zze()).booleanValue()) {
                    if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkP)).booleanValue()) {
                        z4 = true;
                    }
                }
                if (this.zzf.f5215c < ((Integer) t.f3437d.f3440c.zza(zzbcn.zzkQ)).intValue() || !z4) {
                    i0.d("#008 Must be called on the main UI thread.");
                }
            }
            this.zzb.zzk(zzbxjVar);
            r0 r0Var = p.C.f2979c;
            if (r0.f(this.zze) && o3Var.D == null) {
                h.d("Failed to load the ad because app ID is missing.");
                this.zzb.zzdB(zzfgq.zzd(4, null, null));
                return;
            }
            if (this.zzi != null) {
                return;
            }
            zzfdy zzfdyVar = new zzfdy(null);
            this.zza.zzj(i);
            this.zza.zzb(o3Var, this.zzc, zzfdyVar, new zzfej(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final Bundle zzb() {
        i0.d("#008 Must be called on the main UI thread.");
        zzdor zzdorVar = this.zzi;
        return zzdorVar != null ? zzdorVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final f2 zzc() {
        zzdor zzdorVar;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzgD)).booleanValue() && (zzdorVar = this.zzi) != null) {
            return zzdorVar.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final zzbwz zzd() {
        i0.d("#008 Must be called on the main UI thread.");
        zzdor zzdorVar = this.zzi;
        if (zzdorVar != null) {
            return zzdorVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final synchronized String zze() throws RemoteException {
        zzdor zzdorVar = this.zzi;
        if (zzdorVar == null || zzdorVar.zzm() == null) {
            return null;
        }
        return zzdorVar.zzm().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final synchronized void zzf(o3 o3Var, zzbxj zzbxjVar) throws RemoteException {
        zzu(o3Var, zzbxjVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final synchronized void zzg(o3 o3Var, zzbxj zzbxjVar) throws RemoteException {
        zzu(o3Var, zzbxjVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final synchronized void zzh(boolean z4) {
        i0.d("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzi(w1 w1Var) {
        if (w1Var == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new zzfei(this, w1Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzj(y1 y1Var) {
        i0.d("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!y1Var.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e) {
            h.c("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzb.zzi(y1Var);
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzk(zzbxf zzbxfVar) {
        i0.d("#008 Must be called on the main UI thread.");
        this.zzb.zzj(zzbxfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final synchronized void zzl(zzbxq zzbxqVar) {
        i0.d("#008 Must be called on the main UI thread.");
        zzffg zzffgVar = this.zzd;
        zzffgVar.zza = zzbxqVar.zza;
        zzffgVar.zzb = zzbxqVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final synchronized void zzm(q7.a aVar) throws RemoteException {
        zzn(aVar, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final synchronized void zzn(q7.a aVar, boolean z4) throws RemoteException {
        i0.d("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            h.g("Rewarded can not be shown before loaded");
            this.zzb.zzq(zzfgq.zzd(9, null, null));
            return;
        }
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzcS)).booleanValue()) {
            this.zzg.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzi.zzh(z4, (Activity) b.I(aVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final boolean zzo() {
        i0.d("#008 Must be called on the main UI thread.");
        zzdor zzdorVar = this.zzi;
        return (zzdorVar == null || zzdorVar.zzf()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzp(zzbxk zzbxkVar) {
        i0.d("#008 Must be called on the main UI thread.");
        this.zzb.zzo(zzbxkVar);
    }
}
