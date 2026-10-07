package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzelt extends l0 {
    private final Context zza;
    private final z zzb;
    private final zzffo zzc;
    private final zzcpd zzd;
    private final ViewGroup zze;
    private final zzdsm zzf;

    public zzelt(Context context, z zVar, zzffo zzffoVar, zzcpd zzcpdVar, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzb = zVar;
        this.zzc = zzffoVar;
        this.zzd = zzcpdVar;
        this.zzf = zzdsmVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View viewZzd = zzcpdVar.zzd();
        r0 r0Var = p.C.f2979c;
        frameLayout.addView(viewZzd, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzg().f3408c);
        frameLayout.setMinimumWidth(zzg().f3410f);
        this.zze = frameLayout;
    }

    @Override // e6.m0
    public final void zzA() throws RemoteException {
        this.zzd.zzh();
    }

    @Override // e6.m0
    public final void zzB() throws RemoteException {
        i0.d("destroy must be called on the main UI thread.");
        this.zzd.zzn().zzc(null);
    }

    @Override // e6.m0
    public final void zzC(w wVar) throws RemoteException {
        h.f("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // e6.m0
    public final void zzD(z zVar) throws RemoteException {
        h.f("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // e6.m0
    public final void zzE(q0 q0Var) throws RemoteException {
        h.f("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // e6.m0
    public final void zzF(q3 q3Var) throws RemoteException {
        i0.d("setAdSize must be called on the main UI thread.");
        zzcpd zzcpdVar = this.zzd;
        if (zzcpdVar != null) {
            zzcpdVar.zzi(this.zze, q3Var);
        }
    }

    @Override // e6.m0
    public final void zzG(z0 z0Var) throws RemoteException {
        zzems zzemsVar = this.zzc.zzc;
        if (zzemsVar != null) {
            zzemsVar.zzm(z0Var);
        }
    }

    @Override // e6.m0
    public final void zzN(boolean z4) throws RemoteException {
        h.f("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // e6.m0
    public final void zzO(zzbdi zzbdiVar) throws RemoteException {
        h.f("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // e6.m0
    public final void zzP(y1 y1Var) {
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzll)).booleanValue()) {
            h.f("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        zzems zzemsVar = this.zzc.zzc;
        if (zzemsVar != null) {
            try {
                if (!y1Var.zzf()) {
                    this.zzf.zze();
                }
            } catch (RemoteException e) {
                h.c("Error in making CSI ping for reporting paid event callback", e);
            }
            zzemsVar.zzl(y1Var);
        }
    }

    @Override // e6.m0
    public final void zzU(l3 l3Var) throws RemoteException {
        h.f("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // e6.m0
    public final boolean zzY() throws RemoteException {
        zzcpd zzcpdVar = this.zzd;
        return zzcpdVar != null && zzcpdVar.zzs();
    }

    @Override // e6.m0
    public final boolean zzZ() throws RemoteException {
        return false;
    }

    @Override // e6.m0
    public final boolean zzaa() throws RemoteException {
        return false;
    }

    @Override // e6.m0
    public final boolean zzab(o3 o3Var) throws RemoteException {
        h.f("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // e6.m0
    public final void zzac(c1 c1Var) throws RemoteException {
        h.f("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // e6.m0
    public final Bundle zzd() throws RemoteException {
        h.f("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // e6.m0
    public final q3 zzg() {
        i0.d("getAdSize must be called on the main UI thread.");
        return zzffu.zza(this.zza, Collections.singletonList(this.zzd.zzf()));
    }

    @Override // e6.m0
    public final z zzi() throws RemoteException {
        return this.zzb;
    }

    @Override // e6.m0
    public final z0 zzj() throws RemoteException {
        return this.zzc.zzn;
    }

    @Override // e6.m0
    public final f2 zzk() {
        return this.zzd.zzm();
    }

    @Override // e6.m0
    public final j2 zzl() throws RemoteException {
        return this.zzd.zze();
    }

    @Override // e6.m0
    public final q7.a zzn() throws RemoteException {
        return new b(this.zze);
    }

    @Override // e6.m0
    public final String zzr() throws RemoteException {
        return this.zzc.zzf;
    }

    @Override // e6.m0
    public final String zzs() throws RemoteException {
        if (this.zzd.zzm() != null) {
            return this.zzd.zzm().zzg();
        }
        return null;
    }

    @Override // e6.m0
    public final String zzt() throws RemoteException {
        if (this.zzd.zzm() != null) {
            return this.zzd.zzm().zzg();
        }
        return null;
    }

    @Override // e6.m0
    public final void zzx() throws RemoteException {
        i0.d("destroy must be called on the main UI thread.");
        this.zzd.zzb();
    }

    @Override // e6.m0
    public final void zzz() throws RemoteException {
        i0.d("destroy must be called on the main UI thread.");
        this.zzd.zzn().zzb(null);
    }

    @Override // e6.m0
    public final void zzX() throws RemoteException {
    }

    @Override // e6.m0
    public final void zzH(zzbai zzbaiVar) throws RemoteException {
    }

    @Override // e6.m0
    public final void zzI(u3 u3Var) throws RemoteException {
    }

    @Override // e6.m0
    public final void zzJ(e1 e1Var) {
    }

    @Override // e6.m0
    public final void zzK(m2 m2Var) throws RemoteException {
    }

    @Override // e6.m0
    public final void zzL(boolean z4) throws RemoteException {
    }

    @Override // e6.m0
    public final void zzM(zzbtp zzbtpVar) throws RemoteException {
    }

    @Override // e6.m0
    public final void zzR(String str) throws RemoteException {
    }

    @Override // e6.m0
    public final void zzS(zzbwp zzbwpVar) throws RemoteException {
    }

    @Override // e6.m0
    public final void zzT(String str) throws RemoteException {
    }

    @Override // e6.m0
    public final void zzW(q7.a aVar) {
    }

    @Override // e6.m0
    public final void zzQ(zzbts zzbtsVar, String str) throws RemoteException {
    }

    @Override // e6.m0
    public final void zzy(o3 o3Var, c0 c0Var) {
    }
}
