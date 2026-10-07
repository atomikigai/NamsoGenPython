package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzs extends zzai {
    final boolean zza;
    final boolean zzb;
    final /* synthetic */ zzt zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzt zztVar, boolean z4, boolean z10) {
        super("log");
        this.zzc = zztVar;
        this.zza = z4;
        this.zzb = z10;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0080  */
    /* JADX WARN: Code duplicated, block: B:25:0x008f A[LOOP:0: B:23:0x0085->B:25:0x008f, LOOP_END] */
    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        int i;
        int i10;
        String strZzi;
        ArrayList arrayList;
        zzh.zzi("log", 1, list);
        if (list.size() == 1) {
            this.zzc.zza.zza(3, zzgVar.zzb((zzap) list.get(0)).zzi(), Collections.EMPTY_LIST, this.zza, this.zzb);
            return zzap.zzf;
        }
        int iZzb = zzh.zzb(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
        if (iZzb != 2) {
            i = 3;
            if (iZzb == 3) {
                i10 = 1;
            } else if (iZzb == 5) {
                i10 = 5;
            } else if (iZzb == 6) {
                i10 = 2;
            }
            strZzi = zzgVar.zzb((zzap) list.get(1)).zzi();
            if (list.size() == 2) {
                this.zzc.zza.zza(i10, strZzi, Collections.EMPTY_LIST, this.zza, this.zzb);
                return zzap.zzf;
            }
            arrayList = new ArrayList();
            for (int i11 = 2; i11 < Math.min(list.size(), 5); i11++) {
                arrayList.add(zzgVar.zzb((zzap) list.get(i11)).zzi());
            }
            this.zzc.zza.zza(i10, strZzi, arrayList, this.zza, this.zzb);
            return zzap.zzf;
        }
        i = 4;
        i10 = i;
        strZzi = zzgVar.zzb((zzap) list.get(1)).zzi();
        if (list.size() == 2) {
            this.zzc.zza.zza(i10, strZzi, Collections.EMPTY_LIST, this.zza, this.zzb);
            return zzap.zzf;
        }
        arrayList = new ArrayList();
        while (i11 < Math.min(list.size(), 5)) {
            arrayList.add(zzgVar.zzb((zzap) list.get(i11)).zzi());
        }
        this.zzc.zza.zza(i10, strZzi, arrayList, this.zza, this.zzb);
        return zzap.zzf;
    }
}
