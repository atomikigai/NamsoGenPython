package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import e6.h2;
import e6.t;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfkl implements Runnable {
    private final zzfko zzb;
    private String zzc;
    private String zze;
    private zzffe zzf;
    private h2 zzg;
    private Future zzh;
    private final List zza = new ArrayList();
    private int zzi = 2;
    private zzfkq zzd = zzfkq.SCAR_REQUEST_TYPE_UNSPECIFIED;

    public zzfkl(zzfko zzfkoVar) {
        this.zzb = zzfkoVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzh();
    }

    public final synchronized zzfkl zza(zzfka zzfkaVar) {
        try {
            if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
                List list = this.zza;
                zzfkaVar.zzj();
                list.add(zzfkaVar);
                Future future = this.zzh;
                if (future != null) {
                    future.cancel(false);
                }
                this.zzh = zzcaj.zzd.schedule(this, ((Integer) t.f3437d.f3440c.zza(zzbcn.zzis)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfkl zzb(String str) {
        if (((Boolean) zzbeg.zzc.zze()).booleanValue() && zzfkk.zze(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfkl zzc(h2 h2Var) {
        if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
            this.zzg = h2Var;
        }
        return this;
    }

    public final synchronized zzfkl zzd(ArrayList arrayList) {
        try {
            if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains("BANNER")) {
                    this.zzi = 3;
                } else if (arrayList.contains("interstitial") || arrayList.contains("INTERSTITIAL")) {
                    this.zzi = 4;
                } else if (arrayList.contains("native") || arrayList.contains("NATIVE")) {
                    this.zzi = 8;
                } else if (arrayList.contains("rewarded") || arrayList.contains("REWARDED")) {
                    this.zzi = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.zzi = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains("REWARDED_INTERSTITIAL")) {
                    this.zzi = 6;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfkl zze(String str) {
        if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
            this.zze = str;
        }
        return this;
    }

    public final synchronized zzfkl zzf(Bundle bundle) {
        if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
            this.zzd = android.support.v4.media.session.a.I(bundle);
        }
        return this;
    }

    public final synchronized zzfkl zzg(zzffe zzffeVar) {
        if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
            this.zzf = zzffeVar;
        }
        return this;
    }

    public final synchronized void zzh() {
        try {
            if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
                Future future = this.zzh;
                if (future != null) {
                    future.cancel(false);
                }
                for (zzfka zzfkaVar : this.zza) {
                    int i = this.zzi;
                    if (i != 2) {
                        zzfkaVar.zzn(i);
                    }
                    if (!TextUtils.isEmpty(this.zzc)) {
                        zzfkaVar.zze(this.zzc);
                    }
                    if (!TextUtils.isEmpty(this.zze) && !zzfkaVar.zzl()) {
                        zzfkaVar.zzd(this.zze);
                    }
                    zzffe zzffeVar = this.zzf;
                    if (zzffeVar != null) {
                        zzfkaVar.zzb(zzffeVar);
                    } else {
                        h2 h2Var = this.zzg;
                        if (h2Var != null) {
                            zzfkaVar.zza(h2Var);
                        }
                    }
                    zzfkaVar.zzf(this.zzd);
                    this.zzb.zzb(zzfkaVar.zzm());
                }
                this.zza.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zzfkl zzi(int i) {
        if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
            this.zzi = i;
        }
        return this;
    }
}
