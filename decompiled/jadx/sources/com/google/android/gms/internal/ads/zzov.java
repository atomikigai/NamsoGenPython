package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzov {
    private final Context zza;
    private final Handler zzb;
    private final zzor zzc;
    private final BroadcastReceiver zzd;
    private final zzos zze;
    private zzop zzf;
    private zzow zzg;
    private zzg zzh;
    private boolean zzi;
    private final zzqf zzj;

    /* JADX WARN: Multi-variable type inference failed */
    public zzov(Context context, zzqf zzqfVar, zzg zzgVar, zzow zzowVar) {
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzj = zzqfVar;
        this.zzh = zzgVar;
        this.zzg = zzowVar;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Handler handler = new Handler(zzen.zzz(), null);
        this.zzb = handler;
        this.zzc = zzen.zza >= 23 ? new zzor(this, objArr2 == true ? 1 : 0) : null;
        this.zzd = new zzot(this, objArr == true ? 1 : 0);
        Uri uriZza = zzop.zza();
        this.zze = uriZza != null ? new zzos(this, handler, applicationContext.getContentResolver(), uriZza) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(zzop zzopVar) {
        if (!this.zzi || zzopVar.equals(this.zzf)) {
            return;
        }
        this.zzf = zzopVar;
        this.zzj.zza.zzJ(zzopVar);
    }

    public final zzop zzc() {
        zzor zzorVar;
        if (this.zzi) {
            zzop zzopVar = this.zzf;
            zzopVar.getClass();
            return zzopVar;
        }
        this.zzi = true;
        zzos zzosVar = this.zze;
        if (zzosVar != null) {
            zzosVar.zza();
        }
        if (zzen.zza >= 23 && (zzorVar = this.zzc) != null) {
            zzoq.zza(this.zza, zzorVar, this.zzb);
        }
        zzop zzopVarZzd = zzop.zzd(this.zza, this.zza.registerReceiver(this.zzd, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.zzb), this.zzh, this.zzg);
        this.zzf = zzopVarZzd;
        return zzopVarZzd;
    }

    public final void zzg(zzg zzgVar) {
        this.zzh = zzgVar;
        zzj(zzop.zzc(this.zza, zzgVar, this.zzg));
    }

    public final void zzh(AudioDeviceInfo audioDeviceInfo) {
        zzow zzowVar = this.zzg;
        if (Objects.equals(audioDeviceInfo, zzowVar == null ? null : zzowVar.zza)) {
            return;
        }
        zzow zzowVar2 = audioDeviceInfo != null ? new zzow(audioDeviceInfo) : null;
        this.zzg = zzowVar2;
        zzj(zzop.zzc(this.zza, this.zzh, zzowVar2));
    }

    public final void zzi() {
        zzor zzorVar;
        if (this.zzi) {
            this.zzf = null;
            if (zzen.zza >= 23 && (zzorVar = this.zzc) != null) {
                zzoq.zzb(this.zza, zzorVar);
            }
            this.zza.unregisterReceiver(this.zzd);
            zzos zzosVar = this.zze;
            if (zzosVar != null) {
                zzosVar.zzb();
            }
            this.zzi = false;
        }
    }
}
