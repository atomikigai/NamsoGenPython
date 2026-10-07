package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaxa extends zzaxt {
    private final Map zzh;
    private final View zzi;
    private final Context zzj;

    public zzaxa(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i, int i10, Map map, View view, Context context) {
        super(zzawfVar, "SSi9+bc4LjSDCw5XbM9a3o0KjM00NEx8AzpqWTmGrN6ZCy4DwzQ9YQ8F3uOviR+R", "vovSRMWoC6DyReNhMsLU/AHhR3bWlWI4SOQQixDW2Zg=", zzasfVar, i, 85);
        this.zzh = map;
        this.zzi = view;
        this.zzj = context;
    }

    private final long zzc(int i) {
        Map map = this.zzh;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            return ((Long) this.zzh.get(numValueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = {zzc(1), zzc(2)};
        Context contextZzb = this.zzj;
        if (contextZzb == null) {
            contextZzb = this.zza.zzb();
        }
        long[] jArr2 = (long[]) this.zze.invoke(null, jArr, contextZzb, this.zzi);
        long j4 = jArr2[0];
        this.zzh.put(1, Long.valueOf(jArr2[1]));
        long j10 = jArr2[2];
        this.zzh.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.zzd) {
            this.zzd.zzv(j4);
            this.zzd.zzu(j10);
        }
    }
}
