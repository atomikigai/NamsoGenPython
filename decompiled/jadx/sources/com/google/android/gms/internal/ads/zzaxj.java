package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaxj extends zzaxt {
    private List zzh;
    private final Context zzi;

    public zzaxj(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i, int i10, Context context) {
        super(zzawfVar, "p2B6bhXfJZNgZ0+I4L4c9cLXJrfGeKZvoxHbzoRookWEJhhW5Gvimq5QvTg4oqLM", "wcFaDbS//5pJ1R+WEpFF/o7BDXsIcxPrCZPKL326+18=", zzasfVar, i, 31);
        this.zzh = null;
        this.zzi = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzW(-1L);
        this.zzd.zzS(-1L);
        Context contextZzb = this.zzi;
        if (contextZzb == null) {
            contextZzb = this.zza.zzb();
        }
        if (this.zzh == null) {
            this.zzh = (List) this.zze.invoke(null, contextZzb);
        }
        List list = this.zzh;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.zzd) {
            this.zzd.zzW(((Long) this.zzh.get(0)).longValue());
            this.zzd.zzS(((Long) this.zzh.get(1)).longValue());
        }
    }
}
