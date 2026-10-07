package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzej extends zzel {
    private int zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzej(byte[] bArr, int i, int i10, boolean z4, zzek zzekVar) {
        super(null);
        this.zzd = f.API_PRIORITY_OTHER;
        this.zzb = 0;
    }

    public final int zza(int i) throws zzfq {
        int i10 = this.zzd;
        this.zzd = 0;
        int i11 = this.zzb + this.zzc;
        this.zzb = i11;
        if (i11 <= 0) {
            this.zzc = 0;
            return i10;
        }
        this.zzc = i11;
        this.zzb = 0;
        return i10;
    }
}
