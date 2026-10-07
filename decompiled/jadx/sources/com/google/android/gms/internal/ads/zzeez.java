package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import jc.i;
import u1.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeez {
    private final Context zza;

    public zzeez(Context context) {
        this.zza = context;
    }

    public final m9.a zza(boolean z4) {
        d dVar;
        try {
            u1.a aVar = new u1.a(z4);
            Context context = this.zza;
            i.e(context, "context");
            p1.a aVar2 = p1.a.f7786a;
            int i = Build.VERSION.SDK_INT;
            if ((i >= 30 ? aVar2.a() : 0) >= 5) {
                dVar = new d(context, 1);
            } else {
                dVar = (i >= 30 ? aVar2.a() : 0) == 4 ? new d(context, 0) : null;
            }
            s1.a aVar3 = dVar != null ? new s1.a(dVar) : null;
            return aVar3 != null ? aVar3.a(aVar) : zzgei.zzg(new IllegalStateException());
        } catch (Exception e) {
            return zzgei.zzg(e);
        }
    }
}
