package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import e6.t;
import h6.m0;
import h6.n0;
import i6.h;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeuc implements zzevz {
    private final zzges zza;
    private final zzffo zzb;
    private final PackageInfo zzc;
    private final m0 zzd;

    public zzeuc(zzges zzgesVar, zzffo zzffoVar, PackageInfo packageInfo, m0 m0Var) {
        this.zza = zzgesVar;
        this.zzb = zzffoVar;
        this.zzc = packageInfo;
        this.zzd = m0Var;
    }

    public static /* synthetic */ zzeud zzc(final zzeuc zzeucVar) {
        final ArrayList arrayList = zzeucVar.zzb.zzg;
        if (arrayList == null) {
            return new zzeud() { // from class: com.google.android.gms.internal.ads.zzetz
                @Override // com.google.android.gms.internal.ads.zzevy
                public final void zzj(Object obj) {
                }
            };
        }
        return arrayList.isEmpty() ? new zzeud() { // from class: com.google.android.gms.internal.ads.zzeua
            @Override // com.google.android.gms.internal.ads.zzevy
            public final void zzj(Object obj) {
                ((Bundle) obj).putInt("native_version", 0);
            }
        } : new zzeud() { // from class: com.google.android.gms.internal.ads.zzeub
            @Override // com.google.android.gms.internal.ads.zzevy
            public final void zzj(Object obj) {
                this.zza.zzd(arrayList, (Bundle) obj);
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzety
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeuc.zzc(this.zza);
            }
        });
    }

    public final void zzd(ArrayList arrayList, Bundle bundle) {
        String str;
        int i;
        JSONObject jSONObject;
        String str2;
        JSONArray jSONArrayOptJSONArray;
        String str3;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", this.zzb.zzh);
        if (this.zzb.zzi.zza > 3) {
            bundle.putBoolean("enable_native_media_orientation", true);
            int i10 = this.zzb.zzi.zzh;
            if (i10 == 1) {
                str3 = "any";
            } else if (i10 == 2) {
                str3 = "landscape";
            } else if (i10 != 3) {
                str3 = i10 != 4 ? "unknown" : "square";
            } else {
                str3 = "portrait";
            }
            if (!"unknown".equals(str3)) {
                bundle.putString("native_media_orientation", str3);
            }
        }
        int i11 = this.zzb.zzi.zzc;
        if (i11 == 0) {
            str = "any";
        } else if (i11 != 1) {
            str = i11 != 2 ? "unknown" : "landscape";
        } else {
            str = "portrait";
        }
        if (!"unknown".equals(str)) {
            bundle.putString("native_image_orientation", str);
        }
        bundle.putBoolean("native_multiple_images", this.zzb.zzi.zzd);
        bundle.putBoolean("use_custom_mute", this.zzb.zzi.zzg);
        zzbfn zzbfnVar = this.zzb.zzi;
        if (zzbfnVar.zzi != 0) {
            bundle.putBoolean("sccg_tap", zzbfnVar.zzj);
            bundle.putInt("sccg_dir", this.zzb.zzi.zzi);
        }
        PackageInfo packageInfo = this.zzc;
        int i12 = packageInfo == null ? 0 : packageInfo.versionCode;
        n0 n0Var = (n0) this.zzd;
        n0Var.l();
        synchronized (n0Var.f5036a) {
            i = n0Var.f5050r;
        }
        if (i12 > i) {
            n0 n0Var2 = (n0) this.zzd;
            n0Var2.l();
            synchronized (n0Var2.f5036a) {
                try {
                    n0Var2.f5052t = new JSONObject();
                    SharedPreferences.Editor editor = n0Var2.f5041g;
                    if (editor != null) {
                        editor.remove("native_advanced_settings");
                        n0Var2.f5041g.apply();
                    }
                    n0Var2.m();
                } catch (Throwable th) {
                    throw th;
                }
            }
            n0 n0Var3 = (n0) this.zzd;
            n0Var3.l();
            synchronized (n0Var3.f5036a) {
                try {
                    if (n0Var3.f5050r != i12) {
                        n0Var3.f5050r = i12;
                        SharedPreferences.Editor editor2 = n0Var3.f5041g;
                        if (editor2 != null) {
                            editor2.putInt("version_code", i12);
                            n0Var3.f5041g.apply();
                        }
                        n0Var3.m();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        n0 n0Var4 = (n0) this.zzd;
        n0Var4.l();
        synchronized (n0Var4.f5036a) {
            jSONObject = n0Var4.f5052t;
        }
        String string = null;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(this.zzb.zzf)) != null) {
            string = jSONArrayOptJSONArray.toString();
        }
        if (!TextUtils.isEmpty(string)) {
            bundle.putString("native_advanced_settings", string);
        }
        int i13 = this.zzb.zzk;
        if (i13 > 1) {
            bundle.putInt("max_num_ads", i13);
        }
        zzbmb zzbmbVar = this.zzb.zzb;
        if (zzbmbVar != null) {
            if (TextUtils.isEmpty(zzbmbVar.zzc)) {
                if (zzbmbVar.zza >= 2) {
                    int i14 = zzbmbVar.zzd;
                    str2 = (i14 == 2 || i14 != 3) ? "l" : "p";
                } else {
                    int i15 = zzbmbVar.zzb;
                    if (i15 == 1) {
                        str2 = "l";
                    } else if (i15 != 2) {
                        h.d("Instream ad video aspect ratio " + i15 + " is wrong.");
                        str2 = "l";
                    } else {
                        str2 = "p";
                    }
                }
                bundle.putString("ia_var", str2);
            } else {
                bundle.putString("ad_tag", zzbmbVar.zzc);
            }
            bundle.putBoolean("instr", true);
        }
        if (this.zzb.zza() != null) {
            bundle.putBoolean("has_delayed_banner_listener", true);
        }
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzlA)).booleanValue()) {
            if (this.zzb.zzi.zzf != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("startMuted", this.zzb.zzi.zzf.f3340a);
                bundle2.putBoolean("clickToExpandRequested", this.zzb.zzi.zzf.f3342c);
                bundle2.putBoolean("customControlsRequested", this.zzb.zzi.zzf.f3341b);
                bundle.putBundle("video", bundle2);
            }
            bundle.putBoolean("disable_image_loading", this.zzb.zzi.zzb);
            bundle.putInt("preferred_ad_choices_position", this.zzb.zzi.zze);
        }
    }
}
