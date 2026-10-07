package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzejo extends zzekp {
    private final zzdeu zza;

    public zzejo(zzcwk zzcwkVar, zzdej zzdejVar, zzcxe zzcxeVar, zzcxt zzcxtVar, zzcxy zzcxyVar, zzcwz zzcwzVar, zzdbi zzdbiVar, zzdfg zzdfgVar, zzcys zzcysVar, zzdeu zzdeuVar, zzdbe zzdbeVar) {
        super(zzcwkVar, zzdejVar, zzcxeVar, zzcxtVar, zzcxyVar, zzdbiVar, zzcysVar, zzdfgVar, zzdbeVar, zzcwzVar);
        this.zza = zzdeuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekp, com.google.android.gms.internal.ads.zzbpm
    public final void zzs(zzbwv zzbwvVar) {
        this.zza.zza(zzbwvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzekp, com.google.android.gms.internal.ads.zzbpm
    public final void zzt(zzbwz zzbwzVar) throws RemoteException {
        this.zza.zza(new zzbwv(zzbwzVar.zzf(), zzbwzVar.zze()));
    }

    @Override // com.google.android.gms.internal.ads.zzekp, com.google.android.gms.internal.ads.zzbpm
    public final void zzu() throws RemoteException {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzekp, com.google.android.gms.internal.ads.zzbpm
    public final void zzv() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzekp, com.google.android.gms.internal.ads.zzbpm
    public final void zzy() {
        this.zza.zzc();
    }
}
