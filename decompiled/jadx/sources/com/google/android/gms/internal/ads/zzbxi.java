package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import e6.h2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbxi extends zzayd implements zzbxj {
    public zzbxi() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i == 1) {
            zzg();
        } else if (i == 2) {
            int i11 = parcel.readInt();
            zzaye.zzc(parcel);
            zze(i11);
        } else {
            if (i != 3) {
                return false;
            }
            h2 h2Var = (h2) zzaye.zza(parcel, h2.CREATOR);
            zzaye.zzc(parcel);
            zzf(h2Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
