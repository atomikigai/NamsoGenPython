package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfvs implements ServiceConnection {
    final /* synthetic */ zzfvu zza;

    public /* synthetic */ zzfvs(zzfvu zzfvuVar, zzfvt zzfvtVar) {
        this.zza = zzfvuVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.zza.zzc.zzc("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        this.zza.zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfvq
            @Override // java.lang.Runnable
            public final void run() {
                zzftu zzftuVarZzb = zzftt.zzb(iBinder);
                zzfvs zzfvsVar = this.zza;
                zzfvsVar.zza.zzj = zzftuVarZzb;
                zzfvsVar.zza.zzc.zzc("linkToDeath", new Object[0]);
                try {
                    IInterface iInterface = zzfvsVar.zza.zzj;
                    if (iInterface == null) {
                        throw null;
                    }
                    iInterface.asBinder().linkToDeath(zzfvsVar.zza.zzh, 0);
                    zzfvsVar.zza.zzf = false;
                    synchronized (zzfvsVar.zza.zze) {
                        try {
                            Iterator it = zzfvsVar.zza.zze.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            zzfvsVar.zza.zze.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (RemoteException e) {
                    zzfvsVar.zza.zzc.zzb(e, "linkToDeath failed", new Object[0]);
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zza.zzc.zzc("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        this.zza.zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfvr
            @Override // java.lang.Runnable
            public final void run() {
                zzfvs zzfvsVar = this.zza;
                zzfvsVar.zza.zzc.zzc("unlinkToDeath", new Object[0]);
                IInterface iInterface = zzfvsVar.zza.zzj;
                iInterface.getClass();
                iInterface.asBinder().unlinkToDeath(zzfvsVar.zza.zzh, 0);
                zzfvsVar.zza.zzj = null;
                zzfvsVar.zza.zzf = false;
            }
        });
    }
}
