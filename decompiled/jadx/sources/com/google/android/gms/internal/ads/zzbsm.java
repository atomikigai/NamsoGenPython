package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import i6.h;
import java.util.ArrayList;
import java.util.List;
import n6.c;
import n6.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbsm extends c {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbsm(zzbfr zzbfrVar) {
        try {
            this.zzb = zzbfrVar.zzg();
        } catch (RemoteException e) {
            h.e("", e);
            this.zzb = "";
        }
        try {
            for (Object obj : zzbfrVar.zzh()) {
                zzbfy zzbfyVarZzg = obj instanceof IBinder ? zzbfx.zzg((IBinder) obj) : null;
                if (zzbfyVarZzg != null) {
                    this.zza.add(new zzbso(zzbfyVarZzg));
                }
            }
        } catch (RemoteException e4) {
            h.e("", e4);
        }
    }

    public final List<d> getImages() {
        return this.zza;
    }

    public final CharSequence getText() {
        return this.zzb;
    }
}
