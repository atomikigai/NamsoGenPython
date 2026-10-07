package com.google.android.gms.internal.ads;

import e6.y0;
import x5.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaza extends y0 {
    private final e zza;

    public zzaza(e eVar) {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
        this.zza = eVar;
    }

    public final e zzb() {
        return this.zza;
    }

    @Override // e6.z0
    public final void zzc(String str, String str2) {
        this.zza.onAppEvent(str, str2);
    }
}
