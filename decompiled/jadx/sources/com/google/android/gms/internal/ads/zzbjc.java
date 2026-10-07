package com.google.android.gms.internal.ads;

import a5.b;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.h0;
import d6.p;
import e6.t;
import h6.k0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbjc implements zzbjr {
    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        zzful zzfulVar;
        h0 h0Var = p.C.f2991r;
        if (!h0Var.f2114a || (zzfulVar = (zzful) h0Var.e) == null) {
            k0.k("LastMileDelivery not connected");
            return;
        }
        zzfuj zzfujVarZzc = zzfuk.zzc();
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzlf)).booleanValue() || TextUtils.isEmpty((String) h0Var.f2116c)) {
            String str = (String) h0Var.f2115b;
            if (str != null) {
                zzfujVarZzc.zzb(str);
            } else {
                h0Var.e("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzfujVarZzc.zza((String) h0Var.f2116c);
        }
        zzfulVar.zzb(zzfujVarZzc.zzc(), (b) h0Var.f2118f);
    }
}
