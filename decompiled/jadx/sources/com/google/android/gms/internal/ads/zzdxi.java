package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import p7.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdxi implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;

    public zzdxi(zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return c.a((Context) this.zza.zzb()).f(0, ((zzdxg) this.zzb).zzb().packageName);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
