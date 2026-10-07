package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import d6.p;
import e6.h2;
import e6.o3;
import e6.t;
import h6.r0;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdrr implements zzdbg, e6.a, zzcxg, zzcwq {
    private final Context zza;
    private final zzfgg zzb;
    private final zzdsm zzc;
    private final zzfff zzd;
    private final zzfet zze;
    private final zzedp zzf;
    private final String zzg;
    private Boolean zzh;
    private final boolean zzi = ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzgH)).booleanValue();

    public zzdrr(Context context, zzfgg zzfggVar, zzdsm zzdsmVar, zzfff zzfffVar, zzfet zzfetVar, zzedp zzedpVar, String str) {
        this.zza = context;
        this.zzb = zzfggVar;
        this.zzc = zzdsmVar;
        this.zzd = zzfffVar;
        this.zze = zzfetVar;
        this.zzf = zzedpVar;
        this.zzg = str;
    }

    private final zzdsl zzd(String str) {
        zzffe zzffeVar = this.zzd.zzb;
        zzdsl zzdslVarZza = this.zzc.zza();
        zzdslVarZza.zzd(zzffeVar.zzb);
        zzdslVarZza.zzc(this.zze);
        zzdslVarZza.zzb("action", str);
        zzdslVarZza.zzb("ad_format", this.zzg.toUpperCase(Locale.ROOT));
        if (!this.zze.zzt.isEmpty()) {
            zzdslVarZza.zzb("ancn", (String) this.zze.zzt.get(0));
        }
        if (this.zze.zzai) {
            Context context = this.zza;
            p pVar = p.C;
            zzdslVarZza.zzb("device_connectivity", true != pVar.f2982g.zzA(context) ? "offline" : o.a.ONLINE_EXTRAS_KEY);
            pVar.f2983j.getClass();
            zzdslVarZza.zzb("event_timestamp", String.valueOf(System.currentTimeMillis()));
            zzdslVarZza.zzb("offline_ad", "1");
        }
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzgO)).booleanValue()) {
            boolean z4 = android.support.v4.media.session.a.O(this.zzd.zza.zza) != 1;
            zzdslVarZza.zzb("scar", String.valueOf(z4));
            if (z4) {
                o3 o3Var = this.zzd.zza.zza.zzd;
                zzdslVarZza.zzb("ragent", o3Var.A);
                zzdslVarZza.zzb("rtype", android.support.v4.media.session.a.L(android.support.v4.media.session.a.M(o3Var)));
            }
        }
        return zzdslVarZza;
    }

    private final void zze(zzdsl zzdslVar) {
        if (!this.zze.zzai) {
            zzdslVar.zzf();
            return;
        }
        String strZze = zzdslVar.zze();
        p.C.f2983j.getClass();
        this.zzf.zzd(new zzedr(System.currentTimeMillis(), this.zzd.zzb.zzb.zzb, strZze, 2));
    }

    private final boolean zzf() {
        String strE;
        if (this.zzh == null) {
            synchronized (this) {
                if (this.zzh == null) {
                    String str = (String) t.f3437d.f3440c.zza(zzbcn.zzbz);
                    r0 r0Var = p.C.f2979c;
                    try {
                        strE = r0.E(this.zza);
                    } catch (RemoteException unused) {
                        strE = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strE != null) {
                        try {
                            zMatches = Pattern.matches(str, strE);
                        } catch (RuntimeException e) {
                            p.C.f2982g.zzw(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzh = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.zzh.booleanValue();
    }

    @Override // e6.a
    public final void onAdClicked() {
        if (this.zze.zzai) {
            zze(zzd("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zza(h2 h2Var) {
        h2 h2Var2;
        if (this.zzi) {
            zzdsl zzdslVarZzd = zzd("ifts");
            zzdslVarZzd.zzb("reason", "adapter");
            int i = h2Var.f3314a;
            String str = h2Var.f3315b;
            if (h2Var.f3316c.equals("com.google.android.gms.ads") && (h2Var2 = h2Var.f3317d) != null && !h2Var2.f3316c.equals("com.google.android.gms.ads")) {
                h2 h2Var3 = h2Var.f3317d;
                i = h2Var3.f3314a;
                str = h2Var3.f3315b;
            }
            if (i >= 0) {
                zzdslVarZzd.zzb("arec", String.valueOf(i));
            }
            String strZza = this.zzb.zza(str);
            if (strZza != null) {
                zzdslVarZzd.zzb("areec", strZza);
            }
            zzdslVarZzd.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzb() {
        if (this.zzi) {
            zzdsl zzdslVarZzd = zzd("ifts");
            zzdslVarZzd.zzb("reason", "blocked");
            zzdslVarZzd.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzc(zzdgu zzdguVar) {
        if (this.zzi) {
            zzdsl zzdslVarZzd = zzd("ifts");
            zzdslVarZzd.zzb("reason", "exception");
            if (!TextUtils.isEmpty(zzdguVar.getMessage())) {
                zzdslVarZzd.zzb("msg", zzdguVar.getMessage());
            }
            zzdslVarZzd.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    public final void zzi() {
        if (zzf()) {
            zzd("adapter_shown").zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    public final void zzj() {
        if (zzf()) {
            zzd("adapter_impression").zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzr() {
        if (zzf() || this.zze.zzai) {
            zze(zzd("impression"));
        }
    }
}
