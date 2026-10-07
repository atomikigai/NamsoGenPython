package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzacm implements zzadx {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzadx
    public final /* synthetic */ int zzf(zzn zznVar, int i, boolean z4) {
        return zzadv.zza(this, zznVar, i, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final int zzg(zzn zznVar, int i, boolean z4, int i10) throws IOException {
        int iZza = zznVar.zza(this.zza, 0, Math.min(4096, i));
        if (iZza != -1) {
            return iZza;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final /* synthetic */ void zzq(zzed zzedVar, int i) {
        zzadv.zzb(this, zzedVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzr(zzed zzedVar, int i, int i10) {
        zzedVar.zzM(i);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzl(zzad zzadVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzs(long j4, int i, int i10, int i11, zzadw zzadwVar) {
    }
}
