package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzz extends zzd {
    final CharSequence zzb;
    final zzj zzc;
    int zzd = 0;
    int zze = f.API_PRIORITY_OTHER;

    public zzz(zzab zzabVar, CharSequence charSequence) {
        this.zzc = zzabVar.zza;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzd
    public final /* bridge */ /* synthetic */ Object zza() {
        int iZzc;
        int i = this.zzd;
        while (true) {
            int i10 = this.zzd;
            if (i10 == -1) {
                zzb();
                return null;
            }
            int iZzd = zzd(i10);
            if (iZzd == -1) {
                iZzd = this.zzb.length();
                this.zzd = -1;
                iZzc = -1;
            } else {
                iZzc = zzc(iZzd);
                this.zzd = iZzc;
            }
            if (iZzc != i) {
                if (i < iZzd) {
                    this.zzb.charAt(i);
                }
                if (i < iZzd) {
                    this.zzb.charAt(iZzd - 1);
                }
                int i11 = this.zze;
                if (i11 == 1) {
                    iZzd = this.zzb.length();
                    this.zzd = -1;
                    if (iZzd > i) {
                        this.zzb.charAt(iZzd - 1);
                    }
                } else {
                    this.zze = i11 - 1;
                }
                return this.zzb.subSequence(i, iZzd).toString();
            }
            int i12 = iZzc + 1;
            this.zzd = i12;
            if (i12 > this.zzb.length()) {
                this.zzd = -1;
            }
        }
    }

    public abstract int zzc(int i);

    public abstract int zzd(int i);
}
