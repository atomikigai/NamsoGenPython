package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcde extends zzaqy {
    static final zzcde zzb = new zzcde();

    @Override // com.google.android.gms.internal.ads.zzaqy
    public final zzarc zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzare();
        }
        return "mvhd".equals(str) ? new zzarf() : new zzarg(str);
    }
}
