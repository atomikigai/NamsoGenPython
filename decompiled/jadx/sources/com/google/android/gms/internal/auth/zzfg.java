package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfg extends zzfk {
    private static final Class zza = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public /* synthetic */ zzfg(zzff zzffVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.zzfk
    public final void zza(Object obj, long j4) {
        Object objUnmodifiableList;
        List list = (List) zzhi.zzf(obj, j4);
        if (list instanceof zzfe) {
            objUnmodifiableList = ((zzfe) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzgd) && (list instanceof zzey)) {
                zzey zzeyVar = (zzey) list;
                if (zzeyVar.zzc()) {
                    zzeyVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzhi.zzp(obj, j4, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.auth.zzfk
    public final void zzb(Object obj, Object obj2, long j4) {
        List list;
        List list2;
        List listZzd;
        List list3 = (List) zzhi.zzf(obj2, j4);
        int size = list3.size();
        List list4 = (List) zzhi.zzf(obj, j4);
        if (list4.isEmpty()) {
            if (list4 instanceof zzfe) {
                listZzd = new zzfd(size);
            } else {
                listZzd = ((list4 instanceof zzgd) && (list4 instanceof zzey)) ? ((zzey) list4).zzd(size) : new ArrayList(size);
            }
            zzhi.zzp(obj, j4, listZzd);
            list2 = listZzd;
        } else {
            if (zza.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                zzhi.zzp(obj, j4, arrayList);
                list = arrayList;
            } else if (list4 instanceof zzhd) {
                zzfd zzfdVar = new zzfd(list4.size() + size);
                zzfdVar.addAll(zzfdVar.size(), (zzhd) list4);
                zzhi.zzp(obj, j4, zzfdVar);
                list = zzfdVar;
            } else if ((list4 instanceof zzgd) && (list4 instanceof zzey)) {
                zzey zzeyVar = (zzey) list4;
                if (!zzeyVar.zzc()) {
                    list2 = list4;
                    list2 = list4;
                    list2 = list4;
                    zzey zzeyVarZzd = zzeyVar.zzd(list4.size() + size);
                    zzhi.zzp(obj, j4, zzeyVarZzd);
                    list2 = zzeyVarZzd;
                }
            }
            list2 = list;
        }
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        zzhi.zzp(obj, j4, list3);
    }

    private zzfg() {
        super(null);
    }
}
