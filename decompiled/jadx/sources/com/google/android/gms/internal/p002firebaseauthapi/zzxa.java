package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzxa extends zzakk implements zzalq {
    private static final zzxa zzb;
    private int zzd;
    private zzakp zze = zzakk.zzA();

    static {
        zzxa zzxaVar = new zzxa();
        zzb = zzxaVar;
        zzakk.zzH(zzxa.class, zzxaVar);
    }

    private zzxa() {
    }

    public static zzwx zza() {
        return (zzwx) zzb.zzt();
    }

    public static /* synthetic */ void zze(zzxa zzxaVar, zzwz zzwzVar) {
        zzwzVar.getClass();
        zzakp zzakpVar = zzxaVar.zze;
        if (!zzakpVar.zzc()) {
            zzxaVar.zze = zzakk.zzB(zzakpVar);
        }
        zzxaVar.zze.add(zzwzVar);
    }

    public final zzwz zzb(int i) {
        return (zzwz) this.zze.get(0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final Object zzj(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", zzwz.class});
        }
        if (i10 == 3) {
            return new zzxa();
        }
        zzww zzwwVar = null;
        if (i10 == 4) {
            return new zzwx(zzwwVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
