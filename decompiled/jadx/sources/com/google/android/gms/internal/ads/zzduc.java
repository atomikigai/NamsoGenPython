package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import e6.o3;
import i6.h;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzduc implements zzdtm {
    private final long zza;
    private final zzdtr zzb;
    private final zzfek zzc;

    public zzduc(long j4, Context context, zzdtr zzdtrVar, zzchk zzchkVar, String str) {
        this.zza = j4;
        this.zzb = zzdtrVar;
        zzfem zzfemVarZzw = zzchkVar.zzw();
        zzfemVarZzw.zzb(context);
        zzfemVarZzw.zza(str);
        this.zzc = zzfemVarZzw.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzdtm
    public final void zzb(o3 o3Var) {
        try {
            this.zzc.zzf(o3Var, new zzdua(this));
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdtm
    public final void zzc() {
        try {
            this.zzc.zzk(new zzdub(this));
            this.zzc.zzm(new b(null));
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdtm
    public final void zza() {
    }
}
