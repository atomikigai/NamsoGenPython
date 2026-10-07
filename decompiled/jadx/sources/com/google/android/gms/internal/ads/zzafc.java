package com.google.android.gms.internal.ads;

import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzafc extends zzafb {
    private final zzed zzb;
    private final zzed zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzafc(zzadx zzadxVar) {
        super(zzadxVar);
        this.zzb = new zzed(zzfp.zza);
        this.zzc = new zzed(4);
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final boolean zza(zzed zzedVar) throws zzafa {
        int iZzm = zzedVar.zzm();
        int i = iZzm >> 4;
        int i10 = iZzm & 15;
        if (i10 != 7) {
            throw new zzafa(v.f(i10, "Video format not supported: "));
        }
        this.zzg = i;
        return i != 5;
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final boolean zzb(zzed zzedVar, long j4) throws zzbh {
        int i;
        int iZzm = zzedVar.zzm();
        long jZzh = zzedVar.zzh();
        if (iZzm == 0) {
            if (!this.zze) {
                zzed zzedVar2 = new zzed(new byte[zzedVar.zzb()]);
                zzedVar.zzH(zzedVar2.zzN(), 0, zzedVar.zzb());
                zzabv zzabvVarZza = zzabv.zza(zzedVar2);
                this.zzd = zzabvVarZza.zzb;
                zzab zzabVar = new zzab();
                zzabVar.zzZ("video/avc");
                zzabVar.zzA(zzabvVarZza.zzl);
                zzabVar.zzae(zzabvVarZza.zzc);
                zzabVar.zzJ(zzabvVarZza.zzd);
                zzabVar.zzV(zzabvVarZza.zzk);
                zzabVar.zzM(zzabvVarZza.zza);
                this.zza.zzl(zzabVar.zzaf());
                this.zze = true;
                return false;
            }
        } else if (iZzm == 1 && this.zze) {
            int i10 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i = i10;
            } else if (i10 != 0) {
                i = 1;
            }
            byte[] bArrZzN = this.zzc.zzN();
            bArrZzN[0] = 0;
            bArrZzN[1] = 0;
            bArrZzN[2] = 0;
            int i11 = 4 - this.zzd;
            int i12 = 0;
            while (zzedVar.zzb() > 0) {
                zzedVar.zzH(this.zzc.zzN(), i11, this.zzd);
                this.zzc.zzL(0);
                zzed zzedVar3 = this.zzc;
                zzed zzedVar4 = this.zzb;
                int iZzp = zzedVar3.zzp();
                zzedVar4.zzL(0);
                this.zza.zzq(this.zzb, 4);
                this.zza.zzq(zzedVar, iZzp);
                i12 = i12 + 4 + iZzp;
            }
            this.zza.zzs((jZzh * 1000) + j4, i, i12, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
