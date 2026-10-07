package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.i0;
import e6.q3;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeon implements zzevy {
    public final q3 zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final boolean zzi;

    public zzeon(q3 q3Var, String str, boolean z4, String str2, float f10, int i, int i10, String str3, boolean z10) {
        i0.j(q3Var, "the adSize must not be null");
        this.zza = q3Var;
        this.zzb = str;
        this.zzc = z4;
        this.zzd = str2;
        this.zze = f10;
        this.zzf = i;
        this.zzg = i10;
        this.zzh = str3;
        this.zzi = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfgc.zzf(bundle, "smart_w", "full", this.zza.e == -1);
        zzfgc.zzf(bundle, "smart_h", "auto", this.zza.f3407b == -2);
        zzfgc.zzg(bundle, "ene", true, this.zza.f3414u);
        zzfgc.zzf(bundle, "rafmt", "102", this.zza.f3417x);
        zzfgc.zzf(bundle, "rafmt", "103", this.zza.f3418y);
        zzfgc.zzf(bundle, "rafmt", "105", this.zza.f3419z);
        zzfgc.zzg(bundle, "inline_adaptive_slot", true, this.zzi);
        zzfgc.zzg(bundle, "interscroller_slot", true, this.zza.f3419z);
        zzfgc.zzc(bundle, "format", this.zzb);
        zzfgc.zzf(bundle, "fluid", "height", this.zzc);
        zzfgc.zzf(bundle, "sz", this.zzd, !TextUtils.isEmpty(this.zzd));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt("sh", this.zzg);
        zzfgc.zzf(bundle, "sc", this.zzh, !TextUtils.isEmpty(this.zzh));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        q3[] q3VarArr = this.zza.f3411r;
        if (q3VarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.zza.f3407b);
            bundle2.putInt("width", this.zza.e);
            bundle2.putBoolean("is_fluid_height", this.zza.f3413t);
            arrayList.add(bundle2);
        } else {
            for (q3 q3Var : q3VarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", q3Var.f3413t);
                bundle3.putInt("height", q3Var.f3407b);
                bundle3.putInt("width", q3Var.e);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
