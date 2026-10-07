package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgd implements zzgw {
    private static final zzgj zza = new zzgb();
    private final zzgj zzb;

    public zzgd() {
        zzfd zzfdVarZza = zzfd.zza();
        int i = zzgs.zza;
        zzgc zzgcVar = new zzgc(zzfdVarZza, zza);
        byte[] bArr = zzfo.zzb;
        this.zzb = zzgcVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgw
    public final zzgv zza(Class cls) {
        int i = zzgx.zza;
        if (!zzfi.class.isAssignableFrom(cls)) {
            int i10 = zzgs.zza;
        }
        zzgi zzgiVarZzb = this.zzb.zzb(cls);
        if (zzgiVarZzb.zzb()) {
            int i11 = zzgs.zza;
            return zzgp.zzc(zzgx.zzm(), zzex.zza(), zzgiVarZzb.zza());
        }
        int i12 = zzgs.zza;
        return zzgo.zzl(cls, zzgiVarZzb, zzgr.zza(), zzfz.zza(), zzgx.zzm(), zzgiVarZzb.zzc() + (-1) != 1 ? zzex.zza() : null, zzgh.zza());
    }
}
