package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.i0;
import e6.k3;
import e6.m0;
import i6.d;
import i6.h;
import q7.b;
import z5.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbie extends zzbhi {
    private final f zza;

    public zzbie(f fVar) {
    }

    public static /* bridge */ /* synthetic */ f zzc(zzbie zzbieVar) {
        zzbieVar.getClass();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhj
    public final void zze(m0 m0Var, q7.a aVar) {
        if (m0Var == null || aVar == null) {
            return;
        }
        Context context = (Context) b.I(aVar);
        x5.b bVar = new x5.b(context);
        i0.j(context, "Context cannot be null");
        try {
            if (m0Var.zzi() instanceof k3) {
                k3 k3Var = (k3) m0Var.zzi();
                bVar.setAdListener(k3Var != null ? k3Var.f3336a : null);
            }
        } catch (RemoteException e) {
            h.e("", e);
        }
        try {
            if (m0Var.zzj() instanceof zzaza) {
                zzaza zzazaVar = (zzaza) m0Var.zzj();
                bVar.setAppEventListener(zzazaVar != null ? zzazaVar.zzb() : null);
            }
        } catch (RemoteException e4) {
            h.e("", e4);
        }
        d.f5219b.post(new zzbid(this, bVar, m0Var));
    }
}
