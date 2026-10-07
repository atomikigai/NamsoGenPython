package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.bumptech.glide.d;
import java.util.Map;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbue extends h7.a {
    public static final Parcelable.Creator<zzbue> CREATOR = new zzbuf();
    public final View zza;
    public final Map zzb;

    public zzbue(IBinder iBinder, IBinder iBinder2) {
        this.zza = (View) b.I(b.y(iBinder));
        this.zzb = (Map) b.I(b.y(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        View view = this.zza;
        int iP = d.P(20293, parcel);
        d.F(parcel, 1, new b(view).asBinder());
        d.F(parcel, 2, new b(this.zzb).asBinder());
        d.Q(iP, parcel);
    }
}
