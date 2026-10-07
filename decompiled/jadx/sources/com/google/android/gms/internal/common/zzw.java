package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzw extends zzj {
    final CharSequence zzb;
    final zzo zzc;
    final boolean zzd;
    int zze = 0;
    int zzf = f.API_PRIORITY_OTHER;

    public zzw(zzx zzxVar, CharSequence charSequence) {
        this.zzc = zzxVar.zza;
        this.zzd = zzxVar.zzb;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.common.zzj
    public final /* bridge */ /* synthetic */ Object zza() {
        int iZzc;
        int i = this.zze;
        while (true) {
            int i10 = this.zze;
            if (i10 == -1) {
                zzb();
                return null;
            }
            int iZzd = zzd(i10);
            if (iZzd == -1) {
                iZzd = this.zzb.length();
                this.zze = -1;
                iZzc = -1;
            } else {
                iZzc = zzc(iZzd);
                this.zze = iZzc;
            }
            if (iZzc == i) {
                int i11 = iZzc + 1;
                this.zze = i11;
                if (i11 > this.zzb.length()) {
                    this.zze = -1;
                }
            } else {
                if (i < iZzd) {
                    this.zzb.charAt(i);
                }
                if (i < iZzd) {
                    this.zzb.charAt(iZzd - 1);
                }
                if (!this.zzd || i != iZzd) {
                    int i12 = this.zzf;
                    if (i12 == 1) {
                        iZzd = this.zzb.length();
                        this.zze = -1;
                        if (iZzd > i) {
                            this.zzb.charAt(iZzd - 1);
                        }
                    } else {
                        this.zzf = i12 - 1;
                    }
                    return this.zzb.subSequence(i, iZzd).toString();
                }
                i = this.zze;
            }
        }
    }

    public abstract int zzc(int i);

    public abstract int zzd(int i);
}
