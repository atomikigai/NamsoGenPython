package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.o;
import w7.u;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzau extends u {
    private final o zza;

    public zzau(o oVar) {
        super("com.google.android.gms.location.ILocationListener");
        this.zza = oVar;
    }

    public final synchronized void zzc() {
        o oVar = this.zza;
        oVar.f2131b = null;
        oVar.f2132c = null;
    }

    @Override // w7.v
    public final synchronized void zzd(Location location) {
        this.zza.a(new zzat(this, location));
    }
}
