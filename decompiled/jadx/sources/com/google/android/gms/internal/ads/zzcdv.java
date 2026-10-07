package com.google.android.gms.internal.ads;

import i6.d;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcdv extends zzcdr {
    public zzcdv(zzccf zzccfVar) {
        super(zzccfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final boolean zzt(String str) {
        String strA = d.a(str, "MD5");
        zzccf zzccfVar = (zzccf) this.zzc.get();
        if (zzccfVar != null && strA != null) {
            zzccfVar.zzt(strA, this);
        }
        h.g("VideoStreamNoopCache is doing nothing.");
        zzg(str, strA, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final void zzf() {
    }
}
