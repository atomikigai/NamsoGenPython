package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import e6.o0;
import e6.o3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzeik implements zzefb {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final m9.a zza(zzfff zzfffVar, zzfet zzfetVar) {
        String strOptString = zzfetVar.zzv.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        zzffo zzffoVar = zzfffVar.zza.zza;
        zzffm zzffmVar = new zzffm();
        zzffmVar.zzq(zzffoVar);
        zzffmVar.zzt(strOptString);
        Bundle bundleZzd = zzd(zzffoVar.zzd.f3382x);
        Bundle bundleZzd2 = zzd(bundleZzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleZzd2.putInt("gw", 1);
        String strOptString2 = zzfetVar.zzv.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundleZzd2.putString("mad_hac", strOptString2);
        }
        String strOptString3 = zzfetVar.zzv.optString("adJson", null);
        if (strOptString3 != null) {
            bundleZzd2.putString("_ad", strOptString3);
        }
        bundleZzd2.putBoolean("_noRefresh", true);
        Iterator<String> itKeys = zzfetVar.zzD.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = zzfetVar.zzD.optString(next, null);
            if (next != null) {
                bundleZzd2.putString(next, strOptString4);
            }
        }
        bundleZzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleZzd2);
        o3 o3Var = zzffoVar.zzd;
        Bundle bundle = o3Var.f3383y;
        List list = o3Var.f3384z;
        String str = o3Var.A;
        String str2 = o3Var.B;
        boolean z4 = o3Var.C;
        o0 o0Var = o3Var.D;
        int i = o3Var.E;
        String str3 = o3Var.F;
        List list2 = o3Var.G;
        int i10 = o3Var.H;
        String str4 = o3Var.I;
        int i11 = o3Var.J;
        long j4 = o3Var.K;
        zzffmVar.zzH(new o3(o3Var.f3371a, o3Var.f3372b, bundleZzd2, o3Var.f3374d, o3Var.e, o3Var.f3375f, o3Var.f3376r, o3Var.f3377s, o3Var.f3378t, o3Var.f3379u, o3Var.f3380v, o3Var.f3381w, bundleZzd, bundle, list, str, str2, z4, o0Var, i, str3, list2, i10, str4, i11, j4));
        zzffo zzffoVarZzJ = zzffmVar.zzJ();
        Bundle bundle2 = new Bundle();
        zzfew zzfewVar = zzfffVar.zzb.zzb;
        Bundle bundle3 = new Bundle();
        bundle3.putStringArrayList("nofill_urls", new ArrayList<>(zzfewVar.zza));
        bundle3.putInt("refresh_interval", zzfewVar.zzc);
        bundle3.putString("gws_query_id", zzfewVar.zzb);
        bundle2.putBundle("parent_common_config", bundle3);
        zzffo zzffoVar2 = zzfffVar.zza.zza;
        Bundle bundle4 = new Bundle();
        bundle4.putString("initial_ad_unit_id", zzffoVar2.zzf);
        bundle4.putString("allocation_id", zzfetVar.zzw);
        bundle4.putString("ad_source_name", zzfetVar.zzF);
        bundle4.putStringArrayList("click_urls", new ArrayList<>(zzfetVar.zzc));
        bundle4.putStringArrayList("imp_urls", new ArrayList<>(zzfetVar.zzd));
        bundle4.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzfetVar.zzp));
        bundle4.putStringArrayList("fill_urls", new ArrayList<>(zzfetVar.zzm));
        bundle4.putStringArrayList("video_start_urls", new ArrayList<>(zzfetVar.zzg));
        bundle4.putStringArrayList("video_reward_urls", new ArrayList<>(zzfetVar.zzh));
        bundle4.putStringArrayList("video_complete_urls", new ArrayList<>(zzfetVar.zzi));
        bundle4.putString("transaction_id", zzfetVar.zzj);
        bundle4.putString("valid_from_timestamp", zzfetVar.zzk);
        bundle4.putBoolean("is_closable_area_disabled", zzfetVar.zzP);
        bundle4.putString("recursive_server_response_data", zzfetVar.zzao);
        if (zzfetVar.zzl != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putInt("rb_amount", zzfetVar.zzl.zzb);
            bundle5.putString("rb_type", zzfetVar.zzl.zza);
            bundle4.putParcelableArray("rewards", new Bundle[]{bundle5});
        }
        bundle2.putBundle("parent_ad_config", bundle4);
        return zzc(zzffoVarZzJ, bundle2, zzfetVar, zzfffVar);
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final boolean zzb(zzfff zzfffVar, zzfet zzfetVar) {
        return !TextUtils.isEmpty(zzfetVar.zzv.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    public abstract m9.a zzc(zzffo zzffoVar, Bundle bundle, zzfet zzfetVar, zzfff zzfffVar);
}
