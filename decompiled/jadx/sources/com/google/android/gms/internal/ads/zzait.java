package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.api.f;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzait implements zzacr {
    private static final byte[] zza = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzad zzb;
    private long zzA;
    private zzais zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private zzacu zzH;
    private zzadx[] zzI;
    private zzadx[] zzJ;
    private boolean zzK;
    private final zzakg zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzed zzg;
    private final zzed zzh;
    private final zzed zzi;
    private final byte[] zzj;
    private final zzed zzk;
    private final zzafp zzl;
    private final zzed zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzft zzp;
    private zzfzo zzq;
    private int zzr;
    private int zzs;
    private long zzt;
    private int zzu;
    private zzed zzv;
    private long zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    static {
        zzab zzabVar = new zzab();
        zzabVar.zzZ("application/x-emsg");
        zzb = zzabVar.zzaf();
    }

    @Deprecated
    public zzait() {
        this(zzakg.zza, 32, null, null, zzfzo.zzn(), null);
    }

    private static int zzg(int i) throws zzbh {
        if (i >= 0) {
            return i;
        }
        throw zzbh.zza("Unexpected negative value: " + i, null);
    }

    private static zzw zzh(List list) {
        int i;
        UUID[] uuidArr;
        zzaja zzajaVar;
        int size = list.size();
        int i10 = 0;
        ArrayList arrayList = null;
        while (i10 < size) {
            zzet zzetVar = (zzet) list.get(i10);
            if (zzetVar.zzd == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrZzN = zzetVar.zza.zzN();
                zzed zzedVar = new zzed(bArrZzN);
                if (zzedVar.zze() < 32) {
                    i = i10;
                    zzajaVar = null;
                } else {
                    zzedVar.zzL(0);
                    int iZzb = zzedVar.zzb();
                    int iZzg = zzedVar.zzg();
                    if (iZzg != iZzb) {
                        zzdt.zzf("PsshAtomUtil", "Advertised atom size (" + iZzg + ") does not match buffer size: " + iZzb);
                    } else {
                        int iZzg2 = zzedVar.zzg();
                        if (iZzg2 != 1886614376) {
                            q1.a.o(iZzg2, "Atom type is not pssh: ", "PsshAtomUtil");
                        } else {
                            int iZza = zzain.zza(zzedVar.zzg());
                            if (iZza > 1) {
                                q1.a.o(iZza, "Unsupported pssh version: ", "PsshAtomUtil");
                            } else {
                                UUID uuid = new UUID(zzedVar.zzt(), zzedVar.zzt());
                                if (iZza == 1) {
                                    int iZzp = zzedVar.zzp();
                                    uuidArr = new UUID[iZzp];
                                    int i11 = 0;
                                    while (i11 < iZzp) {
                                        UUID[] uuidArr2 = uuidArr;
                                        int i12 = i11;
                                        uuidArr2[i12] = new UUID(zzedVar.zzt(), zzedVar.zzt());
                                        i11 = i12 + 1;
                                        i10 = i10;
                                        uuidArr = uuidArr2;
                                    }
                                } else {
                                    uuidArr = null;
                                }
                                i = i10;
                                int iZzp2 = zzedVar.zzp();
                                int iZzb2 = zzedVar.zzb();
                                if (iZzp2 != iZzb2) {
                                    zzdt.zzf("PsshAtomUtil", "Atom data size (" + iZzp2 + ") does not match the bytes left: " + iZzb2);
                                    zzajaVar = null;
                                } else {
                                    byte[] bArr = new byte[iZzp2];
                                    zzedVar.zzH(bArr, 0, iZzp2);
                                    zzajaVar = new zzaja(uuid, iZza, bArr, uuidArr);
                                }
                            }
                        }
                    }
                    i = i10;
                    zzajaVar = null;
                }
                UUID uuid2 = zzajaVar == null ? null : zzajaVar.zza;
                if (uuid2 == null) {
                    zzdt.zzf("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzv(uuid2, null, "video/mp4", bArrZzN));
                }
                i10 = i + 1;
            } else {
                i = i10;
            }
            i10 = i + 1;
        }
        if (arrayList == null) {
            return null;
        }
        return new zzw(arrayList);
    }

    private final void zzj() {
        this.zzr = 0;
        this.zzu = 0;
    }

    private static void zzk(zzed zzedVar, int i, zzajg zzajgVar) throws zzbh {
        zzedVar.zzL(i + 8);
        int iZzg = zzedVar.zzg();
        int i10 = zzain.zza;
        if ((iZzg & 1) != 0) {
            throw zzbh.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z4 = (iZzg & 2) != 0;
        int iZzp = zzedVar.zzp();
        if (iZzp == 0) {
            Arrays.fill(zzajgVar.zzl, 0, zzajgVar.zze, false);
            return;
        }
        int i11 = zzajgVar.zze;
        if (iZzp != i11) {
            throw zzbh.zza("Senc sample count " + iZzp + " is different from fragment sample count" + i11, null);
        }
        Arrays.fill(zzajgVar.zzl, 0, iZzp, z4);
        zzajgVar.zza(zzedVar.zzb());
        zzed zzedVar2 = zzajgVar.zzn;
        zzedVar.zzH(zzedVar2.zzN(), 0, zzedVar2.zze());
        zzajgVar.zzn.zzL(0);
        zzajgVar.zzo = false;
    }

    /* JADX WARN: Code duplicated, block: B:159:0x03e5  */
    private final void zzl(long j4) throws zzbh {
        SparseArray sparseArray;
        int i;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z4;
        int i15;
        int iZzg;
        boolean z10;
        long[] jArr;
        while (!this.zzn.isEmpty() && ((zzes) this.zzn.peek()).zza == j4) {
            zzes zzesVar = (zzes) this.zzn.pop();
            int i16 = zzesVar.zzd;
            int i17 = 12;
            int i18 = 8;
            if (i16 == 1836019574) {
                zzw zzwVarZzh = zzh(zzesVar.zzb);
                zzes zzesVarZza = zzesVar.zza(1836475768);
                zzesVarZza.getClass();
                SparseArray sparseArray2 = new SparseArray();
                int size = zzesVarZza.zzb.size();
                long jZzu = -9223372036854775807L;
                int i19 = 0;
                while (i19 < size) {
                    zzet zzetVar = (zzet) zzesVarZza.zzb.get(i19);
                    int i20 = zzetVar.zzd;
                    if (i20 == 1953654136) {
                        zzed zzedVar = zzetVar.zza;
                        zzedVar.zzL(i17);
                        Pair pairCreate = Pair.create(Integer.valueOf(zzedVar.zzg()), new zzaio(zzedVar.zzg() - 1, zzedVar.zzg(), zzedVar.zzg(), zzedVar.zzg()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (zzaio) pairCreate.second);
                    } else if (i20 == 1835362404) {
                        zzed zzedVar2 = zzetVar.zza;
                        zzedVar2.zzL(8);
                        jZzu = zzain.zza(zzedVar2.zzg()) == 0 ? zzedVar2.zzu() : zzedVar2.zzw();
                    }
                    i19++;
                    i17 = 12;
                }
                List listZzf = zzain.zzf(zzesVar, new zzadf(), jZzu, zzwVarZzh, (this.zzd & 16) != 0, false, new zzfwh(this) { // from class: com.google.android.gms.internal.ads.zzaip
                    @Override // com.google.android.gms.internal.ads.zzfwh
                    public final Object apply(Object obj) {
                        return (zzaje) obj;
                    }
                });
                int size2 = listZzf.size();
                if (this.zzf.size() == 0) {
                    for (int i21 = 0; i21 < size2; i21++) {
                        zzajh zzajhVar = (zzajh) listZzf.get(i21);
                        zzaje zzajeVar = zzajhVar.zza;
                        this.zzf.put(zzajeVar.zza, new zzais(this.zzH.zzw(i21, zzajeVar.zzb), zzajhVar, zzm(sparseArray2, zzajeVar.zza)));
                        this.zzz = Math.max(this.zzz, zzajeVar.zze);
                    }
                    this.zzH.zzD();
                } else {
                    zzdb.zzf(this.zzf.size() == size2);
                    for (int i22 = 0; i22 < size2; i22++) {
                        zzajh zzajhVar2 = (zzajh) listZzf.get(i22);
                        zzaje zzajeVar2 = zzajhVar2.zza;
                        ((zzais) this.zzf.get(zzajeVar2.zza)).zzh(zzajhVar2, zzm(sparseArray2, zzajeVar2.zza));
                    }
                }
            } else {
                int i23 = 16;
                if (i16 == 1836019558) {
                    SparseArray sparseArray3 = this.zzf;
                    int i24 = this.zzd;
                    byte[] bArr = this.zzj;
                    int size3 = zzesVar.zzc.size();
                    int i25 = 0;
                    while (i25 < size3) {
                        zzes zzesVar2 = (zzes) zzesVar.zzc.get(i25);
                        if (zzesVar2.zzd == 1953653094) {
                            zzet zzetVarZzb = zzesVar2.zzb(1952868452);
                            zzetVarZzb.getClass();
                            zzed zzedVar3 = zzetVarZzb.zza;
                            zzedVar3.zzL(i18);
                            int iZzg2 = zzedVar3.zzg();
                            int i26 = zzain.zza;
                            zzais zzaisVar = (zzais) sparseArray3.get(zzedVar3.zzg());
                            if (zzaisVar == null) {
                                zzaisVar = null;
                            } else {
                                if ((iZzg2 & 1) != 0) {
                                    long jZzw = zzedVar3.zzw();
                                    zzajg zzajgVar = zzaisVar.zzb;
                                    zzajgVar.zzb = jZzw;
                                    zzajgVar.zzc = jZzw;
                                }
                                zzaio zzaioVar = zzaisVar.zze;
                                zzaisVar.zzb.zza = new zzaio((iZzg2 & 2) != 0 ? zzedVar3.zzg() - 1 : zzaioVar.zza, (iZzg2 & 8) != 0 ? zzedVar3.zzg() : zzaioVar.zzb, (iZzg2 & 16) != 0 ? zzedVar3.zzg() : zzaioVar.zzc, (iZzg2 & 32) != 0 ? zzedVar3.zzg() : zzaioVar.zzd);
                            }
                            if (zzaisVar == null) {
                                sparseArray = sparseArray3;
                                i = i24;
                                i10 = size3;
                                i11 = i25;
                                i12 = i23;
                            } else {
                                zzajg zzajgVar2 = zzaisVar.zzb;
                                long j10 = zzajgVar2.zzp;
                                boolean z11 = zzajgVar2.zzq;
                                zzaisVar.zzi();
                                zzaisVar.zzl = true;
                                zzet zzetVarZzb2 = zzesVar2.zzb(1952867444);
                                if (zzetVarZzb2 == null || (i24 & 2) != 0) {
                                    zzajgVar2.zzp = j10;
                                    zzajgVar2.zzq = z11;
                                } else {
                                    zzed zzedVar4 = zzetVarZzb2.zza;
                                    zzedVar4.zzL(i18);
                                    zzajgVar2.zzp = zzain.zza(zzedVar4.zzg()) == 1 ? zzedVar4.zzw() : zzedVar4.zzu();
                                    zzajgVar2.zzq = true;
                                }
                                List list = zzesVar2.zzb;
                                int size4 = list.size();
                                int i27 = 0;
                                int i28 = 0;
                                int i29 = 0;
                                while (true) {
                                    i13 = 1953658222;
                                    if (i27 >= size4) {
                                        break;
                                    }
                                    SparseArray sparseArray4 = sparseArray3;
                                    zzet zzetVar2 = (zzet) list.get(i27);
                                    int i30 = i24;
                                    if (zzetVar2.zzd == 1953658222) {
                                        zzed zzedVar5 = zzetVar2.zza;
                                        zzedVar5.zzL(12);
                                        int iZzp = zzedVar5.zzp();
                                        if (iZzp > 0) {
                                            i29 += iZzp;
                                            i28++;
                                        }
                                    }
                                    i27++;
                                    i24 = i30;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                i = i24;
                                zzaisVar.zzh = 0;
                                zzaisVar.zzg = 0;
                                zzaisVar.zzf = 0;
                                zzajg zzajgVar3 = zzaisVar.zzb;
                                zzajgVar3.zzd = i28;
                                zzajgVar3.zze = i29;
                                if (zzajgVar3.zzg.length < i28) {
                                    zzajgVar3.zzf = new long[i28];
                                    zzajgVar3.zzg = new int[i28];
                                }
                                if (zzajgVar3.zzh.length < i29) {
                                    int i31 = (i29 * 125) / 100;
                                    zzajgVar3.zzh = new int[i31];
                                    zzajgVar3.zzi = new long[i31];
                                    zzajgVar3.zzj = new boolean[i31];
                                    zzajgVar3.zzl = new boolean[i31];
                                }
                                int i32 = 0;
                                int i33 = 0;
                                int i34 = 0;
                                while (true) {
                                    long j11 = 0;
                                    if (i32 >= size4) {
                                        break;
                                    }
                                    zzet zzetVar3 = (zzet) list.get(i32);
                                    if (zzetVar3.zzd == i13) {
                                        int i35 = i33 + 1;
                                        zzed zzedVar6 = zzetVar3.zza;
                                        zzedVar6.zzL(8);
                                        int iZzg3 = zzedVar6.zzg();
                                        zzaje zzajeVar3 = zzaisVar.zzd.zza;
                                        int i36 = i33;
                                        zzajg zzajgVar4 = zzaisVar.zzb;
                                        zzaio zzaioVar2 = zzajgVar4.zza;
                                        int i37 = zzen.zza;
                                        zzajgVar4.zzg[i36] = zzedVar6.zzp();
                                        long[] jArr2 = zzajgVar4.zzf;
                                        long j12 = zzajgVar4.zzb;
                                        jArr2[i36] = j12;
                                        if ((iZzg3 & 1) != 0) {
                                            jArr2[i36] = j12 + ((long) zzedVar6.zzg());
                                        }
                                        boolean z12 = (iZzg3 & 4) != 0;
                                        int iZzg4 = zzaioVar2.zzd;
                                        if (z12) {
                                            iZzg4 = zzedVar6.zzg();
                                        }
                                        int i38 = iZzg3 & 256;
                                        boolean z13 = z12;
                                        int i39 = iZzg3 & 512;
                                        int i40 = iZzg3 & 1024;
                                        int i41 = iZzg3 & 2048;
                                        long[] jArr3 = zzajeVar3.zzh;
                                        if (jArr3 != null) {
                                            i15 = i41;
                                            if (jArr3.length == 1 && (jArr = zzajeVar3.zzi) != null) {
                                                long j13 = jArr3[0];
                                                if (j13 == 0 || zzen.zzu(j13 + jArr[0], 1000000L, zzajeVar3.zzd, RoundingMode.FLOOR) >= zzajeVar3.zze) {
                                                    j11 = zzajeVar3.zzi[0];
                                                }
                                            }
                                        } else {
                                            i15 = i41;
                                        }
                                        int[] iArr = zzajgVar4.zzh;
                                        long[] jArr4 = zzajgVar4.zzi;
                                        boolean[] zArr = zzajgVar4.zzj;
                                        boolean z14 = zzajeVar3.zzb == 2 && (i & 1) != 0;
                                        int i42 = zzajgVar4.zzg[i36] + i34;
                                        int i43 = iZzg4;
                                        long j14 = zzajeVar3.zzc;
                                        long j15 = zzajgVar4.zzp;
                                        while (i34 < i42) {
                                            int iZzg5 = i38 != 0 ? zzedVar6.zzg() : zzaioVar2.zzb;
                                            zzg(iZzg5);
                                            int iZzg6 = i39 != 0 ? zzedVar6.zzg() : zzaioVar2.zzc;
                                            zzg(iZzg6);
                                            if (i40 != 0) {
                                                iZzg = zzedVar6.zzg();
                                            } else if (i34 != 0) {
                                                iZzg = zzaioVar2.zzd;
                                            } else if (z13) {
                                                iZzg = i43;
                                                i34 = 0;
                                            } else {
                                                i34 = 0;
                                                iZzg = zzaioVar2.zzd;
                                            }
                                            int i44 = iZzg;
                                            int i45 = i42;
                                            long jZzu2 = zzen.zzu((((long) (i15 != 0 ? zzedVar6.zzg() : 0)) + j15) - j11, 1000000L, j14, RoundingMode.FLOOR);
                                            jArr4[i34] = jZzu2;
                                            if (!zzajgVar4.zzq) {
                                                jArr4[i34] = jZzu2 + zzaisVar.zzd.zzh;
                                            }
                                            iArr[i34] = iZzg6;
                                            if (((i44 >> 16) & 1) != 0) {
                                                z10 = false;
                                            } else if (!z14) {
                                                z10 = true;
                                            } else if (i34 == 0) {
                                                z10 = true;
                                                i34 = 0;
                                            } else {
                                                z10 = false;
                                            }
                                            zArr[i34] = z10;
                                            j15 += (long) iZzg5;
                                            i34++;
                                            z14 = z14;
                                            zzaioVar2 = zzaioVar2;
                                            i42 = i45;
                                        }
                                        zzajgVar4.zzp = j15;
                                        i33 = i35;
                                        i34 = i42;
                                    }
                                    i32++;
                                    list = list;
                                    size3 = size3;
                                    i25 = i25;
                                    size4 = size4;
                                    i13 = 1953658222;
                                }
                                i10 = size3;
                                i11 = i25;
                                zzaje zzajeVar4 = zzaisVar.zzd.zza;
                                zzaio zzaioVar3 = zzajgVar2.zza;
                                zzaioVar3.getClass();
                                zzajf zzajfVarZza = zzajeVar4.zza(zzaioVar3.zza);
                                zzet zzetVarZzb3 = zzesVar2.zzb(1935763834);
                                if (zzetVarZzb3 != null) {
                                    zzajfVarZza.getClass();
                                    int i46 = zzajfVarZza.zzd;
                                    zzed zzedVar7 = zzetVarZzb3.zza;
                                    zzedVar7.zzL(8);
                                    if ((zzedVar7.zzg() & 1) == 1) {
                                        zzedVar7.zzM(8);
                                    }
                                    int iZzm = zzedVar7.zzm();
                                    int iZzp2 = zzedVar7.zzp();
                                    int i47 = zzajgVar2.zze;
                                    if (iZzp2 > i47) {
                                        throw zzbh.zza("Saiz sample count " + iZzp2 + " is greater than fragment sample count" + i47, null);
                                    }
                                    if (iZzm == 0) {
                                        boolean[] zArr2 = zzajgVar2.zzl;
                                        i14 = 0;
                                        for (int i48 = 0; i48 < iZzp2; i48++) {
                                            int iZzm2 = zzedVar7.zzm();
                                            i14 += iZzm2;
                                            zArr2[i48] = iZzm2 > i46;
                                        }
                                        z4 = false;
                                    } else {
                                        boolean z15 = iZzm > i46;
                                        i14 = iZzm * iZzp2;
                                        z4 = false;
                                        Arrays.fill(zzajgVar2.zzl, 0, iZzp2, z15);
                                    }
                                    Arrays.fill(zzajgVar2.zzl, iZzp2, zzajgVar2.zze, z4);
                                    if (i14 > 0) {
                                        zzajgVar2.zza(i14);
                                    }
                                }
                                zzet zzetVarZzb4 = zzesVar2.zzb(1935763823);
                                if (zzetVarZzb4 != null) {
                                    zzed zzedVar8 = zzetVarZzb4.zza;
                                    zzedVar8.zzL(8);
                                    int iZzg7 = zzedVar8.zzg();
                                    if ((iZzg7 & 1) == 1) {
                                        zzedVar8.zzM(8);
                                    }
                                    int iZzp3 = zzedVar8.zzp();
                                    if (iZzp3 != 1) {
                                        throw zzbh.zza("Unexpected saio entry count: " + iZzp3, null);
                                    }
                                    zzajgVar2.zzc += zzain.zza(iZzg7) == 0 ? zzedVar8.zzu() : zzedVar8.zzw();
                                }
                                byte[] bArr2 = null;
                                zzet zzetVarZzb5 = zzesVar2.zzb(1936027235);
                                if (zzetVarZzb5 != null) {
                                    zzk(zzetVarZzb5.zza, 0, zzajgVar2);
                                }
                                String str = zzajfVarZza != null ? zzajfVarZza.zzb : null;
                                zzed zzedVar9 = null;
                                zzed zzedVar10 = null;
                                for (int i49 = 0; i49 < zzesVar2.zzb.size(); i49++) {
                                    zzet zzetVar4 = (zzet) zzesVar2.zzb.get(i49);
                                    zzed zzedVar11 = zzetVar4.zza;
                                    int i50 = zzetVar4.zzd;
                                    if (i50 == 1935828848) {
                                        zzedVar11.zzL(12);
                                        if (zzedVar11.zzg() == 1936025959) {
                                            zzedVar9 = zzedVar11;
                                        }
                                    } else if (i50 == 1936158820) {
                                        zzedVar11.zzL(12);
                                        if (zzedVar11.zzg() == 1936025959) {
                                            zzedVar10 = zzedVar11;
                                        }
                                    }
                                }
                                if (zzedVar9 != null && zzedVar10 != null) {
                                    zzedVar9.zzL(8);
                                    int iZza = zzain.zza(zzedVar9.zzg());
                                    zzedVar9.zzM(4);
                                    if (iZza == 1) {
                                        zzedVar9.zzM(4);
                                    }
                                    if (zzedVar9.zzg() != 1) {
                                        throw zzbh.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzedVar10.zzL(8);
                                    int iZza2 = zzain.zza(zzedVar10.zzg());
                                    zzedVar10.zzM(4);
                                    if (iZza2 == 1) {
                                        if (zzedVar10.zzu() == 0) {
                                            throw zzbh.zzc("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (iZza2 >= 2) {
                                        zzedVar10.zzM(4);
                                    }
                                    if (zzedVar10.zzu() != 1) {
                                        throw zzbh.zzc("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    zzedVar10.zzM(1);
                                    int iZzm3 = zzedVar10.zzm();
                                    int i51 = (iZzm3 & 240) >> 4;
                                    int i52 = iZzm3 & 15;
                                    if (zzedVar10.zzm() == 1) {
                                        int iZzm4 = zzedVar10.zzm();
                                        int i53 = i23;
                                        byte[] bArr3 = new byte[i53];
                                        zzedVar10.zzH(bArr3, 0, i53);
                                        if (iZzm4 == 0) {
                                            int iZzm5 = zzedVar10.zzm();
                                            bArr2 = new byte[iZzm5];
                                            zzedVar10.zzH(bArr2, 0, iZzm5);
                                        }
                                        zzajgVar2.zzk = true;
                                        zzajgVar2.zzm = new zzajf(true, str, iZzm4, bArr3, i51, i52, bArr2);
                                    }
                                }
                                int size5 = zzesVar2.zzb.size();
                                for (int i54 = 0; i54 < size5; i54++) {
                                    zzet zzetVar5 = (zzet) zzesVar2.zzb.get(i54);
                                    if (zzetVar5.zzd == 1970628964) {
                                        zzed zzedVar12 = zzetVar5.zza;
                                        zzedVar12.zzL(8);
                                        zzedVar12.zzH(bArr, 0, 16);
                                        if (Arrays.equals(bArr, zza)) {
                                            zzk(zzedVar12, 16, zzajgVar2);
                                        }
                                    }
                                }
                                i18 = 8;
                                i12 = 16;
                            }
                        } else {
                            sparseArray = sparseArray3;
                            i = i24;
                            i10 = size3;
                            i11 = i25;
                            i12 = i23;
                        }
                        i25 = i11 + 1;
                        i23 = i12;
                        i24 = i;
                        sparseArray3 = sparseArray;
                        size3 = i10;
                    }
                    zzw zzwVarZzh2 = zzh(zzesVar.zzb);
                    if (zzwVarZzh2 != null) {
                        int size6 = this.zzf.size();
                        for (int i55 = 0; i55 < size6; i55++) {
                            zzais zzaisVar2 = (zzais) this.zzf.valueAt(i55);
                            zzaje zzajeVar5 = zzaisVar2.zzd.zza;
                            zzaio zzaioVar4 = zzaisVar2.zzb.zza;
                            int i56 = zzen.zza;
                            zzajf zzajfVarZza2 = zzajeVar5.zza(zzaioVar4.zza);
                            zzw zzwVarZzb = zzwVarZzh2.zzb(zzajfVarZza2 != null ? zzajfVarZza2.zzb : null);
                            zzab zzabVarZzb = zzaisVar2.zzd.zza.zzf.zzb();
                            zzabVarZzb.zzF(zzwVarZzb);
                            zzaisVar2.zza.zzl(zzabVarZzb.zzaf());
                        }
                    }
                    if (this.zzy != -9223372036854775807L) {
                        int size7 = this.zzf.size();
                        for (int i57 = 0; i57 < size7; i57++) {
                            zzais zzaisVar3 = (zzais) this.zzf.valueAt(i57);
                            long j16 = this.zzy;
                            int i58 = zzaisVar3.zzf;
                            while (true) {
                                zzajg zzajgVar5 = zzaisVar3.zzb;
                                if (i58 >= zzajgVar5.zze || zzajgVar5.zzi[i58] > j16) {
                                    break;
                                }
                                if (zzajgVar5.zzj[i58]) {
                                    zzaisVar3.zzi = i58;
                                }
                                i58++;
                            }
                        }
                        this.zzy = -9223372036854775807L;
                    }
                } else if (!this.zzn.isEmpty()) {
                    ((zzes) this.zzn.peek()).zzc(zzesVar);
                }
            }
        }
        zzj();
    }

    private static final zzaio zzm(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzaio) sparseArray.valueAt(0);
        }
        zzaio zzaioVar = (zzaio) sparseArray.get(i);
        zzaioVar.getClass();
        return zzaioVar;
    }

    public final /* synthetic */ void zza(long j4, zzed zzedVar) {
        zzacd.zza(j4, zzedVar, this.zzJ);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:108:0x0259  */
    /* JADX WARN: Code duplicated, block: B:109:0x025f  */
    /* JADX WARN: Code duplicated, block: B:113:0x027b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0280  */
    /* JADX WARN: Code duplicated, block: B:118:0x0297  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:123:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:126:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:408:0x0271 A[EDGE_INSN: B:408:0x0271->B:111:0x0271 BREAK  A[LOOP:7: B:65:0x013e->B:67:0x0144], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x013e A[LOOP:7: B:65:0x013e->B:67:0x0144, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:67:0x0144 A[LOOP:7: B:65:0x013e->B:67:0x0144, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x014f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0167  */
    /* JADX WARN: Code duplicated, block: B:73:0x016d  */
    /* JADX WARN: Code duplicated, block: B:75:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x019a  */
    /* JADX WARN: Code duplicated, block: B:88:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzacr
    public final int zzb(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        int i;
        zzais zzaisVar;
        char c10;
        zzaje zzajeVar;
        zzadx zzadxVar;
        long jZze;
        int i10;
        byte[] bArrZzN;
        int i11;
        int i12;
        int i13;
        int iZzf;
        int i14;
        int iZzg;
        boolean z4;
        String str;
        zzajf zzajfVarZzf;
        zzadw zzadwVar;
        int i15;
        zzair zzairVar;
        long j4;
        long j10;
        int i16;
        int i17;
        int i18;
        int iZzc;
        String strZzy;
        String strZzy2;
        long jZzu;
        long jZzu2;
        long j11;
        long j12;
        long jZzw;
        long jZzw2;
        while (true) {
            int i19 = this.zzr;
            char c11 = 2;
            i = 0;
            if (i19 == 0) {
                if (this.zzu == 0) {
                    if (!zzacsVar.zzn(this.zzm.zzN(), 0, 8, true)) {
                        this.zzp.zzc();
                        return -1;
                    }
                    this.zzu = 8;
                    this.zzm.zzL(0);
                    this.zzt = this.zzm.zzu();
                    this.zzs = this.zzm.zzg();
                }
                long j13 = this.zzt;
                if (j13 == 1) {
                    zzacsVar.zzi(this.zzm.zzN(), 8, 8);
                    this.zzu += 8;
                    this.zzt = this.zzm.zzw();
                } else if (j13 == 0) {
                    long jZzd = zzacsVar.zzd();
                    if (jZzd == -1) {
                        jZzd = !this.zzn.isEmpty() ? ((zzes) this.zzn.peek()).zza : -1L;
                    }
                    if (jZzd != -1) {
                        this.zzt = (jZzd - zzacsVar.zzf()) + ((long) this.zzu);
                    }
                }
                long j14 = this.zzt;
                long j15 = this.zzu;
                if (j14 < j15) {
                    throw zzbh.zzc("Atom size less than header length (unsupported).");
                }
                long jZzf = zzacsVar.zzf() - j15;
                int i20 = this.zzs;
                if ((i20 == 1836019558 || i20 == 1835295092) && !this.zzK) {
                    this.zzH.zzO(new zzadp(this.zzz, jZzf));
                    this.zzK = true;
                }
                if (this.zzs == 1836019558) {
                    int size = this.zzf.size();
                    for (int i21 = 0; i21 < size; i21++) {
                        zzajg zzajgVar = ((zzais) this.zzf.valueAt(i21)).zzb;
                        zzajgVar.zzc = jZzf;
                        zzajgVar.zzb = jZzf;
                    }
                }
                int i22 = this.zzs;
                if (i22 == 1835295092) {
                    this.zzB = null;
                    this.zzw = jZzf + this.zzt;
                    this.zzr = 2;
                } else if (i22 == 1836019574 || i22 == 1953653099 || i22 == 1835297121 || i22 == 1835626086 || i22 == 1937007212 || i22 == 1836019558 || i22 == 1953653094 || i22 == 1836475768 || i22 == 1701082227) {
                    long jZzf2 = (zzacsVar.zzf() + this.zzt) - 8;
                    this.zzn.push(new zzes(i22, jZzf2));
                    if (this.zzt == this.zzu) {
                        zzl(jZzf2);
                    } else {
                        zzj();
                    }
                } else if (i22 == 1751411826 || i22 == 1835296868 || i22 == 1836476516 || i22 == 1936286840 || i22 == 1937011556 || i22 == 1937011827 || i22 == 1668576371 || i22 == 1937011555 || i22 == 1937011578 || i22 == 1937013298 || i22 == 1937007471 || i22 == 1668232756 || i22 == 1937011571 || i22 == 1952867444 || i22 == 1952868452 || i22 == 1953196132 || i22 == 1953654136 || i22 == 1953658222 || i22 == 1886614376 || i22 == 1935763834 || i22 == 1935763823 || i22 == 1936027235 || i22 == 1970628964 || i22 == 1935828848 || i22 == 1936158820 || i22 == 1701606260 || i22 == 1835362404 || i22 == 1701671783) {
                    if (this.zzu != 8) {
                        throw zzbh.zzc("Leaf atom defines extended atom size (unsupported).");
                    }
                    if (this.zzt > 2147483647L) {
                        throw zzbh.zzc("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    zzed zzedVar = new zzed((int) this.zzt);
                    System.arraycopy(this.zzm.zzN(), 0, zzedVar.zzN(), 0, 8);
                    this.zzv = zzedVar;
                    this.zzr = 1;
                } else {
                    if (this.zzt > 2147483647L) {
                        throw zzbh.zzc("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.zzv = null;
                    this.zzr = 1;
                }
            } else if (i19 != 1) {
                long j16 = Long.MAX_VALUE;
                if (i19 != 2) {
                    zzaisVar = this.zzB;
                    if (zzaisVar != null) {
                        c10 = 2;
                        break;
                    }
                    SparseArray sparseArray = this.zzf;
                    int size2 = sparseArray.size();
                    long j17 = Long.MAX_VALUE;
                    zzais zzaisVar2 = null;
                    int i23 = 0;
                    while (i23 < size2) {
                        char c12 = c11;
                        zzais zzaisVar3 = (zzais) sparseArray.valueAt(i23);
                        if ((zzaisVar3.zzl || zzaisVar3.zzf != zzaisVar3.zzd.zzb) && (!zzaisVar3.zzl || zzaisVar3.zzh != zzaisVar3.zzb.zzd)) {
                            long jZzd2 = zzaisVar3.zzd();
                            if (jZzd2 < j17) {
                                zzaisVar2 = zzaisVar3;
                                j17 = jZzd2;
                            }
                        }
                        i23++;
                        c11 = c12;
                    }
                    c10 = c11;
                    if (zzaisVar2 != null) {
                        int iZzd = (int) (zzaisVar2.zzd() - zzacsVar.zzf());
                        if (iZzd < 0) {
                            zzdt.zzf("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            iZzd = 0;
                        }
                        zzacsVar.zzk(iZzd);
                        this.zzB = zzaisVar2;
                        zzaisVar = zzaisVar2;
                        break;
                    }
                    int iZzf2 = (int) (this.zzw - zzacsVar.zzf());
                    if (iZzf2 < 0) {
                        throw zzbh.zza("Offset to end of mdat was negative.", null);
                    }
                    zzacsVar.zzk(iZzf2);
                    zzj();
                } else {
                    int size3 = this.zzf.size();
                    zzais zzaisVar4 = null;
                    for (int i24 = 0; i24 < size3; i24++) {
                        zzajg zzajgVar2 = ((zzais) this.zzf.valueAt(i24)).zzb;
                        if (zzajgVar2.zzo) {
                            long j18 = zzajgVar2.zzc;
                            if (j18 < j16) {
                                zzaisVar4 = (zzais) this.zzf.valueAt(i24);
                                j16 = j18;
                            }
                        }
                    }
                    if (zzaisVar4 == null) {
                        this.zzr = 3;
                    } else {
                        int iZzf3 = (int) (j16 - zzacsVar.zzf());
                        if (iZzf3 < 0) {
                            throw zzbh.zza("Offset to encryption data was negative.", null);
                        }
                        zzacsVar.zzk(iZzf3);
                        zzajg zzajgVar3 = zzaisVar4.zzb;
                        zzed zzedVar2 = zzajgVar3.zzn;
                        zzacsVar.zzi(zzedVar2.zzN(), 0, zzedVar2.zze());
                        zzajgVar3.zzn.zzL(0);
                        zzajgVar3.zzo = false;
                    }
                }
            } else {
                int i25 = ((int) this.zzt) - this.zzu;
                zzed zzedVar3 = this.zzv;
                if (zzedVar3 != null) {
                    zzacsVar.zzi(zzedVar3.zzN(), 8, i25);
                    zzet zzetVar = new zzet(this.zzs, zzedVar3);
                    long jZzf3 = zzacsVar.zzf();
                    if (this.zzn.isEmpty()) {
                        int i26 = zzetVar.zzd;
                        if (i26 == 1936286840) {
                            zzed zzedVar4 = zzetVar.zza;
                            zzedVar4.zzL(8);
                            int iZza = zzain.zza(zzedVar4.zzg());
                            zzedVar4.zzM(4);
                            long jZzu3 = zzedVar4.zzu();
                            if (iZza == 0) {
                                jZzw = zzedVar4.zzu();
                                jZzw2 = zzedVar4.zzu();
                            } else {
                                jZzw = zzedVar4.zzw();
                                jZzw2 = zzedVar4.zzw();
                            }
                            long j19 = jZzw2 + jZzf3;
                            long j20 = jZzw;
                            long jZzu4 = zzen.zzu(j20, 1000000L, jZzu3, RoundingMode.FLOOR);
                            zzedVar4.zzM(2);
                            int iZzq = zzedVar4.zzq();
                            int[] iArr = new int[iZzq];
                            long[] jArr = new long[iZzq];
                            long[] jArr2 = new long[iZzq];
                            long[] jArr3 = new long[iZzq];
                            long j21 = jZzu4;
                            long j22 = j20;
                            int i27 = 0;
                            while (i27 < iZzq) {
                                int iZzg2 = zzedVar4.zzg();
                                if ((iZzg2 & Integer.MIN_VALUE) != 0) {
                                    throw zzbh.zza("Unhandled indirect reference", null);
                                }
                                long jZzu5 = zzedVar4.zzu();
                                iArr[i27] = iZzg2 & f.API_PRIORITY_OTHER;
                                jArr[i27] = j19;
                                jArr3[i27] = j21;
                                long j23 = j22 + jZzu5;
                                long[] jArr4 = jArr2;
                                long[] jArr5 = jArr3;
                                int i28 = i27;
                                long jZzu6 = zzen.zzu(j23, 1000000L, jZzu3, RoundingMode.FLOOR);
                                jArr4[i28] = jZzu6 - jArr5[i28];
                                zzedVar4.zzM(4);
                                j19 += (long) iArr[i28];
                                iZzq = iZzq;
                                j21 = jZzu6;
                                jArr3 = jArr5;
                                jArr2 = jArr4;
                                i27 = i28 + 1;
                                jZzu4 = jZzu4;
                                j22 = j23;
                            }
                            Pair pairCreate = Pair.create(Long.valueOf(jZzu4), new zzace(iArr, jArr, jArr2, jArr3));
                            this.zzA = ((Long) pairCreate.first).longValue();
                            this.zzH.zzO((zzadq) pairCreate.second);
                            this.zzK = true;
                        } else if (i26 == 1701671783) {
                            zzed zzedVar5 = zzetVar.zza;
                            if (this.zzI.length != 0) {
                                zzedVar5.zzL(8);
                                int iZza2 = zzain.zza(zzedVar5.zzg());
                                if (iZza2 == 0) {
                                    strZzy = zzedVar5.zzy((char) 0);
                                    strZzy.getClass();
                                    strZzy2 = zzedVar5.zzy((char) 0);
                                    strZzy2.getClass();
                                    long jZzu7 = zzedVar5.zzu();
                                    long jZzu8 = zzedVar5.zzu();
                                    RoundingMode roundingMode = RoundingMode.FLOOR;
                                    long jZzu9 = zzen.zzu(jZzu8, 1000000L, jZzu7, roundingMode);
                                    long j24 = this.zzA;
                                    long j25 = j24 != -9223372036854775807L ? j24 + jZzu9 : -9223372036854775807L;
                                    jZzu = zzen.zzu(zzedVar5.zzu(), 1000L, jZzu7, roundingMode);
                                    jZzu2 = zzedVar5.zzu();
                                    j11 = jZzu9;
                                    j12 = j25;
                                } else if (iZza2 != 1) {
                                    q1.a.o(iZza2, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                                } else {
                                    long jZzu10 = zzedVar5.zzu();
                                    long jZzw3 = zzedVar5.zzw();
                                    RoundingMode roundingMode2 = RoundingMode.FLOOR;
                                    long jZzu11 = zzen.zzu(jZzw3, 1000000L, jZzu10, roundingMode2);
                                    long jZzu12 = zzen.zzu(zzedVar5.zzu(), 1000L, jZzu10, roundingMode2);
                                    long jZzu13 = zzedVar5.zzu();
                                    strZzy = zzedVar5.zzy((char) 0);
                                    strZzy.getClass();
                                    strZzy2 = zzedVar5.zzy((char) 0);
                                    strZzy2.getClass();
                                    jZzu = jZzu12;
                                    jZzu2 = jZzu13;
                                    j11 = -9223372036854775807L;
                                    j12 = jZzu11;
                                }
                                String str2 = strZzy;
                                String str3 = strZzy2;
                                byte[] bArr = new byte[zzedVar5.zzb()];
                                zzedVar5.zzH(bArr, 0, zzedVar5.zzb());
                                zzed zzedVar6 = new zzed(this.zzl.zza(new zzafo(str2, str3, jZzu, jZzu2, bArr)));
                                int iZzb = zzedVar6.zzb();
                                for (zzadx zzadxVar2 : this.zzI) {
                                    zzedVar6.zzL(0);
                                    zzadxVar2.zzq(zzedVar6, iZzb);
                                }
                                if (j12 == -9223372036854775807L) {
                                    this.zzo.addLast(new zzair(j11, true, iZzb));
                                    this.zzx += iZzb;
                                } else if (this.zzo.isEmpty()) {
                                    for (zzadx zzadxVar3 : this.zzI) {
                                        zzadxVar3.zzs(j12, 1, iZzb, 0, null);
                                    }
                                } else {
                                    this.zzo.addLast(new zzair(j12, false, iZzb));
                                    this.zzx += iZzb;
                                }
                            }
                        }
                    } else {
                        ((zzes) this.zzn.peek()).zzd(zzetVar);
                    }
                } else {
                    zzacsVar.zzk(i25);
                }
                zzl(zzacsVar.zzf());
            }
        }
        char c13 = 6;
        if (this.zzr == 3) {
            int iZzb2 = zzaisVar.zzb();
            this.zzC = iZzb2;
            this.zzF = true;
            if (zzaisVar.zzf < zzaisVar.zzi) {
                zzacsVar.zzk(iZzb2);
                zzajf zzajfVarZzf2 = zzaisVar.zzf();
                if (zzajfVarZzf2 != null) {
                    zzed zzedVar7 = zzaisVar.zzb.zzn;
                    int i29 = zzajfVarZzf2.zzd;
                    if (i29 != 0) {
                        zzedVar7.zzM(i29);
                    }
                    if (zzaisVar.zzb.zzb(zzaisVar.zzf)) {
                        zzedVar7.zzM(zzedVar7.zzq() * 6);
                    }
                }
                if (!zzaisVar.zzk()) {
                    this.zzB = null;
                }
                i15 = 3;
            } else {
                if (zzaisVar.zzd.zza.zzg == 1) {
                    this.zzC = iZzb2 - 8;
                    zzacsVar.zzk(8);
                }
                if ("audio/ac4".equals(zzaisVar.zzd.zza.zzf.zzo)) {
                    this.zzD = zzaisVar.zzc(this.zzC, 7);
                    zzabu.zzb(this.zzC, this.zzk);
                    zzaisVar.zza.zzq(this.zzk, 7);
                    iZzc = this.zzD + 7;
                    this.zzD = iZzc;
                } else {
                    iZzc = zzaisVar.zzc(this.zzC, 0);
                    this.zzD = iZzc;
                }
                this.zzC += iZzc;
                this.zzr = 4;
                this.zzE = 0;
                zzajeVar = zzaisVar.zzd.zza;
                zzadxVar = zzaisVar.zza;
                jZze = zzaisVar.zze();
                i10 = zzajeVar.zzj;
                if (i10 == 0) {
                    while (true) {
                        i17 = this.zzD;
                        i18 = this.zzC;
                        if (i17 < i18) {
                            break;
                        }
                        this.zzD += zzadxVar.zzf(zzacsVar, i18 - i17, false);
                    }
                } else {
                    bArrZzN = this.zzh.zzN();
                    bArrZzN[0] = 0;
                    bArrZzN[1] = 0;
                    bArrZzN[c10] = 0;
                    i11 = i10 + 1;
                    i12 = 4 - i10;
                    while (this.zzD < this.zzC) {
                        i13 = this.zzE;
                        if (i13 == 0) {
                            zzacsVar.zzi(bArrZzN, i12, i11);
                            this.zzh.zzL(i);
                            iZzg = this.zzh.zzg();
                            if (iZzg > 0) {
                                throw zzbh.zza("Invalid NAL length", null);
                            }
                            this.zzE = iZzg - 1;
                            this.zzg.zzL(i);
                            zzadxVar.zzq(this.zzg, 4);
                            zzadxVar.zzq(this.zzh, 1);
                            if (this.zzJ.length > 0) {
                                str = zzajeVar.zzf.zzo;
                                byte b10 = bArrZzN[4];
                                if (("video/avc".equals(str) || (b10 & 31) != c13) && !("video/hevc".equals(str) && ((b10 & 126) >> 1) == 39)) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                            } else {
                                z4 = false;
                            }
                            this.zzG = z4;
                            this.zzD += 5;
                            this.zzC += i12;
                            if (this.zzF && Objects.equals(zzaisVar.zzd.zza.zzf.zzo, "video/avc") && zzfp.zzi(bArrZzN[4])) {
                                this.zzF = true;
                            }
                        } else {
                            if (this.zzG) {
                                this.zzi.zzI(i13);
                                zzacsVar.zzi(this.zzi.zzN(), 0, this.zzE);
                                zzadxVar.zzq(this.zzi, this.zzE);
                                iZzf = this.zzE;
                                zzed zzedVar8 = this.zzi;
                                int iZzb3 = zzfp.zzb(zzedVar8.zzN(), zzedVar8.zze());
                                this.zzi.zzL("video/hevc".equals(zzajeVar.zzf.zzo) ? 1 : 0);
                                this.zzi.zzK(iZzb3);
                                i14 = zzajeVar.zzf.zzq;
                                if (i14 != -1 && i14 != this.zzp.zza()) {
                                    this.zzp.zzd(zzajeVar.zzf.zzq);
                                }
                                this.zzp.zzb(jZze, this.zzi);
                                if ((zzaisVar.zza() & 5) != 0) {
                                    this.zzp.zzc();
                                }
                            } else {
                                iZzf = zzadxVar.zzf(zzacsVar, i13, false);
                            }
                            this.zzD += iZzf;
                            this.zzE -= iZzf;
                            c13 = 6;
                        }
                        i = 0;
                    }
                }
                int iZza3 = zzaisVar.zza();
                zzajfVarZzf = zzaisVar.zzf();
                if (zzajfVarZzf != null) {
                    zzadwVar = zzajfVarZzf.zzc;
                } else {
                    zzadwVar = null;
                }
                zzadxVar.zzs(jZze, iZza3, this.zzC, 0, zzadwVar);
                while (!this.zzo.isEmpty()) {
                    zzairVar = (zzair) this.zzo.removeFirst();
                    this.zzx -= zzairVar.zzc;
                    j4 = zzairVar.zza;
                    if (zzairVar.zzb) {
                        j4 += jZze;
                    }
                    j10 = j4;
                    for (zzadx zzadxVar4 : this.zzI) {
                        zzadxVar4.zzs(j10, 1, zzairVar.zzc, this.zzx, null);
                    }
                }
                if (!zzaisVar.zzk()) {
                    this.zzB = null;
                }
                i15 = 3;
            }
        } else {
            zzajeVar = zzaisVar.zzd.zza;
            zzadxVar = zzaisVar.zza;
            jZze = zzaisVar.zze();
            i10 = zzajeVar.zzj;
            if (i10 == 0) {
                while (true) {
                    i17 = this.zzD;
                    i18 = this.zzC;
                    if (i17 < i18) {
                        break;
                        break;
                    }
                    this.zzD += zzadxVar.zzf(zzacsVar, i18 - i17, false);
                }
            } else {
                bArrZzN = this.zzh.zzN();
                bArrZzN[0] = 0;
                bArrZzN[1] = 0;
                bArrZzN[c10] = 0;
                i11 = i10 + 1;
                i12 = 4 - i10;
                while (this.zzD < this.zzC) {
                    i13 = this.zzE;
                    if (i13 == 0) {
                        zzacsVar.zzi(bArrZzN, i12, i11);
                        this.zzh.zzL(i);
                        iZzg = this.zzh.zzg();
                        if (iZzg > 0) {
                            throw zzbh.zza("Invalid NAL length", null);
                        }
                        this.zzE = iZzg - 1;
                        this.zzg.zzL(i);
                        zzadxVar.zzq(this.zzg, 4);
                        zzadxVar.zzq(this.zzh, 1);
                        if (this.zzJ.length > 0) {
                            str = zzajeVar.zzf.zzo;
                            byte b11 = bArrZzN[4];
                            if ("video/avc".equals(str)) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                        } else {
                            z4 = false;
                        }
                        this.zzG = z4;
                        this.zzD += 5;
                        this.zzC += i12;
                        if (this.zzF) {
                        }
                    } else {
                        if (this.zzG) {
                            this.zzi.zzI(i13);
                            zzacsVar.zzi(this.zzi.zzN(), 0, this.zzE);
                            zzadxVar.zzq(this.zzi, this.zzE);
                            iZzf = this.zzE;
                            zzed zzedVar9 = this.zzi;
                            int iZzb4 = zzfp.zzb(zzedVar9.zzN(), zzedVar9.zze());
                            this.zzi.zzL("video/hevc".equals(zzajeVar.zzf.zzo) ? 1 : 0);
                            this.zzi.zzK(iZzb4);
                            i14 = zzajeVar.zzf.zzq;
                            if (i14 != -1) {
                                this.zzp.zzd(zzajeVar.zzf.zzq);
                            }
                            this.zzp.zzb(jZze, this.zzi);
                            if ((zzaisVar.zza() & 5) != 0) {
                                this.zzp.zzc();
                            }
                        } else {
                            iZzf = zzadxVar.zzf(zzacsVar, i13, false);
                        }
                        this.zzD += iZzf;
                        this.zzE -= iZzf;
                        c13 = 6;
                    }
                    i = 0;
                }
            }
            int iZza4 = zzaisVar.zza();
            zzajfVarZzf = zzaisVar.zzf();
            if (zzajfVarZzf != null) {
                zzadwVar = zzajfVarZzf.zzc;
            } else {
                zzadwVar = null;
            }
            zzadxVar.zzs(jZze, iZza4, this.zzC, 0, zzadwVar);
            while (!this.zzo.isEmpty()) {
                zzairVar = (zzair) this.zzo.removeFirst();
                this.zzx -= zzairVar.zzc;
                j4 = zzairVar.zza;
                if (zzairVar.zzb) {
                    j4 += jZze;
                }
                j10 = j4;
                while (i16 < r4) {
                    zzadxVar4.zzs(j10, 1, zzairVar.zzc, this.zzx, null);
                }
            }
            if (!zzaisVar.zzk()) {
                this.zzB = null;
            }
            i15 = 3;
        }
        this.zzr = i15;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ List zzd() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zze(zzacu zzacuVar) {
        int i;
        if ((this.zzd & 32) == 0) {
            zzacuVar = new zzakj(zzacuVar, this.zzc);
        }
        this.zzH = zzacuVar;
        zzj();
        zzadx[] zzadxVarArr = new zzadx[2];
        this.zzI = zzadxVarArr;
        int i10 = 100;
        int i11 = 0;
        if ((this.zzd & 4) != 0) {
            zzadxVarArr[0] = this.zzH.zzw(100, 5);
            i = 1;
            i10 = 101;
        } else {
            i = 0;
        }
        zzadx[] zzadxVarArr2 = (zzadx[]) zzen.zzO(this.zzI, i);
        this.zzI = zzadxVarArr2;
        for (zzadx zzadxVar : zzadxVarArr2) {
            zzadxVar.zzl(zzb);
        }
        this.zzJ = new zzadx[this.zze.size()];
        while (i11 < this.zzJ.length) {
            zzadx zzadxVarZzw = this.zzH.zzw(i10, 3);
            zzadxVarZzw.zzl((zzad) this.zze.get(i11));
            this.zzJ[i11] = zzadxVarZzw;
            i11++;
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j4, long j10) {
        int size = this.zzf.size();
        for (int i = 0; i < size; i++) {
            ((zzais) this.zzf.valueAt(i)).zzi();
        }
        this.zzo.clear();
        this.zzx = 0;
        this.zzp.zzc();
        this.zzy = j10;
        this.zzn.clear();
        zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        zzadu zzaduVarZza = zzajd.zza(zzacsVar);
        this.zzq = zzaduVarZza != null ? zzfzo.zzo(zzaduVarZza) : zzfzo.zzn();
        return zzaduVarZza == null;
    }

    public zzait(zzakg zzakgVar, int i, zzek zzekVar, zzaje zzajeVar, List list, zzadx zzadxVar) {
        this.zzc = zzakgVar;
        this.zzd = i;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzafp();
        this.zzm = new zzed(16);
        this.zzg = new zzed(zzfp.zza);
        this.zzh = new zzed(5);
        this.zzi = new zzed();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzed(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzq = zzfzo.zzn();
        this.zzz = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzH = zzacu.zza;
        this.zzI = new zzadx[0];
        this.zzJ = new zzadx[0];
        this.zzp = new zzft(new zzfr() { // from class: com.google.android.gms.internal.ads.zzaiq
            @Override // com.google.android.gms.internal.ads.zzfr
            public final void zza(long j4, zzed zzedVar) {
                this.zza.zza(j4, zzedVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ zzacr zzc() {
        return this;
    }
}
