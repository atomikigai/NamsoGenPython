package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import e6.h2;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzegk extends zzbqs {
    final /* synthetic */ zzegm zza;
    private final zzefe zzb;

    public /* synthetic */ zzegk(zzegm zzegmVar, zzefe zzefeVar, zzegl zzeglVar) {
        this.zza = zzegmVar;
        this.zzb = zzefeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqt
    public final void zze(String str) throws RemoteException {
        ((zzegx) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt
    public final void zzf(h2 h2Var) throws RemoteException {
        ((zzegx) this.zzb.zzc).zzh(h2Var);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt
    public final void zzg(q7.a aVar) throws RemoteException {
        this.zza.zzc = (View) b.I(aVar);
        ((zzegx) this.zzb.zzc).zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbqt
    public final void zzh(zzbpp zzbppVar) throws RemoteException {
        this.zza.zzd = zzbppVar;
        ((zzegx) this.zzb.zzc).zzo();
    }
}
