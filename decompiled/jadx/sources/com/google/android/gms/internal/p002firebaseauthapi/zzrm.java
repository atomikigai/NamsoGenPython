package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzrm {
    private HashMap zza = new HashMap();

    public final zzro zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzro zzroVar = new zzro(Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzroVar;
    }
}
