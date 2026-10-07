package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfhq {
    private final HashMap zza = new HashMap();

    public final zzfhp zza(zzfhg zzfhgVar, Context context, zzfgy zzfgyVar, zzfhw zzfhwVar) {
        zzfhp zzfhpVar = (zzfhp) this.zza.get(zzfhgVar);
        if (zzfhpVar != null) {
            return zzfhpVar;
        }
        zzfhd zzfhdVar = new zzfhd(zzfhj.zza(zzfhgVar, context));
        zzfhp zzfhpVar2 = new zzfhp(zzfhdVar, new zzfhy(zzfhdVar, zzfgyVar, zzfhwVar));
        this.zza.put(zzfhgVar, zzfhpVar2);
        return zzfhpVar2;
    }
}
