package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import d6.p;
import e6.t;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcmn implements zzclr {
    private final CookieManager zza = p.C.e.h();

    public zzcmn(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzclr
    public final void zza(Map map) {
        if (this.zza == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.zza.setCookie((String) t.f3437d.f3440c.zza(zzbcn.zzaV), str);
            return;
        }
        String str2 = (String) t.f3437d.f3440c.zza(zzbcn.zzaV);
        String cookie = this.zza.getCookie(str2);
        if (cookie != null) {
            List listZze = zzfxd.zzb(zzfwf.zzc(';')).zze(cookie);
            for (int i = 0; i < listZze.size(); i++) {
                CookieManager cookieManager = this.zza;
                Iterator it = zzfxd.zzb(zzfwf.zzc('=')).zzc((String) listZze.get(i)).iterator();
                it.getClass();
                if (!it.hasNext()) {
                    throw new IndexOutOfBoundsException(q1.a.j(0, "position (0) must be less than the number of elements that remained (", ")"));
                }
                cookieManager.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) t.f3437d.f3440c.zza(zzbcn.zzaH))));
            }
        }
    }
}
