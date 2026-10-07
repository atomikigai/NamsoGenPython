package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.c;
import i6.h;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzdyh implements b, c {
    protected final zzcao zza = new zzcao();
    protected final Object zzb = new Object();
    protected boolean zzc = false;
    protected boolean zzd = false;
    protected zzbvx zze;
    protected zzbur zzf;

    public static void zzc(Context context, m9.a aVar, Executor executor) {
        if (((Boolean) zzbef.zzj.zze()).booleanValue() || ((Boolean) zzbef.zzh.zze()).booleanValue()) {
            zzgei.zzr(aVar, new zzdye(context), executor);
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public abstract /* synthetic */ void onConnected(Bundle bundle);

    public void onConnectionFailed(g7.b bVar) {
        h.b("Disconnected from remote ad request service.");
        this.zza.zzd(new zzdyw(1));
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnectionSuspended(int i) {
        h.b("Cannot connect to remote service, fallback to local instance.");
    }

    public final void zzb() {
        synchronized (this.zzb) {
            try {
                this.zzd = true;
                if (this.zzf.isConnected() || this.zzf.isConnecting()) {
                    this.zzf.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
