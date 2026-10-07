package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import h7.a;
import w7.n;
import w7.o;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzl extends a {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    final int zza;
    final zzj zzb;
    final o zzc;
    final zzai zzd;

    public zzl(int i, zzj zzjVar, IBinder iBinder, IBinder iBinder2) {
        this.zza = i;
        this.zzb = zzjVar;
        zzai zzagVar = null;
        this.zzc = iBinder == null ? null : n.zzb(iBinder);
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzagVar = iInterfaceQueryLocalInterface instanceof zzai ? (zzai) iInterfaceQueryLocalInterface : new zzag(iBinder2);
        }
        this.zzd = zzagVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = d.P(20293, parcel);
        int i10 = this.zza;
        d.R(parcel, 1, 4);
        parcel.writeInt(i10);
        d.J(parcel, 2, this.zzb, i, false);
        o oVar = this.zzc;
        d.F(parcel, 3, oVar == null ? null : oVar.asBinder());
        zzai zzaiVar = this.zzd;
        d.F(parcel, 4, zzaiVar != null ? zzaiVar.asBinder() : null);
        d.Q(iP, parcel);
    }
}
