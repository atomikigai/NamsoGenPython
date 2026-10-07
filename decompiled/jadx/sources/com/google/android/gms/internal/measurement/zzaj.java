package com.google.android.gms.internal.measurement;

import da.v;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzaj {
    public static zzap zza(zzal zzalVar, zzap zzapVar, zzg zzgVar, List list) {
        if (zzalVar.zzt(zzapVar.zzi())) {
            zzap zzapVarZzf = zzalVar.zzf(zzapVar.zzi());
            if (zzapVarZzf instanceof zzai) {
                return ((zzai) zzapVarZzf).zza(zzgVar, list);
            }
            throw new IllegalArgumentException(v.h(zzapVar.zzi(), " is not a function"));
        }
        if (!"hasOwnProperty".equals(zzapVar.zzi())) {
            throw new IllegalArgumentException(b.b("Object has no function ", zzapVar.zzi()));
        }
        zzh.zzh("hasOwnProperty", 1, list);
        return zzalVar.zzt(zzgVar.zzb((zzap) list.get(0)).zzi()) ? zzap.zzk : zzap.zzl;
    }

    public static Iterator zzb(Map map) {
        return new zzak(map.keySet().iterator());
    }
}
