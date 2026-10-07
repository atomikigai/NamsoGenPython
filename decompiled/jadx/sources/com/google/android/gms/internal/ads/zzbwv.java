package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.i0;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbwv extends h7.a {
    public static final Parcelable.Creator<zzbwv> CREATOR = new zzbww();
    public final String zza;
    public final int zzb;

    public zzbwv(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public static zzbwv zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzbwv(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbwv)) {
            zzbwv zzbwvVar = (zzbwv) obj;
            if (i0.m(this.zza, zzbwvVar.zza)) {
                if (i0.m(Integer.valueOf(this.zzb), Integer.valueOf(zzbwvVar.zzb))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iP = d.P(20293, parcel);
        d.K(parcel, 2, str, false);
        int i10 = this.zzb;
        d.R(parcel, 3, 4);
        parcel.writeInt(i10);
        d.Q(iP, parcel);
    }
}
