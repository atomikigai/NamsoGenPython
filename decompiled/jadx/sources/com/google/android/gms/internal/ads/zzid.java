package com.google.android.gms.internal.ads;

import da.v;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzid implements zzkl {
    private final zzys zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;
    private final HashMap zzg;
    private long zzh;

    public zzid() {
        zzys zzysVar = new zzys(true, 65536);
        zzk(2500, 0, "bufferForPlaybackMs", "0");
        zzk(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzk(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        zzk(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzk(50000, 50000, "maxBufferMs", "minBufferMs");
        zzk(0, 0, "backBufferDurationMs", "0");
        this.zza = zzysVar;
        this.zzb = zzen.zzs(50000L);
        this.zzc = zzen.zzs(50000L);
        this.zzd = zzen.zzs(2500L);
        this.zze = zzen.zzs(5000L);
        this.zzf = zzen.zzs(0L);
        this.zzg = new HashMap();
        this.zzh = -1L;
    }

    private static void zzk(int i, int i10, String str, String str2) {
        zzdb.zze(i >= i10, v.u(str, " cannot be less than ", str2));
    }

    private final void zzl(zzoj zzojVar) {
        if (this.zzg.remove(zzojVar) != null) {
            zzm();
        }
    }

    private final void zzm() {
        if (this.zzg.isEmpty()) {
            this.zza.zze();
        } else {
            this.zza.zzf(zza());
        }
    }

    public final int zza() {
        Iterator it = this.zzg.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((zzib) it.next()).zzb;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final long zzb(zzoj zzojVar) {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzc(zzoj zzojVar) {
        long id2 = Thread.currentThread().getId();
        long j4 = this.zzh;
        boolean z4 = true;
        if (j4 != -1 && j4 != id2) {
            z4 = false;
        }
        zzdb.zzg(z4, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzh = id2;
        if (!this.zzg.containsKey(zzojVar)) {
            this.zzg.put(zzojVar, new zzib(null));
        }
        zzib zzibVar = (zzib) this.zzg.get(zzojVar);
        zzibVar.getClass();
        zzibVar.zzb = 13107200;
        zzibVar.zza = false;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzd(zzoj zzojVar) {
        zzl(zzojVar);
        if (this.zzg.isEmpty()) {
            this.zzh = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zze(zzoj zzojVar) {
        zzl(zzojVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzf(zzoj zzojVar, zzbv zzbvVar, zzur zzurVar, zzln[] zzlnVarArr, zzwr zzwrVar, zzyd[] zzydVarArr) {
        zzib zzibVar = (zzib) this.zzg.get(zzojVar);
        zzibVar.getClass();
        int i = 0;
        int i10 = 0;
        while (true) {
            int length = zzlnVarArr.length;
            if (i >= 2) {
                zzibVar.zzb = Math.max(13107200, i10);
                zzm();
                return;
            } else {
                if (zzydVarArr[i] != null) {
                    i10 += zzlnVarArr[i].zzb() != 1 ? 131072000 : 13107200;
                }
                i++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final boolean zzg(zzoj zzojVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final boolean zzh(zzkk zzkkVar) {
        zzib zzibVar = (zzib) this.zzg.get(zzkkVar.zza);
        zzibVar.getClass();
        int iZza = this.zza.zza();
        int iZza2 = zza();
        long jMin = this.zzb;
        float f10 = zzkkVar.zzc;
        if (f10 > 1.0f) {
            jMin = Math.min(zzen.zzq(jMin, f10), this.zzc);
        }
        long j4 = zzkkVar.zzb;
        if (j4 < Math.max(jMin, 500000L)) {
            boolean z4 = iZza < iZza2;
            zzibVar.zza = z4;
            if (!z4 && j4 < 500000) {
                zzdt.zzf("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j4 >= this.zzc || iZza >= iZza2) {
            zzibVar.zza = false;
        }
        return zzibVar.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final boolean zzi(zzkk zzkkVar) {
        boolean z4 = zzkkVar.zzd;
        long jZzr = zzen.zzr(zzkkVar.zzb, zzkkVar.zzc);
        long jMin = z4 ? this.zze : this.zzd;
        long j4 = zzkkVar.zze;
        if (j4 != -9223372036854775807L) {
            jMin = Math.min(j4 / 2, jMin);
        }
        return jMin <= 0 || jZzr >= jMin || this.zza.zza() >= zza();
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final zzys zzj() {
        return this.zza;
    }
}
