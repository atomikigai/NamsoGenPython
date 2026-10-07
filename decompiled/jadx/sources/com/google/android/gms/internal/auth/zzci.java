package com.google.android.gms.internal.auth;

import android.net.Uri;
import r.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzci {
    private final k zza;

    public zzci(k kVar) {
        this.zza = kVar;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        k kVar = (k) this.zza.get(uri.toString());
        if (kVar == null) {
            return null;
        }
        return (String) kVar.get("".concat(String.valueOf(str3)));
    }
}
