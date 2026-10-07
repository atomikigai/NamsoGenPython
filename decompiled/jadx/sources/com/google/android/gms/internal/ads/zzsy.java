package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Trace;
import da.v;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzsy extends zzhw {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private int zzA;
    private boolean zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private long zzH;
    private int zzI;
    private int zzJ;
    private ByteBuffer zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private long zzX;
    private long zzY;
    private boolean zzZ;
    protected zzhx zza;
    private boolean zzaa;
    private boolean zzab;
    private zzsw zzac;
    private long zzad;
    private boolean zzae;
    private zzrq zzaf;
    private zzrq zzag;
    private final zzsl zzc;
    private final zzta zzd;
    private final float zze;
    private final zzhm zzf;
    private final zzhm zzg;
    private final zzhm zzh;
    private final zzse zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzrd zzl;
    private zzad zzm;
    private zzad zzn;
    private zzlm zzo;
    private MediaCrypto zzp;
    private float zzq;
    private float zzr;
    private zzsn zzs;
    private zzad zzt;
    private MediaFormat zzu;
    private boolean zzv;
    private float zzw;
    private ArrayDeque zzx;
    private zzsu zzy;
    private zzsq zzz;

    public zzsy(int i, zzsl zzslVar, zzta zztaVar, boolean z4, float f10) {
        super(i);
        this.zzc = zzslVar;
        this.zzd = zztaVar;
        this.zze = f10;
        this.zzf = new zzhm(0, 0);
        this.zzg = new zzhm(0, 0);
        this.zzh = new zzhm(2, 0);
        zzse zzseVar = new zzse();
        this.zzi = zzseVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzq = 1.0f;
        this.zzr = 1.0f;
        this.zzk = new ArrayDeque();
        this.zzac = zzsw.zza;
        zzseVar.zzj(0);
        zzseVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zzrd();
        this.zzw = -1.0f;
        this.zzA = 0;
        this.zzR = 0;
        this.zzI = -1;
        this.zzJ = -1;
        this.zzH = -9223372036854775807L;
        this.zzX = -9223372036854775807L;
        this.zzY = -9223372036854775807L;
        this.zzad = -9223372036854775807L;
        this.zzS = 0;
        this.zzT = 0;
        this.zza = new zzhx();
    }

    public static boolean zzaP(zzad zzadVar) {
        return zzadVar.zzJ == 0;
    }

    private final void zzaQ() {
        this.zzJ = -1;
        this.zzK = null;
    }

    private final void zzaR(zzsw zzswVar) {
        this.zzac = zzswVar;
        if (zzswVar.zzd != -9223372036854775807L) {
            this.zzae = true;
        }
    }

    private final void zzaS() throws zzig {
        zzrq zzrqVar = this.zzag;
        zzrqVar.getClass();
        this.zzaf = zzrqVar;
        this.zzS = 0;
        this.zzT = 0;
    }

    private final boolean zzaT() throws zzig {
        if (this.zzU) {
            this.zzS = 1;
            if (this.zzC) {
                this.zzT = 3;
                return false;
            }
            this.zzT = 2;
        } else {
            zzaS();
        }
        return true;
    }

    private final boolean zzaU() {
        return this.zzJ >= 0;
    }

    private final boolean zzaV(long j4, long j10) {
        if (j10 >= j4) {
            return false;
        }
        zzad zzadVar = this.zzn;
        return (zzadVar != null && Objects.equals(zzadVar.zzo, "audio/opus") && zzadm.zzf(j4, j10)) ? false : true;
    }

    private final boolean zzaW(int i) throws zzig {
        zzhm zzhmVar = this.zzf;
        zzkj zzkjVarZzk = zzk();
        zzhmVar.zzb();
        int iZzcW = zzcW(zzkjVarZzk, this.zzf, i | 4);
        if (iZzcW == -5) {
            zzac(zzkjVarZzk);
            return true;
        }
        if (iZzcW != -4 || !this.zzf.zzf()) {
            return false;
        }
        this.zzZ = true;
        zzai();
        return false;
    }

    private final boolean zzaX(zzad zzadVar) throws zzig {
        if (zzen.zza >= 23 && this.zzs != null && this.zzT != 3 && zzcV() != 0) {
            float f10 = this.zzr;
            zzadVar.getClass();
            float fZzZ = zzZ(f10, zzadVar, zzT());
            float f11 = this.zzw;
            if (f11 != fZzZ) {
                if (fZzZ == -1.0f) {
                    zzae();
                    return false;
                }
                if (f11 != -1.0f || fZzZ > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fZzZ);
                    zzsn zzsnVar = this.zzs;
                    zzsnVar.getClass();
                    zzsnVar.zzq(bundle);
                    this.zzw = fZzZ;
                }
            }
        }
        return true;
    }

    private final void zzad() {
        this.zzP = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzO = false;
        this.zzN = false;
        this.zzl.zzb();
    }

    private final void zzae() throws zzig {
        if (this.zzU) {
            this.zzS = 1;
            this.zzT = 3;
        } else {
            zzaG();
            zzaC();
        }
    }

    private final void zzah() {
        try {
            zzsn zzsnVar = this.zzs;
            zzdb.zzb(zzsnVar);
            zzsnVar.zzj();
        } finally {
            zzaH();
        }
    }

    private final void zzai() throws zzig {
        int i = this.zzT;
        if (i == 1) {
            zzah();
            return;
        }
        if (i == 2) {
            zzah();
            zzaS();
        } else if (i != 3) {
            this.zzaa = true;
            zzaq();
        } else {
            zzaG();
            zzaC();
        }
    }

    private final void zzao() {
        this.zzI = -1;
        this.zzg.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public void zzC() {
        try {
            zzad();
            zzaG();
        } finally {
            this.zzag = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // com.google.android.gms.internal.ads.zzhw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void zzF(com.google.android.gms.internal.ads.zzad[] r13, long r14, long r16, com.google.android.gms.internal.ads.zzur r18) throws com.google.android.gms.internal.ads.zzig {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.zzsw r13 = r12.zzac
            long r0 = r13.zzd
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L1e
            com.google.android.gms.internal.ads.zzsw r4 = new com.google.android.gms.internal.ads.zzsw
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r14
            r9 = r16
            r4.<init>(r5, r7, r9)
            r12.zzaR(r4)
            return
        L1e:
            java.util.ArrayDeque r13 = r12.zzk
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L52
            long r0 = r12.zzX
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L36
            long r4 = r12.zzad
            int r13 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r13 == 0) goto L52
            int r13 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r13 < 0) goto L52
        L36:
            com.google.android.gms.internal.ads.zzsw r5 = new com.google.android.gms.internal.ads.zzsw
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.zzaR(r5)
            com.google.android.gms.internal.ads.zzsw r13 = r12.zzac
            long r13 = r13.zzd
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L51
            r12.zzap()
        L51:
            return
        L52:
            java.util.ArrayDeque r13 = r12.zzk
            com.google.android.gms.internal.ads.zzsw r5 = new com.google.android.gms.internal.ads.zzsw
            long r6 = r12.zzX
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r13.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsy.zzF(com.google.android.gms.internal.ads.zzad[], long, long, com.google.android.gms.internal.ads.zzur):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhw, com.google.android.gms.internal.ads.zzln
    public void zzM(float f10, float f11) throws zzig {
        this.zzq = f10;
        this.zzr = f11;
        zzaX(this.zzt);
    }

    /* JADX WARN: Code duplicated, block: B:219:0x0352 A[Catch: CryptoException -> 0x0010, IllegalStateException -> 0x007a, TryCatch #1 {CryptoException -> 0x0010, blocks: (B:3:0x0003, B:5:0x0007, B:12:0x0014, B:14:0x0019, B:16:0x001f, B:22:0x003b, B:24:0x005c, B:26:0x006a, B:37:0x008b, B:32:0x0084, B:228:0x0394, B:230:0x0398, B:232:0x039d, B:235:0x03a5, B:237:0x03a9, B:239:0x03b1, B:240:0x03be, B:243:0x03c3, B:245:0x03c7, B:248:0x03da, B:249:0x03df, B:208:0x0324, B:210:0x0328, B:213:0x0341, B:224:0x0375, B:226:0x0387, B:217:0x034b, B:219:0x0352, B:215:0x0348, B:220:0x0356, B:222:0x036a), top: B:379:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:355:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:357:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:361:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:364:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:366:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:369:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:370:0x05da  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.google.android.gms.internal.ads.zzhw, com.google.android.gms.internal.ads.zzsy] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.media.MediaFormat, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    @Override // com.google.android.gms.internal.ads.zzln
    public void zzV(long j4, long j10) throws Throwable {
        boolean z4;
        ?? r10;
        byte b10;
        boolean z10;
        ?? r11;
        zzsp zzspVarZzaA;
        int i;
        StackTraceElement[] stackTrace;
        boolean z11;
        Throwable th;
        boolean zZzar;
        int iZzb;
        boolean z12 = true;
        try {
            try {
                if (this.zzaa) {
                    zzaq();
                    return;
                }
                int i10 = 2;
                if (this.zzm == null && !zzaW(2)) {
                    return;
                }
                zzaC();
                byte b11 = -5;
                ?? r12 = 0;
                try {
                    try {
                        try {
                            try {
                                if (this.zzN) {
                                    try {
                                        try {
                                            Trace.beginSection("bypassRender");
                                            while (true) {
                                                zzdb.zzf(this.zzaa ^ z12);
                                                zzse zzseVar = this.zzi;
                                                try {
                                                    if (zzseVar.zzq()) {
                                                        ByteBuffer byteBuffer = zzseVar.zzc;
                                                        int i11 = this.zzJ;
                                                        int iZzm = zzseVar.zzm();
                                                        long j11 = zzseVar.zze;
                                                        boolean zZzaV = zzaV(zzf(), zzseVar.zzn());
                                                        boolean zZzf = this.zzi.zzf();
                                                        zzad zzadVar = this.zzn;
                                                        if (zzadVar == null) {
                                                            throw r12;
                                                        }
                                                        if (zzar(j4, j10, null, byteBuffer, i11, 0, iZzm, j11, zZzaV, zZzf, zzadVar)) {
                                                            zzaD(this.zzi.zzn());
                                                            this.zzi.zzb();
                                                            r12 = 0;
                                                        } else {
                                                            z12 = true;
                                                        }
                                                        z11 = false;
                                                        break;
                                                    }
                                                    r12 = r12;
                                                    if (!this.zzZ) {
                                                        z12 = true;
                                                        if (this.zzO) {
                                                            zzdb.zzf(this.zzi.zzp(this.zzh));
                                                            z11 = false;
                                                            this.zzO = false;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        if (this.zzP) {
                                                            if (!this.zzi.zzq()) {
                                                                zzad();
                                                                this.zzP = z11;
                                                                zzaC();
                                                                if (!this.zzN) {
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        zzdb.zzf(!this.zzZ);
                                                        zzkj zzkjVarZzk = zzk();
                                                        this.zzh.zzb();
                                                        while (true) {
                                                            this.zzh.zzb();
                                                            int iZzcW = zzcW(zzkjVarZzk, this.zzh, z11 ? 1 : 0);
                                                            if (iZzcW == -5) {
                                                                zzac(zzkjVarZzk);
                                                                break;
                                                            }
                                                            if (iZzcW != -4) {
                                                                if (!zzQ()) {
                                                                    break;
                                                                }
                                                                this.zzY = this.zzX;
                                                                break;
                                                            }
                                                            zzhm zzhmVar = this.zzh;
                                                            if (zzhmVar.zzf()) {
                                                                this.zzZ = true;
                                                                this.zzY = this.zzX;
                                                                break;
                                                            }
                                                            long jMax = Math.max(this.zzX, zzhmVar.zze);
                                                            this.zzX = jMax;
                                                            if (zzQ() || this.zzg.zzh()) {
                                                                this.zzY = jMax;
                                                            }
                                                            if (this.zzab) {
                                                                zzad zzadVar2 = this.zzm;
                                                                if (zzadVar2 == null) {
                                                                    throw r12;
                                                                }
                                                                this.zzn = zzadVar2;
                                                                if (Objects.equals(zzadVar2.zzo, "audio/opus") && !this.zzn.zzr.isEmpty()) {
                                                                    int iZza = zzadm.zza((byte[]) this.zzn.zzr.get(z11 ? 1 : 0));
                                                                    zzad zzadVar3 = this.zzn;
                                                                    if (zzadVar3 == null) {
                                                                        throw r12;
                                                                    }
                                                                    zzab zzabVarZzb = zzadVar3.zzb();
                                                                    zzabVarZzb.zzG(iZza);
                                                                    this.zzn = zzabVarZzb.zzaf();
                                                                }
                                                                zzan(this.zzn, r12);
                                                                this.zzab = z11;
                                                            }
                                                            this.zzh.zzk();
                                                            zzad zzadVar4 = this.zzn;
                                                            if (zzadVar4 != null && Objects.equals(zzadVar4.zzo, "audio/opus")) {
                                                                zzhm zzhmVar2 = this.zzh;
                                                                if (zzhmVar2.zze()) {
                                                                    zzhmVar2.zza = this.zzn;
                                                                    zzaj(zzhmVar2);
                                                                }
                                                                long jZzf = zzf();
                                                                zzhm zzhmVar3 = this.zzh;
                                                                if (zzadm.zzf(jZzf, zzhmVar3.zze)) {
                                                                    zzrd zzrdVar = this.zzl;
                                                                    zzad zzadVar5 = this.zzn;
                                                                    if (zzadVar5 == null) {
                                                                        throw r12;
                                                                    }
                                                                    zzrdVar.zza(zzhmVar3, zzadVar5.zzr);
                                                                }
                                                            }
                                                            zzse zzseVar2 = this.zzi;
                                                            if (zzseVar2.zzq()) {
                                                                long jZzf2 = zzf();
                                                                if (zzaV(jZzf2, zzseVar2.zzn()) == zzaV(jZzf2, this.zzh.zze)) {
                                                                }
                                                                this.zzO = true;
                                                                break;
                                                            }
                                                            if (!this.zzi.zzp(this.zzh)) {
                                                                this.zzO = true;
                                                                break;
                                                            }
                                                        }
                                                        zzse zzseVar3 = this.zzi;
                                                        if (zzseVar3.zzq()) {
                                                            zzseVar3.zzk();
                                                        }
                                                        if (!this.zzi.zzq() && !this.zzZ && !this.zzP) {
                                                            break;
                                                        }
                                                    } else {
                                                        z12 = true;
                                                        this.zzaa = true;
                                                        z11 = false;
                                                        break;
                                                    }
                                                } catch (IllegalStateException e) {
                                                    e = e;
                                                    z12 = true;
                                                    b11 = 0;
                                                    z4 = z12;
                                                    b10 = b11;
                                                    z10 = e instanceof MediaCodec.CodecException;
                                                    if (!z10) {
                                                        stackTrace = e.getStackTrace();
                                                        if (stackTrace.length > 0) {
                                                        }
                                                        throw e;
                                                    }
                                                    zzak(e);
                                                    if (z10) {
                                                        r11 = b10;
                                                    } else {
                                                        r11 = b10;
                                                    }
                                                    if (r11 != 0) {
                                                        zzaG();
                                                    }
                                                    zzspVarZzaA = zzaA(e, this.zzz);
                                                    if (zzspVarZzaA.zzb == 1101) {
                                                        i = 4006;
                                                    } else {
                                                        i = 4003;
                                                    }
                                                    throw zzcY(zzspVarZzaA, this.zzm, r11, i);
                                                }
                                            }
                                            Trace.endSection();
                                        } catch (MediaCodec.CryptoException e4) {
                                            e = e4;
                                            b11 = 0;
                                            r10 = b11;
                                            throw zzcY(e, this.zzm, r10, zzen.zzl(e.getErrorCode()));
                                        }
                                    } catch (IllegalStateException e10) {
                                        e = e10;
                                    }
                                } else {
                                    Throwable th2 = null;
                                    boolean z13 = false;
                                    if (this.zzs != null) {
                                        zzi().zzb();
                                        Trace.beginSection("drainAndFeed");
                                        while (true) {
                                            zzsn zzsnVar = this.zzs;
                                            if (zzsnVar == null) {
                                                throw th2;
                                            }
                                            if (!zzaU()) {
                                                if (this.zzD && this.zzV) {
                                                    try {
                                                        iZzb = zzsnVar.zzb(this.zzj);
                                                    } catch (IllegalStateException unused) {
                                                        zzai();
                                                        if (this.zzaa) {
                                                            zzaG();
                                                        }
                                                    }
                                                } else {
                                                    iZzb = zzsnVar.zzb(this.zzj);
                                                }
                                                if (iZzb >= 0) {
                                                    if (!this.zzF) {
                                                        MediaCodec.BufferInfo bufferInfo = this.zzj;
                                                        if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                                                            zzai();
                                                            th = th2;
                                                            break;
                                                        }
                                                        this.zzJ = iZzb;
                                                        ByteBuffer byteBufferZzg = zzsnVar.zzg(iZzb);
                                                        this.zzK = byteBufferZzg;
                                                        if (byteBufferZzg != null) {
                                                            byteBufferZzg.position(this.zzj.offset);
                                                            ByteBuffer byteBuffer2 = this.zzK;
                                                            MediaCodec.BufferInfo bufferInfo2 = this.zzj;
                                                            byteBuffer2.limit(bufferInfo2.offset + bufferInfo2.size);
                                                        }
                                                        this.zzL = this.zzj.presentationTimeUs < zzf() ? z12 : z13;
                                                        long j12 = this.zzY;
                                                        this.zzM = (j12 == -9223372036854775807L || j12 > this.zzj.presentationTimeUs) ? z13 : z12;
                                                        zzad zzadVar6 = (zzad) this.zzac.zze.zzc(this.zzj.presentationTimeUs);
                                                        if (zzadVar6 == null && this.zzae && this.zzu != null) {
                                                            zzadVar6 = (zzad) this.zzac.zze.zzb();
                                                        }
                                                        if (zzadVar6 != null) {
                                                            this.zzn = zzadVar6;
                                                        } else if (this.zzv && this.zzn != null) {
                                                        }
                                                        zzad zzadVar7 = this.zzn;
                                                        if (zzadVar7 == null) {
                                                            throw th2;
                                                        }
                                                        zzan(zzadVar7, this.zzu);
                                                        this.zzv = z13;
                                                        this.zzae = z13;
                                                    } else {
                                                        this.zzF = z13;
                                                        zzsnVar.zzo(iZzb, z13);
                                                    }
                                                } else {
                                                    if (iZzb != -2) {
                                                        if (this.zzG && (this.zzZ || this.zzS == i10)) {
                                                            zzai();
                                                        }
                                                        th = th2;
                                                        break;
                                                    }
                                                    this.zzW = z12;
                                                    zzsn zzsnVar2 = this.zzs;
                                                    if (zzsnVar2 == null) {
                                                        throw th2;
                                                    }
                                                    MediaFormat mediaFormatZzc = zzsnVar2.zzc();
                                                    if (this.zzA != 0 && mediaFormatZzc.getInteger("width") == 32 && mediaFormatZzc.getInteger("height") == 32) {
                                                        this.zzF = z12;
                                                    } else {
                                                        this.zzu = mediaFormatZzc;
                                                        this.zzv = z12;
                                                    }
                                                }
                                            }
                                            if (this.zzD && this.zzV) {
                                                try {
                                                    ByteBuffer byteBuffer3 = this.zzK;
                                                    int i12 = this.zzJ;
                                                    MediaCodec.BufferInfo bufferInfo3 = this.zzj;
                                                    int i13 = bufferInfo3.flags;
                                                    long j13 = bufferInfo3.presentationTimeUs;
                                                    boolean z14 = this.zzL;
                                                    boolean z15 = this.zzM;
                                                    zzad zzadVar8 = this.zzn;
                                                    if (zzadVar8 == null) {
                                                        th = th2;
                                                        throw th;
                                                    }
                                                    th = th2;
                                                    try {
                                                        zZzar = zzar(j4, j10, zzsnVar, byteBuffer3, i12, i13, 1, j13, z14, z15, zzadVar8);
                                                    } catch (IllegalStateException unused2) {
                                                        zzai();
                                                        if (this.zzaa) {
                                                            zzaG();
                                                        }
                                                    }
                                                } catch (IllegalStateException unused3) {
                                                    th = th2;
                                                }
                                                zzai();
                                                if (this.zzaa) {
                                                    zzaG();
                                                }
                                            } else {
                                                th = th2;
                                                ByteBuffer byteBuffer4 = this.zzK;
                                                int i14 = this.zzJ;
                                                MediaCodec.BufferInfo bufferInfo4 = this.zzj;
                                                int i15 = bufferInfo4.flags;
                                                long j14 = bufferInfo4.presentationTimeUs;
                                                boolean z16 = this.zzL;
                                                boolean z17 = this.zzM;
                                                zzad zzadVar9 = this.zzn;
                                                if (zzadVar9 == null) {
                                                    throw th;
                                                }
                                                zZzar = zzar(j4, j10, zzsnVar, byteBuffer4, i14, i15, 1, j14, z16, z17, zzadVar9);
                                            }
                                            if (!zZzar) {
                                                break;
                                            }
                                            zzaD(this.zzj.presentationTimeUs);
                                            int i16 = this.zzj.flags & 4;
                                            zzaQ();
                                            if (i16 != 0) {
                                                zzai();
                                                break;
                                            }
                                            th2 = th;
                                            z12 = true;
                                            i10 = 2;
                                            z13 = false;
                                        }
                                        while (true) {
                                            zzsn zzsnVar3 = this.zzs;
                                            if (zzsnVar3 != null && this.zzS != 2 && !this.zzZ) {
                                                if (this.zzI < 0) {
                                                    int iZza2 = zzsnVar3.zza();
                                                    this.zzI = iZza2;
                                                    if (iZza2 >= 0) {
                                                        this.zzg.zzc = zzsnVar3.zzf(iZza2);
                                                        this.zzg.zzb();
                                                    }
                                                }
                                                z4 = true;
                                                if (this.zzS == 1) {
                                                    if (!this.zzG) {
                                                        this.zzV = true;
                                                        zzsnVar3.zzk(this.zzI, 0, 0, 0L, 4);
                                                        zzao();
                                                    }
                                                    this.zzS = 2;
                                                    break;
                                                }
                                                try {
                                                    if (this.zzE) {
                                                        this.zzE = false;
                                                        ByteBuffer byteBuffer5 = this.zzg.zzc;
                                                        if (byteBuffer5 == null) {
                                                            throw th;
                                                        }
                                                        byteBuffer5.put(zzb);
                                                        zzsnVar3.zzk(this.zzI, 0, 38, 0L, 0);
                                                        zzao();
                                                        this.zzU = true;
                                                    } else {
                                                        if (this.zzR == 1) {
                                                            int i17 = 0;
                                                            while (true) {
                                                                zzad zzadVar10 = this.zzt;
                                                                if (zzadVar10 == null) {
                                                                    throw th;
                                                                }
                                                                if (i17 >= zzadVar10.zzr.size()) {
                                                                    this.zzR = 2;
                                                                    break;
                                                                }
                                                                byte[] bArr = (byte[]) this.zzt.zzr.get(i17);
                                                                ByteBuffer byteBuffer6 = this.zzg.zzc;
                                                                if (byteBuffer6 == null) {
                                                                    throw th;
                                                                }
                                                                byteBuffer6.put(bArr);
                                                                i17++;
                                                            }
                                                        }
                                                        ByteBuffer byteBuffer7 = this.zzg.zzc;
                                                        if (byteBuffer7 == null) {
                                                            throw th;
                                                        }
                                                        int iPosition = byteBuffer7.position();
                                                        zzkj zzkjVarZzk2 = zzk();
                                                        try {
                                                            int iZzcW2 = zzcW(zzkjVarZzk2, this.zzg, 0);
                                                            if (iZzcW2 == -3) {
                                                                if (!zzQ()) {
                                                                    break;
                                                                }
                                                                this.zzY = this.zzX;
                                                                break;
                                                            }
                                                            if (iZzcW2 == -5) {
                                                                if (this.zzR == 2) {
                                                                    this.zzg.zzb();
                                                                    this.zzR = 1;
                                                                }
                                                                zzac(zzkjVarZzk2);
                                                            } else {
                                                                zzhm zzhmVar4 = this.zzg;
                                                                if (zzhmVar4.zzf()) {
                                                                    this.zzY = this.zzX;
                                                                    if (this.zzR == 2) {
                                                                        zzhmVar4.zzb();
                                                                        this.zzR = 1;
                                                                    }
                                                                    this.zzZ = true;
                                                                    if (!this.zzU) {
                                                                        zzai();
                                                                        break;
                                                                    } else {
                                                                        if (!this.zzG) {
                                                                            this.zzV = true;
                                                                            zzsnVar3.zzk(this.zzI, 0, 0, 0L, 4);
                                                                            zzao();
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                if (!this.zzU && !zzhmVar4.zzg()) {
                                                                    zzhmVar4.zzb();
                                                                    if (this.zzR == 2) {
                                                                        this.zzR = 1;
                                                                    }
                                                                } else if (zzaO(zzhmVar4)) {
                                                                    this.zzg.zzb();
                                                                    this.zza.zzd++;
                                                                } else {
                                                                    zzhm zzhmVar5 = this.zzg;
                                                                    boolean zZzl = zzhmVar5.zzl();
                                                                    if (zZzl) {
                                                                        zzhmVar5.zzb.zzb(iPosition);
                                                                    }
                                                                    long j15 = this.zzg.zze;
                                                                    if (this.zzab) {
                                                                        if (this.zzk.isEmpty()) {
                                                                            zzej zzejVar = this.zzac.zze;
                                                                            zzad zzadVar11 = this.zzm;
                                                                            if (zzadVar11 == null) {
                                                                                throw th;
                                                                            }
                                                                            zzejVar.zzd(j15, zzadVar11);
                                                                        } else {
                                                                            zzej zzejVar2 = ((zzsw) this.zzk.peekLast()).zze;
                                                                            zzad zzadVar12 = this.zzm;
                                                                            if (zzadVar12 == null) {
                                                                                throw th;
                                                                            }
                                                                            zzejVar2.zzd(j15, zzadVar12);
                                                                        }
                                                                        this.zzab = false;
                                                                    }
                                                                    long jMax2 = Math.max(this.zzX, j15);
                                                                    this.zzX = jMax2;
                                                                    if (zzQ() || this.zzg.zzh()) {
                                                                        this.zzY = jMax2;
                                                                    }
                                                                    this.zzg.zzk();
                                                                    zzhm zzhmVar6 = this.zzg;
                                                                    if (zzhmVar6.zze()) {
                                                                        zzaj(zzhmVar6);
                                                                    }
                                                                    zzaE(this.zzg);
                                                                    zzau(this.zzg);
                                                                    if (zZzl) {
                                                                        zzsnVar3.zzl(this.zzI, 0, this.zzg.zzb, j15, 0);
                                                                    } else {
                                                                        int i18 = this.zzI;
                                                                        ByteBuffer byteBuffer8 = this.zzg.zzc;
                                                                        if (byteBuffer8 == null) {
                                                                            throw th;
                                                                        }
                                                                        zzsnVar3.zzk(i18, 0, byteBuffer8.limit(), j15, 0);
                                                                    }
                                                                    zzao();
                                                                    this.zzU = true;
                                                                    this.zzR = 0;
                                                                    this.zza.zzc++;
                                                                }
                                                            }
                                                        } catch (zzhl e11) {
                                                            zzak(e11);
                                                            zzaW(0);
                                                            zzah();
                                                        }
                                                    }
                                                } catch (IllegalStateException e12) {
                                                    e = e12;
                                                    b10 = 0;
                                                    z10 = e instanceof MediaCodec.CodecException;
                                                    if (!z10) {
                                                        stackTrace = e.getStackTrace();
                                                        if (stackTrace.length > 0 || !stackTrace[b10].getClassName().equals("android.media.MediaCodec")) {
                                                            throw e;
                                                        }
                                                    }
                                                    zzak(e);
                                                    if (z10 || !((MediaCodec.CodecException) e).isRecoverable()) {
                                                        r11 = b10;
                                                    } else {
                                                        r11 = z4;
                                                    }
                                                    if (r11 != 0) {
                                                        zzaG();
                                                    }
                                                    zzspVarZzaA = zzaA(e, this.zzz);
                                                    if (zzspVarZzaA.zzb == 1101) {
                                                        i = 4006;
                                                    } else {
                                                        i = 4003;
                                                    }
                                                    throw zzcY(zzspVarZzaA, this.zzm, r11, i);
                                                }
                                            }
                                            break;
                                        }
                                        Trace.endSection();
                                    } else {
                                        this.zza.zzd += zzd(j4);
                                        zzaW(1);
                                    }
                                }
                                this.zza.zza();
                            } catch (MediaCodec.CryptoException e13) {
                                e = e13;
                            }
                        } catch (IllegalStateException e14) {
                            e = e14;
                            b10 = 0;
                            z4 = true;
                            z10 = e instanceof MediaCodec.CodecException;
                            if (!z10) {
                                stackTrace = e.getStackTrace();
                                if (stackTrace.length > 0) {
                                }
                                throw e;
                            }
                            zzak(e);
                            if (z10) {
                                r11 = b10;
                            } else {
                                r11 = b10;
                            }
                            if (r11 != 0) {
                                zzaG();
                            }
                            zzspVarZzaA = zzaA(e, this.zzz);
                            if (zzspVarZzaA.zzb == 1101) {
                                i = 4006;
                            } else {
                                i = 4003;
                            }
                            throw zzcY(zzspVarZzaA, this.zzm, r11, i);
                        }
                    } catch (IllegalStateException e15) {
                        e = e15;
                    }
                } catch (MediaCodec.CryptoException e16) {
                    e = e16;
                    throw zzcY(e, this.zzm, r10, zzen.zzl(e.getErrorCode()));
                } catch (IllegalStateException e17) {
                    e = e17;
                    z10 = e instanceof MediaCodec.CodecException;
                    if (!z10) {
                        stackTrace = e.getStackTrace();
                        if (stackTrace.length > 0) {
                        }
                        throw e;
                    }
                    zzak(e);
                    if (z10) {
                        r11 = b10;
                    } else {
                        r11 = b10;
                    }
                    if (r11 != 0) {
                        zzaG();
                    }
                    zzspVarZzaA = zzaA(e, this.zzz);
                    if (zzspVarZzaA.zzb == 1101) {
                        i = 4006;
                    } else {
                        i = 4003;
                    }
                    throw zzcY(zzspVarZzaA, this.zzm, r11, i);
                }
            } catch (MediaCodec.CryptoException e18) {
                e = e18;
                r10 = 0;
            }
        } catch (IllegalStateException e19) {
            e = e19;
            z4 = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public boolean zzW() {
        return this.zzaa;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public boolean zzX() {
        if (this.zzm == null) {
            return false;
        }
        if (zzS() || zzaU()) {
            return true;
        }
        return this.zzH != -9223372036854775807L && zzi().zzb() < this.zzH;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final int zzY(zzad zzadVar) throws zzig {
        try {
            return zzaa(this.zzd, zzadVar);
        } catch (zztf e) {
            throw zzcY(e, zzadVar, false, 4002);
        }
    }

    public float zzZ(float f10, zzad zzadVar, zzad[] zzadVarArr) {
        throw null;
    }

    public zzsp zzaA(Throwable th, zzsq zzsqVar) {
        return new zzsp(th, zzsqVar);
    }

    public final zzsq zzaB() {
        return this.zzz;
    }

    /* JADX WARN: Code duplicated, block: B:219:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:226:0x040b  */
    /* JADX WARN: Code duplicated, block: B:259:0x0476  */
    /* JADX WARN: Code duplicated, block: B:296:0x0520 A[Catch: zzsu -> 0x0061, TryCatch #0 {zzsu -> 0x0061, blocks: (B:25:0x0057, B:27:0x005b, B:30:0x0064, B:32:0x0069, B:34:0x006d, B:36:0x0083, B:39:0x0091, B:43:0x009d, B:45:0x00a5, B:47:0x00a9, B:49:0x00ad, B:51:0x00b6, B:294:0x0505, B:296:0x0520, B:298:0x0529, B:301:0x0530, B:302:0x0532, B:297:0x0523, B:304:0x0535, B:305:0x0536, B:307:0x053b, B:308:0x053c, B:309:0x0546, B:41:0x0094, B:42:0x009c, B:311:0x0548), top: B:315:0x0057, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:297:0x0523 A[Catch: zzsu -> 0x0061, TryCatch #0 {zzsu -> 0x0061, blocks: (B:25:0x0057, B:27:0x005b, B:30:0x0064, B:32:0x0069, B:34:0x006d, B:36:0x0083, B:39:0x0091, B:43:0x009d, B:45:0x00a5, B:47:0x00a9, B:49:0x00ad, B:51:0x00b6, B:294:0x0505, B:296:0x0520, B:298:0x0529, B:301:0x0530, B:302:0x0532, B:297:0x0523, B:304:0x0535, B:305:0x0536, B:307:0x053b, B:308:0x053c, B:309:0x0546, B:41:0x0094, B:42:0x009c, B:311:0x0548), top: B:315:0x0057, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:300:0x052f  */
    /* JADX WARN: Code duplicated, block: B:330:0x0530 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [android.media.MediaCrypto, com.google.android.gms.internal.ads.zzsx] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v11 */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r22v9, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.google.android.gms.internal.ads.zzhw, com.google.android.gms.internal.ads.zzsy] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean] */
    public final void zzaC() throws zzig {
        zzad zzadVar;
        int i;
        ?? r22;
        zzsu zzsuVar;
        zzsu zzsuVar2;
        zzsk zzskVar;
        int i10;
        ?? r10;
        if (this.zzs != null || this.zzN || (zzadVar = this.zzm) == null) {
            return;
        }
        int i11 = 1;
        if (zzaM(zzadVar)) {
            zzad();
            String str = zzadVar.zzo;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.zzi.zzo(32);
            } else {
                this.zzi.zzo(1);
            }
            this.zzN = true;
            return;
        }
        zzrq zzrqVar = this.zzag;
        this.zzaf = zzrqVar;
        if (zzrqVar != null) {
            zzdb.zzf(true);
            zzrq zzrqVar2 = this.zzaf;
            boolean z4 = zzrr.zza;
            zzrqVar2.zza();
        }
        int i12 = 0;
        try {
            if (this.zzaf != null) {
                zzdb.zzb(zzadVar.zzo);
            }
            zzad zzadVar2 = this.zzm;
            ?? r13 = 0;
            if (zzadVar2 == null) {
                throw null;
            }
            if (this.zzx == null) {
                try {
                    List listZzag = zzag(this.zzd, zzadVar2, false);
                    listZzag.isEmpty();
                    this.zzx = new ArrayDeque();
                    if (!listZzag.isEmpty()) {
                        this.zzx.add((zzsq) listZzag.get(0));
                    }
                    this.zzy = null;
                } catch (zztf e) {
                    throw new zzsu(zzadVar2, (Throwable) e, false, -49998);
                }
            }
            if (this.zzx.isEmpty()) {
                throw new zzsu(zzadVar2, (Throwable) null, false, -49999);
            }
            ArrayDeque arrayDeque = this.zzx;
            if (arrayDeque == null) {
                throw null;
            }
            while (this.zzs == null) {
                zzsq zzsqVar = (zzsq) arrayDeque.peekFirst();
                if (zzsqVar == null) {
                    throw r13;
                }
                if (!zzaN(zzsqVar)) {
                    return;
                }
                try {
                    zzad zzadVar3 = this.zzm;
                    if (zzadVar3 == null) {
                        throw r13;
                    }
                    String str2 = zzsqVar.zza;
                    int i13 = zzen.zza;
                    float fZzZ = i13 < 23 ? -1.0f : zzZ(this.zzr, zzadVar3, zzT());
                    if (fZzZ <= this.zze) {
                        fZzZ = -1.0f;
                    }
                    zzaF(zzadVar3);
                    long jZzb = zzi().zzb();
                    zzsk zzskVarZzaf = zzaf(zzsqVar, zzadVar3, r13, fZzZ);
                    if (i13 >= 31) {
                        zzst.zza(zzskVarZzaf, zzo());
                    }
                    try {
                        Trace.beginSection("createCodec:" + str2);
                        zzsn zzsnVarZzd = this.zzc.zzd(zzskVarZzaf);
                        this.zzs = zzsnVarZzd;
                        zzsnVarZzd.zzs(new zzsv(this, r13));
                        Trace.endSection();
                        long jZzb2 = zzi().zzb();
                        if (zzsqVar.zze(zzadVar3)) {
                            zzskVar = zzskVarZzaf;
                            i = i11;
                            r22 = r13;
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            i = i11;
                            try {
                                sb2.append("id=");
                                sb2.append(zzadVar3.zza);
                                sb2.append(", mimeType=");
                                sb2.append(zzadVar3.zzo);
                                if (zzadVar3.zzn != null) {
                                    sb2.append(", container=");
                                    sb2.append(zzadVar3.zzn);
                                }
                                r22 = r13;
                                if (zzadVar3.zzj != -1) {
                                    try {
                                        sb2.append(", bitrate=");
                                        sb2.append(zzadVar3.zzj);
                                    } catch (Exception e4) {
                                        e = e4;
                                        r22 = r22;
                                        zzdt.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzsqVar.zza), e);
                                        arrayDeque.removeFirst();
                                        zzsuVar = new zzsu(zzadVar2, (Throwable) e, false, zzsqVar);
                                        zzak(zzsuVar);
                                        zzsuVar2 = this.zzy;
                                        if (zzsuVar2 == null) {
                                            this.zzy = zzsuVar;
                                        } else {
                                            this.zzy = zzsu.zza(zzsuVar2, zzsuVar);
                                        }
                                        if (!arrayDeque.isEmpty()) {
                                            throw this.zzy;
                                        }
                                    }
                                }
                                if (zzadVar3.zzk != null) {
                                    sb2.append(", codecs=");
                                    sb2.append(zzadVar3.zzk);
                                }
                                if (zzadVar3.zzs != null) {
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    while (true) {
                                        zzw zzwVar = zzadVar3.zzs;
                                        if (i12 >= zzwVar.zzb) {
                                            break;
                                        }
                                        UUID uuid = zzwVar.zza(i12).zza;
                                        if (uuid.equals(zzj.zzb)) {
                                            linkedHashSet.add("cenc");
                                        } else if (uuid.equals(zzj.zzc)) {
                                            linkedHashSet.add("clearkey");
                                        } else if (uuid.equals(zzj.zze)) {
                                            linkedHashSet.add("playready");
                                        } else if (uuid.equals(zzj.zzd)) {
                                            linkedHashSet.add("widevine");
                                        } else {
                                            if (uuid.equals(zzj.zza)) {
                                                linkedHashSet.add("universal");
                                            } else {
                                                linkedHashSet.add("unknown (" + uuid.toString() + ")");
                                            }
                                            i12++;
                                            zzskVarZzaf = zzskVarZzaf;
                                        }
                                        i12++;
                                        zzskVarZzaf = zzskVarZzaf;
                                    }
                                    zzskVar = zzskVarZzaf;
                                    sb2.append(", drm=[");
                                    zzfwi.zzb(sb2, linkedHashSet, ",");
                                    sb2.append(']');
                                } else {
                                    zzskVar = zzskVarZzaf;
                                }
                                if (zzadVar3.zzu != -1 && zzadVar3.zzv != -1) {
                                    sb2.append(", res=");
                                    sb2.append(zzadVar3.zzu);
                                    sb2.append("x");
                                    sb2.append(zzadVar3.zzv);
                                }
                                zzm zzmVar = zzadVar3.zzB;
                                if (zzmVar != null && (zzmVar.zze() || zzmVar.zzf())) {
                                    sb2.append(", color=");
                                    sb2.append(zzadVar3.zzB.zzd());
                                }
                                if (zzadVar3.zzw != -1.0f) {
                                    sb2.append(", fps=");
                                    sb2.append(zzadVar3.zzw);
                                }
                                if (zzadVar3.zzC != -1) {
                                    sb2.append(", channels=");
                                    sb2.append(zzadVar3.zzC);
                                }
                                if (zzadVar3.zzD != -1) {
                                    sb2.append(", sample_rate=");
                                    sb2.append(zzadVar3.zzD);
                                }
                                if (zzadVar3.zzd != null) {
                                    sb2.append(", language=");
                                    sb2.append(zzadVar3.zzd);
                                }
                                if (!zzadVar3.zzc.isEmpty()) {
                                    sb2.append(", labels=[");
                                    zzfwi.zzb(sb2, zzgae.zzb(zzadVar3.zzc, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzaa
                                        @Override // com.google.android.gms.internal.ads.zzfwh
                                        public final Object apply(Object obj) {
                                            zzai zzaiVar = (zzai) obj;
                                            int i14 = zzad.zzK;
                                            return v.u(zzaiVar.zza, ": ", zzaiVar.zzb);
                                        }
                                    }), ",");
                                    sb2.append("]");
                                }
                                if (zzadVar3.zze != 0) {
                                    sb2.append(", selectionFlags=[");
                                    int i14 = zzadVar3.zze;
                                    ArrayList arrayList = new ArrayList();
                                    if ((i14 & 1) != 0) {
                                        arrayList.add("default");
                                    }
                                    if ((i14 & 2) != 0) {
                                        arrayList.add("forced");
                                    }
                                    zzfwi.zzb(sb2, arrayList, ",");
                                    sb2.append("]");
                                }
                                if (zzadVar3.zzf != 0) {
                                    sb2.append(", roleFlags=[");
                                    int i15 = zzadVar3.zzf;
                                    ArrayList arrayList2 = new ArrayList();
                                    if ((i15 & 1) != 0) {
                                        arrayList2.add("main");
                                    }
                                    if ((i15 & 2) != 0) {
                                        arrayList2.add("alt");
                                    }
                                    if ((i15 & 4) != 0) {
                                        arrayList2.add("supplementary");
                                    }
                                    if ((i15 & 8) != 0) {
                                        arrayList2.add("commentary");
                                    }
                                    if ((i15 & 16) != 0) {
                                        arrayList2.add("dub");
                                    }
                                    if ((i15 & 32) != 0) {
                                        arrayList2.add("emergency");
                                    }
                                    if ((i15 & 64) != 0) {
                                        arrayList2.add("caption");
                                    }
                                    if ((i15 & 128) != 0) {
                                        arrayList2.add("subtitle");
                                    }
                                    if ((i15 & 256) != 0) {
                                        arrayList2.add("sign");
                                    }
                                    if ((i15 & 512) != 0) {
                                        arrayList2.add("describes-video");
                                    }
                                    if ((i15 & 1024) != 0) {
                                        arrayList2.add("describes-music");
                                    }
                                    if ((i15 & 2048) != 0) {
                                        arrayList2.add("enhanced-intelligibility");
                                    }
                                    if ((i15 & 4096) != 0) {
                                        arrayList2.add("transcribes-dialog");
                                    }
                                    if ((i15 & 8192) != 0) {
                                        arrayList2.add("easy-read");
                                    }
                                    if ((i15 & 16384) != 0) {
                                        arrayList2.add("trick-play");
                                    }
                                    if ((i15 & 32768) != 0) {
                                        arrayList2.add("auxiliary");
                                    }
                                    zzfwi.zzb(sb2, arrayList2, ",");
                                    sb2.append("]");
                                }
                                if ((zzadVar3.zzf & 32768) != 0) {
                                    sb2.append(", auxiliaryTrackType=");
                                    sb2.append("undefined");
                                }
                                String string = sb2.toString();
                                Locale locale = Locale.US;
                                zzdt.zzf("MediaCodecRenderer", "Format exceeds selected codec's capabilities [" + string + ", " + str2 + "]");
                                r22 = r22;
                            } catch (Exception e10) {
                                e = e10;
                                r22 = r13;
                                zzdt.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzsqVar.zza), e);
                                arrayDeque.removeFirst();
                                zzsuVar = new zzsu(zzadVar2, (Throwable) e, false, zzsqVar);
                                zzak(zzsuVar);
                                zzsuVar2 = this.zzy;
                                if (zzsuVar2 == null) {
                                    this.zzy = zzsuVar;
                                } else {
                                    this.zzy = zzsu.zza(zzsuVar2, zzsuVar);
                                }
                                if (!arrayDeque.isEmpty()) {
                                    throw this.zzy;
                                }
                            }
                        }
                        this.zzz = zzsqVar;
                        this.zzw = fZzZ;
                        this.zzt = zzadVar3;
                        int i16 = zzen.zza;
                        if (i16 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str2)) {
                            String str3 = zzen.zzd;
                            if (str3.startsWith("SM-T585") || str3.startsWith("SM-A510") || str3.startsWith("SM-A520") || str3.startsWith("SM-J700")) {
                                i10 = 2;
                            } else if (i16 < 24) {
                                i10 = 0;
                            } else {
                                i10 = 0;
                            }
                        } else if (i16 < 24 || !("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2))) {
                            i10 = 0;
                        } else {
                            String str4 = zzen.zzb;
                            if ("flounder".equals(str4) || "flounder_lte".equals(str4) || "grouper".equals(str4) || "tilapia".equals(str4)) {
                                i10 = i;
                            } else {
                                i10 = 0;
                            }
                        }
                        this.zzA = i10;
                        this.zzB = (i16 == 29 && "c2.android.aac.decoder".equals(str2)) ? i : 0;
                        this.zzC = (i16 > 23 || !"OMX.google.vorbis.decoder".equals(str2)) ? 0 : i;
                        this.zzD = (i16 == 21 && "OMX.google.aac.decoder".equals(str2)) ? i : 0;
                        String str5 = zzsqVar.zza;
                        if (i16 <= 25 && "OMX.rk.video_decoder.avc".equals(str5)) {
                            r10 = i;
                        } else if ((i16 > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str5) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str5) || "OMX.bcm.vdec.avc.tunnel".equals(str5) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str5) || "OMX.bcm.vdec.hevc.tunnel".equals(str5) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str5))) && !("Amazon".equals(zzen.zzc) && "AFTS".equals(zzen.zzd) && zzsqVar.zzf)) {
                            r10 = 0;
                        } else {
                            r10 = i;
                        }
                        this.zzG = r10;
                        if (this.zzs == null) {
                            throw r22;
                        }
                        if (zzcV() == 2) {
                            this.zzH = zzi().zzb() + 1000;
                        }
                        this.zza.zza++;
                        zzal(str2, zzskVar, jZzb2, jZzb2 - jZzb);
                        i11 = i;
                        r13 = r22;
                        i12 = 0;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    i = i11;
                }
            }
            this.zzx = r13;
        } catch (zzsu e12) {
            throw zzcY(e12, zzadVar, false, 4001);
        }
    }

    public void zzaD(long j4) {
        this.zzad = j4;
        while (!this.zzk.isEmpty() && j4 >= ((zzsw) this.zzk.peek()).zzb) {
            zzsw zzswVar = (zzsw) this.zzk.poll();
            zzswVar.getClass();
            zzaR(zzswVar);
            zzap();
        }
    }

    public final void zzaG() {
        try {
            zzsn zzsnVar = this.zzs;
            if (zzsnVar != null) {
                zzsnVar.zzm();
                this.zza.zzb++;
                zzsq zzsqVar = this.zzz;
                if (zzsqVar == null) {
                    throw null;
                }
                zzam(zzsqVar.zza);
            }
            this.zzs = null;
            this.zzp = null;
            this.zzaf = null;
            zzaI();
        } catch (Throwable th) {
            this.zzs = null;
            this.zzp = null;
            this.zzaf = null;
            zzaI();
            throw th;
        }
    }

    public void zzaH() {
        zzao();
        zzaQ();
        this.zzH = -9223372036854775807L;
        this.zzV = false;
        this.zzU = false;
        this.zzE = false;
        this.zzF = false;
        this.zzL = false;
        this.zzM = false;
        this.zzX = -9223372036854775807L;
        this.zzY = -9223372036854775807L;
        this.zzad = -9223372036854775807L;
        this.zzS = 0;
        this.zzT = 0;
        this.zzR = this.zzQ ? 1 : 0;
    }

    public final void zzaI() {
        zzaH();
        this.zzx = null;
        this.zzz = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = false;
        this.zzW = false;
        this.zzw = -1.0f;
        this.zzA = 0;
        this.zzB = false;
        this.zzC = false;
        this.zzD = false;
        this.zzG = false;
        this.zzQ = false;
        this.zzR = 0;
    }

    public final boolean zzaJ() throws zzig {
        boolean zZzaK = zzaK();
        if (zZzaK) {
            zzaC();
        }
        return zZzaK;
    }

    public final boolean zzaK() {
        if (this.zzs == null) {
            return false;
        }
        int i = this.zzT;
        if (i == 3 || ((this.zzB && !this.zzW) || (this.zzC && this.zzV))) {
            zzaG();
            return true;
        }
        if (i == 2) {
            int i10 = zzen.zza;
            zzdb.zzf(i10 >= 23);
            if (i10 >= 23) {
                try {
                    zzaS();
                } catch (zzig e) {
                    zzdt.zzg("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    zzaG();
                    return true;
                }
            }
        }
        zzah();
        return false;
    }

    public final boolean zzaL() {
        return this.zzN;
    }

    public final boolean zzaM(zzad zzadVar) {
        return this.zzag == null && zzas(zzadVar);
    }

    public boolean zzaN(zzsq zzsqVar) {
        return true;
    }

    public boolean zzaO(zzhm zzhmVar) {
        return false;
    }

    public abstract int zzaa(zzta zztaVar, zzad zzadVar) throws zztf;

    public zzhy zzab(zzsq zzsqVar, zzad zzadVar, zzad zzadVar2) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    public zzhy zzac(zzkj zzkjVar) throws zzig {
        int i;
        boolean z4 = true;
        this.zzab = true;
        zzad zzadVarZzaf = zzkjVar.zza;
        zzadVarZzaf.getClass();
        String str = zzadVarZzaf.zzo;
        if (str == null) {
            throw zzcY(new IllegalArgumentException("Sample MIME type is null."), zzadVarZzaf, false, 4005);
        }
        if (str.equals("video/av01") && !zzadVarZzaf.zzr.isEmpty()) {
            zzab zzabVarZzb = zzadVarZzaf.zzb();
            zzabVarZzb.zzM(null);
            zzadVarZzaf = zzabVarZzb.zzaf();
        }
        zzad zzadVar = zzadVarZzaf;
        this.zzag = zzkjVar.zzb;
        this.zzm = zzadVar;
        if (this.zzN) {
            this.zzP = true;
            return null;
        }
        zzsn zzsnVar = this.zzs;
        if (zzsnVar == null) {
            this.zzx = null;
            zzaC();
            return null;
        }
        zzsq zzsqVar = this.zzz;
        zzsqVar.getClass();
        zzad zzadVar2 = this.zzt;
        zzadVar2.getClass();
        zzrq zzrqVar = this.zzaf;
        zzrq zzrqVar2 = this.zzag;
        if (zzrqVar != zzrqVar2) {
            zzae();
            return new zzhy(zzsqVar.zza, zzadVar2, zzadVar, 0, 128);
        }
        boolean z10 = zzrqVar2 != zzrqVar;
        zzdb.zzf(!z10 || zzen.zza >= 23);
        zzhy zzhyVarZzab = zzab(zzsqVar, zzadVar2, zzadVar);
        int i10 = zzhyVarZzab.zzd;
        if (i10 != 0) {
            i = 2;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (zzaX(zzadVar)) {
                        this.zzt = zzadVar;
                        if (!z10 || zzaT()) {
                        }
                    } else {
                        i = 16;
                    }
                } else if (zzaX(zzadVar)) {
                    this.zzQ = true;
                    this.zzR = 1;
                    int i11 = this.zzA;
                    if (i11 != 2 && (i11 != 1 || zzadVar.zzu != zzadVar2.zzu || zzadVar.zzv != zzadVar2.zzv)) {
                        z4 = false;
                    }
                    this.zzE = z4;
                    this.zzt = zzadVar;
                    if (!z10 || zzaT()) {
                    }
                } else {
                    i = 16;
                }
            } else if (zzaX(zzadVar)) {
                this.zzt = zzadVar;
                if (z10) {
                    if (zzaT()) {
                    }
                } else if (this.zzU) {
                    this.zzS = 1;
                    if (this.zzC) {
                        this.zzT = 3;
                    } else {
                        this.zzT = 1;
                    }
                }
            } else {
                i = 16;
            }
            return (zzhyVarZzab.zzd != 0 || (this.zzs == zzsnVar && this.zzT != 3)) ? zzhyVarZzab : new zzhy(zzsqVar.zza, zzadVar2, zzadVar, 0, i);
        }
        zzae();
        i = 0;
        if (zzhyVarZzab.zzd != 0) {
        }
    }

    public abstract zzsk zzaf(zzsq zzsqVar, zzad zzadVar, MediaCrypto mediaCrypto, float f10);

    public abstract List zzag(zzta zztaVar, zzad zzadVar, boolean z4) throws zztf;

    public void zzaj(zzhm zzhmVar) throws zzig {
        throw null;
    }

    public void zzak(Exception exc) {
        throw null;
    }

    public void zzal(String str, zzsk zzskVar, long j4, long j10) {
        throw null;
    }

    public void zzam(String str) {
        throw null;
    }

    public void zzan(zzad zzadVar, MediaFormat mediaFormat) throws zzig {
        throw null;
    }

    public abstract boolean zzar(long j4, long j10, zzsn zzsnVar, ByteBuffer byteBuffer, int i, int i10, int i11, long j11, boolean z4, boolean z10, zzad zzadVar) throws zzig;

    public boolean zzas(zzad zzadVar) {
        return false;
    }

    public final float zzat() {
        return this.zzq;
    }

    public int zzau(zzhm zzhmVar) {
        return 0;
    }

    public final long zzav() {
        return this.zzac.zzd;
    }

    public final long zzaw() {
        return this.zzac.zzc;
    }

    public final zzlm zzay() {
        return this.zzo;
    }

    public final zzsn zzaz() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzhw, com.google.android.gms.internal.ads.zzlq
    public final int zze() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzhw, com.google.android.gms.internal.ads.zzli
    public void zzu(int i, Object obj) throws zzig {
        if (i == 11) {
            this.zzo = (zzlm) obj;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public void zzx() {
        this.zzm = null;
        zzaR(zzsw.zza);
        this.zzk.clear();
        zzaK();
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public void zzy(boolean z4, boolean z10) throws zzig {
        this.zza = new zzhx();
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public void zzz(long j4, boolean z4) throws zzig {
        this.zzZ = false;
        this.zzaa = false;
        if (this.zzN) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzO = false;
            this.zzl.zzb();
        } else {
            zzaJ();
        }
        zzej zzejVar = this.zzac.zze;
        if (zzejVar.zza() > 0) {
            this.zzab = true;
        }
        zzejVar.zze();
        this.zzk.clear();
    }

    public void zzap() {
    }

    public void zzaq() throws zzig {
    }

    public void zzaE(zzhm zzhmVar) throws zzig {
    }

    public void zzaF(zzad zzadVar) throws zzig {
    }
}
