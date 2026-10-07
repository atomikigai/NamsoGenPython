package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaai extends zzsy implements zzaao {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private long zzA;
    private int zzB;
    private long zzC;
    private zzci zzD;
    private zzci zzE;
    private int zzF;
    private int zzG;
    private zzaam zzH;
    private long zzI;
    private long zzJ;
    private boolean zzK;
    private final Context zze;
    private final boolean zzf;
    private final zzabf zzg;
    private final boolean zzh;
    private final zzaap zzi;
    private final zzaan zzj;
    private zzaah zzk;
    private boolean zzl;
    private boolean zzm;
    private zzabl zzn;
    private boolean zzo;
    private List zzp;
    private Surface zzq;
    private zzaal zzr;
    private zzee zzs;
    private boolean zzt;
    private int zzu;
    private int zzv;
    private long zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    public zzaai(Context context, zzsl zzslVar, zzta zztaVar, long j4, boolean z4, Handler handler, zzabg zzabgVar, int i, float f10) {
        super(2, zzslVar, zztaVar, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        this.zzn = null;
        this.zzg = new zzabf(handler, zzabgVar);
        this.zzf = true;
        this.zzi = new zzaap(applicationContext, this, 0L);
        this.zzj = new zzaan();
        this.zzh = "NVIDIA".equals(zzen.zzc);
        this.zzs = zzee.zza;
        this.zzu = 1;
        this.zzv = 0;
        this.zzD = zzci.zza;
        this.zzG = 0;
        this.zzE = null;
        this.zzF = -1000;
        this.zzI = -9223372036854775807L;
        this.zzJ = -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x012e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0138  */
    /* JADX WARN: Code duplicated, block: B:107:0x0142  */
    /* JADX WARN: Code duplicated, block: B:110:0x014c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0156  */
    /* JADX WARN: Code duplicated, block: B:116:0x0160  */
    /* JADX WARN: Code duplicated, block: B:119:0x016a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0174  */
    /* JADX WARN: Code duplicated, block: B:125:0x017e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0188  */
    /* JADX WARN: Code duplicated, block: B:131:0x0192  */
    /* JADX WARN: Code duplicated, block: B:134:0x019c  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:158:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:161:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:164:0x0200  */
    /* JADX WARN: Code duplicated, block: B:167:0x020a  */
    /* JADX WARN: Code duplicated, block: B:170:0x0214  */
    /* JADX WARN: Code duplicated, block: B:173:0x021e  */
    /* JADX WARN: Code duplicated, block: B:176:0x0228  */
    /* JADX WARN: Code duplicated, block: B:179:0x0232  */
    /* JADX WARN: Code duplicated, block: B:182:0x023c  */
    /* JADX WARN: Code duplicated, block: B:185:0x0246  */
    /* JADX WARN: Code duplicated, block: B:188:0x0250  */
    /* JADX WARN: Code duplicated, block: B:191:0x025a  */
    /* JADX WARN: Code duplicated, block: B:194:0x0264  */
    /* JADX WARN: Code duplicated, block: B:197:0x026e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0278  */
    /* JADX WARN: Code duplicated, block: B:203:0x0282  */
    /* JADX WARN: Code duplicated, block: B:206:0x028c  */
    /* JADX WARN: Code duplicated, block: B:209:0x0296  */
    /* JADX WARN: Code duplicated, block: B:212:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:215:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:218:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:221:0x02be  */
    /* JADX WARN: Code duplicated, block: B:224:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:227:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:230:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:233:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:236:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:239:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:242:0x0304  */
    /* JADX WARN: Code duplicated, block: B:245:0x030e  */
    /* JADX WARN: Code duplicated, block: B:248:0x0318  */
    /* JADX WARN: Code duplicated, block: B:251:0x0322  */
    /* JADX WARN: Code duplicated, block: B:254:0x032c  */
    /* JADX WARN: Code duplicated, block: B:257:0x0336  */
    /* JADX WARN: Code duplicated, block: B:260:0x0340  */
    /* JADX WARN: Code duplicated, block: B:263:0x034a  */
    /* JADX WARN: Code duplicated, block: B:266:0x0354  */
    /* JADX WARN: Code duplicated, block: B:269:0x035e  */
    /* JADX WARN: Code duplicated, block: B:272:0x0368  */
    /* JADX WARN: Code duplicated, block: B:275:0x0372  */
    /* JADX WARN: Code duplicated, block: B:278:0x037c  */
    /* JADX WARN: Code duplicated, block: B:281:0x0386  */
    /* JADX WARN: Code duplicated, block: B:284:0x0390  */
    /* JADX WARN: Code duplicated, block: B:287:0x039a  */
    /* JADX WARN: Code duplicated, block: B:290:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:293:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:296:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:299:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:302:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:305:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:308:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:311:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:314:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:317:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:320:0x0408  */
    /* JADX WARN: Code duplicated, block: B:323:0x0412  */
    /* JADX WARN: Code duplicated, block: B:326:0x041c  */
    /* JADX WARN: Code duplicated, block: B:329:0x0426  */
    /* JADX WARN: Code duplicated, block: B:332:0x0430  */
    /* JADX WARN: Code duplicated, block: B:335:0x043a  */
    /* JADX WARN: Code duplicated, block: B:338:0x0444  */
    /* JADX WARN: Code duplicated, block: B:341:0x044e  */
    /* JADX WARN: Code duplicated, block: B:344:0x0458  */
    /* JADX WARN: Code duplicated, block: B:347:0x0462  */
    /* JADX WARN: Code duplicated, block: B:350:0x046c  */
    /* JADX WARN: Code duplicated, block: B:353:0x0476  */
    /* JADX WARN: Code duplicated, block: B:356:0x0480  */
    /* JADX WARN: Code duplicated, block: B:359:0x048a  */
    /* JADX WARN: Code duplicated, block: B:362:0x0494  */
    /* JADX WARN: Code duplicated, block: B:365:0x049e  */
    /* JADX WARN: Code duplicated, block: B:368:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:371:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:374:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:377:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:380:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:383:0x04da  */
    /* JADX WARN: Code duplicated, block: B:386:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:389:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:392:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:395:0x0502  */
    /* JADX WARN: Code duplicated, block: B:398:0x050c  */
    /* JADX WARN: Code duplicated, block: B:401:0x0516  */
    /* JADX WARN: Code duplicated, block: B:404:0x0520  */
    /* JADX WARN: Code duplicated, block: B:407:0x052a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:410:0x0534  */
    /* JADX WARN: Code duplicated, block: B:413:0x053e  */
    /* JADX WARN: Code duplicated, block: B:416:0x0548  */
    /* JADX WARN: Code duplicated, block: B:419:0x0552  */
    /* JADX WARN: Code duplicated, block: B:422:0x055c  */
    /* JADX WARN: Code duplicated, block: B:425:0x0566  */
    /* JADX WARN: Code duplicated, block: B:428:0x0570  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073 A[Catch: all -> 0x006c, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x0018, B:507:0x066a, B:42:0x0073, B:45:0x007e, B:77:0x00dd, B:500:0x0656, B:508:0x066e), top: B:513:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:431:0x057a  */
    /* JADX WARN: Code duplicated, block: B:434:0x0584  */
    /* JADX WARN: Code duplicated, block: B:437:0x058e  */
    /* JADX WARN: Code duplicated, block: B:440:0x0598  */
    /* JADX WARN: Code duplicated, block: B:443:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:446:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:449:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:452:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:455:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:458:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e A[Catch: all -> 0x006c, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x0018, B:507:0x066a, B:42:0x0073, B:45:0x007e, B:77:0x00dd, B:500:0x0656, B:508:0x066e), top: B:513:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:461:0x05de  */
    /* JADX WARN: Code duplicated, block: B:464:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:467:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:470:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:473:0x0604  */
    /* JADX WARN: Code duplicated, block: B:476:0x060d  */
    /* JADX WARN: Code duplicated, block: B:479:0x0616  */
    /* JADX WARN: Code duplicated, block: B:482:0x061f  */
    /* JADX WARN: Code duplicated, block: B:485:0x0628  */
    /* JADX WARN: Code duplicated, block: B:488:0x0631  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:491:0x063a  */
    /* JADX WARN: Code duplicated, block: B:494:0x0643  */
    /* JADX WARN: Code duplicated, block: B:497:0x064c  */
    /* JADX WARN: Code duplicated, block: B:500:0x0656 A[Catch: all -> 0x006c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x0018, B:507:0x066a, B:42:0x0073, B:45:0x007e, B:77:0x00dd, B:500:0x0656, B:508:0x066e), top: B:513:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:504:0x0660  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dd A[Catch: all -> 0x006c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x0018, B:507:0x066a, B:42:0x0073, B:45:0x007e, B:77:0x00dd, B:500:0x0656, B:508:0x066e), top: B:513:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x0106  */
    /* JADX WARN: Code duplicated, block: B:92:0x0110  */
    /* JADX WARN: Code duplicated, block: B:95:0x011a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0124  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:504:0x0660
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final boolean zzaU(java.lang.String r5) {
        /*
            Method dump skipped, instruction units count: 2286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaai.zzaU(java.lang.String):boolean");
    }

    public static final boolean zzaV(zzsq zzsqVar) {
        return zzen.zza >= 35 && zzsqVar.zzh;
    }

    private final Surface zzaW(zzsq zzsqVar) {
        zzabl zzablVar = this.zzn;
        if (zzablVar != null) {
            return zzablVar.zzd();
        }
        Surface surface = this.zzq;
        if (surface != null) {
            return surface;
        }
        if (zzaV(zzsqVar)) {
            return null;
        }
        zzdb.zzf(zzbc(zzsqVar));
        zzaal zzaalVar = this.zzr;
        if (zzaalVar != null) {
            if (zzaalVar.zza != zzsqVar.zzf) {
                zzba();
            }
        }
        if (this.zzr == null) {
            this.zzr = zzaal.zza(this.zze, zzsqVar.zzf);
        }
        return this.zzr;
    }

    private static List zzaX(Context context, zzta zztaVar, zzad zzadVar, boolean z4, boolean z10) throws zztf {
        String str = zzadVar.zzo;
        if (str == null) {
            return zzfzo.zzn();
        }
        if (zzen.zza >= 26 && "video/dolby-vision".equals(str) && !zzaag.zza(context)) {
            List listZzc = zztl.zzc(zztaVar, zzadVar, z4, z10);
            if (!listZzc.isEmpty()) {
                return listZzc;
            }
        }
        return zztl.zze(zztaVar, zzadVar, z4, z10);
    }

    private final void zzaY() {
        zzci zzciVar = this.zzE;
        if (zzciVar != null) {
            this.zzg.zzt(zzciVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaZ() {
        this.zzg.zzq(this.zzq);
        this.zzt = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        if (r3.equals("video/x-vnd.on2.vp8") != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
    
        if (r3.equals("video/mp4v-es") != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b3, code lost:
    
        if (r3.equals("video/av01") != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bc, code lost:
    
        if (r3.equals("video/3gpp") != false) goto L53;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzad(com.google.android.gms.internal.ads.zzsq r7, com.google.android.gms.internal.ads.zzad r8) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaai.zzad(com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzad):int");
    }

    public static int zzae(zzsq zzsqVar, zzad zzadVar) {
        if (zzadVar.zzp == -1) {
            return zzad(zzsqVar, zzadVar);
        }
        int size = zzadVar.zzr.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += ((byte[]) zzadVar.zzr.get(i)).length;
        }
        return zzadVar.zzp + length;
    }

    private final void zzba() {
        zzaal zzaalVar = this.zzr;
        if (zzaalVar != null) {
            zzaalVar.release();
            this.zzr = null;
        }
    }

    private final boolean zzbb(zzsq zzsqVar) {
        return this.zzq != null || zzaV(zzsqVar) || zzbc(zzsqVar);
    }

    private final boolean zzbc(zzsq zzsqVar) {
        if (zzen.zza < 23 || zzaU(zzsqVar.zza)) {
            return false;
        }
        return !zzsqVar.zzf || zzaal.zzb(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void zzA() {
        zzabl zzablVar = this.zzn;
        if (zzablVar == null || !this.zzf) {
            return;
        }
        zzablVar.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhw
    public final void zzC() {
        try {
            super.zzC();
        } finally {
            this.zzo = false;
            this.zzI = -9223372036854775807L;
            zzba();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void zzD() {
        this.zzx = 0;
        this.zzw = zzi().zzb();
        this.zzA = 0L;
        this.zzB = 0;
        zzabl zzablVar = this.zzn;
        if (zzablVar != null) {
            zzablVar.zzm();
        } else {
            this.zzi.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void zzE() {
        if (this.zzx > 0) {
            long jZzb = zzi().zzb();
            this.zzg.zzd(this.zzx, jZzb - this.zzw);
            this.zzx = 0;
            this.zzw = jZzb;
        }
        int i = this.zzB;
        if (i != 0) {
            this.zzg.zzr(this.zzA, i);
            this.zzA = 0L;
            this.zzB = 0;
        }
        zzabl zzablVar = this.zzn;
        if (zzablVar != null) {
            zzablVar.zzn();
        } else {
            this.zzi.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhw
    public final void zzF(zzad[] zzadVarArr, long j4, long j10, zzur zzurVar) throws zzig {
        super.zzF(zzadVarArr, j4, j10, zzurVar);
        if (this.zzI == -9223372036854775807L) {
            this.zzI = j4;
        }
        zzbv zzbvVarZzh = zzh();
        if (zzbvVarZzh.zzo()) {
            this.zzJ = -9223372036854775807L;
        } else {
            this.zzJ = zzbvVarZzh.zzn(zzurVar.zza, new zzbt()).zzd;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhw, com.google.android.gms.internal.ads.zzln
    public final void zzM(float f10, float f11) throws zzig {
        super.zzM(f10, f11);
        zzabl zzablVar = this.zzn;
        if (zzablVar != null) {
            zzablVar.zzt(f10);
        } else {
            this.zzi.zzn(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzln, com.google.android.gms.internal.ads.zzlq
    public final String zzU() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzln
    public final void zzV(long j4, long j10) throws Throwable {
        super.zzV(j4, j10);
        zzabl zzablVar = this.zzn;
        if (zzablVar != null) {
            try {
                zzablVar.zzp(j4, j10);
            } catch (zzabk e) {
                throw zzcY(e, e.zza, false, 7001);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzln
    public final boolean zzW() {
        return super.zzW() && this.zzn == null;
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzln
    public final boolean zzX() {
        boolean zZzX = super.zzX();
        zzabl zzablVar = this.zzn;
        if (zzablVar != null) {
            return zzablVar.zzy(zZzX);
        }
        if (zZzX && (zzaz() == null || this.zzq == null)) {
            return true;
        }
        return this.zzi.zzo(zZzX);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final float zzZ(float f10, zzad zzadVar, zzad[] zzadVarArr) {
        float fMax = -1.0f;
        for (zzad zzadVar2 : zzadVarArr) {
            float f11 = zzadVar2.zzw;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final zzsp zzaA(Throwable th, zzsq zzsqVar) {
        return new zzaad(th, zzsqVar, this.zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzaD(long j4) {
        super.zzaD(j4);
        this.zzz--;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzaE(zzhm zzhmVar) throws zzig {
        this.zzz++;
        int i = zzen.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzaF(zzad zzadVar) throws zzig {
        zzabl zzablVar = this.zzn;
        if (zzablVar != null) {
            try {
                zzablVar.zzh(zzadVar);
            } catch (zzabk e) {
                throw zzcY(e, zzadVar, false, 7000);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzaH() {
        super.zzaH();
        this.zzz = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final boolean zzaN(zzsq zzsqVar) {
        return zzbb(zzsqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final boolean zzaO(zzhm zzhmVar) {
        if (zzhmVar.zzi() && !zzQ() && !zzhmVar.zzh() && this.zzJ != -9223372036854775807L) {
            if (this.zzJ - (zzhmVar.zze - zzav()) > 100000 && !zzhmVar.zzl() && zzhmVar.zze < zzf()) {
                return true;
            }
        }
        return false;
    }

    public final void zzaQ(zzsn zzsnVar, int i, long j4) {
        Trace.beginSection("skipVideoBuffer");
        zzsnVar.zzo(i, false);
        Trace.endSection();
        ((zzsy) this).zza.zzf++;
    }

    public final void zzaR(int i, int i10) {
        zzhx zzhxVar = ((zzsy) this).zza;
        zzhxVar.zzh += i;
        int i11 = i + i10;
        zzhxVar.zzg += i11;
        this.zzx += i11;
        int i12 = this.zzy + i11;
        this.zzy = i12;
        zzhxVar.zzi = Math.max(i12, zzhxVar.zzi);
    }

    public final void zzaS(long j4) {
        zzhx zzhxVar = ((zzsy) this).zza;
        zzhxVar.zzk += j4;
        zzhxVar.zzl++;
        this.zzA += j4;
        this.zzB++;
    }

    public final boolean zzaT(long j4, boolean z4) throws zzig {
        int iZzd = zzd(j4);
        if (iZzd == 0) {
            return false;
        }
        if (z4) {
            zzhx zzhxVar = ((zzsy) this).zza;
            zzhxVar.zzd += iZzd;
            zzhxVar.zzf += this.zzz;
        } else {
            ((zzsy) this).zza.zzj++;
            zzaR(iZzd, this.zzz);
        }
        zzaJ();
        zzabl zzablVar = this.zzn;
        if (zzablVar != null) {
            zzablVar.zzg(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final int zzaa(zzta zztaVar, zzad zzadVar) throws zztf {
        boolean z4;
        if (!zzbg.zzi(zzadVar.zzo)) {
            return 128;
        }
        int i = 1;
        int i10 = 0;
        boolean z10 = zzadVar.zzs != null;
        List listZzaX = zzaX(this.zze, zztaVar, zzadVar, z10, false);
        if (z10 && listZzaX.isEmpty()) {
            listZzaX = zzaX(this.zze, zztaVar, zzadVar, false, false);
        }
        if (!listZzaX.isEmpty()) {
            if (zzsy.zzaP(zzadVar)) {
                zzsq zzsqVar = (zzsq) listZzaX.get(0);
                boolean zZze = zzsqVar.zze(zzadVar);
                if (!zZze) {
                    int i11 = 1;
                    while (true) {
                        if (i11 >= listZzaX.size()) {
                            z4 = true;
                            break;
                        }
                        zzsq zzsqVar2 = (zzsq) listZzaX.get(i11);
                        if (zzsqVar2.zze(zzadVar)) {
                            zZze = true;
                            z4 = false;
                            zzsqVar = zzsqVar2;
                            break;
                        }
                        i11++;
                    }
                } else {
                    z4 = true;
                    break;
                }
                int i12 = true != zZze ? 3 : 4;
                int i13 = true != zzsqVar.zzf(zzadVar) ? 8 : 16;
                int i14 = true != zzsqVar.zzg ? 0 : 64;
                int i15 = true != z4 ? 0 : 128;
                if (zzen.zza >= 26 && "video/dolby-vision".equals(zzadVar.zzo) && !zzaag.zza(this.zze)) {
                    i15 = 256;
                }
                if (zZze) {
                    List listZzaX2 = zzaX(this.zze, zztaVar, zzadVar, z10, true);
                    if (!listZzaX2.isEmpty()) {
                        zzsq zzsqVar3 = (zzsq) zztl.zzf(listZzaX2, zzadVar).get(0);
                        if (zzsqVar3.zze(zzadVar) && zzsqVar3.zzf(zzadVar)) {
                            i10 = 32;
                        }
                    }
                }
                return i12 | i13 | i10 | i14 | i15;
            }
            i = 2;
        }
        return i | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final zzhy zzab(zzsq zzsqVar, zzad zzadVar, zzad zzadVar2) {
        int i;
        int i10;
        zzhy zzhyVarZzb = zzsqVar.zzb(zzadVar, zzadVar2);
        int i11 = zzhyVarZzb.zze;
        zzaah zzaahVar = this.zzk;
        zzaahVar.getClass();
        if (zzadVar2.zzu > zzaahVar.zza || zzadVar2.zzv > zzaahVar.zzb) {
            i11 |= 256;
        }
        if (zzae(zzsqVar, zzadVar2) > zzaahVar.zzc) {
            i11 |= 64;
        }
        String str = zzsqVar.zza;
        if (i11 != 0) {
            i10 = 0;
            i = i11;
        } else {
            i = 0;
            i10 = zzhyVarZzb.zzd;
        }
        return new zzhy(str, zzadVar, zzadVar2, i10, i);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final zzhy zzac(zzkj zzkjVar) throws zzig {
        zzhy zzhyVarZzac = super.zzac(zzkjVar);
        zzad zzadVar = zzkjVar.zza;
        zzadVar.getClass();
        this.zzg.zzf(zzadVar, zzhyVarZzac);
        return zzhyVarZzac;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final zzsk zzaf(zzsq zzsqVar, zzad zzadVar, MediaCrypto mediaCrypto, float f10) {
        Point pointZza;
        int i;
        boolean z4;
        int i10;
        int iZzad;
        zzad[] zzadVarArrZzT = zzT();
        int length = zzadVarArrZzT.length;
        int iZzae = zzae(zzsqVar, zzadVar);
        int iMax = zzadVar.zzu;
        int iMax2 = zzadVar.zzv;
        if (length != 1) {
            boolean z10 = false;
            for (int i11 = 0; i11 < length; i11++) {
                zzad zzadVarZzaf = zzadVarArrZzT[i11];
                if (zzadVar.zzB != null && zzadVarZzaf.zzB == null) {
                    zzab zzabVarZzb = zzadVarZzaf.zzb();
                    zzabVarZzb.zzB(zzadVar.zzB);
                    zzadVarZzaf = zzabVarZzb.zzaf();
                }
                if (zzsqVar.zzb(zzadVar, zzadVarZzaf).zzd != 0) {
                    int i12 = zzadVarZzaf.zzu;
                    z10 |= i12 == -1 || zzadVarZzaf.zzv == -1;
                    iMax = Math.max(iMax, i12);
                    iMax2 = Math.max(iMax2, zzadVarZzaf.zzv);
                    iZzae = Math.max(iZzae, zzae(zzsqVar, zzadVarZzaf));
                }
            }
            if (z10) {
                zzdt.zzf("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                int i13 = zzadVar.zzv;
                int i14 = zzadVar.zzu;
                boolean z11 = i13 > i14;
                int i15 = z11 ? i13 : i14;
                if (true == z11) {
                    i13 = i14;
                }
                int[] iArr = zzb;
                int i16 = 0;
                while (true) {
                    if (i16 < 9) {
                        float f11 = i13;
                        float f12 = i15;
                        int[] iArr2 = iArr;
                        int i17 = iArr2[i16];
                        float f13 = i17;
                        if (i17 > i15 && (i = (int) ((f11 / f12) * f13)) > i13) {
                            int i18 = true != z11 ? i17 : i;
                            if (true != z11) {
                                i17 = i;
                            }
                            pointZza = zzsqVar.zza(i18, i17);
                            float f14 = zzadVar.zzw;
                            if (pointZza != null) {
                                z4 = z11;
                                if (zzsqVar.zzg(pointZza.x, pointZza.y, f14)) {
                                    break;
                                }
                            } else {
                                z4 = z11;
                            }
                            i16++;
                            iArr = iArr2;
                            i13 = i13;
                            z11 = z4;
                        }
                    }
                    pointZza = null;
                    break;
                }
                if (pointZza != null) {
                    iMax = Math.max(iMax, pointZza.x);
                    iMax2 = Math.max(iMax2, pointZza.y);
                    zzab zzabVarZzb2 = zzadVar.zzb();
                    zzabVarZzb2.zzae(iMax);
                    zzabVarZzb2.zzJ(iMax2);
                    iZzae = Math.max(iZzae, zzad(zzsqVar, zzabVarZzb2.zzaf()));
                    zzdt.zzf("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            }
        } else if (iZzae != -1 && (iZzad = zzad(zzsqVar, zzadVar)) != -1) {
            iZzae = Math.min((int) (iZzae * 1.5f), iZzad);
        }
        String str = zzsqVar.zzc;
        zzaah zzaahVar = new zzaah(iMax, iMax2, iZzae);
        this.zzk = zzaahVar;
        boolean z12 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", zzadVar.zzu);
        mediaFormat.setInteger("height", zzadVar.zzv);
        zzdw.zzb(mediaFormat, zzadVar.zzr);
        float f15 = zzadVar.zzw;
        if (f15 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f15);
        }
        zzdw.zza(mediaFormat, "rotation-degrees", zzadVar.zzx);
        zzm zzmVar = zzadVar.zzB;
        if (zzmVar != null) {
            zzdw.zza(mediaFormat, "color-transfer", zzmVar.zzd);
            zzdw.zza(mediaFormat, "color-standard", zzmVar.zzb);
            zzdw.zza(mediaFormat, "color-range", zzmVar.zzc);
            byte[] bArr = zzmVar.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzadVar.zzo)) {
            int i19 = zztl.zza;
            Pair pairZza = zzdd.zza(zzadVar);
            if (pairZza != null) {
                zzdw.zza(mediaFormat, "profile", ((Integer) pairZza.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", zzaahVar.zza);
        mediaFormat.setInteger("max-height", zzaahVar.zzb);
        zzdw.zza(mediaFormat, "max-input-size", zzaahVar.zzc);
        int i20 = zzen.zza;
        if (i20 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z12) {
            mediaFormat.setInteger("no-post-process", 1);
            i10 = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            i10 = 0;
        }
        if (i20 >= 35) {
            mediaFormat.setInteger("importance", Math.max(i10, -this.zzF));
        }
        Surface surfaceZzaW = zzaW(zzsqVar);
        if (this.zzn != null && !zzen.zzK(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zzsk.zzb(zzsqVar, mediaFormat, zzadVar, surfaceZzaW, null);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final List zzag(zzta zztaVar, zzad zzadVar, boolean z4) throws zztf {
        return zztl.zzf(zzaX(this.zze, zztaVar, zzadVar, false, false), zzadVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzaj(zzhm zzhmVar) throws zzig {
        if (this.zzm) {
            ByteBuffer byteBuffer = zzhmVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzsn zzsnVarZzaz = zzaz();
                        zzsnVarZzaz.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzsnVarZzaz.zzq(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzak(Exception exc) {
        zzdt.zzd("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzal(String str, zzsk zzskVar, long j4, long j10) {
        this.zzg.zza(str, j4, j10);
        this.zzl = zzaU(str);
        zzsq zzsqVarZzaB = zzaB();
        zzsqVarZzaB.getClass();
        boolean z4 = false;
        if (zzen.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzsqVarZzaB.zzb)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzsqVarZzaB.zzh()) {
                if (codecProfileLevel.profile == 16384) {
                    z4 = true;
                    break;
                }
            }
        }
        this.zzm = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzam(String str) {
        this.zzg.zzb(str);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzan(zzad zzadVar, MediaFormat mediaFormat) {
        zzsn zzsnVarZzaz = zzaz();
        if (zzsnVarZzaz != null) {
            zzsnVarZzaz.zzr(this.zzu);
        }
        mediaFormat.getClass();
        boolean z4 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z4 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z4 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float integer3 = zzadVar.zzy;
        if (zzen.zza >= 30 && mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) {
            integer3 = mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height");
        }
        int i = zzadVar.zzx;
        if (i == 90 || i == 270) {
            integer3 = 1.0f / integer3;
            int i10 = integer2;
            integer2 = integer;
            integer = i10;
        }
        this.zzD = new zzci(integer, integer2, integer3);
        zzabl zzablVar = this.zzn;
        if (zzablVar == null || !this.zzK) {
            this.zzi.zzl(zzadVar.zzw);
        } else {
            zzab zzabVarZzb = zzadVar.zzb();
            zzabVarZzb.zzae(integer);
            zzabVarZzb.zzJ(integer2);
            zzabVarZzb.zzV(integer3);
            zzablVar.zzj(1, zzabVarZzb.zzaf());
        }
        this.zzK = false;
    }

    public final void zzao(zzsn zzsnVar, int i, long j4, long j10) {
        Trace.beginSection("releaseOutputBuffer");
        zzsnVar.zzn(i, j10);
        Trace.endSection();
        ((zzsy) this).zza.zze++;
        this.zzy = 0;
        if (this.zzn == null) {
            zzci zzciVar = this.zzD;
            if (!zzciVar.equals(zzci.zza) && !zzciVar.equals(this.zzE)) {
                this.zzE = zzciVar;
                this.zzg.zzt(zzciVar);
            }
            if (!this.zzi.zzp() || this.zzq == null) {
                return;
            }
            zzaZ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzap() {
        zzabl zzablVar = this.zzn;
        if (zzablVar != null) {
            zzablVar.zzu(zzaw(), zzav(), -this.zzI, zzf());
        } else {
            this.zzi.zzf();
        }
        this.zzK = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final boolean zzar(long j4, long j10, zzsn zzsnVar, ByteBuffer byteBuffer, int i, int i10, int i11, long j11, boolean z4, boolean z10, zzad zzadVar) throws zzig {
        zzsnVar.getClass();
        long jZzav = j11 - zzav();
        zzabl zzablVar = this.zzn;
        if (zzablVar != null) {
            try {
                return zzablVar.zzx(j11 + (-this.zzI), z10, j4, j10, new zzaaf(this, zzsnVar, i, jZzav));
            } catch (zzabk e) {
                throw zzcY(e, e.zza, false, 7001);
            }
        }
        int iZza = this.zzi.zza(j11, j4, j10, zzaw(), z10, this.zzj);
        if (iZza == 4) {
            return false;
        }
        if (z4 && !z10) {
            zzaQ(zzsnVar, i, jZzav);
            return true;
        }
        if (this.zzq == null) {
            if (this.zzj.zzc() >= 30000) {
                return false;
            }
            zzaQ(zzsnVar, i, jZzav);
            zzaS(this.zzj.zzc());
            return true;
        }
        if (iZza == 0) {
            zzao(zzsnVar, i, jZzav, zzi().zzc());
            zzaS(this.zzj.zzc());
            return true;
        }
        if (iZza == 1) {
            zzaan zzaanVar = this.zzj;
            long jZzd = zzaanVar.zzd();
            long jZzc = zzaanVar.zzc();
            if (jZzd == this.zzC) {
                zzaQ(zzsnVar, i, jZzav);
            } else {
                zzao(zzsnVar, i, jZzav, jZzd);
            }
            zzaS(jZzc);
            this.zzC = jZzd;
            return true;
        }
        if (iZza == 2) {
            Trace.beginSection("dropVideoBuffer");
            zzsnVar.zzo(i, false);
            Trace.endSection();
            zzaR(0, 1);
            zzaS(this.zzj.zzc());
            return true;
        }
        if (iZza != 3) {
            if (iZza == 5) {
                return false;
            }
            throw new IllegalStateException(String.valueOf(iZza));
        }
        zzaQ(zzsnVar, i, jZzav);
        zzaS(this.zzj.zzc());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final int zzau(zzhm zzhmVar) {
        int i = zzen.zza;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhw, com.google.android.gms.internal.ads.zzln
    public final void zzt() {
        zzabl zzablVar = this.zzn;
        if (zzablVar != null) {
            zzablVar.zzf();
        } else {
            this.zzi.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhw, com.google.android.gms.internal.ads.zzli
    public final void zzu(int i, Object obj) throws zzig {
        if (i == 1) {
            Surface surface = obj instanceof Surface ? (Surface) obj : null;
            if (this.zzq == surface) {
                if (surface != null) {
                    zzaY();
                    Surface surface2 = this.zzq;
                    if (surface2 == null || !this.zzt) {
                        return;
                    }
                    this.zzg.zzq(surface2);
                    return;
                }
                return;
            }
            this.zzq = surface;
            if (this.zzn == null) {
                this.zzi.zzm(surface);
            }
            this.zzt = false;
            int iZzcV = zzcV();
            zzsn zzsnVarZzaz = zzaz();
            if (zzsnVarZzaz != null && this.zzn == null) {
                zzsq zzsqVarZzaB = zzaB();
                zzsqVarZzaB.getClass();
                boolean zZzbb = zzbb(zzsqVarZzaB);
                int i10 = zzen.zza;
                if (i10 < 23 || !zZzbb || this.zzl) {
                    zzaG();
                    zzaC();
                } else {
                    Surface surfaceZzaW = zzaW(zzsqVarZzaB);
                    if (i10 >= 23 && surfaceZzaW != null) {
                        zzsnVarZzaz.zzp(surfaceZzaW);
                    } else {
                        if (i10 < 35) {
                            throw new IllegalStateException();
                        }
                        zzsnVarZzaz.zzi();
                    }
                }
            }
            if (surface == null) {
                this.zzE = null;
                zzabl zzablVar = this.zzn;
                if (zzablVar != null) {
                    zzablVar.zze();
                    return;
                }
                return;
            }
            zzaY();
            if (iZzcV == 2) {
                zzabl zzablVar2 = this.zzn;
                if (zzablVar2 != null) {
                    zzablVar2.zzi(true);
                    return;
                } else {
                    this.zzi.zzc(true);
                    return;
                }
            }
            return;
        }
        if (i == 7) {
            obj.getClass();
            zzaam zzaamVar = (zzaam) obj;
            this.zzH = zzaamVar;
            zzabl zzablVar3 = this.zzn;
            if (zzablVar3 != null) {
                zzablVar3.zzw(zzaamVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.zzG != iIntValue) {
                this.zzG = iIntValue;
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.zzF = ((Integer) obj).intValue();
            zzsn zzsnVarZzaz2 = zzaz();
            if (zzsnVarZzaz2 == null || zzen.zza < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.zzF));
            zzsnVarZzaz2.zzq(bundle);
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.zzu = iIntValue2;
            zzsn zzsnVarZzaz3 = zzaz();
            if (zzsnVarZzaz3 != null) {
                zzsnVarZzaz3.zzr(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.zzv = iIntValue3;
            zzabl zzablVar4 = this.zzn;
            if (zzablVar4 != null) {
                zzablVar4.zzq(iIntValue3);
                return;
            } else {
                this.zzi.zzj(iIntValue3);
                return;
            }
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            this.zzp = list;
            zzabl zzablVar5 = this.zzn;
            if (zzablVar5 != null) {
                zzablVar5.zzv(list);
                return;
            }
            return;
        }
        if (i != 14) {
            super.zzu(i, obj);
            return;
        }
        obj.getClass();
        zzee zzeeVar = (zzee) obj;
        if (zzeeVar.zzb() == 0 || zzeeVar.zza() == 0) {
            return;
        }
        this.zzs = zzeeVar;
        zzabl zzablVar6 = this.zzn;
        if (zzablVar6 != null) {
            Surface surface3 = this.zzq;
            zzdb.zzb(surface3);
            zzablVar6.zzs(surface3, zzeeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhw
    public final void zzx() {
        this.zzE = null;
        this.zzJ = -9223372036854775807L;
        zzabl zzablVar = this.zzn;
        if (zzablVar != null) {
            zzablVar.zzk();
        } else {
            this.zzi.zzd();
        }
        this.zzt = false;
        try {
            super.zzx();
        } finally {
            this.zzg.zzc(((zzsy) this).zza);
            this.zzg.zzt(zzci.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhw
    public final void zzy(boolean z4, boolean z10) throws zzig {
        super.zzy(z4, z10);
        zzn();
        this.zzg.zze(((zzsy) this).zza);
        if (!this.zzo) {
            if (this.zzp != null && this.zzn == null) {
                zzzp zzzpVar = new zzzp(this.zze, this.zzi);
                zzzpVar.zzd(zzi());
                this.zzn = zzzpVar.zze().zzh();
            }
            this.zzo = true;
        }
        zzabl zzablVar = this.zzn;
        if (zzablVar == null) {
            this.zzi.zzk(zzi());
            this.zzi.zze(z10);
            return;
        }
        zzablVar.zzr(new zzaae(this), zzgey.zzb());
        zzaam zzaamVar = this.zzH;
        if (zzaamVar != null) {
            this.zzn.zzw(zzaamVar);
        }
        if (this.zzq != null && !this.zzs.equals(zzee.zza)) {
            this.zzn.zzs(this.zzq, this.zzs);
        }
        this.zzn.zzq(this.zzv);
        this.zzn.zzt(zzat());
        List list = this.zzp;
        if (list != null) {
            this.zzn.zzv(list);
        }
        this.zzn.zzl(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhw
    public final void zzz(long j4, boolean z4) throws zzig {
        zzabl zzablVar = this.zzn;
        if (zzablVar != null) {
            zzablVar.zzg(true);
            this.zzn.zzu(zzaw(), zzav(), -this.zzI, zzf());
            this.zzK = true;
        }
        super.zzz(j4, z4);
        if (this.zzn == null) {
            this.zzi.zzi();
        }
        if (z4) {
            zzabl zzablVar2 = this.zzn;
            if (zzablVar2 != null) {
                zzablVar2.zzi(false);
            } else {
                this.zzi.zzc(false);
            }
        }
        this.zzy = 0;
    }
}
