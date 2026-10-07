package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzkh implements Handler.Callback, zzuo, zzyi, zzle, zzie, zzlh {
    private static final long zza = zzen.zzv(10000);
    private zzke zzA;
    private boolean zzB;
    private boolean zzD;
    private boolean zzE;
    private boolean zzG;
    private boolean zzJ;
    private int zzK;
    private zzkf zzL;
    private long zzM;
    private long zzN;
    private int zzO;
    private boolean zzP;
    private zzig zzQ;
    private zziq zzS;
    private final zzjd zzT;
    private final zzia zzU;
    private final zzln[] zzb;
    private final Set zzc;
    private final zzlq[] zzd;
    private final boolean[] zze;
    private final zzyj zzf;
    private final zzyk zzg;
    private final zzkl zzh;
    private final zzyr zzi;
    private final zzdm zzj;
    private final HandlerThread zzk;
    private final Looper zzl;
    private final zzbu zzm;
    private final zzbt zzn;
    private final long zzo;
    private final zzif zzp;
    private final ArrayList zzq;
    private final zzdc zzr;
    private final zzkt zzs;
    private final zzlf zzt;
    private final long zzu;
    private final zzoj zzv;
    private final zzlw zzw;
    private final zzdm zzx;
    private zzls zzy;
    private zzlg zzz;
    private int zzH = 0;
    private boolean zzI = false;
    private boolean zzC = false;
    private long zzR = -9223372036854775807L;
    private long zzF = -9223372036854775807L;

    public zzkh(zzln[] zzlnVarArr, zzyj zzyjVar, zzyk zzykVar, zzkl zzklVar, zzyr zzyrVar, int i, boolean z4, zzlw zzlwVar, zzls zzlsVar, zzia zziaVar, long j4, boolean z10, boolean z11, Looper looper, zzdc zzdcVar, zzjd zzjdVar, zzoj zzojVar, Looper looper2, zziq zziqVar) {
        this.zzT = zzjdVar;
        this.zzb = zzlnVarArr;
        this.zzf = zzyjVar;
        this.zzg = zzykVar;
        this.zzh = zzklVar;
        this.zzi = zzyrVar;
        this.zzy = zzlsVar;
        this.zzU = zziaVar;
        this.zzu = j4;
        this.zzr = zzdcVar;
        this.zzv = zzojVar;
        this.zzS = zziqVar;
        this.zzw = zzlwVar;
        this.zzo = zzklVar.zzb(zzojVar);
        zzklVar.zzg(zzojVar);
        zzbv zzbvVar = zzbv.zza;
        zzlg zzlgVarZzg = zzlg.zzg(zzykVar);
        this.zzz = zzlgVarZzg;
        this.zzA = new zzke(zzlgVarZzg);
        int length = zzlnVarArr.length;
        this.zzd = new zzlq[2];
        this.zze = new boolean[2];
        zzlp zzlpVarZze = zzyjVar.zze();
        for (int i10 = 0; i10 < 2; i10++) {
            zzlnVarArr[i10].zzv(i10, zzojVar, zzdcVar);
            this.zzd[i10] = zzlnVarArr[i10].zzm();
            this.zzd[i10].zzL(zzlpVarZze);
        }
        this.zzp = new zzif(this, zzdcVar);
        this.zzq = new ArrayList();
        this.zzc = Collections.newSetFromMap(new IdentityHashMap());
        this.zzm = new zzbu();
        this.zzn = new zzbt();
        zzyjVar.zzr(this, zzyrVar);
        this.zzP = true;
        zzdm zzdmVarZzd = zzdcVar.zzd(looper, null);
        this.zzx = zzdmVarZzd;
        this.zzs = new zzkt(zzlwVar, zzdmVarZzd, new zzjz(this), zziqVar);
        this.zzt = new zzlf(this, zzlwVar, zzdmVarZzd, zzojVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.zzk = handlerThread;
        handlerThread.start();
        Looper looper3 = handlerThread.getLooper();
        this.zzl = looper3;
        this.zzj = zzdcVar.zzd(looper3, this);
    }

    private final void zzA(int i) throws zzig {
        zzln zzlnVar = this.zzb[i];
        if (zzag(zzlnVar)) {
            zzK(i, false);
            this.zzp.zzd(zzlnVar);
            zzan(zzlnVar);
            zzlnVar.zzr();
            this.zzK--;
        }
    }

    private final void zzB() throws zzig {
        int length = this.zzb.length;
        zzC(new boolean[2], this.zzs.zzf().zzf());
    }

    private final void zzC(boolean[] zArr, long j4) throws zzig {
        zzkq zzkqVarZzf = this.zzs.zzf();
        zzyk zzykVarZzi = zzkqVarZzf.zzi();
        int i = 0;
        while (true) {
            int length = this.zzb.length;
            if (i >= 2) {
                break;
            }
            if (!zzykVarZzi.zzb(i) && this.zzc.remove(this.zzb[i])) {
                this.zzb[i].zzI();
            }
            i++;
        }
        int i10 = 0;
        while (true) {
            int length2 = this.zzb.length;
            if (i10 >= 2) {
                zzkqVarZzf.zzg = true;
                return;
            }
            if (zzykVarZzi.zzb(i10)) {
                boolean z4 = zArr[i10];
                zzln zzlnVar = this.zzb[i10];
                if (!zzag(zzlnVar)) {
                    zzkt zzktVar = this.zzs;
                    zzkq zzkqVarZzf2 = zzktVar.zzf();
                    boolean z10 = zzkqVarZzf2 == zzktVar.zze();
                    zzyk zzykVarZzi2 = zzkqVarZzf2.zzi();
                    zzlr zzlrVar = zzykVarZzi2.zzb[i10];
                    zzad[] zzadVarArrZzal = zzal(zzykVarZzi2.zzc[i10]);
                    boolean z11 = zzaj() && this.zzz.zze == 3;
                    boolean z12 = !z4 && z11;
                    this.zzK++;
                    this.zzc.add(zzlnVar);
                    zzlnVar.zzs(zzlrVar, zzadVarArrZzal, zzkqVarZzf2.zzc[i10], this.zzM, z12, z10, j4, zzkqVarZzf2.zze(), zzkqVarZzf2.zzf.zza);
                    zzlnVar.zzu(11, new zzka(this));
                    this.zzp.zze(zzlnVar);
                    if (z11 && z10) {
                        zzlnVar.zzO();
                    }
                }
            }
            i10++;
        }
    }

    private final void zzD(IOException iOException, int i) {
        zzkt zzktVar = this.zzs;
        zzig zzigVarZzc = zzig.zzc(iOException, i);
        zzkq zzkqVarZze = zzktVar.zze();
        if (zzkqVarZze != null) {
            zzigVarZzc = zzigVarZzc.zza(zzkqVarZze.zzf.zza);
        }
        zzdt.zzd("ExoPlayerImplInternal", "Playback error", zzigVarZzc);
        zzX(false, false);
        this.zzz = this.zzz.zzd(zzigVarZzc);
    }

    private final void zzE(boolean z4) {
        zzkq zzkqVarZzd = this.zzs.zzd();
        zzur zzurVar = zzkqVarZzd == null ? this.zzz.zzb : zzkqVarZzd.zzf.zza;
        boolean zEquals = this.zzz.zzk.equals(zzurVar);
        if (!zEquals) {
            this.zzz = this.zzz.zza(zzurVar);
        }
        zzlg zzlgVar = this.zzz;
        zzlgVar.zzq = zzkqVarZzd == null ? zzlgVar.zzs : zzkqVarZzd.zzc();
        this.zzz.zzr = zzt();
        if ((!zEquals || z4) && zzkqVarZzd != null && zzkqVarZzd.zzd) {
            zzaa(zzkqVarZzd.zzf.zza, zzkqVarZzd.zzh(), zzkqVarZzd.zzi());
        }
    }

    /* JADX WARN: Code duplicated, block: B:198:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:199:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:202:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:206:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:208:0x03cf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:214:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:217:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:219:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:223:0x041f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34, types: [int] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    private final void zzF(zzbv zzbvVar, boolean z4) throws Throwable {
        long j4;
        long j10;
        zzur zzurVar;
        zzbu zzbuVar;
        Object obj;
        int iZzg;
        long jLongValue;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        zzbv zzbvVar2;
        long jLongValue2;
        ?? r11;
        long jZzv;
        zzur zzurVarZzh;
        boolean z14;
        boolean z15;
        boolean z16;
        int i;
        long jLongValue3;
        int iZzg2;
        boolean z17;
        Object obj2;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        ?? r25;
        long j11;
        Object obj3;
        boolean z23;
        int i10;
        long j12;
        long j13;
        long j14;
        zzkf zzkfVar;
        zzlg zzlgVar = this.zzz;
        zzkf zzkfVar2 = this.zzL;
        int i11 = this.zzH;
        boolean z24 = this.zzI;
        int i12 = 4;
        int i13 = -1;
        if (zzbvVar.zzo()) {
            zzbvVar2 = zzbvVar;
            zzurVarZzh = zzlg.zzh();
            z14 = false;
            z16 = false;
            jZzv = 0;
            z15 = true;
            j4 = -9223372036854775807L;
            j10 = -9223372036854775807L;
        } else {
            zzbt zzbtVar = this.zzn;
            zzur zzurVar2 = zzlgVar.zzb;
            Object obj4 = zzurVar2.zza;
            boolean zZzai = zzai(zzlgVar, zzbtVar);
            if (zzlgVar.zzb.zzb() || zZzai) {
                j4 = -9223372036854775807L;
                j10 = zzlgVar.zzc;
            } else {
                j4 = -9223372036854775807L;
                j10 = zzlgVar.zzs;
            }
            zzbu zzbuVar2 = this.zzm;
            if (zzkfVar2 != null) {
                zzurVar = zzurVar2;
                Object obj5 = obj4;
                Pair pairZzy = zzy(zzbvVar, zzkfVar2, true, i11, z24, zzbuVar2, zzbtVar);
                if (pairZzy == null) {
                    iZzg2 = zzbvVar.zzg(z24);
                    jLongValue3 = j10;
                    obj2 = obj5;
                    z19 = false;
                    z20 = true;
                    z18 = false;
                } else {
                    if (zzkfVar2.zzc == j4) {
                        iZzg2 = zzbvVar.zzn(pairZzy.first, zzbtVar).zzc;
                        jLongValue3 = j10;
                        z17 = false;
                    } else {
                        Object obj6 = pairZzy.first;
                        jLongValue3 = ((Long) pairZzy.second).longValue();
                        obj5 = obj6;
                        iZzg2 = -1;
                        z17 = true;
                    }
                    obj2 = obj5;
                    z18 = z17;
                    z19 = zzlgVar.zze == 4;
                    z20 = false;
                }
                j10 = jLongValue3;
                z11 = z20;
                i13 = -1;
                z12 = z18;
                iZzg = iZzg2;
                zzbuVar = zzbuVar2;
                obj = obj2;
                z10 = z19;
            } else {
                zzurVar = zzurVar2;
                if (zzlgVar.zza.zzo()) {
                    iZzg = zzbvVar.zzg(z24);
                    zzbuVar = zzbuVar2;
                    obj = obj4;
                } else if (zzbvVar.zza(obj4) == -1) {
                    int iZzb = zzb(zzbuVar2, zzbtVar, i11, z24, obj4, zzlgVar.zza, zzbvVar);
                    zzbuVar = zzbuVar2;
                    if (iZzb == -1) {
                        zzbtVar = zzbtVar;
                        iZzb = zzbvVar.zzg(z24);
                        z13 = true;
                    } else {
                        zzbtVar = zzbtVar;
                        z13 = false;
                    }
                    z11 = z13;
                    obj = obj4;
                    j10 = j10;
                    i13 = -1;
                    z10 = false;
                    z12 = false;
                    iZzg = iZzb;
                } else {
                    zzbuVar = zzbuVar2;
                    if (j10 == j4) {
                        iZzg = zzbvVar.zzn(obj4, zzbtVar).zzc;
                        obj = obj4;
                    } else if (zZzai) {
                        zzlgVar.zza.zzn(zzurVar.zza, zzbtVar);
                        if (zzlgVar.zza.zze(zzbtVar.zzc, zzbuVar, 0L).zzn == zzlgVar.zza.zza(zzurVar.zza)) {
                            Pair pairZzl = zzbvVar.zzl(zzbuVar, zzbtVar, zzbvVar.zzn(obj4, zzbtVar).zzc, j10);
                            obj = pairZzl.first;
                            jLongValue = ((Long) pairZzl.second).longValue();
                        } else {
                            obj = obj4;
                            jLongValue = j10;
                        }
                        j10 = jLongValue;
                        iZzg = -1;
                        i13 = -1;
                        z10 = false;
                        z11 = false;
                        z12 = true;
                    } else {
                        obj = obj4;
                        j10 = j10;
                        iZzg = -1;
                        i13 = -1;
                        z10 = false;
                        z11 = false;
                        z12 = false;
                    }
                }
                z10 = false;
                z11 = false;
                z12 = false;
            }
            if (iZzg != i13) {
                zzbvVar2 = zzbvVar;
                Pair pairZzl2 = zzbvVar2.zzl(zzbuVar, zzbtVar, iZzg, -9223372036854775807L);
                obj = pairZzl2.first;
                jLongValue2 = ((Long) pairZzl2.second).longValue();
                j10 = j4;
            } else {
                zzbvVar2 = zzbvVar;
                jLongValue2 = j10;
            }
            zzur zzurVarZzi = this.zzs.zzi(zzbvVar2, obj, jLongValue2);
            int i14 = zzurVarZzi.zze;
            r11 = -1;
            boolean z25 = zzurVar.zza.equals(obj) && !zzurVar.zzb() && !zzurVarZzi.zzb() && (i14 == -1 || ((i = zzurVar.zze) != -1 && i14 >= i));
            zzbt zzbtVarZzn = zzbvVar2.zzn(obj, zzbtVar);
            if (!zZzai && j10 == j10 && zzurVar.zza.equals(zzurVarZzi.zza)) {
                if (zzurVar.zzb()) {
                    zzbtVarZzn.zzk(zzurVar.zzb);
                }
                if (zzurVarZzi.zzb()) {
                    zzbtVarZzn.zzk(zzurVarZzi.zzb);
                }
            }
            if (true == z25) {
                zzurVarZzi = zzurVar;
            }
            if (zzurVarZzi.zzb()) {
                if (zzurVarZzi.equals(zzurVar)) {
                    jLongValue2 = zzlgVar.zzs;
                } else {
                    zzbvVar2.zzn(zzurVarZzi.zza, zzbtVar);
                    if (zzurVarZzi.zzc == zzbtVar.zze(zzurVarZzi.zzb)) {
                        zzbtVar.zzh();
                    }
                    jLongValue2 = 0;
                }
            }
            jZzv = jLongValue2;
            zzurVarZzh = zzurVarZzi;
            z14 = z10;
            z15 = z11;
            z16 = z12;
        }
        boolean z26 = (this.zzz.zzb.equals(zzurVarZzh) && jZzv == this.zzz.zzs) ? false : true;
        int i15 = 2;
        if (z15) {
            try {
                if (this.zzz.zze != 1) {
                    try {
                        zzV(4);
                    } catch (Throwable th) {
                        th = th;
                        i12 = 2;
                        z22 = z16;
                        z21 = false;
                        r25 = 0;
                        zzlg zzlgVar2 = this.zzz;
                        zzbv zzbvVar3 = zzlgVar2.zza;
                        zzur zzurVar3 = zzlgVar2.zzb;
                        if (true != z22) {
                            j11 = j4;
                        } else {
                            j11 = jZzv;
                        }
                        zzac(zzbvVar, zzurVarZzh, zzbvVar3, zzurVar3, j11, false);
                        if (z26) {
                            zzlg zzlgVar3 = this.zzz;
                            obj3 = zzlgVar3.zzb.zza;
                            zzbv zzbvVar4 = zzlgVar3.zza;
                            if (z26) {
                                z23 = z21;
                            } else {
                                z23 = z21;
                            }
                            long j15 = this.zzz.zzd;
                            if (zzbvVar.zza(obj3) == -1) {
                                i10 = 4;
                            } else {
                                i10 = 3;
                            }
                            this.zzz = zzz(zzurVarZzh, jZzv, j10, j15, z23, i10);
                        } else {
                            zzlg zzlgVar4 = this.zzz;
                            obj3 = zzlgVar4.zzb.zza;
                            zzbv zzbvVar5 = zzlgVar4.zza;
                            if (z26) {
                                z23 = z21;
                            } else {
                                z23 = z21;
                            }
                            long j16 = this.zzz.zzd;
                            if (zzbvVar.zza(obj3) == -1) {
                                i10 = 4;
                            } else {
                                i10 = 3;
                            }
                            this.zzz = zzz(zzurVarZzh, jZzv, j10, j16, z23, i10);
                        }
                        zzO();
                        zzQ(r2, this.zzz.zza);
                        this.zzz = this.zzz.zzf(r2);
                        if (!zzbvVar.zzo()) {
                            this.zzL = r25;
                        }
                        zzE(z21);
                        this.zzj.zzi(i12);
                        throw th;
                    }
                }
                z21 = false;
                try {
                    zzN(false, false, false, true);
                } catch (Throwable th2) {
                    th = th2;
                    i12 = 2;
                    z22 = z16;
                    r25 = 0;
                    zzlg zzlgVar5 = this.zzz;
                    zzbv zzbvVar6 = zzlgVar5.zza;
                    zzur zzurVar4 = zzlgVar5.zzb;
                    if (true != z22) {
                        j11 = j4;
                    } else {
                        j11 = jZzv;
                    }
                    zzac(zzbvVar, zzurVarZzh, zzbvVar6, zzurVar4, j11, false);
                    if (z26 || j10 != this.zzz.zzc) {
                        zzlg zzlgVar6 = this.zzz;
                        obj3 = zzlgVar6.zzb.zza;
                        zzbv zzbvVar7 = zzlgVar6.zza;
                        if (z26 || !z4 || zzbvVar7.zzo() || zzbvVar7.zzn(obj3, this.zzn).zzf) {
                            z23 = z21;
                        } else {
                            z23 = true;
                        }
                        long j17 = this.zzz.zzd;
                        if (zzbvVar.zza(obj3) == -1) {
                            i10 = 4;
                        } else {
                            i10 = 3;
                        }
                        this.zzz = zzz(zzurVarZzh, jZzv, j10, j17, z23, i10);
                    }
                    zzO();
                    zzQ(r2, this.zzz.zza);
                    this.zzz = this.zzz.zzf(r2);
                    if (!zzbvVar.zzo()) {
                        this.zzL = r25;
                    }
                    zzE(z21);
                    this.zzj.zzi(i12);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                z21 = false;
                i12 = 2;
                z22 = z16;
                r25 = 0;
                zzlg zzlgVar7 = this.zzz;
                zzbv zzbvVar8 = zzlgVar7.zza;
                zzur zzurVar5 = zzlgVar7.zzb;
                if (true != z22) {
                    j11 = j4;
                } else {
                    j11 = jZzv;
                }
                zzac(zzbvVar, zzurVarZzh, zzbvVar8, zzurVar5, j11, false);
                if (z26) {
                    zzlg zzlgVar8 = this.zzz;
                    obj3 = zzlgVar8.zzb.zza;
                    zzbv zzbvVar9 = zzlgVar8.zza;
                    if (z26) {
                        z23 = z21;
                    } else {
                        z23 = z21;
                    }
                    long j18 = this.zzz.zzd;
                    if (zzbvVar.zza(obj3) == -1) {
                        i10 = 4;
                    } else {
                        i10 = 3;
                    }
                    this.zzz = zzz(zzurVarZzh, jZzv, j10, j18, z23, i10);
                } else {
                    zzlg zzlgVar9 = this.zzz;
                    obj3 = zzlgVar9.zzb.zza;
                    zzbv zzbvVar10 = zzlgVar9.zza;
                    if (z26) {
                        z23 = z21;
                    } else {
                        z23 = z21;
                    }
                    long j19 = this.zzz.zzd;
                    if (zzbvVar.zza(obj3) == -1) {
                        i10 = 4;
                    } else {
                        i10 = 3;
                    }
                    this.zzz = zzz(zzurVarZzh, jZzv, j10, j19, z23, i10);
                }
                zzO();
                zzQ(r2, this.zzz.zza);
                this.zzz = this.zzz.zzf(r2);
                if (!zzbvVar.zzo()) {
                    this.zzL = r25;
                }
                zzE(z21);
                this.zzj.zzi(i12);
                throw th;
            }
        } else {
            z21 = false;
        }
        zzln[] zzlnVarArr = this.zzb;
        int length = zzlnVarArr.length;
        for (?? r10 = z21; r10 < 2; r10++) {
            zzlnVarArr[r10].zzN(zzbvVar2);
        }
        try {
            if (z26) {
                i12 = 2;
                z12 = z16;
                zzkfVar = null;
                zzkfVar = null;
                if (!zzbvVar2.zzo()) {
                    for (zzkq zzkqVarZze = this.zzs.zze(); zzkqVarZze != null; zzkqVarZze = zzkqVarZze.zzg()) {
                        if (zzkqVarZze.zzf.zza.equals(zzurVarZzh)) {
                            zzkqVarZze.zzf = this.zzs.zzh(zzbvVar2, zzkqVarZze.zzf);
                            zzkqVarZze.zzq();
                        }
                    }
                    jZzv = zzv(zzurVarZzh, jZzv, z14);
                }
            } else {
                try {
                    zzkt zzktVar = this.zzs;
                    long j20 = this.zzM;
                    zzkq zzkqVarZzf = zzktVar.zzf();
                    if (zzkqVarZzf == null) {
                        i12 = 2;
                        j12 = j20;
                        z12 = z16;
                        j13 = 0;
                    } else {
                        long jZze = zzkqVarZzf.zze();
                        z12 = z16;
                        if (zzkqVarZzf.zzd) {
                            ?? r12 = z21;
                            long jMax = jZze;
                            while (true) {
                                try {
                                    zzln[] zzlnVarArr2 = this.zzb;
                                    int length2 = zzlnVarArr2.length;
                                    if (r12 >= i15) {
                                        long j21 = jMax;
                                        i12 = i15;
                                        j12 = j20;
                                        j13 = j21;
                                        break;
                                    }
                                    if (zzag(zzlnVarArr2[r12]) && this.zzb[r12].zzp() == zzkqVarZzf.zzc[r12]) {
                                        j14 = j20;
                                        long jZzcX = this.zzb[r12].zzcX();
                                        if (jZzcX == Long.MIN_VALUE) {
                                            j13 = Long.MIN_VALUE;
                                            j12 = j14;
                                            i12 = 2;
                                            break;
                                        }
                                        jMax = Math.max(jZzcX, jMax);
                                    } else {
                                        j14 = j20;
                                    }
                                    j20 = j14;
                                    i15 = 2;
                                    r12++;
                                } catch (Throwable th4) {
                                    th = th4;
                                    z22 = z12;
                                    i12 = 2;
                                    r25 = 0;
                                    zzlg zzlgVar10 = this.zzz;
                                    zzbv zzbvVar11 = zzlgVar10.zza;
                                    zzur zzurVar6 = zzlgVar10.zzb;
                                    if (true != z22) {
                                        j11 = j4;
                                    } else {
                                        j11 = jZzv;
                                    }
                                    zzac(zzbvVar, zzurVarZzh, zzbvVar11, zzurVar6, j11, false);
                                    if (z26) {
                                        zzlg zzlgVar11 = this.zzz;
                                        obj3 = zzlgVar11.zzb.zza;
                                        zzbv zzbvVar12 = zzlgVar11.zza;
                                        if (z26) {
                                            z23 = z21;
                                        } else {
                                            z23 = z21;
                                        }
                                        long j110 = this.zzz.zzd;
                                        if (zzbvVar.zza(obj3) == -1) {
                                            i10 = 4;
                                        } else {
                                            i10 = 3;
                                        }
                                        this.zzz = zzz(zzurVarZzh, jZzv, j10, j110, z23, i10);
                                    } else {
                                        zzlg zzlgVar12 = this.zzz;
                                        obj3 = zzlgVar12.zzb.zza;
                                        zzbv zzbvVar13 = zzlgVar12.zza;
                                        if (z26) {
                                            z23 = z21;
                                        } else {
                                            z23 = z21;
                                        }
                                        long j111 = this.zzz.zzd;
                                        if (zzbvVar.zza(obj3) == -1) {
                                            i10 = 4;
                                        } else {
                                            i10 = 3;
                                        }
                                        this.zzz = zzz(zzurVarZzh, jZzv, j10, j111, z23, i10);
                                    }
                                    zzO();
                                    zzQ(r2, this.zzz.zza);
                                    this.zzz = this.zzz.zzf(r2);
                                    if (!zzbvVar.zzo()) {
                                        this.zzL = r25;
                                    }
                                    zzE(z21);
                                    this.zzj.zzi(i12);
                                    throw th;
                                }
                            }
                        } else {
                            i12 = 2;
                            j12 = j20;
                            j13 = jZze;
                        }
                    }
                    r11 = 0;
                    zzkfVar = null;
                    zzkfVar = null;
                    try {
                        boolean zZzs = zzktVar.zzs(zzbvVar, j12, j13);
                        zzbvVar2 = zzbvVar;
                        if (!zZzs) {
                            zzS(z21);
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        zzurVarZzh = zzurVarZzh;
                        r25 = r11;
                        z22 = z12;
                        zzlg zzlgVar13 = this.zzz;
                        zzbv zzbvVar14 = zzlgVar13.zza;
                        zzur zzurVar7 = zzlgVar13.zzb;
                        if (true != z22) {
                            j11 = j4;
                        } else {
                            j11 = jZzv;
                        }
                        zzac(zzbvVar, zzurVarZzh, zzbvVar14, zzurVar7, j11, false);
                        if (z26) {
                            zzlg zzlgVar14 = this.zzz;
                            obj3 = zzlgVar14.zzb.zza;
                            zzbv zzbvVar15 = zzlgVar14.zza;
                            if (z26) {
                                z23 = z21;
                            } else {
                                z23 = z21;
                            }
                            long j112 = this.zzz.zzd;
                            if (zzbvVar.zza(obj3) == -1) {
                                i10 = 4;
                            } else {
                                i10 = 3;
                            }
                            this.zzz = zzz(zzurVarZzh, jZzv, j10, j112, z23, i10);
                        } else {
                            zzlg zzlgVar15 = this.zzz;
                            obj3 = zzlgVar15.zzb.zza;
                            zzbv zzbvVar16 = zzlgVar15.zza;
                            if (z26) {
                                z23 = z21;
                            } else {
                                z23 = z21;
                            }
                            long j113 = this.zzz.zzd;
                            if (zzbvVar.zza(obj3) == -1) {
                                i10 = 4;
                            } else {
                                i10 = 3;
                            }
                            this.zzz = zzz(zzurVarZzh, jZzv, j10, j113, z23, i10);
                        }
                        zzO();
                        zzQ(r2, this.zzz.zza);
                        this.zzz = this.zzz.zzf(r2);
                        if (!zzbvVar.zzo()) {
                            this.zzL = r25;
                        }
                        zzE(z21);
                        this.zzj.zzi(i12);
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    i12 = 2;
                    z12 = z16;
                    r11 = 0;
                }
            }
            zzlg zzlgVar16 = this.zzz;
            zzur zzurVar8 = zzurVarZzh;
            zzac(zzbvVar2, zzurVar8, zzlgVar16.zza, zzlgVar16.zzb, true != z12 ? j4 : jZzv, false);
            if (z26 || j10 != this.zzz.zzc) {
                zzlg zzlgVar17 = this.zzz;
                Object obj7 = zzlgVar17.zzb.zza;
                zzbv zzbvVar17 = zzlgVar17.zza;
                this.zzz = zzz(zzurVar8, jZzv, j10, this.zzz.zzd, (!z26 || !z4 || zzbvVar17.zzo() || zzbvVar17.zzn(obj7, this.zzn).zzf) ? z21 : true, zzbvVar2.zza(obj7) == -1 ? 4 : 3);
            }
            zzO();
            zzQ(zzbvVar2, this.zzz.zza);
            this.zzz = this.zzz.zzf(zzbvVar2);
            if (!zzbvVar2.zzo()) {
                this.zzL = zzkfVar;
            }
            zzE(z21);
            this.zzj.zzi(i12);
        } catch (Throwable th7) {
            th = th7;
        }
    }

    private final void zzG(zzbj zzbjVar, boolean z4) throws zzig {
        zzH(zzbjVar, zzbjVar.zzb, true, z4);
    }

    private final void zzH(zzbj zzbjVar, float f10, boolean z4, boolean z10) throws zzig {
        zzbj zzbjVar2;
        int i;
        if (z4) {
            if (z10) {
                this.zzA.zza(1);
            }
            zzlg zzlgVar = this.zzz;
            zzlg zzlgVar2 = new zzlg(zzlgVar.zza, zzlgVar.zzb, zzlgVar.zzc, zzlgVar.zzd, zzlgVar.zze, zzlgVar.zzf, zzlgVar.zzg, zzlgVar.zzh, zzlgVar.zzi, zzlgVar.zzj, zzlgVar.zzk, zzlgVar.zzl, zzlgVar.zzm, zzlgVar.zzn, zzbjVar, zzlgVar.zzq, zzlgVar.zzr, zzlgVar.zzs, zzlgVar.zzt, false);
            zzbjVar2 = zzbjVar;
            this.zzz = zzlgVar2;
        } else {
            zzbjVar2 = zzbjVar;
        }
        float f11 = zzbjVar2.zzb;
        zzkq zzkqVarZze = this.zzs.zze();
        while (true) {
            i = 0;
            if (zzkqVarZze == null) {
                break;
            }
            zzyd[] zzydVarArr = zzkqVarZze.zzi().zzc;
            int length = zzydVarArr.length;
            while (i < length) {
                zzyd zzydVar = zzydVarArr[i];
                i++;
            }
            zzkqVarZze = zzkqVarZze.zzg();
        }
        zzln[] zzlnVarArr = this.zzb;
        int length2 = zzlnVarArr.length;
        while (i < 2) {
            zzln zzlnVar = zzlnVarArr[i];
            if (zzlnVar != null) {
                zzlnVar.zzM(f10, zzbjVar2.zzb);
            }
            i++;
        }
    }

    private final void zzI() {
        long jZze;
        long jZze2;
        boolean zZzh = false;
        if (zzaf()) {
            zzkq zzkqVarZzd = this.zzs.zzd();
            long jZzu = zzu(zzkqVarZzd.zzd());
            if (zzkqVarZzd == this.zzs.zze()) {
                jZze = this.zzM;
                jZze2 = zzkqVarZzd.zze();
            } else {
                jZze = this.zzM - zzkqVarZzd.zze();
                jZze2 = zzkqVarZzd.zzf.zzb;
            }
            zzkk zzkkVar = new zzkk(this.zzv, this.zzz.zza, zzkqVarZzd.zzf.zza, jZze - jZze2, jZzu, this.zzp.zzc().zzb, this.zzz.zzl, this.zzE, zzak(this.zzz.zza, zzkqVarZzd.zzf.zza) ? this.zzU.zzb() : -9223372036854775807L);
            boolean zZzh2 = this.zzh.zzh(zzkkVar);
            zzkq zzkqVarZze = this.zzs.zze();
            if (zZzh2 || !zzkqVarZze.zzd || jZzu >= 500000 || this.zzo <= 0) {
                zZzh = zZzh2;
            } else {
                zzkqVarZze.zza.zzj(this.zzz.zzs, false);
                zZzh = this.zzh.zzh(zzkkVar);
            }
        }
        this.zzG = zZzh;
        if (zZzh) {
            this.zzs.zzd().zzk(this.zzM, this.zzp.zzc().zzb, this.zzF);
        }
        zzZ();
    }

    private final void zzJ() {
        this.zzA.zzb(this.zzz);
        if (this.zzA.zze) {
            zzjd zzjdVar = this.zzT;
            zzjdVar.zza.zzO(this.zzA);
            this.zzA = new zzke(this.zzz);
        }
    }

    private final void zzK(final int i, final boolean z4) {
        boolean[] zArr = this.zze;
        if (zArr[i] != z4) {
            zArr[i] = z4;
            this.zzx.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjx
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzf(i, z4);
                }
            });
        }
    }

    private final void zzL() throws zzig {
        int i;
        int i10;
        float f10 = this.zzp.zzc().zzb;
        zzkt zzktVar = this.zzs;
        zzkq zzkqVarZze = zzktVar.zze();
        zzkq zzkqVarZzf = zzktVar.zzf();
        zzyk zzykVar = null;
        boolean z4 = true;
        while (zzkqVarZze != null && zzkqVarZze.zzd) {
            zzyk zzykVarZzj = zzkqVarZze.zzj(f10, this.zzz.zza);
            zzyk zzykVar2 = zzkqVarZze == this.zzs.zze() ? zzykVarZzj : zzykVar;
            zzyk zzykVarZzi = zzkqVarZze.zzi();
            boolean z10 = false;
            if (zzykVarZzi != null) {
                if (zzykVarZzi.zzc.length == zzykVarZzj.zzc.length) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= zzykVarZzj.zzc.length) {
                            if (zzkqVarZze != zzkqVarZzf) {
                                z10 = true;
                            }
                            z4 &= z10;
                            zzkqVarZze = zzkqVarZze.zzg();
                            zzykVar = zzykVar2;
                        } else if (zzykVarZzj.zza(zzykVarZzi, i11)) {
                            i11++;
                        }
                    }
                }
            }
            if (z4) {
                zzkt zzktVar2 = this.zzs;
                zzkq zzkqVarZze2 = zzktVar2.zze();
                boolean zZzq = zzktVar2.zzq(zzkqVarZze2);
                int length = this.zzb.length;
                boolean[] zArr = new boolean[2];
                zzykVar2.getClass();
                long jZzb = zzkqVarZze2.zzb(zzykVar2, this.zzz.zzs, zZzq, zArr);
                zzlg zzlgVar = this.zzz;
                boolean z11 = (zzlgVar.zze == 4 || jZzb == zzlgVar.zzs) ? false : true;
                zzlg zzlgVar2 = this.zzz;
                i10 = 2;
                i = 4;
                this.zzz = zzz(zzlgVar2.zzb, jZzb, zzlgVar2.zzc, zzlgVar2.zzd, z11, 5);
                if (z11) {
                    zzP(jZzb);
                }
                int length2 = this.zzb.length;
                boolean[] zArr2 = new boolean[2];
                int i12 = 0;
                while (true) {
                    zzln[] zzlnVarArr = this.zzb;
                    int length3 = zzlnVarArr.length;
                    if (i12 >= 2) {
                        break;
                    }
                    zzln zzlnVar = zzlnVarArr[i12];
                    boolean zZzag = zzag(zzlnVar);
                    zArr2[i12] = zZzag;
                    zzwg zzwgVar = zzkqVarZze2.zzc[i12];
                    if (zZzag) {
                        if (zzwgVar != zzlnVar.zzp()) {
                            zzA(i12);
                        } else if (zArr[i12]) {
                            zzlnVar.zzJ(this.zzM);
                        }
                    }
                    i12++;
                }
                zzC(zArr2, this.zzM);
            } else {
                i = 4;
                i10 = 2;
                this.zzs.zzq(zzkqVarZze);
                if (zzkqVarZze.zzd) {
                    zzkqVarZze.zza(zzykVarZzj, Math.max(zzkqVarZze.zzf.zzb, this.zzM - zzkqVarZze.zze()), false);
                }
            }
            zzE(true);
            if (this.zzz.zze != i) {
                zzI();
                zzab();
                this.zzj.zzi(i10);
                return;
            }
            return;
        }
    }

    private final void zzM() throws zzig {
        zzL();
        zzS(true);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009f A[PHI: r2 r6 r8
      0x009f: PHI (r2v2 com.google.android.gms.internal.ads.zzur) = (r2v1 com.google.android.gms.internal.ads.zzur), (r2v12 com.google.android.gms.internal.ads.zzur) binds: [B:29:0x0075, B:31:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r6v4 long) = (r6v3 long), (r6v11 long) binds: [B:29:0x0075, B:31:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r8v3 long) = (r8v2 long), (r8v8 long) binds: [B:29:0x0075, B:31:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e7 A[PHI: r0
      0x00e7: PHI (r0v11 com.google.android.gms.internal.ads.zzbv) = 
      (r0v10 com.google.android.gms.internal.ads.zzbv)
      (r0v10 com.google.android.gms.internal.ads.zzbv)
      (r0v21 com.google.android.gms.internal.ads.zzbv)
      (r0v21 com.google.android.gms.internal.ads.zzbv)
     binds: [B:35:0x00ac, B:37:0x00b0, B:39:0x00c1, B:41:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    private final void zzN(boolean z4, boolean z10, boolean z11, boolean z12) {
        zzln[] zzlnVarArr;
        boolean z13;
        zzbv zzbvVar;
        zzur zzurVar;
        this.zzj.zzf(2);
        this.zzQ = null;
        zzad(false, true);
        this.zzp.zzi();
        this.zzM = 1000000000000L;
        int i = 0;
        while (true) {
            zzlnVarArr = this.zzb;
            int length = zzlnVarArr.length;
            if (i >= 2) {
                break;
            }
            try {
                zzA(i);
            } catch (zzig | RuntimeException e) {
                zzdt.zzd("ExoPlayerImplInternal", "Disable failed.", e);
            }
            i++;
        }
        if (z4) {
            for (int i10 = 0; i10 < 2; i10++) {
                zzln zzlnVar = zzlnVarArr[i10];
                if (this.zzc.remove(zzlnVar)) {
                    try {
                        zzlnVar.zzI();
                    } catch (RuntimeException e4) {
                        zzdt.zzd("ExoPlayerImplInternal", "Reset failed.", e4);
                    }
                }
            }
        }
        this.zzK = 0;
        zzlg zzlgVar = this.zzz;
        zzur zzurVar2 = zzlgVar.zzb;
        long jLongValue = zzlgVar.zzs;
        long j4 = (this.zzz.zzb.zzb() || zzai(this.zzz, this.zzn)) ? this.zzz.zzc : this.zzz.zzs;
        if (z10) {
            this.zzL = null;
            Pair pairZzx = zzx(this.zzz.zza);
            zzurVar2 = (zzur) pairZzx.first;
            jLongValue = ((Long) pairZzx.second).longValue();
            j4 = -9223372036854775807L;
            z13 = zzurVar2.equals(this.zzz.zzb) ? false : true;
        }
        long j10 = jLongValue;
        long j11 = j4;
        this.zzs.zzj();
        this.zzG = false;
        zzbv zzbvVarZzx = this.zzz.zza;
        if (z11 && (zzbvVarZzx instanceof zzll)) {
            zzbvVarZzx = ((zzll) zzbvVarZzx).zzx(this.zzt.zzq());
            if (zzurVar2.zzb != -1) {
                zzbvVarZzx.zzn(zzurVar2.zza, this.zzn);
                zzbt zzbtVar = this.zzn;
                zzbu zzbuVar = this.zzm;
                zzbvVarZzx.zze(zzbtVar.zzc, zzbuVar, 0L);
                if (zzbuVar.zzb()) {
                    zzbvVar = zzbvVarZzx;
                    zzurVar = new zzur(zzurVar2.zza, zzurVar2.zzd);
                } else {
                    zzbvVar = zzbvVarZzx;
                    zzurVar = zzurVar2;
                }
            } else {
                zzbvVar = zzbvVarZzx;
                zzurVar = zzurVar2;
            }
        } else {
            zzbvVar = zzbvVarZzx;
            zzurVar = zzurVar2;
        }
        zzlg zzlgVar2 = this.zzz;
        int i11 = zzlgVar2.zze;
        zzig zzigVar = z12 ? null : zzlgVar2.zzf;
        zzwr zzwrVar = z13 ? zzwr.zza : zzlgVar2.zzh;
        zzyk zzykVar = z13 ? this.zzg : zzlgVar2.zzi;
        List listZzn = z13 ? zzfzo.zzn() : zzlgVar2.zzj;
        zzlg zzlgVar3 = this.zzz;
        this.zzz = new zzlg(zzbvVar, zzurVar, j11, j10, i11, zzigVar, false, zzwrVar, zzykVar, listZzn, zzurVar, zzlgVar3.zzl, zzlgVar3.zzm, zzlgVar3.zzn, zzlgVar3.zzo, j10, 0L, j10, 0L, false);
        if (z11) {
            this.zzs.zzm();
            this.zzt.zzh();
        }
    }

    private final void zzO() {
        zzkq zzkqVarZze = this.zzs.zze();
        boolean z4 = false;
        if (zzkqVarZze != null && zzkqVarZze.zzf.zzh && this.zzC) {
            z4 = true;
        }
        this.zzD = z4;
    }

    private final void zzP(long j4) throws zzig {
        zzkq zzkqVarZze = this.zzs.zze();
        long jZze = j4 + (zzkqVarZze == null ? 1000000000000L : zzkqVarZze.zze());
        this.zzM = jZze;
        this.zzp.zzf(jZze);
        zzln[] zzlnVarArr = this.zzb;
        int length = zzlnVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzln zzlnVar = zzlnVarArr[i];
            if (zzag(zzlnVar)) {
                zzlnVar.zzJ(this.zzM);
            }
        }
        for (zzkq zzkqVarZze2 = this.zzs.zze(); zzkqVarZze2 != null; zzkqVarZze2 = zzkqVarZze2.zzg()) {
            for (zzyd zzydVar : zzkqVarZze2.zzi().zzc) {
            }
        }
    }

    private final void zzQ(zzbv zzbvVar, zzbv zzbvVar2) {
        if (zzbvVar.zzo() && zzbvVar2.zzo()) {
            return;
        }
        int size = this.zzq.size() - 1;
        if (size < 0) {
            Collections.sort(this.zzq);
        } else {
            Object obj = ((zzkd) this.zzq.get(size)).zzb;
            int i = zzen.zza;
            throw null;
        }
    }

    private final void zzR(long j4) {
        this.zzj.zzj(2, j4 + ((this.zzz.zze != 3 || zzaj()) ? zza : 1000L));
    }

    private final void zzS(boolean z4) throws zzig {
        zzur zzurVar = this.zzs.zze().zzf.zza;
        long jZzw = zzw(zzurVar, this.zzz.zzs, true, false);
        if (jZzw != this.zzz.zzs) {
            zzlg zzlgVar = this.zzz;
            this.zzz = zzz(zzurVar, jZzw, zzlgVar.zzc, zzlgVar.zzd, z4, 5);
        }
    }

    private final void zzT(zzbj zzbjVar) {
        this.zzj.zzf(16);
        this.zzp.zzg(zzbjVar);
    }

    private final void zzU(boolean z4, int i, boolean z10, int i10) throws zzig {
        this.zzA.zza(z10 ? 1 : 0);
        this.zzz = this.zzz.zzc(z4, i10, i);
        zzad(false, false);
        for (zzkq zzkqVarZze = this.zzs.zze(); zzkqVarZze != null; zzkqVarZze = zzkqVarZze.zzg()) {
            for (zzyd zzydVar : zzkqVarZze.zzi().zzc) {
            }
        }
        if (!zzaj()) {
            zzY();
            zzab();
            return;
        }
        int i11 = this.zzz.zze;
        if (i11 == 3) {
            this.zzp.zzh();
            zzW();
            this.zzj.zzi(2);
        } else if (i11 == 2) {
            this.zzj.zzi(2);
        }
    }

    private final void zzV(int i) {
        zzlg zzlgVar = this.zzz;
        if (zzlgVar.zze != i) {
            if (i != 2) {
                this.zzR = -9223372036854775807L;
            }
            this.zzz = zzlgVar.zze(i);
        }
    }

    private final void zzW() throws zzig {
        zzkq zzkqVarZze = this.zzs.zze();
        if (zzkqVarZze == null) {
            return;
        }
        zzyk zzykVarZzi = zzkqVarZze.zzi();
        int i = 0;
        while (true) {
            int length = this.zzb.length;
            if (i >= 2) {
                return;
            }
            if (zzykVarZzi.zzb(i) && this.zzb[i].zzcV() == 1) {
                this.zzb[i].zzO();
            }
            i++;
        }
    }

    private final void zzX(boolean z4, boolean z10) {
        zzN(z4 || !this.zzJ, false, true, false);
        this.zzA.zza(z10 ? 1 : 0);
        this.zzh.zze(this.zzv);
        zzV(1);
    }

    private final void zzY() throws zzig {
        this.zzp.zzi();
        zzln[] zzlnVarArr = this.zzb;
        int length = zzlnVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzln zzlnVar = zzlnVarArr[i];
            if (zzag(zzlnVar)) {
                zzan(zzlnVar);
            }
        }
    }

    private final void zzZ() {
        zzkq zzkqVarZzd = this.zzs.zzd();
        boolean z4 = this.zzG || (zzkqVarZzd != null && zzkqVarZzd.zza.zzp());
        zzlg zzlgVar = this.zzz;
        if (z4 != zzlgVar.zzg) {
            this.zzz = new zzlg(zzlgVar.zza, zzlgVar.zzb, zzlgVar.zzc, zzlgVar.zzd, zzlgVar.zze, zzlgVar.zzf, z4, zzlgVar.zzh, zzlgVar.zzi, zzlgVar.zzj, zzlgVar.zzk, zzlgVar.zzl, zzlgVar.zzm, zzlgVar.zzn, zzlgVar.zzo, zzlgVar.zzq, zzlgVar.zzr, zzlgVar.zzs, zzlgVar.zzt, false);
        }
    }

    private final void zzaa(zzur zzurVar, zzwr zzwrVar, zzyk zzykVar) {
        zzbv zzbvVar = this.zzz.zza;
        zzyd[] zzydVarArr = zzykVar.zzc;
        this.zzh.zzf(this.zzv, zzbvVar, zzurVar, this.zzb, zzwrVar, zzydVarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b0, code lost:
    
        r9 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzab() throws com.google.android.gms.internal.ads.zzig {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkh.zzab():void");
    }

    private final void zzac(zzbv zzbvVar, zzur zzurVar, zzbv zzbvVar2, zzur zzurVar2, long j4, boolean z4) throws zzig {
        if (!zzak(zzbvVar, zzurVar)) {
            zzbj zzbjVar = zzurVar.zzb() ? zzbj.zza : this.zzz.zzo;
            if (this.zzp.zzc().equals(zzbjVar)) {
                return;
            }
            zzT(zzbjVar);
            zzH(this.zzz.zzo, zzbjVar.zzb, false, false);
            return;
        }
        zzbvVar.zze(zzbvVar.zzn(zzurVar.zza, this.zzn).zzc, this.zzm, 0L);
        zzia zziaVar = this.zzU;
        zzaq zzaqVar = this.zzm.zzj;
        int i = zzen.zza;
        zziaVar.zzd(zzaqVar);
        if (j4 != -9223372036854775807L) {
            this.zzU.zze(zzs(zzbvVar, zzurVar.zza, j4));
            return;
        }
        if (!Objects.equals(!zzbvVar2.zzo() ? zzbvVar2.zze(zzbvVar2.zzn(zzurVar2.zza, this.zzn).zzc, this.zzm, 0L).zzb : null, this.zzm.zzb) || z4) {
            this.zzU.zze(-9223372036854775807L);
        }
    }

    private final void zzad(boolean z4, boolean z10) {
        this.zzE = z4;
        long jElapsedRealtime = -9223372036854775807L;
        if (z4 && !z10) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.zzF = jElapsedRealtime;
    }

    private final synchronized void zzae(zzfxg zzfxgVar, long j4) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j4;
        boolean z4 = false;
        while (!Boolean.valueOf(((zzjw) zzfxgVar).zza.zzB).booleanValue() && j4 > 0) {
            try {
                wait(j4);
            } catch (InterruptedException unused) {
                z4 = true;
            }
            j4 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean zzaf() {
        zzkq zzkqVarZzd = this.zzs.zzd();
        if (zzkqVarZzd != null) {
            try {
                if (zzkqVarZzd.zzd) {
                    zzwg[] zzwgVarArr = zzkqVarZzd.zzc;
                    for (int i = 0; i < 2; i++) {
                        zzwg zzwgVar = zzwgVarArr[i];
                        if (zzwgVar != null) {
                            zzwgVar.zzd();
                        }
                    }
                } else {
                    zzkqVarZzd.zza.zzk();
                }
                return zzkqVarZzd.zzd() != Long.MIN_VALUE;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private static boolean zzag(zzln zzlnVar) {
        return zzlnVar.zzcV() != 0;
    }

    private final boolean zzah() {
        zzkq zzkqVarZze = this.zzs.zze();
        long j4 = zzkqVarZze.zzf.zze;
        if (zzkqVarZze.zzd) {
            return j4 == -9223372036854775807L || this.zzz.zzs < j4 || !zzaj();
        }
        return false;
    }

    private static boolean zzai(zzlg zzlgVar, zzbt zzbtVar) {
        zzur zzurVar = zzlgVar.zzb;
        zzbv zzbvVar = zzlgVar.zza;
        return zzbvVar.zzo() || zzbvVar.zzn(zzurVar.zza, zzbtVar).zzf;
    }

    private final boolean zzaj() {
        zzlg zzlgVar = this.zzz;
        return zzlgVar.zzl && zzlgVar.zzn == 0;
    }

    private final boolean zzak(zzbv zzbvVar, zzur zzurVar) {
        if (!zzurVar.zzb() && !zzbvVar.zzo()) {
            zzbvVar.zze(zzbvVar.zzn(zzurVar.zza, this.zzn).zzc, this.zzm, 0L);
            if (this.zzm.zzb()) {
                zzbu zzbuVar = this.zzm;
                if (zzbuVar.zzi && zzbuVar.zzf != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static zzad[] zzal(zzyd zzydVar) {
        int iZzc = zzydVar != null ? zzydVar.zzc() : 0;
        zzad[] zzadVarArr = new zzad[iZzc];
        for (int i = 0; i < iZzc; i++) {
            zzadVarArr[i] = zzydVar.zzd(i);
        }
        return zzadVarArr;
    }

    private static final void zzam(zzlj zzljVar) throws zzig {
        zzljVar.zzj();
        try {
            zzljVar.zzc().zzu(zzljVar.zza(), zzljVar.zzg());
        } finally {
            zzljVar.zzh(true);
        }
    }

    private static final void zzan(zzln zzlnVar) {
        if (zzlnVar.zzcV() == 2) {
            zzlnVar.zzP();
        }
    }

    private static final void zzao(zzln zzlnVar, long j4) {
        zzlnVar.zzK();
        if (zzlnVar instanceof zzwv) {
            throw null;
        }
    }

    public static int zzb(zzbu zzbuVar, zzbt zzbtVar, int i, boolean z4, Object obj, zzbv zzbvVar, zzbv zzbvVar2) {
        zzbv zzbvVar3 = zzbvVar;
        Object obj2 = zzbvVar3.zze(zzbvVar3.zzn(obj, zzbtVar).zzc, zzbuVar, 0L).zzb;
        for (int i10 = 0; i10 < zzbvVar2.zzc(); i10++) {
            if (zzbvVar2.zze(i10, zzbuVar, 0L).zzb.equals(obj2)) {
                return i10;
            }
        }
        int iZza = zzbvVar3.zza(obj);
        int iZzb = zzbvVar3.zzb();
        int iZza2 = -1;
        int i11 = 0;
        while (i11 < iZzb && iZza2 == -1) {
            zzbv zzbvVar4 = zzbvVar3;
            int iZzi = zzbvVar4.zzi(iZza, zzbtVar, zzbuVar, i, z4);
            if (iZzi == -1) {
                iZza2 = -1;
                break;
            }
            iZza2 = zzbvVar2.zza(zzbvVar4.zzf(iZzi));
            i11++;
            zzbvVar3 = zzbvVar4;
            iZza = iZzi;
        }
        if (iZza2 == -1) {
            return -1;
        }
        return zzbvVar2.zzd(iZza2, zzbtVar, false).zzc;
    }

    public static /* synthetic */ zzkq zzd(zzkh zzkhVar, zzkr zzkrVar, long j4) {
        zzkl zzklVar = zzkhVar.zzh;
        zzyj zzyjVar = zzkhVar.zzf;
        zzys zzysVarZzj = zzklVar.zzj();
        zzyk zzykVar = zzkhVar.zzg;
        return new zzkq(zzkhVar.zzd, j4, zzyjVar, zzysVarZzj, zzkhVar.zzt, zzkrVar, zzykVar);
    }

    public static final /* synthetic */ void zzr(zzlj zzljVar) {
        try {
            zzam(zzljVar);
        } catch (zzig e) {
            zzdt.zzd("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private final long zzs(zzbv zzbvVar, Object obj, long j4) {
        zzbvVar.zze(zzbvVar.zzn(obj, this.zzn).zzc, this.zzm, 0L);
        zzbu zzbuVar = this.zzm;
        if (zzbuVar.zzf != -9223372036854775807L && zzbuVar.zzb()) {
            zzbu zzbuVar2 = this.zzm;
            if (zzbuVar2.zzi) {
                long j10 = zzbuVar2.zzg;
                return zzen.zzs((j10 == -9223372036854775807L ? System.currentTimeMillis() : j10 + SystemClock.elapsedRealtime()) - this.zzm.zzf) - j4;
            }
        }
        return -9223372036854775807L;
    }

    private final long zzt() {
        return zzu(this.zzz.zzq);
    }

    private final long zzu(long j4) {
        zzkq zzkqVarZzd = this.zzs.zzd();
        if (zzkqVarZzd == null) {
            return 0L;
        }
        return Math.max(0L, j4 - (this.zzM - zzkqVarZzd.zze()));
    }

    private final long zzv(zzur zzurVar, long j4, boolean z4) throws zzig {
        zzkt zzktVar = this.zzs;
        return zzw(zzurVar, j4, zzktVar.zze() != zzktVar.zzf(), z4);
    }

    private final long zzw(zzur zzurVar, long j4, boolean z4, boolean z10) throws zzig {
        zzY();
        zzad(false, true);
        if (z10 || this.zzz.zze == 3) {
            zzV(2);
        }
        zzkq zzkqVarZze = this.zzs.zze();
        zzkq zzkqVarZzg = zzkqVarZze;
        while (zzkqVarZzg != null && !zzurVar.equals(zzkqVarZzg.zzf.zza)) {
            zzkqVarZzg = zzkqVarZzg.zzg();
        }
        if (z4 || zzkqVarZze != zzkqVarZzg || (zzkqVarZzg != null && zzkqVarZzg.zze() + j4 < 0)) {
            int i = 0;
            while (true) {
                int length = this.zzb.length;
                if (i >= 2) {
                    break;
                }
                zzA(i);
                i++;
            }
            if (zzkqVarZzg != null) {
                while (this.zzs.zze() != zzkqVarZzg) {
                    this.zzs.zza();
                }
                this.zzs.zzq(zzkqVarZzg);
                zzkqVarZzg.zzp(1000000000000L);
                zzB();
            }
        }
        if (zzkqVarZzg != null) {
            this.zzs.zzq(zzkqVarZzg);
            if (!zzkqVarZzg.zzd) {
                zzkqVarZzg.zzf = zzkqVarZzg.zzf.zzb(j4);
            } else if (zzkqVarZzg.zze) {
                j4 = zzkqVarZzg.zza.zze(j4);
                zzkqVarZzg.zza.zzj(j4 - this.zzo, false);
            }
            zzP(j4);
            zzI();
        } else {
            this.zzs.zzj();
            zzP(j4);
        }
        zzE(false);
        this.zzj.zzi(2);
        return j4;
    }

    private final Pair zzx(zzbv zzbvVar) {
        long j4 = 0;
        if (zzbvVar.zzo()) {
            return Pair.create(zzlg.zzh(), 0L);
        }
        Pair pairZzl = zzbvVar.zzl(this.zzm, this.zzn, zzbvVar.zzg(this.zzI), -9223372036854775807L);
        zzur zzurVarZzi = this.zzs.zzi(zzbvVar, pairZzl.first, 0L);
        long jLongValue = ((Long) pairZzl.second).longValue();
        if (zzurVarZzi.zzb()) {
            zzbvVar.zzn(zzurVarZzi.zza, this.zzn);
            if (zzurVarZzi.zzc == this.zzn.zze(zzurVarZzi.zzb)) {
                this.zzn.zzh();
            }
        } else {
            j4 = jLongValue;
        }
        return Pair.create(zzurVarZzi, Long.valueOf(j4));
    }

    private static Pair zzy(zzbv zzbvVar, zzkf zzkfVar, boolean z4, int i, boolean z10, zzbu zzbuVar, zzbt zzbtVar) {
        zzbv zzbvVar2;
        zzbv zzbvVar3 = zzkfVar.zza;
        if (zzbvVar.zzo()) {
            return null;
        }
        if (true == zzbvVar3.zzo()) {
            zzbvVar2 = zzbvVar3;
            zzbvVar2 = zzbvVar;
        }
        try {
            zzbvVar2 = zzbvVar3;
            Pair pairZzl = zzbvVar2.zzl(zzbuVar, zzbtVar, zzkfVar.zzb, zzkfVar.zzc);
            zzbv zzbvVar4 = zzbvVar2;
            if (zzbvVar.equals(zzbvVar4)) {
                return pairZzl;
            }
            if (zzbvVar.zza(pairZzl.first) != -1) {
                return (zzbvVar4.zzn(pairZzl.first, zzbtVar).zzf && zzbvVar4.zze(zzbtVar.zzc, zzbuVar, 0L).zzn == zzbvVar4.zza(pairZzl.first)) ? zzbvVar.zzl(zzbuVar, zzbtVar, zzbvVar.zzn(pairZzl.first, zzbtVar).zzc, zzkfVar.zzc) : pairZzl;
            }
            int iZzb = zzb(zzbuVar, zzbtVar, i, z10, pairZzl.first, zzbvVar4, zzbvVar);
            if (iZzb != -1) {
                return zzbvVar.zzl(zzbuVar, zzbtVar, iZzb, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    private final zzlg zzz(zzur zzurVar, long j4, long j10, long j11, boolean z4, int i) {
        List list;
        int i10 = 0;
        this.zzP = (!this.zzP && j4 == this.zzz.zzs && zzurVar.equals(this.zzz.zzb)) ? false : true;
        zzO();
        zzlg zzlgVar = this.zzz;
        zzwr zzwrVarZzh = zzlgVar.zzh;
        zzyk zzykVarZzi = zzlgVar.zzi;
        List listZzn = zzlgVar.zzj;
        if (this.zzt.zzj()) {
            zzkq zzkqVarZze = this.zzs.zze();
            zzwrVarZzh = zzkqVarZze == null ? zzwr.zza : zzkqVarZze.zzh();
            zzykVarZzi = zzkqVarZze == null ? this.zzg : zzkqVarZze.zzi();
            zzyd[] zzydVarArr = zzykVarZzi.zzc;
            zzfzl zzfzlVar = new zzfzl();
            boolean z10 = false;
            for (zzyd zzydVar : zzydVarArr) {
                if (zzydVar != null) {
                    zzbd zzbdVar = zzydVar.zzd(0).zzl;
                    if (zzbdVar == null) {
                        zzfzlVar.zzf(new zzbd(-9223372036854775807L, new zzbc[0]));
                    } else {
                        zzfzlVar.zzf(zzbdVar);
                        z10 = true;
                    }
                }
            }
            zzfzo zzfzoVarZzi = z10 ? zzfzlVar.zzi() : zzfzo.zzn();
            if (zzkqVarZze != null) {
                zzkr zzkrVar = zzkqVarZze.zzf;
                if (zzkrVar.zzc != j10) {
                    zzkqVarZze.zzf = zzkrVar.zza(j10);
                }
            }
            zzkq zzkqVarZze2 = this.zzs.zze();
            if (zzkqVarZze2 != null) {
                zzyk zzykVarZzi2 = zzkqVarZze2.zzi();
                while (true) {
                    int length = this.zzb.length;
                    if (i10 >= 2) {
                        break;
                    }
                    if (zzykVarZzi2.zzb(i10)) {
                        if (this.zzb[i10].zzb() != 1) {
                            break;
                        }
                        int i11 = zzykVarZzi2.zzb[i10].zzb;
                    }
                    i10++;
                }
            }
            list = zzfzoVarZzi;
        } else {
            if (!zzurVar.equals(this.zzz.zzb)) {
                zzykVarZzi = this.zzg;
                zzwrVarZzh = zzwr.zza;
                listZzn = zzfzo.zzn();
            }
            list = listZzn;
        }
        zzwr zzwrVar = zzwrVarZzh;
        zzyk zzykVar = zzykVarZzi;
        if (z4) {
            this.zzA.zzc(i);
        }
        return this.zzz.zzb(zzurVar, j4, j10, j11, zzt(), zzwrVar, zzykVar, list);
    }

    /* JADX WARN: Code duplicated, block: B:258:0x051c  */
    /* JADX WARN: Code duplicated, block: B:380:0x0746  */
    /* JADX WARN: Code duplicated, block: B:457:0x0887 A[Catch: RuntimeException -> 0x0043, IOException -> 0x0046, zztr -> 0x0049, zzge -> 0x004c, zzbh -> 0x004f, zzri -> 0x0052, zzig -> 0x0055, TryCatch #13 {zzbh -> 0x004f, zzge -> 0x004c, zzig -> 0x0055, zzri -> 0x0052, zztr -> 0x0049, IOException -> 0x0046, RuntimeException -> 0x0043, blocks: (B:3:0x0006, B:4:0x000f, B:6:0x0013, B:9:0x002d, B:25:0x0058, B:26:0x0068, B:27:0x007f, B:28:0x0083, B:29:0x0087, B:33:0x008e, B:35:0x0097, B:37:0x00a5, B:38:0x00ac, B:39:0x00b6, B:40:0x00ca, B:41:0x00e2, B:42:0x00f8, B:44:0x0107, B:45:0x010b, B:46:0x011c, B:48:0x012b, B:49:0x0147, B:50:0x015a, B:51:0x0163, B:53:0x0175, B:54:0x0181, B:55:0x0191, B:57:0x019d, B:60:0x01a8, B:61:0x01af, B:62:0x01ba, B:66:0x01c1, B:68:0x01c9, B:70:0x01cd, B:72:0x01d3, B:74:0x01db, B:76:0x01e3, B:77:0x01e6, B:79:0x01eb, B:85:0x01f7, B:86:0x01f8, B:90:0x01ff, B:92:0x020d, B:93:0x0210, B:94:0x0215, B:96:0x0225, B:97:0x0228, B:98:0x022d, B:99:0x0232, B:101:0x023e, B:102:0x024a, B:104:0x0256, B:106:0x0282, B:107:0x02a2, B:116:0x02cd, B:118:0x02d1, B:119:0x02d4, B:125:0x02de, B:136:0x02f1, B:137:0x02f6, B:138:0x02fe, B:142:0x0336, B:215:0x0461, B:193:0x0428, B:192:0x0424, B:223:0x0471, B:224:0x0479, B:150:0x0389, B:152:0x03a0, B:239:0x049d, B:241:0x04b8, B:244:0x04cb, B:246:0x04da, B:248:0x04e6, B:250:0x04fb, B:251:0x0500, B:252:0x0503, B:254:0x0507, B:256:0x0514, B:328:0x0669, B:330:0x0671, B:332:0x0679, B:335:0x067e, B:336:0x068a, B:338:0x068f, B:340:0x0697, B:343:0x06a7, B:345:0x06ad, B:346:0x06cb, B:348:0x06d1, B:350:0x06d7, B:352:0x06dc, B:354:0x06e0, B:394:0x079d, B:395:0x07a1, B:399:0x07ae, B:401:0x07b6, B:402:0x07bc, B:404:0x07ca, B:405:0x07e3, B:407:0x07e8, B:409:0x07f0, B:440:0x0844, B:410:0x07f6, B:412:0x0801, B:416:0x080a, B:421:0x0819, B:427:0x0826, B:429:0x082c, B:433:0x0835, B:439:0x0841, B:443:0x0855, B:445:0x085b, B:449:0x0863, B:451:0x086b, B:453:0x086f, B:454:0x0879, B:456:0x087f, B:509:0x0987, B:512:0x098e, B:514:0x0993, B:516:0x099b, B:518:0x09a9, B:519:0x09b0, B:520:0x09b3, B:522:0x09b9, B:524:0x09c2, B:526:0x09c8, B:528:0x09ce, B:535:0x09ef, B:537:0x09f5, B:541:0x09fe, B:550:0x0a14, B:547:0x0a0d, B:549:0x0a11, B:529:0x09d5, B:532:0x09e3, B:533:0x09ea, B:534:0x09eb, B:457:0x0887, B:459:0x088d, B:461:0x0891, B:488:0x0929, B:490:0x0936, B:466:0x089d, B:468:0x08a1, B:470:0x08b5, B:472:0x08c0, B:474:0x08cc, B:478:0x08d5, B:480:0x08df, B:486:0x08ea, B:491:0x0942, B:493:0x0948, B:495:0x094c, B:499:0x0955, B:501:0x0963, B:503:0x096b, B:505:0x0975, B:506:0x097a, B:507:0x097f, B:508:0x0984, B:442:0x084c, B:357:0x06ee, B:359:0x06f2, B:361:0x06fa, B:363:0x0700, B:365:0x070a, B:368:0x0710, B:369:0x0713, B:371:0x071b, B:373:0x072d, B:375:0x0735, B:377:0x073d, B:381:0x0747, B:383:0x076e, B:384:0x0771, B:385:0x077c, B:387:0x0781, B:389:0x0787, B:390:0x078e, B:393:0x079c, B:259:0x0521, B:261:0x0527, B:264:0x0530, B:267:0x053b, B:269:0x0541, B:272:0x054f, B:274:0x0555, B:276:0x0561, B:277:0x0564, B:279:0x056c, B:281:0x057a, B:283:0x05b5, B:285:0x05bf, B:287:0x05c9, B:289:0x05d1, B:290:0x05d4, B:291:0x05d7, B:293:0x05dd, B:295:0x05eb, B:297:0x05f0, B:299:0x05fa, B:301:0x0604, B:303:0x0615, B:305:0x061b, B:306:0x0626, B:307:0x0629, B:309:0x062f, B:312:0x0634, B:314:0x0639, B:316:0x0641, B:318:0x0647, B:320:0x064d, B:324:0x065b, B:326:0x0663, B:327:0x0666, B:255:0x0511, B:551:0x0a19, B:555:0x0a20, B:126:0x02df, B:128:0x02e3, B:129:0x02e6, B:132:0x02ed, B:135:0x02f0), top: B:630:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:459:0x088d A[Catch: RuntimeException -> 0x0043, IOException -> 0x0046, zztr -> 0x0049, zzge -> 0x004c, zzbh -> 0x004f, zzri -> 0x0052, zzig -> 0x0055, TryCatch #13 {zzbh -> 0x004f, zzge -> 0x004c, zzig -> 0x0055, zzri -> 0x0052, zztr -> 0x0049, IOException -> 0x0046, RuntimeException -> 0x0043, blocks: (B:3:0x0006, B:4:0x000f, B:6:0x0013, B:9:0x002d, B:25:0x0058, B:26:0x0068, B:27:0x007f, B:28:0x0083, B:29:0x0087, B:33:0x008e, B:35:0x0097, B:37:0x00a5, B:38:0x00ac, B:39:0x00b6, B:40:0x00ca, B:41:0x00e2, B:42:0x00f8, B:44:0x0107, B:45:0x010b, B:46:0x011c, B:48:0x012b, B:49:0x0147, B:50:0x015a, B:51:0x0163, B:53:0x0175, B:54:0x0181, B:55:0x0191, B:57:0x019d, B:60:0x01a8, B:61:0x01af, B:62:0x01ba, B:66:0x01c1, B:68:0x01c9, B:70:0x01cd, B:72:0x01d3, B:74:0x01db, B:76:0x01e3, B:77:0x01e6, B:79:0x01eb, B:85:0x01f7, B:86:0x01f8, B:90:0x01ff, B:92:0x020d, B:93:0x0210, B:94:0x0215, B:96:0x0225, B:97:0x0228, B:98:0x022d, B:99:0x0232, B:101:0x023e, B:102:0x024a, B:104:0x0256, B:106:0x0282, B:107:0x02a2, B:116:0x02cd, B:118:0x02d1, B:119:0x02d4, B:125:0x02de, B:136:0x02f1, B:137:0x02f6, B:138:0x02fe, B:142:0x0336, B:215:0x0461, B:193:0x0428, B:192:0x0424, B:223:0x0471, B:224:0x0479, B:150:0x0389, B:152:0x03a0, B:239:0x049d, B:241:0x04b8, B:244:0x04cb, B:246:0x04da, B:248:0x04e6, B:250:0x04fb, B:251:0x0500, B:252:0x0503, B:254:0x0507, B:256:0x0514, B:328:0x0669, B:330:0x0671, B:332:0x0679, B:335:0x067e, B:336:0x068a, B:338:0x068f, B:340:0x0697, B:343:0x06a7, B:345:0x06ad, B:346:0x06cb, B:348:0x06d1, B:350:0x06d7, B:352:0x06dc, B:354:0x06e0, B:394:0x079d, B:395:0x07a1, B:399:0x07ae, B:401:0x07b6, B:402:0x07bc, B:404:0x07ca, B:405:0x07e3, B:407:0x07e8, B:409:0x07f0, B:440:0x0844, B:410:0x07f6, B:412:0x0801, B:416:0x080a, B:421:0x0819, B:427:0x0826, B:429:0x082c, B:433:0x0835, B:439:0x0841, B:443:0x0855, B:445:0x085b, B:449:0x0863, B:451:0x086b, B:453:0x086f, B:454:0x0879, B:456:0x087f, B:509:0x0987, B:512:0x098e, B:514:0x0993, B:516:0x099b, B:518:0x09a9, B:519:0x09b0, B:520:0x09b3, B:522:0x09b9, B:524:0x09c2, B:526:0x09c8, B:528:0x09ce, B:535:0x09ef, B:537:0x09f5, B:541:0x09fe, B:550:0x0a14, B:547:0x0a0d, B:549:0x0a11, B:529:0x09d5, B:532:0x09e3, B:533:0x09ea, B:534:0x09eb, B:457:0x0887, B:459:0x088d, B:461:0x0891, B:488:0x0929, B:490:0x0936, B:466:0x089d, B:468:0x08a1, B:470:0x08b5, B:472:0x08c0, B:474:0x08cc, B:478:0x08d5, B:480:0x08df, B:486:0x08ea, B:491:0x0942, B:493:0x0948, B:495:0x094c, B:499:0x0955, B:501:0x0963, B:503:0x096b, B:505:0x0975, B:506:0x097a, B:507:0x097f, B:508:0x0984, B:442:0x084c, B:357:0x06ee, B:359:0x06f2, B:361:0x06fa, B:363:0x0700, B:365:0x070a, B:368:0x0710, B:369:0x0713, B:371:0x071b, B:373:0x072d, B:375:0x0735, B:377:0x073d, B:381:0x0747, B:383:0x076e, B:384:0x0771, B:385:0x077c, B:387:0x0781, B:389:0x0787, B:390:0x078e, B:393:0x079c, B:259:0x0521, B:261:0x0527, B:264:0x0530, B:267:0x053b, B:269:0x0541, B:272:0x054f, B:274:0x0555, B:276:0x0561, B:277:0x0564, B:279:0x056c, B:281:0x057a, B:283:0x05b5, B:285:0x05bf, B:287:0x05c9, B:289:0x05d1, B:290:0x05d4, B:291:0x05d7, B:293:0x05dd, B:295:0x05eb, B:297:0x05f0, B:299:0x05fa, B:301:0x0604, B:303:0x0615, B:305:0x061b, B:306:0x0626, B:307:0x0629, B:309:0x062f, B:312:0x0634, B:314:0x0639, B:316:0x0641, B:318:0x0647, B:320:0x064d, B:324:0x065b, B:326:0x0663, B:327:0x0666, B:255:0x0511, B:551:0x0a19, B:555:0x0a20, B:126:0x02df, B:128:0x02e3, B:129:0x02e6, B:132:0x02ed, B:135:0x02f0), top: B:630:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:461:0x0891 A[Catch: RuntimeException -> 0x0043, IOException -> 0x0046, zztr -> 0x0049, zzge -> 0x004c, zzbh -> 0x004f, zzri -> 0x0052, zzig -> 0x0055, TryCatch #13 {zzbh -> 0x004f, zzge -> 0x004c, zzig -> 0x0055, zzri -> 0x0052, zztr -> 0x0049, IOException -> 0x0046, RuntimeException -> 0x0043, blocks: (B:3:0x0006, B:4:0x000f, B:6:0x0013, B:9:0x002d, B:25:0x0058, B:26:0x0068, B:27:0x007f, B:28:0x0083, B:29:0x0087, B:33:0x008e, B:35:0x0097, B:37:0x00a5, B:38:0x00ac, B:39:0x00b6, B:40:0x00ca, B:41:0x00e2, B:42:0x00f8, B:44:0x0107, B:45:0x010b, B:46:0x011c, B:48:0x012b, B:49:0x0147, B:50:0x015a, B:51:0x0163, B:53:0x0175, B:54:0x0181, B:55:0x0191, B:57:0x019d, B:60:0x01a8, B:61:0x01af, B:62:0x01ba, B:66:0x01c1, B:68:0x01c9, B:70:0x01cd, B:72:0x01d3, B:74:0x01db, B:76:0x01e3, B:77:0x01e6, B:79:0x01eb, B:85:0x01f7, B:86:0x01f8, B:90:0x01ff, B:92:0x020d, B:93:0x0210, B:94:0x0215, B:96:0x0225, B:97:0x0228, B:98:0x022d, B:99:0x0232, B:101:0x023e, B:102:0x024a, B:104:0x0256, B:106:0x0282, B:107:0x02a2, B:116:0x02cd, B:118:0x02d1, B:119:0x02d4, B:125:0x02de, B:136:0x02f1, B:137:0x02f6, B:138:0x02fe, B:142:0x0336, B:215:0x0461, B:193:0x0428, B:192:0x0424, B:223:0x0471, B:224:0x0479, B:150:0x0389, B:152:0x03a0, B:239:0x049d, B:241:0x04b8, B:244:0x04cb, B:246:0x04da, B:248:0x04e6, B:250:0x04fb, B:251:0x0500, B:252:0x0503, B:254:0x0507, B:256:0x0514, B:328:0x0669, B:330:0x0671, B:332:0x0679, B:335:0x067e, B:336:0x068a, B:338:0x068f, B:340:0x0697, B:343:0x06a7, B:345:0x06ad, B:346:0x06cb, B:348:0x06d1, B:350:0x06d7, B:352:0x06dc, B:354:0x06e0, B:394:0x079d, B:395:0x07a1, B:399:0x07ae, B:401:0x07b6, B:402:0x07bc, B:404:0x07ca, B:405:0x07e3, B:407:0x07e8, B:409:0x07f0, B:440:0x0844, B:410:0x07f6, B:412:0x0801, B:416:0x080a, B:421:0x0819, B:427:0x0826, B:429:0x082c, B:433:0x0835, B:439:0x0841, B:443:0x0855, B:445:0x085b, B:449:0x0863, B:451:0x086b, B:453:0x086f, B:454:0x0879, B:456:0x087f, B:509:0x0987, B:512:0x098e, B:514:0x0993, B:516:0x099b, B:518:0x09a9, B:519:0x09b0, B:520:0x09b3, B:522:0x09b9, B:524:0x09c2, B:526:0x09c8, B:528:0x09ce, B:535:0x09ef, B:537:0x09f5, B:541:0x09fe, B:550:0x0a14, B:547:0x0a0d, B:549:0x0a11, B:529:0x09d5, B:532:0x09e3, B:533:0x09ea, B:534:0x09eb, B:457:0x0887, B:459:0x088d, B:461:0x0891, B:488:0x0929, B:490:0x0936, B:466:0x089d, B:468:0x08a1, B:470:0x08b5, B:472:0x08c0, B:474:0x08cc, B:478:0x08d5, B:480:0x08df, B:486:0x08ea, B:491:0x0942, B:493:0x0948, B:495:0x094c, B:499:0x0955, B:501:0x0963, B:503:0x096b, B:505:0x0975, B:506:0x097a, B:507:0x097f, B:508:0x0984, B:442:0x084c, B:357:0x06ee, B:359:0x06f2, B:361:0x06fa, B:363:0x0700, B:365:0x070a, B:368:0x0710, B:369:0x0713, B:371:0x071b, B:373:0x072d, B:375:0x0735, B:377:0x073d, B:381:0x0747, B:383:0x076e, B:384:0x0771, B:385:0x077c, B:387:0x0781, B:389:0x0787, B:390:0x078e, B:393:0x079c, B:259:0x0521, B:261:0x0527, B:264:0x0530, B:267:0x053b, B:269:0x0541, B:272:0x054f, B:274:0x0555, B:276:0x0561, B:277:0x0564, B:279:0x056c, B:281:0x057a, B:283:0x05b5, B:285:0x05bf, B:287:0x05c9, B:289:0x05d1, B:290:0x05d4, B:291:0x05d7, B:293:0x05dd, B:295:0x05eb, B:297:0x05f0, B:299:0x05fa, B:301:0x0604, B:303:0x0615, B:305:0x061b, B:306:0x0626, B:307:0x0629, B:309:0x062f, B:312:0x0634, B:314:0x0639, B:316:0x0641, B:318:0x0647, B:320:0x064d, B:324:0x065b, B:326:0x0663, B:327:0x0666, B:255:0x0511, B:551:0x0a19, B:555:0x0a20, B:126:0x02df, B:128:0x02e3, B:129:0x02e6, B:132:0x02ed, B:135:0x02f0), top: B:630:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:463:0x0897  */
    /* JADX WARN: Code duplicated, block: B:464:0x0899  */
    /* JADX WARN: Code duplicated, block: B:465:0x089b  */
    /* JADX WARN: Code duplicated, block: B:466:0x089d A[Catch: RuntimeException -> 0x0043, IOException -> 0x0046, zztr -> 0x0049, zzge -> 0x004c, zzbh -> 0x004f, zzri -> 0x0052, zzig -> 0x0055, TryCatch #13 {zzbh -> 0x004f, zzge -> 0x004c, zzig -> 0x0055, zzri -> 0x0052, zztr -> 0x0049, IOException -> 0x0046, RuntimeException -> 0x0043, blocks: (B:3:0x0006, B:4:0x000f, B:6:0x0013, B:9:0x002d, B:25:0x0058, B:26:0x0068, B:27:0x007f, B:28:0x0083, B:29:0x0087, B:33:0x008e, B:35:0x0097, B:37:0x00a5, B:38:0x00ac, B:39:0x00b6, B:40:0x00ca, B:41:0x00e2, B:42:0x00f8, B:44:0x0107, B:45:0x010b, B:46:0x011c, B:48:0x012b, B:49:0x0147, B:50:0x015a, B:51:0x0163, B:53:0x0175, B:54:0x0181, B:55:0x0191, B:57:0x019d, B:60:0x01a8, B:61:0x01af, B:62:0x01ba, B:66:0x01c1, B:68:0x01c9, B:70:0x01cd, B:72:0x01d3, B:74:0x01db, B:76:0x01e3, B:77:0x01e6, B:79:0x01eb, B:85:0x01f7, B:86:0x01f8, B:90:0x01ff, B:92:0x020d, B:93:0x0210, B:94:0x0215, B:96:0x0225, B:97:0x0228, B:98:0x022d, B:99:0x0232, B:101:0x023e, B:102:0x024a, B:104:0x0256, B:106:0x0282, B:107:0x02a2, B:116:0x02cd, B:118:0x02d1, B:119:0x02d4, B:125:0x02de, B:136:0x02f1, B:137:0x02f6, B:138:0x02fe, B:142:0x0336, B:215:0x0461, B:193:0x0428, B:192:0x0424, B:223:0x0471, B:224:0x0479, B:150:0x0389, B:152:0x03a0, B:239:0x049d, B:241:0x04b8, B:244:0x04cb, B:246:0x04da, B:248:0x04e6, B:250:0x04fb, B:251:0x0500, B:252:0x0503, B:254:0x0507, B:256:0x0514, B:328:0x0669, B:330:0x0671, B:332:0x0679, B:335:0x067e, B:336:0x068a, B:338:0x068f, B:340:0x0697, B:343:0x06a7, B:345:0x06ad, B:346:0x06cb, B:348:0x06d1, B:350:0x06d7, B:352:0x06dc, B:354:0x06e0, B:394:0x079d, B:395:0x07a1, B:399:0x07ae, B:401:0x07b6, B:402:0x07bc, B:404:0x07ca, B:405:0x07e3, B:407:0x07e8, B:409:0x07f0, B:440:0x0844, B:410:0x07f6, B:412:0x0801, B:416:0x080a, B:421:0x0819, B:427:0x0826, B:429:0x082c, B:433:0x0835, B:439:0x0841, B:443:0x0855, B:445:0x085b, B:449:0x0863, B:451:0x086b, B:453:0x086f, B:454:0x0879, B:456:0x087f, B:509:0x0987, B:512:0x098e, B:514:0x0993, B:516:0x099b, B:518:0x09a9, B:519:0x09b0, B:520:0x09b3, B:522:0x09b9, B:524:0x09c2, B:526:0x09c8, B:528:0x09ce, B:535:0x09ef, B:537:0x09f5, B:541:0x09fe, B:550:0x0a14, B:547:0x0a0d, B:549:0x0a11, B:529:0x09d5, B:532:0x09e3, B:533:0x09ea, B:534:0x09eb, B:457:0x0887, B:459:0x088d, B:461:0x0891, B:488:0x0929, B:490:0x0936, B:466:0x089d, B:468:0x08a1, B:470:0x08b5, B:472:0x08c0, B:474:0x08cc, B:478:0x08d5, B:480:0x08df, B:486:0x08ea, B:491:0x0942, B:493:0x0948, B:495:0x094c, B:499:0x0955, B:501:0x0963, B:503:0x096b, B:505:0x0975, B:506:0x097a, B:507:0x097f, B:508:0x0984, B:442:0x084c, B:357:0x06ee, B:359:0x06f2, B:361:0x06fa, B:363:0x0700, B:365:0x070a, B:368:0x0710, B:369:0x0713, B:371:0x071b, B:373:0x072d, B:375:0x0735, B:377:0x073d, B:381:0x0747, B:383:0x076e, B:384:0x0771, B:385:0x077c, B:387:0x0781, B:389:0x0787, B:390:0x078e, B:393:0x079c, B:259:0x0521, B:261:0x0527, B:264:0x0530, B:267:0x053b, B:269:0x0541, B:272:0x054f, B:274:0x0555, B:276:0x0561, B:277:0x0564, B:279:0x056c, B:281:0x057a, B:283:0x05b5, B:285:0x05bf, B:287:0x05c9, B:289:0x05d1, B:290:0x05d4, B:291:0x05d7, B:293:0x05dd, B:295:0x05eb, B:297:0x05f0, B:299:0x05fa, B:301:0x0604, B:303:0x0615, B:305:0x061b, B:306:0x0626, B:307:0x0629, B:309:0x062f, B:312:0x0634, B:314:0x0639, B:316:0x0641, B:318:0x0647, B:320:0x064d, B:324:0x065b, B:326:0x0663, B:327:0x0666, B:255:0x0511, B:551:0x0a19, B:555:0x0a20, B:126:0x02df, B:128:0x02e3, B:129:0x02e6, B:132:0x02ed, B:135:0x02f0), top: B:630:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:468:0x08a1 A[Catch: RuntimeException -> 0x0043, IOException -> 0x0046, zztr -> 0x0049, zzge -> 0x004c, zzbh -> 0x004f, zzri -> 0x0052, zzig -> 0x0055, TryCatch #13 {zzbh -> 0x004f, zzge -> 0x004c, zzig -> 0x0055, zzri -> 0x0052, zztr -> 0x0049, IOException -> 0x0046, RuntimeException -> 0x0043, blocks: (B:3:0x0006, B:4:0x000f, B:6:0x0013, B:9:0x002d, B:25:0x0058, B:26:0x0068, B:27:0x007f, B:28:0x0083, B:29:0x0087, B:33:0x008e, B:35:0x0097, B:37:0x00a5, B:38:0x00ac, B:39:0x00b6, B:40:0x00ca, B:41:0x00e2, B:42:0x00f8, B:44:0x0107, B:45:0x010b, B:46:0x011c, B:48:0x012b, B:49:0x0147, B:50:0x015a, B:51:0x0163, B:53:0x0175, B:54:0x0181, B:55:0x0191, B:57:0x019d, B:60:0x01a8, B:61:0x01af, B:62:0x01ba, B:66:0x01c1, B:68:0x01c9, B:70:0x01cd, B:72:0x01d3, B:74:0x01db, B:76:0x01e3, B:77:0x01e6, B:79:0x01eb, B:85:0x01f7, B:86:0x01f8, B:90:0x01ff, B:92:0x020d, B:93:0x0210, B:94:0x0215, B:96:0x0225, B:97:0x0228, B:98:0x022d, B:99:0x0232, B:101:0x023e, B:102:0x024a, B:104:0x0256, B:106:0x0282, B:107:0x02a2, B:116:0x02cd, B:118:0x02d1, B:119:0x02d4, B:125:0x02de, B:136:0x02f1, B:137:0x02f6, B:138:0x02fe, B:142:0x0336, B:215:0x0461, B:193:0x0428, B:192:0x0424, B:223:0x0471, B:224:0x0479, B:150:0x0389, B:152:0x03a0, B:239:0x049d, B:241:0x04b8, B:244:0x04cb, B:246:0x04da, B:248:0x04e6, B:250:0x04fb, B:251:0x0500, B:252:0x0503, B:254:0x0507, B:256:0x0514, B:328:0x0669, B:330:0x0671, B:332:0x0679, B:335:0x067e, B:336:0x068a, B:338:0x068f, B:340:0x0697, B:343:0x06a7, B:345:0x06ad, B:346:0x06cb, B:348:0x06d1, B:350:0x06d7, B:352:0x06dc, B:354:0x06e0, B:394:0x079d, B:395:0x07a1, B:399:0x07ae, B:401:0x07b6, B:402:0x07bc, B:404:0x07ca, B:405:0x07e3, B:407:0x07e8, B:409:0x07f0, B:440:0x0844, B:410:0x07f6, B:412:0x0801, B:416:0x080a, B:421:0x0819, B:427:0x0826, B:429:0x082c, B:433:0x0835, B:439:0x0841, B:443:0x0855, B:445:0x085b, B:449:0x0863, B:451:0x086b, B:453:0x086f, B:454:0x0879, B:456:0x087f, B:509:0x0987, B:512:0x098e, B:514:0x0993, B:516:0x099b, B:518:0x09a9, B:519:0x09b0, B:520:0x09b3, B:522:0x09b9, B:524:0x09c2, B:526:0x09c8, B:528:0x09ce, B:535:0x09ef, B:537:0x09f5, B:541:0x09fe, B:550:0x0a14, B:547:0x0a0d, B:549:0x0a11, B:529:0x09d5, B:532:0x09e3, B:533:0x09ea, B:534:0x09eb, B:457:0x0887, B:459:0x088d, B:461:0x0891, B:488:0x0929, B:490:0x0936, B:466:0x089d, B:468:0x08a1, B:470:0x08b5, B:472:0x08c0, B:474:0x08cc, B:478:0x08d5, B:480:0x08df, B:486:0x08ea, B:491:0x0942, B:493:0x0948, B:495:0x094c, B:499:0x0955, B:501:0x0963, B:503:0x096b, B:505:0x0975, B:506:0x097a, B:507:0x097f, B:508:0x0984, B:442:0x084c, B:357:0x06ee, B:359:0x06f2, B:361:0x06fa, B:363:0x0700, B:365:0x070a, B:368:0x0710, B:369:0x0713, B:371:0x071b, B:373:0x072d, B:375:0x0735, B:377:0x073d, B:381:0x0747, B:383:0x076e, B:384:0x0771, B:385:0x077c, B:387:0x0781, B:389:0x0787, B:390:0x078e, B:393:0x079c, B:259:0x0521, B:261:0x0527, B:264:0x0530, B:267:0x053b, B:269:0x0541, B:272:0x054f, B:274:0x0555, B:276:0x0561, B:277:0x0564, B:279:0x056c, B:281:0x057a, B:283:0x05b5, B:285:0x05bf, B:287:0x05c9, B:289:0x05d1, B:290:0x05d4, B:291:0x05d7, B:293:0x05dd, B:295:0x05eb, B:297:0x05f0, B:299:0x05fa, B:301:0x0604, B:303:0x0615, B:305:0x061b, B:306:0x0626, B:307:0x0629, B:309:0x062f, B:312:0x0634, B:314:0x0639, B:316:0x0641, B:318:0x0647, B:320:0x064d, B:324:0x065b, B:326:0x0663, B:327:0x0666, B:255:0x0511, B:551:0x0a19, B:555:0x0a20, B:126:0x02df, B:128:0x02e3, B:129:0x02e6, B:132:0x02ed, B:135:0x02f0), top: B:630:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:470:0x08b5 A[Catch: RuntimeException -> 0x0043, IOException -> 0x0046, zztr -> 0x0049, zzge -> 0x004c, zzbh -> 0x004f, zzri -> 0x0052, zzig -> 0x0055, TryCatch #13 {zzbh -> 0x004f, zzge -> 0x004c, zzig -> 0x0055, zzri -> 0x0052, zztr -> 0x0049, IOException -> 0x0046, RuntimeException -> 0x0043, blocks: (B:3:0x0006, B:4:0x000f, B:6:0x0013, B:9:0x002d, B:25:0x0058, B:26:0x0068, B:27:0x007f, B:28:0x0083, B:29:0x0087, B:33:0x008e, B:35:0x0097, B:37:0x00a5, B:38:0x00ac, B:39:0x00b6, B:40:0x00ca, B:41:0x00e2, B:42:0x00f8, B:44:0x0107, B:45:0x010b, B:46:0x011c, B:48:0x012b, B:49:0x0147, B:50:0x015a, B:51:0x0163, B:53:0x0175, B:54:0x0181, B:55:0x0191, B:57:0x019d, B:60:0x01a8, B:61:0x01af, B:62:0x01ba, B:66:0x01c1, B:68:0x01c9, B:70:0x01cd, B:72:0x01d3, B:74:0x01db, B:76:0x01e3, B:77:0x01e6, B:79:0x01eb, B:85:0x01f7, B:86:0x01f8, B:90:0x01ff, B:92:0x020d, B:93:0x0210, B:94:0x0215, B:96:0x0225, B:97:0x0228, B:98:0x022d, B:99:0x0232, B:101:0x023e, B:102:0x024a, B:104:0x0256, B:106:0x0282, B:107:0x02a2, B:116:0x02cd, B:118:0x02d1, B:119:0x02d4, B:125:0x02de, B:136:0x02f1, B:137:0x02f6, B:138:0x02fe, B:142:0x0336, B:215:0x0461, B:193:0x0428, B:192:0x0424, B:223:0x0471, B:224:0x0479, B:150:0x0389, B:152:0x03a0, B:239:0x049d, B:241:0x04b8, B:244:0x04cb, B:246:0x04da, B:248:0x04e6, B:250:0x04fb, B:251:0x0500, B:252:0x0503, B:254:0x0507, B:256:0x0514, B:328:0x0669, B:330:0x0671, B:332:0x0679, B:335:0x067e, B:336:0x068a, B:338:0x068f, B:340:0x0697, B:343:0x06a7, B:345:0x06ad, B:346:0x06cb, B:348:0x06d1, B:350:0x06d7, B:352:0x06dc, B:354:0x06e0, B:394:0x079d, B:395:0x07a1, B:399:0x07ae, B:401:0x07b6, B:402:0x07bc, B:404:0x07ca, B:405:0x07e3, B:407:0x07e8, B:409:0x07f0, B:440:0x0844, B:410:0x07f6, B:412:0x0801, B:416:0x080a, B:421:0x0819, B:427:0x0826, B:429:0x082c, B:433:0x0835, B:439:0x0841, B:443:0x0855, B:445:0x085b, B:449:0x0863, B:451:0x086b, B:453:0x086f, B:454:0x0879, B:456:0x087f, B:509:0x0987, B:512:0x098e, B:514:0x0993, B:516:0x099b, B:518:0x09a9, B:519:0x09b0, B:520:0x09b3, B:522:0x09b9, B:524:0x09c2, B:526:0x09c8, B:528:0x09ce, B:535:0x09ef, B:537:0x09f5, B:541:0x09fe, B:550:0x0a14, B:547:0x0a0d, B:549:0x0a11, B:529:0x09d5, B:532:0x09e3, B:533:0x09ea, B:534:0x09eb, B:457:0x0887, B:459:0x088d, B:461:0x0891, B:488:0x0929, B:490:0x0936, B:466:0x089d, B:468:0x08a1, B:470:0x08b5, B:472:0x08c0, B:474:0x08cc, B:478:0x08d5, B:480:0x08df, B:486:0x08ea, B:491:0x0942, B:493:0x0948, B:495:0x094c, B:499:0x0955, B:501:0x0963, B:503:0x096b, B:505:0x0975, B:506:0x097a, B:507:0x097f, B:508:0x0984, B:442:0x084c, B:357:0x06ee, B:359:0x06f2, B:361:0x06fa, B:363:0x0700, B:365:0x070a, B:368:0x0710, B:369:0x0713, B:371:0x071b, B:373:0x072d, B:375:0x0735, B:377:0x073d, B:381:0x0747, B:383:0x076e, B:384:0x0771, B:385:0x077c, B:387:0x0781, B:389:0x0787, B:390:0x078e, B:393:0x079c, B:259:0x0521, B:261:0x0527, B:264:0x0530, B:267:0x053b, B:269:0x0541, B:272:0x054f, B:274:0x0555, B:276:0x0561, B:277:0x0564, B:279:0x056c, B:281:0x057a, B:283:0x05b5, B:285:0x05bf, B:287:0x05c9, B:289:0x05d1, B:290:0x05d4, B:291:0x05d7, B:293:0x05dd, B:295:0x05eb, B:297:0x05f0, B:299:0x05fa, B:301:0x0604, B:303:0x0615, B:305:0x061b, B:306:0x0626, B:307:0x0629, B:309:0x062f, B:312:0x0634, B:314:0x0639, B:316:0x0641, B:318:0x0647, B:320:0x064d, B:324:0x065b, B:326:0x0663, B:327:0x0666, B:255:0x0511, B:551:0x0a19, B:555:0x0a20, B:126:0x02df, B:128:0x02e3, B:129:0x02e6, B:132:0x02ed, B:135:0x02f0), top: B:630:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:471:0x08be  */
    /* JADX WARN: Code duplicated, block: B:477:0x08d4  */
    /* JADX WARN: Code duplicated, block: B:483:0x08e5  */
    /* JADX WARN: Code duplicated, block: B:490:0x0936 A[Catch: RuntimeException -> 0x0043, IOException -> 0x0046, zztr -> 0x0049, zzge -> 0x004c, zzbh -> 0x004f, zzri -> 0x0052, zzig -> 0x0055, TryCatch #13 {zzbh -> 0x004f, zzge -> 0x004c, zzig -> 0x0055, zzri -> 0x0052, zztr -> 0x0049, IOException -> 0x0046, RuntimeException -> 0x0043, blocks: (B:3:0x0006, B:4:0x000f, B:6:0x0013, B:9:0x002d, B:25:0x0058, B:26:0x0068, B:27:0x007f, B:28:0x0083, B:29:0x0087, B:33:0x008e, B:35:0x0097, B:37:0x00a5, B:38:0x00ac, B:39:0x00b6, B:40:0x00ca, B:41:0x00e2, B:42:0x00f8, B:44:0x0107, B:45:0x010b, B:46:0x011c, B:48:0x012b, B:49:0x0147, B:50:0x015a, B:51:0x0163, B:53:0x0175, B:54:0x0181, B:55:0x0191, B:57:0x019d, B:60:0x01a8, B:61:0x01af, B:62:0x01ba, B:66:0x01c1, B:68:0x01c9, B:70:0x01cd, B:72:0x01d3, B:74:0x01db, B:76:0x01e3, B:77:0x01e6, B:79:0x01eb, B:85:0x01f7, B:86:0x01f8, B:90:0x01ff, B:92:0x020d, B:93:0x0210, B:94:0x0215, B:96:0x0225, B:97:0x0228, B:98:0x022d, B:99:0x0232, B:101:0x023e, B:102:0x024a, B:104:0x0256, B:106:0x0282, B:107:0x02a2, B:116:0x02cd, B:118:0x02d1, B:119:0x02d4, B:125:0x02de, B:136:0x02f1, B:137:0x02f6, B:138:0x02fe, B:142:0x0336, B:215:0x0461, B:193:0x0428, B:192:0x0424, B:223:0x0471, B:224:0x0479, B:150:0x0389, B:152:0x03a0, B:239:0x049d, B:241:0x04b8, B:244:0x04cb, B:246:0x04da, B:248:0x04e6, B:250:0x04fb, B:251:0x0500, B:252:0x0503, B:254:0x0507, B:256:0x0514, B:328:0x0669, B:330:0x0671, B:332:0x0679, B:335:0x067e, B:336:0x068a, B:338:0x068f, B:340:0x0697, B:343:0x06a7, B:345:0x06ad, B:346:0x06cb, B:348:0x06d1, B:350:0x06d7, B:352:0x06dc, B:354:0x06e0, B:394:0x079d, B:395:0x07a1, B:399:0x07ae, B:401:0x07b6, B:402:0x07bc, B:404:0x07ca, B:405:0x07e3, B:407:0x07e8, B:409:0x07f0, B:440:0x0844, B:410:0x07f6, B:412:0x0801, B:416:0x080a, B:421:0x0819, B:427:0x0826, B:429:0x082c, B:433:0x0835, B:439:0x0841, B:443:0x0855, B:445:0x085b, B:449:0x0863, B:451:0x086b, B:453:0x086f, B:454:0x0879, B:456:0x087f, B:509:0x0987, B:512:0x098e, B:514:0x0993, B:516:0x099b, B:518:0x09a9, B:519:0x09b0, B:520:0x09b3, B:522:0x09b9, B:524:0x09c2, B:526:0x09c8, B:528:0x09ce, B:535:0x09ef, B:537:0x09f5, B:541:0x09fe, B:550:0x0a14, B:547:0x0a0d, B:549:0x0a11, B:529:0x09d5, B:532:0x09e3, B:533:0x09ea, B:534:0x09eb, B:457:0x0887, B:459:0x088d, B:461:0x0891, B:488:0x0929, B:490:0x0936, B:466:0x089d, B:468:0x08a1, B:470:0x08b5, B:472:0x08c0, B:474:0x08cc, B:478:0x08d5, B:480:0x08df, B:486:0x08ea, B:491:0x0942, B:493:0x0948, B:495:0x094c, B:499:0x0955, B:501:0x0963, B:503:0x096b, B:505:0x0975, B:506:0x097a, B:507:0x097f, B:508:0x0984, B:442:0x084c, B:357:0x06ee, B:359:0x06f2, B:361:0x06fa, B:363:0x0700, B:365:0x070a, B:368:0x0710, B:369:0x0713, B:371:0x071b, B:373:0x072d, B:375:0x0735, B:377:0x073d, B:381:0x0747, B:383:0x076e, B:384:0x0771, B:385:0x077c, B:387:0x0781, B:389:0x0787, B:390:0x078e, B:393:0x079c, B:259:0x0521, B:261:0x0527, B:264:0x0530, B:267:0x053b, B:269:0x0541, B:272:0x054f, B:274:0x0555, B:276:0x0561, B:277:0x0564, B:279:0x056c, B:281:0x057a, B:283:0x05b5, B:285:0x05bf, B:287:0x05c9, B:289:0x05d1, B:290:0x05d4, B:291:0x05d7, B:293:0x05dd, B:295:0x05eb, B:297:0x05f0, B:299:0x05fa, B:301:0x0604, B:303:0x0615, B:305:0x061b, B:306:0x0626, B:307:0x0629, B:309:0x062f, B:312:0x0634, B:314:0x0639, B:316:0x0641, B:318:0x0647, B:320:0x064d, B:324:0x065b, B:326:0x0663, B:327:0x0666, B:255:0x0511, B:551:0x0a19, B:555:0x0a20, B:126:0x02df, B:128:0x02e3, B:129:0x02e6, B:132:0x02ed, B:135:0x02f0), top: B:630:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:491:0x0942 A[Catch: RuntimeException -> 0x0043, IOException -> 0x0046, zztr -> 0x0049, zzge -> 0x004c, zzbh -> 0x004f, zzri -> 0x0052, zzig -> 0x0055, TryCatch #13 {zzbh -> 0x004f, zzge -> 0x004c, zzig -> 0x0055, zzri -> 0x0052, zztr -> 0x0049, IOException -> 0x0046, RuntimeException -> 0x0043, blocks: (B:3:0x0006, B:4:0x000f, B:6:0x0013, B:9:0x002d, B:25:0x0058, B:26:0x0068, B:27:0x007f, B:28:0x0083, B:29:0x0087, B:33:0x008e, B:35:0x0097, B:37:0x00a5, B:38:0x00ac, B:39:0x00b6, B:40:0x00ca, B:41:0x00e2, B:42:0x00f8, B:44:0x0107, B:45:0x010b, B:46:0x011c, B:48:0x012b, B:49:0x0147, B:50:0x015a, B:51:0x0163, B:53:0x0175, B:54:0x0181, B:55:0x0191, B:57:0x019d, B:60:0x01a8, B:61:0x01af, B:62:0x01ba, B:66:0x01c1, B:68:0x01c9, B:70:0x01cd, B:72:0x01d3, B:74:0x01db, B:76:0x01e3, B:77:0x01e6, B:79:0x01eb, B:85:0x01f7, B:86:0x01f8, B:90:0x01ff, B:92:0x020d, B:93:0x0210, B:94:0x0215, B:96:0x0225, B:97:0x0228, B:98:0x022d, B:99:0x0232, B:101:0x023e, B:102:0x024a, B:104:0x0256, B:106:0x0282, B:107:0x02a2, B:116:0x02cd, B:118:0x02d1, B:119:0x02d4, B:125:0x02de, B:136:0x02f1, B:137:0x02f6, B:138:0x02fe, B:142:0x0336, B:215:0x0461, B:193:0x0428, B:192:0x0424, B:223:0x0471, B:224:0x0479, B:150:0x0389, B:152:0x03a0, B:239:0x049d, B:241:0x04b8, B:244:0x04cb, B:246:0x04da, B:248:0x04e6, B:250:0x04fb, B:251:0x0500, B:252:0x0503, B:254:0x0507, B:256:0x0514, B:328:0x0669, B:330:0x0671, B:332:0x0679, B:335:0x067e, B:336:0x068a, B:338:0x068f, B:340:0x0697, B:343:0x06a7, B:345:0x06ad, B:346:0x06cb, B:348:0x06d1, B:350:0x06d7, B:352:0x06dc, B:354:0x06e0, B:394:0x079d, B:395:0x07a1, B:399:0x07ae, B:401:0x07b6, B:402:0x07bc, B:404:0x07ca, B:405:0x07e3, B:407:0x07e8, B:409:0x07f0, B:440:0x0844, B:410:0x07f6, B:412:0x0801, B:416:0x080a, B:421:0x0819, B:427:0x0826, B:429:0x082c, B:433:0x0835, B:439:0x0841, B:443:0x0855, B:445:0x085b, B:449:0x0863, B:451:0x086b, B:453:0x086f, B:454:0x0879, B:456:0x087f, B:509:0x0987, B:512:0x098e, B:514:0x0993, B:516:0x099b, B:518:0x09a9, B:519:0x09b0, B:520:0x09b3, B:522:0x09b9, B:524:0x09c2, B:526:0x09c8, B:528:0x09ce, B:535:0x09ef, B:537:0x09f5, B:541:0x09fe, B:550:0x0a14, B:547:0x0a0d, B:549:0x0a11, B:529:0x09d5, B:532:0x09e3, B:533:0x09ea, B:534:0x09eb, B:457:0x0887, B:459:0x088d, B:461:0x0891, B:488:0x0929, B:490:0x0936, B:466:0x089d, B:468:0x08a1, B:470:0x08b5, B:472:0x08c0, B:474:0x08cc, B:478:0x08d5, B:480:0x08df, B:486:0x08ea, B:491:0x0942, B:493:0x0948, B:495:0x094c, B:499:0x0955, B:501:0x0963, B:503:0x096b, B:505:0x0975, B:506:0x097a, B:507:0x097f, B:508:0x0984, B:442:0x084c, B:357:0x06ee, B:359:0x06f2, B:361:0x06fa, B:363:0x0700, B:365:0x070a, B:368:0x0710, B:369:0x0713, B:371:0x071b, B:373:0x072d, B:375:0x0735, B:377:0x073d, B:381:0x0747, B:383:0x076e, B:384:0x0771, B:385:0x077c, B:387:0x0781, B:389:0x0787, B:390:0x078e, B:393:0x079c, B:259:0x0521, B:261:0x0527, B:264:0x0530, B:267:0x053b, B:269:0x0541, B:272:0x054f, B:274:0x0555, B:276:0x0561, B:277:0x0564, B:279:0x056c, B:281:0x057a, B:283:0x05b5, B:285:0x05bf, B:287:0x05c9, B:289:0x05d1, B:290:0x05d4, B:291:0x05d7, B:293:0x05dd, B:295:0x05eb, B:297:0x05f0, B:299:0x05fa, B:301:0x0604, B:303:0x0615, B:305:0x061b, B:306:0x0626, B:307:0x0629, B:309:0x062f, B:312:0x0634, B:314:0x0639, B:316:0x0641, B:318:0x0647, B:320:0x064d, B:324:0x065b, B:326:0x0663, B:327:0x0666, B:255:0x0511, B:551:0x0a19, B:555:0x0a20, B:126:0x02df, B:128:0x02e3, B:129:0x02e6, B:132:0x02ed, B:135:0x02f0), top: B:630:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:493:0x0948 A[Catch: RuntimeException -> 0x0043, IOException -> 0x0046, zztr -> 0x0049, zzge -> 0x004c, zzbh -> 0x004f, zzri -> 0x0052, zzig -> 0x0055, TryCatch #13 {zzbh -> 0x004f, zzge -> 0x004c, zzig -> 0x0055, zzri -> 0x0052, zztr -> 0x0049, IOException -> 0x0046, RuntimeException -> 0x0043, blocks: (B:3:0x0006, B:4:0x000f, B:6:0x0013, B:9:0x002d, B:25:0x0058, B:26:0x0068, B:27:0x007f, B:28:0x0083, B:29:0x0087, B:33:0x008e, B:35:0x0097, B:37:0x00a5, B:38:0x00ac, B:39:0x00b6, B:40:0x00ca, B:41:0x00e2, B:42:0x00f8, B:44:0x0107, B:45:0x010b, B:46:0x011c, B:48:0x012b, B:49:0x0147, B:50:0x015a, B:51:0x0163, B:53:0x0175, B:54:0x0181, B:55:0x0191, B:57:0x019d, B:60:0x01a8, B:61:0x01af, B:62:0x01ba, B:66:0x01c1, B:68:0x01c9, B:70:0x01cd, B:72:0x01d3, B:74:0x01db, B:76:0x01e3, B:77:0x01e6, B:79:0x01eb, B:85:0x01f7, B:86:0x01f8, B:90:0x01ff, B:92:0x020d, B:93:0x0210, B:94:0x0215, B:96:0x0225, B:97:0x0228, B:98:0x022d, B:99:0x0232, B:101:0x023e, B:102:0x024a, B:104:0x0256, B:106:0x0282, B:107:0x02a2, B:116:0x02cd, B:118:0x02d1, B:119:0x02d4, B:125:0x02de, B:136:0x02f1, B:137:0x02f6, B:138:0x02fe, B:142:0x0336, B:215:0x0461, B:193:0x0428, B:192:0x0424, B:223:0x0471, B:224:0x0479, B:150:0x0389, B:152:0x03a0, B:239:0x049d, B:241:0x04b8, B:244:0x04cb, B:246:0x04da, B:248:0x04e6, B:250:0x04fb, B:251:0x0500, B:252:0x0503, B:254:0x0507, B:256:0x0514, B:328:0x0669, B:330:0x0671, B:332:0x0679, B:335:0x067e, B:336:0x068a, B:338:0x068f, B:340:0x0697, B:343:0x06a7, B:345:0x06ad, B:346:0x06cb, B:348:0x06d1, B:350:0x06d7, B:352:0x06dc, B:354:0x06e0, B:394:0x079d, B:395:0x07a1, B:399:0x07ae, B:401:0x07b6, B:402:0x07bc, B:404:0x07ca, B:405:0x07e3, B:407:0x07e8, B:409:0x07f0, B:440:0x0844, B:410:0x07f6, B:412:0x0801, B:416:0x080a, B:421:0x0819, B:427:0x0826, B:429:0x082c, B:433:0x0835, B:439:0x0841, B:443:0x0855, B:445:0x085b, B:449:0x0863, B:451:0x086b, B:453:0x086f, B:454:0x0879, B:456:0x087f, B:509:0x0987, B:512:0x098e, B:514:0x0993, B:516:0x099b, B:518:0x09a9, B:519:0x09b0, B:520:0x09b3, B:522:0x09b9, B:524:0x09c2, B:526:0x09c8, B:528:0x09ce, B:535:0x09ef, B:537:0x09f5, B:541:0x09fe, B:550:0x0a14, B:547:0x0a0d, B:549:0x0a11, B:529:0x09d5, B:532:0x09e3, B:533:0x09ea, B:534:0x09eb, B:457:0x0887, B:459:0x088d, B:461:0x0891, B:488:0x0929, B:490:0x0936, B:466:0x089d, B:468:0x08a1, B:470:0x08b5, B:472:0x08c0, B:474:0x08cc, B:478:0x08d5, B:480:0x08df, B:486:0x08ea, B:491:0x0942, B:493:0x0948, B:495:0x094c, B:499:0x0955, B:501:0x0963, B:503:0x096b, B:505:0x0975, B:506:0x097a, B:507:0x097f, B:508:0x0984, B:442:0x084c, B:357:0x06ee, B:359:0x06f2, B:361:0x06fa, B:363:0x0700, B:365:0x070a, B:368:0x0710, B:369:0x0713, B:371:0x071b, B:373:0x072d, B:375:0x0735, B:377:0x073d, B:381:0x0747, B:383:0x076e, B:384:0x0771, B:385:0x077c, B:387:0x0781, B:389:0x0787, B:390:0x078e, B:393:0x079c, B:259:0x0521, B:261:0x0527, B:264:0x0530, B:267:0x053b, B:269:0x0541, B:272:0x054f, B:274:0x0555, B:276:0x0561, B:277:0x0564, B:279:0x056c, B:281:0x057a, B:283:0x05b5, B:285:0x05bf, B:287:0x05c9, B:289:0x05d1, B:290:0x05d4, B:291:0x05d7, B:293:0x05dd, B:295:0x05eb, B:297:0x05f0, B:299:0x05fa, B:301:0x0604, B:303:0x0615, B:305:0x061b, B:306:0x0626, B:307:0x0629, B:309:0x062f, B:312:0x0634, B:314:0x0639, B:316:0x0641, B:318:0x0647, B:320:0x064d, B:324:0x065b, B:326:0x0663, B:327:0x0666, B:255:0x0511, B:551:0x0a19, B:555:0x0a20, B:126:0x02df, B:128:0x02e3, B:129:0x02e6, B:132:0x02ed, B:135:0x02f0), top: B:630:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:495:0x094c A[Catch: RuntimeException -> 0x0043, IOException -> 0x0046, zztr -> 0x0049, zzge -> 0x004c, zzbh -> 0x004f, zzri -> 0x0052, zzig -> 0x0055, TryCatch #13 {zzbh -> 0x004f, zzge -> 0x004c, zzig -> 0x0055, zzri -> 0x0052, zztr -> 0x0049, IOException -> 0x0046, RuntimeException -> 0x0043, blocks: (B:3:0x0006, B:4:0x000f, B:6:0x0013, B:9:0x002d, B:25:0x0058, B:26:0x0068, B:27:0x007f, B:28:0x0083, B:29:0x0087, B:33:0x008e, B:35:0x0097, B:37:0x00a5, B:38:0x00ac, B:39:0x00b6, B:40:0x00ca, B:41:0x00e2, B:42:0x00f8, B:44:0x0107, B:45:0x010b, B:46:0x011c, B:48:0x012b, B:49:0x0147, B:50:0x015a, B:51:0x0163, B:53:0x0175, B:54:0x0181, B:55:0x0191, B:57:0x019d, B:60:0x01a8, B:61:0x01af, B:62:0x01ba, B:66:0x01c1, B:68:0x01c9, B:70:0x01cd, B:72:0x01d3, B:74:0x01db, B:76:0x01e3, B:77:0x01e6, B:79:0x01eb, B:85:0x01f7, B:86:0x01f8, B:90:0x01ff, B:92:0x020d, B:93:0x0210, B:94:0x0215, B:96:0x0225, B:97:0x0228, B:98:0x022d, B:99:0x0232, B:101:0x023e, B:102:0x024a, B:104:0x0256, B:106:0x0282, B:107:0x02a2, B:116:0x02cd, B:118:0x02d1, B:119:0x02d4, B:125:0x02de, B:136:0x02f1, B:137:0x02f6, B:138:0x02fe, B:142:0x0336, B:215:0x0461, B:193:0x0428, B:192:0x0424, B:223:0x0471, B:224:0x0479, B:150:0x0389, B:152:0x03a0, B:239:0x049d, B:241:0x04b8, B:244:0x04cb, B:246:0x04da, B:248:0x04e6, B:250:0x04fb, B:251:0x0500, B:252:0x0503, B:254:0x0507, B:256:0x0514, B:328:0x0669, B:330:0x0671, B:332:0x0679, B:335:0x067e, B:336:0x068a, B:338:0x068f, B:340:0x0697, B:343:0x06a7, B:345:0x06ad, B:346:0x06cb, B:348:0x06d1, B:350:0x06d7, B:352:0x06dc, B:354:0x06e0, B:394:0x079d, B:395:0x07a1, B:399:0x07ae, B:401:0x07b6, B:402:0x07bc, B:404:0x07ca, B:405:0x07e3, B:407:0x07e8, B:409:0x07f0, B:440:0x0844, B:410:0x07f6, B:412:0x0801, B:416:0x080a, B:421:0x0819, B:427:0x0826, B:429:0x082c, B:433:0x0835, B:439:0x0841, B:443:0x0855, B:445:0x085b, B:449:0x0863, B:451:0x086b, B:453:0x086f, B:454:0x0879, B:456:0x087f, B:509:0x0987, B:512:0x098e, B:514:0x0993, B:516:0x099b, B:518:0x09a9, B:519:0x09b0, B:520:0x09b3, B:522:0x09b9, B:524:0x09c2, B:526:0x09c8, B:528:0x09ce, B:535:0x09ef, B:537:0x09f5, B:541:0x09fe, B:550:0x0a14, B:547:0x0a0d, B:549:0x0a11, B:529:0x09d5, B:532:0x09e3, B:533:0x09ea, B:534:0x09eb, B:457:0x0887, B:459:0x088d, B:461:0x0891, B:488:0x0929, B:490:0x0936, B:466:0x089d, B:468:0x08a1, B:470:0x08b5, B:472:0x08c0, B:474:0x08cc, B:478:0x08d5, B:480:0x08df, B:486:0x08ea, B:491:0x0942, B:493:0x0948, B:495:0x094c, B:499:0x0955, B:501:0x0963, B:503:0x096b, B:505:0x0975, B:506:0x097a, B:507:0x097f, B:508:0x0984, B:442:0x084c, B:357:0x06ee, B:359:0x06f2, B:361:0x06fa, B:363:0x0700, B:365:0x070a, B:368:0x0710, B:369:0x0713, B:371:0x071b, B:373:0x072d, B:375:0x0735, B:377:0x073d, B:381:0x0747, B:383:0x076e, B:384:0x0771, B:385:0x077c, B:387:0x0781, B:389:0x0787, B:390:0x078e, B:393:0x079c, B:259:0x0521, B:261:0x0527, B:264:0x0530, B:267:0x053b, B:269:0x0541, B:272:0x054f, B:274:0x0555, B:276:0x0561, B:277:0x0564, B:279:0x056c, B:281:0x057a, B:283:0x05b5, B:285:0x05bf, B:287:0x05c9, B:289:0x05d1, B:290:0x05d4, B:291:0x05d7, B:293:0x05dd, B:295:0x05eb, B:297:0x05f0, B:299:0x05fa, B:301:0x0604, B:303:0x0615, B:305:0x061b, B:306:0x0626, B:307:0x0629, B:309:0x062f, B:312:0x0634, B:314:0x0639, B:316:0x0641, B:318:0x0647, B:320:0x064d, B:324:0x065b, B:326:0x0663, B:327:0x0666, B:255:0x0511, B:551:0x0a19, B:555:0x0a20, B:126:0x02df, B:128:0x02e3, B:129:0x02e6, B:132:0x02ed, B:135:0x02f0), top: B:630:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:497:0x0952  */
    /* JADX WARN: Code duplicated, block: B:498:0x0953 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:499:0x0955 A[Catch: RuntimeException -> 0x0043, IOException -> 0x0046, zztr -> 0x0049, zzge -> 0x004c, zzbh -> 0x004f, zzri -> 0x0052, zzig -> 0x0055, TryCatch #13 {zzbh -> 0x004f, zzge -> 0x004c, zzig -> 0x0055, zzri -> 0x0052, zztr -> 0x0049, IOException -> 0x0046, RuntimeException -> 0x0043, blocks: (B:3:0x0006, B:4:0x000f, B:6:0x0013, B:9:0x002d, B:25:0x0058, B:26:0x0068, B:27:0x007f, B:28:0x0083, B:29:0x0087, B:33:0x008e, B:35:0x0097, B:37:0x00a5, B:38:0x00ac, B:39:0x00b6, B:40:0x00ca, B:41:0x00e2, B:42:0x00f8, B:44:0x0107, B:45:0x010b, B:46:0x011c, B:48:0x012b, B:49:0x0147, B:50:0x015a, B:51:0x0163, B:53:0x0175, B:54:0x0181, B:55:0x0191, B:57:0x019d, B:60:0x01a8, B:61:0x01af, B:62:0x01ba, B:66:0x01c1, B:68:0x01c9, B:70:0x01cd, B:72:0x01d3, B:74:0x01db, B:76:0x01e3, B:77:0x01e6, B:79:0x01eb, B:85:0x01f7, B:86:0x01f8, B:90:0x01ff, B:92:0x020d, B:93:0x0210, B:94:0x0215, B:96:0x0225, B:97:0x0228, B:98:0x022d, B:99:0x0232, B:101:0x023e, B:102:0x024a, B:104:0x0256, B:106:0x0282, B:107:0x02a2, B:116:0x02cd, B:118:0x02d1, B:119:0x02d4, B:125:0x02de, B:136:0x02f1, B:137:0x02f6, B:138:0x02fe, B:142:0x0336, B:215:0x0461, B:193:0x0428, B:192:0x0424, B:223:0x0471, B:224:0x0479, B:150:0x0389, B:152:0x03a0, B:239:0x049d, B:241:0x04b8, B:244:0x04cb, B:246:0x04da, B:248:0x04e6, B:250:0x04fb, B:251:0x0500, B:252:0x0503, B:254:0x0507, B:256:0x0514, B:328:0x0669, B:330:0x0671, B:332:0x0679, B:335:0x067e, B:336:0x068a, B:338:0x068f, B:340:0x0697, B:343:0x06a7, B:345:0x06ad, B:346:0x06cb, B:348:0x06d1, B:350:0x06d7, B:352:0x06dc, B:354:0x06e0, B:394:0x079d, B:395:0x07a1, B:399:0x07ae, B:401:0x07b6, B:402:0x07bc, B:404:0x07ca, B:405:0x07e3, B:407:0x07e8, B:409:0x07f0, B:440:0x0844, B:410:0x07f6, B:412:0x0801, B:416:0x080a, B:421:0x0819, B:427:0x0826, B:429:0x082c, B:433:0x0835, B:439:0x0841, B:443:0x0855, B:445:0x085b, B:449:0x0863, B:451:0x086b, B:453:0x086f, B:454:0x0879, B:456:0x087f, B:509:0x0987, B:512:0x098e, B:514:0x0993, B:516:0x099b, B:518:0x09a9, B:519:0x09b0, B:520:0x09b3, B:522:0x09b9, B:524:0x09c2, B:526:0x09c8, B:528:0x09ce, B:535:0x09ef, B:537:0x09f5, B:541:0x09fe, B:550:0x0a14, B:547:0x0a0d, B:549:0x0a11, B:529:0x09d5, B:532:0x09e3, B:533:0x09ea, B:534:0x09eb, B:457:0x0887, B:459:0x088d, B:461:0x0891, B:488:0x0929, B:490:0x0936, B:466:0x089d, B:468:0x08a1, B:470:0x08b5, B:472:0x08c0, B:474:0x08cc, B:478:0x08d5, B:480:0x08df, B:486:0x08ea, B:491:0x0942, B:493:0x0948, B:495:0x094c, B:499:0x0955, B:501:0x0963, B:503:0x096b, B:505:0x0975, B:506:0x097a, B:507:0x097f, B:508:0x0984, B:442:0x084c, B:357:0x06ee, B:359:0x06f2, B:361:0x06fa, B:363:0x0700, B:365:0x070a, B:368:0x0710, B:369:0x0713, B:371:0x071b, B:373:0x072d, B:375:0x0735, B:377:0x073d, B:381:0x0747, B:383:0x076e, B:384:0x0771, B:385:0x077c, B:387:0x0781, B:389:0x0787, B:390:0x078e, B:393:0x079c, B:259:0x0521, B:261:0x0527, B:264:0x0530, B:267:0x053b, B:269:0x0541, B:272:0x054f, B:274:0x0555, B:276:0x0561, B:277:0x0564, B:279:0x056c, B:281:0x057a, B:283:0x05b5, B:285:0x05bf, B:287:0x05c9, B:289:0x05d1, B:290:0x05d4, B:291:0x05d7, B:293:0x05dd, B:295:0x05eb, B:297:0x05f0, B:299:0x05fa, B:301:0x0604, B:303:0x0615, B:305:0x061b, B:306:0x0626, B:307:0x0629, B:309:0x062f, B:312:0x0634, B:314:0x0639, B:316:0x0641, B:318:0x0647, B:320:0x064d, B:324:0x065b, B:326:0x0663, B:327:0x0666, B:255:0x0511, B:551:0x0a19, B:555:0x0a20, B:126:0x02df, B:128:0x02e3, B:129:0x02e6, B:132:0x02ed, B:135:0x02f0), top: B:630:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:501:0x0963 A[Catch: RuntimeException -> 0x0043, IOException -> 0x0046, zztr -> 0x0049, zzge -> 0x004c, zzbh -> 0x004f, zzri -> 0x0052, zzig -> 0x0055, TryCatch #13 {zzbh -> 0x004f, zzge -> 0x004c, zzig -> 0x0055, zzri -> 0x0052, zztr -> 0x0049, IOException -> 0x0046, RuntimeException -> 0x0043, blocks: (B:3:0x0006, B:4:0x000f, B:6:0x0013, B:9:0x002d, B:25:0x0058, B:26:0x0068, B:27:0x007f, B:28:0x0083, B:29:0x0087, B:33:0x008e, B:35:0x0097, B:37:0x00a5, B:38:0x00ac, B:39:0x00b6, B:40:0x00ca, B:41:0x00e2, B:42:0x00f8, B:44:0x0107, B:45:0x010b, B:46:0x011c, B:48:0x012b, B:49:0x0147, B:50:0x015a, B:51:0x0163, B:53:0x0175, B:54:0x0181, B:55:0x0191, B:57:0x019d, B:60:0x01a8, B:61:0x01af, B:62:0x01ba, B:66:0x01c1, B:68:0x01c9, B:70:0x01cd, B:72:0x01d3, B:74:0x01db, B:76:0x01e3, B:77:0x01e6, B:79:0x01eb, B:85:0x01f7, B:86:0x01f8, B:90:0x01ff, B:92:0x020d, B:93:0x0210, B:94:0x0215, B:96:0x0225, B:97:0x0228, B:98:0x022d, B:99:0x0232, B:101:0x023e, B:102:0x024a, B:104:0x0256, B:106:0x0282, B:107:0x02a2, B:116:0x02cd, B:118:0x02d1, B:119:0x02d4, B:125:0x02de, B:136:0x02f1, B:137:0x02f6, B:138:0x02fe, B:142:0x0336, B:215:0x0461, B:193:0x0428, B:192:0x0424, B:223:0x0471, B:224:0x0479, B:150:0x0389, B:152:0x03a0, B:239:0x049d, B:241:0x04b8, B:244:0x04cb, B:246:0x04da, B:248:0x04e6, B:250:0x04fb, B:251:0x0500, B:252:0x0503, B:254:0x0507, B:256:0x0514, B:328:0x0669, B:330:0x0671, B:332:0x0679, B:335:0x067e, B:336:0x068a, B:338:0x068f, B:340:0x0697, B:343:0x06a7, B:345:0x06ad, B:346:0x06cb, B:348:0x06d1, B:350:0x06d7, B:352:0x06dc, B:354:0x06e0, B:394:0x079d, B:395:0x07a1, B:399:0x07ae, B:401:0x07b6, B:402:0x07bc, B:404:0x07ca, B:405:0x07e3, B:407:0x07e8, B:409:0x07f0, B:440:0x0844, B:410:0x07f6, B:412:0x0801, B:416:0x080a, B:421:0x0819, B:427:0x0826, B:429:0x082c, B:433:0x0835, B:439:0x0841, B:443:0x0855, B:445:0x085b, B:449:0x0863, B:451:0x086b, B:453:0x086f, B:454:0x0879, B:456:0x087f, B:509:0x0987, B:512:0x098e, B:514:0x0993, B:516:0x099b, B:518:0x09a9, B:519:0x09b0, B:520:0x09b3, B:522:0x09b9, B:524:0x09c2, B:526:0x09c8, B:528:0x09ce, B:535:0x09ef, B:537:0x09f5, B:541:0x09fe, B:550:0x0a14, B:547:0x0a0d, B:549:0x0a11, B:529:0x09d5, B:532:0x09e3, B:533:0x09ea, B:534:0x09eb, B:457:0x0887, B:459:0x088d, B:461:0x0891, B:488:0x0929, B:490:0x0936, B:466:0x089d, B:468:0x08a1, B:470:0x08b5, B:472:0x08c0, B:474:0x08cc, B:478:0x08d5, B:480:0x08df, B:486:0x08ea, B:491:0x0942, B:493:0x0948, B:495:0x094c, B:499:0x0955, B:501:0x0963, B:503:0x096b, B:505:0x0975, B:506:0x097a, B:507:0x097f, B:508:0x0984, B:442:0x084c, B:357:0x06ee, B:359:0x06f2, B:361:0x06fa, B:363:0x0700, B:365:0x070a, B:368:0x0710, B:369:0x0713, B:371:0x071b, B:373:0x072d, B:375:0x0735, B:377:0x073d, B:381:0x0747, B:383:0x076e, B:384:0x0771, B:385:0x077c, B:387:0x0781, B:389:0x0787, B:390:0x078e, B:393:0x079c, B:259:0x0521, B:261:0x0527, B:264:0x0530, B:267:0x053b, B:269:0x0541, B:272:0x054f, B:274:0x0555, B:276:0x0561, B:277:0x0564, B:279:0x056c, B:281:0x057a, B:283:0x05b5, B:285:0x05bf, B:287:0x05c9, B:289:0x05d1, B:290:0x05d4, B:291:0x05d7, B:293:0x05dd, B:295:0x05eb, B:297:0x05f0, B:299:0x05fa, B:301:0x0604, B:303:0x0615, B:305:0x061b, B:306:0x0626, B:307:0x0629, B:309:0x062f, B:312:0x0634, B:314:0x0639, B:316:0x0641, B:318:0x0647, B:320:0x064d, B:324:0x065b, B:326:0x0663, B:327:0x0666, B:255:0x0511, B:551:0x0a19, B:555:0x0a20, B:126:0x02df, B:128:0x02e3, B:129:0x02e6, B:132:0x02ed, B:135:0x02f0), top: B:630:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:503:0x096b A[Catch: RuntimeException -> 0x0043, IOException -> 0x0046, zztr -> 0x0049, zzge -> 0x004c, zzbh -> 0x004f, zzri -> 0x0052, zzig -> 0x0055, TryCatch #13 {zzbh -> 0x004f, zzge -> 0x004c, zzig -> 0x0055, zzri -> 0x0052, zztr -> 0x0049, IOException -> 0x0046, RuntimeException -> 0x0043, blocks: (B:3:0x0006, B:4:0x000f, B:6:0x0013, B:9:0x002d, B:25:0x0058, B:26:0x0068, B:27:0x007f, B:28:0x0083, B:29:0x0087, B:33:0x008e, B:35:0x0097, B:37:0x00a5, B:38:0x00ac, B:39:0x00b6, B:40:0x00ca, B:41:0x00e2, B:42:0x00f8, B:44:0x0107, B:45:0x010b, B:46:0x011c, B:48:0x012b, B:49:0x0147, B:50:0x015a, B:51:0x0163, B:53:0x0175, B:54:0x0181, B:55:0x0191, B:57:0x019d, B:60:0x01a8, B:61:0x01af, B:62:0x01ba, B:66:0x01c1, B:68:0x01c9, B:70:0x01cd, B:72:0x01d3, B:74:0x01db, B:76:0x01e3, B:77:0x01e6, B:79:0x01eb, B:85:0x01f7, B:86:0x01f8, B:90:0x01ff, B:92:0x020d, B:93:0x0210, B:94:0x0215, B:96:0x0225, B:97:0x0228, B:98:0x022d, B:99:0x0232, B:101:0x023e, B:102:0x024a, B:104:0x0256, B:106:0x0282, B:107:0x02a2, B:116:0x02cd, B:118:0x02d1, B:119:0x02d4, B:125:0x02de, B:136:0x02f1, B:137:0x02f6, B:138:0x02fe, B:142:0x0336, B:215:0x0461, B:193:0x0428, B:192:0x0424, B:223:0x0471, B:224:0x0479, B:150:0x0389, B:152:0x03a0, B:239:0x049d, B:241:0x04b8, B:244:0x04cb, B:246:0x04da, B:248:0x04e6, B:250:0x04fb, B:251:0x0500, B:252:0x0503, B:254:0x0507, B:256:0x0514, B:328:0x0669, B:330:0x0671, B:332:0x0679, B:335:0x067e, B:336:0x068a, B:338:0x068f, B:340:0x0697, B:343:0x06a7, B:345:0x06ad, B:346:0x06cb, B:348:0x06d1, B:350:0x06d7, B:352:0x06dc, B:354:0x06e0, B:394:0x079d, B:395:0x07a1, B:399:0x07ae, B:401:0x07b6, B:402:0x07bc, B:404:0x07ca, B:405:0x07e3, B:407:0x07e8, B:409:0x07f0, B:440:0x0844, B:410:0x07f6, B:412:0x0801, B:416:0x080a, B:421:0x0819, B:427:0x0826, B:429:0x082c, B:433:0x0835, B:439:0x0841, B:443:0x0855, B:445:0x085b, B:449:0x0863, B:451:0x086b, B:453:0x086f, B:454:0x0879, B:456:0x087f, B:509:0x0987, B:512:0x098e, B:514:0x0993, B:516:0x099b, B:518:0x09a9, B:519:0x09b0, B:520:0x09b3, B:522:0x09b9, B:524:0x09c2, B:526:0x09c8, B:528:0x09ce, B:535:0x09ef, B:537:0x09f5, B:541:0x09fe, B:550:0x0a14, B:547:0x0a0d, B:549:0x0a11, B:529:0x09d5, B:532:0x09e3, B:533:0x09ea, B:534:0x09eb, B:457:0x0887, B:459:0x088d, B:461:0x0891, B:488:0x0929, B:490:0x0936, B:466:0x089d, B:468:0x08a1, B:470:0x08b5, B:472:0x08c0, B:474:0x08cc, B:478:0x08d5, B:480:0x08df, B:486:0x08ea, B:491:0x0942, B:493:0x0948, B:495:0x094c, B:499:0x0955, B:501:0x0963, B:503:0x096b, B:505:0x0975, B:506:0x097a, B:507:0x097f, B:508:0x0984, B:442:0x084c, B:357:0x06ee, B:359:0x06f2, B:361:0x06fa, B:363:0x0700, B:365:0x070a, B:368:0x0710, B:369:0x0713, B:371:0x071b, B:373:0x072d, B:375:0x0735, B:377:0x073d, B:381:0x0747, B:383:0x076e, B:384:0x0771, B:385:0x077c, B:387:0x0781, B:389:0x0787, B:390:0x078e, B:393:0x079c, B:259:0x0521, B:261:0x0527, B:264:0x0530, B:267:0x053b, B:269:0x0541, B:272:0x054f, B:274:0x0555, B:276:0x0561, B:277:0x0564, B:279:0x056c, B:281:0x057a, B:283:0x05b5, B:285:0x05bf, B:287:0x05c9, B:289:0x05d1, B:290:0x05d4, B:291:0x05d7, B:293:0x05dd, B:295:0x05eb, B:297:0x05f0, B:299:0x05fa, B:301:0x0604, B:303:0x0615, B:305:0x061b, B:306:0x0626, B:307:0x0629, B:309:0x062f, B:312:0x0634, B:314:0x0639, B:316:0x0641, B:318:0x0647, B:320:0x064d, B:324:0x065b, B:326:0x0663, B:327:0x0666, B:255:0x0511, B:551:0x0a19, B:555:0x0a20, B:126:0x02df, B:128:0x02e3, B:129:0x02e6, B:132:0x02ed, B:135:0x02f0), top: B:630:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:505:0x0975 A[Catch: RuntimeException -> 0x0043, IOException -> 0x0046, zztr -> 0x0049, zzge -> 0x004c, zzbh -> 0x004f, zzri -> 0x0052, zzig -> 0x0055, LOOP:7: B:504:0x0973->B:505:0x0975, LOOP_END, TryCatch #13 {zzbh -> 0x004f, zzge -> 0x004c, zzig -> 0x0055, zzri -> 0x0052, zztr -> 0x0049, IOException -> 0x0046, RuntimeException -> 0x0043, blocks: (B:3:0x0006, B:4:0x000f, B:6:0x0013, B:9:0x002d, B:25:0x0058, B:26:0x0068, B:27:0x007f, B:28:0x0083, B:29:0x0087, B:33:0x008e, B:35:0x0097, B:37:0x00a5, B:38:0x00ac, B:39:0x00b6, B:40:0x00ca, B:41:0x00e2, B:42:0x00f8, B:44:0x0107, B:45:0x010b, B:46:0x011c, B:48:0x012b, B:49:0x0147, B:50:0x015a, B:51:0x0163, B:53:0x0175, B:54:0x0181, B:55:0x0191, B:57:0x019d, B:60:0x01a8, B:61:0x01af, B:62:0x01ba, B:66:0x01c1, B:68:0x01c9, B:70:0x01cd, B:72:0x01d3, B:74:0x01db, B:76:0x01e3, B:77:0x01e6, B:79:0x01eb, B:85:0x01f7, B:86:0x01f8, B:90:0x01ff, B:92:0x020d, B:93:0x0210, B:94:0x0215, B:96:0x0225, B:97:0x0228, B:98:0x022d, B:99:0x0232, B:101:0x023e, B:102:0x024a, B:104:0x0256, B:106:0x0282, B:107:0x02a2, B:116:0x02cd, B:118:0x02d1, B:119:0x02d4, B:125:0x02de, B:136:0x02f1, B:137:0x02f6, B:138:0x02fe, B:142:0x0336, B:215:0x0461, B:193:0x0428, B:192:0x0424, B:223:0x0471, B:224:0x0479, B:150:0x0389, B:152:0x03a0, B:239:0x049d, B:241:0x04b8, B:244:0x04cb, B:246:0x04da, B:248:0x04e6, B:250:0x04fb, B:251:0x0500, B:252:0x0503, B:254:0x0507, B:256:0x0514, B:328:0x0669, B:330:0x0671, B:332:0x0679, B:335:0x067e, B:336:0x068a, B:338:0x068f, B:340:0x0697, B:343:0x06a7, B:345:0x06ad, B:346:0x06cb, B:348:0x06d1, B:350:0x06d7, B:352:0x06dc, B:354:0x06e0, B:394:0x079d, B:395:0x07a1, B:399:0x07ae, B:401:0x07b6, B:402:0x07bc, B:404:0x07ca, B:405:0x07e3, B:407:0x07e8, B:409:0x07f0, B:440:0x0844, B:410:0x07f6, B:412:0x0801, B:416:0x080a, B:421:0x0819, B:427:0x0826, B:429:0x082c, B:433:0x0835, B:439:0x0841, B:443:0x0855, B:445:0x085b, B:449:0x0863, B:451:0x086b, B:453:0x086f, B:454:0x0879, B:456:0x087f, B:509:0x0987, B:512:0x098e, B:514:0x0993, B:516:0x099b, B:518:0x09a9, B:519:0x09b0, B:520:0x09b3, B:522:0x09b9, B:524:0x09c2, B:526:0x09c8, B:528:0x09ce, B:535:0x09ef, B:537:0x09f5, B:541:0x09fe, B:550:0x0a14, B:547:0x0a0d, B:549:0x0a11, B:529:0x09d5, B:532:0x09e3, B:533:0x09ea, B:534:0x09eb, B:457:0x0887, B:459:0x088d, B:461:0x0891, B:488:0x0929, B:490:0x0936, B:466:0x089d, B:468:0x08a1, B:470:0x08b5, B:472:0x08c0, B:474:0x08cc, B:478:0x08d5, B:480:0x08df, B:486:0x08ea, B:491:0x0942, B:493:0x0948, B:495:0x094c, B:499:0x0955, B:501:0x0963, B:503:0x096b, B:505:0x0975, B:506:0x097a, B:507:0x097f, B:508:0x0984, B:442:0x084c, B:357:0x06ee, B:359:0x06f2, B:361:0x06fa, B:363:0x0700, B:365:0x070a, B:368:0x0710, B:369:0x0713, B:371:0x071b, B:373:0x072d, B:375:0x0735, B:377:0x073d, B:381:0x0747, B:383:0x076e, B:384:0x0771, B:385:0x077c, B:387:0x0781, B:389:0x0787, B:390:0x078e, B:393:0x079c, B:259:0x0521, B:261:0x0527, B:264:0x0530, B:267:0x053b, B:269:0x0541, B:272:0x054f, B:274:0x0555, B:276:0x0561, B:277:0x0564, B:279:0x056c, B:281:0x057a, B:283:0x05b5, B:285:0x05bf, B:287:0x05c9, B:289:0x05d1, B:290:0x05d4, B:291:0x05d7, B:293:0x05dd, B:295:0x05eb, B:297:0x05f0, B:299:0x05fa, B:301:0x0604, B:303:0x0615, B:305:0x061b, B:306:0x0626, B:307:0x0629, B:309:0x062f, B:312:0x0634, B:314:0x0639, B:316:0x0641, B:318:0x0647, B:320:0x064d, B:324:0x065b, B:326:0x0663, B:327:0x0666, B:255:0x0511, B:551:0x0a19, B:555:0x0a20, B:126:0x02df, B:128:0x02e3, B:129:0x02e6, B:132:0x02ed, B:135:0x02f0), top: B:630:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:534:0x09eb A[Catch: RuntimeException -> 0x0043, IOException -> 0x0046, zztr -> 0x0049, zzge -> 0x004c, zzbh -> 0x004f, zzri -> 0x0052, zzig -> 0x0055, TryCatch #13 {zzbh -> 0x004f, zzge -> 0x004c, zzig -> 0x0055, zzri -> 0x0052, zztr -> 0x0049, IOException -> 0x0046, RuntimeException -> 0x0043, blocks: (B:3:0x0006, B:4:0x000f, B:6:0x0013, B:9:0x002d, B:25:0x0058, B:26:0x0068, B:27:0x007f, B:28:0x0083, B:29:0x0087, B:33:0x008e, B:35:0x0097, B:37:0x00a5, B:38:0x00ac, B:39:0x00b6, B:40:0x00ca, B:41:0x00e2, B:42:0x00f8, B:44:0x0107, B:45:0x010b, B:46:0x011c, B:48:0x012b, B:49:0x0147, B:50:0x015a, B:51:0x0163, B:53:0x0175, B:54:0x0181, B:55:0x0191, B:57:0x019d, B:60:0x01a8, B:61:0x01af, B:62:0x01ba, B:66:0x01c1, B:68:0x01c9, B:70:0x01cd, B:72:0x01d3, B:74:0x01db, B:76:0x01e3, B:77:0x01e6, B:79:0x01eb, B:85:0x01f7, B:86:0x01f8, B:90:0x01ff, B:92:0x020d, B:93:0x0210, B:94:0x0215, B:96:0x0225, B:97:0x0228, B:98:0x022d, B:99:0x0232, B:101:0x023e, B:102:0x024a, B:104:0x0256, B:106:0x0282, B:107:0x02a2, B:116:0x02cd, B:118:0x02d1, B:119:0x02d4, B:125:0x02de, B:136:0x02f1, B:137:0x02f6, B:138:0x02fe, B:142:0x0336, B:215:0x0461, B:193:0x0428, B:192:0x0424, B:223:0x0471, B:224:0x0479, B:150:0x0389, B:152:0x03a0, B:239:0x049d, B:241:0x04b8, B:244:0x04cb, B:246:0x04da, B:248:0x04e6, B:250:0x04fb, B:251:0x0500, B:252:0x0503, B:254:0x0507, B:256:0x0514, B:328:0x0669, B:330:0x0671, B:332:0x0679, B:335:0x067e, B:336:0x068a, B:338:0x068f, B:340:0x0697, B:343:0x06a7, B:345:0x06ad, B:346:0x06cb, B:348:0x06d1, B:350:0x06d7, B:352:0x06dc, B:354:0x06e0, B:394:0x079d, B:395:0x07a1, B:399:0x07ae, B:401:0x07b6, B:402:0x07bc, B:404:0x07ca, B:405:0x07e3, B:407:0x07e8, B:409:0x07f0, B:440:0x0844, B:410:0x07f6, B:412:0x0801, B:416:0x080a, B:421:0x0819, B:427:0x0826, B:429:0x082c, B:433:0x0835, B:439:0x0841, B:443:0x0855, B:445:0x085b, B:449:0x0863, B:451:0x086b, B:453:0x086f, B:454:0x0879, B:456:0x087f, B:509:0x0987, B:512:0x098e, B:514:0x0993, B:516:0x099b, B:518:0x09a9, B:519:0x09b0, B:520:0x09b3, B:522:0x09b9, B:524:0x09c2, B:526:0x09c8, B:528:0x09ce, B:535:0x09ef, B:537:0x09f5, B:541:0x09fe, B:550:0x0a14, B:547:0x0a0d, B:549:0x0a11, B:529:0x09d5, B:532:0x09e3, B:533:0x09ea, B:534:0x09eb, B:457:0x0887, B:459:0x088d, B:461:0x0891, B:488:0x0929, B:490:0x0936, B:466:0x089d, B:468:0x08a1, B:470:0x08b5, B:472:0x08c0, B:474:0x08cc, B:478:0x08d5, B:480:0x08df, B:486:0x08ea, B:491:0x0942, B:493:0x0948, B:495:0x094c, B:499:0x0955, B:501:0x0963, B:503:0x096b, B:505:0x0975, B:506:0x097a, B:507:0x097f, B:508:0x0984, B:442:0x084c, B:357:0x06ee, B:359:0x06f2, B:361:0x06fa, B:363:0x0700, B:365:0x070a, B:368:0x0710, B:369:0x0713, B:371:0x071b, B:373:0x072d, B:375:0x0735, B:377:0x073d, B:381:0x0747, B:383:0x076e, B:384:0x0771, B:385:0x077c, B:387:0x0781, B:389:0x0787, B:390:0x078e, B:393:0x079c, B:259:0x0521, B:261:0x0527, B:264:0x0530, B:267:0x053b, B:269:0x0541, B:272:0x054f, B:274:0x0555, B:276:0x0561, B:277:0x0564, B:279:0x056c, B:281:0x057a, B:283:0x05b5, B:285:0x05bf, B:287:0x05c9, B:289:0x05d1, B:290:0x05d4, B:291:0x05d7, B:293:0x05dd, B:295:0x05eb, B:297:0x05f0, B:299:0x05fa, B:301:0x0604, B:303:0x0615, B:305:0x061b, B:306:0x0626, B:307:0x0629, B:309:0x062f, B:312:0x0634, B:314:0x0639, B:316:0x0641, B:318:0x0647, B:320:0x064d, B:324:0x065b, B:326:0x0663, B:327:0x0666, B:255:0x0511, B:551:0x0a19, B:555:0x0a20, B:126:0x02df, B:128:0x02e3, B:129:0x02e6, B:132:0x02ed, B:135:0x02f0), top: B:630:0x0006 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:503:0x096b, please report this as an issue */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        boolean z4;
        int i;
        zzkq zzkqVarZzf;
        long j4;
        boolean z10;
        long j10;
        long j11;
        zzur zzurVar;
        boolean z11;
        long jZza;
        zzlg zzlgVar;
        int i10;
        zzlg zzlgVarZzz;
        int i11;
        long j12;
        zzig zzigVar;
        long j13;
        int i12;
        int i13;
        long j14;
        boolean z12;
        boolean z13;
        zzlg zzlgVar2;
        zzkq zzkqVarZze;
        int i14;
        zzkq zzkqVarZze2;
        long jZzb;
        zzkq zzkqVarZzd;
        boolean z14;
        boolean z15;
        long j15;
        zzkq zzkqVarZze3;
        zzkq zzkqVarZzg;
        boolean z16;
        zzkr zzkrVarZzg;
        final zzkh zzkhVar = this;
        try {
            int i15 = -1;
            zzig zzigVar2 = null;
            switch (message.what) {
                case 1:
                    boolean z17 = message.arg1 != 0;
                    int i16 = message.arg2;
                    zzkhVar.zzU(z17, i16 >> 4, true, i16 & 15);
                    z4 = true;
                    zzkhVar.zzJ();
                    return z4;
                case 2:
                    long j16 = -9223372036854775807L;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    zzkhVar.zzj.zzf(2);
                    if (zzkhVar.zzz.zza.zzo() || !zzkhVar.zzt.zzj()) {
                        i11 = 3;
                        j12 = jUptimeMillis;
                        zzigVar = null;
                        j13 = -9223372036854775807L;
                        i12 = 2;
                        i13 = 4;
                    } else {
                        zzkhVar.zzs.zzl(zzkhVar.zzM);
                        if (zzkhVar.zzs.zzr() && (zzkrVarZzg = zzkhVar.zzs.zzg(zzkhVar.zzM, zzkhVar.zzz)) != null) {
                            zzkq zzkqVarZzc = zzkhVar.zzs.zzc(zzkrVarZzg);
                            zzkqVarZzc.zza.zzl(zzkhVar, zzkrVarZzg.zzb);
                            if (zzkhVar.zzs.zze() == zzkqVarZzc) {
                                zzkhVar.zzP(zzkrVarZzg.zzb);
                            }
                            zzkhVar.zzE(false);
                        }
                        if (zzkhVar.zzG) {
                            zzkhVar.zzG = zzkhVar.zzaf();
                            zzkhVar.zzZ();
                        } else {
                            zzkhVar.zzI();
                        }
                        zzkq zzkqVarZzf2 = zzkhVar.zzs.zzf();
                        if (zzkqVarZzf2 == null) {
                            j12 = jUptimeMillis;
                            i12 = 2;
                        } else if (zzkqVarZzf2.zzg() == null || zzkhVar.zzD) {
                            j12 = jUptimeMillis;
                            i12 = 2;
                            if (zzkqVarZzf2.zzf.zzi || zzkhVar.zzD) {
                                int i17 = 0;
                                while (true) {
                                    zzln[] zzlnVarArr = zzkhVar.zzb;
                                    int length = zzlnVarArr.length;
                                    if (i17 < 2) {
                                        zzln zzlnVar = zzlnVarArr[i17];
                                        zzwg zzwgVar = zzkqVarZzf2.zzc[i17];
                                        if (zzwgVar != null && zzlnVar.zzp() == zzwgVar && zzlnVar.zzQ()) {
                                            long j17 = zzkqVarZzf2.zzf.zze;
                                            zzao(zzlnVar, (j17 == -9223372036854775807L || j17 == Long.MIN_VALUE) ? -9223372036854775807L : j17 + zzkqVarZzf2.zze());
                                        }
                                        i17++;
                                    }
                                }
                            }
                        } else {
                            zzkq zzkqVarZzf3 = zzkhVar.zzs.zzf();
                            if (zzkqVarZzf3.zzd) {
                                int i18 = 0;
                                while (true) {
                                    zzln[] zzlnVarArr2 = zzkhVar.zzb;
                                    int length2 = zzlnVarArr2.length;
                                    if (i18 < 2) {
                                        zzln zzlnVar2 = zzlnVarArr2[i18];
                                        zzwg zzwgVar2 = zzkqVarZzf3.zzc[i18];
                                        if (zzlnVar2.zzp() == zzwgVar2) {
                                            if (zzwgVar2 == null || zzlnVar2.zzQ()) {
                                                i18++;
                                            } else {
                                                zzkqVarZzf3.zzg();
                                                boolean z18 = zzkqVarZzf3.zzf.zzf;
                                            }
                                        }
                                    } else if (zzkqVarZzf2.zzg().zzd || zzkhVar.zzM >= zzkqVarZzf2.zzg().zzf()) {
                                        zzyk zzykVarZzi = zzkqVarZzf2.zzi();
                                        zzkq zzkqVarZzb = zzkhVar.zzs.zzb();
                                        zzyk zzykVarZzi2 = zzkqVarZzb.zzi();
                                        zzbv zzbvVar = zzkhVar.zzz.zza;
                                        j12 = jUptimeMillis;
                                        i12 = 2;
                                        zzkhVar.zzac(zzbvVar, zzkqVarZzb.zzf.zza, zzbvVar, zzkqVarZzf2.zzf.zza, -9223372036854775807L, false);
                                        if (!zzkqVarZzb.zzd || zzkqVarZzb.zza.zzd() == -9223372036854775807L) {
                                            int i19 = 0;
                                            while (true) {
                                                int length3 = zzkhVar.zzb.length;
                                                if (i19 < 2) {
                                                    boolean zZzb = zzykVarZzi.zzb(i19);
                                                    boolean zZzb2 = zzykVarZzi2.zzb(i19);
                                                    if (zZzb && !zzkhVar.zzb[i19].zzR()) {
                                                        zzkhVar.zzd[i19].zzb();
                                                        zzlr zzlrVar = zzykVarZzi.zzb[i19];
                                                        zzlr zzlrVar2 = zzykVarZzi2.zzb[i19];
                                                        if (!zZzb2 || !zzlrVar2.equals(zzlrVar)) {
                                                            zzao(zzkhVar.zzb[i19], zzkqVarZzb.zzf());
                                                        }
                                                    }
                                                    i19++;
                                                }
                                            }
                                        } else {
                                            long jZzf = zzkqVarZzb.zzf();
                                            zzln[] zzlnVarArr3 = zzkhVar.zzb;
                                            int length4 = zzlnVarArr3.length;
                                            for (int i20 = 0; i20 < 2; i20++) {
                                                zzln zzlnVar3 = zzlnVarArr3[i20];
                                                if (zzlnVar3.zzp() != null) {
                                                    zzao(zzlnVar3, jZzf);
                                                }
                                            }
                                            if (!zzkqVarZzb.zzr()) {
                                                zzkhVar.zzs.zzq(zzkqVarZzb);
                                                zzkhVar.zzE(false);
                                                zzkhVar.zzI();
                                            }
                                        }
                                    }
                                    j12 = jUptimeMillis;
                                    i12 = 2;
                                }
                            } else {
                                j12 = jUptimeMillis;
                                i12 = 2;
                            }
                        }
                        zzkq zzkqVarZzf4 = zzkhVar.zzs.zzf();
                        if (zzkqVarZzf4 != null && zzkhVar.zzs.zze() != zzkqVarZzf4 && !zzkqVarZzf4.zzg) {
                            zzkq zzkqVarZzf5 = zzkhVar.zzs.zzf();
                            zzyk zzykVarZzi3 = zzkqVarZzf5.zzi();
                            boolean z19 = false;
                            int i21 = 0;
                            while (true) {
                                zzln[] zzlnVarArr4 = zzkhVar.zzb;
                                int length5 = zzlnVarArr4.length;
                                if (i21 < i12) {
                                    zzln zzlnVar4 = zzlnVarArr4[i21];
                                    if (zzag(zzlnVar4)) {
                                        zzwg zzwgVarZzp = zzlnVar4.zzp();
                                        zzwg zzwgVar3 = zzkqVarZzf5.zzc[i21];
                                        if (!zzykVarZzi3.zzb(i21) || zzwgVarZzp != zzwgVar3) {
                                            if (!zzlnVar4.zzR()) {
                                                zzlnVar4.zzH(zzal(zzykVarZzi3.zzc[i21]), zzkqVarZzf5.zzc[i21], zzkqVarZzf5.zzf(), zzkqVarZzf5.zze(), zzkqVarZzf5.zzf.zza);
                                            } else if (zzlnVar4.zzW()) {
                                                zzkhVar.zzA(i21);
                                            } else {
                                                z19 = true;
                                            }
                                        }
                                    }
                                    i21++;
                                } else if (!z19) {
                                    zzkhVar.zzB();
                                }
                            }
                        }
                        boolean z20 = false;
                        while (zzkhVar.zzaj() && !zzkhVar.zzD && (zzkqVarZze3 = zzkhVar.zzs.zze()) != null && (zzkqVarZzg = zzkqVarZze3.zzg()) != null && zzkhVar.zzM >= zzkqVarZzg.zzf() && zzkqVarZzg.zzg) {
                            if (z20) {
                                zzkhVar.zzJ();
                            }
                            zzkq zzkqVarZza = zzkhVar.zzs.zza();
                            if (zzkqVarZza == null) {
                                throw zzigVar2;
                            }
                            if (zzkhVar.zzz.zzb.zza.equals(zzkqVarZza.zzf.zza.zza)) {
                                zzur zzurVar2 = zzkhVar.zzz.zzb;
                                if (zzurVar2.zzb == i15) {
                                    zzur zzurVar3 = zzkqVarZza.zzf.zza;
                                    if (zzurVar3.zzb != i15 || zzurVar2.zze == zzurVar3.zze) {
                                        z16 = false;
                                    } else {
                                        z16 = true;
                                    }
                                } else {
                                    z16 = false;
                                }
                            } else {
                                z16 = false;
                            }
                            zzkr zzkrVar = zzkqVarZza.zzf;
                            boolean z21 = z16;
                            zzur zzurVar4 = zzkrVar.zza;
                            long j18 = zzkrVar.zzb;
                            zzig zzigVar3 = zzigVar2;
                            long j19 = j16;
                            zzkhVar.zzz = zzkhVar.zzz(zzurVar4, j18, zzkrVar.zzc, j18, !z21, 0);
                            zzkhVar.zzO();
                            zzkhVar.zzab();
                            if (zzkhVar.zzz.zze == 3) {
                                zzkhVar.zzW();
                            }
                            zzyk zzykVarZzi4 = zzkhVar.zzs.zze().zzi();
                            int i22 = 0;
                            while (true) {
                                int length6 = zzkhVar.zzb.length;
                                if (i22 < i12) {
                                    if (zzykVarZzi4.zzb(i22)) {
                                        zzkhVar.zzb[i22].zzt();
                                    }
                                    i22++;
                                }
                            }
                            j16 = j19;
                            zzigVar2 = zzigVar3;
                            z20 = true;
                            i15 = -1;
                        }
                        zzigVar = zzigVar2;
                        j13 = j16;
                        i11 = 3;
                        i13 = 4;
                        long j20 = zzkhVar.zzS.zzb;
                    }
                    int i23 = zzkhVar.zzz.zze;
                    z4 = true;
                    if (i23 != 1) {
                        if (i23 != i13) {
                            zzkq zzkqVarZze4 = zzkhVar.zzs.zze();
                            if (zzkqVarZze4 == null) {
                                zzkhVar.zzR(j12);
                            } else {
                                long j21 = j12;
                                Trace.beginSection("doSomeWork");
                                zzkhVar.zzab();
                                if (zzkqVarZze4.zzd) {
                                    zzkhVar.zzN = zzen.zzs(SystemClock.elapsedRealtime());
                                    zzkqVarZze4.zza.zzj(zzkhVar.zzz.zzs - zzkhVar.zzo, false);
                                    int i24 = 0;
                                    z12 = true;
                                    z13 = true;
                                    while (true) {
                                        zzln[] zzlnVarArr5 = zzkhVar.zzb;
                                        int length7 = zzlnVarArr5.length;
                                        if (i24 < i12) {
                                            zzln zzlnVar5 = zzlnVarArr5[i24];
                                            if (zzag(zzlnVar5)) {
                                                j15 = j13;
                                                zzlnVar5.zzV(zzkhVar.zzM, zzkhVar.zzN);
                                                z12 = z12 && zzlnVar5.zzW();
                                                boolean z22 = zzkqVarZze4.zzc[i24] != zzlnVar5.zzp();
                                                boolean z23 = z22 || (!z22 && zzlnVar5.zzQ()) || zzlnVar5.zzX() || zzlnVar5.zzW();
                                                zzkhVar.zzK(i24, z23);
                                                z13 = z13 && z23;
                                                if (!z23) {
                                                    zzlnVar5.zzw();
                                                }
                                            } else {
                                                zzkhVar.zzK(i24, false);
                                                j15 = j13;
                                            }
                                            i24++;
                                            j13 = j15;
                                        } else {
                                            j14 = j13;
                                        }
                                    }
                                } else {
                                    j14 = j13;
                                    zzkqVarZze4.zza.zzk();
                                    z12 = true;
                                    z13 = true;
                                }
                                long j22 = zzkqVarZze4.zzf.zze;
                                if (z12 && zzkqVarZze4.zzd && (j22 == j14 || j22 <= zzkhVar.zzz.zzs)) {
                                    if (zzkhVar.zzD) {
                                        zzkhVar.zzD = false;
                                        zzkhVar.zzU(false, zzkhVar.zzz.zzn, false, 5);
                                    }
                                    if (zzkqVarZze4.zzf.zzi) {
                                        zzkhVar.zzV(i13);
                                        zzkhVar.zzY();
                                    } else {
                                        zzlgVar2 = zzkhVar.zzz;
                                        if (zzlgVar2.zze != i12) {
                                            if (zzkhVar.zzz.zze == i11) {
                                                if (zzkhVar.zzK == 0) {
                                                    if (!zzkhVar.zzah()) {
                                                        zzkhVar.zzad(zzkhVar.zzaj(), false);
                                                        zzkhVar.zzV(i12);
                                                        if (zzkhVar.zzE) {
                                                            for (zzkqVarZze = zzkhVar.zzs.zze(); zzkqVarZze != null; zzkqVarZze = zzkqVarZze.zzg()) {
                                                                for (zzyd zzydVar : zzkqVarZze.zzi().zzc) {
                                                                }
                                                            }
                                                            zzkhVar.zzU.zzc();
                                                        }
                                                        zzkhVar.zzY();
                                                    }
                                                } else if (!z13) {
                                                    zzkhVar.zzad(zzkhVar.zzaj(), false);
                                                    zzkhVar.zzV(i12);
                                                    if (zzkhVar.zzE) {
                                                        while (zzkqVarZze != null) {
                                                            while (i14 < r7) {
                                                            }
                                                        }
                                                        zzkhVar.zzU.zzc();
                                                    }
                                                    zzkhVar.zzY();
                                                }
                                            }
                                        } else if (zzkhVar.zzK == 0) {
                                            if (z13) {
                                                if (zzlgVar2.zzg) {
                                                    zzkqVarZze2 = zzkhVar.zzs.zze();
                                                    if (zzkhVar.zzak(zzkhVar.zzz.zza, zzkqVarZze2.zzf.zza)) {
                                                        jZzb = zzkhVar.zzU.zzb();
                                                    } else {
                                                        jZzb = j14;
                                                    }
                                                    zzkqVarZzd = zzkhVar.zzs.zzd();
                                                    if (zzkqVarZzd.zzr()) {
                                                        z14 = false;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    if (zzkqVarZzd.zzf.zza.zzb()) {
                                                        z15 = false;
                                                    } else {
                                                        z15 = false;
                                                    }
                                                    if (!z14) {
                                                    }
                                                }
                                                zzkhVar.zzV(i11);
                                                zzkhVar.zzQ = zzigVar;
                                                if (zzkhVar.zzaj()) {
                                                    zzkhVar.zzad(false, false);
                                                    zzkhVar.zzp.zzh();
                                                    zzkhVar.zzW();
                                                }
                                            }
                                            if (zzkhVar.zzz.zze == i11) {
                                                if (zzkhVar.zzK == 0) {
                                                    if (!zzkhVar.zzah()) {
                                                        zzkhVar.zzad(zzkhVar.zzaj(), false);
                                                        zzkhVar.zzV(i12);
                                                        if (zzkhVar.zzE) {
                                                            while (zzkqVarZze != null) {
                                                                while (i14 < r7) {
                                                                }
                                                            }
                                                            zzkhVar.zzU.zzc();
                                                        }
                                                        zzkhVar.zzY();
                                                    }
                                                } else if (!z13) {
                                                    zzkhVar.zzad(zzkhVar.zzaj(), false);
                                                    zzkhVar.zzV(i12);
                                                    if (zzkhVar.zzE) {
                                                        while (zzkqVarZze != null) {
                                                            while (i14 < r7) {
                                                            }
                                                        }
                                                        zzkhVar.zzU.zzc();
                                                    }
                                                    zzkhVar.zzY();
                                                }
                                            }
                                        } else if (zzkhVar.zzah()) {
                                            zzkhVar.zzV(i11);
                                            zzkhVar.zzQ = zzigVar;
                                            if (zzkhVar.zzaj()) {
                                                zzkhVar.zzad(false, false);
                                                zzkhVar.zzp.zzh();
                                                zzkhVar.zzW();
                                            }
                                        } else if (zzkhVar.zzz.zze == i11) {
                                            if (zzkhVar.zzK == 0) {
                                                if (!zzkhVar.zzah()) {
                                                    zzkhVar.zzad(zzkhVar.zzaj(), false);
                                                    zzkhVar.zzV(i12);
                                                    if (zzkhVar.zzE) {
                                                        while (zzkqVarZze != null) {
                                                            while (i14 < r7) {
                                                            }
                                                        }
                                                        zzkhVar.zzU.zzc();
                                                    }
                                                    zzkhVar.zzY();
                                                }
                                            } else if (!z13) {
                                                zzkhVar.zzad(zzkhVar.zzaj(), false);
                                                zzkhVar.zzV(i12);
                                                if (zzkhVar.zzE) {
                                                    while (zzkqVarZze != null) {
                                                        while (i14 < r7) {
                                                        }
                                                    }
                                                    zzkhVar.zzU.zzc();
                                                }
                                                zzkhVar.zzY();
                                            }
                                        }
                                    }
                                } else {
                                    zzlgVar2 = zzkhVar.zzz;
                                    if (zzlgVar2.zze != i12) {
                                        if (zzkhVar.zzz.zze == i11) {
                                            if (zzkhVar.zzK == 0) {
                                                if (!zzkhVar.zzah()) {
                                                    zzkhVar.zzad(zzkhVar.zzaj(), false);
                                                    zzkhVar.zzV(i12);
                                                    if (zzkhVar.zzE) {
                                                        while (zzkqVarZze != null) {
                                                            while (i14 < r7) {
                                                            }
                                                        }
                                                        zzkhVar.zzU.zzc();
                                                    }
                                                    zzkhVar.zzY();
                                                }
                                            } else if (!z13) {
                                                zzkhVar.zzad(zzkhVar.zzaj(), false);
                                                zzkhVar.zzV(i12);
                                                if (zzkhVar.zzE) {
                                                    while (zzkqVarZze != null) {
                                                        while (i14 < r7) {
                                                        }
                                                    }
                                                    zzkhVar.zzU.zzc();
                                                }
                                                zzkhVar.zzY();
                                            }
                                        }
                                    } else if (zzkhVar.zzK == 0) {
                                        if (z13) {
                                            if (zzlgVar2.zzg) {
                                                zzkqVarZze2 = zzkhVar.zzs.zze();
                                                if (zzkhVar.zzak(zzkhVar.zzz.zza, zzkqVarZze2.zzf.zza)) {
                                                    jZzb = zzkhVar.zzU.zzb();
                                                } else {
                                                    jZzb = j14;
                                                }
                                                zzkqVarZzd = zzkhVar.zzs.zzd();
                                                if (zzkqVarZzd.zzr() || !zzkqVarZzd.zzf.zzi) {
                                                    z14 = false;
                                                } else {
                                                    z14 = true;
                                                }
                                                if (zzkqVarZzd.zzf.zza.zzb() || zzkqVarZzd.zzd) {
                                                    z15 = false;
                                                } else {
                                                    z15 = true;
                                                }
                                                if (!z14 || z15 || zzkhVar.zzh.zzi(new zzkk(zzkhVar.zzv, zzkhVar.zzz.zza, zzkqVarZze2.zzf.zza, zzkhVar.zzM - zzkqVarZze2.zze(), zzkhVar.zzt(), zzkhVar.zzp.zzc().zzb, zzkhVar.zzz.zzl, zzkhVar.zzE, jZzb))) {
                                                }
                                            }
                                            zzkhVar.zzV(i11);
                                            zzkhVar.zzQ = zzigVar;
                                            if (zzkhVar.zzaj()) {
                                                zzkhVar.zzad(false, false);
                                                zzkhVar.zzp.zzh();
                                                zzkhVar.zzW();
                                            }
                                        }
                                        if (zzkhVar.zzz.zze == i11) {
                                            if (zzkhVar.zzK == 0) {
                                                if (!zzkhVar.zzah()) {
                                                    zzkhVar.zzad(zzkhVar.zzaj(), false);
                                                    zzkhVar.zzV(i12);
                                                    if (zzkhVar.zzE) {
                                                        while (zzkqVarZze != null) {
                                                            while (i14 < r7) {
                                                            }
                                                        }
                                                        zzkhVar.zzU.zzc();
                                                    }
                                                    zzkhVar.zzY();
                                                }
                                            } else if (!z13) {
                                                zzkhVar.zzad(zzkhVar.zzaj(), false);
                                                zzkhVar.zzV(i12);
                                                if (zzkhVar.zzE) {
                                                    while (zzkqVarZze != null) {
                                                        while (i14 < r7) {
                                                        }
                                                    }
                                                    zzkhVar.zzU.zzc();
                                                }
                                                zzkhVar.zzY();
                                            }
                                        }
                                    } else if (zzkhVar.zzah()) {
                                        zzkhVar.zzV(i11);
                                        zzkhVar.zzQ = zzigVar;
                                        if (zzkhVar.zzaj()) {
                                            zzkhVar.zzad(false, false);
                                            zzkhVar.zzp.zzh();
                                            zzkhVar.zzW();
                                        }
                                    } else if (zzkhVar.zzz.zze == i11) {
                                        if (zzkhVar.zzK == 0) {
                                            if (!zzkhVar.zzah()) {
                                                zzkhVar.zzad(zzkhVar.zzaj(), false);
                                                zzkhVar.zzV(i12);
                                                if (zzkhVar.zzE) {
                                                    while (zzkqVarZze != null) {
                                                        while (i14 < r7) {
                                                        }
                                                    }
                                                    zzkhVar.zzU.zzc();
                                                }
                                                zzkhVar.zzY();
                                            }
                                        } else if (!z13) {
                                            zzkhVar.zzad(zzkhVar.zzaj(), false);
                                            zzkhVar.zzV(i12);
                                            if (zzkhVar.zzE) {
                                                while (zzkqVarZze != null) {
                                                    while (i14 < r7) {
                                                    }
                                                }
                                                zzkhVar.zzU.zzc();
                                            }
                                            zzkhVar.zzY();
                                        }
                                    }
                                }
                                if (zzkhVar.zzz.zze == i12) {
                                    int i25 = 0;
                                    while (true) {
                                        zzln[] zzlnVarArr6 = zzkhVar.zzb;
                                        int length8 = zzlnVarArr6.length;
                                        if (i25 < i12) {
                                            if (zzag(zzlnVarArr6[i25]) && zzkhVar.zzb[i25].zzp() == zzkqVarZze4.zzc[i25]) {
                                                zzkhVar.zzb[i25].zzw();
                                            }
                                            i25++;
                                        } else {
                                            zzlg zzlgVar3 = zzkhVar.zzz;
                                            if (zzlgVar3.zzg || zzlgVar3.zzr >= 500000 || !zzkhVar.zzaf()) {
                                                zzkhVar.zzR = j14;
                                            } else if (zzkhVar.zzR == j14) {
                                                zzkhVar.zzR = SystemClock.elapsedRealtime();
                                            } else if (SystemClock.elapsedRealtime() - zzkhVar.zzR >= 4000) {
                                                throw new IllegalStateException("Playback stuck buffering and not loading");
                                            }
                                        }
                                    }
                                } else {
                                    zzkhVar.zzR = j14;
                                }
                                boolean z24 = zzkhVar.zzaj() && zzkhVar.zzz.zze == i11;
                                zzlg zzlgVar4 = zzkhVar.zzz;
                                boolean z25 = zzlgVar4.zzp;
                                int i26 = zzlgVar4.zze;
                                if (i26 != i13 && (z24 || i26 == i12 || (i26 == i11 && zzkhVar.zzK != 0))) {
                                    zzkhVar.zzR(j21);
                                }
                                Trace.endSection();
                            }
                        }
                        z4 = true;
                    }
                    zzkhVar.zzJ();
                    return z4;
                case 3:
                    try {
                        zzkf zzkfVar = (zzkf) message.obj;
                        zzkhVar.zzA.zza(1);
                        Pair pairZzy = zzy(zzkhVar.zzz.zza, zzkfVar, true, zzkhVar.zzH, zzkhVar.zzI, zzkhVar.zzm, zzkhVar.zzn);
                        if (pairZzy == null) {
                            Pair pairZzx = zzkhVar.zzx(zzkhVar.zzz.zza);
                            zzur zzurVar5 = (zzur) pairZzx.first;
                            long jLongValue = ((Long) pairZzx.second).longValue();
                            z10 = !zzkhVar.zzz.zza.zzo();
                            zzurVar = zzurVar5;
                            j11 = jLongValue;
                            j10 = -9223372036854775807L;
                            j4 = 0;
                        } else {
                            Object obj = pairZzy.first;
                            j4 = 0;
                            long jLongValue2 = ((Long) pairZzy.second).longValue();
                            long j23 = zzkfVar.zzc == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
                            zzur zzurVarZzi = zzkhVar.zzs.zzi(zzkhVar.zzz.zza, obj, jLongValue2);
                            if (zzurVarZzi.zzb()) {
                                zzkhVar.zzz.zza.zzn(zzurVarZzi.zza, zzkhVar.zzn);
                                if (zzkhVar.zzn.zze(zzurVarZzi.zzb) == zzurVarZzi.zzc) {
                                    zzkhVar.zzn.zzh();
                                }
                                j10 = j23;
                                zzurVar = zzurVarZzi;
                                z10 = true;
                                j11 = 0;
                            } else {
                                z10 = zzkfVar.zzc == -9223372036854775807L;
                                j10 = j23;
                                j11 = jLongValue2;
                                zzurVar = zzurVarZzi;
                            }
                        }
                        try {
                            if (!zzkhVar.zzz.zza.zzo()) {
                                if (pairZzy == null) {
                                    if (zzkhVar.zzz.zze != 1) {
                                        zzkhVar.zzV(4);
                                    }
                                    zzkhVar.zzN(false, true, false, true);
                                } else {
                                    if (zzurVar.equals(zzkhVar.zzz.zzb)) {
                                        zzkq zzkqVarZze5 = zzkhVar.zzs.zze();
                                        jZza = (zzkqVarZze5 == null || !zzkqVarZze5.zzd || j11 == j4) ? j11 : zzkqVarZze5.zza.zza(j11, zzkhVar.zzy);
                                        z11 = true;
                                        try {
                                            if (zzen.zzv(jZza) == zzen.zzv(zzkhVar.zzz.zzs) && ((i10 = (zzlgVar = zzkhVar.zzz).zze) == 2 || i10 == 3)) {
                                                long j24 = zzlgVar.zzs;
                                                zzlgVarZzz = zzkhVar.zzz(zzurVar, j24, j10, j24, z10, 2);
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            z10 = z10;
                                            zzkhVar.zzz = zzkhVar.zzz(zzurVar, j11, j10, j11, z10, 2);
                                            throw th;
                                        }
                                    } else {
                                        z11 = true;
                                        jZza = j11;
                                    }
                                    try {
                                        long jZzv = zzkhVar.zzv(zzurVar, jZza, zzkhVar.zzz.zze == 4 ? z11 : false);
                                        z10 |= j11 != jZzv ? z11 : false;
                                        try {
                                            zzlg zzlgVar5 = zzkhVar.zzz;
                                            zzur zzurVar6 = zzurVar;
                                            try {
                                                zzbv zzbvVar2 = zzlgVar5.zza;
                                                long j25 = j10;
                                                try {
                                                    zzkhVar.zzac(zzbvVar2, zzurVar6, zzbvVar2, zzlgVar5.zzb, j25, true);
                                                    zzurVar = zzurVar6;
                                                    j10 = j25;
                                                    j11 = jZzv;
                                                    zzkhVar = this;
                                                    zzlgVarZzz = zzkhVar.zzz(zzurVar, j11, j10, j11, z10, 2);
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    zzurVar = zzurVar6;
                                                    j10 = j25;
                                                    j11 = jZzv;
                                                    zzkhVar.zzz = zzkhVar.zzz(zzurVar, j11, j10, j11, z10, 2);
                                                    throw th;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                zzurVar = zzurVar6;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                }
                                zzkhVar.zzz = zzlgVarZzz;
                                z4 = z11;
                                zzkhVar.zzJ();
                                return z4;
                            }
                            zzkhVar.zzL = zzkfVar;
                            z10 = z10;
                            z11 = true;
                            zzkhVar = this;
                            zzlgVarZzz = zzkhVar.zzz(zzurVar, j11, j10, j11, z10, 2);
                            zzkhVar.zzz = zzlgVarZzz;
                            z4 = z11;
                        } catch (Throwable th6) {
                            th = th6;
                            z10 = z10;
                        }
                    } catch (zzbh e) {
                        e = e;
                        zzkhVar.zzD(e, e.zzb == 1 ? true != e.zza ? 3003 : 3001 : zzbbs.zzq.zzf);
                        z4 = true;
                    } catch (zzge e4) {
                        e = e4;
                        zzkhVar.zzD(e, e.zza);
                        z4 = true;
                    } catch (zzig e10) {
                        e = e10;
                        if (e.zzc == 1 && (zzkqVarZzf = zzkhVar.zzs.zzf()) != null) {
                            e = e.zza(zzkqVarZzf.zzf.zza);
                        }
                        if (e.zzi && (zzkhVar.zzQ == null || (i = e.zza) == 5004 || i == 5003)) {
                            zzdt.zzg("ExoPlayerImplInternal", "Recoverable renderer error", e);
                            zzig zzigVar4 = zzkhVar.zzQ;
                            if (zzigVar4 != null) {
                                zzigVar4.addSuppressed(e);
                                e = zzkhVar.zzQ;
                            } else {
                                zzkhVar.zzQ = e;
                            }
                            zzdm zzdmVar = zzkhVar.zzj;
                            zzdmVar.zzk(zzdmVar.zzc(25, e));
                            z4 = true;
                        } else {
                            zzig zzigVar5 = zzkhVar.zzQ;
                            if (zzigVar5 != null) {
                                zzigVar5.addSuppressed(e);
                                e = zzkhVar.zzQ;
                            }
                            zzdt.zzd("ExoPlayerImplInternal", "Playback error", e);
                            z4 = true;
                            if (e.zzc == 1) {
                                zzkt zzktVar = zzkhVar.zzs;
                                if (zzktVar.zze() != zzktVar.zzf()) {
                                    while (true) {
                                        zzkt zzktVar2 = zzkhVar.zzs;
                                        if (zzktVar2.zze() != zzktVar2.zzf()) {
                                            zzkhVar.zzs.zza();
                                        } else {
                                            zzkq zzkqVarZze6 = zzkhVar.zzs.zze();
                                            zzkqVarZze6.getClass();
                                            zzkhVar.zzJ();
                                            zzkr zzkrVar2 = zzkqVarZze6.zzf;
                                            zzur zzurVar7 = zzkrVar2.zza;
                                            long j26 = zzkrVar2.zzb;
                                            zzkhVar.zzz = zzkhVar.zzz(zzurVar7, j26, zzkrVar2.zzc, j26, true, 0);
                                        }
                                    }
                                }
                                z4 = true;
                            }
                            zzkhVar.zzX(z4, false);
                            zzkhVar.zzz = zzkhVar.zzz.zzd(e);
                        }
                    } catch (zzri e11) {
                        e = e11;
                        zzkhVar.zzD(e, e.zza);
                        z4 = true;
                    } catch (zztr e12) {
                        e = e12;
                        zzkhVar.zzD(e, 1002);
                        z4 = true;
                    } catch (IOException e13) {
                        e = e13;
                        zzkhVar.zzD(e, 2000);
                        z4 = true;
                    } catch (RuntimeException e14) {
                        e = e14;
                        zzig zzigVarZzd = zzig.zzd(e, ((e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : zzbbs.zzq.zzf);
                        zzdt.zzd("ExoPlayerImplInternal", "Playback error", zzigVarZzd);
                        zzkhVar.zzX(true, false);
                        zzkhVar.zzz = zzkhVar.zzz.zzd(zzigVarZzd);
                        z4 = true;
                    }
                    zzkhVar.zzJ();
                    return z4;
                case 4:
                    zzkhVar.zzT((zzbj) message.obj);
                    zzkhVar.zzG(zzkhVar.zzp.zzc(), true);
                    z4 = true;
                    zzkhVar.zzJ();
                    return z4;
                case 5:
                    zzkhVar.zzy = (zzls) message.obj;
                    z4 = true;
                    zzkhVar.zzJ();
                    return z4;
                case 6:
                    zzkhVar.zzX(false, true);
                    z4 = true;
                    zzkhVar.zzJ();
                    return z4;
                case 7:
                    try {
                        zzkhVar.zzN(true, false, true, false);
                        int i27 = 0;
                        while (true) {
                            int length9 = zzkhVar.zzb.length;
                            if (i27 >= 2) {
                                zzkhVar.zzh.zzd(zzkhVar.zzv);
                                zzkhVar.zzV(1);
                                HandlerThread handlerThread = zzkhVar.zzk;
                                if (handlerThread != null) {
                                    handlerThread.quit();
                                }
                                synchronized (this) {
                                    zzkhVar.zzB = true;
                                    zzkhVar.notifyAll();
                                    break;
                                }
                                return true;
                            }
                            zzkhVar.zzd[i27].zzq();
                            zzkhVar.zzb[i27].zzG();
                            i27++;
                        }
                    } catch (Throwable th7) {
                        HandlerThread handlerThread2 = zzkhVar.zzk;
                        if (handlerThread2 != null) {
                            handlerThread2.quit();
                        }
                        synchronized (this) {
                            zzkhVar.zzB = true;
                            zzkhVar.notifyAll();
                            throw th7;
                        }
                    }
                    break;
                case 8:
                    if (zzkhVar.zzs.zzp((zzup) message.obj)) {
                        zzkq zzkqVarZzd2 = zzkhVar.zzs.zzd();
                        zzkqVarZzd2.zzl(zzkhVar.zzp.zzc().zzb, zzkhVar.zzz.zza);
                        zzkhVar.zzaa(zzkqVarZzd2.zzf.zza, zzkqVarZzd2.zzh(), zzkqVarZzd2.zzi());
                        if (zzkqVarZzd2 == zzkhVar.zzs.zze()) {
                            zzkhVar.zzP(zzkqVarZzd2.zzf.zzb);
                            zzkhVar.zzB();
                            zzlg zzlgVar6 = zzkhVar.zzz;
                            zzur zzurVar8 = zzlgVar6.zzb;
                            long j27 = zzkqVarZzd2.zzf.zzb;
                            zzkhVar.zzz = zzkhVar.zzz(zzurVar8, j27, zzlgVar6.zzc, j27, false, 5);
                        }
                        zzkhVar.zzI();
                    }
                    z4 = true;
                    zzkhVar.zzJ();
                    return z4;
                case 9:
                    if (zzkhVar.zzs.zzp((zzup) message.obj)) {
                        zzkhVar.zzs.zzl(zzkhVar.zzM);
                        zzkhVar.zzI();
                    }
                    z4 = true;
                    zzkhVar.zzJ();
                    return z4;
                case 10:
                    zzkhVar.zzL();
                    z4 = true;
                    zzkhVar.zzJ();
                    return z4;
                case 11:
                    int i28 = message.arg1;
                    zzkhVar.zzH = i28;
                    if (!zzkhVar.zzs.zzt(zzkhVar.zzz.zza, i28)) {
                        zzkhVar.zzS(true);
                    }
                    zzkhVar.zzE(false);
                    z4 = true;
                    zzkhVar.zzJ();
                    return z4;
                case 12:
                    boolean z26 = message.arg1 != 0;
                    zzkhVar.zzI = z26;
                    if (!zzkhVar.zzs.zzu(zzkhVar.zzz.zza, z26)) {
                        zzkhVar.zzS(true);
                    }
                    zzkhVar.zzE(false);
                    z4 = true;
                    zzkhVar.zzJ();
                    return z4;
                case 13:
                    boolean z27 = message.arg1 != 0;
                    AtomicBoolean atomicBoolean = (AtomicBoolean) message.obj;
                    if (zzkhVar.zzJ != z27) {
                        zzkhVar.zzJ = z27;
                        if (!z27) {
                            zzln[] zzlnVarArr7 = zzkhVar.zzb;
                            int length10 = zzlnVarArr7.length;
                            for (int i29 = 0; i29 < 2; i29++) {
                                zzln zzlnVar6 = zzlnVarArr7[i29];
                                if (!zzag(zzlnVar6) && zzkhVar.zzc.remove(zzlnVar6)) {
                                    zzlnVar6.zzI();
                                }
                            }
                        }
                    }
                    if (atomicBoolean != null) {
                        synchronized (this) {
                            atomicBoolean.set(true);
                            zzkhVar.notifyAll();
                            break;
                        }
                    }
                    z4 = true;
                    zzkhVar.zzJ();
                    return z4;
                case 14:
                    zzlj zzljVar = (zzlj) message.obj;
                    if (zzljVar.zzb() == zzkhVar.zzl) {
                        zzam(zzljVar);
                        int i30 = zzkhVar.zzz.zze;
                        if (i30 == 3 || i30 == 2) {
                            zzkhVar.zzj.zzi(2);
                        }
                    } else {
                        zzkhVar.zzj.zzc(15, zzljVar).zza();
                    }
                    z4 = true;
                    zzkhVar.zzJ();
                    return z4;
                case 15:
                    final zzlj zzljVar2 = (zzlj) message.obj;
                    Looper looperZzb = zzljVar2.zzb();
                    if (looperZzb.getThread().isAlive()) {
                        zzkhVar.zzr.zzd(looperZzb, null).zzh(new Runnable(zzkhVar) { // from class: com.google.android.gms.internal.ads.zzjy
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzkh.zzr(zzljVar2);
                            }
                        });
                    } else {
                        zzdt.zzf("TAG", "Trying to send message on a dead thread.");
                        zzljVar2.zzh(false);
                    }
                    z4 = true;
                    zzkhVar.zzJ();
                    return z4;
                case 16:
                    zzkhVar.zzG((zzbj) message.obj, false);
                    z4 = true;
                    zzkhVar.zzJ();
                    return z4;
                case 17:
                    zzkb zzkbVar = (zzkb) message.obj;
                    zzkhVar.zzA.zza(1);
                    if (zzkbVar.zzb != -1) {
                        zzkhVar.zzL = new zzkf(new zzll(zzkbVar.zza, zzkbVar.zzd), zzkbVar.zzb, zzkbVar.zzc);
                    }
                    zzkhVar.zzF(zzkhVar.zzt.zzn(zzkbVar.zza, zzkbVar.zzd), false);
                    z4 = true;
                    zzkhVar.zzJ();
                    return z4;
                case 18:
                    zzkb zzkbVar2 = (zzkb) message.obj;
                    int iZza = message.arg1;
                    zzkhVar.zzA.zza(1);
                    zzlf zzlfVar = zzkhVar.zzt;
                    if (iZza == -1) {
                        iZza = zzlfVar.zza();
                    }
                    zzkhVar.zzF(zzlfVar.zzk(iZza, zzkbVar2.zza, zzkbVar2.zzd), false);
                    z4 = true;
                    zzkhVar.zzJ();
                    return z4;
                case 19:
                    zzkc zzkcVar = (zzkc) message.obj;
                    zzkhVar.zzA.zza(1);
                    zzlf zzlfVar2 = zzkhVar.zzt;
                    int i31 = zzkcVar.zza;
                    zzkhVar.zzF(zzlfVar2.zzl(0, 0, 0, null), false);
                    z4 = true;
                    zzkhVar.zzJ();
                    return z4;
                case 20:
                    int i32 = message.arg1;
                    int i33 = message.arg2;
                    zzwj zzwjVar = (zzwj) message.obj;
                    zzkhVar.zzA.zza(1);
                    zzkhVar.zzF(zzkhVar.zzt.zzm(i32, i33, zzwjVar), false);
                    z4 = true;
                    zzkhVar.zzJ();
                    return z4;
                case zzbbs.zzt.zzm /* 21 */:
                    zzwj zzwjVar2 = (zzwj) message.obj;
                    zzkhVar.zzA.zza(1);
                    zzkhVar.zzF(zzkhVar.zzt.zzo(zzwjVar2), false);
                    z4 = true;
                    zzkhVar.zzJ();
                    return z4;
                case 22:
                    zzkhVar.zzF(zzkhVar.zzt.zzb(), true);
                    z4 = true;
                    zzkhVar.zzJ();
                    return z4;
                case 23:
                    zzkhVar.zzC = message.arg1 != 0;
                    zzkhVar.zzO();
                    if (zzkhVar.zzD && zzkhVar.zzs.zzf() != zzkhVar.zzs.zze()) {
                        zzkhVar.zzS(true);
                        zzkhVar.zzE(false);
                    }
                    z4 = true;
                    zzkhVar.zzJ();
                    return z4;
                case 24:
                default:
                    return false;
                case 25:
                    zzkhVar.zzM();
                    z4 = true;
                    zzkhVar.zzJ();
                    return z4;
                case 26:
                    zzkhVar.zzM();
                    z4 = true;
                    zzkhVar.zzJ();
                    return z4;
                case 27:
                    int i34 = message.arg1;
                    int i35 = message.arg2;
                    List list = (List) message.obj;
                    zzkhVar.zzA.zza(1);
                    zzkhVar.zzF(zzkhVar.zzt.zzc(i34, i35, list), false);
                    z4 = true;
                    zzkhVar.zzJ();
                    return z4;
                case 28:
                    zziq zziqVar = (zziq) message.obj;
                    zzkhVar.zzS = zziqVar;
                    zzkhVar.zzs.zzn(zzkhVar.zzz.zza, zziqVar);
                    z4 = true;
                    zzkhVar.zzJ();
                    return z4;
                case 29:
                    zzkhVar.zzA.zza(1);
                    zzkhVar.zzN(false, false, false, true);
                    zzkhVar.zzh.zzc(zzkhVar.zzv);
                    zzkhVar.zzV(true != zzkhVar.zzz.zza.zzo() ? 2 : 4);
                    zzkhVar.zzt.zzg(zzkhVar.zzi.zze());
                    zzkhVar.zzj.zzi(2);
                    z4 = true;
                    zzkhVar.zzJ();
                    return z4;
            }
        } catch (zzbh e15) {
            e = e15;
        } catch (zzge e16) {
            e = e16;
        } catch (zzig e17) {
            e = e17;
        } catch (zzri e18) {
            e = e18;
        } catch (zztr e19) {
            e = e19;
        } catch (IOException e20) {
            e = e20;
        } catch (RuntimeException e21) {
            e = e21;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final void zza(zzbj zzbjVar) {
        this.zzj.zzc(16, zzbjVar).zza();
    }

    public final Looper zzc() {
        return this.zzl;
    }

    public final /* synthetic */ Boolean zze() {
        return Boolean.valueOf(this.zzB);
    }

    public final /* synthetic */ void zzf(int i, boolean z4) {
        this.zzw.zzI(i, this.zzb[i].zzb(), z4);
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final /* bridge */ /* synthetic */ void zzg(zzwi zzwiVar) {
        this.zzj.zzc(9, (zzup) zzwiVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzh() {
        this.zzj.zzf(2);
        this.zzj.zzi(22);
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzi(zzup zzupVar) {
        this.zzj.zzc(8, zzupVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyi
    public final void zzj() {
        this.zzj.zzi(10);
    }

    public final void zzk() {
        this.zzj.zzb(29).zza();
    }

    public final void zzl(zzbv zzbvVar, int i, long j4) {
        this.zzj.zzc(3, new zzkf(zzbvVar, i, j4)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public final synchronized void zzm(zzlj zzljVar) {
        if (!this.zzB && this.zzl.getThread().isAlive()) {
            this.zzj.zzc(14, zzljVar).zza();
            return;
        }
        zzdt.zzf("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        zzljVar.zzh(false);
    }

    public final void zzn(boolean z4, int i, int i10) {
        this.zzj.zzd(1, z4 ? 1 : 0, i | (i10 << 4)).zza();
    }

    public final void zzo() {
        this.zzj.zzb(6).zza();
    }

    public final synchronized boolean zzp() {
        if (!this.zzB && this.zzl.getThread().isAlive()) {
            this.zzj.zzi(7);
            zzae(new zzjw(this), this.zzu);
            return this.zzB;
        }
        return true;
    }

    public final void zzq(List list, int i, long j4, zzwj zzwjVar) {
        this.zzj.zzc(17, new zzkb(list, zzwjVar, i, j4, null)).zza();
    }
}
