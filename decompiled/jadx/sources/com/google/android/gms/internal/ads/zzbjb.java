package com.google.android.gms.internal.ads;

import a5.b;
import com.google.android.gms.common.api.internal.h0;
import d6.p;
import h6.k0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbjb implements zzbjr {
    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        zzful zzfulVar;
        h0 h0Var = p.C.f2991r;
        if (!h0Var.f2114a || (zzfulVar = (zzful) h0Var.e) == null) {
            k0.k("LastMileDelivery not connected");
        } else {
            zzfulVar.zza(h0Var.h(), (b) h0Var.f2118f);
            zzcaj.zze.execute(new b3.b(h0Var, "onLMDOverlayCollapse", new HashMap(), 4, false));
        }
    }
}
