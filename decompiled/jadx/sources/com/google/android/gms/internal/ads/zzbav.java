package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.bumptech.glide.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbav implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iS = c.S(parcel);
        boolean zE = false;
        boolean zE2 = false;
        boolean zE3 = false;
        long jM = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iS) {
            int i = parcel.readInt();
            char c10 = (char) i;
            if (c10 == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) c.h(parcel, i, ParcelFileDescriptor.CREATOR);
            } else if (c10 == 3) {
                zE = c.E(i, parcel);
            } else if (c10 == 4) {
                zE2 = c.E(i, parcel);
            } else if (c10 == 5) {
                jM = c.M(i, parcel);
            } else if (c10 != 6) {
                c.R(i, parcel);
            } else {
                zE3 = c.E(i, parcel);
            }
        }
        c.n(iS, parcel);
        return new zzbau(parcelFileDescriptor, zE, zE2, jM, zE3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbau[i];
    }
}
