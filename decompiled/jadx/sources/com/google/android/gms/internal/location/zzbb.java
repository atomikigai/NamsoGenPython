package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbb implements Parcelable.Creator<zzba> {
    @Override // android.os.Parcelable.Creator
    public final zzba createFromParcel(Parcel parcel) {
        int iS = c.S(parcel);
        List<g> listM = zzba.zza;
        LocationRequest locationRequest = null;
        String strI = null;
        String strI2 = null;
        String strI3 = null;
        boolean zE = false;
        boolean zE2 = false;
        boolean zE3 = false;
        boolean zE4 = false;
        boolean zE5 = false;
        long jM = Long.MAX_VALUE;
        while (parcel.dataPosition() < iS) {
            int i = parcel.readInt();
            char c10 = (char) i;
            if (c10 != 1) {
                switch (c10) {
                    case 5:
                        listM = c.m(parcel, i, g.CREATOR);
                        break;
                    case 6:
                        strI = c.i(i, parcel);
                        break;
                    case 7:
                        zE = c.E(i, parcel);
                        break;
                    case '\b':
                        zE2 = c.E(i, parcel);
                        break;
                    case '\t':
                        zE3 = c.E(i, parcel);
                        break;
                    case '\n':
                        strI2 = c.i(i, parcel);
                        break;
                    case 11:
                        zE4 = c.E(i, parcel);
                        break;
                    case '\f':
                        zE5 = c.E(i, parcel);
                        break;
                    case '\r':
                        strI3 = c.i(i, parcel);
                        break;
                    case 14:
                        jM = c.M(i, parcel);
                        break;
                    default:
                        c.R(i, parcel);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) c.h(parcel, i, LocationRequest.CREATOR);
            }
        }
        c.n(iS, parcel);
        return new zzba(locationRequest, listM, strI, zE, zE2, zE3, strI2, zE4, zE5, strI3, jM);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzba[] newArray(int i) {
        return new zzba[i];
    }
}
