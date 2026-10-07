package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaxd extends zzaxt {
    private final zzavx zzh;

    public zzaxd(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i, int i10, zzavx zzavxVar) {
        super(zzawfVar, "InzZioUCViOMoBpQHwvu/pIx3gXrXGOaM2JpzEjvxDIhnjzi/kaCZRYG9Kg1JwVe", "n5HdSerkTAgTJwRh00NQA14abEqPXtGNhLU/oVUfpWQ=", zzasfVar, i, 94);
        this.zzh = zzavxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int iIntValue = ((Integer) this.zze.invoke(null, this.zzh.zza())).intValue();
        synchronized (this.zzd) {
            this.zzd.zzae(zzasr.zza(iIntValue));
        }
    }
}
