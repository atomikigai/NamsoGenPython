package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdk extends zzfi implements zzgm {
    private static final zzdk zzb;
    private zzfn zzd = zzfi.zzr();

    static {
        zzdk zzdkVar = new zzdk();
        zzb = zzdkVar;
        zzfi.zzw(zzdk.class, zzdkVar);
    }

    private zzdk() {
    }

    public static zzdj zza() {
        return (zzdj) zzb.zzl();
    }

    public static /* synthetic */ void zzd(zzdk zzdkVar, Iterable iterable) {
        zzfn zzfnVar = zzdkVar.zzd;
        if (!zzfnVar.zzc()) {
            int size = zzfnVar.size();
            zzdkVar.zzd = zzfnVar.zzd(size + size);
        }
        zzds.zzg(iterable, zzdkVar.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    public final Object zzb(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzfi.zzt(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzdi.class});
        }
        if (i10 == 3) {
            return new zzdk();
        }
        zzdl zzdlVar = null;
        if (i10 == 4) {
            return new zzdj(zzdlVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
