package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.common.api.f;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzca {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private final zzfzo zzh;
    private final zzfzo zzi;
    private final int zzj;
    private final int zzk;
    private final zzfzo zzl;
    private final zzbz zzm;
    private zzfzo zzn;
    private int zzo;
    private final HashMap zzp;
    private final HashSet zzq;

    @Deprecated
    public zzca() {
        this.zza = f.API_PRIORITY_OTHER;
        this.zzb = f.API_PRIORITY_OTHER;
        this.zzc = f.API_PRIORITY_OTHER;
        this.zzd = f.API_PRIORITY_OTHER;
        this.zze = f.API_PRIORITY_OTHER;
        this.zzf = f.API_PRIORITY_OTHER;
        this.zzg = true;
        this.zzh = zzfzo.zzn();
        this.zzi = zzfzo.zzn();
        this.zzj = f.API_PRIORITY_OTHER;
        this.zzk = f.API_PRIORITY_OTHER;
        this.zzl = zzfzo.zzn();
        this.zzm = zzbz.zza;
        this.zzn = zzfzo.zzn();
        this.zzo = 0;
        this.zzp = new HashMap();
        this.zzq = new HashSet();
    }

    public final zzca zze(Context context) {
        CaptioningManager captioningManager;
        if ((zzen.zza >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.zzo = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.zzn = zzfzo.zzo(locale.toLanguageTag());
            }
        }
        return this;
    }

    public final zzca zzf(int i, int i10, boolean z4) {
        this.zze = i;
        this.zzf = i10;
        this.zzg = true;
        return this;
    }

    public zzca(zzcb zzcbVar) {
        this.zza = f.API_PRIORITY_OTHER;
        this.zzb = f.API_PRIORITY_OTHER;
        this.zzc = f.API_PRIORITY_OTHER;
        this.zzd = f.API_PRIORITY_OTHER;
        this.zze = zzcbVar.zzi;
        this.zzf = zzcbVar.zzj;
        this.zzg = zzcbVar.zzk;
        this.zzh = zzcbVar.zzl;
        this.zzi = zzcbVar.zzn;
        this.zzj = f.API_PRIORITY_OTHER;
        this.zzk = f.API_PRIORITY_OTHER;
        this.zzl = zzcbVar.zzr;
        this.zzm = zzcbVar.zzs;
        this.zzn = zzcbVar.zzt;
        this.zzo = zzcbVar.zzu;
        this.zzq = new HashSet(zzcbVar.zzB);
        this.zzp = new HashMap(zzcbVar.zzA);
    }
}
