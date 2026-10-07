package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.c;
import i6.h;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzeap implements b, c {
    protected final zzcao zza = new zzcao();
    protected boolean zzb = false;
    protected boolean zzc = false;
    protected zzbuu zzd;
    protected Context zze;
    protected Looper zzf;
    protected ScheduledExecutorService zzg;

    @Override // com.google.android.gms.common.internal.b
    public abstract /* synthetic */ void onConnected(Bundle bundle);

    @Override // com.google.android.gms.common.internal.c
    public final void onConnectionFailed(g7.b bVar) {
        Locale locale = Locale.US;
        String str = "Remote ad service connection failed, cause: " + bVar.f4229b + ".";
        h.b(str);
        this.zza.zzd(new zzdyw(1, str));
    }

    @Override // com.google.android.gms.common.internal.b
    public void onConnectionSuspended(int i) {
        Locale locale = Locale.US;
        String str = "Remote ad service connection suspended, cause: " + i + ".";
        h.b(str);
        this.zza.zzd(new zzdyw(1, str));
    }

    public final synchronized void zzb() {
        try {
            if (this.zzd == null) {
                this.zzd = new zzbuu(this.zze, this.zzf, this, this);
            }
            this.zzd.checkAvailabilityAndConnect();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        try {
            this.zzc = true;
            zzbuu zzbuuVar = this.zzd;
            if (zzbuuVar == null) {
                return;
            }
            if (zzbuuVar.isConnected() || this.zzd.isConnecting()) {
                this.zzd.disconnect();
            }
            Binder.flushPendingCommands();
        } catch (Throwable th) {
            throw th;
        }
    }
}
