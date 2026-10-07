package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import e6.j2;
import e6.l2;
import i6.h;
import w5.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdom extends v {
    private final zzdiy zza;

    public zzdom(zzdiy zzdiyVar) {
        this.zza = zzdiyVar;
    }

    private static l2 zza(zzdiy zzdiyVar) {
        j2 j2VarZzj = zzdiyVar.zzj();
        if (j2VarZzj == null) {
            return null;
        }
        try {
            return j2VarZzj.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // w5.v
    public final void onVideoEnd() {
        l2 l2VarZza = zza(this.zza);
        if (l2VarZza == null) {
            return;
        }
        try {
            l2VarZza.zze();
        } catch (RemoteException e) {
            h.h("Unable to call onVideoEnd()", e);
        }
    }

    @Override // w5.v
    public final void onVideoPause() {
        l2 l2VarZza = zza(this.zza);
        if (l2VarZza == null) {
            return;
        }
        try {
            l2VarZza.zzg();
        } catch (RemoteException e) {
            h.h("Unable to call onVideoEnd()", e);
        }
    }

    @Override // w5.v
    public final void onVideoStart() {
        l2 l2VarZza = zza(this.zza);
        if (l2VarZza == null) {
            return;
        }
        try {
            l2VarZza.zzi();
        } catch (RemoteException e) {
            h.h("Unable to call onVideoEnd()", e);
        }
    }
}
