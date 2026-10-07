package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import d6.p;
import e6.h2;
import e6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfkc implements zzfka {
    private final Context zza;
    private final int zzp;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzq = 2;
    private int zzr = 2;
    private int zze = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzfkq zzj = zzfkq.SCAR_REQUEST_TYPE_UNSPECIFIED;
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private boolean zzn = false;
    private boolean zzo = false;

    public zzfkc(Context context, int i) {
        this.zza = context;
        this.zzp = i;
    }

    public final synchronized zzfkc zzA() {
        p.C.f2983j.getClass();
        this.zzc = SystemClock.elapsedRealtime();
        return this;
    }

    public final synchronized zzfkc zzK(int i) {
        this.zzq = i;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfka
    public final /* bridge */ /* synthetic */ zzfka zza(h2 h2Var) {
        zzr(h2Var);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfka
    public final /* bridge */ /* synthetic */ zzfka zzb(zzffe zzffeVar) {
        zzs(zzffeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfka
    public final /* bridge */ /* synthetic */ zzfka zzc(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfka
    public final /* bridge */ /* synthetic */ zzfka zzd(String str) {
        zzu(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfka
    public final /* bridge */ /* synthetic */ zzfka zze(String str) {
        zzv(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfka
    public final /* bridge */ /* synthetic */ zzfka zzf(zzfkq zzfkqVar) {
        zzw(zzfkqVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfka
    public final /* bridge */ /* synthetic */ zzfka zzg(boolean z4) {
        zzx(z4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfka
    public final /* bridge */ /* synthetic */ zzfka zzh(Throwable th) {
        zzy(th);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfka
    public final /* bridge */ /* synthetic */ zzfka zzi() {
        zzz();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfka
    public final /* bridge */ /* synthetic */ zzfka zzj() {
        zzA();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfka
    public final synchronized boolean zzk() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzfka
    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfka
    public final synchronized zzfke zzm() {
        try {
            zzfkd zzfkdVar = null;
            if (this.zzn) {
                return null;
            }
            this.zzn = true;
            if (!this.zzo) {
                zzz();
            }
            if (this.zzc < 0) {
                zzA();
            }
            return new zzfke(this, zzfkdVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfka
    public final /* bridge */ /* synthetic */ zzfka zzn(int i) {
        zzK(i);
        return this;
    }

    public final synchronized zzfkc zzr(h2 h2Var) {
        try {
            IBinder iBinder = h2Var.e;
            if (iBinder != null) {
                zzcwf zzcwfVar = (zzcwf) iBinder;
                String strZzk = zzcwfVar.zzk();
                if (!TextUtils.isEmpty(strZzk)) {
                    this.zzf = strZzk;
                }
                String strZzi = zzcwfVar.zzi();
                if (!TextUtils.isEmpty(strZzi)) {
                    this.zzg = strZzi;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfkc zzs(zzffe zzffeVar) {
        try {
            if (!TextUtils.isEmpty(zzffeVar.zzb.zzb)) {
                this.zzf = zzffeVar.zzb.zzb;
            }
            for (zzfet zzfetVar : zzffeVar.zza) {
                if (!TextUtils.isEmpty(zzfetVar.zzab)) {
                    this.zzg = zzfetVar.zzab;
                    break;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfkc zzt(String str) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zziu)).booleanValue()) {
            this.zzm = str;
        }
        return this;
    }

    public final synchronized zzfkc zzu(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfkc zzv(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfkc zzw(zzfkq zzfkqVar) {
        this.zzj = zzfkqVar;
        return this;
    }

    public final synchronized zzfkc zzx(boolean z4) {
        this.zzd = z4;
        return this;
    }

    public final synchronized zzfkc zzy(Throwable th) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zziu)).booleanValue()) {
            this.zzl = zzbuj.zzf(th);
            this.zzk = (String) zzfxd.zzb(zzfwf.zzc('\n')).zzc(zzbuj.zze(th)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfkc zzz() {
        Configuration configuration;
        p pVar = p.C;
        this.zze = pVar.e.g(this.zza);
        Resources resources = this.zza.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzr = i;
        pVar.f2983j.getClass();
        this.zzb = SystemClock.elapsedRealtime();
        this.zzo = true;
        return this;
    }
}
