package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import qd.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbye extends h7.a {
    public static final Parcelable.Creator<zzbye> CREATOR = new zzbyf();
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final boolean zzd;
    public final List zze;
    public final boolean zzf;
    public final boolean zzg;
    public final List zzh;

    public zzbye(String str, String str2, boolean z4, boolean z10, List list, boolean z11, boolean z12, List list2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = z4;
        this.zzd = z10;
        this.zze = list;
        this.zzf = z11;
        this.zzg = z12;
        this.zzh = list2 == null ? new ArrayList() : list2;
    }

    public static zzbye zza(JSONObject jSONObject) throws JSONException {
        return new zzbye(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), b.J(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), b.J(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iP = d.P(20293, parcel);
        d.K(parcel, 2, str, false);
        d.K(parcel, 3, this.zzb, false);
        boolean z4 = this.zzc;
        d.R(parcel, 4, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.zzd;
        d.R(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        d.M(parcel, 6, this.zze);
        boolean z11 = this.zzf;
        d.R(parcel, 7, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.zzg;
        d.R(parcel, 8, 4);
        parcel.writeInt(z12 ? 1 : 0);
        d.M(parcel, 9, this.zzh);
        d.Q(iP, parcel);
    }
}
