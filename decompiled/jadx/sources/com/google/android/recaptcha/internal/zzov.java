package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzov extends zzit implements zzkf {
    private static final zzov zzb;
    private String zzd = "";
    private String zze = "";

    static {
        zzov zzovVar = new zzov();
        zzb = zzovVar;
        zzit.zzD(zzov.class, zzovVar);
    }

    private zzov() {
    }

    public static zzou zzf() {
        return (zzou) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzov zzovVar, String str) {
        str.getClass();
        zzovVar.zzd = str;
    }

    @Override // com.google.android.recaptcha.internal.zzit
    public final Object zzh(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzit.zzA(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new zzov();
        }
        zzor zzorVar = null;
        if (i10 == 4) {
            return new zzou(zzorVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
