package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import i6.h;
import java.util.ArrayList;
import java.util.List;
import z5.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbfs {
    private final zzbfr zza;
    private final List zzb = new ArrayList();
    private String zzc;

    public zzbfs(zzbfr zzbfrVar) {
        zzbfy zzbfwVar;
        this.zza = zzbfrVar;
        try {
            this.zzc = zzbfrVar.zzg();
        } catch (RemoteException e) {
            h.e("", e);
            this.zzc = "";
        }
        try {
            for (Object obj : zzbfrVar.zzh()) {
                if (obj instanceof IBinder) {
                    IBinder iBinder = (IBinder) obj;
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbfwVar = iInterfaceQueryLocalInterface instanceof zzbfy ? (zzbfy) iInterfaceQueryLocalInterface : new zzbfw(iBinder);
                } else {
                    zzbfwVar = null;
                }
                if (zzbfwVar != null) {
                    this.zzb.add(new zzbfz(zzbfwVar));
                }
            }
        } catch (RemoteException e4) {
            h.e("", e4);
        }
    }

    public final List<c> getImages() {
        return this.zzb;
    }

    public final CharSequence getText() {
        return this.zzc;
    }
}
