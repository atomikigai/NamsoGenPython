package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import z7.m1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzdw extends zzch {
    private final m1 zza;

    public zzdw(m1 m1Var) {
        this.zza = m1Var;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void zze(String str, String str2, Bundle bundle, long j4) {
        this.zza.a(bundle, str, str2, j4);
    }
}
