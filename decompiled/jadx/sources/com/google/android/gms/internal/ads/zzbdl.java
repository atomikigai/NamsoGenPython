package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbdl extends o.a {
    final /* synthetic */ zzbdm zza;

    public zzbdl(zzbdm zzbdmVar) {
        this.zza = zzbdmVar;
    }

    @Override // o.a
    public final void onNavigationEvent(int i, Bundle bundle) {
        this.zza.zze(i);
    }
}
