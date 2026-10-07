package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import d6.p;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbbh {
    private zzbaw zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    public zzbbh(Context context) {
        this.zzc = context;
    }

    public static /* bridge */ /* synthetic */ void zze(zzbbh zzbbhVar) {
        synchronized (zzbbhVar.zzd) {
            try {
                zzbaw zzbawVar = zzbbhVar.zza;
                if (zzbawVar == null) {
                    return;
                }
                zzbawVar.disconnect();
                zzbbhVar.zza = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Future zzc(zzbax zzbaxVar) {
        zzbbb zzbbbVar = new zzbbb(this);
        zzbbf zzbbfVar = new zzbbf(this, zzbaxVar, zzbbbVar);
        zzbbg zzbbgVar = new zzbbg(this, zzbbbVar);
        synchronized (this.zzd) {
            zzbaw zzbawVar = new zzbaw(this.zzc, p.C.f2992s.a(), zzbbfVar, zzbbgVar);
            this.zza = zzbawVar;
            zzbawVar.checkAvailabilityAndConnect();
        }
        return zzbbbVar;
    }
}
