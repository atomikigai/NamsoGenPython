package com.google.android.gms.internal.ads;

import android.webkit.CookieManager;
import d6.p;
import e6.t;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdxe implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;

    public zzdxe(zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final Object zzb() {
        zzfjr zzfjrVar = (zzfjr) this.zza.zzb();
        final CookieManager cookieManagerH = p.C.e.h();
        zzfjh zzfjhVarZzi = zzfjb.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = cookieManagerH;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) t.f3437d.f3440c.zza(zzbcn.zzaV));
            }
        }, zzfjl.WEBVIEW_COOKIE, zzfjrVar).zzi(1L, TimeUnit.SECONDS);
        final zzfiv zzfivVar = new zzfiv() { // from class: com.google.android.gms.internal.ads.zzdxa
            @Override // com.google.android.gms.internal.ads.zzfiv
            public final Object zza(Object obj) {
                return "";
            }
        };
        return zzfjhVarZzi.zzc(Exception.class, new zzgdp(zzfivVar) { // from class: com.google.android.gms.internal.ads.zzfjc
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return zzgei.zzh("");
            }
        }).zza();
    }
}
