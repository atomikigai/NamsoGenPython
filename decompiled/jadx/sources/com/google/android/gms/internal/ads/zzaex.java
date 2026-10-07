package com.google.android.gms.internal.ads;

import da.v;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaex extends zzafb {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzaex(zzadx zzadxVar) {
        super(zzadxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final boolean zza(zzed zzedVar) throws zzafa {
        if (this.zzc) {
            zzedVar.zzM(1);
        } else {
            int iZzm = zzedVar.zzm();
            int i = iZzm >> 4;
            this.zze = i;
            if (i == 2) {
                int i10 = zzb[(iZzm >> 2) & 3];
                zzab zzabVar = new zzab();
                zzabVar.zzZ("audio/mpeg");
                zzabVar.zzz(1);
                zzabVar.zzaa(i10);
                this.zza.zzl(zzabVar.zzaf());
                this.zzd = true;
            } else if (i == 7 || i == 8) {
                zzab zzabVar2 = new zzab();
                zzabVar2.zzZ(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                zzabVar2.zzz(1);
                zzabVar2.zzaa(8000);
                this.zza.zzl(zzabVar2.zzaf());
                this.zzd = true;
            } else if (i != 10) {
                throw new zzafa(v.f(i, "Audio format not supported: "));
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final boolean zzb(zzed zzedVar, long j4) throws zzbh {
        if (this.zze == 2) {
            int iZzb = zzedVar.zzb();
            this.zza.zzq(zzedVar, iZzb);
            this.zza.zzs(j4, 1, iZzb, 0, null);
            return true;
        }
        int iZzm = zzedVar.zzm();
        if (iZzm != 0 || this.zzd) {
            if (this.zze == 10 && iZzm != 1) {
                return false;
            }
            int iZzb2 = zzedVar.zzb();
            this.zza.zzq(zzedVar, iZzb2);
            this.zza.zzs(j4, 1, iZzb2, 0, null);
            return true;
        }
        int iZzb3 = zzedVar.zzb();
        byte[] bArr = new byte[iZzb3];
        zzedVar.zzH(bArr, 0, iZzb3);
        zzabm zzabmVarZza = zzabo.zza(bArr);
        zzab zzabVar = new zzab();
        zzabVar.zzZ("audio/mp4a-latm");
        zzabVar.zzA(zzabmVarZza.zzc);
        zzabVar.zzz(zzabmVarZza.zzb);
        zzabVar.zzaa(zzabmVarZza.zza);
        zzabVar.zzM(Collections.singletonList(bArr));
        this.zza.zzl(zzabVar.zzaf());
        this.zzd = true;
        return false;
    }
}
