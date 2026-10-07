package com.google.android.gms.internal.ads;

import android.net.Uri;
import d6.p;
import e6.t;
import h6.r0;
import i6.d;
import i6.h;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcea extends zzcdr implements zzcbv {
    public static final /* synthetic */ int zzd = 0;
    private zzcbw zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcdj zzi;
    private long zzj;
    private long zzk;

    public zzcea(zzccf zzccfVar, zzcce zzcceVar) {
        super(zzccfVar);
        zzces zzcesVar = new zzces(zzccfVar.getContext(), zzcceVar, (zzccf) this.zzc.get(), null);
        h.f("ExoPlayerAdapter initialized.");
        this.zze = zzcesVar;
        zzcesVar.zzL(this);
    }

    public static final String zzc(String str) {
        return "cache:".concat(String.valueOf(d.a(str, "MD5")));
    }

    private static String zzd(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzx(long j4) {
        r0.f5068l.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdz
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb();
            }
        }, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final void release() {
        zzcbw zzcbwVar = this.zze;
        if (zzcbwVar != null) {
            zzcbwVar.zzL(null);
            this.zze.zzH();
        }
    }

    public final zzcbw zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzL(null);
        zzcbw zzcbwVar = this.zze;
        this.zze = null;
        return zzcbwVar;
    }

    public final void zzb() {
        t tVar;
        long j4;
        long j10;
        String strZzc = zzc(this.zzf);
        try {
            zzbce zzbceVar = zzbcn.zzH;
            t tVar2 = t.f3437d;
            long jLongValue = ((Long) tVar2.f3440c.zza(zzbceVar)).longValue() * 1000;
            long jIntValue = ((Integer) tVar2.f3440c.zza(zzbcn.zzr)).intValue();
            boolean zBooleanValue = ((Boolean) tVar2.f3440c.zza(zzbcn.zzbW)).booleanValue();
            synchronized (this) {
                p.C.f2983j.getClass();
                if (System.currentTimeMillis() - this.zzj > jLongValue) {
                    throw new IOException("Timeout reached. Limit: " + jLongValue + " ms");
                }
                if (this.zzg) {
                    throw new IOException("Abort requested before buffering finished. ");
                }
                if (!this.zzh) {
                    if (!this.zze.zzV()) {
                        throw new IOException("ExoPlayer was released during preloading.");
                    }
                    long jZzz = this.zze.zzz();
                    if (jZzz > 0) {
                        long jZzv = this.zze.zzv();
                        if (jZzv != this.zzk) {
                            boolean z4 = jZzv > 0;
                            j10 = jZzv;
                            boolean z10 = z4;
                            tVar = tVar2;
                            j4 = jZzz;
                            zzo(this.zzf, strZzc, j10, j4, z10, zBooleanValue ? this.zze.zzA() : -1L, zBooleanValue ? this.zze.zzx() : -1L, zBooleanValue ? this.zze.zzB() : -1L, zzcbw.zzs(), zzcbw.zzu());
                            this.zzk = j10;
                        } else {
                            tVar = tVar2;
                            j4 = jZzz;
                            j10 = jZzv;
                        }
                        if (j10 >= j4) {
                            zzj(this.zzf, strZzc, j4);
                        } else if (this.zze.zzw() >= jIntValue && j10 > 0) {
                        }
                    } else {
                        tVar = tVar2;
                    }
                    zzx(((Long) tVar.f3440c.zza(zzbcn.zzI)).longValue());
                    return;
                }
                p.C.A.zzc(this.zzi);
            }
        } catch (Exception e) {
            h.g("Failed to preload url " + this.zzf + " Exception: " + e.getMessage());
            p.C.f2982g.zzv(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(this.zzf, strZzc, "error", zzd("error", e));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final void zzf() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzg(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzi(final boolean z4, final long j4) {
        final zzccf zzccfVar = (zzccf) this.zzc.get();
        if (zzccfVar != null) {
            zzcaj.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdy
                @Override // java.lang.Runnable
                public final void run() {
                    zzccfVar.zzv(z4, j4);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzk(String str, Exception exc) {
        h.h("Precache error", exc);
        p.C.f2982g.zzv(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzl(String str, Exception exc) {
        h.h("Precache exception", exc);
        p.C.f2982g.zzv(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final void zzp(int i) {
        this.zze.zzJ(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final void zzq(int i) {
        this.zze.zzK(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final void zzr(int i) {
        this.zze.zzM(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final void zzs(int i) {
        this.zze.zzN(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final boolean zzt(String str) {
        return zzu(str, new String[]{str});
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final boolean zzu(String str, String[] strArr) {
        long j4;
        long j10;
        long j11;
        long j12;
        this.zzf = str;
        String strZzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzF(uriArr, this.zzb);
            zzccf zzccfVar = (zzccf) this.zzc.get();
            if (zzccfVar != null) {
                zzccfVar.zzt(strZzc, this);
            }
            p.C.f2983j.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzbce zzbceVar = zzbcn.zzI;
            t tVar = t.f3437d;
            long jLongValue = ((Long) tVar.f3440c.zza(zzbceVar)).longValue();
            long jLongValue2 = ((Long) tVar.f3440c.zza(zzbcn.zzH)).longValue() * 1000;
            long jIntValue = ((Integer) tVar.f3440c.zza(zzbcn.zzr)).intValue();
            boolean zBooleanValue = ((Boolean) tVar.f3440c.zza(zzbcn.zzbW)).booleanValue();
            long j13 = -1;
            while (true) {
                synchronized (this) {
                    if (System.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                        throw new IOException("Timeout reached. Limit: " + jLongValue2 + " ms");
                    }
                    if (this.zzg) {
                        throw new IOException("Abort requested before buffering finished. ");
                    }
                    if (this.zzh) {
                        return true;
                    }
                    if (!this.zze.zzV()) {
                        throw new IOException("ExoPlayer was released during preloading.");
                    }
                    long jZzz = this.zze.zzz();
                    if (jZzz > 0) {
                        long jZzv = this.zze.zzv();
                        if (jZzv != j13) {
                            j12 = jZzv;
                            j10 = jLongValue;
                            j11 = jZzz;
                            zzo(str, strZzc, j12, j11, jZzv > 0, zBooleanValue ? this.zze.zzA() : -1L, zBooleanValue ? this.zze.zzx() : -1L, zBooleanValue ? this.zze.zzB() : -1L, zzcbw.zzs(), zzcbw.zzu());
                            j13 = j12;
                        } else {
                            j10 = jLongValue;
                            j11 = jZzz;
                            j12 = jZzv;
                        }
                        if (j12 >= j11) {
                            zzj(str, strZzc, j11);
                            return true;
                        }
                        if (this.zze.zzw() >= jIntValue && j12 > 0) {
                            return true;
                        }
                        j4 = j10;
                    } else {
                        jLongValue2 = jLongValue2;
                        jIntValue = jIntValue;
                        j4 = jLongValue;
                    }
                    try {
                        wait(j4);
                    } catch (InterruptedException unused) {
                        throw new IOException("Wait interrupted.");
                    }
                }
                jLongValue = j4;
                jIntValue = jIntValue;
                jLongValue2 = jLongValue2;
            }
        } catch (Exception e) {
            h.g("Failed to preload url " + str + " Exception: " + e.getMessage());
            p.C.f2982g.zzv(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, strZzc, "error", zzd("error", e));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzv() {
        h.g("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final boolean zzw(String str, String[] strArr, zzcdj zzcdjVar) {
        this.zzf = str;
        this.zzi = zzcdjVar;
        String strZzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzF(uriArr, this.zzb);
            zzccf zzccfVar = (zzccf) this.zzc.get();
            if (zzccfVar != null) {
                zzccfVar.zzt(strZzc, this);
            }
            p.C.f2983j.getClass();
            this.zzj = System.currentTimeMillis();
            this.zzk = -1L;
            zzx(0L);
            return true;
        } catch (Exception e) {
            h.g("Failed to preload url " + str + " Exception: " + e.getMessage());
            p.C.f2982g.zzv(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, strZzc, "error", zzd("error", e));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzm(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzD(int i, int i10) {
    }
}
