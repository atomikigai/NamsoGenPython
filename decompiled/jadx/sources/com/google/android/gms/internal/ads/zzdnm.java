package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import e6.f2;
import e6.j2;
import e6.n1;
import e6.q1;
import e6.t;
import e6.y1;
import i6.h;
import java.util.Collections;
import java.util.List;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdnm extends zzbhu {
    private final String zza;
    private final zzdit zzb;
    private final zzdiy zzc;
    private final zzdsm zzd;

    public zzdnm(String str, zzdit zzditVar, zzdiy zzdiyVar, zzdsm zzdsmVar) {
        this.zza = str;
        this.zzb = zzditVar;
        this.zzc = zzdiyVar;
        this.zzd = zzdsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzA() {
        this.zzb.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzB(Bundle bundle) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzmF)).booleanValue()) {
            this.zzb.zzI(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzC(Bundle bundle) throws RemoteException {
        this.zzb.zzM(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzD() {
        this.zzb.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzE(n1 n1Var) throws RemoteException {
        this.zzb.zzP(n1Var);
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzF(y1 y1Var) throws RemoteException {
        try {
            if (!y1Var.zzf()) {
                this.zzd.zze();
            }
        } catch (RemoteException e) {
            h.c("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzb.zzQ(y1Var);
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzG(zzbhs zzbhsVar) throws RemoteException {
        this.zzb.zzR(zzbhsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final boolean zzH() {
        return this.zzb.zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final boolean zzI() throws RemoteException {
        return (this.zzc.zzH().isEmpty() || this.zzc.zzk() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final boolean zzJ(Bundle bundle) throws RemoteException {
        return this.zzb.zzZ(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final double zze() throws RemoteException {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final Bundle zzf() throws RemoteException {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final f2 zzg() throws RemoteException {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzgD)).booleanValue()) {
            return this.zzb.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final j2 zzh() throws RemoteException {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final zzbfr zzi() throws RemoteException {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final zzbfv zzj() throws RemoteException {
        return this.zzb.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final zzbfy zzk() throws RemoteException {
        return this.zzc.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final q7.a zzl() throws RemoteException {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final q7.a zzm() throws RemoteException {
        return new b(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final String zzn() throws RemoteException {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final String zzo() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final String zzp() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final String zzq() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final String zzr() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final String zzs() throws RemoteException {
        return this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final String zzt() throws RemoteException {
        return this.zzc.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final List zzu() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final List zzv() throws RemoteException {
        return zzI() ? this.zzc.zzH() : Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzw() throws RemoteException {
        this.zzb.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzx() throws RemoteException {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzy(q1 q1Var) throws RemoteException {
        this.zzb.zzC(q1Var);
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzz(Bundle bundle) throws RemoteException {
        this.zzb.zzG(bundle);
    }
}
