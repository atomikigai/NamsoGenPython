package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import e6.f2;
import e6.g3;
import i6.h;
import w5.k;
import w5.p;
import w5.t;
import y5.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbab extends b {
    k zza;
    private final zzbaf zzb;
    private final String zzc;
    private final zzbac zzd = new zzbac();
    private p zze;

    public zzbab(zzbaf zzbafVar, String str) {
        this.zzb = zzbafVar;
        this.zzc = str;
    }

    public final String getAdUnitId() {
        return this.zzc;
    }

    public final k getFullScreenContentCallback() {
        return this.zza;
    }

    public final p getOnPaidEventListener() {
        return null;
    }

    @Override // y5.b
    public final t getResponseInfo() {
        f2 f2VarZzf;
        try {
            f2VarZzf = this.zzb.zzf();
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
            f2VarZzf = null;
        }
        return new t(f2VarZzf);
    }

    public final void setFullScreenContentCallback(k kVar) {
        this.zza = kVar;
        this.zzd.zzg(kVar);
    }

    public final void setImmersiveMode(boolean z4) {
        try {
            this.zzb.zzg(z4);
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    public final void setOnPaidEventListener(p pVar) {
        try {
            this.zzb.zzh(new g3());
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // y5.b
    public final void show(Activity activity) {
        try {
            this.zzb.zzi(new q7.b(activity), this.zzd);
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }
}
