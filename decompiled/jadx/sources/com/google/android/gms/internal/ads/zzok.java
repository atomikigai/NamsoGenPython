package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzok {
    public static boolean zza(AudioManager audioManager, zzow zzowVar) {
        AudioDeviceInfo[] devices;
        if (zzowVar == null) {
            audioManager.getClass();
            devices = audioManager.getDevices(2);
        } else {
            devices = new AudioDeviceInfo[]{zzowVar.zza};
        }
        zzfzt<Integer> zzfztVarZzb = zzb();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (zzfztVarZzb.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }

    private static zzfzt<Integer> zzb() {
        zzfzs zzfzsVar = new zzfzs();
        zzfzsVar.zzg(8, 7);
        int i = zzen.zza;
        if (i >= 31) {
            zzfzsVar.zzg(26, 27);
        }
        if (i >= 33) {
            zzfzsVar.zzf((Object) 30);
        }
        return zzfzsVar.zzi();
    }
}
