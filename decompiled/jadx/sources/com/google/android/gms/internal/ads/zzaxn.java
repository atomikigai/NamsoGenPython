package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaxn extends zzaxt {
    private final zzawm zzh;
    private long zzi;

    public zzaxn(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i, int i10, zzawm zzawmVar) {
        super(zzawfVar, "Atq0HLNiKHjz80ZnAFWvUPfMlGQHg7AXdMxxDL1JZ6bmQmTFxmAmKhIDk2Jnayuk", "Su/GzywZakXq4glBT/l81JrPkq4+JC0EaqCjCuVscxM=", zzasfVar, i, 53);
        this.zzh = zzawmVar;
        if (zzawmVar != null) {
            this.zzi = zzawmVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzh != null) {
            this.zzd.zzP(((Long) this.zze.invoke(null, Long.valueOf(this.zzi))).longValue());
        }
    }
}
