package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzol {
    public static int zza(int i, int i10, zzg zzgVar) {
        for (int i11 = 10; i11 > 0; i11--) {
            int iZzi = zzen.zzi(i11);
            if (iZzi != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i10).setChannelMask(iZzi).build(), zzgVar.zza().zza)) {
                return i11;
            }
        }
        return 0;
    }

    public static zzfzo<Integer> zzb(zzg zzgVar) {
        zzfzl zzfzlVar = new zzfzl();
        zzgbu it = zzop.zzb.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            if (zzen.zza >= zzen.zzh(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), zzgVar.zza().zza)) {
                zzfzlVar.zzf(num);
            }
        }
        zzfzlVar.zzf((Object) 2);
        return zzfzlVar.zzi();
    }
}
