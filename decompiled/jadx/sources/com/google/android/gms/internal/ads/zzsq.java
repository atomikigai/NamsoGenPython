package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import da.v;
import java.util.Objects;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzsq {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    private final boolean zzi;

    public zzsq(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z4, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z4;
        this.zze = z12;
        this.zzf = z14;
        this.zzh = z15;
        this.zzi = zzbg.zzi(str2);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    public static zzsq zzc(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z4, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        if (codecCapabilities == null || !codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z14 = false;
        } else {
            if (zzen.zza <= 22) {
                String str4 = zzen.zzd;
                if (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                    z14 = false;
                }
            }
            z14 = true;
        }
        return new zzsq(str, str2, str3, codecCapabilities, z4, z10, z11, z14, codecCapabilities != null && codecCapabilities.isFeatureSupported("tunneled-playback"), z13 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback")), zzen.zza >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface"));
    }

    private static Point zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i10) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i11 = zzen.zza;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i10 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void zzj(String str) {
        String str2 = zzen.zze;
        StringBuilder sbN = q1.a.n("NoSupport [", str, "] [");
        sbN.append(this.zza);
        sbN.append(", ");
        sbN.append(this.zzb);
        sbN.append("] [");
        sbN.append(str2);
        sbN.append("]");
        zzdt.zzb("MediaCodecInfo", sbN.toString());
    }

    private static boolean zzk(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i10, double d10) {
        Point pointZzi = zzi(videoCapabilities, i, i10);
        int i11 = pointZzi.x;
        int i12 = pointZzi.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i11, i12) : videoCapabilities.areSizeAndRateSupported(i11, i12, Math.floor(d10));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00da  */
    /* JADX WARN: Code duplicated, block: B:59:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:75:0x010c  */
    private final boolean zzl(zzad zzadVar, boolean z4) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzh;
        int i;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        int iIntValue;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i10 = zztl.zza;
        Pair pairZza = zzdd.zza(zzadVar);
        String str = zzadVar.zzo;
        if (str != null && str.equals("video/mv-hevc") && this.zzc.equals("video/hevc")) {
            String strZzg = zzfp.zzg(zzadVar.zzr);
            if (strZzg == null) {
                pairZza = null;
            } else {
                String strTrim = strZzg.trim();
                int i11 = zzen.zza;
                pairZza = zzdd.zzb(strZzg, strTrim.split("\\.", -1), zzadVar.zzB);
            }
        }
        if (pairZza != null) {
            int iIntValue2 = ((Integer) pairZza.first).intValue();
            int iIntValue3 = ((Integer) pairZza.second).intValue();
            int i12 = 8;
            if ("video/dolby-vision".equals(zzadVar.zzo)) {
                if ("video/avc".equals(this.zzb)) {
                    iIntValue2 = 8;
                } else if ("video/hevc".equals(this.zzb)) {
                    iIntValue2 = 2;
                }
                iIntValue3 = 0;
            }
            if (this.zzi) {
                codecProfileLevelArrZzh = zzh();
                if (zzen.zza <= 23 && "video/x-vnd.on2.vp9".equals(this.zzb) && codecProfileLevelArrZzh.length == 0) {
                    codecCapabilities = this.zzd;
                    if (codecCapabilities != null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        iIntValue = 0;
                    } else {
                        iIntValue = ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    }
                    if (iIntValue >= 180000000) {
                        i12 = 1024;
                    } else if (iIntValue >= 120000000) {
                        i12 = 512;
                    } else if (iIntValue >= 60000000) {
                        i12 = 256;
                    } else if (iIntValue >= 30000000) {
                        i12 = 128;
                    } else if (iIntValue >= 18000000) {
                        i12 = 64;
                    } else if (iIntValue >= 12000000) {
                        i12 = 32;
                    } else if (iIntValue >= 7200000) {
                        i12 = 16;
                    } else if (iIntValue < 3600000) {
                        if (iIntValue >= 1800000) {
                            i12 = 4;
                        } else if (iIntValue >= 800000) {
                            i12 = 2;
                        } else {
                            i12 = 1;
                        }
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i12;
                    codecProfileLevelArrZzh = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArrZzh) {
                    if (codecProfileLevel2.profile != iIntValue2 && (codecProfileLevel2.level >= iIntValue3 || !z4)) {
                        if ("video/hevc".equals(this.zzb) && iIntValue2 == 2) {
                            String str2 = zzen.zzb;
                            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                            }
                        }
                    }
                }
                zzj(v.j("codec.profileLevel, ", zzadVar.zzk, ", ", this.zzc));
                return false;
            }
            if (iIntValue2 == 42) {
                iIntValue2 = 42;
                codecProfileLevelArrZzh = zzh();
                if (zzen.zza <= 23) {
                    codecCapabilities = this.zzd;
                    if (codecCapabilities != null) {
                        iIntValue = 0;
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue >= 180000000) {
                        i12 = 1024;
                    } else if (iIntValue >= 120000000) {
                        i12 = 512;
                    } else if (iIntValue >= 60000000) {
                        i12 = 256;
                    } else if (iIntValue >= 30000000) {
                        i12 = 128;
                    } else if (iIntValue >= 18000000) {
                        i12 = 64;
                    } else if (iIntValue >= 12000000) {
                        i12 = 32;
                    } else if (iIntValue >= 7200000) {
                        i12 = 16;
                    } else if (iIntValue < 3600000) {
                        if (iIntValue >= 1800000) {
                            i12 = 4;
                        } else if (iIntValue >= 800000) {
                            i12 = 2;
                        } else {
                            i12 = 1;
                        }
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel3 = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel3.profile = 1;
                    codecProfileLevel3.level = i12;
                    codecProfileLevelArrZzh = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel3};
                }
                while (i < r5) {
                    if (codecProfileLevel2.profile != iIntValue2) {
                    }
                }
                zzj(v.j("codec.profileLevel, ", zzadVar.zzk, ", ", this.zzc));
                return false;
            }
        }
        return true;
    }

    private final boolean zzm(zzad zzadVar) {
        return this.zzb.equals(zzadVar.zzo) || this.zzb.equals(zztl.zzb(zzadVar));
    }

    public final String toString() {
        return this.zza;
    }

    public final Point zza(int i, int i10) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzi(videoCapabilities, i, i10);
    }

    public final zzhy zzb(zzad zzadVar, zzad zzadVar2) {
        zzad zzadVar3;
        zzad zzadVar4;
        int i = true != Objects.equals(zzadVar.zzo, zzadVar2.zzo) ? 8 : 0;
        if (this.zzi) {
            if (zzadVar.zzx != zzadVar2.zzx) {
                i |= 1024;
            }
            if (!this.zze && (zzadVar.zzu != zzadVar2.zzu || zzadVar.zzv != zzadVar2.zzv)) {
                i |= 512;
            }
            if ((!zzm.zzg(zzadVar.zzB) || !zzm.zzg(zzadVar2.zzB)) && !Objects.equals(zzadVar.zzB, zzadVar2.zzB)) {
                i |= 2048;
            }
            String str = this.zza;
            if (zzen.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzadVar.zzd(zzadVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzhy(this.zza, zzadVar, zzadVar2, true != zzadVar.zzd(zzadVar2) ? 2 : 3, 0);
            }
            zzadVar3 = zzadVar;
            zzadVar4 = zzadVar2;
        } else {
            zzadVar3 = zzadVar;
            zzadVar4 = zzadVar2;
            if (zzadVar3.zzC != zzadVar4.zzC) {
                i |= 4096;
            }
            if (zzadVar3.zzD != zzadVar4.zzD) {
                i |= 8192;
            }
            if (zzadVar3.zzE != zzadVar4.zzE) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                int i10 = zztl.zza;
                Pair pairZza = zzdd.zza(zzadVar3);
                Pair pairZza2 = zzdd.zza(zzadVar4);
                if (pairZza != null && pairZza2 != null) {
                    int iIntValue = ((Integer) pairZza.first).intValue();
                    int iIntValue2 = ((Integer) pairZza2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new zzhy(this.zza, zzadVar3, zzadVar4, 3, 0);
                    }
                }
            }
            if (!zzadVar3.zzd(zzadVar4)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzhy(this.zza, zzadVar3, zzadVar4, 1, 0);
            }
        }
        return new zzhy(this.zza, zzadVar3, zzadVar4, 0, i);
    }

    public final boolean zzd(zzad zzadVar) {
        return zzm(zzadVar) && zzl(zzadVar, false);
    }

    public final boolean zze(zzad zzadVar) throws zztf {
        int i;
        int i10;
        if (!zzm(zzadVar) || !zzl(zzadVar, true)) {
            return false;
        }
        if (this.zzi) {
            int i11 = zzadVar.zzu;
            if (i11 <= 0 || (i10 = zzadVar.zzv) <= 0) {
                return true;
            }
            return zzg(i11, i10, zzadVar.zzw);
        }
        int i12 = zzadVar.zzD;
        if (i12 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                zzj("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                zzj("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i12)) {
                zzj(v.f(i12, "sampleRate.support, "));
                return false;
            }
        }
        int i13 = zzadVar.zzC;
        if (i13 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
            if (codecCapabilities2 == null) {
                zzj("channelCount.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                zzj("channelCount.aCaps");
                return false;
            }
            String str = this.zza;
            String str2 = this.zzb;
            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
            if (maxInputChannelCount <= 1 && ((zzen.zza < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                if ("audio/ac3".equals(str2)) {
                    i = 6;
                } else {
                    i = "audio/eac3".equals(str2) ? 16 : 30;
                }
                zzdt.zzf("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i + "]");
                maxInputChannelCount = i;
            }
            if (maxInputChannelCount < i13) {
                zzj(v.f(i13, "channelCount.support, "));
                return false;
            }
        }
        return true;
    }

    public final boolean zzf(zzad zzadVar) {
        if (this.zzi) {
            return this.zze;
        }
        int i = zztl.zza;
        Pair pairZza = zzdd.zza(zzadVar);
        return pairZza != null && ((Integer) pairZza.first).intValue() == 42;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    public final boolean zzg(int i, int i10, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzj("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzj("sizeAndRate.vCaps");
            return false;
        }
        if (zzen.zza >= 29) {
            int iZza = zzss.zza(videoCapabilities, i, i10, d10);
            if (iZza != 2) {
                if (iZza == 1) {
                    StringBuilder sbD = b.d(i, i10, "sizeAndRate.cover, ", "x", "@");
                    sbD.append(d10);
                    zzj(sbD.toString());
                    return false;
                }
                if (!zzk(videoCapabilities, i, i10, d10)) {
                    if (i < i10) {
                    }
                    StringBuilder sbD2 = b.d(i, i10, "sizeAndRate.support, ", "x", "@");
                    sbD2.append(d10);
                    zzj(sbD2.toString());
                    return false;
                }
            }
        } else if (!zzk(videoCapabilities, i, i10, d10)) {
            if (i < i10 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) && "mcv5a".equals(zzen.zzb)) || !zzk(videoCapabilities, i10, i, d10))) {
                StringBuilder sbD3 = b.d(i, i10, "sizeAndRate.support, ", "x", "@");
                sbD3.append(d10);
                zzj(sbD3.toString());
                return false;
            }
            StringBuilder sbD4 = b.d(i, i10, "sizeAndRate.rotated, ", "x", "@");
            sbD4.append(d10);
            String string = sbD4.toString();
            String str = this.zza;
            String str2 = this.zzb;
            String str3 = zzen.zze;
            StringBuilder sbE = b.e("AssumedSupport [", string, "] [", str, ", ");
            sbE.append(str2);
            sbE.append("] [");
            sbE.append(str3);
            sbE.append("]");
            zzdt.zzb("MediaCodecInfo", sbE.toString());
        }
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzh() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }
}
