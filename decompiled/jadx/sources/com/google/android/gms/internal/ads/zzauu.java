package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import e6.t;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzauu implements zzaux {
    private static zzauu zzb;
    private final Context zzc;
    private final zzfre zzd;
    private final zzfrl zze;
    private final zzfrn zzf;
    private final zzavz zzg;
    private final zzfpp zzh;
    private final Executor zzi;
    private final zzfrk zzj;
    private final zzawo zzl;
    private final zzawg zzm;
    private final zzavx zzn;
    private volatile boolean zzp;
    private volatile boolean zzq;
    private final int zzr;
    volatile long zza = 0;
    private final Object zzo = new Object();
    private final CountDownLatch zzk = new CountDownLatch(1);

    public zzauu(Context context, zzfpp zzfppVar, zzfre zzfreVar, zzfrl zzfrlVar, zzfrn zzfrnVar, zzavz zzavzVar, Executor executor, zzfpk zzfpkVar, int i, zzawo zzawoVar, zzawg zzawgVar, zzavx zzavxVar) {
        this.zzq = false;
        this.zzc = context;
        this.zzh = zzfppVar;
        this.zzd = zzfreVar;
        this.zze = zzfrlVar;
        this.zzf = zzfrnVar;
        this.zzg = zzavzVar;
        this.zzi = executor;
        this.zzr = i;
        this.zzl = zzawoVar;
        this.zzm = zzawgVar;
        this.zzn = zzavxVar;
        this.zzq = false;
        this.zzj = new zzaus(this, zzfpkVar);
    }

    public static synchronized zzauu zza(Context context, zzarj zzarjVar, boolean z4) {
        zzfpq zzfpqVarZzc;
        zzfpqVarZzc = zzfpr.zzc();
        zzfpqVarZzc.zza(zzarjVar.zzf());
        zzfpqVarZzc.zzg(zzarjVar.zzi());
        return zzs(context, Executors.newCachedThreadPool(), zzfpqVarZzc.zzh(), z4);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d5 A[Catch: all -> 0x009d, zzgzm -> 0x00a0, TryCatch #0 {zzgzm -> 0x00a0, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:32:0x00a3, B:36:0x00bc, B:42:0x00d5, B:43:0x00e2, B:45:0x00e8, B:47:0x00f0, B:48:0x00f2, B:39:0x00c6, B:40:0x00cd, B:23:0x0074, B:25:0x008a, B:49:0x00fc, B:50:0x0109, B:51:0x0116), top: B:58:0x0021, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fc A[Catch: all -> 0x009d, zzgzm -> 0x00a0, TryCatch #0 {zzgzm -> 0x00a0, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:32:0x00a3, B:36:0x00bc, B:42:0x00d5, B:43:0x00e2, B:45:0x00e8, B:47:0x00f0, B:48:0x00f2, B:39:0x00c6, B:40:0x00cd, B:23:0x0074, B:25:0x008a, B:49:0x00fc, B:50:0x0109, B:51:0x0116), top: B:58:0x0021, outer: #2 }] */
    public static void zzj(zzauu zzauuVar) {
        String str;
        String strZzj;
        int length;
        boolean zZza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfrd zzfrdVarZzu = zzauuVar.zzu(1);
        if (zzfrdVarZzu != null) {
            String strZzk = zzfrdVarZzu.zza().zzk();
            strZzj = zzfrdVarZzu.zza().zzj();
            str = strZzk;
        } else {
            str = null;
            strZzj = null;
        }
        try {
            try {
                zzfri zzfriVarZza = zzfpz.zza(zzauuVar.zzc, 1, zzauuVar.zzr, str, strZzj, "1", zzauuVar.zzh);
                byte[] bArr = zzfriVarZza.zzb;
                if (bArr == null || (length = bArr.length) == 0) {
                    zzauuVar.zzh.zzd(5009, System.currentTimeMillis() - jCurrentTimeMillis);
                } else {
                    try {
                        zzaxy zzaxyVarZzb = zzaxy.zzb(zzgxp.zzv(bArr, 0, length), zzgyh.zza());
                        if (zzaxyVarZzb.zzc().zzk().isEmpty() || zzaxyVarZzb.zzc().zzj().isEmpty() || zzaxyVarZzb.zzd().zzA().length == 0) {
                            zzauuVar.zzh.zzd(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                        } else {
                            zzfrd zzfrdVarZzu2 = zzauuVar.zzu(1);
                            if (zzfrdVarZzu2 != null) {
                                zzayb zzaybVarZza = zzfrdVarZzu2.zza();
                                if (zzaxyVarZzb.zzc().zzk().equals(zzaybVarZza.zzk()) && zzaxyVarZzb.zzc().zzj().equals(zzaybVarZza.zzj())) {
                                    zzauuVar.zzh.zzd(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                                }
                            }
                            zzfrk zzfrkVar = zzauuVar.zzj;
                            int i = zzfriVarZza.zzc;
                            if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzct)).booleanValue()) {
                                zZza = zzauuVar.zzd.zza(zzaxyVarZzb, zzfrkVar);
                            } else if (i == 3) {
                                zZza = zzauuVar.zze.zza(zzaxyVarZzb);
                            } else if (i == 4) {
                                zZza = zzauuVar.zze.zzb(zzaxyVarZzb, zzfrkVar);
                            } else {
                                zzauuVar.zzh.zzd(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                            if (zZza) {
                                zzfrd zzfrdVarZzu3 = zzauuVar.zzu(1);
                                if (zzfrdVarZzu3 != null) {
                                    if (zzauuVar.zzf.zzc(zzfrdVarZzu3)) {
                                        zzauuVar.zzq = true;
                                    }
                                    zzauuVar.zza = System.currentTimeMillis() / 1000;
                                }
                            } else {
                                zzauuVar.zzh.zzd(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                        }
                    } catch (NullPointerException unused) {
                        zzauuVar.zzh.zzd(2030, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }
            } catch (zzgzm e) {
                zzauuVar.zzh.zzc(4002, System.currentTimeMillis() - jCurrentTimeMillis, e);
            }
        } finally {
            zzauuVar.zzk.countDown();
        }
    }

    private static synchronized zzauu zzs(Context context, Executor executor, zzfpr zzfprVar, boolean z4) {
        try {
            if (zzb == null) {
                zzfpp zzfppVarZza = zzfpp.zza(context, executor, z4);
                zzbce zzbceVar = zzbcn.zzdv;
                t tVar = t.f3437d;
                zzavi zzaviVarZzc = ((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() ? zzavi.zzc(context) : null;
                zzawo zzawoVarZzd = ((Boolean) tVar.f3440c.zza(zzbcn.zzdw)).booleanValue() ? zzawo.zzd(context, executor) : null;
                zzawg zzawgVar = ((Boolean) tVar.f3440c.zza(zzbcn.zzcL)).booleanValue() ? new zzawg() : null;
                zzavx zzavxVar = ((Boolean) tVar.f3440c.zza(zzbcn.zzcS)).booleanValue() ? new zzavx() : null;
                zzfqi zzfqiVarZze = zzfqi.zze(context, executor, zzfppVarZza, zzfprVar);
                zzavy zzavyVar = new zzavy(context);
                zzavz zzavzVar = new zzavz(zzfprVar, zzfqiVarZze, new zzawm(context, zzavyVar), zzavyVar, zzaviVarZzc, zzawoVarZzd, zzawgVar, zzavxVar);
                int iZzb = zzfqr.zzb(context, zzfppVarZza);
                zzfpk zzfpkVar = new zzfpk();
                zzauu zzauuVar = new zzauu(context, zzfppVarZza, new zzfre(context, iZzb), new zzfrl(context, iZzb, new zzaur(zzfppVarZza), ((Boolean) tVar.f3440c.zza(zzbcn.zzcv)).booleanValue()), new zzfrn(context, zzavzVar, zzfppVarZza, zzfpkVar), zzavzVar, executor, zzfpkVar, iZzb, zzawoVarZzd, zzawgVar, zzavxVar);
                zzb = zzauuVar;
                zzauuVar.zzm();
                zzb.zzp();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzb;
    }

    private final void zzt() {
        zzawo zzawoVar = this.zzl;
        if (zzawoVar != null) {
            zzawoVar.zzh();
        }
    }

    private final zzfrd zzu(int i) {
        if (zzfqr.zza(this.zzr)) {
            return ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzct)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzc(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zzd(Context context, String str, View view) {
        return zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zze(Context context, String str, View view, Activity activity) {
        zzt();
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzcL)).booleanValue()) {
            this.zzm.zzi();
        }
        zzp();
        zzfps zzfpsVarZza = this.zzf.zza();
        if (zzfpsVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = zzfpsVarZza.zza(context, null, str, view, activity);
        this.zzh.zzf(5000, System.currentTimeMillis() - jCurrentTimeMillis, strZza, null);
        return strZza;
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zzf(Context context) {
        zzt();
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzcL)).booleanValue()) {
            this.zzm.zzj();
        }
        zzp();
        zzfps zzfpsVarZza = this.zzf.zza();
        if (zzfpsVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzc = zzfpsVarZza.zzc(context, null);
        this.zzh.zzf(5001, System.currentTimeMillis() - jCurrentTimeMillis, strZzc, null);
        return strZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zzg(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zzh(Context context, View view, Activity activity) {
        zzt();
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzcL)).booleanValue()) {
            this.zzm.zzk(context, view);
        }
        zzp();
        zzfps zzfpsVarZza = this.zzf.zza();
        if (zzfpsVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzb = zzfpsVarZza.zzb(context, null, view, activity);
        this.zzh.zzf(5002, System.currentTimeMillis() - jCurrentTimeMillis, strZzb, null);
        return strZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final void zzk(MotionEvent motionEvent) {
        zzfps zzfpsVarZza = this.zzf.zza();
        if (zzfpsVarZza != null) {
            try {
                zzfpsVarZza.zzd(null, motionEvent);
            } catch (zzfrm e) {
                this.zzh.zzc(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final void zzl(int i, int i10, int i11) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzlG)).booleanValue() || (displayMetrics = this.zzc.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f10 = i;
        float f11 = displayMetrics.density;
        float f12 = i10;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f10 * f11, f12 * f11, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain);
        motionEventObtain.recycle();
        float f13 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f10 * f13, f12 * f13, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain2);
        motionEventObtain2.recycle();
        float f14 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i11, 1, f10 * f14, f12 * f14, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    public final synchronized void zzm() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfrd zzfrdVarZzu = zzu(1);
        if (zzfrdVarZzu == null) {
            this.zzh.zzd(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.zzf.zzc(zzfrdVarZzu)) {
            this.zzq = true;
            this.zzk.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzavx zzavxVar = this.zzn;
        if (zzavxVar != null) {
            zzavxVar.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final void zzo(View view) {
        this.zzg.zzd(view);
    }

    public final void zzp() {
        if (this.zzp) {
            return;
        }
        synchronized (this.zzo) {
            try {
                if (!this.zzp) {
                    if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                        return;
                    }
                    zzfrd zzfrdVarZzb = this.zzf.zzb();
                    if ((zzfrdVarZzb == null || zzfrdVarZzb.zzd(3600L)) && zzfqr.zza(this.zzr)) {
                        this.zzi.execute(new zzaut(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean zzr() {
        return this.zzq;
    }
}
