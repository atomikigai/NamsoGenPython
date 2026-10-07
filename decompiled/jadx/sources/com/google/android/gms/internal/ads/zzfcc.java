package com.google.android.gms.internal.ads;

import h6.k0;
import i6.h;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfcc implements zzfwh {
    final /* synthetic */ zzfcg zza;

    public zzfcc(zzfcg zzfcgVar) {
        this.zza = zzfcgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwh
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        h.e("", (zzdyw) obj);
        k0.k("Failed to get a cache key, reverting to legacy flow.");
        zzfcg zzfcgVar = this.zza;
        zzfcgVar.zzd = new zzfce(null, zzfcgVar.zze(), null);
        return this.zza.zzd;
    }
}
