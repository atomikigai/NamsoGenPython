package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfcd implements zzfwh {
    final /* synthetic */ zzfcg zza;

    public zzfcd(zzfcg zzfcgVar) {
        this.zza = zzfcgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwh
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzbvx zzbvxVar = (zzbvx) obj;
        this.zza.zzd = new zzfce(zzbvxVar, new zzfho(zzbvxVar.zzj), null);
        return this.zza.zzd;
    }
}
