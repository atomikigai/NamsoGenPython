package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzajy extends zzajw {
    private zzajx zza;
    private int zzb;
    private boolean zzc;
    private zzaec zzd;
    private zzaea zze;

    @Override // com.google.android.gms.internal.ads.zzajw
    public final long zza(zzed zzedVar) {
        if ((zzedVar.zzN()[0] & 1) == 1) {
            return -1L;
        }
        byte b10 = zzedVar.zzN()[0];
        zzajx zzajxVar = this.zza;
        zzdb.zzb(zzajxVar);
        int i = !zzajxVar.zzd[(b10 >> 1) & (255 >>> (8 - zzajxVar.zze))].zza ? zzajxVar.zza.zze : zzajxVar.zza.zzf;
        int i10 = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzedVar.zzc() < zzedVar.zze() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(zzedVar.zzN(), zzedVar.zze() + 4);
            zzedVar.zzJ(bArrCopyOf, bArrCopyOf.length);
        } else {
            zzedVar.zzK(zzedVar.zze() + 4);
        }
        long j4 = i10;
        byte[] bArrZzN = zzedVar.zzN();
        bArrZzN[zzedVar.zze() - 4] = (byte) (j4 & 255);
        bArrZzN[zzedVar.zze() - 3] = (byte) ((j4 >>> 8) & 255);
        bArrZzN[zzedVar.zze() - 2] = (byte) ((j4 >>> 16) & 255);
        bArrZzN[zzedVar.zze() - 1] = (byte) ((j4 >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j4;
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final void zzb(boolean z4) {
        super.zzb(z4);
        if (z4) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    /* JADX WARN: Code duplicated, block: B:168:0x03b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:170:0x03b7  */
    @Override // com.google.android.gms.internal.ads.zzajw
    public final boolean zzc(zzed zzedVar, long j4, zzajt zzajtVar) throws IOException {
        zzajx zzajxVar;
        int i;
        int iZzb;
        int i10;
        int[] iArr;
        if (this.zza != null) {
            zzajtVar.zza.getClass();
            return false;
        }
        zzaec zzaecVar = this.zzd;
        int i11 = 1;
        if (zzaecVar != null) {
            int i12 = 4;
            zzaea zzaeaVar = this.zze;
            if (zzaeaVar == null) {
                this.zze = zzaed.zzc(zzedVar, true, true);
            } else {
                byte[] bArr = new byte[zzedVar.zze()];
                System.arraycopy(zzedVar.zzN(), 0, bArr, 0, zzedVar.zze());
                int i13 = zzaecVar.zza;
                int i14 = 5;
                zzaed.zzd(5, zzedVar, false);
                int iZzm = zzedVar.zzm() + 1;
                zzadz zzadzVar = new zzadz(zzedVar.zzN());
                zzadzVar.zzc(zzedVar.zzd() * 8);
                int i15 = 0;
                while (true) {
                    int i16 = 2;
                    int i17 = 16;
                    if (i15 >= iZzm) {
                        int i18 = i11;
                        int i19 = 6;
                        int iZzb2 = zzadzVar.zzb(6) + i18;
                        for (int i20 = 0; i20 < iZzb2; i20++) {
                            if (zzadzVar.zzb(16) != 0) {
                                throw zzbh.zza("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int iZzb3 = zzadzVar.zzb(6) + i18;
                        int i21 = 0;
                        while (true) {
                            int i22 = 3;
                            if (i21 >= iZzb3) {
                                int i23 = 1;
                                int iZzb4 = zzadzVar.zzb(i19) + 1;
                                int i24 = 0;
                                while (i24 < iZzb4) {
                                    if (zzadzVar.zzb(16) > 2) {
                                        throw zzbh.zza("residueType greater than 2 is not decodable", null);
                                    }
                                    zzadzVar.zzc(24);
                                    zzadzVar.zzc(24);
                                    zzadzVar.zzc(24);
                                    int iZzb5 = zzadzVar.zzb(i19) + i23;
                                    int i25 = 8;
                                    zzadzVar.zzc(8);
                                    int[] iArr2 = new int[iZzb5];
                                    for (int i26 = 0; i26 < iZzb5; i26++) {
                                        iArr2[i26] = ((zzadzVar.zzd() ? zzadzVar.zzb(5) : 0) * 8) + zzadzVar.zzb(3);
                                    }
                                    int i27 = 0;
                                    while (i27 < iZzb5) {
                                        int i28 = 0;
                                        while (i28 < i25) {
                                            if ((iArr2[i27] & (1 << i28)) != 0) {
                                                zzadzVar.zzc(i25);
                                            }
                                            i28++;
                                            i25 = 8;
                                        }
                                        i27++;
                                        i25 = 8;
                                    }
                                    i24++;
                                    i19 = 6;
                                    i23 = 1;
                                }
                                int iZzb6 = zzadzVar.zzb(i19) + 1;
                                for (int i29 = 0; i29 < iZzb6; i29++) {
                                    int iZzb7 = zzadzVar.zzb(16);
                                    if (iZzb7 != 0) {
                                        zzdt.zzc("VorbisUtil", "mapping type other than 0 not supported: " + iZzb7);
                                    } else {
                                        if (zzadzVar.zzd()) {
                                            i = 1;
                                            iZzb = zzadzVar.zzb(4) + 1;
                                        } else {
                                            i = 1;
                                            iZzb = 1;
                                        }
                                        if (zzadzVar.zzd()) {
                                            int iZzb8 = zzadzVar.zzb(8) + i;
                                            for (int i30 = 0; i30 < iZzb8; i30++) {
                                                int i31 = i13 - 1;
                                                zzadzVar.zzc(zzaed.zza(i31));
                                                zzadzVar.zzc(zzaed.zza(i31));
                                            }
                                        }
                                        if (zzadzVar.zzb(2) != 0) {
                                            throw zzbh.zza("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iZzb > 1) {
                                            for (int i32 = 0; i32 < i13; i32++) {
                                                zzadzVar.zzc(4);
                                            }
                                        }
                                        for (int i33 = 0; i33 < iZzb; i33++) {
                                            zzadzVar.zzc(8);
                                            zzadzVar.zzc(8);
                                            zzadzVar.zzc(8);
                                        }
                                    }
                                }
                                int iZzb9 = zzadzVar.zzb(6);
                                int i34 = iZzb9 + 1;
                                zzaeb[] zzaebVarArr = new zzaeb[i34];
                                for (int i35 = 0; i35 < i34; i35++) {
                                    zzaebVarArr[i35] = new zzaeb(zzadzVar.zzd(), zzadzVar.zzb(16), zzadzVar.zzb(16), zzadzVar.zzb(8));
                                }
                                if (!zzadzVar.zzd()) {
                                    throw zzbh.zza("framing bit after modes not set as expected", null);
                                }
                                zzajxVar = new zzajx(zzaecVar, zzaeaVar, bArr, zzaebVarArr, zzaed.zza(iZzb9));
                                break;
                            }
                            int iZzb10 = zzadzVar.zzb(i17);
                            if (iZzb10 == 0) {
                                int i36 = 8;
                                zzadzVar.zzc(8);
                                zzadzVar.zzc(16);
                                zzadzVar.zzc(16);
                                zzadzVar.zzc(6);
                                zzadzVar.zzc(8);
                                int iZzb11 = zzadzVar.zzb(4) + 1;
                                int i37 = 0;
                                while (i37 < iZzb11) {
                                    zzadzVar.zzc(i36);
                                    i37++;
                                    i36 = 8;
                                }
                            } else {
                                if (iZzb10 != i18) {
                                    throw zzbh.zza("floor type greater than 1 not decodable: " + iZzb10, null);
                                }
                                int iZzb12 = zzadzVar.zzb(5);
                                int[] iArr3 = new int[iZzb12];
                                int i38 = -1;
                                for (int i39 = 0; i39 < iZzb12; i39++) {
                                    int iZzb13 = zzadzVar.zzb(4);
                                    iArr3[i39] = iZzb13;
                                    if (iZzb13 > i38) {
                                        i38 = iZzb13;
                                    }
                                }
                                int i40 = i38 + 1;
                                int[] iArr4 = new int[i40];
                                int i41 = 0;
                                while (i41 < i40) {
                                    int i42 = 1;
                                    iArr4[i41] = zzadzVar.zzb(i22) + 1;
                                    int iZzb14 = zzadzVar.zzb(2);
                                    if (iZzb14 > 0) {
                                        i10 = 8;
                                        zzadzVar.zzc(8);
                                    } else {
                                        i10 = 8;
                                    }
                                    int i43 = i40;
                                    int i44 = 0;
                                    while (true) {
                                        int i45 = i42 << iZzb14;
                                        iArr = iArr3;
                                        if (i44 < i45) {
                                            zzadzVar.zzc(i10);
                                            i44++;
                                            iArr3 = iArr;
                                            i10 = 8;
                                            i42 = 1;
                                        }
                                    }
                                    i41++;
                                    iArr3 = iArr;
                                    i40 = i43;
                                    i22 = 3;
                                }
                                int[] iArr5 = iArr3;
                                zzadzVar.zzc(2);
                                int iZzb15 = zzadzVar.zzb(4);
                                int i46 = 0;
                                int i47 = 0;
                                for (int i48 = 0; i48 < iZzb12; i48++) {
                                    i46 += iArr4[iArr5[i48]];
                                    while (i47 < i46) {
                                        zzadzVar.zzc(iZzb15);
                                        i47++;
                                    }
                                }
                            }
                            i21++;
                            i19 = 6;
                            i17 = 16;
                            i18 = 1;
                        }
                    } else {
                        if (zzadzVar.zzb(24) != 5653314) {
                            throw zzbh.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzadzVar.zza(), null);
                        }
                        int iZzb16 = zzadzVar.zzb(16);
                        int iZzb17 = zzadzVar.zzb(24);
                        if (zzadzVar.zzd()) {
                            zzadzVar.zzc(i14);
                            for (int iZzb18 = 0; iZzb18 < iZzb17; iZzb18 += zzadzVar.zzb(zzaed.zza(iZzb17 - iZzb18))) {
                            }
                        } else {
                            boolean zZzd = zzadzVar.zzd();
                            for (int i49 = 0; i49 < iZzb17; i49++) {
                                if (!zZzd) {
                                    zzadzVar.zzc(i14);
                                } else if (zzadzVar.zzd()) {
                                    zzadzVar.zzc(i14);
                                }
                            }
                        }
                        int i50 = i12;
                        int iZzb19 = zzadzVar.zzb(i50);
                        if (iZzb19 > 2) {
                            throw zzbh.zza("lookup type greater than 2 not decodable: " + iZzb19, null);
                        }
                        if (iZzb19 != i11) {
                            if (iZzb19 != 2) {
                                i11 = i11;
                            }
                            i15++;
                            i11 = i11;
                            i12 = 4;
                            i14 = 5;
                        } else {
                            i16 = iZzb19;
                        }
                        zzadzVar.zzc(32);
                        zzadzVar.zzc(32);
                        int iZzb20 = zzadzVar.zzb(i50) + i11;
                        zzadzVar.zzc(i11);
                        zzadzVar.zzc((int) ((i16 == i11 ? iZzb16 != 0 ? (long) Math.floor(Math.pow(iZzb17, 1.0d / ((double) iZzb16))) : 0L : ((long) iZzb16) * ((long) iZzb17)) * ((long) iZzb20)));
                        i15++;
                        i11 = i11;
                        i12 = 4;
                        i14 = 5;
                    }
                }
            }
            this.zza = zzajxVar;
            if (zzajxVar == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            zzaec zzaecVar2 = zzajxVar.zza;
            arrayList.add(zzaecVar2.zzg);
            arrayList.add(zzajxVar.zzc);
            zzbd zzbdVarZzb = zzaed.zzb(zzfzo.zzm(zzajxVar.zzb.zza));
            zzab zzabVar = new zzab();
            zzabVar.zzZ("audio/vorbis");
            zzabVar.zzy(zzaecVar2.zzd);
            zzabVar.zzU(zzaecVar2.zzc);
            zzabVar.zzz(zzaecVar2.zza);
            zzabVar.zzaa(zzaecVar2.zzb);
            zzabVar.zzM(arrayList);
            zzabVar.zzS(zzbdVarZzb);
            zzajtVar.zza = zzabVar.zzaf();
            return true;
        }
        zzaed.zzd(1, zzedVar, false);
        int iZzj = zzedVar.zzj();
        int iZzm2 = zzedVar.zzm();
        int iZzj2 = zzedVar.zzj();
        int iZzi = zzedVar.zzi();
        int i51 = iZzi <= 0 ? -1 : iZzi;
        int iZzi2 = zzedVar.zzi();
        int i52 = iZzi2 <= 0 ? -1 : iZzi2;
        int iZzi3 = zzedVar.zzi();
        int i53 = iZzi3 <= 0 ? -1 : iZzi3;
        int iZzm3 = zzedVar.zzm();
        this.zzd = new zzaec(iZzj, iZzm2, iZzj2, i51, i52, i53, (int) Math.pow(2.0d, iZzm3 & 15), (int) Math.pow(2.0d, (iZzm3 & 240) >> 4), 1 == (zzedVar.zzm() & 1), Arrays.copyOf(zzedVar.zzN(), zzedVar.zze()));
        zzajxVar = null;
        this.zza = zzajxVar;
        if (zzajxVar == null) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList();
        zzaec zzaecVar3 = zzajxVar.zza;
        arrayList2.add(zzaecVar3.zzg);
        arrayList2.add(zzajxVar.zzc);
        zzbd zzbdVarZzb2 = zzaed.zzb(zzfzo.zzm(zzajxVar.zzb.zza));
        zzab zzabVar2 = new zzab();
        zzabVar2.zzZ("audio/vorbis");
        zzabVar2.zzy(zzaecVar3.zzd);
        zzabVar2.zzU(zzaecVar3.zzc);
        zzabVar2.zzz(zzaecVar3.zza);
        zzabVar2.zzaa(zzaecVar3.zzb);
        zzabVar2.zzM(arrayList2);
        zzabVar2.zzS(zzbdVarZzb2);
        zzajtVar.zza = zzabVar2.zzaf();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final void zzi(long j4) {
        super.zzi(j4);
        this.zzc = j4 != 0;
        zzaec zzaecVar = this.zzd;
        this.zzb = zzaecVar != null ? zzaecVar.zze : 0;
    }
}
