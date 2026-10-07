package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzom {
    public static zzop zza(AudioManager audioManager, zzg zzgVar) {
        List<AudioProfile> directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(zzgVar.zza().zza);
        HashMap map = new HashMap();
        map.put(2, new HashSet(zzgcr.zzg(12)));
        for (int i = 0; i < directProfilesForAttributes.size(); i++) {
            AudioProfile audioProfile = directProfilesForAttributes.get(i);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (zzen.zzJ(format) || zzop.zzb.containsKey(Integer.valueOf(format))) {
                    Integer numValueOf = Integer.valueOf(format);
                    if (map.containsKey(numValueOf)) {
                        Set set = (Set) map.get(numValueOf);
                        set.getClass();
                        set.addAll(zzgcr.zzg(audioProfile.getChannelMasks()));
                    } else {
                        map.put(numValueOf, new HashSet(zzgcr.zzg(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        zzfzl zzfzlVar = new zzfzl();
        for (Map.Entry entry : map.entrySet()) {
            zzfzlVar.zzf(new zzon(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new zzop(zzfzlVar.zzi());
    }

    public static zzow zzb(AudioManager audioManager, zzg zzgVar) {
        try {
            if (audioManager == null) {
                throw null;
            }
            List<AudioDeviceInfo> audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(zzgVar.zza().zza);
            if (!audioDevicesForAttributes.isEmpty()) {
                return new zzow(audioDevicesForAttributes.get(0));
            }
            return null;
        } catch (RuntimeException unused) {
        }
    }
}
