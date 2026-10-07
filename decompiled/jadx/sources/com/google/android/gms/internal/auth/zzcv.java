package com.google.android.gms.internal.auth;

import android.util.Log;
import q1.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcv extends zzdc {
    public zzcv(zzcz zzczVar, String str, Long l2, boolean z4) {
        super(zzczVar, str, l2, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbN = a.n("Invalid long value for ", zzc(), ": ");
            sbN.append((String) obj);
            Log.e("PhenotypeFlag", sbN.toString());
            return null;
        }
    }
}
