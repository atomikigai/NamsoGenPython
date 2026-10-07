package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import d6.p;
import e6.t;
import h6.k0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzetk implements zzevz {
    private final Context zza;
    private final Intent zzb;

    public zzetk(Context context, Intent intent) {
        this.zza = context;
        this.zzb = intent;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 60;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        k0.k("HsdpMigrationSignal.produce");
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzmx)).booleanValue()) {
            return zzgei.zzh(new zzetl(null));
        }
        boolean z4 = false;
        try {
            if (this.zzb.resolveActivity(this.zza.getPackageManager()) != null) {
                z4 = true;
            }
        } catch (Exception e) {
            p.C.f2982g.zzw(e, "HsdpMigrationSignal.isHsdpMigrationSupported");
        }
        return zzgei.zzh(new zzetl(Boolean.valueOf(z4)));
    }
}
