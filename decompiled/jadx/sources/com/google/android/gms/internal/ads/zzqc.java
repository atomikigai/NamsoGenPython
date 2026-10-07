package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzqc {
    private final Context zza;
    private Boolean zzb;

    public zzqc() {
        this.zza = null;
    }

    public final zzoz zza(zzad zzadVar, zzg zzgVar) {
        boolean zBooleanValue;
        AudioManager audioManager;
        zzadVar.getClass();
        zzgVar.getClass();
        int i = zzen.zza;
        if (i < 29 || zzadVar.zzD == -1) {
            return zzoz.zza;
        }
        Context context = this.zza;
        Boolean bool = this.zzb;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
                this.zzb = Boolean.FALSE;
            } else {
                String parameters = audioManager.getParameters("offloadVariableRateSupported");
                boolean z4 = false;
                if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                    z4 = true;
                }
                this.zzb = Boolean.valueOf(z4);
            }
            zBooleanValue = this.zzb.booleanValue();
        }
        String str = zzadVar.zzo;
        str.getClass();
        int iZza = zzbg.zza(str, zzadVar.zzk);
        if (iZza == 0 || i < zzen.zzh(iZza)) {
            return zzoz.zza;
        }
        int iZzi = zzen.zzi(zzadVar.zzC);
        if (iZzi == 0) {
            return zzoz.zza;
        }
        try {
            AudioFormat audioFormatZzx = zzen.zzx(zzadVar.zzD, iZzi, iZza);
            return i >= 31 ? zzqb.zza(audioFormatZzx, zzgVar.zza().zza, zBooleanValue) : zzqa.zza(audioFormatZzx, zzgVar.zza().zza, zBooleanValue);
        } catch (IllegalArgumentException unused) {
            return zzoz.zza;
        }
    }

    public zzqc(Context context) {
        this.zza = context;
    }
}
