package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.i0;
import h7.a;
import java.util.Collections;
import java.util.List;
import w7.b0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzj extends a {
    final b0 zzc;
    final List<g> zzd;
    final String zze;
    static final List<g> zza = Collections.EMPTY_LIST;
    static final b0 zzb = new b0(true, 50, 0.0f, Long.MAX_VALUE, f.API_PRIORITY_OTHER);
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();

    public zzj(b0 b0Var, List<g> list, String str) {
        this.zzc = b0Var;
        this.zzd = list;
        this.zze = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        return i0.m(this.zzc, zzjVar.zzc) && i0.m(this.zzd, zzjVar.zzd) && i0.m(this.zze, zzjVar.zze);
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(this.zzd);
        String str = this.zze;
        int length = strValueOf.length();
        StringBuilder sb2 = new StringBuilder(length + 77 + strValueOf2.length() + String.valueOf(str).length());
        sb2.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb2.append(strValueOf);
        sb2.append(", clients=");
        sb2.append(strValueOf2);
        sb2.append(", tag='");
        sb2.append(str);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = d.P(20293, parcel);
        d.J(parcel, 1, this.zzc, i, false);
        d.O(parcel, 2, this.zzd, false);
        d.K(parcel, 3, this.zze, false);
        d.Q(iP, parcel);
    }
}
