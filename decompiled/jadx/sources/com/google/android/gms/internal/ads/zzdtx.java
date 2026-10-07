package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import e6.h2;
import e6.y;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzdtx extends y {
    final /* synthetic */ zzdtr zza;
    final /* synthetic */ zzdty zzb;

    public zzdtx(zzdty zzdtyVar, zzdtr zzdtrVar) {
        this.zza = zzdtrVar;
        this.zzb = zzdtyVar;
    }

    @Override // e6.z
    public final void zzc() throws RemoteException {
        this.zza.zzb(this.zzb.zza);
    }

    @Override // e6.z
    public final void zzd() throws RemoteException {
        this.zza.zzc(this.zzb.zza);
    }

    @Override // e6.z
    public final void zze(int i) throws RemoteException {
        this.zza.zzd(this.zzb.zza, i);
    }

    @Override // e6.z
    public final void zzf(h2 h2Var) throws RemoteException {
        this.zza.zzd(this.zzb.zza, h2Var.f3314a);
    }

    @Override // e6.z
    public final void zzi() throws RemoteException {
        this.zza.zze(this.zzb.zza);
    }

    @Override // e6.z
    public final void zzj() throws RemoteException {
        this.zza.zzg(this.zzb.zza);
    }

    @Override // e6.z
    public final void zzg() {
    }

    @Override // e6.z
    public final void zzh() {
    }

    @Override // e6.z
    public final void zzk() {
    }
}
