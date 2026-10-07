package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzfsm implements Closeable {
    public static zzfsy zza() {
        return new zzfsy();
    }

    public static zzfsy zzb(final int i, zzfsx zzfsxVar) {
        return new zzfsy(new zzfxg() { // from class: com.google.android.gms.internal.ads.zzfsk
            @Override // com.google.android.gms.internal.ads.zzfxg
            public final Object zza() {
                return Integer.valueOf(i);
            }
        }, new zzfxg() { // from class: com.google.android.gms.internal.ads.zzfsl
            @Override // com.google.android.gms.internal.ads.zzfxg
            public final Object zza() {
                return zzfsm.zze();
            }
        }, zzfsxVar);
    }

    public static zzfsy zzc(zzfxg<Integer> zzfxgVar, zzfxg<Integer> zzfxgVar2, zzfsx zzfsxVar) {
        return new zzfsy(zzfxgVar, zzfxgVar2, zzfsxVar);
    }

    public static /* synthetic */ Integer zze() {
        return -1;
    }
}
