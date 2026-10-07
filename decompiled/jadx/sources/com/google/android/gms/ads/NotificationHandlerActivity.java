package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbpc;
import com.google.android.gms.internal.ads.zzbsz;
import e6.f;
import e6.q;
import e6.s;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class NotificationHandlerActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            q qVar = s.f3427f.f3429b;
            zzbpc zzbpcVar = new zzbpc();
            qVar.getClass();
            zzbsz zzbszVar = (zzbsz) new f(this, zzbpcVar).d(this, false);
            if (zzbszVar == null) {
                h.d("OfflineUtils is null");
            } else {
                zzbszVar.zze(getIntent());
            }
        } catch (RemoteException e) {
            h.d("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
