package com.google.android.gms.internal.ads;

import d6.p;
import e6.t;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzdkw implements zzgee {
    final /* synthetic */ zzdkx zza;

    public zzdkw(zzdkx zzdkxVar) {
        this.zza = zzdkxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfl)).booleanValue()) {
            p.C.f2982g.zzw(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zzb(List list) {
        try {
            zzcfk zzcfkVar = (zzcfk) list.get(0);
            if (zzcfkVar != null) {
                this.zza.zzb(zzcfkVar);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e) {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfl)).booleanValue()) {
                p.C.f2982g.zzw(e, "omid native display exp");
            }
        }
    }
}
