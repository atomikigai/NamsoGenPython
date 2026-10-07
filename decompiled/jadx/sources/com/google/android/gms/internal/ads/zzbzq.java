package com.google.android.gms.internal.ads;

import android.content.Context;
import e6.s;
import g7.f;
import i6.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbzq {
    public final m9.a zza(Context context, int i) {
        zzcao zzcaoVar = new zzcao();
        d dVar = s.f3427f.f3428a;
        int iD = f.f4241b.d(context, 12451000);
        if (iD != 0 && iD != 2) {
            return zzcaoVar;
        }
        zzcaj.zza.execute(new zzbzp(this, context, zzcaoVar));
        return zzcaoVar;
    }
}
