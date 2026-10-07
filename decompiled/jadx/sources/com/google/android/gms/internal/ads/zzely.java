package com.google.android.gms.internal.ads;

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
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzely extends l0 implements zzcyy {
    private final Context zza;
    private final zzfbf zzb;
    private final String zzc;
    private final zzems zzd;
    private q3 zze;
    private final zzffm zzf;
    private final i6.a zzg;
    private final zzdsm zzh;
    private zzcpd zzi;

    public zzely(Context context, q3 q3Var, String str, zzfbf zzfbfVar, zzems zzemsVar, i6.a aVar, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzb = zzfbfVar;
        this.zze = q3Var;
        this.zzc = str;
        this.zzd = zzemsVar;
        this.zzf = zzfbfVar.zzg();
        this.zzg = aVar;
        this.zzh = zzdsmVar;
        zzfbfVar.zzp(this);
    }

    private final synchronized void zzf(q3 q3Var) {
        this.zzf.zzs(q3Var);
        this.zzf.zzy(this.zze.f3418y);
    }

    private final synchronized boolean zzh(o3 o3Var) throws RemoteException {
        try {
            if (zzm()) {
                i0.d("loadAd must be called on the main UI thread.");
            }
            r0 r0Var = p.C.f2979c;
            if (!r0.f(this.zza) || o3Var.D != null) {
                zzfgl.zza(this.zza, o3Var.f3375f);
                return this.zzb.zzb(o3Var, this.zzc, null, new zzelx(this));
            }
            h.d("Failed to load the ad because app ID is missing.");
            zzems zzemsVar = this.zzd;
            if (zzemsVar != null) {
                zzemsVar.zzdB(zzfgq.zzd(4, null, null));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    private final boolean zzm() {
        boolean z4;
        if (((Boolean) zzbel.zzf.zze()).booleanValue()) {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkP)).booleanValue()) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        return this.zzg.f5215c < ((Integer) t.f3437d.f3440c.zza(zzbcn.zzkQ)).intValue() || !z4;
    }

    @Override // e6.m0
    public final synchronized void zzA() {
        i0.d("recordManualImpression must be called on the main UI thread.");
        zzcpd zzcpdVar = this.zzi;
        if (zzcpdVar != null) {
            zzcpdVar.zzh();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003d, B:15:0x0041, B:12:0x0038), top: B:22:0x0001 }] */
    @Override // e6.m0
    public final synchronized void zzB() {
        try {
            if (((Boolean) zzbel.zzh.zze()).booleanValue()) {
                zzbce zzbceVar = zzbcn.zzkL;
                t tVar = t.f3437d;
                if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                    if (this.zzg.f5215c < ((Integer) tVar.f3440c.zza(zzbcn.zzkR)).intValue()) {
                        i0.d("resume must be called on the main UI thread.");
                    }
                } else {
                    i0.d("resume must be called on the main UI thread.");
                }
            } else {
                i0.d("resume must be called on the main UI thread.");
            }
            zzcpd zzcpdVar = this.zzi;
            if (zzcpdVar != null) {
                zzcpdVar.zzn().zzc(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // e6.m0
    public final void zzC(w wVar) {
        if (zzm()) {
            i0.d("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzo(wVar);
    }

    @Override // e6.m0
    public final void zzD(z zVar) {
        if (zzm()) {
            i0.d("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zzj(zVar);
    }

    @Override // e6.m0
    public final void zzE(q0 q0Var) {
        i0.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // e6.m0
    public final synchronized void zzF(q3 q3Var) {
        i0.d("setAdSize must be called on the main UI thread.");
        this.zzf.zzs(q3Var);
        this.zze = q3Var;
        zzcpd zzcpdVar = this.zzi;
        if (zzcpdVar != null) {
            zzcpdVar.zzi(this.zzb.zzc(), q3Var);
        }
    }

    @Override // e6.m0
    public final void zzG(z0 z0Var) {
        if (zzm()) {
            i0.d("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzm(z0Var);
    }

    @Override // e6.m0
    public final synchronized void zzN(boolean z4) {
        try {
            if (zzm()) {
                i0.d("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.zzf.zzB(z4);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // e6.m0
    public final synchronized void zzO(zzbdi zzbdiVar) {
        i0.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zzq(zzbdiVar);
    }

    @Override // e6.m0
    public final void zzP(y1 y1Var) {
        if (zzm()) {
            i0.d("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!y1Var.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e) {
            h.c("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzd.zzl(y1Var);
    }

    @Override // e6.m0
    public final synchronized void zzU(l3 l3Var) {
        try {
            if (zzm()) {
                i0.d("setVideoOptions must be called on the main UI thread.");
            }
            this.zzf.zzI(l3Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // e6.m0
    public final synchronized boolean zzY() {
        zzcpd zzcpdVar = this.zzi;
        return zzcpdVar != null && zzcpdVar.zzs();
    }

    @Override // e6.m0
    public final synchronized boolean zzZ() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final synchronized void zza() {
        try {
            if (!this.zzb.zzt()) {
                this.zzb.zzm();
                return;
            }
            q3 q3VarZzh = this.zzf.zzh();
            zzcpd zzcpdVar = this.zzi;
            if (zzcpdVar != null && zzcpdVar.zzg() != null && this.zzf.zzT()) {
                q3VarZzh = zzffu.zza(this.zza, Collections.singletonList(this.zzi.zzg()));
            }
            zzf(q3VarZzh);
            this.zzf.zzx(true);
            try {
                zzh(this.zzf.zzf());
            } catch (RemoteException unused) {
                h.g("Failed to refresh the banner ad.");
            }
            this.zzf.zzx(false);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // e6.m0
    public final boolean zzaa() {
        return false;
    }

    @Override // e6.m0
    public final synchronized boolean zzab(o3 o3Var) throws RemoteException {
        zzf(this.zze);
        return zzh(o3Var);
    }

    @Override // e6.m0
    public final synchronized void zzac(c1 c1Var) {
        i0.d("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzV(c1Var);
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final synchronized void zzb() throws ExecutionException, InterruptedException {
        if (this.zzb.zzt()) {
            this.zzb.zzr();
        } else {
            this.zzb.zzn();
        }
    }

    @Override // e6.m0
    public final Bundle zzd() {
        i0.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // e6.m0
    public final synchronized q3 zzg() {
        i0.d("getAdSize must be called on the main UI thread.");
        zzcpd zzcpdVar = this.zzi;
        if (zzcpdVar != null) {
            return zzffu.zza(this.zza, Collections.singletonList(zzcpdVar.zzf()));
        }
        return this.zzf.zzh();
    }

    @Override // e6.m0
    public final z zzi() {
        return this.zzd.zzg();
    }

    @Override // e6.m0
    public final z0 zzj() {
        return this.zzd.zzi();
    }

    @Override // e6.m0
    public final synchronized f2 zzk() {
        zzcpd zzcpdVar;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzgD)).booleanValue() && (zzcpdVar = this.zzi) != null) {
            return zzcpdVar.zzm();
        }
        return null;
    }

    @Override // e6.m0
    public final synchronized j2 zzl() {
        i0.d("getVideoController must be called from the main thread.");
        zzcpd zzcpdVar = this.zzi;
        if (zzcpdVar == null) {
            return null;
        }
        return zzcpdVar.zze();
    }

    @Override // e6.m0
    public final q7.a zzn() {
        if (zzm()) {
            i0.d("getAdFrame must be called on the main UI thread.");
        }
        return new b(this.zzb.zzc());
    }

    @Override // e6.m0
    public final synchronized String zzr() {
        return this.zzc;
    }

    @Override // e6.m0
    public final synchronized String zzs() {
        zzcpd zzcpdVar = this.zzi;
        if (zzcpdVar == null || zzcpdVar.zzm() == null) {
            return null;
        }
        return zzcpdVar.zzm().zzg();
    }

    @Override // e6.m0
    public final synchronized String zzt() {
        zzcpd zzcpdVar = this.zzi;
        if (zzcpdVar == null || zzcpdVar.zzm() == null) {
            return null;
        }
        return zzcpdVar.zzm().zzg();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003d, B:15:0x0041, B:12:0x0038), top: B:22:0x0001 }] */
    @Override // e6.m0
    public final synchronized void zzx() {
        try {
            if (((Boolean) zzbel.zze.zze()).booleanValue()) {
                zzbce zzbceVar = zzbcn.zzkM;
                t tVar = t.f3437d;
                if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                    if (this.zzg.f5215c < ((Integer) tVar.f3440c.zza(zzbcn.zzkR)).intValue()) {
                        i0.d("destroy must be called on the main UI thread.");
                    }
                } else {
                    i0.d("destroy must be called on the main UI thread.");
                }
            } else {
                i0.d("destroy must be called on the main UI thread.");
            }
            zzcpd zzcpdVar = this.zzi;
            if (zzcpdVar != null) {
                zzcpdVar.zzb();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003d, B:15:0x0041, B:12:0x0038), top: B:22:0x0001 }] */
    @Override // e6.m0
    public final synchronized void zzz() {
        try {
            if (((Boolean) zzbel.zzg.zze()).booleanValue()) {
                zzbce zzbceVar = zzbcn.zzkN;
                t tVar = t.f3437d;
                if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                    if (this.zzg.f5215c < ((Integer) tVar.f3440c.zza(zzbcn.zzkR)).intValue()) {
                        i0.d("pause must be called on the main UI thread.");
                    }
                } else {
                    i0.d("pause must be called on the main UI thread.");
                }
            } else {
                i0.d("pause must be called on the main UI thread.");
            }
            zzcpd zzcpdVar = this.zzi;
            if (zzcpdVar != null) {
                zzcpdVar.zzn().zzb(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // e6.m0
    public final void zzX() {
    }

    @Override // e6.m0
    public final void zzH(zzbai zzbaiVar) {
    }

    @Override // e6.m0
    public final void zzI(u3 u3Var) {
    }

    @Override // e6.m0
    public final void zzJ(e1 e1Var) {
    }

    @Override // e6.m0
    public final void zzK(m2 m2Var) {
    }

    @Override // e6.m0
    public final void zzL(boolean z4) {
    }

    @Override // e6.m0
    public final void zzM(zzbtp zzbtpVar) {
    }

    @Override // e6.m0
    public final void zzR(String str) {
    }

    @Override // e6.m0
    public final void zzS(zzbwp zzbwpVar) {
    }

    @Override // e6.m0
    public final void zzT(String str) {
    }

    @Override // e6.m0
    public final void zzW(q7.a aVar) {
    }

    @Override // e6.m0
    public final void zzQ(zzbts zzbtsVar, String str) {
    }

    @Override // e6.m0
    public final void zzy(o3 o3Var, c0 c0Var) {
    }
}
