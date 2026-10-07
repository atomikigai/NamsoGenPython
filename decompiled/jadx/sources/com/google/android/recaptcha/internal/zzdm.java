package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.Arrays;
import vb.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdm implements zzdd {
    public static final zzdm zza = new zzdm();

    private zzdm() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i, zzcj zzcjVar, zzpq... zzpqVarArr) throws zzae {
        int length = zzpqVarArr.length;
        if (length == 0) {
            throw new zzae(4, 3, null);
        }
        Object objZza = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != (objZza instanceof Method)) {
            objZza = null;
        }
        Method method = (Method) objZza;
        if (method == null) {
            throw new zzae(4, 5, null);
        }
        Object[] objArrZzh = zzcjVar.zzc().zzh(h.T(zzpqVarArr).subList(1, length));
        try {
            zzcjVar.zzc().zzf(i, method.invoke(null, Arrays.copyOf(objArrZzh, objArrZzh.length)));
        } catch (Exception e) {
            throw new zzae(6, 15, e);
        }
    }
}
