package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import d6.p;
import e6.t;
import g7.f;
import h6.r0;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfko implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final i6.a zzf;
    private int zzi;
    private final zzdqa zzj;
    private final List zzk;
    private final zzbwf zzm;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzfkt zzg = zzfkx.zzb();
    private String zzh = "";
    private boolean zzl = false;

    public zzfko(Context context, i6.a aVar, zzdqa zzdqaVar, zzebv zzebvVar, zzbwf zzbwfVar) {
        this.zze = context;
        this.zzf = aVar;
        this.zzj = zzdqaVar;
        this.zzm = zzbwfVar;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zziv)).booleanValue()) {
            this.zzk = r0.x();
        } else {
            this.zzk = zzfzo.zzn();
        }
    }

    public static boolean zza() {
        boolean zBooleanValue;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    if (((Boolean) zzbeg.zzb.zze()).booleanValue()) {
                        zzb = Boolean.valueOf(Math.random() < ((Double) zzbeg.zza.zze()).doubleValue());
                    } else {
                        zzb = Boolean.FALSE;
                    }
                }
                zBooleanValue = zzb.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrZzaV;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                try {
                    if (this.zzg.zza() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            bArrZzaV = ((zzfkx) this.zzg.zzbr()).zzaV();
                            this.zzg.zzc();
                        }
                        new zzebu(this.zze, this.zzf.f5213a, this.zzm, Binder.getCallingUid()).zza(new zzebs((String) t.f3437d.f3440c.zza(zzbcn.zzip), 60000, new HashMap(), bArrZzaV, "application/x-protobuf", false));
                    } catch (Exception e) {
                        if ((e instanceof zzdwn) && ((zzdwn) e).zza() == 3) {
                            return;
                        }
                        p.C.f2982g.zzv(e, "CuiMonitor.sendCuiPing");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void zzb(final zzfke zzfkeVar) {
        zzcaj.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfkn
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(zzfkeVar);
            }
        });
    }

    public final void zzc(zzfke zzfkeVar) {
        synchronized (zzd) {
            try {
                if (!this.zzl) {
                    this.zzl = true;
                    if (zza()) {
                        try {
                            r0 r0Var = p.C.f2979c;
                            this.zzh = r0.E(this.zze);
                        } catch (RemoteException | RuntimeException e) {
                            p.C.f2982g.zzw(e, "CuiMonitor.gettingAppIdFromManifest");
                        }
                        f fVar = f.f4241b;
                        Context context = this.zze;
                        fVar.getClass();
                        this.zzi = f.a(context);
                        zzbce zzbceVar = zzbcn.zziq;
                        t tVar = t.f3437d;
                        int iIntValue = ((Integer) tVar.f3440c.zza(zzbceVar)).intValue();
                        if (((Boolean) tVar.f3440c.zza(zzbcn.zzlB)).booleanValue()) {
                            long j4 = iIntValue;
                            zzcaj.zzd.scheduleWithFixedDelay(this, j4, j4, TimeUnit.MILLISECONDS);
                        } else {
                            long j10 = iIntValue;
                            zzcaj.zzd.scheduleAtFixedRate(this, j10, j10, TimeUnit.MILLISECONDS);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zza() && zzfkeVar != null) {
            synchronized (zzc) {
                try {
                    int iZza = this.zzg.zza();
                    zzbce zzbceVar2 = zzbcn.zzir;
                    t tVar2 = t.f3437d;
                    if (iZza >= ((Integer) tVar2.f3440c.zza(zzbceVar2)).intValue()) {
                        return;
                    }
                    zzfkp zzfkpVarZza = zzfks.zza();
                    zzfkpVarZza.zzu(zzfkeVar.zzm());
                    zzfkpVarZza.zzq(zzfkeVar.zzl());
                    zzfkpVarZza.zzg(zzfkeVar.zzb());
                    zzfkpVarZza.zzw(3);
                    zzfkpVarZza.zzn(this.zzf.f5213a);
                    zzfkpVarZza.zzb(this.zzh);
                    zzfkpVarZza.zzk(Build.VERSION.RELEASE);
                    zzfkpVarZza.zzr(Build.VERSION.SDK_INT);
                    zzfkpVarZza.zzv(zzfkeVar.zzo());
                    zzfkpVarZza.zzj(zzfkeVar.zza());
                    zzfkpVarZza.zze(this.zzi);
                    zzfkpVarZza.zzt(zzfkeVar.zzn());
                    zzfkpVarZza.zzc(zzfkeVar.zze());
                    zzfkpVarZza.zzf(zzfkeVar.zzg());
                    zzfkpVarZza.zzh(zzfkeVar.zzh());
                    zzfkpVarZza.zzi(this.zzj.zzb(zzfkeVar.zzh()));
                    zzfkpVarZza.zzl(zzfkeVar.zzi());
                    zzfkpVarZza.zzm(zzfkeVar.zzd());
                    zzfkpVarZza.zzd(zzfkeVar.zzf());
                    zzfkpVarZza.zzs(zzfkeVar.zzk());
                    zzfkpVarZza.zzo(zzfkeVar.zzj());
                    zzfkpVarZza.zzp(zzfkeVar.zzc());
                    if (((Boolean) tVar2.f3440c.zza(zzbcn.zziv)).booleanValue()) {
                        zzfkpVarZza.zza(this.zzk);
                    }
                    zzfkt zzfktVar = this.zzg;
                    zzfku zzfkuVarZza = zzfkv.zza();
                    zzfkuVarZza.zza(zzfkpVarZza);
                    zzfktVar.zzb(zzfkuVarZza);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
