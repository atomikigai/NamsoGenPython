package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzqr implements zzpx {
    final /* synthetic */ zzqw zza;

    public /* synthetic */ zzqr(zzqw zzqwVar, zzqv zzqvVar) {
        this.zza = zzqwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zza(long j4) {
        zzdt.zzf("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j4);
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zzb(long j4) {
        zzqw zzqwVar = this.zza;
        if (zzqwVar.zzo != null) {
            ((zzra) zzqwVar.zzo).zza.zzc.zzv(j4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zzc(long j4, long j10, long j11, long j12) {
        zzqw zzqwVar = this.zza;
        long jZzL = zzqwVar.zzL();
        long jZzM = zzqwVar.zzM();
        StringBuilder sbL = v.l("Spurious audio timestamp (frame position mismatch): ", ", ", j4);
        sbL.append(j10);
        sbL.append(", ");
        sbL.append(j11);
        sbL.append(", ");
        sbL.append(j12);
        sbL.append(", ");
        sbL.append(jZzL);
        sbL.append(", ");
        sbL.append(jZzM);
        zzdt.zzf("DefaultAudioSink", sbL.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zzd(long j4, long j10, long j11, long j12) {
        zzqw zzqwVar = this.zza;
        long jZzL = zzqwVar.zzL();
        long jZzM = zzqwVar.zzM();
        StringBuilder sbL = v.l("Spurious audio timestamp (system clock mismatch): ", ", ", j4);
        sbL.append(j10);
        sbL.append(", ");
        sbL.append(j11);
        sbL.append(", ");
        sbL.append(j12);
        sbL.append(", ");
        sbL.append(jZzL);
        sbL.append(", ");
        sbL.append(jZzM);
        zzdt.zzf("DefaultAudioSink", sbL.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zze(int i, long j4) {
        zzqw zzqwVar = this.zza;
        if (zzqwVar.zzo != null) {
            ((zzra) this.zza.zzo).zza.zzc.zzx(i, j4, SystemClock.elapsedRealtime() - zzqwVar.zzU);
        }
    }
}
