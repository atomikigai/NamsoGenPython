package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import i6.h;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfby {
    public static void zza(AtomicReference atomicReference, zzfbx zzfbxVar) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            zzfbxVar.zza(obj);
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        } catch (NullPointerException e4) {
            h.h("NullPointerException occurs when invoking a method from a delegating listener.", e4);
        }
    }
}
