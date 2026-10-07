package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzfxb extends zzfvz {
    final CharSequence zzb;
    int zzc = 0;
    int zzd = f.API_PRIORITY_OTHER;

    public zzfxb(zzfxd zzfxdVar, CharSequence charSequence) {
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzfvz
    public final /* bridge */ /* synthetic */ Object zza() {
        int iZzc;
        int i = this.zzc;
        while (true) {
            int i10 = this.zzc;
            if (i10 == -1) {
                zzb();
                return null;
            }
            int iZzd = zzd(i10);
            if (iZzd == -1) {
                iZzd = this.zzb.length();
                this.zzc = -1;
                iZzc = -1;
            } else {
                iZzc = zzc(iZzd);
                this.zzc = iZzc;
            }
            if (iZzc != i) {
                if (i < iZzd) {
                    this.zzb.charAt(i);
                }
                if (i < iZzd) {
                    this.zzb.charAt(iZzd - 1);
                }
                int i11 = this.zzd;
                if (i11 == 1) {
                    iZzd = this.zzb.length();
                    this.zzc = -1;
                    if (iZzd > i) {
                        this.zzb.charAt(iZzd - 1);
                    }
                } else {
                    this.zzd = i11 - 1;
                }
                return this.zzb.subSequence(i, iZzd).toString();
            }
            int i12 = iZzc + 1;
            this.zzc = i12;
            if (i12 > this.zzb.length()) {
                this.zzc = -1;
            }
        }
    }

    public abstract int zzc(int i);

    public abstract int zzd(int i);
}
