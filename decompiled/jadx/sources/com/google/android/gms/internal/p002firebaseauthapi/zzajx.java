package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzajx {
    static final zzajx zza = new zzajx(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final Map zzd;

    public zzajx() {
        this.zzd = new HashMap();
    }

    public static zzajx zza() {
        return zza;
    }

    public final zzaki zzb(zzalp zzalpVar, int i) {
        return (zzaki) this.zzd.get(new zzajw(zzalpVar, i));
    }

    public zzajx(boolean z4) {
        this.zzd = Collections.EMPTY_MAP;
    }
}
