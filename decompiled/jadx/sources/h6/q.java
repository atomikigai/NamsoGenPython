package h6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzfgq;
import com.google.android.gms.internal.ads.zzfxf;
import e6.h2;
import e6.r3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends h7.a {
    public static final Parcelable.Creator<q> CREATOR = new r3(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5067b;

    public q(String str, int i) {
        this.f5066a = str == null ? "" : str;
        this.f5067b = i;
    }

    public static q g(Throwable th) {
        h2 h2VarZza = zzfgq.zza(th);
        return new q(zzfxf.zzd(th.getMessage()) ? h2VarZza.f3315b : th.getMessage(), h2VarZza.f3314a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 1, this.f5066a, false);
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(this.f5067b);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
