package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzamr implements zzamm {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzaod zzb;
    private final zzed zzc;
    private final boolean[] zzd;
    private final zzamp zze;
    private final zzane zzf;
    private zzamq zzg;
    private long zzh;
    private String zzi;
    private zzadx zzj;
    private boolean zzk;
    private long zzl;

    public zzamr() {
        this(null);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0113  */
    /* JADX WARN: Code duplicated, block: B:53:0x0184  */
    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zza(zzed zzedVar) {
        int i;
        int i10;
        zzdb.zzb(this.zzg);
        zzdb.zzb(this.zzj);
        int iZzd = zzedVar.zzd();
        int iZze = zzedVar.zze();
        byte[] bArrZzN = zzedVar.zzN();
        this.zzh += (long) zzedVar.zzb();
        this.zzj.zzq(zzedVar, zzedVar.zzb());
        while (true) {
            int iZza = zzfp.zza(bArrZzN, iZzd, iZze, this.zzd);
            if (iZza == iZze) {
                break;
            }
            int i11 = iZza + 3;
            int i12 = zzedVar.zzN()[i11] & 255;
            int i13 = iZza - iZzd;
            if (!this.zzk) {
                if (i13 > 0) {
                    this.zze.zza(bArrZzN, iZzd, iZza);
                }
                if (this.zze.zzc(i12, i13 < 0 ? -i13 : 0)) {
                    zzadx zzadxVar = this.zzj;
                    zzamp zzampVar = this.zze;
                    int i14 = zzampVar.zzb;
                    String str = this.zzi;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(zzampVar.zzc, zzampVar.zza);
                    zzec zzecVar = new zzec(bArrCopyOf, bArrCopyOf.length);
                    zzecVar.zzo(i14);
                    zzecVar.zzo(4);
                    zzecVar.zzm();
                    zzecVar.zzn(8);
                    if (zzecVar.zzp()) {
                        zzecVar.zzn(4);
                        zzecVar.zzn(3);
                    }
                    int iZzd2 = zzecVar.zzd(4);
                    float f10 = 1.0f;
                    if (iZzd2 == 15) {
                        int iZzd3 = zzecVar.zzd(8);
                        int iZzd4 = zzecVar.zzd(8);
                        if (iZzd4 == 0) {
                            zzdt.zzf("H263Reader", "Invalid aspect ratio");
                        } else {
                            f10 = iZzd3 / iZzd4;
                        }
                    } else if (iZzd2 < 7) {
                        f10 = zza[iZzd2];
                    } else {
                        zzdt.zzf("H263Reader", "Invalid aspect ratio");
                    }
                    float f11 = f10;
                    if (zzecVar.zzp()) {
                        zzecVar.zzn(2);
                        zzecVar.zzn(1);
                        if (zzecVar.zzp()) {
                            zzecVar.zzn(15);
                            zzecVar.zzm();
                            zzecVar.zzn(15);
                            zzecVar.zzm();
                            zzecVar.zzn(15);
                            zzecVar.zzm();
                            zzecVar.zzn(3);
                            zzecVar.zzn(11);
                            zzecVar.zzm();
                            zzecVar.zzn(15);
                            zzecVar.zzm();
                            i10 = 2;
                        } else {
                            i10 = 2;
                        }
                    } else {
                        i10 = 2;
                    }
                    if (zzecVar.zzd(i10) != 0) {
                        zzdt.zzf("H263Reader", "Unhandled video object layer shape");
                    }
                    zzecVar.zzm();
                    int iZzd5 = zzecVar.zzd(16);
                    zzecVar.zzm();
                    if (zzecVar.zzp()) {
                        if (iZzd5 == 0) {
                            zzdt.zzf("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i15 = iZzd5 - 1;
                            int i16 = 0;
                            while (i15 > 0) {
                                i15 >>= 1;
                                i16++;
                            }
                            zzecVar.zzn(i16);
                        }
                    }
                    zzecVar.zzm();
                    int iZzd6 = zzecVar.zzd(13);
                    zzecVar.zzm();
                    int iZzd7 = zzecVar.zzd(13);
                    zzecVar.zzm();
                    zzecVar.zzm();
                    zzab zzabVar = new zzab();
                    zzabVar.zzL(str);
                    zzabVar.zzZ("video/mp4v-es");
                    zzabVar.zzae(iZzd6);
                    zzabVar.zzJ(iZzd7);
                    zzabVar.zzV(f11);
                    zzabVar.zzM(Collections.singletonList(bArrCopyOf));
                    zzadxVar.zzl(zzabVar.zzaf());
                    this.zzk = true;
                }
            }
            this.zzg.zza(bArrZzN, iZzd, iZza);
            zzane zzaneVar = this.zzf;
            if (zzaneVar != null) {
                if (i13 > 0) {
                    zzaneVar.zza(bArrZzN, iZzd, iZza);
                    i = 0;
                } else {
                    i = -i13;
                }
                if (this.zzf.zzd(i)) {
                    zzane zzaneVar2 = this.zzf;
                    int iZzb = zzfp.zzb(zzaneVar2.zza, zzaneVar2.zzb);
                    zzed zzedVar2 = this.zzc;
                    int i17 = zzen.zza;
                    zzedVar2.zzJ(this.zzf.zza, iZzb);
                    this.zzb.zza(this.zzl, this.zzc);
                }
                if (i12 == 178) {
                    if (zzedVar.zzN()[iZza + 2] == 1) {
                        this.zzf.zzc(178);
                    }
                    i12 = 178;
                }
            }
            int i18 = iZze - iZza;
            this.zzg.zzb(this.zzh - ((long) i18), i18, this.zzk);
            this.zzg.zzc(i12, this.zzl);
            iZzd = i11;
            iZze = iZze;
        }
        if (!this.zzk) {
            this.zze.zza(bArrZzN, iZzd, iZze);
        }
        this.zzg.zza(bArrZzN, iZzd, iZze);
        zzane zzaneVar3 = this.zzf;
        if (zzaneVar3 != null) {
            zzaneVar3.zza(bArrZzN, iZzd, iZze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzb(zzacu zzacuVar, zzaoa zzaoaVar) {
        zzaoaVar.zzc();
        this.zzi = zzaoaVar.zzb();
        zzadx zzadxVarZzw = zzacuVar.zzw(zzaoaVar.zza(), 2);
        this.zzj = zzadxVarZzw;
        this.zzg = new zzamq(zzadxVarZzw);
        zzaod zzaodVar = this.zzb;
        if (zzaodVar != null) {
            zzaodVar.zzb(zzacuVar, zzaoaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzc(boolean z4) {
        zzdb.zzb(this.zzg);
        if (z4) {
            this.zzg.zzb(this.zzh, 0, this.zzk);
            this.zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzd(long j4, int i) {
        this.zzl = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zze() {
        zzfp.zzh(this.zzd);
        this.zze.zzb();
        zzamq zzamqVar = this.zzg;
        if (zzamqVar != null) {
            zzamqVar.zzd();
        }
        zzane zzaneVar = this.zzf;
        if (zzaneVar != null) {
            zzaneVar.zzb();
        }
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    public zzamr(zzaod zzaodVar) {
        zzed zzedVar;
        this.zzb = zzaodVar;
        this.zzd = new boolean[4];
        this.zze = new zzamp(128);
        this.zzl = -9223372036854775807L;
        if (zzaodVar != null) {
            this.zzf = new zzane(178, 128);
            zzedVar = new zzed();
        } else {
            zzedVar = null;
            this.zzf = null;
        }
        this.zzc = zzedVar;
    }
}
