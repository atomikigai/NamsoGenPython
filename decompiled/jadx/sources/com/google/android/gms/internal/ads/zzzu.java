package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzzu implements zzbq {
    private final zzcf zza;

    public zzzu(zzcf zzcfVar) {
        this.zza = zzcfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final zzbr zza(Context context, zzm zzmVar, zzp zzpVar, zzch zzchVar, Executor executor, List list, long j4) throws zzce {
        try {
            return ((zzbq) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(zzcf.class).newInstance(this.zza)).zza(context, zzmVar, zzpVar, zzchVar, executor, list, 0L);
        } catch (Exception e) {
            if (e instanceof zzce) {
                throw ((zzce) e);
            }
            throw new zzce(e, -9223372036854775807L);
        }
    }
}
