package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzapg {
    private final Executor zza;

    public zzapg(Handler handler) {
        this.zza = new zzape(this, handler);
    }

    public final void zza(zzapp zzappVar, zzapy zzapyVar) {
        zzappVar.zzm("post-error");
        ((zzape) this.zza).zza.post(new zzapf(zzappVar, zzapv.zza(zzapyVar), null));
    }

    public final void zzb(zzapp zzappVar, zzapv zzapvVar, Runnable runnable) {
        zzappVar.zzq();
        zzappVar.zzm("post-response");
        ((zzape) this.zza).zza.post(new zzapf(zzappVar, zzapvVar, runnable));
    }
}
