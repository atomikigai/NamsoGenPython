package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbve extends zzayd implements zzbvf {
    public zzbve() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbvp zzbvnVar = null;
        zzbvq zzbvqVar = null;
        zzbvp zzbvnVar2 = null;
        zzbvp zzbvnVar3 = null;
        zzbvp zzbvnVar4 = null;
        switch (i) {
            case 1:
                zzaye.zzc(parcel);
                parcel2.writeNoException();
                zzaye.zze(parcel2, null);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                }
                zzaye.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                zzbvx zzbvxVar = (zzbvx) zzaye.zza(parcel, zzbvx.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbvnVar = iInterfaceQueryLocalInterface instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface : new zzbvn(strongBinder2);
                }
                zzaye.zzc(parcel);
                zzg(zzbvxVar, zzbvnVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbvx zzbvxVar2 = (zzbvx) zzaye.zza(parcel, zzbvx.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbvnVar4 = iInterfaceQueryLocalInterface2 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface2 : new zzbvn(strongBinder3);
                }
                zzaye.zzc(parcel);
                zzf(zzbvxVar2, zzbvnVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbvx zzbvxVar3 = (zzbvx) zzaye.zza(parcel, zzbvx.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbvnVar3 = iInterfaceQueryLocalInterface3 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface3 : new zzbvn(strongBinder4);
                }
                zzaye.zzc(parcel);
                zze(zzbvxVar3, zzbvnVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                String string = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbvnVar2 = iInterfaceQueryLocalInterface4 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface4 : new zzbvn(strongBinder5);
                }
                zzaye.zzc(parcel);
                zzh(string, zzbvnVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbuz zzbuzVar = (zzbuz) zzaye.zza(parcel, zzbuz.CREATOR);
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    zzbvqVar = iInterfaceQueryLocalInterface5 instanceof zzbvq ? (zzbvq) iInterfaceQueryLocalInterface5 : new zzbvq(strongBinder6);
                }
                zzaye.zzc(parcel);
                zzi(zzbuzVar, zzbvqVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
