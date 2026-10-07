package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfzm extends zzfxo {
    private final zzfzo zza;

    public zzfzm(zzfzo zzfzoVar, int i) {
        super(zzfzoVar.size(), i);
        this.zza = zzfzoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
