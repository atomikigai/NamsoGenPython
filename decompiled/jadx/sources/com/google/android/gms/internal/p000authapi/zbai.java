package com.google.android.gms.internal.p000authapi;

import a7.e;
import a7.g;
import a7.h;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zbai extends zba implements IInterface {
    public zbai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zby zbyVar, e eVar) throws RemoteException {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbyVar);
        zbc.zbc(parcelZba, eVar);
        zbb(1, parcelZba);
    }

    public final void zbd(zbab zbabVar, g gVar, String str) throws RemoteException {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbabVar);
        zbc.zbc(parcelZba, gVar);
        parcelZba.writeString(str);
        zbb(4, parcelZba);
    }

    public final void zbe(zbad zbadVar, h hVar) throws RemoteException {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbadVar);
        zbc.zbc(parcelZba, hVar);
        zbb(3, parcelZba);
    }

    public final void zbf(j jVar, String str) throws RemoteException {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, jVar);
        parcelZba.writeString(str);
        zbb(2, parcelZba);
    }
}
