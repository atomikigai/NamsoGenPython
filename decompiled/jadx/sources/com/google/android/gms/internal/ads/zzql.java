package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzql {
    public final zzad zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final zzcj zzi;
    public final boolean zzj = false;
    public final boolean zzk = false;
    public final boolean zzl = false;

    public zzql(zzad zzadVar, int i, int i10, int i11, int i12, int i13, int i14, int i15, zzcj zzcjVar, boolean z4, boolean z10, boolean z11) {
        this.zza = zzadVar;
        this.zzb = i;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = i13;
        this.zzg = i14;
        this.zzh = i15;
        this.zzi = zzcjVar;
    }

    public final AudioTrack zza(zzg zzgVar, int i) throws zzpq {
        AudioTrack audioTrack;
        try {
            if (zzen.zza >= 29) {
                audioTrack = new AudioTrack.Builder().setAudioAttributes(zzgVar.zza().zza).setAudioFormat(zzen.zzx(this.zze, this.zzf, this.zzg)).setTransferMode(1).setBufferSizeInBytes(this.zzh).setSessionId(i).setOffloadedPlayback(this.zzc == 1).build();
            } else {
                audioTrack = new AudioTrack(zzgVar.zza().zza, zzen.zzx(this.zze, this.zzf, this.zzg), this.zzh, 1, i);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new zzpq(state, this.zze, this.zzf, this.zzh, this.zza, zzc(), null);
        } catch (IllegalArgumentException e) {
            e = e;
            throw new zzpq(0, this.zze, this.zzf, this.zzh, this.zza, zzc(), e);
        } catch (UnsupportedOperationException e4) {
            e = e4;
            throw new zzpq(0, this.zze, this.zzf, this.zzh, this.zza, zzc(), e);
        }
    }

    public final zzpo zzb() {
        boolean z4 = this.zzc == 1;
        return new zzpo(this.zzg, this.zze, this.zzf, false, z4, this.zzh);
    }

    public final boolean zzc() {
        return this.zzc == 1;
    }
}
