package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzalg implements zzaln {
    private final zzaln[] zza;

    public zzalg(zzaln... zzalnVarArr) {
        this.zza = zzalnVarArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaln
    public final zzalm zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzaln zzalnVar = this.zza[i];
            if (zzalnVar.zzc(cls)) {
                return zzalnVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaln
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
