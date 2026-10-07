package com.google.android.gms.internal.ads;

import d6.p;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbjd implements zzbjr {
    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        zzcfk zzcfkVar = (zzcfk) obj;
        try {
            zzftl.zzj(zzcfkVar.getContext()).zzk();
            zzftm.zzi(zzcfkVar.getContext()).zzj();
            zzftn.zza(zzcfkVar.getContext()).zzb(null);
        } catch (IOException e) {
            p.C.f2982g.zzw(e, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
