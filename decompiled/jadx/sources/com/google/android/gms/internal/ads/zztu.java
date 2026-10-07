package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zztu implements zzwg {
    public final zzwg zza;
    final /* synthetic */ zztv zzb;
    private boolean zzc;

    public zztu(zztv zztvVar, zzwg zzwgVar) {
        this.zzb = zztvVar;
        this.zza = zzwgVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    @Override // com.google.android.gms.internal.ads.zzwg
    public final int zza(zzkj zzkjVar, zzhm zzhmVar, int i) {
        zztv zztvVar = this.zzb;
        if (zztvVar.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzhmVar.zzc(4);
            return -4;
        }
        long jZzb = zztvVar.zzb();
        int iZza = this.zza.zza(zzkjVar, zzhmVar, i);
        if (iZza != -5) {
            long j4 = this.zzb.zzb;
            if (j4 == Long.MIN_VALUE || ((iZza != -4 || zzhmVar.zze < j4) && !(iZza == -3 && jZzb == Long.MIN_VALUE && !zzhmVar.zzd))) {
                return iZza;
            }
            zzhmVar.zzb();
            zzhmVar.zzc(4);
            this.zzc = true;
            return -4;
        }
        zzad zzadVar = zzkjVar.zza;
        zzadVar.getClass();
        int i10 = zzadVar.zzF;
        if (i10 != 0) {
            int i11 = this.zzb.zzb == Long.MIN_VALUE ? zzadVar.zzG : 0;
            zzab zzabVarZzb = zzadVar.zzb();
            zzabVarZzb.zzG(i10);
            zzabVarZzb.zzH(i11);
            zzkjVar.zza = zzabVarZzb.zzaf();
        } else if (zzadVar.zzG != 0) {
            i10 = 0;
            if (this.zzb.zzb == Long.MIN_VALUE) {
            }
            zzab zzabVarZzb2 = zzadVar.zzb();
            zzabVarZzb2.zzG(i10);
            zzabVarZzb2.zzH(i11);
            zzkjVar.zza = zzabVarZzb2.zzaf();
        }
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final int zzb(long j4) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j4);
    }

    public final void zzc() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}
