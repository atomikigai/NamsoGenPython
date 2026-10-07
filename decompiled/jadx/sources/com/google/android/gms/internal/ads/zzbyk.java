package com.google.android.gms.internal.ads;

import e6.t;
import h6.k0;
import h6.m0;
import h6.n0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbyk {
    private final m0 zza;

    public zzbyk(n7.a aVar, m0 m0Var, zzbyv zzbyvVar) {
        this.zza = m0Var;
    }

    public final void zza(int i, long j4) {
        long j10;
        zzbce zzbceVar = zzbcn.zzaA;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            return;
        }
        n0 n0Var = (n0) this.zza;
        n0Var.l();
        synchronized (n0Var.f5036a) {
            j10 = n0Var.D;
        }
        if (j4 - j10 < 0) {
            k0.k("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) tVar.f3440c.zza(zzbcn.zzaB)).booleanValue()) {
            ((n0) this.zza).f(i);
            ((n0) this.zza).g(j4);
        } else {
            ((n0) this.zza).f(-1);
            ((n0) this.zza).g(j4);
        }
    }
}
