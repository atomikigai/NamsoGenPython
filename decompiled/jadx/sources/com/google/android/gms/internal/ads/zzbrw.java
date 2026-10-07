package com.google.android.gms.internal.ads;

import g6.l;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbrw implements l {
    final /* synthetic */ zzbry zza;

    public zzbrw(zzbry zzbryVar) {
        this.zza = zzbryVar;
    }

    @Override // g6.l
    public final void zzdH() {
        h.b("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // g6.l
    public final void zzdk() {
        h.b("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // g6.l
    public final void zzdq() {
        h.b("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // g6.l
    public final void zzdr() {
        h.b("Opening AdMobCustomTabsAdapter overlay.");
        zzbry zzbryVar = this.zza;
        zzbryVar.zzb.onAdOpened(zzbryVar);
    }

    @Override // g6.l
    public final void zzdu(int i) {
        h.b("AdMobCustomTabsAdapter overlay is closed.");
        zzbry zzbryVar = this.zza;
        zzbryVar.zzb.onAdClosed(zzbryVar);
    }

    @Override // g6.l
    public final void zzdt() {
    }
}
