package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfwy extends zzfxb {
    public zzfwy(zzfwz zzfwzVar, zzfxd zzfxdVar, CharSequence charSequence) {
        super(zzfxdVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final int zzd(int i) {
        int i10 = i + 4000;
        if (i10 < ((zzfxb) this).zzb.length()) {
            return i10;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final int zzc(int i) {
        return i;
    }
}
