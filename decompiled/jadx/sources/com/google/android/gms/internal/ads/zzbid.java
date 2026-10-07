package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import e6.m0;
import e6.q2;
import i6.h;
import x5.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbid implements Runnable {
    final /* synthetic */ b zza;
    final /* synthetic */ m0 zzb;
    final /* synthetic */ zzbie zzc;

    public zzbid(zzbie zzbieVar, b bVar, m0 m0Var) {
        this.zza = bVar;
        this.zzb = m0Var;
        this.zzc = zzbieVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar = this.zza;
        m0 m0Var = this.zzb;
        q2 q2Var = bVar.f9664a;
        q2Var.getClass();
        try {
            q7.a aVarZzn = m0Var.zzn();
            if (aVarZzn != null && ((View) q7.b.I(aVarZzn)).getParent() == null) {
                q2Var.f3404l.addView((View) q7.b.I(aVarZzn));
                q2Var.i = m0Var;
                zzbie.zzc(this.zzc);
                throw null;
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
        h.g("Could not bind.");
    }
}
