package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.location.LocationAvailability;
import w7.c;
import w7.e;
import w7.i;
import w7.l;
import w7.z;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public interface zzam extends IInterface {
    void zzd(e eVar, PendingIntent pendingIntent, zzak zzakVar) throws RemoteException;

    void zze(PendingIntent pendingIntent, zzak zzakVar, String str) throws RemoteException;

    void zzf(String[] strArr, zzak zzakVar, String str) throws RemoteException;

    void zzg(z zVar, zzak zzakVar) throws RemoteException;

    void zzh(long j4, boolean z4, PendingIntent pendingIntent) throws RemoteException;

    void zzi(c cVar, PendingIntent pendingIntent, j jVar) throws RemoteException;

    void zzj(PendingIntent pendingIntent, j jVar) throws RemoteException;

    void zzk(PendingIntent pendingIntent) throws RemoteException;

    void zzl(PendingIntent pendingIntent, j jVar) throws RemoteException;

    @Deprecated
    Location zzm() throws RemoteException;

    Location zzn(String str) throws RemoteException;

    void zzo(zzbc zzbcVar) throws RemoteException;

    void zzp(boolean z4) throws RemoteException;

    void zzq(Location location) throws RemoteException;

    void zzr(zzai zzaiVar) throws RemoteException;

    LocationAvailability zzs(String str) throws RemoteException;

    void zzt(i iVar, zzao zzaoVar, String str) throws RemoteException;

    void zzu(zzl zzlVar) throws RemoteException;

    void zzv(PendingIntent pendingIntent, l lVar, j jVar) throws RemoteException;
}
