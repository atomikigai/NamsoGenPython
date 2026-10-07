package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import e6.f2;
import e6.o3;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzend {
    private final zzeni zza;
    private final String zzb;
    private f2 zzc;

    public zzend(zzeni zzeniVar, String str) {
        this.zza = zzeniVar;
        this.zzb = str;
    }

    public final synchronized String zza() {
        f2 f2Var;
        try {
            f2Var = this.zzc;
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
            return null;
        }
        return f2Var != null ? f2Var.zzg() : null;
    }

    public final synchronized String zzb() {
        f2 f2Var;
        try {
            f2Var = this.zzc;
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
            return null;
        }
        return f2Var != null ? f2Var.zzg() : null;
    }

    public final synchronized void zzd(o3 o3Var, int i) throws RemoteException {
        this.zzc = null;
        zzenj zzenjVar = new zzenj(i);
        zzenc zzencVar = new zzenc(this);
        this.zza.zzb(o3Var, this.zzb, zzenjVar, zzencVar);
    }

    public final synchronized boolean zze() throws RemoteException {
        return this.zza.zza();
    }
}
