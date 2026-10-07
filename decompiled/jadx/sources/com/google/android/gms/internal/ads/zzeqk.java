package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeqk implements zzevz {
    private final zzfbr zza;

    public zzeqk(zzfbr zzfbrVar) {
        this.zza = zzfbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        zzfbr zzfbrVar = this.zza;
        zzevy zzevyVar = null;
        if (zzfbrVar != null && zzfbrVar.zza() != null && !zzfbrVar.zza().isEmpty()) {
            zzevyVar = new zzevy() { // from class: com.google.android.gms.internal.ads.zzeqj
                @Override // com.google.android.gms.internal.ads.zzevy
                public final void zzj(Object obj) {
                    this.zza.zzc((Bundle) obj);
                }
            };
        }
        return zzgei.zzh(zzevyVar);
    }

    public final /* synthetic */ void zzc(Bundle bundle) {
        bundle.putString("key_schema", this.zza.zza());
    }
}
