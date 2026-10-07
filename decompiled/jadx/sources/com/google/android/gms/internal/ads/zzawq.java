package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzawq extends zzaxt {
    public zzawq(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i, int i10) {
        super(zzawfVar, "ixYfTYsdoNOUTNdQh/wT/2cJJ79pJ44MoQEAe7G5x6Iqy1F1xj2tWQNOQTIxtV7u", "WP0A/iiJ0kwZaUHwj1D1bpbR/N680LqPRhfJ3Mm7j/s=", zzasfVar, i, 89);
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        String str = (String) this.zze.invoke(null, null);
        synchronized (this.zzd) {
            this.zzd.zzg(str);
        }
    }
}
