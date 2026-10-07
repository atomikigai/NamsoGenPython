package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfww extends zzfxb {
    final /* synthetic */ zzfwx zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfww(zzfwx zzfwxVar, zzfxd zzfxdVar, CharSequence charSequence) {
        super(zzfxdVar, charSequence);
        this.zza = zzfwxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final int zzd(int i) {
        CharSequence charSequence = ((zzfxb) this).zzb;
        int length = charSequence.length();
        zzfwq.zzb(i, length, "index");
        while (i < length) {
            zzfwx zzfwxVar = this.zza;
            if (zzfwxVar.zza.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
