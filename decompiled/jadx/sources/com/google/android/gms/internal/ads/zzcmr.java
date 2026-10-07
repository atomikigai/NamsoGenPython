package com.google.android.gms.internal.ads;

import android.content.Context;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcmr implements zzcxh {
    private final zzfgm zza;

    public zzcmr(zzfgm zzfgmVar) {
        this.zza = zzfgmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzdj(Context context) {
        try {
            this.zza.zzg();
        } catch (zzffv e) {
            h.h("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzdl(Context context) {
        try {
            this.zza.zzt();
        } catch (zzffv e) {
            h.h("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzdm(Context context) {
        try {
            this.zza.zzu();
            if (context != null) {
                this.zza.zzs(context);
            }
        } catch (zzffv e) {
            h.h("Cannot invoke onResume for the mediation adapter.", e);
        }
    }
}
