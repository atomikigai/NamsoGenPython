package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbpc;
import com.google.android.gms.internal.ads.zzbsz;
import e6.f;
import e6.q;
import e6.s;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        try {
            q qVar = s.f3427f.f3429b;
            zzbpc zzbpcVar = new zzbpc();
            qVar.getClass();
            ((zzbsz) new f(this, zzbpcVar).d(this, false)).zze(intent);
        } catch (RemoteException e) {
            h.d("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }
}
