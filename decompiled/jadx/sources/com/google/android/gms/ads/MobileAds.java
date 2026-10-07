package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.i0;
import e6.t2;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class MobileAds {
    private static void setPlugin(String str) {
        t2 t2VarE = t2.e();
        synchronized (t2VarE.e) {
            i0.k("MobileAds.initialize() must be called prior to setting the plugin.", t2VarE.f3445f != null);
            try {
                t2VarE.f3445f.zzt(str);
            } catch (RemoteException e) {
                h.e("Unable to set plugin.", e);
            }
        }
    }
}
