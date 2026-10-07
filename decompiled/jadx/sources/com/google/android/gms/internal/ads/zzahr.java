package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzahr {
    private final zzed zza = new zzed(8);
    private int zzb;

    private final long zzb(zzacs zzacsVar) throws IOException {
        int i;
        zzacg zzacgVar = (zzacg) zzacsVar;
        int i10 = 0;
        zzacgVar.zzm(this.zza.zzN(), 0, 1, false);
        int i11 = this.zza.zzN()[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while (true) {
            i = i13 + 1;
            if ((i11 & i12) != 0) {
                break;
            }
            i12 >>= 1;
            i13 = i;
        }
        int i14 = i11 & (~i12);
        zzacgVar.zzm(this.zza.zzN(), 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (this.zza.zzN()[i10] & 255) + (i14 << 8);
        }
        this.zzb += i;
        return i14;
    }

    public final boolean zza(zzacs zzacsVar) throws IOException {
        long jZzd = zzacsVar.zzd();
        long j4 = 1024;
        if (jZzd != -1 && jZzd <= 1024) {
            j4 = jZzd;
        }
        zzacg zzacgVar = (zzacg) zzacsVar;
        zzacgVar.zzm(this.zza.zzN(), 0, 4, false);
        long jZzu = this.zza.zzu();
        this.zzb = 4;
        while (jZzu != 440786851) {
            int i = (int) j4;
            int i10 = this.zzb + 1;
            this.zzb = i10;
            if (i10 == i) {
                return false;
            }
            zzacgVar.zzm(this.zza.zzN(), 0, 1, false);
            jZzu = ((jZzu << 8) & (-256)) | ((long) (this.zza.zzN()[0] & 255));
        }
        long jZzb = zzb(zzacsVar);
        long j10 = this.zzb;
        if (jZzb != Long.MIN_VALUE) {
            long j11 = j10 + jZzb;
            if (jZzd == -1 || j11 < jZzd) {
                while (true) {
                    long j12 = this.zzb;
                    if (j12 < j11) {
                        if (zzb(zzacsVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jZzb2 = zzb(zzacsVar);
                        if (jZzb2 < 0) {
                            return false;
                        }
                        if (jZzb2 != 0) {
                            int i11 = (int) jZzb2;
                            zzacgVar.zzl(i11, false);
                            this.zzb += i11;
                        }
                    } else if (j12 == j11) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
