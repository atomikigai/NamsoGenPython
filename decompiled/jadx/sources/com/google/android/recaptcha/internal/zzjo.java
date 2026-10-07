package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
final class zzjo extends zzjs {
    private static final Class zza = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public /* synthetic */ zzjo(zzjn zzjnVar) {
        super(null);
    }

    private static List zzf(Object obj, long j4, int i) {
        List listZzd;
        List list = (List) zzlv.zzf(obj, j4);
        if (list.isEmpty()) {
            if (list instanceof zzjm) {
                listZzd = new zzjl(i);
            } else {
                listZzd = ((list instanceof zzkm) && (list instanceof zzjb)) ? ((zzjb) list).zzd(i) : new ArrayList(i);
            }
            zzlv.zzs(obj, j4, listZzd);
            return listZzd;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            zzlv.zzs(obj, j4, arrayList);
            return arrayList;
        }
        if (list instanceof zzlq) {
            zzjl zzjlVar = new zzjl(list.size() + i);
            zzjlVar.addAll(zzjlVar.size(), (zzlq) list);
            zzlv.zzs(obj, j4, zzjlVar);
            return zzjlVar;
        }
        if ((list instanceof zzkm) && (list instanceof zzjb)) {
            zzjb zzjbVar = (zzjb) list;
            if (!zzjbVar.zzc()) {
                zzjb zzjbVarZzd = zzjbVar.zzd(list.size() + i);
                zzlv.zzs(obj, j4, zzjbVarZzd);
                return zzjbVarZzd;
            }
        }
        return list;
    }

    @Override // com.google.android.recaptcha.internal.zzjs
    public final List zza(Object obj, long j4) {
        return zzf(obj, j4, 10);
    }

    @Override // com.google.android.recaptcha.internal.zzjs
    public final void zzb(Object obj, long j4) {
        Object objUnmodifiableList;
        List list = (List) zzlv.zzf(obj, j4);
        if (list instanceof zzjm) {
            objUnmodifiableList = ((zzjm) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzkm) && (list instanceof zzjb)) {
                zzjb zzjbVar = (zzjb) list;
                if (zzjbVar.zzc()) {
                    zzjbVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzlv.zzs(obj, j4, objUnmodifiableList);
    }

    @Override // com.google.android.recaptcha.internal.zzjs
    public final void zzc(Object obj, Object obj2, long j4) {
        List list = (List) zzlv.zzf(obj2, j4);
        List listZzf = zzf(obj, j4, list.size());
        int size = listZzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listZzf.addAll(list);
        }
        if (size > 0) {
            list = listZzf;
        }
        zzlv.zzs(obj, j4, list);
    }

    private zzjo() {
        super(null);
    }
}
