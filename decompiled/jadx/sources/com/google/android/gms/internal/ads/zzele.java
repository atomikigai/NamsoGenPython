package com.google.android.gms.internal.ads;

import android.view.View;
import d6.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzele implements f {
    private f zza;

    @Override // d6.f
    public final synchronized void zza(View view) {
        f fVar = this.zza;
        if (fVar != null) {
            fVar.zza(view);
        }
    }

    @Override // d6.f
    public final synchronized void zzb() {
        f fVar = this.zza;
        if (fVar != null) {
            fVar.zzb();
        }
    }

    @Override // d6.f
    public final synchronized void zzc() {
        f fVar = this.zza;
        if (fVar != null) {
            fVar.zzc();
        }
    }

    public final synchronized void zzd(f fVar) {
        this.zza = fVar;
    }
}
