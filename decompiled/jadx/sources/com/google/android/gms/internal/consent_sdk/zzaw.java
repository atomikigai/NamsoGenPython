package com.google.android.gms.internal.consent_sdk;

import l9.c;
import l9.h;
import l9.i;
import l9.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaw implements j, i {
    private final j zza;
    private final i zzb;

    public /* synthetic */ zzaw(j jVar, i iVar, zzax zzaxVar) {
        this.zza = jVar;
        this.zzb = iVar;
    }

    @Override // l9.i
    public final void onConsentFormLoadFailure(h hVar) {
        this.zzb.onConsentFormLoadFailure(hVar);
    }

    @Override // l9.j
    public final void onConsentFormLoadSuccess(c cVar) {
        this.zza.onConsentFormLoadSuccess(cVar);
    }
}
