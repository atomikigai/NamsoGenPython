package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbov extends zzchf {
    private final y7.a zza;

    public zzbov(y7.a aVar) {
        this.zza = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final int zzb(String str) throws RemoteException {
        return this.zza.f10615a.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final long zzc() throws RemoteException {
        return this.zza.f10615a.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final Bundle zzd(Bundle bundle) throws RemoteException {
        return this.zza.f10615a.zzc(bundle, true);
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final String zze() throws RemoteException {
        return this.zza.f10615a.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final String zzf() throws RemoteException {
        return this.zza.f10615a.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final String zzg() throws RemoteException {
        return this.zza.f10615a.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final String zzh() throws RemoteException {
        return this.zza.f10615a.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final String zzi() throws RemoteException {
        return this.zza.f10615a.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final List zzj(String str, String str2) throws RemoteException {
        return this.zza.f10615a.zzq(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final Map zzk(String str, String str2, boolean z4) throws RemoteException {
        return this.zza.f10615a.zzr(str, str2, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzl(String str) throws RemoteException {
        this.zza.f10615a.zzv(str);
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzm(String str, String str2, Bundle bundle) throws RemoteException {
        this.zza.f10615a.zzw(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzn(String str) throws RemoteException {
        this.zza.f10615a.zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzo(String str, String str2, Bundle bundle) throws RemoteException {
        this.zza.f10615a.zzz(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzp(Bundle bundle) throws RemoteException {
        this.zza.f10615a.zzc(bundle, false);
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzq(Bundle bundle) throws RemoteException {
        this.zza.f10615a.zzE(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzr(Bundle bundle) throws RemoteException {
        this.zza.f10615a.zzF(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzs(q7.a aVar, String str, String str2) throws RemoteException {
        this.zza.f10615a.zzH(aVar != null ? (Activity) b.I(aVar) : null, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzt(String str, String str2, q7.a aVar) throws RemoteException {
        this.zza.f10615a.zzO(str, str2, aVar != null ? b.I(aVar) : null, true);
    }
}
