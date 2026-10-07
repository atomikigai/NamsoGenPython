package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzvs implements zzup, zzacu, zzyy, zzzc, zzwd {
    private static final Map zzb;
    private static final zzad zzc;
    private zzadq zzA;
    private long zzB;
    private boolean zzC;
    private boolean zzE;
    private boolean zzF;
    private int zzG;
    private boolean zzH;
    private long zzI;
    private boolean zzK;
    private int zzL;
    private boolean zzM;
    private boolean zzN;
    private final zzys zzO;
    private final Uri zzd;
    private final zzgd zze;
    private final zzrp zzf;
    private final zzva zzg;
    private final zzrk zzh;
    private final zzvo zzi;
    private final long zzj;
    private final long zzk;
    private final zzvh zzm;
    private zzuo zzr;
    private zzafv zzs;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private zzvr zzz;
    private final zzzg zzl = new zzzg("ProgressiveMediaPeriod");
    private final zzdf zzn = new zzdf(zzdc.zza);
    private final Runnable zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zzvj
        @Override // java.lang.Runnable
        public final void run() {
            this.zza.zzU();
        }
    };
    private final Runnable zzp = new Runnable() { // from class: com.google.android.gms.internal.ads.zzvk
        @Override // java.lang.Runnable
        public final void run() {
            this.zza.zzE();
        }
    };
    private final Handler zzq = zzen.zzy(null);
    private zzvq[] zzu = new zzvq[0];
    private zzwf[] zzt = new zzwf[0];
    private long zzJ = -9223372036854775807L;
    private int zzD = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(map);
        zzab zzabVar = new zzab();
        zzabVar.zzL("icy");
        zzabVar.zzZ("application/x-icy");
        zzc = zzabVar.zzaf();
    }

    public zzvs(Uri uri, zzgd zzgdVar, zzvh zzvhVar, zzrp zzrpVar, zzrk zzrkVar, zzyw zzywVar, zzva zzvaVar, zzvo zzvoVar, zzys zzysVar, String str, int i, long j4) {
        this.zzd = uri;
        this.zze = zzgdVar;
        this.zzf = zzrpVar;
        this.zzh = zzrkVar;
        this.zzg = zzvaVar;
        this.zzi = zzvoVar;
        this.zzO = zzysVar;
        this.zzj = i;
        this.zzm = zzvhVar;
        this.zzk = j4;
    }

    public static /* bridge */ /* synthetic */ void zzC(final zzvs zzvsVar) {
        zzvsVar.zzq.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzvi
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzF();
            }
        });
    }

    private final int zzQ() {
        int iZzd = 0;
        for (zzwf zzwfVar : this.zzt) {
            iZzd += zzwfVar.zzd();
        }
        return iZzd;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    private final long zzR(boolean z4) {
        int i = 0;
        long jMax = Long.MIN_VALUE;
        while (true) {
            zzwf[] zzwfVarArr = this.zzt;
            if (i >= zzwfVarArr.length) {
                return jMax;
            }
            if (z4) {
                jMax = Math.max(jMax, zzwfVarArr[i].zzh());
            } else {
                zzvr zzvrVar = this.zzz;
                zzvrVar.getClass();
                if (zzvrVar.zzc[i]) {
                    jMax = Math.max(jMax, zzwfVarArr[i].zzh());
                }
            }
            i++;
        }
    }

    private final zzadx zzS(zzvq zzvqVar) {
        int length = this.zzt.length;
        for (int i = 0; i < length; i++) {
            if (zzvqVar.equals(this.zzu[i])) {
                return this.zzt[i];
            }
        }
        if (this.zzv) {
            zzdt.zzf("ProgressiveMediaPeriod", "Extractor added new track (id=" + zzvqVar.zza + ") after finishing tracks.");
            return new zzacm();
        }
        zzwf zzwfVar = new zzwf(this.zzO, this.zzf, this.zzh);
        zzwfVar.zzu(this);
        int i10 = length + 1;
        zzvq[] zzvqVarArr = (zzvq[]) Arrays.copyOf(this.zzu, i10);
        zzvqVarArr[length] = zzvqVar;
        int i11 = zzen.zza;
        this.zzu = zzvqVarArr;
        zzwf[] zzwfVarArr = (zzwf[]) Arrays.copyOf(this.zzt, i10);
        zzwfVarArr[length] = zzwfVar;
        this.zzt = zzwfVarArr;
        return zzwfVar;
    }

    private final void zzT() {
        zzdb.zzf(this.zzw);
        this.zzz.getClass();
        this.zzA.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzU() {
        int i;
        if (this.zzN || this.zzw || !this.zzv || this.zzA == null) {
            return;
        }
        for (zzwf zzwfVar : this.zzt) {
            if (zzwfVar.zzi() == null) {
                return;
            }
        }
        this.zzn.zzc();
        int length = this.zzt.length;
        zzbw[] zzbwVarArr = new zzbw[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zzad zzadVarZzi = this.zzt[i10].zzi();
            zzadVarZzi.getClass();
            String str = zzadVarZzi.zzo;
            boolean zZzg = zzbg.zzg(str);
            boolean z4 = zZzg || zzbg.zzi(str);
            zArr[i10] = z4;
            this.zzx = z4 | this.zzx;
            this.zzy = this.zzk != -9223372036854775807L && length == 1 && zzbg.zzh(str);
            zzafv zzafvVar = this.zzs;
            if (zzafvVar != null) {
                if (zZzg || this.zzu[i10].zzb) {
                    zzbd zzbdVar = zzadVarZzi.zzl;
                    zzbd zzbdVar2 = zzbdVar == null ? new zzbd(-9223372036854775807L, zzafvVar) : zzbdVar.zzc(zzafvVar);
                    zzab zzabVarZzb = zzadVarZzi.zzb();
                    zzabVarZzb.zzS(zzbdVar2);
                    zzadVarZzi = zzabVarZzb.zzaf();
                }
                if (zZzg && zzadVarZzi.zzh == -1 && zzadVarZzi.zzi == -1 && (i = zzafvVar.zza) != -1) {
                    zzab zzabVarZzb2 = zzadVarZzi.zzb();
                    zzabVarZzb2.zzy(i);
                    zzadVarZzi = zzabVarZzb2.zzaf();
                }
            }
            zzbwVarArr[i10] = new zzbw(Integer.toString(i10), zzadVarZzi.zzc(this.zzf.zza(zzadVarZzi)));
        }
        this.zzz = new zzvr(new zzwr(zzbwVarArr), zArr);
        if (this.zzy && this.zzB == -9223372036854775807L) {
            this.zzB = this.zzk;
            this.zzA = new zzvm(this, this.zzA);
        }
        this.zzi.zza(this.zzB, this.zzA.zzh(), this.zzC);
        this.zzw = true;
        zzuo zzuoVar = this.zzr;
        zzuoVar.getClass();
        zzuoVar.zzi(this);
    }

    private final void zzV(int i) {
        zzT();
        zzvr zzvrVar = this.zzz;
        boolean[] zArr = zzvrVar.zzd;
        if (zArr[i]) {
            return;
        }
        zzad zzadVarZzb = zzvrVar.zza.zzb(i).zzb(0);
        this.zzg.zzc(new zzun(1, zzbg.zzb(zzadVarZzb.zzo), zzadVarZzb, 0, null, zzen.zzv(this.zzI), -9223372036854775807L));
        zArr[i] = true;
    }

    private final void zzW(int i) {
        zzT();
        boolean[] zArr = this.zzz.zzb;
        if (this.zzK && zArr[i] && !this.zzt[i].zzx(false)) {
            this.zzJ = 0L;
            this.zzK = false;
            this.zzF = true;
            this.zzI = 0L;
            this.zzL = 0;
            for (zzwf zzwfVar : this.zzt) {
                zzwfVar.zzp(false);
            }
            zzuo zzuoVar = this.zzr;
            zzuoVar.getClass();
            zzuoVar.zzg(this);
        }
    }

    private final void zzX() {
        zzvn zzvnVar = new zzvn(this, this.zzd, this.zze, this.zzm, this, this.zzn);
        if (this.zzw) {
            zzdb.zzf(zzY());
            long j4 = this.zzB;
            if (j4 != -9223372036854775807L && this.zzJ > j4) {
                this.zzM = true;
                this.zzJ = -9223372036854775807L;
                return;
            }
            zzadq zzadqVar = this.zzA;
            zzadqVar.getClass();
            zzvn.zzf(zzvnVar, zzadqVar.zzg(this.zzJ).zza.zzc, this.zzJ);
            for (zzwf zzwfVar : this.zzt) {
                zzwfVar.zzt(this.zzJ);
            }
            this.zzJ = -9223372036854775807L;
        }
        this.zzL = zzQ();
        long jZza = this.zzl.zza(zzvnVar, this, zzyw.zza(this.zzD));
        this.zzg.zzg(new zzui(zzvnVar.zzb, zzvnVar.zzl, jZza), new zzun(1, -1, null, 0, null, zzen.zzv(zzvnVar.zzk), zzen.zzv(this.zzB)));
    }

    private final boolean zzY() {
        return this.zzJ != -9223372036854775807L;
    }

    private final boolean zzZ() {
        return this.zzF || zzY();
    }

    public static /* bridge */ /* synthetic */ long zzr(zzvs zzvsVar, boolean z4) {
        return zzvsVar.zzR(true);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzD() {
        this.zzv = true;
        this.zzq.post(this.zzo);
    }

    public final /* synthetic */ void zzE() {
        if (this.zzN) {
            return;
        }
        zzuo zzuoVar = this.zzr;
        zzuoVar.getClass();
        zzuoVar.zzg(this);
    }

    public final /* synthetic */ void zzF() {
        this.zzH = true;
    }

    public final /* synthetic */ void zzG(zzadq zzadqVar) {
        this.zzA = this.zzs == null ? zzadqVar : new zzadp(-9223372036854775807L, 0L);
        this.zzB = zzadqVar.zza();
        boolean z4 = false;
        if (!this.zzH && zzadqVar.zza() == -9223372036854775807L) {
            z4 = true;
        }
        this.zzC = z4;
        this.zzD = true == z4 ? 7 : 1;
        if (this.zzw) {
            this.zzi.zza(this.zzB, zzadqVar.zzh(), this.zzC);
        } else {
            zzU();
        }
    }

    public final void zzH() throws IOException {
        this.zzl.zzi(zzyw.zza(this.zzD));
    }

    public final void zzI(int i) throws IOException {
        this.zzt[i].zzm();
        zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzyy
    public final /* bridge */ /* synthetic */ void zzJ(zzzb zzzbVar, long j4, long j10, boolean z4) {
        zzvn zzvnVar = (zzvn) zzzbVar;
        zzhc zzhcVar = zzvnVar.zzd;
        zzui zzuiVar = new zzui(zzvnVar.zzb, zzvnVar.zzl, zzhcVar.zzh(), zzhcVar.zzi(), j4, j10, zzhcVar.zzg());
        long unused = zzvnVar.zzb;
        this.zzg.zzd(zzuiVar, new zzun(1, -1, null, 0, null, zzen.zzv(zzvnVar.zzk), zzen.zzv(this.zzB)));
        if (z4) {
            return;
        }
        for (zzwf zzwfVar : this.zzt) {
            zzwfVar.zzp(false);
        }
        if (this.zzG > 0) {
            zzuo zzuoVar = this.zzr;
            zzuoVar.getClass();
            zzuoVar.zzg(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyy
    public final /* bridge */ /* synthetic */ void zzK(zzzb zzzbVar, long j4, long j10) {
        zzadq zzadqVar;
        zzvn zzvnVar = (zzvn) zzzbVar;
        if (this.zzB == -9223372036854775807L && (zzadqVar = this.zzA) != null) {
            boolean zZzh = zzadqVar.zzh();
            long jZzR = zzR(true);
            long j11 = jZzR == Long.MIN_VALUE ? 0L : jZzR + 10000;
            this.zzB = j11;
            this.zzi.zza(j11, zZzh, this.zzC);
        }
        zzhc zzhcVar = zzvnVar.zzd;
        zzui zzuiVar = new zzui(zzvnVar.zzb, zzvnVar.zzl, zzhcVar.zzh(), zzhcVar.zzi(), j4, j10, zzhcVar.zzg());
        long unused = zzvnVar.zzb;
        this.zzg.zze(zzuiVar, new zzun(1, -1, null, 0, null, zzen.zzv(zzvnVar.zzk), zzen.zzv(this.zzB)));
        this.zzM = true;
        zzuo zzuoVar = this.zzr;
        zzuoVar.getClass();
        zzuoVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final void zzL() {
        for (zzwf zzwfVar : this.zzt) {
            zzwfVar.zzo();
        }
        this.zzm.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzwd
    public final void zzM(zzad zzadVar) {
        this.zzq.post(this.zzo);
    }

    public final void zzN() {
        if (this.zzw) {
            for (zzwf zzwfVar : this.zzt) {
                zzwfVar.zzn();
            }
        }
        this.zzl.zzj(this);
        this.zzq.removeCallbacksAndMessages(null);
        this.zzr = null;
        this.zzN = true;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzO(final zzadq zzadqVar) {
        this.zzq.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzvl
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzG(zzadqVar);
            }
        });
    }

    public final boolean zzP(int i) {
        return !zzZ() && this.zzt[i].zzx(this.zzM);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0085 A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzup
    public final long zza(long j4, zzls zzlsVar) {
        zzT();
        if (!this.zzA.zzh()) {
            return 0L;
        }
        zzado zzadoVarZzg = this.zzA.zzg(j4);
        zzadr zzadrVar = zzadoVarZzg.zza;
        zzadr zzadrVar2 = zzadoVarZzg.zzb;
        long j10 = zzlsVar.zzc;
        if (j10 == 0) {
            if (zzlsVar.zzd == 0) {
                return j4;
            }
            j10 = 0;
        }
        long j11 = zzadrVar.zzb;
        int i = zzen.zza;
        long j12 = j4 - j10;
        long j13 = zzlsVar.zzd;
        long j14 = j4 + j13;
        long j15 = j4 ^ j14;
        long j16 = j13 ^ j14;
        if (((j4 ^ j10) & (j4 ^ j12)) < 0) {
            j12 = Long.MIN_VALUE;
        }
        if ((j15 & j16) < 0) {
            j14 = Long.MAX_VALUE;
        }
        boolean z4 = j12 <= j11 && j11 <= j14;
        long j17 = zzadrVar2.zzb;
        boolean z10 = j12 <= j17 && j17 <= j14;
        if (z4 && z10) {
            if (Math.abs(j11 - j4) <= Math.abs(j17 - j4)) {
                return j11;
            }
            return j17;
        }
        if (!z4) {
            if (z10) {
                return j17;
            }
            return j12;
        }
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final long zzb() {
        long jZzR;
        zzT();
        if (this.zzM || this.zzG == 0) {
            return Long.MIN_VALUE;
        }
        if (zzY()) {
            return this.zzJ;
        }
        if (this.zzx) {
            int length = this.zzt.length;
            jZzR = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zzvr zzvrVar = this.zzz;
                if (zzvrVar.zzb[i] && zzvrVar.zzc[i] && !this.zzt[i].zzw()) {
                    jZzR = Math.min(jZzR, this.zzt[i].zzh());
                }
            }
        } else {
            jZzR = Long.MAX_VALUE;
        }
        if (jZzR == Long.MAX_VALUE) {
            jZzR = zzR(false);
        }
        return jZzR == Long.MIN_VALUE ? this.zzI : jZzR;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zzd() {
        if (!this.zzF) {
            return -9223372036854775807L;
        }
        if (!this.zzM && zzQ() <= this.zzL) {
            return -9223372036854775807L;
        }
        this.zzF = false;
        return this.zzI;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x006d A[LOOP:1: B:31:0x006b->B:32:0x006d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0084 A[LOOP:2: B:36:0x0082->B:37:0x0084, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0068, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x007b, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzup
    public final long zze(long j4) {
        zzzg zzzgVar;
        int i;
        zzT();
        boolean[] zArr = this.zzz.zzb;
        if (true != this.zzA.zzh()) {
            j4 = 0;
        }
        this.zzF = false;
        this.zzI = j4;
        if (zzY()) {
            this.zzJ = j4;
            return j4;
        }
        if (this.zzD == 7 || (!this.zzM && !this.zzl.zzl())) {
            this.zzK = false;
            this.zzJ = j4;
            this.zzM = false;
            zzzgVar = this.zzl;
            if (zzzgVar.zzl()) {
                zzzgVar.zzh();
                while (i < r2) {
                    zzwfVar.zzp(false);
                }
                break;
            }
            while (i < r2) {
                zzwfVar.zzk();
            }
            this.zzl.zzg();
            return j4;
        }
        int length = this.zzt.length;
        for (int i10 = 0; i10 < length; i10++) {
            zzwf zzwfVar = this.zzt[i10];
            if (!(this.zzy ? zzwfVar.zzy(zzwfVar.zza()) : zzwfVar.zzz(j4, false)) && (zArr[i10] || !this.zzx)) {
                this.zzK = false;
                this.zzJ = j4;
                this.zzM = false;
                zzzgVar = this.zzl;
                if (zzzgVar.zzl()) {
                    zzzgVar.zzh();
                    for (zzwf zzwfVar2 : this.zzt) {
                        zzwfVar2.zzp(false);
                    }
                    break;
                    break;
                }
                for (zzwf zzwfVar3 : this.zzt) {
                    zzwfVar3.zzk();
                }
                this.zzl.zzg();
                return j4;
            }
        }
        return j4;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zzf(zzyd[] zzydVarArr, boolean[] zArr, zzwg[] zzwgVarArr, boolean[] zArr2, long j4) {
        zzyd zzydVar;
        zzT();
        zzvr zzvrVar = this.zzz;
        zzwr zzwrVar = zzvrVar.zza;
        boolean[] zArr3 = zzvrVar.zzc;
        int i = this.zzG;
        int i10 = 0;
        for (int i11 = 0; i11 < zzydVarArr.length; i11++) {
            zzwg zzwgVar = zzwgVarArr[i11];
            if (zzwgVar != null && (zzydVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((zzvp) zzwgVar).zzb;
                zzdb.zzf(zArr3[i12]);
                this.zzG--;
                zArr3[i12] = false;
                zzwgVarArr[i11] = null;
            }
        }
        boolean z4 = !this.zzE ? j4 == 0 || this.zzy : i != 0;
        for (int i13 = 0; i13 < zzydVarArr.length; i13++) {
            if (zzwgVarArr[i13] == null && (zzydVar = zzydVarArr[i13]) != null) {
                zzdb.zzf(zzydVar.zzc() == 1);
                zzdb.zzf(zzydVar.zza(0) == 0);
                int iZza = zzwrVar.zza(zzydVar.zze());
                zzdb.zzf(!zArr3[iZza]);
                this.zzG++;
                zArr3[iZza] = true;
                zzwgVarArr[i13] = new zzvp(this, iZza);
                zArr2[i13] = true;
                if (!z4) {
                    zzwf zzwfVar = this.zzt[iZza];
                    z4 = (zzwfVar.zzb() == 0 || zzwfVar.zzz(j4, true)) ? false : true;
                }
            }
        }
        if (this.zzG == 0) {
            this.zzK = false;
            this.zzF = false;
            if (this.zzl.zzl()) {
                zzwf[] zzwfVarArr = this.zzt;
                int length = zzwfVarArr.length;
                while (i10 < length) {
                    zzwfVarArr[i10].zzk();
                    i10++;
                }
                this.zzl.zzg();
            } else {
                this.zzM = false;
                for (zzwf zzwfVar2 : this.zzt) {
                    zzwfVar2.zzp(false);
                }
            }
        } else if (z4) {
            j4 = zze(j4);
            while (i10 < zzwgVarArr.length) {
                if (zzwgVarArr[i10] != null) {
                    zArr2[i10] = true;
                }
                i10++;
            }
        }
        this.zzE = true;
        return j4;
    }

    public final int zzg(int i, zzkj zzkjVar, zzhm zzhmVar, int i10) {
        if (zzZ()) {
            return -3;
        }
        zzV(i);
        int iZze = this.zzt[i].zze(zzkjVar, zzhmVar, i10, this.zzM);
        if (iZze == -3) {
            zzW(i);
        }
        return iZze;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final zzwr zzh() {
        zzT();
        return this.zzz.zza;
    }

    public final int zzi(int i, long j4) {
        if (zzZ()) {
            return 0;
        }
        zzV(i);
        zzwf zzwfVar = this.zzt[i];
        int iZzc = zzwfVar.zzc(j4, this.zzM);
        zzwfVar.zzv(iZzc);
        if (iZzc != 0) {
            return iZzc;
        }
        zzW(i);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzj(long j4, boolean z4) {
        if (this.zzy) {
            return;
        }
        zzT();
        if (zzY()) {
            return;
        }
        boolean[] zArr = this.zzz.zzc;
        int length = this.zzt.length;
        for (int i = 0; i < length; i++) {
            this.zzt[i].zzj(j4, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzk() throws IOException {
        zzH();
        if (this.zzM && !this.zzw) {
            throw zzbh.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzl(zzuo zzuoVar, long j4) {
        this.zzr = zzuoVar;
        this.zzn.zze();
        zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final boolean zzo(zzko zzkoVar) {
        if (this.zzM) {
            return false;
        }
        zzzg zzzgVar = this.zzl;
        if (zzzgVar.zzk() || this.zzK) {
            return false;
        }
        if (this.zzw && this.zzG == 0) {
            return false;
        }
        boolean zZze = this.zzn.zze();
        if (zzzgVar.zzl()) {
            return zZze;
        }
        zzX();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final boolean zzp() {
        return this.zzl.zzl() && this.zzn.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzyy
    public final /* bridge */ /* synthetic */ zzyz zzu(zzzb zzzbVar, long j4, long j10, IOException iOException, int i) {
        long jMin;
        zzyz zzyzVarZzb;
        zzadq zzadqVar;
        zzvn zzvnVar = (zzvn) zzzbVar;
        zzhc zzhcVar = zzvnVar.zzd;
        zzui zzuiVar = new zzui(zzvnVar.zzb, zzvnVar.zzl, zzhcVar.zzh(), zzhcVar.zzi(), j4, j10, zzhcVar.zzg());
        long unused = zzvnVar.zzk;
        int i10 = zzen.zza;
        if ((iOException instanceof zzbh) || (iOException instanceof FileNotFoundException) || (iOException instanceof zzgt) || (iOException instanceof zzze)) {
            jMin = -9223372036854775807L;
            break;
        }
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i - 1) * zzbbs.zzq.zzf, 5000);
                break;
            }
            if ((cause instanceof zzge) && ((zzge) cause).zza == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            zzyzVarZzb = zzzg.zzb;
        } else {
            int iZzQ = zzQ();
            boolean z4 = iZzQ > this.zzL;
            if (this.zzH || !((zzadqVar = this.zzA) == null || zzadqVar.zza() == -9223372036854775807L)) {
                this.zzL = iZzQ;
            } else {
                boolean z10 = this.zzw;
                if (!z10 || zzZ()) {
                    this.zzF = z10;
                    this.zzI = 0L;
                    this.zzL = 0;
                    for (zzwf zzwfVar : this.zzt) {
                        zzwfVar.zzp(false);
                    }
                    zzvn.zzf(zzvnVar, 0L, 0L);
                } else {
                    this.zzK = true;
                    zzyzVarZzb = zzzg.zza;
                }
            }
            zzyzVarZzb = zzzg.zzb(z4, jMin);
        }
        boolean zZzc = zzyzVarZzb.zzc();
        this.zzg.zzf(zzuiVar, new zzun(1, -1, null, 0, null, zzen.zzv(zzvnVar.zzk), zzen.zzv(this.zzB)), iOException, !zZzc);
        if (!zZzc) {
            long unused2 = zzvnVar.zzb;
        }
        return zzyzVarZzb;
    }

    public final zzadx zzv() {
        return zzS(new zzvq(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final zzadx zzw(int i, int i10) {
        return zzS(new zzvq(i, false));
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final void zzm(long j4) {
    }
}
