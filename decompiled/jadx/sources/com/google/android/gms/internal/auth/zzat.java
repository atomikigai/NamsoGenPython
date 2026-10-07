package com.google.android.gms.internal.auth;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import y6.a;
import y6.b;
import y6.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public interface zzat extends IInterface {
    void zzb(byte[] bArr) throws RemoteException;

    void zzc(a aVar) throws RemoteException;

    void zzd(Status status) throws RemoteException;

    void zze() throws RemoteException;

    void zzf(Status status, f fVar) throws RemoteException;

    void zzg(Status status, b bVar) throws RemoteException;

    void zzh(Status status) throws RemoteException;
}
