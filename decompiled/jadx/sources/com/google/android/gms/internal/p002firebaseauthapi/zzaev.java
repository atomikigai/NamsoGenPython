package com.google.android.gms.internal.p002firebaseauthapi;

import v9.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaev implements Runnable {
    final /* synthetic */ zzaex zza;
    final /* synthetic */ zzaew zzb;

    public zzaev(zzaew zzaewVar, zzaex zzaexVar) {
        this.zzb = zzaewVar;
        this.zza = zzaexVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb.zza.zzl) {
            try {
                if (!this.zzb.zza.zzl.isEmpty()) {
                    this.zza.zza((v) this.zzb.zza.zzl.get(0), new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
