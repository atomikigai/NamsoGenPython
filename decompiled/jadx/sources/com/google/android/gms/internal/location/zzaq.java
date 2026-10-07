package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.location.LocationAvailability;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaq implements n {
    final /* synthetic */ LocationAvailability zza;

    public zzaq(zzar zzarVar, LocationAvailability locationAvailability) {
        this.zza = locationAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final /* synthetic */ void notifyListener(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final void onNotifyListenerFailed() {
    }
}
