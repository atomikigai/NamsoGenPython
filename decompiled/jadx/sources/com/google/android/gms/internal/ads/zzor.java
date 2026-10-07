package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzor extends AudioDeviceCallback {
    final /* synthetic */ zzov zza;

    public /* synthetic */ zzor(zzov zzovVar, zzou zzouVar) {
        this.zza = zzovVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzov zzovVar = this.zza;
        this.zza.zzj(zzop.zzc(zzovVar.zza, zzovVar.zzh, zzovVar.zzg));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzow zzowVar = this.zza.zzg;
        int i = zzen.zza;
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (Objects.equals(audioDeviceInfo, zzowVar)) {
                this.zza.zzg = null;
                break;
            }
        }
        zzov zzovVar = this.zza;
        zzovVar.zzj(zzop.zzc(zzovVar.zza, zzovVar.zzh, zzovVar.zzg));
    }
}
