package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbd implements Parcelable.Creator<zzbc> {
    @Override // android.os.Parcelable.Creator
    public final zzbc createFromParcel(Parcel parcel) {
        int iS = c.S(parcel);
        int iJ = 1;
        zzba zzbaVar = null;
        IBinder iBinderI = null;
        PendingIntent pendingIntent = null;
        IBinder iBinderI2 = null;
        IBinder iBinderI3 = null;
        while (parcel.dataPosition() < iS) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iJ = c.J(i, parcel);
                    break;
                case 2:
                    zzbaVar = (zzba) c.h(parcel, i, zzba.CREATOR);
                    break;
                case 3:
                    iBinderI = c.I(i, parcel);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) c.h(parcel, i, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinderI2 = c.I(i, parcel);
                    break;
                case 6:
                    iBinderI3 = c.I(i, parcel);
                    break;
                default:
                    c.R(i, parcel);
                    break;
            }
        }
        c.n(iS, parcel);
        return new zzbc(iJ, zzbaVar, iBinderI, pendingIntent, iBinderI2, iBinderI3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbc[] newArray(int i) {
        return new zzbc[i];
    }
}
