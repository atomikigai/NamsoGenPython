package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfxk {
    public static zzfxg zza(zzfxg zzfxgVar) {
        if ((zzfxgVar instanceof zzfxj) || (zzfxgVar instanceof zzfxh)) {
            return zzfxgVar;
        }
        return zzfxgVar instanceof Serializable ? new zzfxh(zzfxgVar) : new zzfxj(zzfxgVar);
    }
}
