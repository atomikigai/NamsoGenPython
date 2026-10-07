package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import w7.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzar extends q {
    private final o zza;

    public zzar(o oVar) {
        super("com.google.android.gms.location.ILocationCallback");
        this.zza = oVar;
    }

    public final synchronized void zzc() {
        o oVar = this.zza;
        oVar.f2131b = null;
        oVar.f2132c = null;
    }

    @Override // w7.s
    public final void zzd(LocationResult locationResult) {
        this.zza.a(new zzap(this, locationResult));
    }

    @Override // w7.s
    public final void zze(LocationAvailability locationAvailability) {
        this.zza.a(new zzaq(this, locationAvailability));
    }
}
