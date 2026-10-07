package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import e6.e0;
import e6.o3;
import e6.z;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzelw extends e0 {
    private final zzend zza;

    public zzelw(Context context, zzchk zzchkVar, zzffm zzffmVar, zzdjj zzdjjVar, z zVar) {
        zzenf zzenfVar = new zzenf(zzdjjVar, zzchkVar.zzj());
        zzenfVar.zze(zVar);
        this.zza = new zzend(new zzenp(zzchkVar, context, zzenfVar, zzffmVar), zzffmVar.zzL());
    }

    @Override // e6.f0
    public final synchronized String zze() {
        return this.zza.zza();
    }

    @Override // e6.f0
    public final synchronized String zzf() {
        return this.zza.zzb();
    }

    @Override // e6.f0
    public final void zzg(o3 o3Var) throws RemoteException {
        this.zza.zzd(o3Var, 1);
    }

    @Override // e6.f0
    public final synchronized void zzh(o3 o3Var, int i) throws RemoteException {
        this.zza.zzd(o3Var, i);
    }

    @Override // e6.f0
    public final synchronized boolean zzi() throws RemoteException {
        return this.zza.zze();
    }
}
