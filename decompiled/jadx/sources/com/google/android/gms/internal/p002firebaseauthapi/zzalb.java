package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzalb extends zzald {
    public /* synthetic */ zzalb(zzala zzalaVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final List zza(Object obj, long j4) {
        zzakp zzakpVar = (zzakp) zzanf.zzf(obj, j4);
        if (zzakpVar.zzc()) {
            return zzakpVar;
        }
        int size = zzakpVar.size();
        zzakp zzakpVarZzd = zzakpVar.zzd(size == 0 ? 10 : size + size);
        zzanf.zzs(obj, j4, zzakpVarZzd);
        return zzakpVarZzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final void zzb(Object obj, long j4) {
        ((zzakp) zzanf.zzf(obj, j4)).zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final void zzc(Object obj, Object obj2, long j4) {
        zzakp zzakpVarZzd = (zzakp) zzanf.zzf(obj, j4);
        zzakp zzakpVar = (zzakp) zzanf.zzf(obj2, j4);
        int size = zzakpVarZzd.size();
        int size2 = zzakpVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzakpVarZzd.zzc()) {
                zzakpVarZzd = zzakpVarZzd.zzd(size2 + size);
            }
            zzakpVarZzd.addAll(zzakpVar);
        }
        if (size > 0) {
            zzakpVar = zzakpVarZzd;
        }
        zzanf.zzs(obj, j4, zzakpVar);
    }

    private zzalb() {
        super(null);
    }
}
