package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzadh {
    private final zzed zza = new zzed(10);

    public final zzbd zza(zzacs zzacsVar, zzagi zzagiVar) throws IOException {
        zzbd zzbdVarZza = null;
        int i = 0;
        while (true) {
            try {
                zzacsVar.zzh(this.zza.zzN(), 0, 10);
                this.zza.zzL(0);
                if (this.zza.zzo() != 4801587) {
                    break;
                }
                this.zza.zzM(3);
                int iZzl = this.zza.zzl();
                int i10 = iZzl + 10;
                if (zzbdVarZza == null) {
                    byte[] bArr = new byte[i10];
                    System.arraycopy(this.zza.zzN(), 0, bArr, 0, 10);
                    zzacsVar.zzh(bArr, 10, iZzl);
                    zzbdVarZza = zzagk.zza(bArr, i10, zzagiVar, new zzafm());
                } else {
                    zzacsVar.zzg(iZzl);
                }
                i += i10;
            } catch (EOFException unused) {
            }
        }
        zzacsVar.zzj();
        zzacsVar.zzg(i);
        return zzbdVarZza;
    }
}
