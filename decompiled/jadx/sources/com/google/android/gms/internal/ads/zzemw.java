package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import e6.w;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzemw implements e6.a, zzdel {
    private w zza;

    @Override // e6.a
    public final synchronized void onAdClicked() {
        w wVar = this.zza;
        if (wVar != null) {
            try {
                wVar.zzb();
            } catch (RemoteException e) {
                h.h("Remote Exception at onAdClicked.", e);
            }
        }
    }

    public final synchronized void zza(w wVar) {
        this.zza = wVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final synchronized void zzdG() {
        w wVar = this.zza;
        if (wVar != null) {
            try {
                wVar.zzb();
            } catch (RemoteException e) {
                h.h("Remote Exception at onPhysicalClick.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final synchronized void zzdf() {
    }
}
