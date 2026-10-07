package com.google.android.gms.internal.measurement;

import java.util.List;
import q1.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbc extends zzaw {
    public zzbc() {
        this.zza.add(zzbl.AND);
        this.zza.add(zzbl.NOT);
        this.zza.add(zzbl.OR);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List list) {
        zzbl zzblVar = zzbl.ADD;
        int iOrdinal = zzh.zze(str).ordinal();
        if (iOrdinal == 1) {
            zzap zzapVarZzb = zzgVar.zzb((zzap) a.h(zzbl.AND, 2, list, 0));
            return !zzapVarZzb.zzg().booleanValue() ? zzapVarZzb : zzgVar.zzb((zzap) list.get(1));
        }
        if (iOrdinal == 47) {
            return new zzaf(Boolean.valueOf(!zzgVar.zzb((zzap) a.h(zzbl.NOT, 1, list, 0)).zzg().booleanValue()));
        }
        if (iOrdinal != 50) {
            return zzb(str);
        }
        zzap zzapVarZzb2 = zzgVar.zzb((zzap) a.h(zzbl.OR, 2, list, 0));
        return zzapVarZzb2.zzg().booleanValue() ? zzapVarZzb2 : zzgVar.zzb((zzap) list.get(1));
    }
}
