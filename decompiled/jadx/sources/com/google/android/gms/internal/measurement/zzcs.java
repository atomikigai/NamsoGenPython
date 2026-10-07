package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.i0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcs extends zzdu {
    final /* synthetic */ Boolean zza;
    final /* synthetic */ zzef zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcs(zzef zzefVar, Boolean bool) {
        super(zzefVar, true);
        this.zzb = zzefVar;
        this.zza = bool;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() throws RemoteException {
        if (this.zza != null) {
            zzcc zzccVar = this.zzb.zzj;
            i0.i(zzccVar);
            zzccVar.setMeasurementEnabled(this.zza.booleanValue(), this.zzh);
        } else {
            zzcc zzccVar2 = this.zzb.zzj;
            i0.i(zzccVar2);
            zzccVar2.clearMeasurementEnabled(this.zzh);
        }
    }
}
