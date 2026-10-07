package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaaa implements zzch {
    private static final Executor zza = new Executor() { // from class: com.google.android.gms.internal.ads.zzzn
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
        }
    };
    private final Context zzb;
    private final zzzy zzc;
    private final zzaap zzd;
    private final zzaau zze;
    private final zzbq zzf;
    private final zzdc zzg;
    private final CopyOnWriteArraySet zzh;
    private zzad zzi;
    private zzaam zzj;
    private zzdm zzk;
    private Pair zzl;
    private int zzm;
    private int zzn;

    public /* synthetic */ zzaaa(zzzp zzzpVar, zzzz zzzzVar) {
        Context context = zzzpVar.zza;
        this.zzb = context;
        zzzy zzzyVar = new zzzy(this, context);
        this.zzc = zzzyVar;
        zzdc zzdcVar = zzzpVar.zze;
        this.zzg = zzdcVar;
        zzaap zzaapVar = zzzpVar.zzb;
        this.zzd = zzaapVar;
        zzaapVar.zzk(zzdcVar);
        this.zze = new zzaau(new zzzq(this, null), zzaapVar);
        zzbq zzbqVar = zzzpVar.zzd;
        zzdb.zzb(zzbqVar);
        this.zzf = zzbqVar;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.zzh = copyOnWriteArraySet;
        this.zzn = 0;
        copyOnWriteArraySet.add(zzzyVar);
    }

    public static /* bridge */ /* synthetic */ zzcg zzd(zzaaa zzaaaVar, zzad zzadVar) throws zzabk {
        zzdb.zzf(zzaaaVar.zzn == 0);
        zzm zzmVarZzw = zzw(zzadVar.zzB);
        if (zzmVarZzw.zzd == 7 && zzen.zza < 34) {
            zzk zzkVarZzc = zzmVarZzw.zzc();
            zzkVarZzc.zzd(6);
            zzmVarZzw = zzkVarZzc.zzg();
        }
        zzm zzmVar = zzmVarZzw;
        zzdc zzdcVar = zzaaaVar.zzg;
        Looper looperMyLooper = Looper.myLooper();
        zzdb.zzb(looperMyLooper);
        final zzdm zzdmVarZzd = zzdcVar.zzd(looperMyLooper, null);
        zzaaaVar.zzk = zzdmVarZzd;
        try {
            zzbq zzbqVar = zzaaaVar.zzf;
            Context context = zzaaaVar.zzb;
            zzp zzpVar = zzp.zza;
            Objects.requireNonNull(zzdmVarZzd);
            zzbqVar.zza(context, zzmVar, zzpVar, zzaaaVar, new Executor() { // from class: com.google.android.gms.internal.ads.zzzm
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    zzdmVarZzd.zzh(runnable);
                }
            }, zzfzo.zzn(), 0L);
            Pair pair = zzaaaVar.zzl;
            if (pair == null) {
                throw null;
            }
            zzee zzeeVar = (zzee) pair.second;
            zzeeVar.zzb();
            zzeeVar.zza();
            throw null;
        } catch (zzce e) {
            throw new zzabk(e, zzadVar);
        }
    }

    public static /* synthetic */ void zzk(zzaaa zzaaaVar) {
        int i = zzaaaVar.zzm - 1;
        zzaaaVar.zzm = i;
        if (i > 0) {
            return;
        }
        if (i < 0) {
            throw new IllegalStateException(String.valueOf(i));
        }
        zzaaaVar.zze.zza();
    }

    public static /* bridge */ /* synthetic */ void zzm(final zzaaa zzaaaVar) {
        if (zzaaaVar.zzn == 1) {
            zzaaaVar.zzm++;
            zzaaaVar.zze.zza();
            zzdm zzdmVar = zzaaaVar.zzk;
            zzdb.zzb(zzdmVar);
            zzdmVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzo
                @Override // java.lang.Runnable
                public final void run() {
                    zzaaa.zzk(this.zza);
                }
            });
        }
    }

    public static /* bridge */ /* synthetic */ void zzo(zzaaa zzaaaVar, long j4, long j10) throws zzig {
        if (zzaaaVar.zzm == 0) {
            zzaaaVar.zze.zzc(j4, j10);
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzu(zzaaa zzaaaVar, long j4) {
        return zzaaaVar.zzm == 0 && zzaaaVar.zze.zze(j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzm zzw(zzm zzmVar) {
        return (zzmVar == null || !zzmVar.zzf()) ? zzm.zza : zzmVar;
    }

    public final zzabl zzh() {
        return this.zzc;
    }

    public final void zzr() {
        zzee zzeeVar = zzee.zza;
        zzeeVar.zzb();
        zzeeVar.zza();
        this.zzl = null;
    }

    public final void zzs() {
        if (this.zzn == 2) {
            return;
        }
        zzdm zzdmVar = this.zzk;
        if (zzdmVar != null) {
            zzdmVar.zze(null);
        }
        this.zzl = null;
        this.zzn = 2;
    }

    public final void zzt(Surface surface, zzee zzeeVar) {
        Pair pair = this.zzl;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzee) this.zzl.second).equals(zzeeVar)) {
            return;
        }
        this.zzl = Pair.create(surface, zzeeVar);
        zzeeVar.zzb();
        zzeeVar.zza();
    }
}
