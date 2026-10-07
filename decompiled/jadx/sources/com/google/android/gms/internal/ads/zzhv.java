package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzhv {
    private final zzfxg zza;
    private final zzht zzb;
    private zzhu zzc;
    private float zze = 1.0f;
    private int zzd = 0;

    public zzhv(final Context context, Handler handler, zzhu zzhuVar) {
        this.zza = zzfxk.zza(new zzfxg() { // from class: com.google.android.gms.internal.ads.zzhr
            @Override // com.google.android.gms.internal.ads.zzfxg
            public final Object zza() {
                AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                audioManager.getClass();
                return audioManager;
            }
        });
        this.zzc = zzhuVar;
        this.zzb = new zzht(this, handler);
    }

    public static /* bridge */ /* synthetic */ void zzc(zzhv zzhvVar, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                zzhvVar.zzg(4);
                return;
            } else {
                zzhvVar.zzf(0);
                zzhvVar.zzg(3);
                return;
            }
        }
        if (i == -1) {
            zzhvVar.zzf(-1);
            zzhvVar.zze();
            zzhvVar.zzg(1);
        } else if (i != 1) {
            q1.a.o(i, "Unknown focus change type: ", "AudioFocusManager");
        } else {
            zzhvVar.zzg(2);
            zzhvVar.zzf(1);
        }
    }

    private final void zze() {
        int i = this.zzd;
        if (i == 1 || i == 0 || zzen.zza >= 26) {
            return;
        }
        ((AudioManager) this.zza.zza()).abandonAudioFocus(this.zzb);
    }

    private final void zzf(int i) {
        zzhu zzhuVar = this.zzc;
        if (zzhuVar != null) {
            int iZzS = zzjv.zzS(i);
            zzjv zzjvVar = ((zzjr) zzhuVar).zza;
            zzjvVar.zzaf(zzjvVar.zzu(), i, iZzS);
        }
    }

    private final void zzg(int i) {
        if (this.zzd == i) {
            return;
        }
        this.zzd = i;
        float f10 = i == 4 ? 0.2f : 1.0f;
        if (this.zze != f10) {
            this.zze = f10;
            zzhu zzhuVar = this.zzc;
            if (zzhuVar != null) {
                ((zzjr) zzhuVar).zza.zzac();
            }
        }
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z4, int i) {
        zze();
        zzg(0);
        return 1;
    }

    public final void zzd() {
        this.zzc = null;
        zze();
        zzg(0);
    }
}
