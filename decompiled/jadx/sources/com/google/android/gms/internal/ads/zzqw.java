package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import da.v;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzqw implements zzpu {
    private static final Object zza = new Object();
    private static ScheduledExecutorService zzb;
    private static int zzc;
    private boolean zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private long zzI;
    private float zzJ;
    private ByteBuffer zzK;
    private int zzL;
    private ByteBuffer zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private int zzR;
    private zzh zzS;
    private zzow zzT;
    private long zzU;
    private boolean zzV;
    private boolean zzW;
    private Looper zzX;
    private long zzY;
    private long zzZ;
    private Handler zzaa;
    private final zzqm zzab;
    private final zzqc zzac;
    private final Context zzd;
    private final zzpz zze;
    private final zzrg zzf;
    private final zzfzo zzg;
    private final zzfzo zzh;
    private final zzpy zzi;
    private final ArrayDeque zzj;
    private zzqu zzk;
    private final zzqq zzl;
    private final zzqq zzm;
    private zzoj zzn;
    private zzpr zzo;
    private zzql zzp;
    private zzql zzq;
    private zzcj zzr;
    private AudioTrack zzs;
    private zzop zzt;
    private zzov zzu;
    private zzqp zzv;
    private zzg zzw;
    private zzqn zzx;
    private zzqn zzy;
    private zzbj zzz;

    public /* synthetic */ zzqw(zzqk zzqkVar, zzqv zzqvVar) {
        zzop zzopVarZzc;
        Context context = zzqkVar.zza;
        this.zzd = context;
        zzg zzgVar = zzg.zza;
        this.zzw = zzgVar;
        zzqv zzqvVar2 = null;
        if (context != null) {
            zzop zzopVar = zzop.zza;
            int i = zzen.zza;
            zzopVarZzc = zzop.zzc(context, zzgVar, null);
        } else {
            zzopVarZzc = zzqkVar.zzb;
        }
        this.zzt = zzopVarZzc;
        this.zzab = zzqkVar.zze;
        int i10 = zzen.zza;
        zzqc zzqcVar = zzqkVar.zzf;
        zzqcVar.getClass();
        this.zzac = zzqcVar;
        this.zzi = new zzpy(new zzqr(this, zzqvVar2));
        zzpz zzpzVar = new zzpz();
        this.zze = zzpzVar;
        zzrg zzrgVar = new zzrg();
        this.zzf = zzrgVar;
        this.zzg = zzfzo.zzq(new zzcq(), zzpzVar, zzrgVar);
        this.zzh = zzfzo.zzo(new zzrf());
        this.zzJ = 1.0f;
        this.zzR = 0;
        this.zzS = new zzh(0, 0.0f);
        zzbj zzbjVar = zzbj.zza;
        this.zzy = new zzqn(zzbjVar, 0L, 0L, null);
        this.zzz = zzbjVar;
        this.zzA = false;
        this.zzj = new ArrayDeque();
        this.zzl = new zzqq();
        this.zzm = new zzqq();
    }

    public static /* synthetic */ void zzG(zzqw zzqwVar) {
        if (zzqwVar.zzZ >= 300000) {
            ((zzra) zzqwVar.zzo).zza.zzn = true;
            zzqwVar.zzZ = 0L;
        }
    }

    public static /* synthetic */ void zzI(AudioTrack audioTrack, final zzpr zzprVar, Handler handler, final zzpo zzpoVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (zzprVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqg
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((zzra) zzprVar).zza.zzc.zzd(zzpoVar);
                    }
                });
            }
            synchronized (zza) {
                try {
                    int i = zzc - 1;
                    zzc = i;
                    if (i == 0) {
                        zzb.shutdown();
                        zzb = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            if (zzprVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqg
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((zzra) zzprVar).zza.zzc.zzd(zzpoVar);
                    }
                });
            }
            synchronized (zza) {
                try {
                    int i10 = zzc - 1;
                    zzc = i10;
                    if (i10 == 0) {
                        zzb.shutdown();
                        zzb = null;
                    }
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzK() {
        boolean z4;
        synchronized (zza) {
            z4 = zzc > 0;
        }
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzL() {
        zzql zzqlVar = this.zzq;
        return zzqlVar.zzc == 0 ? this.zzB / ((long) zzqlVar.zzb) : this.zzC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzM() {
        zzql zzqlVar = this.zzq;
        if (zzqlVar.zzc != 0) {
            return this.zzE;
        }
        long j4 = this.zzD;
        long j10 = zzqlVar.zzd;
        int i = zzen.zza;
        return ((j4 + j10) - 1) / j10;
    }

    private final AudioTrack zzN(zzql zzqlVar) throws zzpq {
        try {
            return zzqlVar.zza(this.zzw, this.zzR);
        } catch (zzpq e) {
            zzpr zzprVar = this.zzo;
            if (zzprVar != null) {
                zzprVar.zza(e);
            }
            throw e;
        }
    }

    private final void zzO(long j4) {
        zzbj zzbjVar;
        boolean z4;
        if (zzab()) {
            zzqm zzqmVar = this.zzab;
            zzbjVar = this.zzz;
            zzqmVar.zzc(zzbjVar);
        } else {
            zzbjVar = zzbj.zza;
        }
        zzbj zzbjVar2 = zzbjVar;
        this.zzz = zzbjVar2;
        if (zzab()) {
            zzqm zzqmVar2 = this.zzab;
            z4 = this.zzA;
            zzqmVar2.zzd(z4);
        } else {
            z4 = false;
        }
        this.zzA = z4;
        this.zzj.add(new zzqn(zzbjVar2, Math.max(0L, j4), zzen.zzt(zzM(), this.zzq.zze), null));
        zzX();
        zzpr zzprVar = this.zzo;
        if (zzprVar != null) {
            ((zzra) zzprVar).zza.zzc.zzw(this.zzA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    private final void zzP(long j4) throws Exception {
        zzpr zzprVar;
        if (this.zzM == null || this.zzm.zzc()) {
            return;
        }
        int iRemaining = this.zzM.remaining();
        boolean z4 = true;
        int iWrite = this.zzs.write(this.zzM, iRemaining, 1);
        this.zzU = SystemClock.elapsedRealtime();
        if (iWrite < 0) {
            if ((zzen.zza < 24 || iWrite != -6) && iWrite != -32) {
                z4 = false;
            } else if (zzM() <= 0) {
                if (zzaa(this.zzs)) {
                    zzQ();
                } else {
                    z4 = false;
                }
            }
            zzpt zzptVar = new zzpt(iWrite, this.zzq.zza, z4);
            zzpr zzprVar2 = this.zzo;
            if (zzprVar2 != null) {
                zzprVar2.zza(zzptVar);
            }
            if (zzptVar.zzb) {
                this.zzt = zzop.zza;
                throw zzptVar;
            }
            this.zzm.zzb(zzptVar);
            return;
        }
        this.zzm.zza();
        if (zzaa(this.zzs)) {
            if (this.zzE > 0) {
                this.zzW = false;
            }
            if (this.zzQ && (zzprVar = this.zzo) != null && iWrite < iRemaining) {
            }
        }
        int i = this.zzq.zzc;
        if (i == 0) {
            this.zzD += (long) iWrite;
        }
        if (iWrite == iRemaining) {
            if (i != 0) {
                zzdb.zzf(this.zzM == this.zzK);
                this.zzE = (((long) this.zzF) * ((long) this.zzL)) + this.zzE;
            }
            this.zzM = null;
        }
    }

    private final void zzQ() {
        if (this.zzq.zzc()) {
            this.zzV = true;
        }
    }

    private final void zzR() {
        if (this.zzu != null || this.zzd == null) {
            return;
        }
        this.zzX = Looper.myLooper();
        zzov zzovVar = new zzov(this.zzd, new zzqf(this), this.zzw, this.zzT);
        this.zzu = zzovVar;
        this.zzt = zzovVar.zzc();
    }

    private final void zzS() {
        if (this.zzO) {
            return;
        }
        this.zzO = true;
        this.zzi.zzb(zzM());
        if (zzaa(this.zzs)) {
            this.zzP = false;
        }
        this.zzs.stop();
    }

    private final void zzT(long j4) throws Exception {
        zzP(j4);
        if (this.zzM != null) {
            return;
        }
        if (!this.zzr.zzh()) {
            ByteBuffer byteBuffer = this.zzK;
            if (byteBuffer != null) {
                zzV(byteBuffer);
                zzP(j4);
                return;
            }
            return;
        }
        while (!this.zzr.zzg()) {
            do {
                ByteBuffer byteBufferZzb = this.zzr.zzb();
                if (byteBufferZzb.hasRemaining()) {
                    zzV(byteBufferZzb);
                    zzP(j4);
                } else {
                    ByteBuffer byteBuffer2 = this.zzK;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.zzr.zze(this.zzK);
                    }
                }
            } while (this.zzM == null);
            return;
        }
    }

    private final void zzU(zzbj zzbjVar) {
        zzqn zzqnVar = new zzqn(zzbjVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzZ()) {
            this.zzx = zzqnVar;
        } else {
            this.zzy = zzqnVar;
        }
    }

    private final void zzV(ByteBuffer byteBuffer) {
        zzdb.zzf(this.zzM == null);
        if (byteBuffer.hasRemaining()) {
            this.zzM = byteBuffer;
        }
    }

    private final void zzW() {
        if (zzZ()) {
            this.zzs.setVolume(this.zzJ);
        }
    }

    private final void zzX() {
        zzcj zzcjVar = this.zzq.zzi;
        this.zzr = zzcjVar;
        zzcjVar.zzc();
    }

    private final boolean zzY() throws Exception {
        if (!this.zzr.zzh()) {
            zzP(Long.MIN_VALUE);
            return this.zzM == null;
        }
        this.zzr.zzd();
        zzT(Long.MIN_VALUE);
        if (!this.zzr.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer = this.zzM;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    private final boolean zzZ() {
        return this.zzs != null;
    }

    private static boolean zzaa(AudioTrack audioTrack) {
        return zzen.zza >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean zzab() {
        zzql zzqlVar = this.zzq;
        if (zzqlVar.zzc != 0) {
            return false;
        }
        int i = zzqlVar.zza.zzE;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final boolean zzA(zzad zzadVar) {
        return zza(zzadVar) != 0;
    }

    public final void zzJ(zzop zzopVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.zzX;
        if (looper != looperMyLooper) {
            throw new IllegalStateException(v.k("Current looper (", looperMyLooper != null ? looperMyLooper.getThread().getName() : "null", ") is not the playback looper (", looper == null ? "null" : looper.getThread().getName(), ")"));
        }
        if (zzopVar.equals(this.zzt)) {
            return;
        }
        this.zzt = zzopVar;
        zzpr zzprVar = this.zzo;
        if (zzprVar != null) {
            ((zzra) zzprVar).zza.zzB();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final int zza(zzad zzadVar) {
        zzR();
        if (!"audio/raw".equals(zzadVar.zzo)) {
            return this.zzt.zzb(zzadVar, this.zzw) != null ? 2 : 0;
        }
        if (zzen.zzJ(zzadVar.zzE)) {
            return zzadVar.zzE != 2 ? 1 : 2;
        }
        q1.a.o(zzadVar.zzE, "Invalid PCM encoding: ", "DefaultAudioSink");
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final long zzb(boolean z4) {
        long jZzq;
        if (!zzZ() || this.zzH) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.zzi.zza(z4), zzen.zzt(zzM(), this.zzq.zze));
        while (!this.zzj.isEmpty() && jMin >= ((zzqn) this.zzj.getFirst()).zzc) {
            this.zzy = (zzqn) this.zzj.remove();
        }
        long j4 = jMin - this.zzy.zzc;
        if (this.zzj.isEmpty()) {
            jZzq = this.zzy.zzb + this.zzab.zza(j4);
        } else {
            zzqn zzqnVar = (zzqn) this.zzj.getFirst();
            jZzq = zzqnVar.zzb - zzen.zzq(zzqnVar.zzc - jMin, this.zzy.zza.zzb);
        }
        long jZzb = this.zzab.zzb();
        long jZzt = zzen.zzt(jZzb, this.zzq.zze) + jZzq;
        long j10 = this.zzY;
        if (jZzb > j10) {
            long jZzt2 = zzen.zzt(jZzb - j10, this.zzq.zze);
            this.zzY = jZzb;
            this.zzZ += jZzt2;
            if (this.zzaa == null) {
                this.zzaa = new Handler(Looper.myLooper());
            }
            this.zzaa.removeCallbacksAndMessages(null);
            this.zzaa.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqe
                @Override // java.lang.Runnable
                public final void run() {
                    zzqw.zzG(this.zza);
                }
            }, 100L);
        }
        return jZzt;
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final zzbj zzc() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final zzoz zzd(zzad zzadVar) {
        return this.zzV ? zzoz.zza : this.zzac.zza(zzadVar, this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zze(zzad zzadVar, int i, int[] iArr) throws zzpp {
        int i10;
        int iIntValue;
        int iIntValue2;
        int i11;
        int iZzk;
        zzcj zzcjVar;
        int iZzk2;
        int iMax;
        zzR();
        if ("audio/raw".equals(zzadVar.zzo)) {
            zzdb.zzd(zzen.zzJ(zzadVar.zzE));
            iZzk = zzen.zzk(zzadVar.zzE) * zzadVar.zzC;
            zzfzl zzfzlVar = new zzfzl();
            zzfzlVar.zzh(this.zzg);
            zzfzlVar.zzg(this.zzab.zze());
            zzcj zzcjVar2 = new zzcj(zzfzlVar.zzi());
            if (zzcjVar2.equals(this.zzr)) {
                zzcjVar2 = this.zzr;
            }
            this.zzf.zzq(zzadVar.zzF, zzadVar.zzG);
            this.zze.zzo(iArr);
            try {
                zzck zzckVarZza = zzcjVar2.zza(new zzck(zzadVar.zzD, zzadVar.zzC, zzadVar.zzE));
                iIntValue = zzckVarZza.zzd;
                i10 = zzckVarZza.zzb;
                int i12 = zzckVarZza.zzc;
                iIntValue2 = zzen.zzi(i12);
                zzcjVar = zzcjVar2;
                iZzk2 = zzen.zzk(iIntValue) * i12;
                i11 = 0;
            } catch (zzcl e) {
                throw new zzpp(e, zzadVar);
            }
        } else {
            zzcj zzcjVar3 = new zzcj(zzfzo.zzn());
            i10 = zzadVar.zzD;
            zzoz zzozVar = zzoz.zza;
            Pair pairZzb = this.zzt.zzb(zzadVar, this.zzw);
            if (pairZzb == null) {
                throw new zzpp("Unable to configure passthrough for: ".concat(String.valueOf(zzadVar)), zzadVar);
            }
            iIntValue = ((Integer) pairZzb.first).intValue();
            iIntValue2 = ((Integer) pairZzb.second).intValue();
            i11 = 2;
            iZzk = -1;
            zzcjVar = zzcjVar3;
            iZzk2 = -1;
        }
        if (iIntValue == 0) {
            throw new zzpp("Invalid output encoding (mode=" + i11 + ") for: " + String.valueOf(zzadVar), zzadVar);
        }
        if (iIntValue2 == 0) {
            throw new zzpp("Invalid output channel config (mode=" + i11 + ") for: " + String.valueOf(zzadVar), zzadVar);
        }
        int i13 = zzadVar.zzj;
        if ("audio/vnd.dts.hd;profile=lbr".equals(zzadVar.zzo) && i13 == -1) {
            i13 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i10, iIntValue2, iIntValue);
        zzdb.zzf(minBufferSize != -2);
        int i14 = iZzk2 != -1 ? iZzk2 : 1;
        int i15 = 250000;
        if (i11 == 0) {
            iMax = Math.max(zzqy.zza(250000, i10, i14), Math.min(minBufferSize * 4, zzqy.zza(750000, i10, i14)));
        } else if (i11 != 1) {
            if (iIntValue == 5) {
                i15 = 500000;
            } else if (iIntValue == 8) {
                i15 = 1000000;
                iIntValue = 8;
            }
            iMax = zzgcr.zzb((((long) i15) * ((long) (i13 != -1 ? zzgck.zzb(i13, 8, RoundingMode.CEILING) : zzqy.zzb(iIntValue)))) / 1000000);
        } else {
            iMax = zzgcr.zzb((((long) zzqy.zzb(iIntValue)) * 50000000) / 1000000);
        }
        int iMax2 = (((Math.max(minBufferSize, iMax) + i14) - 1) / i14) * i14;
        this.zzV = false;
        zzql zzqlVar = new zzql(zzadVar, iZzk, i11, iZzk2, i10, iIntValue2, iIntValue, iMax2, zzcjVar, false, false, false);
        if (zzZ()) {
            this.zzp = zzqlVar;
        } else {
            this.zzq = zzqlVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzf() {
        zzqp zzqpVar;
        if (zzZ()) {
            this.zzB = 0L;
            this.zzC = 0L;
            this.zzD = 0L;
            this.zzE = 0L;
            this.zzW = false;
            this.zzF = 0;
            this.zzy = new zzqn(this.zzz, 0L, 0L, null);
            this.zzI = 0L;
            this.zzx = null;
            this.zzj.clear();
            this.zzK = null;
            this.zzL = 0;
            this.zzM = null;
            this.zzO = false;
            this.zzN = false;
            this.zzP = false;
            this.zzf.zzp();
            zzX();
            if (this.zzi.zzh()) {
                this.zzs.pause();
            }
            if (zzaa(this.zzs)) {
                zzqu zzquVar = this.zzk;
                zzquVar.getClass();
                zzquVar.zzb(this.zzs);
            }
            final zzpo zzpoVarZzb = this.zzq.zzb();
            zzql zzqlVar = this.zzp;
            if (zzqlVar != null) {
                this.zzq = zzqlVar;
                this.zzp = null;
            }
            this.zzi.zzc();
            if (zzen.zza >= 24 && (zzqpVar = this.zzv) != null) {
                zzqpVar.zzb();
                this.zzv = null;
            }
            final AudioTrack audioTrack = this.zzs;
            final zzpr zzprVar = this.zzo;
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (zza) {
                try {
                    if (zzb == null) {
                        final String str = "ExoPlayer:AudioTrackReleaseThread";
                        zzb = Executors.newSingleThreadScheduledExecutor(new ThreadFactory(str) { // from class: com.google.android.gms.internal.ads.zzem
                            public final /* synthetic */ String zza = "ExoPlayer:AudioTrackReleaseThread";

                            @Override // java.util.concurrent.ThreadFactory
                            public final Thread newThread(Runnable runnable) {
                                return new Thread(runnable, this.zza);
                            }
                        });
                    }
                    zzc++;
                    zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqd
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzqw.zzI(audioTrack, zzprVar, handler, zzpoVarZzb);
                        }
                    }, 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.zzs = null;
        }
        this.zzm.zza();
        this.zzl.zza();
        this.zzY = 0L;
        this.zzZ = 0L;
        Handler handler2 = this.zzaa;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzg() {
        this.zzG = true;
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzh() {
        this.zzQ = false;
        if (zzZ()) {
            if (this.zzi.zzk() || zzaa(this.zzs)) {
                this.zzs.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzi() {
        this.zzQ = true;
        if (zzZ()) {
            this.zzi.zzf();
            this.zzs.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzj() throws zzpt {
        if (!this.zzN && zzZ() && zzY()) {
            zzS();
            this.zzN = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzk() {
        zzov zzovVar = this.zzu;
        if (zzovVar != null) {
            zzovVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzl() {
        zzf();
        zzfzo zzfzoVar = this.zzg;
        int size = zzfzoVar.size();
        for (int i = 0; i < size; i++) {
            ((zzcm) zzfzoVar.get(i)).zzf();
        }
        zzfzo zzfzoVar2 = this.zzh;
        int size2 = zzfzoVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((zzcm) zzfzoVar2.get(i10)).zzf();
        }
        zzcj zzcjVar = this.zzr;
        if (zzcjVar != null) {
            zzcjVar.zzf();
        }
        this.zzQ = false;
        this.zzV = false;
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzm(zzg zzgVar) {
        if (this.zzw.equals(zzgVar)) {
            return;
        }
        this.zzw = zzgVar;
        zzov zzovVar = this.zzu;
        if (zzovVar != null) {
            zzovVar.zzg(zzgVar);
        }
        zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzn(int i) {
        if (this.zzR != i) {
            this.zzR = i;
            zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzo(zzh zzhVar) {
        if (this.zzS.equals(zzhVar)) {
            return;
        }
        if (this.zzs != null) {
            int i = this.zzS.zza;
        }
        this.zzS = zzhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzp(zzdc zzdcVar) {
        this.zzi.zze(zzdcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzq(zzpr zzprVar) {
        this.zzo = zzprVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzr(int i, int i10) {
        AudioTrack audioTrack = this.zzs;
        if (audioTrack != null) {
            zzaa(audioTrack);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzs(zzbj zzbjVar) {
        this.zzz = new zzbj(Math.max(0.1f, Math.min(zzbjVar.zzb, 8.0f)), Math.max(0.1f, Math.min(zzbjVar.zzc, 8.0f)));
        zzU(zzbjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzt(zzoj zzojVar) {
        this.zzn = zzojVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzu(AudioDeviceInfo audioDeviceInfo) {
        this.zzT = audioDeviceInfo == null ? null : new zzow(audioDeviceInfo);
        zzov zzovVar = this.zzu;
        if (zzovVar != null) {
            zzovVar.zzh(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.zzs;
        if (audioTrack != null) {
            zzqh.zza(audioTrack, this.zzT);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzv(boolean z4) {
        this.zzA = z4;
        zzU(this.zzz);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzw(float f10) {
        if (this.zzJ != f10) {
            this.zzJ = f10;
            zzW();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:136:0x0252  */
    /* JADX WARN: Code duplicated, block: B:137:0x0254  */
    /* JADX WARN: Code duplicated, block: B:140:0x0262  */
    /* JADX WARN: Code duplicated, block: B:143:0x026d  */
    /* JADX WARN: Code duplicated, block: B:145:0x0276  */
    /* JADX WARN: Code duplicated, block: B:146:0x027a  */
    /* JADX WARN: Code duplicated, block: B:148:0x0284 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x0286 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x0288  */
    /* JADX WARN: Code duplicated, block: B:152:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:155:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:157:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:218:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzpu
    public final boolean zzx(ByteBuffer byteBuffer, long j4, int i) throws Exception {
        AudioTrack audioTrackZzN;
        zzov zzovVar;
        zzoj zzojVar;
        boolean z4;
        int iZzb;
        int iPosition;
        byte b10;
        int i10;
        int i11;
        byte b11;
        int i12;
        int i13;
        ByteBuffer byteBuffer2 = this.zzK;
        zzdb.zzd(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.zzp != null) {
            if (!zzY()) {
                return false;
            }
            zzql zzqlVar = this.zzp;
            zzql zzqlVar2 = this.zzq;
            if (zzqlVar2.zzc == zzqlVar.zzc && zzqlVar2.zzg == zzqlVar.zzg && zzqlVar2.zze == zzqlVar.zze && zzqlVar2.zzf == zzqlVar.zzf && zzqlVar2.zzd == zzqlVar.zzd) {
                this.zzq = zzqlVar;
                this.zzp = null;
                AudioTrack audioTrack = this.zzs;
                if (audioTrack != null && zzaa(audioTrack)) {
                    boolean z10 = this.zzq.zzk;
                }
            } else {
                zzS();
                if (zzy()) {
                    return false;
                }
                zzf();
            }
            zzO(j4);
        }
        if (!zzZ()) {
            try {
                if (this.zzl.zzc()) {
                    return false;
                }
                try {
                    zzql zzqlVar3 = this.zzq;
                    if (zzqlVar3 == null) {
                        throw null;
                    }
                    audioTrackZzN = zzN(zzqlVar3);
                    this.zzs = audioTrackZzN;
                    if (zzaa(audioTrackZzN)) {
                        AudioTrack audioTrack2 = this.zzs;
                        if (this.zzk == null) {
                            this.zzk = new zzqu(this);
                        }
                        this.zzk.zza(audioTrack2);
                        boolean z11 = this.zzq.zzk;
                    }
                    int i14 = zzen.zza;
                    if (i14 >= 31 && (zzojVar = this.zzn) != null) {
                        zzqi.zza(this.zzs, zzojVar);
                    }
                    this.zzR = this.zzs.getAudioSessionId();
                    zzpy zzpyVar = this.zzi;
                    AudioTrack audioTrack3 = this.zzs;
                    zzql zzqlVar4 = this.zzq;
                    zzpyVar.zzd(audioTrack3, zzqlVar4.zzc == 2, zzqlVar4.zzg, zzqlVar4.zzd, zzqlVar4.zzh);
                    zzW();
                    int i15 = this.zzS.zza;
                    zzow zzowVar = this.zzT;
                    if (zzowVar != null && i14 >= 23) {
                        zzqh.zza(this.zzs, zzowVar);
                        zzov zzovVar2 = this.zzu;
                        if (zzovVar2 != null) {
                            zzovVar2.zzh(this.zzT.zza);
                        }
                    }
                    if (i14 >= 24 && (zzovVar = this.zzu) != null) {
                        this.zzv = new zzqp(this.zzs, zzovVar);
                    }
                    this.zzH = true;
                    zzpr zzprVar = this.zzo;
                    if (zzprVar != null) {
                        ((zzra) zzprVar).zza.zzc.zzc(this.zzq.zzb());
                    }
                } catch (zzpq e) {
                    zzql zzqlVar5 = this.zzq;
                    if (zzqlVar5.zzh > 1000000) {
                        zzql zzqlVar6 = new zzql(zzqlVar5.zza, zzqlVar5.zzb, zzqlVar5.zzc, zzqlVar5.zzd, zzqlVar5.zze, zzqlVar5.zzf, zzqlVar5.zzg, 1000000, zzqlVar5.zzi, false, false, false);
                        try {
                            audioTrackZzN = zzN(zzqlVar6);
                            this.zzq = zzqlVar6;
                        } catch (zzpq e4) {
                            e.addSuppressed(e4);
                            zzQ();
                            throw e;
                        }
                    }
                    zzQ();
                    throw e;
                }
            } catch (zzpq e10) {
                if (e10.zzb) {
                    throw e10;
                }
                this.zzl.zzb(e10);
                return false;
            }
        }
        this.zzl.zza();
        if (this.zzH) {
            this.zzI = Math.max(0L, j4);
            this.zzG = false;
            this.zzH = false;
            zzO(j4);
            if (this.zzQ) {
                zzi();
            }
        }
        if (!this.zzi.zzj(zzM())) {
            return false;
        }
        if (this.zzK == null) {
            zzdb.zzd(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            zzql zzqlVar7 = this.zzq;
            if (zzqlVar7.zzc != 0 && this.zzF == 0) {
                int i16 = zzqlVar7.zzg;
                if (i16 == 20) {
                    z4 = true;
                    iZzb = zzadm.zzb(byteBuffer);
                } else if (i16 != 30) {
                    switch (i16) {
                        case 5:
                        case 6:
                            iZzb = zzabr.zza(byteBuffer);
                            z4 = true;
                            break;
                        case 7:
                        case 8:
                            if (byteBuffer.getInt(0) == -233094848) {
                                z4 = true;
                                iZzb = 1024;
                            } else {
                                if (byteBuffer.getInt(0) == -398277519) {
                                    iZzb = 1024;
                                } else if (byteBuffer.getInt(0) != 622876772) {
                                    iPosition = byteBuffer.position();
                                    b10 = byteBuffer.get(iPosition);
                                    if (b10 != -2) {
                                        if (b10 != -1) {
                                            if (b10 != 31) {
                                                i11 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                                i12 = byteBuffer.get(iPosition + 5) & 252;
                                            } else {
                                                i11 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                                b11 = byteBuffer.get(iPosition + 6);
                                            }
                                            i10 = (i12 >> 2) | i11;
                                            z4 = true;
                                        } else {
                                            i11 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                            b11 = byteBuffer.get(iPosition + 7);
                                        }
                                        i12 = b11 & 60;
                                        i10 = (i12 >> 2) | i11;
                                        z4 = true;
                                    } else {
                                        z4 = true;
                                        i10 = ((byteBuffer.get(iPosition + 5) & 1) << 6) | ((byteBuffer.get(iPosition + 4) & 252) >> 2);
                                    }
                                    iZzb = (i10 + 1) * 32;
                                } else {
                                    iZzb = 4096;
                                }
                                z4 = true;
                            }
                            break;
                        case 9:
                            iZzb = zzadk.zzc(zzen.zzj(byteBuffer, byteBuffer.position()));
                            if (iZzb == -1) {
                                throw new IllegalArgumentException();
                            }
                            z4 = true;
                            break;
                        case 10:
                            iZzb = 1024;
                            z4 = true;
                            break;
                        case 11:
                        case 12:
                            iZzb = 2048;
                            z4 = true;
                            break;
                        default:
                            switch (i16) {
                                case 14:
                                    int iPosition2 = byteBuffer.position();
                                    int iLimit = byteBuffer.limit() - 10;
                                    int i17 = iPosition2;
                                    while (true) {
                                        if (i17 > iLimit) {
                                            i13 = -1;
                                        } else if ((zzen.zzj(byteBuffer, i17 + 4) & (-2)) == -126718022) {
                                            i13 = i17 - iPosition2;
                                        } else {
                                            i17++;
                                        }
                                    }
                                    if (i13 != -1) {
                                        iZzb = (40 << ((byteBuffer.get((byteBuffer.position() + i13) + ((byteBuffer.get((byteBuffer.position() + i13) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                                    } else {
                                        iZzb = 0;
                                    }
                                    break;
                                case 15:
                                    iZzb = 512;
                                    break;
                                case 16:
                                    iZzb = 1024;
                                    break;
                                case 17:
                                    byte[] bArr = new byte[16];
                                    int iPosition3 = byteBuffer.position();
                                    byteBuffer.get(bArr);
                                    byteBuffer.position(iPosition3);
                                    iZzb = zzabu.zza(new zzec(bArr, 16)).zzc;
                                    break;
                                case 18:
                                    iZzb = zzabr.zza(byteBuffer);
                                    break;
                                default:
                                    throw new IllegalStateException(v.f(i16, "Unexpected audio encoding: "));
                            }
                            z4 = true;
                            break;
                    }
                } else if (byteBuffer.getInt(0) == -233094848) {
                    if (byteBuffer.getInt(0) == -398277519) {
                        iZzb = 1024;
                    } else if (byteBuffer.getInt(0) != 622876772) {
                        iZzb = 4096;
                    } else {
                        iPosition = byteBuffer.position();
                        b10 = byteBuffer.get(iPosition);
                        if (b10 != -2) {
                            if (b10 != -1) {
                                if (b10 != 31) {
                                    i11 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                    i12 = byteBuffer.get(iPosition + 5) & 252;
                                } else {
                                    i11 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                    b11 = byteBuffer.get(iPosition + 6);
                                }
                                i10 = (i12 >> 2) | i11;
                                z4 = true;
                            } else {
                                i11 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                b11 = byteBuffer.get(iPosition + 7);
                            }
                            i12 = b11 & 60;
                            i10 = (i12 >> 2) | i11;
                            z4 = true;
                        } else {
                            z4 = true;
                            i10 = ((byteBuffer.get(iPosition + 5) & 1) << 6) | ((byteBuffer.get(iPosition + 4) & 252) >> 2);
                        }
                        iZzb = (i10 + 1) * 32;
                    }
                    z4 = true;
                } else {
                    z4 = true;
                    iZzb = 1024;
                }
                this.zzF = iZzb;
                if (iZzb == 0) {
                    return z4;
                }
            }
            if (this.zzx != null) {
                if (!zzY()) {
                    return false;
                }
                zzO(j4);
                this.zzx = null;
            }
            long jZzt = zzen.zzt(zzL() - this.zzf.zzo(), this.zzq.zza.zzD) + this.zzI;
            if (!this.zzG && Math.abs(jZzt - j4) > 200000) {
                zzpr zzprVar2 = this.zzo;
                if (zzprVar2 != null) {
                    zzprVar2.zza(new zzps(j4, jZzt));
                }
                this.zzG = true;
            }
            if (this.zzG) {
                if (!zzY()) {
                    return false;
                }
                long j10 = j4 - jZzt;
                this.zzI += j10;
                this.zzG = false;
                zzO(j4);
                zzpr zzprVar3 = this.zzo;
                if (zzprVar3 != null && j10 != 0) {
                    ((zzra) zzprVar3).zza.zzao();
                }
            }
            if (this.zzq.zzc == 0) {
                this.zzB += (long) byteBuffer.remaining();
            } else {
                this.zzC = (((long) this.zzF) * ((long) i)) + this.zzC;
            }
            this.zzK = byteBuffer;
            this.zzL = i;
        }
        zzT(j4);
        if (!this.zzK.hasRemaining()) {
            this.zzK = null;
            this.zzL = 0;
            return true;
        }
        if (!this.zzi.zzi(zzM())) {
            return false;
        }
        zzdt.zzf("DefaultAudioSink", "Resetting stalled audio track");
        zzf();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final boolean zzy() {
        if (zzZ()) {
            return !(zzen.zza >= 29 && this.zzs.isOffloadedPlayback() && this.zzP) && this.zzi.zzg(zzM());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final boolean zzz() {
        if (zzZ()) {
            return this.zzN && !zzy();
        }
        return true;
    }
}
