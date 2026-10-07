package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzkc extends zzke {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    public /* synthetic */ zzkc(byte[] bArr, int i, int i10, boolean z4, zzkb zzkbVar) {
        super(null);
        this.zze = f.API_PRIORITY_OTHER;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i) throws zzll {
        int i10 = this.zze;
        this.zze = 0;
        int i11 = this.zzc + this.zzd;
        this.zzc = i11;
        if (i11 <= 0) {
            this.zzd = 0;
            return i10;
        }
        this.zzd = i11;
        this.zzc = 0;
        return i10;
    }
}
