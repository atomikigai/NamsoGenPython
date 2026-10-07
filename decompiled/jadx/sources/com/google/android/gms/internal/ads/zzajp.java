package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzajp {
    private final zzajq zza = new zzajq();
    private final zzed zzb = new zzed(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    private final int zzf(int i) {
        int i10;
        int i11 = 0;
        this.zzd = 0;
        do {
            int i12 = this.zzd;
            int i13 = i + i12;
            zzajq zzajqVar = this.zza;
            if (i13 >= zzajqVar.zzc) {
                break;
            }
            this.zzd = i12 + 1;
            i10 = zzajqVar.zzf[i13];
            i11 += i10;
        } while (i10 == 255);
        return i11;
    }

    public final zzed zza() {
        return this.zzb;
    }

    public final zzajq zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zza.zza();
        this.zzb.zzI(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final void zzd() {
        zzed zzedVar = this.zzb;
        if (zzedVar.zzN().length == 65025) {
            return;
        }
        zzedVar.zzJ(Arrays.copyOf(zzedVar.zzN(), Math.max(65025, zzedVar.zze())), this.zzb.zze());
    }

    public final boolean zze(zzacs zzacsVar) throws IOException {
        if (this.zze) {
            this.zze = false;
            this.zzb.zzI(0);
        }
        while (true) {
            if (this.zze) {
                return true;
            }
            int i = this.zzc;
            if (i < 0) {
                if (!this.zza.zzc(zzacsVar, -1L) || !this.zza.zzb(zzacsVar, true)) {
                    return false;
                }
                zzajq zzajqVar = this.zza;
                int iZzf = zzajqVar.zzd;
                if ((zzajqVar.zza & 1) == 1 && this.zzb.zze() == 0) {
                    iZzf += zzf(0);
                    i = this.zzd;
                } else {
                    i = 0;
                }
                if (!zzacv.zze(zzacsVar, iZzf)) {
                    return false;
                }
                this.zzc = i;
            }
            int iZzf2 = zzf(i);
            int i10 = this.zzc + this.zzd;
            if (iZzf2 > 0) {
                zzed zzedVar = this.zzb;
                zzedVar.zzF(zzedVar.zze() + iZzf2);
                zzed zzedVar2 = this.zzb;
                if (!zzacv.zzd(zzacsVar, zzedVar2.zzN(), zzedVar2.zze(), iZzf2)) {
                    return false;
                }
                zzed zzedVar3 = this.zzb;
                zzedVar3.zzK(zzedVar3.zze() + iZzf2);
                this.zze = this.zza.zzf[i10 + (-1)] != 255;
            }
            if (i10 == this.zza.zzc) {
                i10 = -1;
            }
            this.zzc = i10;
        }
    }
}
