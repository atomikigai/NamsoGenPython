package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import e6.h2;
import e6.z;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzenf {
    private final zzdjj zza;
    private final zzems zzb;
    private final zzcwp zzc;

    public zzenf(zzdjj zzdjjVar, zzdsm zzdsmVar) {
        this.zza = zzdjjVar;
        final zzems zzemsVar = new zzems(zzdsmVar);
        this.zzb = zzemsVar;
        final zzbmk zzbmkVarZzg = zzdjjVar.zzg();
        this.zzc = new zzcwp() { // from class: com.google.android.gms.internal.ads.zzene
            @Override // com.google.android.gms.internal.ads.zzcwp
            public final void zzdB(h2 h2Var) {
                zzemsVar.zzdB(h2Var);
                zzbmk zzbmkVar = zzbmkVarZzg;
                if (zzbmkVar != null) {
                    try {
                        zzbmkVar.zzf(h2Var);
                    } catch (RemoteException e) {
                        h.i("#007 Could not call remote method.", e);
                    }
                }
                if (zzbmkVar != null) {
                    try {
                        zzbmkVar.zze(h2Var.f3314a);
                    } catch (RemoteException e4) {
                        h.i("#007 Could not call remote method.", e4);
                    }
                }
            }
        };
    }

    public final zzcwp zza() {
        return this.zzc;
    }

    public final zzcya zzb() {
        return this.zzb;
    }

    public final zzdhe zzc() {
        return new zzdhe(this.zza, this.zzb.zzg());
    }

    public final zzems zzd() {
        return this.zzb;
    }

    public final void zze(z zVar) {
        this.zzb.zzj(zVar);
    }
}
