package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import s5.j;
import z7.l1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzdv extends zzch {
    private final l1 zza;

    public zzdv(l1 l1Var) {
        this.zza = l1Var;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void zze(String str, String str2, Bundle bundle, long j4) {
        ((j) this.zza).n(bundle, str, str2, j4);
    }
}
