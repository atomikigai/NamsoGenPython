package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaiy implements zzacr, zzadq {
    private int zzA;
    private zzagz zzB;
    private final zzakg zza;
    private final int zzb;
    private final zzed zzc;
    private final zzed zzd;
    private final zzed zze;
    private final zzed zzf;
    private final ArrayDeque zzg;
    private final zzajc zzh;
    private final List zzi;
    private zzfzo zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private int zzn;
    private zzed zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private zzacu zzv;
    private zzaix[] zzw;
    private long[][] zzx;
    private int zzy;
    private long zzz;

    @Deprecated
    public zzaiy() {
        this(zzakg.zza, 16);
    }

    private static int zzj(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzk(zzajh zzajhVar, long j4) {
        int iZza = zzajhVar.zza(j4);
        return iZza == -1 ? zzajhVar.zzb(j4) : iZza;
    }

    private static long zzl(zzajh zzajhVar, long j4, long j10) {
        int iZzk = zzk(zzajhVar, j4);
        return iZzk == -1 ? j10 : Math.min(zzajhVar.zzc[iZzk], j10);
    }

    private final void zzm() {
        this.zzk = 0;
        this.zzn = 0;
    }

    private final void zzn(long j4) throws zzbh {
        zzbd zzbdVar;
        long j10;
        int i;
        zzbd zzbdVar2;
        ArrayList arrayList;
        int i10;
        while (!this.zzg.isEmpty() && ((zzes) this.zzg.peek()).zza == j4) {
            zzes zzesVar = (zzes) this.zzg.pop();
            if (zzesVar.zzd == 1836019574) {
                zzes zzesVarZza = zzesVar.zza(1835365473);
                new ArrayList();
                zzbd zzbdVarZzb = zzesVarZza != null ? zzain.zzb(zzesVarZza) : null;
                ArrayList arrayList2 = new ArrayList();
                boolean z4 = this.zzA == 1;
                zzadf zzadfVar = new zzadf();
                zzet zzetVarZzb = zzesVar.zzb(1969517665);
                if (zzetVarZzb != null) {
                    zzbd zzbdVarZzc = zzain.zzc(zzetVarZzb);
                    zzadfVar.zzb(zzbdVarZzc);
                    zzbdVar = zzbdVarZzc;
                } else {
                    zzbdVar = null;
                }
                zzet zzetVarZzb2 = zzesVar.zzb(1836476516);
                zzetVarZzb2.getClass();
                ArrayList arrayList3 = arrayList2;
                long j11 = -9223372036854775807L;
                zzbd zzbdVar3 = new zzbd(-9223372036854775807L, zzain.zzd(zzetVarZzb2.zza));
                List listZzf = zzain.zzf(zzesVar, zzadfVar, -9223372036854775807L, null, 1 == (this.zzb & 1), z4, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzaiw
                    @Override // com.google.android.gms.internal.ads.zzfwh
                    public final Object apply(Object obj) {
                        return (zzaje) obj;
                    }
                });
                int i11 = 0;
                int i12 = 0;
                long jMax = -9223372036854775807L;
                int size = -1;
                while (true) {
                    j10 = 0;
                    if (i11 >= listZzf.size()) {
                        break;
                    }
                    zzajh zzajhVar = (zzajh) listZzf.get(i11);
                    if (zzajhVar.zzb == 0) {
                        i = i12;
                        zzbdVar2 = zzbdVar;
                        arrayList = arrayList3;
                    } else {
                        zzaje zzajeVar = zzajhVar.zza;
                        zzbd zzbdVar4 = zzbdVar;
                        long j12 = zzajeVar.zze;
                        if (j12 == j11) {
                            j12 = zzajhVar.zzh;
                        }
                        jMax = Math.max(jMax, j12);
                        i = i12 + 1;
                        zzaix zzaixVar = new zzaix(zzajeVar, zzajhVar, this.zzv.zzw(i12, zzajeVar.zzb));
                        int i13 = "audio/true-hd".equals(zzajeVar.zzf.zzo) ? zzajhVar.zze * 16 : zzajhVar.zze + 30;
                        zzab zzabVarZzb = zzajeVar.zzf.zzb();
                        zzabVarZzb.zzQ(i13);
                        if (zzajeVar.zzb == 2) {
                            zzad zzadVar = zzajeVar.zzf;
                            int i14 = this.zzb;
                            int i15 = zzadVar.zzf;
                            if ((i14 & 8) != 0) {
                                i15 |= size == -1 ? 1 : 2;
                            }
                            if (j12 > 0 && (i10 = zzajhVar.zzb) > 0) {
                                zzabVarZzb.zzI(i10 / (j12 / 1000000.0f));
                            }
                            zzabVarZzb.zzX(i15);
                        }
                        if (zzajeVar.zzb == 1 && zzadfVar.zza()) {
                            zzabVarZzb.zzG(zzadfVar.zza);
                            zzabVarZzb.zzH(zzadfVar.zzb);
                        }
                        int i16 = zzajeVar.zzb;
                        zzbd[] zzbdVarArr = {this.zzi.isEmpty() ? null : new zzbd(this.zzi), zzbdVar4, zzbdVar3};
                        zzbdVar2 = zzbdVar4;
                        zzbd zzbdVar5 = new zzbd(j11, new zzbc[0]);
                        if (zzbdVarZzb != null) {
                            for (int i17 = 0; i17 < zzbdVarZzb.zza(); i17++) {
                                zzbc zzbcVarZzb = zzbdVarZzb.zzb(i17);
                                if (zzbcVarZzb instanceof zzer) {
                                    zzer zzerVar = (zzer) zzbcVarZzb;
                                    if (!zzerVar.zza.equals("com.android.capture.fps")) {
                                        zzbdVar5 = zzbdVar5.zzc(zzerVar);
                                    } else if (i16 == 2) {
                                        zzbdVar5 = zzbdVar5.zzc(zzerVar);
                                    }
                                }
                            }
                        }
                        for (int i18 = 0; i18 < 3; i18++) {
                            zzbdVar5 = zzbdVar5.zzd(zzbdVarArr[i18]);
                        }
                        if (zzbdVar5.zza() > 0) {
                            zzabVarZzb.zzS(zzbdVar5);
                        }
                        zzaixVar.zzc.zzl(zzabVarZzb.zzaf());
                        if (zzajeVar.zzb == 2 && size == -1) {
                            size = arrayList3.size();
                        }
                        arrayList = arrayList3;
                        arrayList.add(zzaixVar);
                    }
                    i11++;
                    arrayList3 = arrayList;
                    zzadfVar = zzadfVar;
                    i12 = i;
                    listZzf = listZzf;
                    zzbdVar3 = zzbdVar3;
                    zzbdVar = zzbdVar2;
                    j11 = -9223372036854775807L;
                }
                this.zzy = size;
                this.zzz = jMax;
                zzaix[] zzaixVarArr = (zzaix[]) arrayList3.toArray(new zzaix[0]);
                this.zzw = zzaixVarArr;
                int length = zzaixVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i19 = 0; i19 < zzaixVarArr.length; i19++) {
                    jArr[i19] = new long[zzaixVarArr[i19].zzb.zzb];
                    jArr2[i19] = zzaixVarArr[i19].zzb.zzf[0];
                }
                int i20 = 0;
                while (i20 < zzaixVarArr.length) {
                    long j13 = Long.MAX_VALUE;
                    int i21 = -1;
                    for (int i22 = 0; i22 < zzaixVarArr.length; i22++) {
                        if (!zArr[i22]) {
                            long j14 = jArr2[i22];
                            if (j14 <= j13) {
                                i21 = i22;
                                j13 = j14;
                            }
                        }
                    }
                    int i23 = iArr[i21];
                    long[] jArr3 = jArr[i21];
                    jArr3[i23] = j10;
                    zzajh zzajhVar2 = zzaixVarArr[i21].zzb;
                    j10 += (long) zzajhVar2.zzd[i23];
                    int i24 = i23 + 1;
                    iArr[i21] = i24;
                    if (i24 < jArr3.length) {
                        jArr2[i21] = zzajhVar2.zzf[i24];
                    } else {
                        zArr[i21] = true;
                        i20++;
                    }
                }
                this.zzx = jArr;
                this.zzv.zzD();
                this.zzv.zzO(this);
                this.zzg.clear();
                this.zzk = 2;
            } else if (!this.zzg.isEmpty()) {
                ((zzes) this.zzg.peek()).zzc(zzesVar);
            }
        }
        if (this.zzk != 2) {
            zzm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zza() {
        return this.zzz;
    }

    /* JADX WARN: Code duplicated, block: B:293:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0082  */
    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
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
        long j4;
        long j10;
        zzadx zzadxVar;
        boolean z4;
        boolean z10;
        while (true) {
            int i = this.zzk;
            long j11 = 0;
            if (i == 0) {
                if (this.zzn == 0) {
                    if (!zzacsVar.zzn(this.zzf.zzN(), 0, 8, true)) {
                        if (this.zzA != 2 || (this.zzb & 2) == 0) {
                            return -1;
                        }
                        zzadx zzadxVarZzw = this.zzv.zzw(0, 4);
                        zzagz zzagzVar = this.zzB;
                        zzbd zzbdVar = zzagzVar == null ? null : new zzbd(-9223372036854775807L, zzagzVar);
                        zzab zzabVar = new zzab();
                        zzabVar.zzS(zzbdVar);
                        zzadxVarZzw.zzl(zzabVar.zzaf());
                        this.zzv.zzD();
                        this.zzv.zzO(new zzadp(-9223372036854775807L, 0L));
                        return -1;
                    }
                    this.zzn = 8;
                    this.zzf.zzL(0);
                    this.zzm = this.zzf.zzu();
                    this.zzl = this.zzf.zzg();
                }
                long j12 = this.zzm;
                if (j12 == 1) {
                    zzacsVar.zzi(this.zzf.zzN(), 8, 8);
                    this.zzn += 8;
                    this.zzm = this.zzf.zzw();
                } else if (j12 == 0) {
                    long jZzd = zzacsVar.zzd();
                    if (jZzd == -1) {
                        zzes zzesVar = (zzes) this.zzg.peek();
                        jZzd = zzesVar != null ? zzesVar.zza : -1L;
                    }
                    if (jZzd != -1) {
                        this.zzm = (jZzd - zzacsVar.zzf()) + ((long) this.zzn);
                    }
                }
                long j13 = this.zzm;
                int i10 = this.zzn;
                if (j13 < i10) {
                    throw zzbh.zzc("Atom size less than header length (unsupported).");
                }
                int i11 = this.zzl;
                if (i11 == 1836019574 || i11 == 1953653099 || i11 == 1835297121 || i11 == 1835626086 || i11 == 1937007212 || i11 == 1701082227 || i11 == 1835365473 || i11 == 1701082724) {
                    long jZzf = zzacsVar.zzf();
                    long j14 = this.zzm;
                    long j15 = jZzf + j14;
                    long j16 = this.zzn;
                    if (j14 != j16 && this.zzl == 1835365473) {
                        this.zze.zzI(8);
                        zzacsVar.zzh(this.zze.zzN(), 0, 8);
                        zzain.zzg(this.zze);
                        zzacsVar.zzk(this.zze.zzd());
                        zzacsVar.zzj();
                    }
                    long j17 = j15 - j16;
                    this.zzg.push(new zzes(this.zzl, j17));
                    if (this.zzm == this.zzn) {
                        zzn(j17);
                    } else {
                        zzm();
                    }
                } else if (i11 == 1835296868 || i11 == 1836476516 || i11 == 1751411826 || i11 == 1937011556 || i11 == 1937011827 || i11 == 1937011571 || i11 == 1668576371 || i11 == 1701606260 || i11 == 1937011555 || i11 == 1937011578 || i11 == 1937013298 || i11 == 1937007471 || i11 == 1668232756 || i11 == 1953196132 || i11 == 1718909296 || i11 == 1969517665 || i11 == 1801812339 || i11 == 1768715124) {
                    zzdb.zzf(i10 == 8);
                    zzdb.zzf(this.zzm <= 2147483647L);
                    zzed zzedVar = new zzed((int) this.zzm);
                    System.arraycopy(this.zzf.zzN(), 0, zzedVar.zzN(), 0, 8);
                    this.zzo = zzedVar;
                    this.zzk = 1;
                } else {
                    long jZzf2 = zzacsVar.zzf();
                    long j18 = this.zzn;
                    long j19 = jZzf2 - j18;
                    if (this.zzl == 1836086884) {
                        this.zzB = new zzagz(0L, j19, -9223372036854775807L, j19 + j18, this.zzm - j18);
                    }
                    this.zzo = null;
                    this.zzk = 1;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        this.zzh.zza(zzacsVar, zzadnVar, this.zzi);
                        if (zzadnVar.zza == 0) {
                            zzm();
                        }
                        return 1;
                    }
                    long jZzf3 = zzacsVar.zzf();
                    int i12 = this.zzp;
                    if (i12 == -1) {
                        int i13 = -1;
                        int i14 = -1;
                        boolean z11 = true;
                        boolean z12 = true;
                        long j20 = Long.MAX_VALUE;
                        long j21 = Long.MAX_VALUE;
                        long j22 = Long.MAX_VALUE;
                        int i15 = 0;
                        j10 = 262144;
                        while (true) {
                            zzaix[] zzaixVarArr = this.zzw;
                            if (i15 >= zzaixVarArr.length) {
                                break;
                            }
                            zzaix zzaixVar = zzaixVarArr[i15];
                            int i16 = zzaixVar.zze;
                            zzajh zzajhVar = zzaixVar.zzb;
                            long j23 = j11;
                            if (i16 != zzajhVar.zzb) {
                                long j24 = zzajhVar.zzc[i16];
                                long[][] jArr = this.zzx;
                                int i17 = zzen.zza;
                                long j25 = jArr[i15][i16];
                                long j26 = j24 - jZzf3;
                                boolean z13 = j26 < j23 || j26 >= 262144;
                                if (z13) {
                                    z4 = z12;
                                } else {
                                    if (z12) {
                                        z12 = z13;
                                        i14 = i15;
                                        j21 = j25;
                                        j22 = j26;
                                    } else {
                                        z4 = false;
                                    }
                                    if (j25 < j20) {
                                        z11 = z13;
                                        i13 = i15;
                                        j20 = j25;
                                    }
                                }
                                if (z13 != z4 || j26 >= j22) {
                                    z12 = z4;
                                } else {
                                    z12 = z13;
                                    i14 = i15;
                                    j21 = j25;
                                    j22 = j26;
                                }
                                if (j25 < j20) {
                                    z11 = z13;
                                    i13 = i15;
                                    j20 = j25;
                                }
                            }
                            i15++;
                            j11 = j23;
                        }
                        j4 = j11;
                        i12 = (j20 == Long.MAX_VALUE || !z11 || j21 < j20 + 10485760) ? i14 : i13;
                        this.zzp = i12;
                        if (i12 == -1) {
                            return -1;
                        }
                    } else {
                        j4 = 0;
                        j10 = 262144;
                    }
                    zzaix zzaixVar2 = this.zzw[i12];
                    zzadx zzadxVar2 = zzaixVar2.zzc;
                    int i18 = zzaixVar2.zze;
                    zzajh zzajhVar2 = zzaixVar2.zzb;
                    long j27 = zzajhVar2.zzc[i18];
                    int i19 = zzajhVar2.zzd[i18];
                    zzady zzadyVar = zzaixVar2.zzd;
                    zzadx zzadxVar3 = zzadxVar2;
                    boolean z14 = false;
                    long j28 = (j27 - jZzf3) + ((long) this.zzq);
                    if (j28 < j4 || j28 >= j10) {
                        zzadnVar.zza = j27;
                        return 1;
                    }
                    if (zzaixVar2.zza.zzg == 1) {
                        j28 += 8;
                        i19 -= 8;
                    }
                    zzacsVar.zzk((int) j28);
                    if (!Objects.equals(zzaixVar2.zza.zzf.zzo, "video/avc")) {
                        this.zzt = true;
                    }
                    zzaje zzajeVar = zzaixVar2.zza;
                    int i20 = zzajeVar.zzj;
                    if (i20 == 0) {
                        zzadxVar = zzadxVar3;
                        if ("audio/ac4".equals(zzajeVar.zzf.zzo)) {
                            if (this.zzr == 0) {
                                zzabu.zzb(i19, this.zze);
                                zzadxVar.zzq(this.zze, 7);
                                this.zzr += 7;
                            }
                            i19 += 7;
                        } else if (zzadyVar != null) {
                            zzadyVar.zzd(zzacsVar);
                        }
                        while (true) {
                            int i21 = this.zzr;
                            if (i21 >= i19) {
                                break;
                            }
                            int iZzf = zzadxVar.zzf(zzacsVar, i19 - i21, false);
                            this.zzq += iZzf;
                            this.zzr += iZzf;
                            this.zzs -= iZzf;
                        }
                    } else {
                        byte[] bArrZzN = this.zzd.zzN();
                        bArrZzN[0] = 0;
                        bArrZzN[1] = 0;
                        bArrZzN[2] = 0;
                        int i22 = i20 + 1;
                        int i23 = 4 - i20;
                        while (this.zzr < i19) {
                            int i24 = this.zzs;
                            if (i24 == 0) {
                                zzacsVar.zzi(bArrZzN, i23, i22);
                                this.zzq += i22;
                                boolean z15 = z14;
                                this.zzd.zzL(z15 ? 1 : 0);
                                int iZzg = this.zzd.zzg();
                                if (iZzg <= 0) {
                                    throw zzbh.zza("Invalid NAL length", null);
                                }
                                this.zzs = iZzg - 1;
                                this.zzc.zzL(z15 ? 1 : 0);
                                zzadx zzadxVar4 = zzadxVar3;
                                zzadxVar4.zzq(this.zzc, 4);
                                zzadxVar4.zzq(this.zzd, 1);
                                this.zzr += 5;
                                i19 += i23;
                                if (!this.zzt && zzfp.zzi(bArrZzN[4])) {
                                    this.zzt = true;
                                }
                                zzadxVar3 = zzadxVar4;
                            } else {
                                int iZzf2 = zzadxVar3.zzf(zzacsVar, i24, z14);
                                this.zzq += iZzf2;
                                this.zzr += iZzf2;
                                this.zzs -= iZzf2;
                            }
                            z14 = false;
                        }
                        zzadxVar = zzadxVar3;
                    }
                    int i25 = i19;
                    zzajh zzajhVar3 = zzaixVar2.zzb;
                    long j29 = zzajhVar3.zzf[i18];
                    int i26 = zzajhVar3.zzg[i18];
                    if (!this.zzt) {
                        i26 |= 67108864;
                    }
                    if (zzadyVar != null) {
                        zzadx zzadxVar5 = zzadxVar;
                        zzadyVar.zzc(zzadxVar5, j29, i26, i25, 0, null);
                        if (i18 + 1 == zzaixVar2.zzb.zzb) {
                            zzadyVar.zza(zzadxVar5, null);
                        }
                    } else {
                        zzadxVar.zzs(j29, i26, i25, 0, null);
                    }
                    zzaixVar2.zze++;
                    this.zzp = -1;
                    this.zzq = 0;
                    this.zzr = 0;
                    this.zzs = 0;
                    this.zzt = true;
                    return 0;
                }
                long j30 = this.zzm - ((long) this.zzn);
                long jZzf4 = zzacsVar.zzf() + j30;
                zzed zzedVar2 = this.zzo;
                if (zzedVar2 != null) {
                    zzacsVar.zzi(zzedVar2.zzN(), this.zzn, (int) j30);
                    if (this.zzl == 1718909296) {
                        this.zzu = true;
                        zzedVar2.zzL(8);
                        int iZzj = zzj(zzedVar2.zzg());
                        if (iZzj == 0) {
                            zzedVar2.zzM(4);
                            do {
                                if (zzedVar2.zzb() <= 0) {
                                    iZzj = 0;
                                    break;
                                }
                                iZzj = zzj(zzedVar2.zzg());
                            } while (iZzj == 0);
                        }
                        this.zzA = iZzj;
                    } else if (!this.zzg.isEmpty()) {
                        ((zzes) this.zzg.peek()).zzd(new zzet(this.zzl, zzedVar2));
                    }
                } else {
                    if (!this.zzu && this.zzl == 1835295092) {
                        this.zzA = 1;
                    }
                    if (j30 < 262144) {
                        zzacsVar.zzk((int) j30);
                    } else {
                        zzadnVar.zza = zzacsVar.zzf() + j30;
                        z10 = true;
                    }
                    zzn(jZzf4);
                    if (z10 && this.zzk != 2) {
                        return 1;
                    }
                }
                z10 = false;
                zzn(jZzf4);
                if (z10) {
                    continue;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ List zzd() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zze(zzacu zzacuVar) {
        if ((this.zzb & 16) == 0) {
            zzacuVar = new zzakj(zzacuVar, this.zza);
        }
        this.zzv = zzacuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j4, long j10) {
        this.zzg.clear();
        this.zzn = 0;
        this.zzp = -1;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = true;
        if (j4 == 0) {
            if (this.zzk != 3) {
                zzm();
                return;
            } else {
                this.zzh.zzb();
                this.zzi.clear();
                return;
            }
        }
        for (zzaix zzaixVar : this.zzw) {
            zzajh zzajhVar = zzaixVar.zzb;
            int iZza = zzajhVar.zza(j10);
            if (iZza == -1) {
                iZza = zzajhVar.zzb(j10);
            }
            zzaixVar.zze = iZza;
            zzady zzadyVar = zzaixVar.zzd;
            if (zzadyVar != null) {
                zzadyVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j4) {
        long j10;
        long j11;
        int iZzb;
        zzaix[] zzaixVarArr = this.zzw;
        if (zzaixVarArr.length == 0) {
            zzadr zzadrVar = zzadr.zza;
            return new zzado(zzadrVar, zzadrVar);
        }
        int i = this.zzy;
        long jZzl = -1;
        if (i != -1) {
            zzajh zzajhVar = zzaixVarArr[i].zzb;
            int iZzk = zzk(zzajhVar, j4);
            if (iZzk == -1) {
                zzadr zzadrVar2 = zzadr.zza;
                return new zzado(zzadrVar2, zzadrVar2);
            }
            long j12 = zzajhVar.zzf[iZzk];
            j10 = zzajhVar.zzc[iZzk];
            if (j12 >= j4 || iZzk >= zzajhVar.zzb - 1 || (iZzb = zzajhVar.zzb(j4)) == -1 || iZzb == iZzk) {
                j11 = -9223372036854775807L;
            } else {
                j11 = zzajhVar.zzf[iZzb];
                jZzl = zzajhVar.zzc[iZzb];
            }
            j4 = j12;
        } else {
            j10 = Long.MAX_VALUE;
            j11 = -9223372036854775807L;
        }
        int i10 = 0;
        while (true) {
            zzaix[] zzaixVarArr2 = this.zzw;
            if (i10 >= zzaixVarArr2.length) {
                break;
            }
            if (i10 != this.zzy) {
                zzajh zzajhVar2 = zzaixVarArr2[i10].zzb;
                long jZzl2 = zzl(zzajhVar2, j4, j10);
                if (j11 != -9223372036854775807L) {
                    jZzl = zzl(zzajhVar2, j11, jZzl);
                }
                j10 = jZzl2;
            }
            i10++;
        }
        zzadr zzadrVar3 = new zzadr(j4, j10);
        return j11 == -9223372036854775807L ? new zzado(zzadrVar3, zzadrVar3) : new zzado(zzadrVar3, new zzadr(j11, jZzl));
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final boolean zzh() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        zzadu zzaduVarZzb = zzajd.zzb(zzacsVar, (this.zzb & 2) != 0);
        this.zzj = zzaduVarZzb != null ? zzfzo.zzo(zzaduVarZzb) : zzfzo.zzn();
        return zzaduVarZzb == null;
    }

    public zzaiy(zzakg zzakgVar, int i) {
        this.zza = zzakgVar;
        this.zzb = i;
        this.zzj = zzfzo.zzn();
        this.zzk = (i & 4) != 0 ? 3 : 0;
        this.zzh = new zzajc();
        this.zzi = new ArrayList();
        this.zzf = new zzed(16);
        this.zzg = new ArrayDeque();
        this.zzc = new zzed(zzfp.zza);
        this.zzd = new zzed(5);
        this.zze = new zzed();
        this.zzp = -1;
        this.zzv = zzacu.zza;
        this.zzw = new zzaix[0];
        this.zzt = true;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ zzacr zzc() {
        return this;
    }
}
