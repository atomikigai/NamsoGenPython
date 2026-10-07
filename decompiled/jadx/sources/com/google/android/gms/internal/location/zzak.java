package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public interface zzak extends IInterface {
    void zzb(int i, String[] strArr) throws RemoteException;

    void zzc(int i, String[] strArr) throws RemoteException;

    void zzd(int i, PendingIntent pendingIntent) throws RemoteException;
}
