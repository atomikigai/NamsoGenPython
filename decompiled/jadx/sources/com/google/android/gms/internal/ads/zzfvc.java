package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfvc extends zzftv {
    final /* synthetic */ zzfvd zza;
    private final zzfvi zzb;

    public zzfvc(zzfvd zzfvdVar, zzfvi zzfviVar) {
        this.zza = zzfvdVar;
        this.zzb = zzfviVar;
    }

    @Override // com.google.android.gms.internal.ads.zzftw
    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzfvg zzfvgVarZzc = zzfvh.zzc();
        zzfvgVarZzc.zzb(i);
        if (string != null) {
            zzfvgVarZzc.zza(string);
        }
        this.zzb.zza(zzfvgVarZzc.zzc());
        if (i == 8157) {
            this.zza.zza();
        }
    }
}
