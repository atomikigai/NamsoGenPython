package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import d6.p;
import e6.t;
import h6.k0;
import h6.m0;
import h6.n0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbyi implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context zza;
    private final SharedPreferences zzb;
    private final m0 zzc;
    private String zzd = "-1";
    private int zze = -1;

    public zzbyi(Context context, m0 m0Var) {
        this.zzb = PreferenceManager.getDefaultSharedPreferences(context);
        this.zzc = m0Var;
        this.zza = context;
    }

    private final void zzb() {
        ((n0) this.zzc).c(true);
        p3.a.x(this.zza);
    }

    private final void zzc(String str, int i) {
        Context context;
        zzbce zzbceVar = zzbcn.zzaG;
        t tVar = t.f3437d;
        boolean z4 = true;
        if (!((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1")))) {
            z4 = false;
        }
        ((n0) this.zzc).c(z4);
        if (((Boolean) tVar.f3440c.zza(zzbcn.zzgc)).booleanValue() && z4 && (context = this.zza) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        try {
            zzbce zzbceVar = zzbcn.zzaI;
            t tVar = t.f3437d;
            if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                if (Objects.equals(str, "gad_has_consent_for_cookies")) {
                    int i = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    n0 n0Var = (n0) this.zzc;
                    n0Var.l();
                    if (i != n0Var.f5045m) {
                        zzb();
                    }
                    ((n0) this.zzc).a(i);
                    return;
                }
                if (Objects.equals(str, "IABTCF_TCString")) {
                    String string = sharedPreferences.getString(str, "-1");
                    n0 n0Var2 = (n0) this.zzc;
                    n0Var2.l();
                    if (!Objects.equals(string, n0Var2.f5044l)) {
                        zzb();
                    }
                    ((n0) this.zzc).h(string);
                    return;
                }
                return;
            }
            String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
            int i10 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String strValueOf = String.valueOf(str);
            int iHashCode = strValueOf.hashCode();
            if (iHashCode == -2004976699) {
                if (!strValueOf.equals("IABTCF_PurposeConsents") || string2.equals("-1") || this.zzd.equals(string2)) {
                    return;
                }
                this.zzd = string2;
                zzc(string2, i10);
                return;
            }
            if (iHashCode == -527267622 && strValueOf.equals("gad_has_consent_for_cookies")) {
                if (!((Boolean) tVar.f3440c.zza(zzbcn.zzaG)).booleanValue() || i10 == -1 || this.zze == i10) {
                    return;
                }
                this.zze = i10;
                zzc(string2, i10);
            }
        } catch (Throwable th) {
            p.C.f2982g.zzw(th, "AdMobPlusIdlessListener.onSharedPreferenceChanged");
            k0.l("onSharedPreferenceChanged, errorMessage = ", th);
        }
    }

    public final void zza() {
        this.zzb.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.zzb, "gad_has_consent_for_cookies");
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzaI)).booleanValue()) {
            onSharedPreferenceChanged(this.zzb, "IABTCF_TCString");
        } else {
            onSharedPreferenceChanged(this.zzb, "IABTCF_PurposeConsents");
        }
    }
}
