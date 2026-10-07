package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import da.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzjv extends zzi implements zzir {
    public static final /* synthetic */ int zzd = 0;
    private boolean zzA;
    private zzls zzB;
    private zziq zzC;
    private zzbl zzD;
    private zzba zzE;
    private Object zzF;
    private Surface zzG;
    private int zzH;
    private zzee zzI;
    private int zzJ;
    private zzg zzK;
    private float zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private int zzP;
    private zzba zzQ;
    private zzlg zzR;
    private int zzS;
    private long zzT;
    private final zzjd zzU;
    private zzwj zzV;
    final zzyk zzb;
    final zzbl zzc;
    private final zzdf zze;
    private final Context zzf;
    private final zzbp zzg;
    private final zzln[] zzh;
    private final zzyj zzi;
    private final zzdm zzj;
    private final zzkh zzk;
    private final zzds zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzbt zzn;
    private final List zzo;
    private final boolean zzp;
    private final zzlw zzq;
    private final Looper zzr;
    private final zzyr zzs;
    private final zzdc zzt;
    private final zzjr zzu;
    private final zzjs zzv;
    private final zzhv zzw;
    private final long zzx;
    private int zzy;
    private int zzz;

    static {
        zzax.zzb("media3.exoplayer");
    }

    public zzjv(zzip zzipVar, zzbp zzbpVar) {
        zzdf zzdfVar = new zzdf(zzdc.zza);
        this.zze = zzdfVar;
        try {
            zzdt.zze("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.5.0-alpha01] [" + zzen.zze + "]");
            Context applicationContext = zzipVar.zza.getApplicationContext();
            this.zzf = applicationContext;
            zzlw zzlwVar = (zzlw) zzipVar.zzh.apply(zzipVar.zzb);
            this.zzq = zzlwVar;
            this.zzP = zzipVar.zzj;
            this.zzK = zzipVar.zzk;
            this.zzH = zzipVar.zzl;
            this.zzM = false;
            this.zzx = zzipVar.zzp;
            zzju zzjuVar = null;
            zzjr zzjrVar = new zzjr(this, zzjuVar);
            this.zzu = zzjrVar;
            zzjs zzjsVar = new zzjs(zzjuVar);
            this.zzv = zzjsVar;
            Handler handler = new Handler(zzipVar.zzi);
            zzln[] zzlnVarArrZza = ((zzii) zzipVar.zzc).zza.zza(handler, zzjrVar, zzjrVar, zzjrVar, zzjrVar);
            this.zzh = zzlnVarArrZza;
            int length = zzlnVarArrZza.length;
            zzyj zzyjVar = (zzyj) zzipVar.zze.zza();
            this.zzi = zzyjVar;
            zzip.zza(((zzij) zzipVar.zzd).zza);
            zzyv zzyvVarZzh = zzyv.zzh(((zzim) zzipVar.zzg).zza);
            this.zzs = zzyvVarZzh;
            this.zzp = zzipVar.zzm;
            this.zzB = zzipVar.zzn;
            Looper looper = zzipVar.zzi;
            this.zzr = looper;
            zzdc zzdcVar = zzipVar.zzb;
            this.zzt = zzdcVar;
            this.zzg = zzbpVar;
            zzds zzdsVar = new zzds(looper, zzdcVar, new zzdq(this) { // from class: com.google.android.gms.internal.ads.zzjc
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj, zzz zzzVar) {
                }
            });
            this.zzl = zzdsVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new ArrayList();
            this.zzV = new zzwj(0);
            this.zzC = zziq.zza;
            int length2 = zzlnVarArrZza.length;
            zzyk zzykVar = new zzyk(new zzlr[2], new zzyd[2], zzcd.zza, null);
            this.zzb = zzykVar;
            this.zzn = new zzbt();
            zzbk zzbkVar = new zzbk();
            zzbkVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzyjVar.zzn();
            zzbkVar.zzd(29, true);
            zzbkVar.zzd(23, false);
            zzbkVar.zzd(25, false);
            zzbkVar.zzd(33, false);
            zzbkVar.zzd(26, false);
            zzbkVar.zzd(34, false);
            zzbl zzblVarZze = zzbkVar.zze();
            this.zzc = zzblVarZze;
            zzbk zzbkVar2 = new zzbk();
            zzbkVar2.zzb(zzblVarZze);
            zzbkVar2.zza(4);
            zzbkVar2.zza(10);
            this.zzD = zzbkVar2.zze();
            this.zzj = zzdcVar.zzd(looper, null);
            zzjd zzjdVar = new zzjd(this);
            this.zzU = zzjdVar;
            this.zzR = zzlg.zzg(zzykVar);
            zzlwVar.zzS(zzbpVar, looper);
            this.zzk = new zzkh(zzlnVarArrZza, zzyjVar, zzykVar, (zzkl) zzipVar.zzf.zza(), zzyvVarZzh, 0, false, zzlwVar, this.zzB, zzipVar.zzt, zzipVar.zzo, false, false, looper, zzdcVar, zzjdVar, zzen.zza < 31 ? new zzoj(zzipVar.zzs) : zzjn.zza(applicationContext, this, zzipVar.zzq, zzipVar.zzs), null, this.zzC);
            this.zzL = 1.0f;
            zzba zzbaVar = zzba.zza;
            this.zzE = zzbaVar;
            this.zzQ = zzbaVar;
            this.zzS = -1;
            AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
            this.zzJ = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            int i = zzcu.zza;
            this.zzN = true;
            if (zzlwVar == null) {
                throw null;
            }
            zzdsVar.zzb(zzlwVar);
            zzyvVarZzh.zzf(new Handler(looper), zzlwVar);
            copyOnWriteArraySet.add(zzjrVar);
            new zzhq(zzipVar.zza, handler, zzjrVar);
            this.zzw = new zzhv(zzipVar.zza, handler, zzjrVar);
            zzipVar.zza.getApplicationContext();
            zzipVar.zza.getApplicationContext();
            new zzq(0).zza();
            zzci zzciVar = zzci.zza;
            this.zzI = zzee.zza;
            zzyjVar.zzk(this.zzK);
            zzab(1, 10, Integer.valueOf(this.zzJ));
            zzab(2, 10, Integer.valueOf(this.zzJ));
            zzab(1, 3, this.zzK);
            zzab(2, 4, Integer.valueOf(this.zzH));
            zzab(2, 5, 0);
            zzab(1, 9, Boolean.valueOf(this.zzM));
            zzab(2, 7, zzjsVar);
            zzab(6, 8, zzjsVar);
            zzab(-1, 16, Integer.valueOf(this.zzP));
            zzdfVar.zze();
        } catch (Throwable th) {
            this.zze.zze();
            throw th;
        }
    }

    public static /* bridge */ /* synthetic */ void zzK(zzjv zzjvVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzjvVar.zzad(surface);
        zzjvVar.zzG = surface;
    }

    private final int zzR(zzlg zzlgVar) {
        return zzlgVar.zza.zzo() ? this.zzS : zzlgVar.zza.zzn(zzlgVar.zzb.zza, this.zzn).zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzS(int i) {
        return i == -1 ? 2 : 1;
    }

    private final long zzT(zzlg zzlgVar) {
        if (!zzlgVar.zzb.zzb()) {
            return zzen.zzv(zzU(zzlgVar));
        }
        zzlgVar.zza.zzn(zzlgVar.zzb.zza, this.zzn);
        long j4 = zzlgVar.zzc;
        if (j4 == -9223372036854775807L) {
            long j10 = zzlgVar.zza.zze(zzR(zzlgVar), this.zza, 0L).zzl;
            return zzen.zzv(0L);
        }
        return zzen.zzv(0L) + zzen.zzv(j4);
    }

    private final long zzU(zzlg zzlgVar) {
        if (zzlgVar.zza.zzo()) {
            return zzen.zzs(this.zzT);
        }
        long j4 = zzlgVar.zzs;
        if (zzlgVar.zzb.zzb()) {
            return j4;
        }
        zzW(zzlgVar.zza, zzlgVar.zzb, j4);
        return j4;
    }

    private static long zzV(zzlg zzlgVar) {
        zzbu zzbuVar = new zzbu();
        zzbt zzbtVar = new zzbt();
        zzlgVar.zza.zzn(zzlgVar.zzb.zza, zzbtVar);
        long j4 = zzlgVar.zzc;
        if (j4 != -9223372036854775807L) {
            return j4;
        }
        long j10 = zzlgVar.zza.zze(zzbtVar.zzc, zzbuVar, 0L).zzl;
        return 0L;
    }

    private final long zzW(zzbv zzbvVar, zzur zzurVar, long j4) {
        zzbvVar.zzn(zzurVar.zza, this.zzn);
        return j4;
    }

    private final Pair zzX(zzbv zzbvVar, int i, long j4) {
        if (zzbvVar.zzo()) {
            this.zzS = i;
            if (j4 == -9223372036854775807L) {
                j4 = 0;
            }
            this.zzT = j4;
            return null;
        }
        if (i == -1 || i >= zzbvVar.zzc()) {
            i = zzbvVar.zzg(false);
            long j10 = zzbvVar.zze(i, this.zza, 0L).zzl;
            j4 = zzen.zzv(0L);
        }
        return zzbvVar.zzl(this.zza, this.zzn, i, zzen.zzs(j4));
    }

    private final zzlg zzY(zzlg zzlgVar, zzbv zzbvVar, Pair pair) {
        zzdb.zzd(zzbvVar.zzo() || pair != null);
        zzbv zzbvVar2 = zzlgVar.zza;
        long jZzT = zzT(zzlgVar);
        zzlg zzlgVarZzf = zzlgVar.zzf(zzbvVar);
        if (zzbvVar.zzo()) {
            zzur zzurVarZzh = zzlg.zzh();
            long jZzs = zzen.zzs(this.zzT);
            zzlg zzlgVarZza = zzlgVarZzf.zzb(zzurVarZzh, jZzs, jZzs, jZzs, 0L, zzwr.zza, this.zzb, zzfzo.zzn()).zza(zzurVarZzh);
            zzlgVarZza.zzq = zzlgVarZza.zzs;
            return zzlgVarZza;
        }
        Object obj = zzlgVarZzf.zzb.zza;
        int i = zzen.zza;
        boolean zEquals = obj.equals(pair.first);
        zzur zzurVar = !zEquals ? new zzur(pair.first, -1L) : zzlgVarZzf.zzb;
        long jLongValue = ((Long) pair.second).longValue();
        long jZzs2 = zzen.zzs(jZzT);
        if (!zzbvVar2.zzo()) {
            zzbvVar2.zzn(obj, this.zzn);
        }
        if (!zEquals || jLongValue < jZzs2) {
            zzur zzurVar2 = zzurVar;
            zzdb.zzf(!zzurVar2.zzb());
            zzlg zzlgVarZza2 = zzlgVarZzf.zzb(zzurVar2, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? zzwr.zza : zzlgVarZzf.zzh, !zEquals ? this.zzb : zzlgVarZzf.zzi, !zEquals ? zzfzo.zzn() : zzlgVarZzf.zzj).zza(zzurVar2);
            zzlgVarZza2.zzq = jLongValue;
            return zzlgVarZza2;
        }
        if (jLongValue != jZzs2) {
            zzur zzurVar3 = zzurVar;
            zzdb.zzf(!zzurVar3.zzb());
            long jMax = Math.max(0L, zzlgVarZzf.zzr - (jLongValue - jZzs2));
            long j4 = zzlgVarZzf.zzq;
            if (zzlgVarZzf.zzk.equals(zzlgVarZzf.zzb)) {
                j4 = jLongValue + jMax;
            }
            zzlg zzlgVarZzb = zzlgVarZzf.zzb(zzurVar3, jLongValue, jLongValue, jLongValue, jMax, zzlgVarZzf.zzh, zzlgVarZzf.zzi, zzlgVarZzf.zzj);
            zzlgVarZzb.zzq = j4;
            return zzlgVarZzb;
        }
        int iZza = zzbvVar.zza(zzlgVarZzf.zzk.zza);
        if (iZza != -1 && zzbvVar.zzd(iZza, this.zzn, false).zzc == zzbvVar.zzn(zzurVar.zza, this.zzn).zzc) {
            return zzlgVarZzf;
        }
        zzbvVar.zzn(zzurVar.zza, this.zzn);
        long jZzf = zzurVar.zzb() ? this.zzn.zzf(zzurVar.zzb, zzurVar.zzc) : this.zzn.zzd;
        zzur zzurVar4 = zzurVar;
        zzlg zzlgVarZza3 = zzlgVarZzf.zzb(zzurVar4, zzlgVarZzf.zzs, zzlgVarZzf.zzs, zzlgVarZzf.zzd, jZzf - zzlgVarZzf.zzs, zzlgVarZzf.zzh, zzlgVarZzf.zzi, zzlgVarZzf.zzj).zza(zzurVar4);
        zzlgVarZza3.zzq = jZzf;
        return zzlgVarZza3;
    }

    private final zzlj zzZ(zzli zzliVar) {
        int iZzR = zzR(this.zzR);
        zzbv zzbvVar = this.zzR.zza;
        if (iZzR == -1) {
            iZzR = 0;
        }
        zzdc zzdcVar = this.zzt;
        zzkh zzkhVar = this.zzk;
        return new zzlj(zzkhVar, zzliVar, zzbvVar, iZzR, zzdcVar, zzkhVar.zzc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaa(final int i, final int i10) {
        if (i == this.zzI.zzb() && i10 == this.zzI.zza()) {
            return;
        }
        this.zzI = new zzee(i, i10);
        zzds zzdsVar = this.zzl;
        zzdsVar.zzd(24, new zzdp() { // from class: com.google.android.gms.internal.ads.zziy
            @Override // com.google.android.gms.internal.ads.zzdp
            public final void zza(Object obj) {
                int i11 = zzjv.zzd;
                ((zzbm) obj).zzo(i, i10);
            }
        });
        zzdsVar.zzc();
        zzab(2, 14, new zzee(i, i10));
    }

    private final void zzab(int i, int i10, Object obj) {
        zzln[] zzlnVarArr = this.zzh;
        int length = zzlnVarArr.length;
        for (int i11 = 0; i11 < 2; i11++) {
            zzln zzlnVar = zzlnVarArr[i11];
            if (i == -1 || zzlnVar.zzb() == i) {
                zzlj zzljVarZzZ = zzZ(zzlnVar);
                zzljVarZzZ.zzf(i10);
                zzljVarZzZ.zze(obj);
                zzljVarZzZ.zzd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzac() {
        zzab(1, 2, Float.valueOf(this.zzL * this.zzw.zza()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzad(Object obj) {
        ArrayList arrayList = new ArrayList();
        zzln[] zzlnVarArr = this.zzh;
        int length = zzlnVarArr.length;
        boolean z4 = false;
        for (int i = 0; i < 2; i++) {
            zzln zzlnVar = zzlnVarArr[i];
            if (zzlnVar.zzb() == 2) {
                zzlj zzljVarZzZ = zzZ(zzlnVar);
                zzljVarZzZ.zzf(1);
                zzljVarZzZ.zze(obj);
                zzljVarZzZ.zzd();
                arrayList.add(zzljVarZzZ);
            }
        }
        Object obj2 = this.zzF;
        if (obj2 != null && obj2 != obj) {
            try {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    ((zzlj) obj3).zzi(this.zzx);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z4 = true;
            }
            Object obj4 = this.zzF;
            Surface surface = this.zzG;
            if (obj4 == surface) {
                surface.release();
                this.zzG = null;
            }
        }
        this.zzF = obj;
        if (z4) {
            zzae(zzig.zzd(new zzki(3), 1003));
        }
    }

    private final void zzae(zzig zzigVar) {
        zzlg zzlgVar = this.zzR;
        zzlg zzlgVarZza = zzlgVar.zza(zzlgVar.zzb);
        zzlgVarZza.zzq = zzlgVarZza.zzs;
        zzlgVarZza.zzr = 0L;
        zzlg zzlgVarZze = zzlgVarZza.zze(1);
        if (zzigVar != null) {
            zzlgVarZze = zzlgVarZze.zzd(zzigVar);
        }
        this.zzy++;
        this.zzk.zzo();
        zzag(zzlgVarZze, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaf(boolean z4, int i, int i10) {
        boolean z10 = z4 && i != -1;
        int i11 = i == 0 ? 1 : 0;
        zzlg zzlgVar = this.zzR;
        if (zzlgVar.zzl == z10 && zzlgVar.zzn == i11 && zzlgVar.zzm == i10) {
            return;
        }
        this.zzy++;
        zzlg zzlgVarZzc = zzlgVar.zzc(z10, i10, i11);
        this.zzk.zzn(z10, i10, i11);
        zzag(zzlgVarZzc, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:102:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:104:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:106:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:107:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:110:0x0302  */
    /* JADX WARN: Code duplicated, block: B:112:0x0310  */
    /* JADX WARN: Code duplicated, block: B:115:0x0320  */
    /* JADX WARN: Code duplicated, block: B:117:0x0334  */
    /* JADX WARN: Code duplicated, block: B:119:0x0344  */
    /* JADX WARN: Code duplicated, block: B:122:0x0354  */
    /* JADX WARN: Code duplicated, block: B:125:0x0362  */
    /* JADX WARN: Code duplicated, block: B:130:0x0375  */
    /* JADX WARN: Code duplicated, block: B:133:0x0386  */
    /* JADX WARN: Code duplicated, block: B:136:0x039b  */
    /* JADX WARN: Code duplicated, block: B:139:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:142:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:144:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:146:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:149:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:150:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:152:0x040e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0411  */
    /* JADX WARN: Code duplicated, block: B:156:0x041d  */
    /* JADX WARN: Code duplicated, block: B:157:0x041f  */
    /* JADX WARN: Code duplicated, block: B:159:0x042f  */
    /* JADX WARN: Code duplicated, block: B:162:0x043a  */
    /* JADX WARN: Code duplicated, block: B:164:0x044e  */
    /* JADX WARN: Code duplicated, block: B:166:0x0452  */
    /* JADX WARN: Code duplicated, block: B:169:0x0461  */
    /* JADX WARN: Code duplicated, block: B:172:0x0471  */
    /* JADX WARN: Code duplicated, block: B:175:0x0489 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:177:0x048d  */
    /* JADX WARN: Code duplicated, block: B:180:0x0493 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x0497  */
    /* JADX WARN: Code duplicated, block: B:185:0x049d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:189:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:195:0x04b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:197:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:200:0x04bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:204:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:209:0x04d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:212:0x04da  */
    /* JADX WARN: Code duplicated, block: B:215:0x04e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:217:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:220:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:41:0x0110  */
    /* JADX WARN: Code duplicated, block: B:43:0x0116  */
    /* JADX WARN: Code duplicated, block: B:47:0x0123  */
    /* JADX WARN: Code duplicated, block: B:50:0x0132  */
    /* JADX WARN: Code duplicated, block: B:53:0x013e A[LOOP:1: B:51:0x0138->B:53:0x013e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x015e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0161  */
    /* JADX WARN: Code duplicated, block: B:62:0x018c  */
    /* JADX WARN: Code duplicated, block: B:63:0x018e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0195  */
    /* JADX WARN: Code duplicated, block: B:67:0x0197  */
    /* JADX WARN: Code duplicated, block: B:70:0x019c  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:76:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:83:0x020a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0212  */
    /* JADX WARN: Code duplicated, block: B:86:0x0221  */
    /* JADX WARN: Code duplicated, block: B:88:0x0228  */
    /* JADX WARN: Code duplicated, block: B:90:0x0230  */
    /* JADX WARN: Code duplicated, block: B:91:0x0233  */
    /* JADX WARN: Code duplicated, block: B:93:0x023b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0242  */
    /* JADX WARN: Code duplicated, block: B:97:0x026e  */
    /* JADX WARN: Code duplicated, block: B:98:0x029e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.zzbv] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    private final void zzag(final zzlg zzlgVar, final int i, boolean z4, int i10, long j4, int i11, boolean z10) {
        int i12;
        int i13;
        boolean z11;
        Pair pair;
        boolean z12;
        boolean z13;
        int i14;
        boolean zBooleanValue;
        final int iIntValue;
        final zzaw zzawVar;
        zzay zzayVarZza;
        List list;
        int i15;
        zzbd zzbdVar;
        zzbv zzbvVarZzn;
        zzba zzbaVarZzu;
        boolean zEquals;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        zzyk zzykVar;
        zzyk zzykVar2;
        zzbl zzblVar;
        zzbp zzbpVar;
        boolean zZzw;
        zzi zziVar;
        zzbv zzbvVarZzn2;
        zzbp zzbpVar2;
        boolean z18;
        zzbv zzbvVarZzn3;
        ?? r13;
        int iZzk;
        int i16;
        boolean z19;
        ?? Zzn;
        int iZzd;
        ?? r10;
        zzbv zzbvVarZzn4;
        boolean z20;
        long j10;
        zzbv zzbvVarZzn5;
        boolean z21;
        boolean zZzo;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        zzbl zzblVarZze;
        zzbt zzbtVar;
        int i17;
        Object obj;
        zzaw zzawVar2;
        Object obj2;
        int i18;
        long jZzV;
        long jZzV2;
        int iZzd2;
        Object obj3;
        zzaw zzawVar3;
        Object obj4;
        int iZza;
        long jZzv;
        long jZzv2;
        final int i19 = i10;
        zzlg zzlgVar2 = this.zzR;
        this.zzR = zzlgVar;
        boolean zEquals2 = zzlgVar2.zza.equals(zzlgVar.zza);
        zzbv zzbvVar = zzlgVar2.zza;
        zzbv zzbvVar2 = zzlgVar.zza;
        int i20 = 0;
        if (!zzbvVar2.zzo() || !zzbvVar.zzo()) {
            i12 = 3;
            if (zzbvVar2.zzo() != zzbvVar.zzo()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else if (zzbvVar.zze(zzbvVar.zzn(zzlgVar2.zzb.zza, this.zzn).zzc, this.zza, 0L).zzb.equals(zzbvVar2.zze(zzbvVar2.zzn(zzlgVar.zzb.zza, this.zzn).zzc, this.zza, 0L).zzb)) {
                if (!z4) {
                    i13 = i19;
                    z11 = false;
                } else if (i19 != 0) {
                    i13 = i19;
                    z11 = true;
                } else if (zzlgVar2.zzb.zzd < zzlgVar.zzb.zzd) {
                    pair = new Pair(Boolean.TRUE, 0);
                    z12 = true;
                    i19 = 0;
                } else {
                    z11 = true;
                    i13 = 0;
                }
                pair = new Pair(Boolean.FALSE, -1);
                int i21 = i13;
                z12 = z11;
                i19 = i21;
            } else {
                if (z4) {
                    if (i19 == 0) {
                        i14 = 1;
                        z12 = true;
                        i19 = 0;
                    } else {
                        z13 = true;
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i14));
                } else {
                    z13 = false;
                }
                z12 = z13;
                if (z13 && i19 == 1) {
                    i14 = 2;
                } else {
                    if (zEquals2) {
                        throw new IllegalStateException();
                    }
                    z12 = z13;
                    i14 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i14));
            }
            zBooleanValue = ((Boolean) pair.first).booleanValue();
            iIntValue = ((Integer) pair.second).intValue();
            if (zBooleanValue) {
                if (zzlgVar.zza.zzo()) {
                    zzawVar = null;
                } else {
                    zzawVar = zzlgVar.zza.zze(zzlgVar.zza.zzn(zzlgVar.zzb.zza, this.zzn).zzc, this.zza, 0L).zzd;
                }
                this.zzQ = zzba.zza;
            } else {
                zzawVar = null;
            }
            if (zBooleanValue || !zzlgVar2.zzj.equals(zzlgVar.zzj)) {
                zzayVarZza = this.zzQ.zza();
                list = zzlgVar.zzj;
                i15 = 0;
                while (i15 < list.size()) {
                    zzbdVar = (zzbd) list.get(i15);
                    while (i20 < zzbdVar.zza()) {
                        zzbdVar.zzb(i20).zza(zzayVarZza);
                        i20++;
                    }
                    i15++;
                    i20 = 0;
                }
                this.zzQ = zzayVarZza.zzu();
            }
            zzbvVarZzn = zzn();
            if (zzbvVarZzn.zzo()) {
                zzbaVarZzu = this.zzQ;
            } else {
                zzaw zzawVar4 = zzbvVarZzn.zze(zzd(), this.zza, 0L).zzd;
                zzay zzayVarZza2 = this.zzQ.zza();
                zzayVarZza2.zzb(zzawVar4.zzd);
                zzbaVarZzu = zzayVarZza2.zzu();
            }
            zEquals = zzbaVarZzu.equals(this.zzE);
            this.zzE = zzbaVarZzu;
            if (zzlgVar2.zzl != zzlgVar.zzl) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (zzlgVar2.zze != zzlgVar.zze) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15 || z14) {
                zzah();
            }
            if (zzlgVar2.zzg != zzlgVar.zzg) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (!zEquals2) {
                this.zzl.zzd(0, new zzdp() { // from class: com.google.android.gms.internal.ads.zzis
                    @Override // com.google.android.gms.internal.ads.zzdp
                    public final void zza(Object obj5) {
                        int i22 = zzjv.zzd;
                        ((zzbm) obj5).zzp(zzlgVar.zza, i);
                    }
                });
            }
            if (z12) {
                zzbtVar = new zzbt();
                if (zzlgVar2.zza.zzo()) {
                    i17 = i11;
                    obj = null;
                    zzawVar2 = null;
                    obj2 = null;
                    i18 = -1;
                } else {
                    Object obj5 = zzlgVar2.zzb.zza;
                    zzlgVar2.zza.zzn(obj5, zzbtVar);
                    int i22 = zzbtVar.zzc;
                    int iZza2 = zzlgVar2.zza.zza(obj5);
                    obj = zzlgVar2.zza.zze(i22, this.zza, 0L).zzb;
                    zzawVar2 = this.zza.zzd;
                    obj2 = obj5;
                    i17 = i22;
                    i18 = iZza2;
                }
                if (i19 == 0) {
                    if (zzlgVar2.zzb.zzb()) {
                        zzur zzurVar = zzlgVar2.zzb;
                        jZzV = zzbtVar.zzf(zzurVar.zzb, zzurVar.zzc);
                        jZzV2 = zzV(zzlgVar2);
                    } else {
                        if (zzlgVar2.zzb.zze != -1) {
                            jZzV = zzV(this.zzR);
                        } else {
                            jZzV = zzbtVar.zzd;
                        }
                        jZzV2 = jZzV;
                    }
                } else if (zzlgVar2.zzb.zzb()) {
                    jZzV = zzlgVar2.zzs;
                    jZzV2 = zzV(zzlgVar2);
                } else {
                    jZzV = zzlgVar2.zzs;
                    jZzV2 = jZzV;
                }
                int i23 = zzen.zza;
                zzur zzurVar2 = zzlgVar2.zzb;
                final zzbn zzbnVar = new zzbn(obj, i17, zzawVar2, obj2, i18, zzen.zzv(jZzV), zzen.zzv(jZzV2), zzurVar2.zzb, zzurVar2.zzc);
                iZzd2 = zzd();
                if (this.zzR.zza.zzo()) {
                    obj3 = null;
                    zzawVar3 = null;
                    obj4 = null;
                    iZza = -1;
                } else {
                    zzlg zzlgVar3 = this.zzR;
                    Object obj6 = zzlgVar3.zzb.zza;
                    zzlgVar3.zza.zzn(obj6, this.zzn);
                    iZza = this.zzR.zza.zza(obj6);
                    obj4 = obj6;
                    obj3 = this.zzR.zza.zze(iZzd2, this.zza, 0L).zzb;
                    zzawVar3 = this.zza.zzd;
                }
                jZzv = zzen.zzv(j4);
                if (this.zzR.zzb.zzb()) {
                    jZzv2 = zzen.zzv(zzV(this.zzR));
                } else {
                    jZzv2 = jZzv;
                }
                zzur zzurVar3 = this.zzR.zzb;
                final zzbn zzbnVar2 = new zzbn(obj3, iZzd2, zzawVar3, obj4, iZza, jZzv, jZzv2, zzurVar3.zzb, zzurVar3.zzc);
                this.zzl.zzd(11, new zzdp() { // from class: com.google.android.gms.internal.ads.zzji
                    @Override // com.google.android.gms.internal.ads.zzdp
                    public final void zza(Object obj7) {
                        int i24 = zzjv.zzd;
                        ((zzbm) obj7).zzm(zzbnVar, zzbnVar2, i19);
                    }
                });
            } else {
                z14 = z14;
                zEquals = zEquals;
                z15 = z15;
            }
            if (zBooleanValue) {
                z17 = true;
                this.zzl.zzd(1, new zzdp() { // from class: com.google.android.gms.internal.ads.zzjj
                    @Override // com.google.android.gms.internal.ads.zzdp
                    public final void zza(Object obj7) {
                        int i24 = zzjv.zzd;
                        ((zzbm) obj7).zzd(zzawVar, iIntValue);
                    }
                });
            } else {
                z17 = true;
            }
            if (zzlgVar2.zzf != zzlgVar.zzf) {
                this.zzl.zzd(10, new zzdp() { // from class: com.google.android.gms.internal.ads.zzjk
                    @Override // com.google.android.gms.internal.ads.zzdp
                    public final void zza(Object obj7) {
                        int i24 = zzjv.zzd;
                        ((zzbm) obj7).zzk(zzlgVar.zzf);
                    }
                });
                if (zzlgVar.zzf != null) {
                    this.zzl.zzd(10, new zzdp() { // from class: com.google.android.gms.internal.ads.zzjl
                        @Override // com.google.android.gms.internal.ads.zzdp
                        public final void zza(Object obj7) {
                            int i24 = zzjv.zzd;
                            ((zzbm) obj7).zzj(zzlgVar.zzf);
                        }
                    });
                }
            }
            zzykVar = zzlgVar2.zzi;
            zzykVar2 = zzlgVar.zzi;
            if (zzykVar != zzykVar2) {
                this.zzi.zzp(zzykVar2.zze);
                this.zzl.zzd(2, new zzdp() { // from class: com.google.android.gms.internal.ads.zzjm
                    @Override // com.google.android.gms.internal.ads.zzdp
                    public final void zza(Object obj7) {
                        int i24 = zzjv.zzd;
                        ((zzbm) obj7).zzq(zzlgVar.zzi.zzd);
                    }
                });
            }
            if (!zEquals) {
                final zzba zzbaVar = this.zzE;
                this.zzl.zzd(14, new zzdp() { // from class: com.google.android.gms.internal.ads.zzit
                    @Override // com.google.android.gms.internal.ads.zzdp
                    public final void zza(Object obj7) {
                        int i24 = zzjv.zzd;
                        ((zzbm) obj7).zze(zzbaVar);
                    }
                });
            }
            if (z16) {
                this.zzl.zzd(i12, new zzdp() { // from class: com.google.android.gms.internal.ads.zziu
                    @Override // com.google.android.gms.internal.ads.zzdp
                    public final void zza(Object obj7) {
                        int i24 = zzjv.zzd;
                        ((zzbm) obj7).zzb(zzlgVar.zzg);
                    }
                });
            }
            if (z15 || z14) {
                this.zzl.zzd(-1, new zzdp() { // from class: com.google.android.gms.internal.ads.zziv
                    @Override // com.google.android.gms.internal.ads.zzdp
                    public final void zza(Object obj7) {
                        int i24 = zzjv.zzd;
                        zzlg zzlgVar4 = zzlgVar;
                        ((zzbm) obj7).zzl(zzlgVar4.zzl, zzlgVar4.zze);
                    }
                });
            }
            if (z15) {
                this.zzl.zzd(4, new zzdp() { // from class: com.google.android.gms.internal.ads.zziw
                    @Override // com.google.android.gms.internal.ads.zzdp
                    public final void zza(Object obj7) {
                        int i24 = zzjv.zzd;
                        ((zzbm) obj7).zzh(zzlgVar.zze);
                    }
                });
            }
            if (z14 || zzlgVar2.zzm != zzlgVar.zzm) {
                this.zzl.zzd(5, new zzdp() { // from class: com.google.android.gms.internal.ads.zzjb
                    @Override // com.google.android.gms.internal.ads.zzdp
                    public final void zza(Object obj7) {
                        int i24 = zzjv.zzd;
                        zzlg zzlgVar4 = zzlgVar;
                        ((zzbm) obj7).zzf(zzlgVar4.zzl, zzlgVar4.zzm);
                    }
                });
            }
            if (zzlgVar2.zzn != zzlgVar.zzn) {
                this.zzl.zzd(6, new zzdp() { // from class: com.google.android.gms.internal.ads.zzjf
                    @Override // com.google.android.gms.internal.ads.zzdp
                    public final void zza(Object obj7) {
                        int i24 = zzjv.zzd;
                        ((zzbm) obj7).zzi(zzlgVar.zzn);
                    }
                });
            }
            if (zzlgVar2.zzi() != zzlgVar.zzi()) {
                this.zzl.zzd(7, new zzdp() { // from class: com.google.android.gms.internal.ads.zzjg
                    @Override // com.google.android.gms.internal.ads.zzdp
                    public final void zza(Object obj7) {
                        int i24 = zzjv.zzd;
                        ((zzbm) obj7).zzc(zzlgVar.zzi());
                    }
                });
            }
            if (!zzlgVar2.zzo.equals(zzlgVar.zzo)) {
                this.zzl.zzd(12, new zzdp() { // from class: com.google.android.gms.internal.ads.zzjh
                    @Override // com.google.android.gms.internal.ads.zzdp
                    public final void zza(Object obj7) {
                        int i24 = zzjv.zzd;
                        ((zzbm) obj7).zzg(zzlgVar.zzo);
                    }
                });
            }
            zzblVar = this.zzD;
            zzbpVar = this.zzg;
            zzbl zzblVar2 = this.zzc;
            int i24 = zzen.zza;
            zZzw = zzbpVar.zzw();
            zziVar = (zzi) zzbpVar;
            zzbvVarZzn2 = zziVar.zzn();
            if (!zzbvVarZzn2.zzo()) {
                zzbpVar2 = zzbpVar;
                z18 = zzbvVarZzn2.zze(zziVar.zzd(), zziVar.zza, 0L).zzh ? z17 : false;
                zzbvVarZzn3 = zziVar.zzn();
                if (zzbvVarZzn3.zzo()) {
                    i16 = -1;
                    r13 = 0;
                    z19 = false;
                } else {
                    int iZzd3 = zziVar.zzd();
                    zziVar.zzh();
                    zziVar.zzv();
                    r13 = 0;
                    r13 = 0;
                    iZzk = zzbvVarZzn3.zzk(iZzd3, 0, false);
                    i16 = -1;
                    if (iZzk != -1) {
                        z19 = z17;
                    } else {
                        z19 = false;
                    }
                }
                Zzn = zziVar.zzn();
                if (Zzn.zzo()) {
                    r10 = r13;
                } else {
                    iZzd = zziVar.zzd();
                    zziVar.zzh();
                    zziVar.zzv();
                    if (Zzn.zzj(iZzd, r13, r13) != i16) {
                        r10 = z17;
                    } else {
                        r10 = r13;
                    }
                }
                zzbvVarZzn4 = zziVar.zzn();
                if (!zzbvVarZzn4.zzo()) {
                    z20 = zZzw;
                    j10 = 0;
                    boolean z28 = zzbvVarZzn4.zze(zziVar.zzd(), zziVar.zza, 0L).zzb() ? z17 : false;
                    zzbvVarZzn5 = zziVar.zzn();
                    if (zzbvVarZzn5.zzo() && zzbvVarZzn5.zze(zziVar.zzd(), zziVar.zza, j10).zzi) {
                        z21 = z17;
                    } else {
                        z21 = false;
                    }
                    zZzo = zzbpVar2.zzn().zzo();
                    zzbk zzbkVar = new zzbk();
                    zzbkVar.zzb(zzblVar2);
                    boolean z29 = !z20;
                    zzbkVar.zzd(4, z29);
                    if (z18 || z20) {
                        z22 = false;
                    } else {
                        z22 = z17;
                    }
                    zzbkVar.zzd(5, z22);
                    if (z19 || z20) {
                        z23 = false;
                    } else {
                        z23 = z17;
                    }
                    zzbkVar.zzd(6, z23);
                    if (!zZzo || (!(z19 || !z28 || z18) || z20)) {
                        z24 = false;
                    } else {
                        z24 = z17;
                    }
                    zzbkVar.zzd(7, z24);
                    if (r10 != 0 || z20) {
                        z25 = false;
                    } else {
                        z25 = z17;
                    }
                    zzbkVar.zzd(8, z25);
                    if (!zZzo || ((r10 == 0 && !(z28 && z21)) || z20)) {
                        z26 = false;
                    } else {
                        z26 = z17;
                    }
                    zzbkVar.zzd(9, z26);
                    zzbkVar.zzd(10, z29);
                    if (z18 || z20) {
                        z27 = false;
                    } else {
                        z27 = z17;
                    }
                    zzbkVar.zzd(11, z27);
                    if (z18 || z20) {
                        z17 = false;
                    }
                    zzbkVar.zzd(12, z17);
                    zzblVarZze = zzbkVar.zze();
                    this.zzD = zzblVarZze;
                    if (!zzblVarZze.equals(zzblVar)) {
                        this.zzl.zzd(13, new zzdp() { // from class: com.google.android.gms.internal.ads.zzje
                            @Override // com.google.android.gms.internal.ads.zzdp
                            public final void zza(Object obj7) {
                                this.zza.zzP((zzbm) obj7);
                            }
                        });
                    }
                    this.zzl.zzc();
                }
                z20 = zZzw;
                j10 = 0;
                zzbvVarZzn5 = zziVar.zzn();
                if (zzbvVarZzn5.zzo()) {
                    z21 = false;
                } else {
                    z21 = false;
                }
                zZzo = zzbpVar2.zzn().zzo();
                zzbk zzbkVar2 = new zzbk();
                zzbkVar2.zzb(zzblVar2);
                boolean z210 = !z20;
                zzbkVar2.zzd(4, z210);
                if (z18) {
                    z22 = false;
                } else {
                    z22 = false;
                }
                zzbkVar2.zzd(5, z22);
                if (z19) {
                    z23 = false;
                } else {
                    z23 = false;
                }
                zzbkVar2.zzd(6, z23);
                if (zZzo) {
                    z24 = false;
                } else {
                    z24 = false;
                }
                zzbkVar2.zzd(7, z24);
                if (r10 != 0) {
                    z25 = false;
                } else {
                    z25 = false;
                }
                zzbkVar2.zzd(8, z25);
                if (zZzo) {
                    z26 = false;
                } else {
                    z26 = false;
                }
                zzbkVar2.zzd(9, z26);
                zzbkVar2.zzd(10, z210);
                if (z18) {
                    z27 = false;
                } else {
                    z27 = false;
                }
                zzbkVar2.zzd(11, z27);
                if (z18) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                zzbkVar2.zzd(12, z17);
                zzblVarZze = zzbkVar2.zze();
                this.zzD = zzblVarZze;
                if (!zzblVarZze.equals(zzblVar)) {
                    this.zzl.zzd(13, new zzdp() { // from class: com.google.android.gms.internal.ads.zzje
                        @Override // com.google.android.gms.internal.ads.zzdp
                        public final void zza(Object obj7) {
                            this.zza.zzP((zzbm) obj7);
                        }
                    });
                }
                this.zzl.zzc();
            }
            zzbpVar2 = zzbpVar;
            zzbvVarZzn3 = zziVar.zzn();
            if (zzbvVarZzn3.zzo()) {
                i16 = -1;
                r13 = 0;
                z19 = false;
            } else {
                int iZzd4 = zziVar.zzd();
                zziVar.zzh();
                zziVar.zzv();
                r13 = 0;
                r13 = 0;
                iZzk = zzbvVarZzn3.zzk(iZzd4, 0, false);
                i16 = -1;
                if (iZzk != -1) {
                    z19 = z17;
                } else {
                    z19 = false;
                }
            }
            Zzn = zziVar.zzn();
            if (Zzn.zzo()) {
                r10 = r13;
            } else {
                iZzd = zziVar.zzd();
                zziVar.zzh();
                zziVar.zzv();
                if (Zzn.zzj(iZzd, r13, r13) != i16) {
                    r10 = z17;
                } else {
                    r10 = r13;
                }
            }
            zzbvVarZzn4 = zziVar.zzn();
            if (!zzbvVarZzn4.zzo()) {
                z20 = zZzw;
                j10 = 0;
                if (zzbvVarZzn4.zze(zziVar.zzd(), zziVar.zza, 0L).zzb()) {
                }
                zzbvVarZzn5 = zziVar.zzn();
                if (zzbvVarZzn5.zzo()) {
                    z21 = false;
                } else {
                    z21 = false;
                }
                zZzo = zzbpVar2.zzn().zzo();
                zzbk zzbkVar3 = new zzbk();
                zzbkVar3.zzb(zzblVar2);
                boolean z211 = !z20;
                zzbkVar3.zzd(4, z211);
                if (z18) {
                    z22 = false;
                } else {
                    z22 = false;
                }
                zzbkVar3.zzd(5, z22);
                if (z19) {
                    z23 = false;
                } else {
                    z23 = false;
                }
                zzbkVar3.zzd(6, z23);
                if (zZzo) {
                    z24 = false;
                } else {
                    z24 = false;
                }
                zzbkVar3.zzd(7, z24);
                if (r10 != 0) {
                    z25 = false;
                } else {
                    z25 = false;
                }
                zzbkVar3.zzd(8, z25);
                if (zZzo) {
                    z26 = false;
                } else {
                    z26 = false;
                }
                zzbkVar3.zzd(9, z26);
                zzbkVar3.zzd(10, z211);
                if (z18) {
                    z27 = false;
                } else {
                    z27 = false;
                }
                zzbkVar3.zzd(11, z27);
                if (z18) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                zzbkVar3.zzd(12, z17);
                zzblVarZze = zzbkVar3.zze();
                this.zzD = zzblVarZze;
                if (!zzblVarZze.equals(zzblVar)) {
                    this.zzl.zzd(13, new zzdp() { // from class: com.google.android.gms.internal.ads.zzje
                        @Override // com.google.android.gms.internal.ads.zzdp
                        public final void zza(Object obj7) {
                            this.zza.zzP((zzbm) obj7);
                        }
                    });
                }
                this.zzl.zzc();
            }
            z20 = zZzw;
            j10 = 0;
            zzbvVarZzn5 = zziVar.zzn();
            if (zzbvVarZzn5.zzo()) {
                z21 = false;
            } else {
                z21 = false;
            }
            zZzo = zzbpVar2.zzn().zzo();
            zzbk zzbkVar4 = new zzbk();
            zzbkVar4.zzb(zzblVar2);
            boolean z212 = !z20;
            zzbkVar4.zzd(4, z212);
            if (z18) {
                z22 = false;
            } else {
                z22 = false;
            }
            zzbkVar4.zzd(5, z22);
            if (z19) {
                z23 = false;
            } else {
                z23 = false;
            }
            zzbkVar4.zzd(6, z23);
            if (zZzo) {
                z24 = false;
            } else {
                z24 = false;
            }
            zzbkVar4.zzd(7, z24);
            if (r10 != 0) {
                z25 = false;
            } else {
                z25 = false;
            }
            zzbkVar4.zzd(8, z25);
            if (zZzo) {
                z26 = false;
            } else {
                z26 = false;
            }
            zzbkVar4.zzd(9, z26);
            zzbkVar4.zzd(10, z212);
            if (z18) {
                z27 = false;
            } else {
                z27 = false;
            }
            zzbkVar4.zzd(11, z27);
            if (z18) {
                z17 = false;
            } else {
                z17 = false;
            }
            zzbkVar4.zzd(12, z17);
            zzblVarZze = zzbkVar4.zze();
            this.zzD = zzblVarZze;
            if (!zzblVarZze.equals(zzblVar)) {
                this.zzl.zzd(13, new zzdp() { // from class: com.google.android.gms.internal.ads.zzje
                    @Override // com.google.android.gms.internal.ads.zzdp
                    public final void zza(Object obj7) {
                        this.zza.zzP((zzbm) obj7);
                    }
                });
            }
            this.zzl.zzc();
        }
        pair = new Pair(Boolean.FALSE, -1);
        i12 = 3;
        z12 = z4;
        zBooleanValue = ((Boolean) pair.first).booleanValue();
        iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            if (zzlgVar.zza.zzo()) {
                zzawVar = zzlgVar.zza.zze(zzlgVar.zza.zzn(zzlgVar.zzb.zza, this.zzn).zzc, this.zza, 0L).zzd;
            } else {
                zzawVar = null;
            }
            this.zzQ = zzba.zza;
        } else {
            zzawVar = null;
        }
        if (zBooleanValue) {
            zzayVarZza = this.zzQ.zza();
            list = zzlgVar.zzj;
            i15 = 0;
            while (i15 < list.size()) {
                zzbdVar = (zzbd) list.get(i15);
                while (i20 < zzbdVar.zza()) {
                    zzbdVar.zzb(i20).zza(zzayVarZza);
                    i20++;
                }
                i15++;
                i20 = 0;
            }
            this.zzQ = zzayVarZza.zzu();
        } else {
            zzayVarZza = this.zzQ.zza();
            list = zzlgVar.zzj;
            i15 = 0;
            while (i15 < list.size()) {
                zzbdVar = (zzbd) list.get(i15);
                while (i20 < zzbdVar.zza()) {
                    zzbdVar.zzb(i20).zza(zzayVarZza);
                    i20++;
                }
                i15++;
                i20 = 0;
            }
            this.zzQ = zzayVarZza.zzu();
        }
        zzbvVarZzn = zzn();
        if (zzbvVarZzn.zzo()) {
            zzbaVarZzu = this.zzQ;
        } else {
            zzaw zzawVar5 = zzbvVarZzn.zze(zzd(), this.zza, 0L).zzd;
            zzay zzayVarZza3 = this.zzQ.zza();
            zzayVarZza3.zzb(zzawVar5.zzd);
            zzbaVarZzu = zzayVarZza3.zzu();
        }
        zEquals = zzbaVarZzu.equals(this.zzE);
        this.zzE = zzbaVarZzu;
        if (zzlgVar2.zzl != zzlgVar.zzl) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (zzlgVar2.zze != zzlgVar.zze) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z15) {
            zzah();
        } else {
            zzah();
        }
        if (zzlgVar2.zzg != zzlgVar.zzg) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (!zEquals2) {
            this.zzl.zzd(0, new zzdp() { // from class: com.google.android.gms.internal.ads.zzis
                @Override // com.google.android.gms.internal.ads.zzdp
                public final void zza(Object obj7) {
                    int i25 = zzjv.zzd;
                    ((zzbm) obj7).zzp(zzlgVar.zza, i);
                }
            });
        }
        if (z12) {
            zzbtVar = new zzbt();
            if (zzlgVar2.zza.zzo()) {
                Object obj7 = zzlgVar2.zzb.zza;
                zzlgVar2.zza.zzn(obj7, zzbtVar);
                int i25 = zzbtVar.zzc;
                int iZza3 = zzlgVar2.zza.zza(obj7);
                obj = zzlgVar2.zza.zze(i25, this.zza, 0L).zzb;
                zzawVar2 = this.zza.zzd;
                obj2 = obj7;
                i17 = i25;
                i18 = iZza3;
            } else {
                i17 = i11;
                obj = null;
                zzawVar2 = null;
                obj2 = null;
                i18 = -1;
            }
            if (i19 == 0) {
                if (zzlgVar2.zzb.zzb()) {
                    zzur zzurVar4 = zzlgVar2.zzb;
                    jZzV = zzbtVar.zzf(zzurVar4.zzb, zzurVar4.zzc);
                    jZzV2 = zzV(zzlgVar2);
                } else {
                    if (zzlgVar2.zzb.zze != -1) {
                        jZzV = zzV(this.zzR);
                    } else {
                        jZzV = zzbtVar.zzd;
                    }
                    jZzV2 = jZzV;
                }
            } else if (zzlgVar2.zzb.zzb()) {
                jZzV = zzlgVar2.zzs;
                jZzV2 = zzV(zzlgVar2);
            } else {
                jZzV = zzlgVar2.zzs;
                jZzV2 = jZzV;
            }
            int i26 = zzen.zza;
            zzur zzurVar5 = zzlgVar2.zzb;
            final zzbn zzbnVar3 = new zzbn(obj, i17, zzawVar2, obj2, i18, zzen.zzv(jZzV), zzen.zzv(jZzV2), zzurVar5.zzb, zzurVar5.zzc);
            iZzd2 = zzd();
            if (this.zzR.zza.zzo()) {
                zzlg zzlgVar4 = this.zzR;
                Object obj8 = zzlgVar4.zzb.zza;
                zzlgVar4.zza.zzn(obj8, this.zzn);
                iZza = this.zzR.zza.zza(obj8);
                obj4 = obj8;
                obj3 = this.zzR.zza.zze(iZzd2, this.zza, 0L).zzb;
                zzawVar3 = this.zza.zzd;
            } else {
                obj3 = null;
                zzawVar3 = null;
                obj4 = null;
                iZza = -1;
            }
            jZzv = zzen.zzv(j4);
            if (this.zzR.zzb.zzb()) {
                jZzv2 = zzen.zzv(zzV(this.zzR));
            } else {
                jZzv2 = jZzv;
            }
            zzur zzurVar6 = this.zzR.zzb;
            final zzbn zzbnVar4 = new zzbn(obj3, iZzd2, zzawVar3, obj4, iZza, jZzv, jZzv2, zzurVar6.zzb, zzurVar6.zzc);
            this.zzl.zzd(11, new zzdp() { // from class: com.google.android.gms.internal.ads.zzji
                @Override // com.google.android.gms.internal.ads.zzdp
                public final void zza(Object obj9) {
                    int i27 = zzjv.zzd;
                    ((zzbm) obj9).zzm(zzbnVar3, zzbnVar4, i19);
                }
            });
        } else {
            z14 = z14;
            zEquals = zEquals;
            z15 = z15;
        }
        if (zBooleanValue) {
            z17 = true;
            this.zzl.zzd(1, new zzdp() { // from class: com.google.android.gms.internal.ads.zzjj
                @Override // com.google.android.gms.internal.ads.zzdp
                public final void zza(Object obj9) {
                    int i27 = zzjv.zzd;
                    ((zzbm) obj9).zzd(zzawVar, iIntValue);
                }
            });
        } else {
            z17 = true;
        }
        if (zzlgVar2.zzf != zzlgVar.zzf) {
            this.zzl.zzd(10, new zzdp() { // from class: com.google.android.gms.internal.ads.zzjk
                @Override // com.google.android.gms.internal.ads.zzdp
                public final void zza(Object obj9) {
                    int i27 = zzjv.zzd;
                    ((zzbm) obj9).zzk(zzlgVar.zzf);
                }
            });
            if (zzlgVar.zzf != null) {
                this.zzl.zzd(10, new zzdp() { // from class: com.google.android.gms.internal.ads.zzjl
                    @Override // com.google.android.gms.internal.ads.zzdp
                    public final void zza(Object obj9) {
                        int i27 = zzjv.zzd;
                        ((zzbm) obj9).zzj(zzlgVar.zzf);
                    }
                });
            }
        }
        zzykVar = zzlgVar2.zzi;
        zzykVar2 = zzlgVar.zzi;
        if (zzykVar != zzykVar2) {
            this.zzi.zzp(zzykVar2.zze);
            this.zzl.zzd(2, new zzdp() { // from class: com.google.android.gms.internal.ads.zzjm
                @Override // com.google.android.gms.internal.ads.zzdp
                public final void zza(Object obj9) {
                    int i27 = zzjv.zzd;
                    ((zzbm) obj9).zzq(zzlgVar.zzi.zzd);
                }
            });
        }
        if (!zEquals) {
            final zzba zzbaVar2 = this.zzE;
            this.zzl.zzd(14, new zzdp() { // from class: com.google.android.gms.internal.ads.zzit
                @Override // com.google.android.gms.internal.ads.zzdp
                public final void zza(Object obj9) {
                    int i27 = zzjv.zzd;
                    ((zzbm) obj9).zze(zzbaVar2);
                }
            });
        }
        if (z16) {
            this.zzl.zzd(i12, new zzdp() { // from class: com.google.android.gms.internal.ads.zziu
                @Override // com.google.android.gms.internal.ads.zzdp
                public final void zza(Object obj9) {
                    int i27 = zzjv.zzd;
                    ((zzbm) obj9).zzb(zzlgVar.zzg);
                }
            });
        }
        if (z15) {
            this.zzl.zzd(-1, new zzdp() { // from class: com.google.android.gms.internal.ads.zziv
                @Override // com.google.android.gms.internal.ads.zzdp
                public final void zza(Object obj9) {
                    int i27 = zzjv.zzd;
                    zzlg zzlgVar5 = zzlgVar;
                    ((zzbm) obj9).zzl(zzlgVar5.zzl, zzlgVar5.zze);
                }
            });
        } else {
            this.zzl.zzd(-1, new zzdp() { // from class: com.google.android.gms.internal.ads.zziv
                @Override // com.google.android.gms.internal.ads.zzdp
                public final void zza(Object obj9) {
                    int i27 = zzjv.zzd;
                    zzlg zzlgVar5 = zzlgVar;
                    ((zzbm) obj9).zzl(zzlgVar5.zzl, zzlgVar5.zze);
                }
            });
        }
        if (z15) {
            this.zzl.zzd(4, new zzdp() { // from class: com.google.android.gms.internal.ads.zziw
                @Override // com.google.android.gms.internal.ads.zzdp
                public final void zza(Object obj9) {
                    int i27 = zzjv.zzd;
                    ((zzbm) obj9).zzh(zzlgVar.zze);
                }
            });
        }
        if (z14) {
            this.zzl.zzd(5, new zzdp() { // from class: com.google.android.gms.internal.ads.zzjb
                @Override // com.google.android.gms.internal.ads.zzdp
                public final void zza(Object obj9) {
                    int i27 = zzjv.zzd;
                    zzlg zzlgVar5 = zzlgVar;
                    ((zzbm) obj9).zzf(zzlgVar5.zzl, zzlgVar5.zzm);
                }
            });
        } else {
            this.zzl.zzd(5, new zzdp() { // from class: com.google.android.gms.internal.ads.zzjb
                @Override // com.google.android.gms.internal.ads.zzdp
                public final void zza(Object obj9) {
                    int i27 = zzjv.zzd;
                    zzlg zzlgVar5 = zzlgVar;
                    ((zzbm) obj9).zzf(zzlgVar5.zzl, zzlgVar5.zzm);
                }
            });
        }
        if (zzlgVar2.zzn != zzlgVar.zzn) {
            this.zzl.zzd(6, new zzdp() { // from class: com.google.android.gms.internal.ads.zzjf
                @Override // com.google.android.gms.internal.ads.zzdp
                public final void zza(Object obj9) {
                    int i27 = zzjv.zzd;
                    ((zzbm) obj9).zzi(zzlgVar.zzn);
                }
            });
        }
        if (zzlgVar2.zzi() != zzlgVar.zzi()) {
            this.zzl.zzd(7, new zzdp() { // from class: com.google.android.gms.internal.ads.zzjg
                @Override // com.google.android.gms.internal.ads.zzdp
                public final void zza(Object obj9) {
                    int i27 = zzjv.zzd;
                    ((zzbm) obj9).zzc(zzlgVar.zzi());
                }
            });
        }
        if (!zzlgVar2.zzo.equals(zzlgVar.zzo)) {
            this.zzl.zzd(12, new zzdp() { // from class: com.google.android.gms.internal.ads.zzjh
                @Override // com.google.android.gms.internal.ads.zzdp
                public final void zza(Object obj9) {
                    int i27 = zzjv.zzd;
                    ((zzbm) obj9).zzg(zzlgVar.zzo);
                }
            });
        }
        zzblVar = this.zzD;
        zzbpVar = this.zzg;
        zzbl zzblVar3 = this.zzc;
        int i27 = zzen.zza;
        zZzw = zzbpVar.zzw();
        zziVar = (zzi) zzbpVar;
        zzbvVarZzn2 = zziVar.zzn();
        if (!zzbvVarZzn2.zzo()) {
            zzbpVar2 = zzbpVar;
            if (zzbvVarZzn2.zze(zziVar.zzd(), zziVar.zza, 0L).zzh) {
            }
            zzbvVarZzn3 = zziVar.zzn();
            if (zzbvVarZzn3.zzo()) {
                i16 = -1;
                r13 = 0;
                z19 = false;
            } else {
                int iZzd5 = zziVar.zzd();
                zziVar.zzh();
                zziVar.zzv();
                r13 = 0;
                r13 = 0;
                iZzk = zzbvVarZzn3.zzk(iZzd5, 0, false);
                i16 = -1;
                if (iZzk != -1) {
                    z19 = z17;
                } else {
                    z19 = false;
                }
            }
            Zzn = zziVar.zzn();
            if (Zzn.zzo()) {
                r10 = r13;
            } else {
                iZzd = zziVar.zzd();
                zziVar.zzh();
                zziVar.zzv();
                if (Zzn.zzj(iZzd, r13, r13) != i16) {
                    r10 = z17;
                } else {
                    r10 = r13;
                }
            }
            zzbvVarZzn4 = zziVar.zzn();
            if (!zzbvVarZzn4.zzo()) {
                z20 = zZzw;
                j10 = 0;
                if (zzbvVarZzn4.zze(zziVar.zzd(), zziVar.zza, 0L).zzb()) {
                }
                zzbvVarZzn5 = zziVar.zzn();
                if (zzbvVarZzn5.zzo()) {
                    z21 = false;
                } else {
                    z21 = false;
                }
                zZzo = zzbpVar2.zzn().zzo();
                zzbk zzbkVar5 = new zzbk();
                zzbkVar5.zzb(zzblVar3);
                boolean z213 = !z20;
                zzbkVar5.zzd(4, z213);
                if (z18) {
                    z22 = false;
                } else {
                    z22 = false;
                }
                zzbkVar5.zzd(5, z22);
                if (z19) {
                    z23 = false;
                } else {
                    z23 = false;
                }
                zzbkVar5.zzd(6, z23);
                if (zZzo) {
                    z24 = false;
                } else {
                    z24 = false;
                }
                zzbkVar5.zzd(7, z24);
                if (r10 != 0) {
                    z25 = false;
                } else {
                    z25 = false;
                }
                zzbkVar5.zzd(8, z25);
                if (zZzo) {
                    z26 = false;
                } else {
                    z26 = false;
                }
                zzbkVar5.zzd(9, z26);
                zzbkVar5.zzd(10, z213);
                if (z18) {
                    z27 = false;
                } else {
                    z27 = false;
                }
                zzbkVar5.zzd(11, z27);
                if (z18) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                zzbkVar5.zzd(12, z17);
                zzblVarZze = zzbkVar5.zze();
                this.zzD = zzblVarZze;
                if (!zzblVarZze.equals(zzblVar)) {
                    this.zzl.zzd(13, new zzdp() { // from class: com.google.android.gms.internal.ads.zzje
                        @Override // com.google.android.gms.internal.ads.zzdp
                        public final void zza(Object obj9) {
                            this.zza.zzP((zzbm) obj9);
                        }
                    });
                }
                this.zzl.zzc();
            }
            z20 = zZzw;
            j10 = 0;
            zzbvVarZzn5 = zziVar.zzn();
            if (zzbvVarZzn5.zzo()) {
                z21 = false;
            } else {
                z21 = false;
            }
            zZzo = zzbpVar2.zzn().zzo();
            zzbk zzbkVar6 = new zzbk();
            zzbkVar6.zzb(zzblVar3);
            boolean z214 = !z20;
            zzbkVar6.zzd(4, z214);
            if (z18) {
                z22 = false;
            } else {
                z22 = false;
            }
            zzbkVar6.zzd(5, z22);
            if (z19) {
                z23 = false;
            } else {
                z23 = false;
            }
            zzbkVar6.zzd(6, z23);
            if (zZzo) {
                z24 = false;
            } else {
                z24 = false;
            }
            zzbkVar6.zzd(7, z24);
            if (r10 != 0) {
                z25 = false;
            } else {
                z25 = false;
            }
            zzbkVar6.zzd(8, z25);
            if (zZzo) {
                z26 = false;
            } else {
                z26 = false;
            }
            zzbkVar6.zzd(9, z26);
            zzbkVar6.zzd(10, z214);
            if (z18) {
                z27 = false;
            } else {
                z27 = false;
            }
            zzbkVar6.zzd(11, z27);
            if (z18) {
                z17 = false;
            } else {
                z17 = false;
            }
            zzbkVar6.zzd(12, z17);
            zzblVarZze = zzbkVar6.zze();
            this.zzD = zzblVarZze;
            if (!zzblVarZze.equals(zzblVar)) {
                this.zzl.zzd(13, new zzdp() { // from class: com.google.android.gms.internal.ads.zzje
                    @Override // com.google.android.gms.internal.ads.zzdp
                    public final void zza(Object obj9) {
                        this.zza.zzP((zzbm) obj9);
                    }
                });
            }
            this.zzl.zzc();
        }
        zzbpVar2 = zzbpVar;
        zzbvVarZzn3 = zziVar.zzn();
        if (zzbvVarZzn3.zzo()) {
            i16 = -1;
            r13 = 0;
            z19 = false;
        } else {
            int iZzd6 = zziVar.zzd();
            zziVar.zzh();
            zziVar.zzv();
            r13 = 0;
            r13 = 0;
            iZzk = zzbvVarZzn3.zzk(iZzd6, 0, false);
            i16 = -1;
            if (iZzk != -1) {
                z19 = z17;
            } else {
                z19 = false;
            }
        }
        Zzn = zziVar.zzn();
        if (Zzn.zzo()) {
            r10 = r13;
        } else {
            iZzd = zziVar.zzd();
            zziVar.zzh();
            zziVar.zzv();
            if (Zzn.zzj(iZzd, r13, r13) != i16) {
                r10 = z17;
            } else {
                r10 = r13;
            }
        }
        zzbvVarZzn4 = zziVar.zzn();
        if (!zzbvVarZzn4.zzo()) {
            z20 = zZzw;
            j10 = 0;
            if (zzbvVarZzn4.zze(zziVar.zzd(), zziVar.zza, 0L).zzb()) {
            }
            zzbvVarZzn5 = zziVar.zzn();
            if (zzbvVarZzn5.zzo()) {
                z21 = false;
            } else {
                z21 = false;
            }
            zZzo = zzbpVar2.zzn().zzo();
            zzbk zzbkVar7 = new zzbk();
            zzbkVar7.zzb(zzblVar3);
            boolean z215 = !z20;
            zzbkVar7.zzd(4, z215);
            if (z18) {
                z22 = false;
            } else {
                z22 = false;
            }
            zzbkVar7.zzd(5, z22);
            if (z19) {
                z23 = false;
            } else {
                z23 = false;
            }
            zzbkVar7.zzd(6, z23);
            if (zZzo) {
                z24 = false;
            } else {
                z24 = false;
            }
            zzbkVar7.zzd(7, z24);
            if (r10 != 0) {
                z25 = false;
            } else {
                z25 = false;
            }
            zzbkVar7.zzd(8, z25);
            if (zZzo) {
                z26 = false;
            } else {
                z26 = false;
            }
            zzbkVar7.zzd(9, z26);
            zzbkVar7.zzd(10, z215);
            if (z18) {
                z27 = false;
            } else {
                z27 = false;
            }
            zzbkVar7.zzd(11, z27);
            if (z18) {
                z17 = false;
            } else {
                z17 = false;
            }
            zzbkVar7.zzd(12, z17);
            zzblVarZze = zzbkVar7.zze();
            this.zzD = zzblVarZze;
            if (!zzblVarZze.equals(zzblVar)) {
                this.zzl.zzd(13, new zzdp() { // from class: com.google.android.gms.internal.ads.zzje
                    @Override // com.google.android.gms.internal.ads.zzdp
                    public final void zza(Object obj9) {
                        this.zza.zzP((zzbm) obj9);
                    }
                });
            }
            this.zzl.zzc();
        }
        z20 = zZzw;
        j10 = 0;
        zzbvVarZzn5 = zziVar.zzn();
        if (zzbvVarZzn5.zzo()) {
            z21 = false;
        } else {
            z21 = false;
        }
        zZzo = zzbpVar2.zzn().zzo();
        zzbk zzbkVar8 = new zzbk();
        zzbkVar8.zzb(zzblVar3);
        boolean z216 = !z20;
        zzbkVar8.zzd(4, z216);
        if (z18) {
            z22 = false;
        } else {
            z22 = false;
        }
        zzbkVar8.zzd(5, z22);
        if (z19) {
            z23 = false;
        } else {
            z23 = false;
        }
        zzbkVar8.zzd(6, z23);
        if (zZzo) {
            z24 = false;
        } else {
            z24 = false;
        }
        zzbkVar8.zzd(7, z24);
        if (r10 != 0) {
            z25 = false;
        } else {
            z25 = false;
        }
        zzbkVar8.zzd(8, z25);
        if (zZzo) {
            z26 = false;
        } else {
            z26 = false;
        }
        zzbkVar8.zzd(9, z26);
        zzbkVar8.zzd(10, z216);
        if (z18) {
            z27 = false;
        } else {
            z27 = false;
        }
        zzbkVar8.zzd(11, z27);
        if (z18) {
            z17 = false;
        } else {
            z17 = false;
        }
        zzbkVar8.zzd(12, z17);
        zzblVarZze = zzbkVar8.zze();
        this.zzD = zzblVarZze;
        if (!zzblVarZze.equals(zzblVar)) {
            this.zzl.zzd(13, new zzdp() { // from class: com.google.android.gms.internal.ads.zzje
                @Override // com.google.android.gms.internal.ads.zzdp
                public final void zza(Object obj9) {
                    this.zza.zzP((zzbm) obj9);
                }
            });
        }
        this.zzl.zzc();
    }

    private final void zzah() {
        int iZzf = zzf();
        if (iZzf == 2 || iZzf == 3) {
            zzai();
            boolean z4 = this.zzR.zzp;
            zzu();
            zzu();
        }
    }

    private final void zzai() {
        this.zze.zzb();
        if (Thread.currentThread() != this.zzr.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.zzr.getThread().getName();
            Locale locale = Locale.US;
            String strK = v.k("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.zzN) {
                throw new IllegalStateException(strK);
            }
            zzdt.zzg("ExoPlayerImpl", strK, this.zzO ? null : new IllegalStateException());
            this.zzO = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzir
    public final void zzA(zzlz zzlzVar) {
        zzai();
        this.zzq.zzR(zzlzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzir
    public final void zzB(zzut zzutVar) {
        zzai();
        List listSingletonList = Collections.singletonList(zzutVar);
        zzai();
        zzai();
        zzR(this.zzR);
        zzk();
        this.zzy++;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i = size - 1; i >= 0; i--) {
                this.zzo.remove(i);
            }
            this.zzV = this.zzV.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < listSingletonList.size(); i10++) {
            zzld zzldVar = new zzld((zzut) listSingletonList.get(i10), this.zzp);
            arrayList.add(zzldVar);
            this.zzo.add(i10, new zzjt(zzldVar.zzb, zzldVar.zza));
        }
        this.zzV = this.zzV.zzg(0, arrayList.size());
        zzll zzllVar = new zzll(this.zzo, this.zzV);
        if (!zzllVar.zzo() && zzllVar.zzc() < 0) {
            throw new zzah(zzllVar, -1, -9223372036854775807L);
        }
        int iZzg = zzllVar.zzg(false);
        zzlg zzlgVarZzY = zzY(this.zzR, zzllVar, zzX(zzllVar, iZzg, -9223372036854775807L));
        int i11 = zzlgVarZzY.zze;
        if (iZzg != -1 && i11 != 1) {
            i11 = 4;
            if (!zzllVar.zzo() && iZzg < zzllVar.zzc()) {
                i11 = 2;
            }
        }
        zzlg zzlgVarZze = zzlgVarZzY.zze(i11);
        this.zzk.zzq(arrayList, iZzg, zzen.zzs(-9223372036854775807L), this.zzV);
        zzag(zzlgVarZze, 0, (this.zzR.zzb.zza.equals(zzlgVarZze.zzb.zza) || this.zzR.zza.zzo()) ? false : true, 4, zzU(zzlgVarZze), -1, false);
    }

    public final zzig zzE() {
        zzai();
        return this.zzR.zzf;
    }

    public final /* synthetic */ void zzN(zzke zzkeVar) {
        boolean z4;
        int i = this.zzy - zzkeVar.zzb;
        this.zzy = i;
        boolean z10 = true;
        if (zzkeVar.zzc) {
            this.zzz = zzkeVar.zzd;
            this.zzA = true;
        }
        if (i == 0) {
            zzbv zzbvVar = zzkeVar.zza.zza;
            if (!this.zzR.zza.zzo() && zzbvVar.zzo()) {
                this.zzS = -1;
                this.zzT = 0L;
            }
            if (!zzbvVar.zzo()) {
                List listZzw = ((zzll) zzbvVar).zzw();
                zzdb.zzf(listZzw.size() == this.zzo.size());
                for (int i10 = 0; i10 < listZzw.size(); i10++) {
                    ((zzjt) this.zzo.get(i10)).zzc((zzbv) listZzw.get(i10));
                }
            }
            long j4 = -9223372036854775807L;
            if (this.zzA) {
                if (zzkeVar.zza.zzb.equals(this.zzR.zzb) && zzkeVar.zza.zzd == this.zzR.zzs) {
                    z10 = false;
                }
                if (z10) {
                    if (zzbvVar.zzo() || zzkeVar.zza.zzb.zzb()) {
                        j4 = zzkeVar.zza.zzd;
                    } else {
                        zzlg zzlgVar = zzkeVar.zza;
                        zzur zzurVar = zzlgVar.zzb;
                        long j10 = zzlgVar.zzd;
                        zzW(zzbvVar, zzurVar, j10);
                        j4 = j10;
                    }
                }
                z4 = z10;
            } else {
                z4 = false;
            }
            this.zzA = false;
            zzag(zzkeVar.zza, 1, z4, this.zzz, j4, -1, false);
        }
    }

    public final /* synthetic */ void zzO(final zzke zzkeVar) {
        this.zzj.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzja
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzN(zzkeVar);
            }
        });
    }

    public final /* synthetic */ void zzP(zzbm zzbmVar) {
        zzbmVar.zza(this.zzD);
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final void zza(int i, long j4, int i10, boolean z4) {
        zzai();
        if (i == -1) {
            return;
        }
        zzdb.zzd(i >= 0);
        zzbv zzbvVar = this.zzR.zza;
        if (zzbvVar.zzo() || i < zzbvVar.zzc()) {
            this.zzq.zzu();
            this.zzy++;
            if (zzw()) {
                zzdt.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzke zzkeVar = new zzke(this.zzR);
                zzkeVar.zza(1);
                this.zzU.zza.zzO(zzkeVar);
                return;
            }
            zzlg zzlgVarZze = this.zzR;
            int i11 = zzlgVarZze.zze;
            if (i11 == 3 || (i11 == 4 && !zzbvVar.zzo())) {
                zzlgVarZze = this.zzR.zze(2);
            }
            int iZzd = zzd();
            zzlg zzlgVarZzY = zzY(zzlgVarZze, zzbvVar, zzX(zzbvVar, i, j4));
            this.zzk.zzl(zzbvVar, i, zzen.zzs(j4));
            zzag(zzlgVarZzY, 0, true, 1, zzU(zzlgVarZzY), iZzd, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final int zzb() {
        zzai();
        if (zzw()) {
            return this.zzR.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final int zzc() {
        zzai();
        if (zzw()) {
            return this.zzR.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final int zzd() {
        zzai();
        int iZzR = zzR(this.zzR);
        if (iZzR == -1) {
            return 0;
        }
        return iZzR;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final int zze() {
        zzai();
        if (this.zzR.zza.zzo()) {
            return 0;
        }
        zzlg zzlgVar = this.zzR;
        return zzlgVar.zza.zza(zzlgVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final int zzf() {
        zzai();
        return this.zzR.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final int zzg() {
        zzai();
        return this.zzR.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final int zzh() {
        zzai();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final long zzi() {
        zzai();
        if (zzw()) {
            zzlg zzlgVar = this.zzR;
            return zzlgVar.zzk.equals(zzlgVar.zzb) ? zzen.zzv(this.zzR.zzq) : zzl();
        }
        zzai();
        if (this.zzR.zza.zzo()) {
            return this.zzT;
        }
        zzlg zzlgVar2 = this.zzR;
        long j4 = 0;
        if (zzlgVar2.zzk.zzd != zzlgVar2.zzb.zzd) {
            return zzen.zzv(zzlgVar2.zza.zze(zzd(), this.zza, 0L).zzm);
        }
        long j10 = zzlgVar2.zzq;
        if (this.zzR.zzk.zzb()) {
            zzlg zzlgVar3 = this.zzR;
            zzlgVar3.zza.zzn(zzlgVar3.zzk.zza, this.zzn).zzg(this.zzR.zzk.zzb);
        } else {
            j4 = j10;
        }
        zzlg zzlgVar4 = this.zzR;
        zzW(zzlgVar4.zza, zzlgVar4.zzk, j4);
        return zzen.zzv(j4);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final long zzj() {
        zzai();
        return zzT(this.zzR);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final long zzk() {
        zzai();
        return zzen.zzv(zzU(this.zzR));
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final long zzl() {
        zzai();
        if (zzw()) {
            zzlg zzlgVar = this.zzR;
            zzur zzurVar = zzlgVar.zzb;
            zzlgVar.zza.zzn(zzurVar.zza, this.zzn);
            return zzen.zzv(this.zzn.zzf(zzurVar.zzb, zzurVar.zzc));
        }
        zzbv zzbvVarZzn = zzn();
        if (zzbvVarZzn.zzo()) {
            return -9223372036854775807L;
        }
        return zzen.zzv(zzbvVarZzn.zze(zzd(), this.zza, 0L).zzm);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final long zzm() {
        zzai();
        return zzen.zzv(this.zzR.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final zzbv zzn() {
        zzai();
        return this.zzR.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final zzcd zzo() {
        zzai();
        return this.zzR.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zzp() {
        zzai();
        zzhv zzhvVar = this.zzw;
        boolean zZzu = zzu();
        zzhvVar.zzb(zZzu, 2);
        zzaf(zZzu, 1, zzS(1));
        zzlg zzlgVar = this.zzR;
        if (zzlgVar.zze != 1) {
            return;
        }
        zzlg zzlgVarZzd = zzlgVar.zzd(null);
        zzlg zzlgVarZze = zzlgVarZzd.zze(true == zzlgVarZzd.zza.zzo() ? 4 : 2);
        this.zzy++;
        this.zzk.zzk();
        zzag(zzlgVarZze, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zzq(boolean z4) {
        zzai();
        this.zzw.zzb(z4, zzf());
        zzaf(z4, 1, zzS(1));
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zzr(Surface surface) {
        zzai();
        zzad(surface);
        int i = surface == null ? 0 : -1;
        zzaa(i, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zzs(float f10) {
        zzai();
        final float fMax = Math.max(0.0f, Math.min(f10, 1.0f));
        if (this.zzL == fMax) {
            return;
        }
        this.zzL = fMax;
        zzac();
        zzds zzdsVar = this.zzl;
        zzdsVar.zzd(22, new zzdp() { // from class: com.google.android.gms.internal.ads.zzix
            @Override // com.google.android.gms.internal.ads.zzdp
            public final void zza(Object obj) {
                int i = zzjv.zzd;
                ((zzbm) obj).zzs(fMax);
            }
        });
        zzdsVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zzt() {
        zzai();
        this.zzw.zzb(zzu(), 1);
        zzae(null);
        int i = zzcu.zza;
        zzfzo zzfzoVarZzn = zzfzo.zzn();
        long j4 = this.zzR.zzs;
        zzfzo.zzl(zzfzoVarZzn);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final boolean zzu() {
        zzai();
        return this.zzR.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final boolean zzv() {
        zzai();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final boolean zzw() {
        zzai();
        return this.zzR.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzir
    public final int zzx() {
        zzai();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzir
    public final void zzy(zzlz zzlzVar) {
        this.zzq.zzt(zzlzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzir
    public final void zzz() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzen.zze;
        String strZza = zzax.zza();
        StringBuilder sbE = b.e("Release ", hexString, " [AndroidXMedia3/1.5.0-alpha01] [", str, "] [");
        sbE.append(strZza);
        sbE.append("]");
        zzdt.zze("ExoPlayerImpl", sbE.toString());
        zzai();
        this.zzw.zzd();
        if (!this.zzk.zzp()) {
            zzds zzdsVar = this.zzl;
            zzdsVar.zzd(10, new zzdp() { // from class: com.google.android.gms.internal.ads.zziz
                @Override // com.google.android.gms.internal.ads.zzdp
                public final void zza(Object obj) {
                    ((zzbm) obj).zzj(zzig.zzd(new zzki(1), 1003));
                }
            });
            zzdsVar.zzc();
        }
        this.zzl.zze();
        this.zzj.zze(null);
        this.zzs.zzg(this.zzq);
        zzlg zzlgVar = this.zzR;
        boolean z4 = zzlgVar.zzp;
        zzlg zzlgVarZze = zzlgVar.zze(1);
        this.zzR = zzlgVarZze;
        zzlg zzlgVarZza = zzlgVarZze.zza(zzlgVarZze.zzb);
        this.zzR = zzlgVarZza;
        zzlgVarZza.zzq = zzlgVarZza.zzs;
        this.zzR.zzr = 0L;
        this.zzq.zzQ();
        this.zzi.zzj();
        Surface surface = this.zzG;
        if (surface != null) {
            surface.release();
            this.zzG = null;
        }
        int i = zzcu.zza;
    }
}
