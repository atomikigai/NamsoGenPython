package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzsr {
    /* JADX WARN: Code duplicated, block: B:13:0x0028 A[EDGE_INSN: B:13:0x0028->B:31:0x0090 BREAK  A[LOOP:0: B:17:0x0043->B:30:0x008d]] */
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i10, double d10) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints2 = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints2 != null && !supportedPerformancePoints2.isEmpty()) {
            int iZzb = zzb(supportedPerformancePoints2, new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i10, (int) d10));
            boolean z4 = true;
            if (iZzb == 1 && zzss.zza == null) {
                if (zzen.zza >= 35) {
                    z4 = false;
                    break;
                }
                try {
                    zzab zzabVar = new zzab();
                    zzabVar.zzZ("video/avc");
                    zzad zzadVarZzaf = zzabVar.zzaf();
                    if (zzadVarZzaf.zzo != null) {
                        List listZze = zztl.zze(zzta.zza, zzadVarZzaf, false, false);
                        for (int i11 = 0; i11 < listZze.size(); i11++) {
                            if (((zzsq) listZze.get(i11)).zzd != null && ((zzsq) listZze.get(i11)).zzd.getVideoCapabilities() != null && (supportedPerformancePoints = ((zzsq) listZze.get(i11)).zzd.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                                if (zzb(supportedPerformancePoints, new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60)) == 1) {
                                    break;
                                }
                                z4 = false;
                                break;
                            }
                        }
                    }
                } catch (zztf unused) {
                }
                zzss.zza = Boolean.valueOf(z4);
                if (zzss.zza.booleanValue()) {
                }
            }
            return iZzb;
        }
        return 0;
    }

    private static int zzb(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i = 0; i < list.size(); i++) {
            if (((MediaCodecInfo.VideoCapabilities.PerformancePoint) list.get(i)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
