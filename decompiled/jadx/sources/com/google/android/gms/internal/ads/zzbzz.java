package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import d6.p;
import e6.s;
import e6.t;
import h6.k0;
import h6.m0;
import h6.n0;
import i6.h;
import i6.j;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import n7.c;
import qd.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbzz {
    private final Object zza = new Object();
    private final n0 zzb;
    private final zzcad zzc;
    private boolean zzd;
    private Context zze;
    private i6.a zzf;
    private String zzg;
    private zzbcs zzh;
    private Boolean zzi;
    private final AtomicInteger zzj;
    private final AtomicInteger zzk;
    private final zzbzx zzl;
    private final Object zzm;
    private m9.a zzn;
    private final AtomicBoolean zzo;

    public zzbzz() {
        n0 n0Var = new n0();
        this.zzb = n0Var;
        this.zzc = new zzcad(s.f3427f.f3430c, n0Var);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = new AtomicInteger(0);
        this.zzk = new AtomicInteger(0);
        this.zzl = new zzbzx(null);
        this.zzm = new Object();
        this.zzo = new AtomicBoolean();
    }

    public final boolean zzA(Context context) {
        if (c.h()) {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzib)).booleanValue()) {
                return this.zzo.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final int zza() {
        return this.zzk.get();
    }

    public final int zzb() {
        return this.zzj.get();
    }

    public final Context zzd() {
        return this.zze;
    }

    public final Resources zze() {
        if (this.zzf.f5216d) {
            return this.zze.getResources();
        }
        try {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkA)).booleanValue()) {
                return b.K(this.zze).f8209a.getResources();
            }
            b.K(this.zze).f8209a.getResources();
            return null;
        } catch (j e) {
            h.h("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final zzbcs zzg() {
        zzbcs zzbcsVar;
        synchronized (this.zza) {
            zzbcsVar = this.zzh;
        }
        return zzbcsVar;
    }

    public final zzcad zzh() {
        return this.zzc;
    }

    public final m0 zzi() {
        n0 n0Var;
        synchronized (this.zza) {
            n0Var = this.zzb;
        }
        return n0Var;
    }

    public final m9.a zzk() {
        if (this.zze != null) {
            if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzcV)).booleanValue()) {
                synchronized (this.zzm) {
                    try {
                        m9.a aVar = this.zzn;
                        if (aVar != null) {
                            return aVar;
                        }
                        m9.a aVarZzb = zzcaj.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzbzu
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return this.zza.zzo();
                            }
                        });
                        this.zzn = aVarZzb;
                        return aVarZzb;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return zzgei.zzh(new ArrayList());
    }

    public final Boolean zzl() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzi;
        }
        return bool;
    }

    public final String zzn() {
        return this.zzg;
    }

    public final /* synthetic */ ArrayList zzo() throws Exception {
        Context contextZza = zzbwh.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfoF = p7.c.a(contextZza).f(4096, contextZza.getApplicationInfo().packageName);
            if (packageInfoF.requestedPermissions != null && packageInfoF.requestedPermissionsFlags != null) {
                int i = 0;
                while (true) {
                    String[] strArr = packageInfoF.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    if ((packageInfoF.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(strArr[i]);
                    }
                    i++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final void zzq() {
        this.zzl.zza();
    }

    public final void zzr() {
        this.zzj.decrementAndGet();
    }

    public final void zzs() {
        this.zzk.incrementAndGet();
    }

    public final void zzt() {
        this.zzj.incrementAndGet();
    }

    public final void zzu(Context context, i6.a aVar) {
        zzbcs zzbcsVar;
        synchronized (this.zza) {
            try {
                if (!this.zzd) {
                    this.zze = context.getApplicationContext();
                    this.zzf = aVar;
                    p pVar = p.C;
                    pVar.f2981f.zzc(this.zzc);
                    this.zzb.p(this.zze);
                    zzbuj.zzb(this.zze, this.zzf);
                    zzbct zzbctVar = pVar.f2985l;
                    zzbce zzbceVar = zzbcn.zzcd;
                    t tVar = t.f3437d;
                    if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                        zzbcsVar = new zzbcs();
                    } else {
                        k0.k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        zzbcsVar = null;
                    }
                    this.zzh = zzbcsVar;
                    if (zzbcsVar != null) {
                        zzcam.zza(new zzbzv(this).zzb(), "AppState.registerCsiReporter");
                    }
                    Context context2 = this.zze;
                    if (c.h()) {
                        if (((Boolean) tVar.f3440c.zza(zzbcn.zzib)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzbzw(this));
                            } catch (RuntimeException e) {
                                h.h("Failed to register network callback", e);
                                this.zzo.set(true);
                            }
                        }
                    }
                    this.zzd = true;
                    zzk();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        p.C.f2979c.w(context, aVar.f5213a);
    }

    public final void zzv(Throwable th, String str) {
        zzbuj.zzb(this.zze, this.zzf).zzi(th, str, ((Double) zzbew.zzg.zze()).floatValue());
    }

    public final void zzw(Throwable th, String str) {
        zzbuj.zzb(this.zze, this.zzf).zzh(th, str);
    }

    public final void zzx(Throwable th, String str) {
        zzbuj.zzd(this.zze, this.zzf).zzh(th, str);
    }

    public final void zzy(Boolean bool) {
        synchronized (this.zza) {
            this.zzi = bool;
        }
    }

    public final void zzz(String str) {
        this.zzg = str;
    }
}
