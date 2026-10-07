package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
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
import g6.l;
import h6.r0;
import i6.h;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfaz extends l0 implements l, zzazz {
    protected zzcox zza;
    private final zzchk zzb;
    private final Context zzc;
    private final String zze;
    private final zzfat zzf;
    private final zzfar zzg;
    private final i6.a zzh;
    private final zzdsm zzi;
    private zzcok zzk;
    private AtomicBoolean zzd = new AtomicBoolean();
    private long zzj = -1;

    public zzfaz(zzchk zzchkVar, Context context, String str, zzfat zzfatVar, zzfar zzfarVar, i6.a aVar, zzdsm zzdsmVar) {
        this.zzb = zzchkVar;
        this.zzc = context;
        this.zze = str;
        this.zzf = zzfatVar;
        this.zzg = zzfarVar;
        this.zzh = aVar;
        this.zzi = zzdsmVar;
        zzfarVar.zzm(this);
    }

    private final synchronized void zzq(int i) {
        try {
            if (this.zzd.compareAndSet(false, true)) {
                this.zzg.zzj();
                zzcok zzcokVar = this.zzk;
                if (zzcokVar != null) {
                    p.C.f2981f.zze(zzcokVar);
                }
                if (this.zza != null) {
                    long jElapsedRealtime = -1;
                    if (this.zzj != -1) {
                        p.C.f2983j.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime() - this.zzj;
                    }
                    this.zza.zze(jElapsedRealtime, i);
                }
                zzx();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // e6.m0
    public final synchronized void zzA() {
    }

    @Override // e6.m0
    public final synchronized void zzB() {
        i0.d("resume must be called on the main UI thread.");
    }

    @Override // e6.m0
    public final synchronized void zzF(q3 q3Var) {
        i0.d("setAdSize must be called on the main UI thread.");
    }

    @Override // e6.m0
    public final void zzH(zzbai zzbaiVar) {
        this.zzg.zzo(zzbaiVar);
    }

    @Override // e6.m0
    public final void zzI(u3 u3Var) {
        this.zzf.zzl(u3Var);
    }

    @Override // e6.m0
    public final synchronized void zzN(boolean z4) {
    }

    @Override // e6.m0
    public final synchronized void zzO(zzbdi zzbdiVar) {
    }

    @Override // e6.m0
    public final synchronized void zzU(l3 l3Var) {
    }

    @Override // e6.m0
    public final synchronized void zzX() {
    }

    @Override // e6.m0
    public final synchronized boolean zzY() {
        return false;
    }

    @Override // e6.m0
    public final synchronized boolean zzZ() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzazz
    public final void zza() {
        zzq(3);
    }

    @Override // e6.m0
    public final boolean zzaa() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    @Override // e6.m0
    public final synchronized boolean zzab(o3 o3Var) throws RemoteException {
        boolean z4;
        try {
            if (!o3Var.f3373c.getBoolean("is_sdk_preload", false)) {
                if (((Boolean) zzbel.zzd.zze()).booleanValue()) {
                    if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkP)).booleanValue()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                } else {
                    z4 = false;
                }
                if (this.zzh.f5215c < ((Integer) t.f3437d.f3440c.zza(zzbcn.zzkQ)).intValue() || !z4) {
                    i0.d("loadAd must be called on the main UI thread.");
                }
            }
            r0 r0Var = p.C.f2979c;
            if (r0.f(this.zzc) && o3Var.D == null) {
                h.d("Failed to load the ad because app ID is missing.");
                this.zzg.zzdB(zzfgq.zzd(4, null, null));
                return false;
            }
            if (zzZ()) {
                return false;
            }
            this.zzd = new AtomicBoolean();
            return this.zzf.zzb(o3Var, this.zze, new zzfax(this), new zzfay(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // e6.m0
    public final synchronized void zzac(c1 c1Var) {
    }

    @Override // e6.m0
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // g6.l
    public final synchronized void zzdr() {
        if (this.zza != null) {
            p pVar = p.C;
            pVar.f2983j.getClass();
            this.zzj = SystemClock.elapsedRealtime();
            int iZza = this.zza.zza();
            if (iZza > 0) {
                zzcok zzcokVar = new zzcok(this.zzb.zzD(), pVar.f2983j);
                this.zzk = zzcokVar;
                zzcokVar.zzd(iZza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzfaw
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzp();
                    }
                });
            }
        }
    }

    @Override // g6.l
    public final synchronized void zzdt() {
        zzcox zzcoxVar = this.zza;
        if (zzcoxVar != null) {
            p.C.f2983j.getClass();
            zzcoxVar.zze(SystemClock.elapsedRealtime() - this.zzj, 1);
        }
    }

    @Override // g6.l
    public final void zzdu(int i) {
        if (i == 0) {
            throw null;
        }
        int i10 = i - 1;
        if (i10 == 0) {
            zzq(2);
            return;
        }
        if (i10 == 1) {
            zzq(4);
        } else if (i10 != 2) {
            zzq(6);
        } else {
            zzq(3);
        }
    }

    @Override // e6.m0
    public final synchronized q3 zzg() {
        return null;
    }

    @Override // e6.m0
    public final z zzi() {
        return null;
    }

    @Override // e6.m0
    public final z0 zzj() {
        return null;
    }

    @Override // e6.m0
    public final synchronized f2 zzk() {
        return null;
    }

    @Override // e6.m0
    public final synchronized j2 zzl() {
        return null;
    }

    @Override // e6.m0
    public final q7.a zzn() {
        return null;
    }

    public final /* synthetic */ void zzo() {
        zzq(5);
    }

    public final void zzp() {
        this.zzb.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfav
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzo();
            }
        });
    }

    @Override // e6.m0
    public final synchronized String zzr() {
        return this.zze;
    }

    @Override // e6.m0
    public final synchronized String zzs() {
        return null;
    }

    @Override // e6.m0
    public final synchronized String zzt() {
        return null;
    }

    @Override // e6.m0
    public final synchronized void zzx() {
        i0.d("destroy must be called on the main UI thread.");
        zzcox zzcoxVar = this.zza;
        if (zzcoxVar != null) {
            zzcoxVar.zzb();
        }
    }

    @Override // e6.m0
    public final synchronized void zzz() {
        i0.d("pause must be called on the main UI thread.");
    }

    @Override // g6.l
    public final void zzdH() {
    }

    @Override // g6.l
    public final void zzdk() {
    }

    @Override // g6.l
    public final void zzdq() {
    }

    @Override // e6.m0
    public final void zzC(w wVar) {
    }

    @Override // e6.m0
    public final void zzD(z zVar) {
    }

    @Override // e6.m0
    public final void zzE(q0 q0Var) {
    }

    @Override // e6.m0
    public final void zzG(z0 z0Var) {
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
    public final void zzP(y1 y1Var) {
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
