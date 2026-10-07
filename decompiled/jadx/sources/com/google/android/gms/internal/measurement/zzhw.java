package com.google.android.gms.internal.measurement;

import android.util.Log;
import q1.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzhw extends zzib {
    public zzhw(zzhy zzhyVar, String str, Double d10, boolean z4) {
        super(zzhyVar, "measurement.test.double_flag", d10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbN = a.n("Invalid double value for ", this.zzb, ": ");
            sbN.append((String) obj);
            Log.e("PhenotypeFlag", sbN.toString());
            return null;
        }
    }
}
