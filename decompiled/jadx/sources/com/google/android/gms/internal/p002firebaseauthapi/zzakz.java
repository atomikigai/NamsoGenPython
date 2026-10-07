package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzakz extends zzald {
    private static final Class zza = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public /* synthetic */ zzakz(zzaky zzakyVar) {
        super(null);
    }

    private static List zzf(Object obj, long j4, int i) {
        List listZzd;
        List list = (List) zzanf.zzf(obj, j4);
        if (list.isEmpty()) {
            if (list instanceof zzakx) {
                listZzd = new zzakw(i);
            } else {
                listZzd = ((list instanceof zzalw) && (list instanceof zzakp)) ? ((zzakp) list).zzd(i) : new ArrayList(i);
            }
            zzanf.zzs(obj, j4, listZzd);
            return listZzd;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            zzanf.zzs(obj, j4, arrayList);
            return arrayList;
        }
        if (list instanceof zzana) {
            zzakw zzakwVar = new zzakw(list.size() + i);
            zzakwVar.addAll(zzakwVar.size(), (zzana) list);
            zzanf.zzs(obj, j4, zzakwVar);
            return zzakwVar;
        }
        if ((list instanceof zzalw) && (list instanceof zzakp)) {
            zzakp zzakpVar = (zzakp) list;
            if (!zzakpVar.zzc()) {
                zzakp zzakpVarZzd = zzakpVar.zzd(list.size() + i);
                zzanf.zzs(obj, j4, zzakpVarZzd);
                return zzakpVarZzd;
            }
        }
        return list;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final List zza(Object obj, long j4) {
        return zzf(obj, j4, 10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final void zzb(Object obj, long j4) {
        Object objUnmodifiableList;
        List list = (List) zzanf.zzf(obj, j4);
        if (list instanceof zzakx) {
            objUnmodifiableList = ((zzakx) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzalw) && (list instanceof zzakp)) {
                zzakp zzakpVar = (zzakp) list;
                if (zzakpVar.zzc()) {
                    zzakpVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzanf.zzs(obj, j4, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final void zzc(Object obj, Object obj2, long j4) {
        List list = (List) zzanf.zzf(obj2, j4);
        List listZzf = zzf(obj, j4, list.size());
        int size = listZzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listZzf.addAll(list);
        }
        if (size > 0) {
            list = listZzf;
        }
        zzanf.zzs(obj, j4, list);
    }

    private zzakz() {
        super(null);
    }
}
