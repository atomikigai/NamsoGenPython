package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import h6.k0;
import java.util.concurrent.Executor;
import n7.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcoi implements zzaym {
    private zzcfk zza;
    private final Executor zzb;
    private final zzcnu zzc;
    private final n7.a zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcnx zzg = new zzcnx();

    public zzcoi(Executor executor, zzcnu zzcnuVar, n7.a aVar) {
        this.zzb = executor;
        this.zzc = zzcnuVar;
        this.zzd = aVar;
    }

    private final void zzg() {
        try {
            final JSONObject jSONObjectZzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcoh
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzd(jSONObjectZzb);
                    }
                });
            }
        } catch (JSONException e) {
            k0.l("Failed to call video active view js", e);
        }
    }

    public final void zza() {
        this.zze = false;
    }

    public final void zzb() {
        this.zze = true;
        zzg();
    }

    public final /* synthetic */ void zzd(JSONObject jSONObject) {
        this.zza.zzl("AFMA_updateActiveView", jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final void zzdp(zzayl zzaylVar) {
        boolean z4 = this.zzf ? false : zzaylVar.zzj;
        zzcnx zzcnxVar = this.zzg;
        zzcnxVar.zza = z4;
        ((b) this.zzd).getClass();
        zzcnxVar.zzd = SystemClock.elapsedRealtime();
        this.zzg.zzf = zzaylVar;
        if (this.zze) {
            zzg();
        }
    }

    public final void zze(boolean z4) {
        this.zzf = z4;
    }

    public final void zzf(zzcfk zzcfkVar) {
        this.zza = zzcfkVar;
    }
}
