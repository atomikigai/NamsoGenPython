package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.i0;
import d6.p;
import e6.c0;
import e6.c1;
import e6.e1;
import e6.f2;
import e6.j2;
import e6.l0;
import e6.l3;
import e6.m2;
import e6.o3;
import e6.q0;
import e6.q3;
import e6.t;
import e6.u3;
import e6.w;
import e6.y1;
import e6.z;
import e6.z0;
import h6.r0;
import i6.h;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzena extends l0 {
    private final q3 zza;
    private final Context zzb;
    private final zzfcw zzc;
    private final String zzd;
    private final i6.a zze;
    private final zzems zzf;
    private final zzfdw zzg;
    private final zzavc zzh;
    private final zzdsm zzi;
    private zzdfj zzj;
    private boolean zzk = ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzaL)).booleanValue();

    public zzena(Context context, q3 q3Var, String str, zzfcw zzfcwVar, zzems zzemsVar, zzfdw zzfdwVar, i6.a aVar, zzavc zzavcVar, zzdsm zzdsmVar) {
        this.zza = q3Var;
        this.zzd = str;
        this.zzb = context;
        this.zzc = zzfcwVar;
        this.zzf = zzemsVar;
        this.zzg = zzfdwVar;
        this.zze = aVar;
        this.zzh = zzavcVar;
        this.zzi = zzdsmVar;
    }

    private final synchronized boolean zze() {
        zzdfj zzdfjVar = this.zzj;
        return (zzdfjVar == null || zzdfjVar.zza()) ? false : true;
    }

    @Override // e6.m0
    public final synchronized void zzB() {
        i0.d("resume must be called on the main UI thread.");
        zzdfj zzdfjVar = this.zzj;
        if (zzdfjVar != null) {
            zzdfjVar.zzn().zzc(null);
        }
    }

    @Override // e6.m0
    public final void zzD(z zVar) {
        i0.d("setAdListener must be called on the main UI thread.");
        this.zzf.zzj(zVar);
    }

    @Override // e6.m0
    public final void zzE(q0 q0Var) {
        i0.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // e6.m0
    public final void zzG(z0 z0Var) {
        i0.d("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzm(z0Var);
    }

    @Override // e6.m0
    public final void zzJ(e1 e1Var) {
        this.zzf.zzn(e1Var);
    }

    @Override // e6.m0
    public final synchronized void zzL(boolean z4) {
        i0.d("setImmersiveMode must be called on the main UI thread.");
        this.zzk = z4;
    }

    @Override // e6.m0
    public final synchronized void zzO(zzbdi zzbdiVar) {
        i0.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzc.zzi(zzbdiVar);
    }

    @Override // e6.m0
    public final void zzP(y1 y1Var) {
        i0.d("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!y1Var.zzf()) {
                this.zzi.zze();
            }
        } catch (RemoteException e) {
            h.c("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzf.zzl(y1Var);
    }

    @Override // e6.m0
    public final void zzS(zzbwp zzbwpVar) {
        this.zzg.zzm(zzbwpVar);
    }

    @Override // e6.m0
    public final synchronized void zzW(q7.a aVar) {
        if (this.zzj == null) {
            h.g("Interstitial can not be shown before loaded.");
            this.zzf.zzq(zzfgq.zzd(9, null, null));
            return;
        }
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzcS)).booleanValue()) {
            this.zzh.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzj.zzc(this.zzk, (Activity) b.I(aVar));
    }

    @Override // e6.m0
    public final synchronized void zzX() {
        i0.d("showInterstitial must be called on the main UI thread.");
        if (this.zzj == null) {
            h.g("Interstitial can not be shown before loaded.");
            this.zzf.zzq(zzfgq.zzd(9, null, null));
        } else {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzcS)).booleanValue()) {
                this.zzh.zzc().zzn(new Throwable().getStackTrace());
            }
            this.zzj.zzc(this.zzk, null);
        }
    }

    @Override // e6.m0
    public final synchronized boolean zzY() {
        return false;
    }

    @Override // e6.m0
    public final synchronized boolean zzZ() {
        return this.zzc.zza();
    }

    @Override // e6.m0
    public final synchronized boolean zzaa() {
        i0.d("isLoaded must be called on the main UI thread.");
        return zze();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    @Override // e6.m0
    public final synchronized boolean zzab(o3 o3Var) {
        boolean z4;
        try {
            if (!o3Var.f3373c.getBoolean("is_sdk_preload", false)) {
                if (((Boolean) zzbel.zzi.zze()).booleanValue()) {
                    if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkP)).booleanValue()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                } else {
                    z4 = false;
                }
                if (this.zze.f5215c < ((Integer) t.f3437d.f3440c.zza(zzbcn.zzkQ)).intValue() || !z4) {
                    i0.d("loadAd must be called on the main UI thread.");
                }
            }
            r0 r0Var = p.C.f2979c;
            if (r0.f(this.zzb) && o3Var.D == null) {
                h.d("Failed to load the ad because app ID is missing.");
                zzems zzemsVar = this.zzf;
                if (zzemsVar != null) {
                    zzemsVar.zzdB(zzfgq.zzd(4, null, null));
                }
            } else if (!zze()) {
                zzfgl.zza(this.zzb, o3Var.f3375f);
                this.zzj = null;
                return this.zzc.zzb(o3Var, this.zzd, new zzfcp(this.zza), new zzemz(this));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // e6.m0
    public final Bundle zzd() {
        i0.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // e6.m0
    public final q3 zzg() {
        return null;
    }

    @Override // e6.m0
    public final z zzi() {
        return this.zzf.zzg();
    }

    @Override // e6.m0
    public final z0 zzj() {
        return this.zzf.zzi();
    }

    @Override // e6.m0
    public final synchronized f2 zzk() {
        zzdfj zzdfjVar;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzgD)).booleanValue() && (zzdfjVar = this.zzj) != null) {
            return zzdfjVar.zzm();
        }
        return null;
    }

    @Override // e6.m0
    public final j2 zzl() {
        return null;
    }

    @Override // e6.m0
    public final q7.a zzn() {
        return null;
    }

    @Override // e6.m0
    public final synchronized String zzr() {
        return this.zzd;
    }

    @Override // e6.m0
    public final synchronized String zzs() {
        zzdfj zzdfjVar = this.zzj;
        if (zzdfjVar == null || zzdfjVar.zzm() == null) {
            return null;
        }
        return zzdfjVar.zzm().zzg();
    }

    @Override // e6.m0
    public final synchronized String zzt() {
        zzdfj zzdfjVar = this.zzj;
        if (zzdfjVar == null || zzdfjVar.zzm() == null) {
            return null;
        }
        return zzdfjVar.zzm().zzg();
    }

    @Override // e6.m0
    public final synchronized void zzx() {
        i0.d("destroy must be called on the main UI thread.");
        zzdfj zzdfjVar = this.zzj;
        if (zzdfjVar != null) {
            zzdfjVar.zzn().zza(null);
        }
    }

    @Override // e6.m0
    public final void zzy(o3 o3Var, c0 c0Var) {
        this.zzf.zzk(c0Var);
        zzab(o3Var);
    }

    @Override // e6.m0
    public final synchronized void zzz() {
        i0.d("pause must be called on the main UI thread.");
        zzdfj zzdfjVar = this.zzj;
        if (zzdfjVar != null) {
            zzdfjVar.zzn().zzb(null);
        }
    }

    @Override // e6.m0
    public final void zzA() {
    }

    @Override // e6.m0
    public final void zzC(w wVar) {
    }

    @Override // e6.m0
    public final void zzF(q3 q3Var) {
    }

    @Override // e6.m0
    public final void zzH(zzbai zzbaiVar) {
    }

    @Override // e6.m0
    public final void zzI(u3 u3Var) {
    }

    @Override // e6.m0
    public final void zzK(m2 m2Var) {
    }

    @Override // e6.m0
    public final void zzM(zzbtp zzbtpVar) {
    }

    @Override // e6.m0
    public final void zzN(boolean z4) {
    }

    @Override // e6.m0
    public final void zzR(String str) {
    }

    @Override // e6.m0
    public final void zzT(String str) {
    }

    @Override // e6.m0
    public final void zzU(l3 l3Var) {
    }

    @Override // e6.m0
    public final void zzac(c1 c1Var) {
    }

    @Override // e6.m0
    public final void zzQ(zzbts zzbtsVar, String str) {
    }
}
