package com.google.android.gms.internal.ads;

import android.view.View;
import d6.f;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbdd extends zzbde {
    private final f zza;
    private final String zzb;
    private final String zzc;

    public zzbdd(f fVar, String str, String str2) {
        this.zza = fVar;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final void zzd(q7.a aVar) {
        if (aVar == null) {
            return;
        }
        this.zza.zza((View) b.I(aVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final void zze() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final void zzf() {
        this.zza.zzc();
    }
}
