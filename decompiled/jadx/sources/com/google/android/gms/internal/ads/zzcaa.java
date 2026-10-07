package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import d6.p;
import e6.o3;
import e6.t;
import h6.m0;
import h6.n0;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcaa {
    final String zzf;
    private final m0 zzk;
    long zza = -1;
    long zzb = -1;
    int zzc = -1;
    int zzd = -1;
    long zze = 0;
    private final Object zzj = new Object();
    int zzg = 0;
    int zzh = 0;
    int zzi = 0;

    public zzcaa(String str, m0 m0Var) {
        this.zzf = str;
        this.zzk = m0Var;
    }

    private final void zzi() {
        if (((Boolean) zzbeu.zza.zze()).booleanValue()) {
            synchronized (this.zzj) {
                this.zzc--;
                this.zzd--;
            }
        }
    }

    public final int zza() {
        int i;
        synchronized (this.zzj) {
            i = this.zzi;
        }
        return i;
    }

    public final Bundle zzb(Context context, String str) {
        Bundle bundle;
        synchronized (this.zzj) {
            try {
                bundle = new Bundle();
                if (!((n0) this.zzk).k()) {
                    bundle.putString("session_id", this.zzf);
                }
                bundle.putLong("basets", this.zzb);
                bundle.putLong("currts", this.zza);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.zzc);
                bundle.putInt("preqs_in_session", this.zzd);
                bundle.putLong("time_in_session", this.zze);
                bundle.putInt("pclick", this.zzg);
                bundle.putInt("pimp", this.zzh);
                Context contextZza = zzbwh.zza(context);
                int identifier = contextZza.getResources().getIdentifier("Theme.Translucent", "style", "android");
                boolean z4 = false;
                if (identifier == 0) {
                    h.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == contextZza.getPackageManager().getActivityInfo(new ComponentName(contextZza.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                            z4 = true;
                        } else {
                            h.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        h.g("Fail to fetch AdActivity theme");
                        h.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                bundle.putBoolean("support_transparent_background", z4);
                bundle.putInt("consent_form_action_identifier", zza());
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final void zzc() {
        synchronized (this.zzj) {
            this.zzg++;
        }
    }

    public final void zzd() {
        synchronized (this.zzj) {
            this.zzh++;
        }
    }

    public final void zze() {
        zzi();
    }

    public final void zzf() {
        zzi();
    }

    public final void zzg(o3 o3Var, long j4) {
        long j10;
        long j11;
        Bundle bundle;
        int i;
        synchronized (this.zzj) {
            try {
                n0 n0Var = (n0) this.zzk;
                n0Var.l();
                synchronized (n0Var.f5036a) {
                    j10 = n0Var.f5047o;
                }
                p.C.f2983j.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.zzb == -1) {
                    if (jCurrentTimeMillis - j10 > ((Long) t.f3437d.f3440c.zza(zzbcn.zzba)).longValue()) {
                        this.zzd = -1;
                    } else {
                        n0 n0Var2 = (n0) this.zzk;
                        n0Var2.l();
                        synchronized (n0Var2.f5036a) {
                            i = n0Var2.f5049q;
                        }
                        this.zzd = i;
                    }
                    this.zzb = j4;
                    this.zza = j4;
                } else {
                    this.zza = j4;
                }
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdH)).booleanValue() || (bundle = o3Var.f3373c) == null || bundle.getInt("gw", 2) != 1) {
                    this.zzc++;
                    int i10 = this.zzd + 1;
                    this.zzd = i10;
                    if (i10 == 0) {
                        this.zze = 0L;
                        ((n0) this.zzk).t(jCurrentTimeMillis);
                    } else {
                        n0 n0Var3 = (n0) this.zzk;
                        n0Var3.l();
                        synchronized (n0Var3.f5036a) {
                            j11 = n0Var3.f5048p;
                        }
                        this.zze = jCurrentTimeMillis - j11;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzh() {
        synchronized (this.zzj) {
            this.zzi++;
        }
    }
}
