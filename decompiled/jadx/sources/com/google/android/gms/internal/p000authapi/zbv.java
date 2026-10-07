package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;
import com.google.android.gms.auth.api.credentials.Credential;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zbv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iS = c.S(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < iS) {
            int i = parcel.readInt();
            if (((char) i) != 1) {
                c.R(i, parcel);
            } else {
                credential = (Credential) c.h(parcel, i, Credential.CREATOR);
            }
        }
        c.n(iS, parcel);
        return new zbu(credential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zbu[i];
    }
}
