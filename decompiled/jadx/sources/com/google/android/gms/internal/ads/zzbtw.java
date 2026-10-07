package com.google.android.gms.internal.ads;

import android.os.Bundle;
import da.a0;
import q6.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbtw extends zzbzd {
    final /* synthetic */ b zza;

    public zzbtw(zzbtx zzbtxVar, b bVar) {
        this.zza = bVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbze
    public final void zzb(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbze
    public final void zzc(String str, String str2, Bundle bundle) {
        a0 a0Var = new a0();
        a0Var.f3089a = str;
        this.zza.onSuccess(new q6.a(a0Var));
    }
}
