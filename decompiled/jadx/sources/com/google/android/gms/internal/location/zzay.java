package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.internal.i0;
import w7.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzay extends zzan {
    private e zza;

    public zzay(e eVar) {
        i0.a("listener can't be null.", eVar != null);
        this.zza = eVar;
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zzb(j jVar) throws RemoteException {
        this.zza.setResult(jVar);
        this.zza = null;
    }
}
