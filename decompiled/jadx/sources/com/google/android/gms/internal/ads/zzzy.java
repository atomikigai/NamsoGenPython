package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzzy implements zzabl, zzzr {
    final /* synthetic */ zzaaa zza;
    private final int zzb;
    private final ArrayList zzc;
    private final zzaan zzd;
    private zzad zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private long zzn;
    private zzabi zzo;
    private Executor zzp;

    public zzzy(zzaaa zzaaaVar, Context context) {
        this.zza = zzaaaVar;
        this.zzb = true != zzen.zzK(context) ? 5 : 1;
        this.zzc = new ArrayList();
        this.zzd = new zzaan();
        this.zzk = -9223372036854775807L;
        this.zzo = zzabi.zzb;
        this.zzp = zzaaa.zza;
    }

    private final void zzz() {
        if (this.zze == null) {
            return;
        }
        new ArrayList(this.zzc);
        zzad zzadVar = this.zze;
        zzadVar.getClass();
        zzdb.zzb(null);
        zzm zzmVar = zzadVar.zzB;
        zzae zzaeVar = new zzae(zzaaa.zzw(zzmVar), zzadVar.zzu, zzadVar.zzv);
        zzaeVar.zza(zzadVar.zzy);
        zzaeVar.zzb();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzzr
    public final void zza(zzaaa zzaaaVar) {
        final zzabi zzabiVar = this.zzo;
        this.zzp.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzx
            @Override // java.lang.Runnable
            public final void run() {
                zzabiVar.zza(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzzr
    public final void zzb(zzaaa zzaaaVar) {
        final zzabi zzabiVar = this.zzo;
        this.zzp.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzw
            @Override // java.lang.Runnable
            public final void run() {
                zzabiVar.zzb(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzzr
    public final void zzc(zzaaa zzaaaVar, final zzci zzciVar) {
        final zzabi zzabiVar = this.zzo;
        this.zzp.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzv
            @Override // java.lang.Runnable
            public final void run() {
                zzabiVar.zzc(this.zza, zzciVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final Surface zzd() {
        zzdb.zzf(false);
        zzdb.zzb(null);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zze() {
        this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzf() {
        this.zza.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzg(boolean z4) {
        this.zzl = false;
        this.zzk = -9223372036854775807L;
        zzaaa.zzm(this.zza);
        if (z4) {
            this.zza.zzd.zzi();
        }
        this.zzn = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzh(zzad zzadVar) throws zzabk {
        zzaaa.zzd(this.zza, zzadVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzi(boolean z4) {
        this.zza.zzd.zzc(z4);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzj(int i, zzad zzadVar) {
        zzdb.zzf(false);
        this.zza.zzd.zzl(zzadVar.zzw);
        this.zze = zzadVar;
        if (this.zzl) {
            zzdb.zzf(this.zzk != -9223372036854775807L);
            this.zzm = true;
            this.zzn = this.zzk;
        } else {
            zzz();
            this.zzl = true;
            this.zzm = false;
            this.zzn = -9223372036854775807L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzk() {
        this.zza.zzd.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzl(boolean z4) {
        this.zza.zzd.zze(z4);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzm() {
        this.zza.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzn() {
        this.zza.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzo() {
        this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzp(long j4, long j10) throws zzabk {
        try {
            zzaaa.zzo(this.zza, j4, j10);
        } catch (zzig e) {
            zzad zzadVarZzaf = this.zze;
            if (zzadVarZzaf == null) {
                zzadVarZzaf = new zzab().zzaf();
            }
            throw new zzabk(e, zzadVarZzaf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzq(int i) {
        this.zza.zzd.zzj(i);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzr(zzabi zzabiVar, Executor executor) {
        this.zzo = zzabiVar;
        this.zzp = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzs(Surface surface, zzee zzeeVar) {
        this.zza.zzt(surface, zzeeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzt(float f10) {
        this.zza.zze.zzd(f10);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzu(long j4, long j10, long j11, long j12) {
        boolean z4 = this.zzj;
        boolean z10 = true;
        if (this.zzg == j10 && this.zzh == j11) {
            z10 = false;
        }
        this.zzj = z4 | z10;
        this.zzf = j4;
        this.zzg = j10;
        this.zzh = j11;
        this.zzi = j12;
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzv(List list) {
        if (this.zzc.equals(list)) {
            return;
        }
        this.zzc.clear();
        this.zzc.addAll(list);
        zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzw(zzaam zzaamVar) {
        this.zza.zzj = zzaamVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final boolean zzx(long j4, boolean z4, long j10, long j11, zzabj zzabjVar) throws zzabk {
        zzdb.zzf(false);
        long j12 = j4 - this.zzh;
        try {
            if (this.zza.zzd.zza(j12, j10, j11, this.zzf, z4, this.zzd) != 4) {
                if (j12 < this.zzi && !z4) {
                    zzaaf zzaafVar = (zzaaf) zzabjVar;
                    zzaafVar.zzd.zzaQ(zzaafVar.zza, zzaafVar.zzb, zzaafVar.zzc);
                    return true;
                }
                zzp(j10, j11);
                if (this.zzm) {
                    long j13 = this.zzn;
                    if (j13 == -9223372036854775807L || zzaaa.zzu(this.zza, j13)) {
                        zzz();
                        this.zzm = false;
                        this.zzn = -9223372036854775807L;
                    }
                }
                zzdb.zzb(null);
                throw null;
            }
            return false;
        } catch (zzig e) {
            zzad zzadVar = this.zze;
            zzdb.zzb(zzadVar);
            throw new zzabk(e, zzadVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final boolean zzy(boolean z4) {
        return this.zza.zze.zzf(false);
    }
}
