package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfjb {
    public static final zzfjh zza(Callable callable, Object obj, zzfjj zzfjjVar) {
        return zzb(callable, zzfjjVar.zzb, obj, zzfjjVar);
    }

    public static final zzfjh zzb(Callable callable, zzges zzgesVar, Object obj, zzfjj zzfjjVar) {
        return new zzfjh(zzfjjVar, obj, zzfjj.zza, Collections.EMPTY_LIST, zzgesVar.zzb(callable));
    }

    public static final zzfjh zzc(m9.a aVar, Object obj, zzfjj zzfjjVar) {
        return new zzfjh(zzfjjVar, obj, zzfjj.zza, Collections.EMPTY_LIST, aVar);
    }

    public static final zzfjh zzd(final zzfiw zzfiwVar, zzges zzgesVar, Object obj, zzfjj zzfjjVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfja
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                zzfiwVar.zza();
                return null;
            }
        }, zzgesVar, obj, zzfjjVar);
    }
}
