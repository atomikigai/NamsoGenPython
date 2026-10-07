package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zze {
    public final AudioAttributes zza;

    public /* synthetic */ zze(zzg zzgVar, zzf zzfVar) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i = zzen.zza;
        if (i >= 29) {
            zzc.zza(usage, 1);
        }
        if (i >= 32) {
            zzd.zza(usage, 0);
        }
        this.zza = usage.build();
    }
}
