package com.google.android.gms.internal.ads;

import g6.l;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import x5.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdcd {
    private final Set zza = new HashSet();
    private final Set zzb = new HashSet();
    private final Set zzc = new HashSet();
    private final Set zzd = new HashSet();
    private final Set zze = new HashSet();
    private final Set zzf = new HashSet();
    private final Set zzg = new HashSet();
    private final Set zzh = new HashSet();
    private final Set zzi = new HashSet();
    private final Set zzj = new HashSet();
    private final Set zzk = new HashSet();
    private final Set zzl = new HashSet();
    private final Set zzm = new HashSet();
    private final Set zzn = new HashSet();
    private zzfch zzo;

    public final zzdcd zza(e6.a aVar, Executor executor) {
        this.zzc.add(new zzded(aVar, executor));
        return this;
    }

    public final zzdcd zzb(zzcwp zzcwpVar, Executor executor) {
        this.zzi.add(new zzded(zzcwpVar, executor));
        return this;
    }

    public final zzdcd zzc(zzcxc zzcxcVar, Executor executor) {
        this.zzl.add(new zzded(zzcxcVar, executor));
        return this;
    }

    public final zzdcd zzd(zzcxg zzcxgVar, Executor executor) {
        this.zzf.add(new zzded(zzcxgVar, executor));
        return this;
    }

    public final zzdcd zze(zzcwm zzcwmVar, Executor executor) {
        this.zze.add(new zzded(zzcwmVar, executor));
        return this;
    }

    public final zzdcd zzf(zzcya zzcyaVar, Executor executor) {
        this.zzh.add(new zzded(zzcyaVar, executor));
        return this;
    }

    public final zzdcd zzg(zzcyl zzcylVar, Executor executor) {
        this.zzg.add(new zzded(zzcylVar, executor));
        return this;
    }

    public final zzdcd zzh(l lVar, Executor executor) {
        this.zzn.add(new zzded(lVar, executor));
        return this;
    }

    public final zzdcd zzi(zzcyx zzcyxVar, Executor executor) {
        this.zzm.add(new zzded(zzcyxVar, executor));
        return this;
    }

    public final zzdcd zzj(zzczj zzczjVar, Executor executor) {
        this.zzb.add(new zzded(zzczjVar, executor));
        return this;
    }

    public final zzdcd zzk(e eVar, Executor executor) {
        this.zzk.add(new zzded(eVar, executor));
        return this;
    }

    public final zzdcd zzl(zzdel zzdelVar, Executor executor) {
        this.zzd.add(new zzded(zzdelVar, executor));
        return this;
    }

    public final zzdcd zzm(zzfch zzfchVar) {
        this.zzo = zzfchVar;
        return this;
    }

    public final zzdcf zzn() {
        return new zzdcf(this, null);
    }
}
