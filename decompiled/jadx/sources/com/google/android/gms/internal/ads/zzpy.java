package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzpy {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private boolean zzG;
    private long zzH;
    private zzdc zzI;
    private final zzpx zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private zzpw zze;
    private int zzf;
    private boolean zzg;
    private long zzh;
    private float zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private Method zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzpy(zzpx zzpxVar) {
        this.zza = zzpxVar;
        try {
            this.zzm = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
        this.zzI = zzdc.zza;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    private final long zzl() {
        long jZzb = this.zzI.zzb();
        int i = 2;
        if (this.zzx != -9223372036854775807L) {
            AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.zzz;
            }
            return Math.min(this.zzA, this.zzz + zzen.zzp(zzen.zzq(zzen.zzs(jZzb) - this.zzx, this.zzi), this.zzf));
        }
        if (jZzb - this.zzr >= 5) {
            AudioTrack audioTrack2 = this.zzc;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack2.getPlaybackHeadPosition()) & 4294967295L;
                long j4 = 0;
                if (this.zzg) {
                    if (playState != 2) {
                        i = playState;
                    } else if (playbackHeadPosition == 0) {
                        this.zzu = this.zzs;
                    }
                    playbackHeadPosition += this.zzu;
                    playState = i;
                }
                if (zzen.zza > 29) {
                    if (this.zzs > playbackHeadPosition) {
                        this.zzt++;
                    }
                    this.zzs = playbackHeadPosition;
                } else {
                    if (playbackHeadPosition != 0) {
                        j4 = playbackHeadPosition;
                    } else if (this.zzs > 0 && playState == 3) {
                        if (this.zzy == -9223372036854775807L) {
                            this.zzy = jZzb;
                        }
                    }
                    this.zzy = -9223372036854775807L;
                    playbackHeadPosition = j4;
                    if (this.zzs > playbackHeadPosition) {
                        this.zzt++;
                    }
                    this.zzs = playbackHeadPosition;
                }
            }
            this.zzr = jZzb;
        }
        return this.zzs + this.zzH + (this.zzt << 32);
    }

    private final long zzm() {
        return zzen.zzt(zzl(), this.zzf);
    }

    private final void zzn() {
        this.zzk = 0L;
        this.zzw = 0;
        this.zzv = 0;
        this.zzl = 0L;
        this.zzC = 0L;
        this.zzF = 0L;
        this.zzj = false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075  */
    /* JADX WARN: Code duplicated, block: B:23:0x008b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0094  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c8 A[Catch: Exception -> 0x00ee, TryCatch #0 {Exception -> 0x00ee, blocks: (B:35:0x00c4, B:37:0x00c8, B:39:0x00e5, B:40:0x00ed), top: B:65:0x00c4 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e5 A[Catch: Exception -> 0x00ee, TryCatch #0 {Exception -> 0x00ee, blocks: (B:35:0x00c4, B:37:0x00c8, B:39:0x00e5, B:40:0x00ed), top: B:65:0x00c4 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ed A[Catch: Exception -> 0x00ee, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ee, blocks: (B:35:0x00c4, B:37:0x00c8, B:39:0x00e5, B:40:0x00ed), top: B:65:0x00c4 }] */
    public final long zza(boolean z4) {
        long jZzm;
        zzpw zzpwVar;
        Method method;
        AudioTrack audioTrack;
        long jMax;
        long jZzb;
        long jZza;
        long jZzm2;
        AudioTrack audioTrack2 = this.zzc;
        audioTrack2.getClass();
        if (audioTrack2.getPlayState() == 3) {
            long jZzc = this.zzI.zzc() / 1000;
            if (jZzc - this.zzl >= 30000) {
                long jZzm3 = zzm();
                if (jZzm3 != 0) {
                    this.zzb[this.zzv] = zzen.zzr(jZzm3, this.zzi) - jZzc;
                    this.zzv = (this.zzv + 1) % 10;
                    int i = this.zzw;
                    if (i < 10) {
                        this.zzw = i + 1;
                    }
                    this.zzl = jZzc;
                    this.zzk = 0L;
                    int i10 = 0;
                    while (true) {
                        int i11 = this.zzw;
                        if (i10 >= i11) {
                            break;
                        }
                        this.zzk += this.zzb[i10] / ((long) i11);
                        i10++;
                    }
                    if (!this.zzg) {
                        zzpwVar = this.zze;
                        zzpwVar.getClass();
                        if (zzpwVar.zzg(jZzc)) {
                            jZzb = zzpwVar.zzb();
                            jZza = zzpwVar.zza();
                            jZzm2 = zzm();
                            if (Math.abs(jZzb - jZzc) > 5000000) {
                                this.zza.zzd(jZza, jZzb, jZzc, jZzm2);
                                zzpwVar.zzd();
                            } else if (Math.abs(zzen.zzt(jZza, this.zzf) - jZzm2) > 5000000) {
                                this.zza.zzc(jZza, jZzb, jZzc, jZzm2);
                                zzpwVar.zzd();
                            } else {
                                zzpwVar.zzc();
                            }
                        }
                        if (this.zzp && (method = this.zzm) != null && jZzc - this.zzq >= 500000) {
                            try {
                                audioTrack = this.zzc;
                                if (audioTrack != null) {
                                    throw null;
                                }
                                Integer num = (Integer) method.invoke(audioTrack, null);
                                int i12 = zzen.zza;
                                long jIntValue = (((long) num.intValue()) * 1000) - this.zzh;
                                this.zzn = jIntValue;
                                jMax = Math.max(jIntValue, 0L);
                                this.zzn = jMax;
                                if (jMax > 5000000) {
                                    this.zza.zza(jMax);
                                    this.zzn = 0L;
                                }
                                this.zzq = jZzc;
                            } catch (Exception unused) {
                                this.zzm = null;
                            }
                        }
                    }
                }
            } else if (!this.zzg) {
                zzpwVar = this.zze;
                zzpwVar.getClass();
                if (zzpwVar.zzg(jZzc)) {
                    jZzb = zzpwVar.zzb();
                    jZza = zzpwVar.zza();
                    jZzm2 = zzm();
                    if (Math.abs(jZzb - jZzc) > 5000000) {
                        this.zza.zzd(jZza, jZzb, jZzc, jZzm2);
                        zzpwVar.zzd();
                    } else if (Math.abs(zzen.zzt(jZza, this.zzf) - jZzm2) > 5000000) {
                        this.zza.zzc(jZza, jZzb, jZzc, jZzm2);
                        zzpwVar.zzd();
                    } else {
                        zzpwVar.zzc();
                    }
                }
                if (this.zzp) {
                    audioTrack = this.zzc;
                    if (audioTrack != null) {
                        throw null;
                    }
                    Integer num2 = (Integer) method.invoke(audioTrack, null);
                    int i13 = zzen.zza;
                    long jIntValue2 = (((long) num2.intValue()) * 1000) - this.zzh;
                    this.zzn = jIntValue2;
                    jMax = Math.max(jIntValue2, 0L);
                    this.zzn = jMax;
                    if (jMax > 5000000) {
                        this.zza.zza(jMax);
                        this.zzn = 0L;
                    }
                    this.zzq = jZzc;
                }
            }
        }
        long jZzc2 = this.zzI.zzc() / 1000;
        zzpw zzpwVar2 = this.zze;
        zzpwVar2.getClass();
        boolean zZzf = zzpwVar2.zzf();
        if (zZzf) {
            jZzm = zzen.zzq(jZzc2 - zzpwVar2.zzb(), this.zzi) + zzen.zzt(zzpwVar2.zza(), this.zzf);
        } else {
            jZzm = this.zzw == 0 ? zzm() : zzen.zzq(this.zzk + jZzc2, this.zzi);
            if (!z4) {
                jZzm = Math.max(0L, jZzm - this.zzn);
            }
        }
        if (this.zzD != zZzf) {
            this.zzF = this.zzC;
            this.zzE = this.zzB;
        }
        long j4 = jZzc2 - this.zzF;
        if (j4 < 1000000) {
            long jZzq = zzen.zzq(j4, this.zzi) + this.zzE;
            long j10 = (j4 * 1000) / 1000000;
            jZzm = (((1000 - j10) * jZzq) + (jZzm * j10)) / 1000;
        }
        if (!this.zzj) {
            long j11 = this.zzB;
            if (jZzm > j11) {
                this.zzj = true;
                int i14 = zzen.zza;
                this.zza.zzb(this.zzI.zza() - zzen.zzv(zzen.zzr(zzen.zzv(jZzm - j11), this.zzi)));
            }
        }
        this.zzC = jZzc2;
        this.zzB = jZzm;
        this.zzD = zZzf;
        return jZzm;
    }

    public final void zzb(long j4) {
        this.zzz = zzl();
        this.zzx = zzen.zzs(this.zzI.zzb());
        this.zzA = j4;
    }

    public final void zzc() {
        zzn();
        this.zzc = null;
        this.zze = null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    public final void zzd(AudioTrack audioTrack, boolean z4, int i, int i10, int i11) {
        boolean z10;
        this.zzc = audioTrack;
        this.zzd = i11;
        this.zze = new zzpw(audioTrack);
        this.zzf = audioTrack.getSampleRate();
        if (!z4 || zzen.zza >= 23) {
            z10 = false;
        } else {
            z10 = true;
            if (i != 5) {
                if (i == 6) {
                    i = 6;
                } else {
                    z10 = false;
                }
            }
        }
        this.zzg = z10;
        boolean zZzJ = zzen.zzJ(i);
        this.zzp = zZzJ;
        this.zzh = zZzJ ? zzen.zzt(i11 / i10, this.zzf) : -9223372036854775807L;
        this.zzs = 0L;
        this.zzt = 0L;
        this.zzG = false;
        this.zzH = 0L;
        this.zzu = 0L;
        this.zzo = false;
        this.zzx = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzq = 0L;
        this.zzn = 0L;
        this.zzi = 1.0f;
    }

    public final void zze(zzdc zzdcVar) {
        this.zzI = zzdcVar;
    }

    public final void zzf() {
        if (this.zzx != -9223372036854775807L) {
            this.zzx = zzen.zzs(this.zzI.zzb());
        }
        zzpw zzpwVar = this.zze;
        zzpwVar.getClass();
        zzpwVar.zze();
    }

    public final boolean zzg(long j4) {
        if (j4 > zzen.zzp(zza(false), this.zzf)) {
            return true;
        }
        if (this.zzg) {
            AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && zzl() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzh() {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzi(long j4) {
        return this.zzy != -9223372036854775807L && j4 > 0 && this.zzI.zzb() - this.zzy >= 200;
    }

    public final boolean zzj(long j4) {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.zzg) {
            if (playState == 2) {
                this.zzo = false;
                return false;
            }
            if (playState == 1) {
                if (zzl() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z4 = this.zzo;
        boolean zZzg = zzg(j4);
        this.zzo = zZzg;
        if (z4 && !zZzg && playState != 1) {
            this.zza.zze(this.zzd, zzen.zzv(this.zzh));
        }
        return true;
    }

    public final boolean zzk() {
        zzn();
        if (this.zzx != -9223372036854775807L) {
            this.zzz = zzl();
            return false;
        }
        zzpw zzpwVar = this.zze;
        zzpwVar.getClass();
        zzpwVar.zze();
        return true;
    }
}
