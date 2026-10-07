package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.i0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzds extends zzdu {
    final /* synthetic */ Long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ zzef zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzds(zzef zzefVar, Long l2, String str, String str2, Bundle bundle, boolean z4, boolean z10) {
        super(zzefVar, true);
        this.zzg = zzefVar;
        this.zza = l2;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bundle;
        this.zze = z4;
        this.zzf = z10;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() throws RemoteException {
        Long l2 = this.zza;
        long jLongValue = l2 == null ? this.zzh : l2.longValue();
        zzcc zzccVar = this.zzg.zzj;
        i0.i(zzccVar);
        zzccVar.logEvent(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, jLongValue);
    }
}
