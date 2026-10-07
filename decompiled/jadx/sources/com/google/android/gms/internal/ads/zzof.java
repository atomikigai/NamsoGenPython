package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzof implements zzlz, zzog {
    private final Context zza;
    private final zzoh zzb;
    private final PlaybackSession zzc;
    private String zzi;
    private PlaybackMetrics.Builder zzj;
    private int zzk;
    private zzbi zzn;
    private zzoe zzo;
    private zzoe zzp;
    private zzoe zzq;
    private zzad zzr;
    private zzad zzs;
    private zzad zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;
    private final zzbu zze = new zzbu();
    private final zzbt zzf = new zzbt();
    private final HashMap zzh = new HashMap();
    private final HashMap zzg = new HashMap();
    private final long zzd = SystemClock.elapsedRealtime();
    private int zzl = 0;
    private int zzm = 0;

    private zzof(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zzod zzodVar = new zzod(zzod.zza);
        this.zzb = zzodVar;
        zzodVar.zzh(this);
    }

    public static zzof zzb(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new zzof(context, mediaMetricsManager.createPlaybackSession());
    }

    private static int zzr(int i) {
        switch (zzen.zzl(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzs() {
        PlaybackMetrics.Builder builder = this.zzj;
        if (builder != null && this.zzz) {
            builder.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long l2 = (Long) this.zzg.get(this.zzi);
            this.zzj.setNetworkTransferDurationMillis(l2 == null ? 0L : l2.longValue());
            Long l10 = (Long) this.zzh.get(this.zzi);
            this.zzj.setNetworkBytesRead(l10 == null ? 0L : l10.longValue());
            this.zzj.setStreamSource((l10 == null || l10.longValue() <= 0) ? 0 : 1);
            this.zzc.reportPlaybackMetrics(this.zzj.build());
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long j4, zzad zzadVar, int i) {
        if (Objects.equals(this.zzs, zzadVar)) {
            return;
        }
        int i10 = this.zzs == null ? 1 : 0;
        this.zzs = zzadVar;
        zzx(0, j4, zzadVar, i10);
    }

    private final void zzu(long j4, zzad zzadVar, int i) {
        if (Objects.equals(this.zzt, zzadVar)) {
            return;
        }
        int i10 = this.zzt == null ? 1 : 0;
        this.zzt = zzadVar;
        zzx(2, j4, zzadVar, i10);
    }

    private final void zzv(zzbv zzbvVar, zzur zzurVar) {
        int iZza;
        PlaybackMetrics.Builder builder = this.zzj;
        if (zzurVar == null || (iZza = zzbvVar.zza(zzurVar.zza)) == -1) {
            return;
        }
        int i = 0;
        zzbvVar.zzd(iZza, this.zzf, false);
        zzbvVar.zze(this.zzf.zzc, this.zze, 0L);
        zzar zzarVar = this.zze.zzd.zzb;
        if (zzarVar != null) {
            int iZzo = zzen.zzo(zzarVar.zza);
            if (iZzo == 0) {
                i = 3;
            } else if (iZzo != 1) {
                i = iZzo != 2 ? 1 : 4;
            } else {
                i = 5;
            }
        }
        builder.setStreamType(i);
        zzbu zzbuVar = this.zze;
        long j4 = zzbuVar.zzm;
        if (j4 != -9223372036854775807L && !zzbuVar.zzk && !zzbuVar.zzi && !zzbuVar.zzb()) {
            builder.setMediaDurationMillis(zzen.zzv(j4));
        }
        builder.setPlaybackType(true != this.zze.zzb() ? 1 : 2);
        this.zzz = true;
    }

    private final void zzw(long j4, zzad zzadVar, int i) {
        if (Objects.equals(this.zzr, zzadVar)) {
            return;
        }
        int i10 = this.zzr == null ? 1 : 0;
        this.zzr = zzadVar;
        zzx(1, j4, zzadVar, i10);
    }

    private final void zzx(int i, long j4, zzad zzadVar, int i10) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j4 - this.zzd);
        if (zzadVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i10 != 1 ? 1 : 2);
            String str = zzadVar.zzn;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzadVar.zzo;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzadVar.zzk;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i11 = zzadVar.zzj;
            if (i11 != -1) {
                timeSinceCreatedMillis.setBitrate(i11);
            }
            int i12 = zzadVar.zzu;
            if (i12 != -1) {
                timeSinceCreatedMillis.setWidth(i12);
            }
            int i13 = zzadVar.zzv;
            if (i13 != -1) {
                timeSinceCreatedMillis.setHeight(i13);
            }
            int i14 = zzadVar.zzC;
            if (i14 != -1) {
                timeSinceCreatedMillis.setChannelCount(i14);
            }
            int i15 = zzadVar.zzD;
            if (i15 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i15);
            }
            String str4 = zzadVar.zzd;
            if (str4 != null) {
                int i16 = zzen.zza;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = zzadVar.zzw;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        this.zzc.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    private final boolean zzy(zzoe zzoeVar) {
        if (zzoeVar != null) {
            return zzoeVar.zzc.equals(this.zzb.zze());
        }
        return false;
    }

    public final LogSessionId zza() {
        return this.zzc.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzog
    public final void zzc(zzlx zzlxVar, String str) {
        zzur zzurVar = zzlxVar.zzd;
        if (zzurVar == null || !zzurVar.zzb()) {
            zzs();
            this.zzi = str;
            this.zzj = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.5.0-alpha01");
            zzv(zzlxVar.zzb, zzlxVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzog
    public final void zzd(zzlx zzlxVar, String str, boolean z4) {
        zzur zzurVar = zzlxVar.zzd;
        if ((zzurVar == null || !zzurVar.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzf(zzlx zzlxVar, int i, long j4, long j10) {
        zzur zzurVar = zzlxVar.zzd;
        if (zzurVar != null) {
            String strZzf = this.zzb.zzf(zzlxVar.zzb, zzurVar);
            Long l2 = (Long) this.zzh.get(strZzf);
            Long l10 = (Long) this.zzg.get(strZzf);
            this.zzh.put(strZzf, Long.valueOf((l2 == null ? 0L : l2.longValue()) + j4));
            this.zzg.put(strZzf, Long.valueOf((l10 != null ? l10.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzg(zzlx zzlxVar, zzun zzunVar) {
        zzur zzurVar = zzlxVar.zzd;
        if (zzurVar == null) {
            return;
        }
        zzad zzadVar = zzunVar.zzb;
        zzadVar.getClass();
        zzoe zzoeVar = new zzoe(zzadVar, 0, this.zzb.zzf(zzlxVar.zzb, zzurVar));
        int i = zzunVar.zza;
        if (i != 0) {
            if (i == 1) {
                this.zzp = zzoeVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.zzq = zzoeVar;
                return;
            }
        }
        this.zzo = zzoeVar;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0172  */
    /* JADX WARN: Code duplicated, block: B:139:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:142:0x01f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x01fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:147:0x0203  */
    /* JADX WARN: Code duplicated, block: B:148:0x020f  */
    /* JADX WARN: Code duplicated, block: B:150:0x0215  */
    /* JADX WARN: Code duplicated, block: B:151:0x021b  */
    /* JADX WARN: Code duplicated, block: B:153:0x021f  */
    /* JADX WARN: Code duplicated, block: B:154:0x0222  */
    /* JADX WARN: Code duplicated, block: B:156:0x0226  */
    /* JADX WARN: Code duplicated, block: B:157:0x022e  */
    /* JADX WARN: Code duplicated, block: B:159:0x0232  */
    /* JADX WARN: Code duplicated, block: B:160:0x023a  */
    /* JADX WARN: Code duplicated, block: B:162:0x023e  */
    /* JADX WARN: Code duplicated, block: B:163:0x024a  */
    /* JADX WARN: Code duplicated, block: B:173:0x0293  */
    /* JADX WARN: Code duplicated, block: B:175:0x0298  */
    /* JADX WARN: Code duplicated, block: B:177:0x029d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzi(zzbp zzbpVar, zzly zzlyVar) {
        int i;
        int i10;
        int iZzr;
        int i11;
        int errorCode;
        int iZzm;
        zzw zzwVar;
        int i12;
        int i13;
        if (zzlyVar.zzb() == 0) {
            return;
        }
        for (int i14 = 0; i14 < zzlyVar.zzb(); i14++) {
            int iZza = zzlyVar.zza(i14);
            zzlx zzlxVarZzc = zzlyVar.zzc(iZza);
            if (iZza == 0) {
                this.zzb.zzk(zzlxVarZzc);
            } else if (iZza == 11) {
                this.zzb.zzj(zzlxVarZzc, this.zzk);
            } else {
                this.zzb.zzi(zzlxVarZzc);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzlyVar.zzd(0)) {
            zzlx zzlxVarZzc2 = zzlyVar.zzc(0);
            if (this.zzj != null) {
                zzv(zzlxVarZzc2.zzb, zzlxVarZzc2.zzd);
            }
        }
        if (zzlyVar.zzd(2) && this.zzj != null) {
            zzfzo zzfzoVarZza = zzbpVar.zzo().zza();
            int size = zzfzoVarZza.size();
            int i15 = 0;
            loop1: while (true) {
                if (i15 >= size) {
                    zzwVar = null;
                    break;
                }
                zzcc zzccVar = (zzcc) zzfzoVarZza.get(i15);
                int i16 = 0;
                while (true) {
                    i13 = i15 + 1;
                    if (i16 < zzccVar.zza) {
                        if (zzccVar.zzd(i16) && (zzwVar = zzccVar.zzb(i16).zzs) != null) {
                            break loop1;
                        } else {
                            i16++;
                        }
                    }
                }
                i15 = i13;
            }
            if (zzwVar != null) {
                PlaybackMetrics.Builder builder = this.zzj;
                int i17 = zzen.zza;
                int i18 = 0;
                while (true) {
                    if (i18 >= zzwVar.zzb) {
                        i12 = 1;
                        break;
                    }
                    UUID uuid = zzwVar.zza(i18).zza;
                    if (uuid.equals(zzj.zzd)) {
                        i12 = 3;
                        break;
                    } else if (uuid.equals(zzj.zze)) {
                        i12 = 2;
                        break;
                    } else {
                        if (uuid.equals(zzj.zzc)) {
                            i12 = 6;
                            break;
                        }
                        i18++;
                    }
                }
                builder.setDrmType(i12);
            }
        }
        if (zzlyVar.zzd(1011)) {
            this.zzy++;
        }
        zzbi zzbiVar = this.zzn;
        if (zzbiVar != null) {
            Context context = this.zza;
            if (zzbiVar.zza == 1001) {
                i11 = 20;
            } else {
                zzig zzigVar = (zzig) zzbiVar;
                boolean z4 = zzigVar.zzc == 1;
                int i19 = zzigVar.zzg;
                Throwable cause = zzbiVar.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    if (cause instanceof zzgw) {
                        iZzm = ((zzgw) cause).zzc;
                        i11 = 5;
                    } else if ((cause instanceof zzgv) || (cause instanceof zzbh)) {
                        iZzm = 0;
                        i11 = 11;
                    } else {
                        boolean z10 = cause instanceof zzgu;
                        if (z10 || (cause instanceof zzhe)) {
                            if (zzeb.zzb(context).zza() == 1) {
                                iZzm = 0;
                                i11 = 3;
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    iZzm = 0;
                                    i11 = 6;
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    iZzm = 0;
                                    i11 = 7;
                                } else if (z10 && ((zzgu) cause).zzb == 1) {
                                    iZzm = 0;
                                    i11 = 4;
                                } else {
                                    iZzm = 0;
                                    i11 = 8;
                                }
                            }
                        } else if (zzbiVar.zza == 1002) {
                            i11 = 21;
                        } else if (cause instanceof zzri) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                errorCode = zzen.zzm(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                iZzr = zzr(errorCode);
                                int i20 = iZzr;
                                iZzm = errorCode;
                                i11 = i20;
                            } else if (zzen.zza >= 23 && (cause3 instanceof MediaDrmResetException)) {
                                i11 = 27;
                            } else if (cause3 instanceof NotProvisionedException) {
                                i11 = 24;
                            } else if (cause3 instanceof DeniedByServerException) {
                                i11 = 29;
                            } else if (cause3 instanceof zzrs) {
                                iZzm = 0;
                                i11 = 23;
                            } else {
                                i11 = cause3 instanceof zzrh ? 28 : 30;
                            }
                        } else if ((cause instanceof zzgr) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            if ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                i11 = 32;
                            } else {
                                iZzm = 0;
                                i11 = 31;
                            }
                        } else {
                            iZzm = 0;
                            i11 = 9;
                        }
                    }
                } else if (z4) {
                    i11 = 35;
                    if (i19 != 0 && i19 != 1) {
                        if (!z4 && i19 == 3) {
                            i11 = 15;
                        } else if (!z4 && i19 == 2) {
                            iZzm = 0;
                            i11 = 23;
                        } else if (cause instanceof zzsu) {
                            iZzm = zzen.zzm(((zzsu) cause).zzd);
                            i11 = 13;
                        } else {
                            iZzr = 14;
                            if (cause instanceof zzsp) {
                                errorCode = ((zzsp) cause).zzb;
                            } else if (cause instanceof OutOfMemoryError) {
                                i11 = 14;
                            } else if (cause instanceof zzpq) {
                                errorCode = ((zzpq) cause).zza;
                                iZzr = 17;
                            } else if (cause instanceof zzpt) {
                                errorCode = ((zzpt) cause).zza;
                                iZzr = 18;
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                iZzr = zzr(errorCode);
                            } else {
                                i11 = 22;
                            }
                            int i21 = iZzr;
                            iZzm = errorCode;
                            i11 = i21;
                        }
                    }
                } else if (!z4) {
                    if (!z4) {
                    }
                    if (cause instanceof zzsu) {
                        iZzm = zzen.zzm(((zzsu) cause).zzd);
                        i11 = 13;
                    } else {
                        iZzr = 14;
                        if (cause instanceof zzsp) {
                            errorCode = ((zzsp) cause).zzb;
                        } else if (cause instanceof OutOfMemoryError) {
                            i11 = 14;
                        } else if (cause instanceof zzpq) {
                            errorCode = ((zzpq) cause).zza;
                            iZzr = 17;
                        } else if (cause instanceof zzpt) {
                            errorCode = ((zzpt) cause).zza;
                            iZzr = 18;
                        } else if (cause instanceof MediaCodec.CryptoException) {
                            errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            iZzr = zzr(errorCode);
                        } else {
                            i11 = 22;
                        }
                        int i22 = iZzr;
                        iZzm = errorCode;
                        i11 = i22;
                    }
                } else {
                    if (!z4) {
                    }
                    if (cause instanceof zzsu) {
                        iZzm = zzen.zzm(((zzsu) cause).zzd);
                        i11 = 13;
                    } else {
                        iZzr = 14;
                        if (cause instanceof zzsp) {
                            errorCode = ((zzsp) cause).zzb;
                        } else if (cause instanceof OutOfMemoryError) {
                            i11 = 14;
                        } else if (cause instanceof zzpq) {
                            errorCode = ((zzpq) cause).zza;
                            iZzr = 17;
                        } else if (cause instanceof zzpt) {
                            errorCode = ((zzpt) cause).zza;
                            iZzr = 18;
                        } else if (cause instanceof MediaCodec.CryptoException) {
                            errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            iZzr = zzr(errorCode);
                        } else {
                            i11 = 22;
                        }
                        int i23 = iZzr;
                        iZzm = errorCode;
                        i11 = i23;
                    }
                }
                this.zzc.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.zzd).setErrorCode(i11).setSubErrorCode(iZzm).setException(zzbiVar).build());
                this.zzz = true;
                this.zzn = null;
            }
            iZzm = 0;
            this.zzc.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.zzd).setErrorCode(i11).setSubErrorCode(iZzm).setException(zzbiVar).build());
            this.zzz = true;
            this.zzn = null;
        }
        if (zzlyVar.zzd(2)) {
            zzcd zzcdVarZzo = zzbpVar.zzo();
            boolean zZzb = zzcdVarZzo.zzb(2);
            boolean zZzb2 = zzcdVarZzo.zzb(1);
            boolean zZzb3 = zzcdVarZzo.zzb(3);
            if (zZzb || zZzb2) {
                if (!zZzb) {
                    zzw(jElapsedRealtime, null, 0);
                }
                if (!zZzb2) {
                    zzt(jElapsedRealtime, null, 0);
                }
                if (!zZzb3) {
                    zzu(jElapsedRealtime, null, 0);
                }
            } else if (zZzb3) {
                zZzb3 = true;
                if (!zZzb) {
                    zzw(jElapsedRealtime, null, 0);
                }
                if (!zZzb2) {
                    zzt(jElapsedRealtime, null, 0);
                }
                if (!zZzb3) {
                    zzu(jElapsedRealtime, null, 0);
                }
            }
        }
        if (zzy(this.zzo)) {
            zzad zzadVar = this.zzo.zza;
            if (zzadVar.zzv != -1) {
                zzw(jElapsedRealtime, zzadVar, 0);
                this.zzo = null;
            }
        }
        if (zzy(this.zzp)) {
            zzt(jElapsedRealtime, this.zzp.zza, 0);
            this.zzp = null;
        }
        if (zzy(this.zzq)) {
            zzu(jElapsedRealtime, this.zzq.zza, 0);
            this.zzq = null;
        }
        switch (zzeb.zzb(this.zza).zza()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 9;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
            case 8:
            default:
                i = 1;
                break;
            case 7:
                i = 3;
                break;
            case 9:
                i = 8;
                break;
            case 10:
                i = 7;
                break;
        }
        if (i != this.zzm) {
            this.zzm = i;
            this.zzc.reportNetworkEvent(new NetworkEvent.Builder().setNetworkType(i).setTimeSinceCreatedMillis(jElapsedRealtime - this.zzd).build());
        }
        if (zzbpVar.zzf() != 2) {
            this.zzu = false;
        }
        if (((zzlu) zzbpVar).zzC() == null) {
            this.zzv = false;
        } else if (zzlyVar.zzd(10)) {
            this.zzv = true;
        }
        int iZzf = zzbpVar.zzf();
        if (this.zzu) {
            i10 = 5;
        } else if (this.zzv) {
            i10 = 13;
        } else {
            i10 = 4;
            if (iZzf == 4) {
                i10 = 11;
            } else if (iZzf == 2) {
                int i24 = this.zzl;
                if (i24 == 0 || i24 == 2 || i24 == 12) {
                    i10 = 2;
                } else if (zzbpVar.zzu()) {
                    i10 = zzbpVar.zzg() != 0 ? 10 : 6;
                } else {
                    i10 = 7;
                }
            } else if (iZzf != 3) {
                i10 = (iZzf != 1 || this.zzl == 0) ? this.zzl : 12;
            } else if (zzbpVar.zzu()) {
                i10 = zzbpVar.zzg() != 0 ? 9 : 3;
            }
        }
        if (this.zzl != i10) {
            this.zzl = i10;
            this.zzz = true;
            this.zzc.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.zzl).setTimeSinceCreatedMillis(jElapsedRealtime - this.zzd).build());
        }
        if (zzlyVar.zzd(1028)) {
            this.zzb.zzg(zzlyVar.zzc(1028));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzl(zzlx zzlxVar, zzbi zzbiVar) {
        this.zzn = zzbiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzm(zzlx zzlxVar, zzbn zzbnVar, zzbn zzbnVar2, int i) {
        if (i == 1) {
            this.zzu = true;
            i = 1;
        }
        this.zzk = i;
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzo(zzlx zzlxVar, zzhx zzhxVar) {
        this.zzw += zzhxVar.zzg;
        this.zzx += zzhxVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzq(zzlx zzlxVar, zzci zzciVar) {
        zzoe zzoeVar = this.zzo;
        if (zzoeVar != null) {
            zzad zzadVar = zzoeVar.zza;
            if (zzadVar.zzv == -1) {
                zzab zzabVarZzb = zzadVar.zzb();
                zzabVarZzb.zzae(zzciVar.zzb);
                zzabVarZzb.zzJ(zzciVar.zzc);
                this.zzo = new zzoe(zzabVarZzb.zzaf(), 0, zzoeVar.zzc);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final /* synthetic */ void zzk(zzlx zzlxVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final /* synthetic */ void zze(zzlx zzlxVar, zzad zzadVar, zzhy zzhyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final /* synthetic */ void zzh(zzlx zzlxVar, int i, long j4) {
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final /* synthetic */ void zzn(zzlx zzlxVar, Object obj, long j4) {
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final /* synthetic */ void zzp(zzlx zzlxVar, zzad zzadVar, zzhy zzhyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzj(zzlx zzlxVar, zzui zzuiVar, zzun zzunVar, IOException iOException, boolean z4) {
    }
}
