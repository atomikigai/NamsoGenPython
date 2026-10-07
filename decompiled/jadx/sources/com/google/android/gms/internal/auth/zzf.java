package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import v6.b;
import v6.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public interface zzf extends IInterface {
    Bundle zzd(String str, Bundle bundle) throws RemoteException;

    Bundle zze(Account account, String str, Bundle bundle) throws RemoteException;

    Bundle zzf(Account account) throws RemoteException;

    Bundle zzg(String str) throws RemoteException;

    c zzh(b bVar) throws RemoteException;
}
