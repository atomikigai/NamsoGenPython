package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.i0;
import e6.o3;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeny implements zzevy {
    final zzffo zza;
    private final long zzb;

    public zzeny(zzffo zzffoVar, long j4) {
        i0.j(zzffoVar, "the targeting must not be null");
        this.zza = zzffoVar;
        this.zzb = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        o3 o3Var = this.zza.zzd;
        int i = o3Var.H;
        Bundle bundle2 = o3Var.f3373c;
        long j4 = o3Var.f3372b;
        int i10 = o3Var.f3371a;
        bundle.putInt("http_timeout_millis", i);
        bundle.putString("slotname", this.zza.zzf);
        int i11 = this.zza.zzo.zza;
        if (i11 == 0) {
            throw null;
        }
        int i12 = i11 - 1;
        if (i12 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i12 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        bundle.putLong("start_signals_timestamp", this.zzb);
        zzfgc.zzg(bundle, "is_sdk_preload", true, bundle2.getBoolean("is_sdk_preload", false));
        zzfgc.zzf(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(j4)), j4 != -1);
        zzfgc.zzb(bundle, "extras", bundle2);
        int i13 = o3Var.f3374d;
        zzfgc.zze(bundle, "cust_gender", i13, i13 != -1);
        zzfgc.zzd(bundle, "kw", o3Var.e);
        int i14 = o3Var.f3376r;
        zzfgc.zze(bundle, "tag_for_child_directed_treatment", i14, i14 != -1);
        if (o3Var.f3375f) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", o3Var.J);
        zzfgc.zze(bundle, "d_imp_hdr", 1, i10 >= 2 && o3Var.f3377s);
        String str = o3Var.f3378t;
        zzfgc.zzf(bundle, "ppid", str, i10 >= 2 && !TextUtils.isEmpty(str));
        Location location = o3Var.f3380v;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle3 = new Bundle();
            bundle3.putFloat("radius", accuracy);
            bundle3.putLong("lat", (long) latitude);
            bundle3.putLong("long", (long) longitude);
            bundle3.putLong("time", time);
            bundle.putBundle("uule", bundle3);
        }
        zzfgc.zzc(bundle, "url", o3Var.f3381w);
        zzfgc.zzd(bundle, "neighboring_content_urls", o3Var.G);
        zzfgc.zzb(bundle, "custom_targeting", o3Var.f3383y);
        zzfgc.zzd(bundle, "category_exclusions", o3Var.f3384z);
        zzfgc.zzc(bundle, "request_agent", o3Var.A);
        zzfgc.zzc(bundle, "request_pkg", o3Var.B);
        zzfgc.zzg(bundle, "is_designed_for_families", o3Var.C, i10 >= 7);
        if (i10 >= 8) {
            int i15 = o3Var.E;
            zzfgc.zze(bundle, "tag_for_under_age_of_consent", i15, i15 != -1);
            zzfgc.zzc(bundle, "max_ad_content_rating", o3Var.F);
        }
    }
}
