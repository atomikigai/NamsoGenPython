package com.google.android.gms.internal.ads;

import android.content.Context;
import e6.q3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w5.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzffu {
    public static q3 zza(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfeu zzfeuVar = (zzfeu) it.next();
            if (zzfeuVar.zzc) {
                arrayList.add(h.f9653o);
            } else {
                arrayList.add(new h(zzfeuVar.zza, zzfeuVar.zzb));
            }
        }
        return new q3(context, (h[]) arrayList.toArray(new h[arrayList.size()]));
    }

    public static zzfeu zzb(q3 q3Var) {
        return q3Var.f3413t ? new zzfeu(-3, 0, true) : new zzfeu(q3Var.e, q3Var.f3407b, false);
    }
}
