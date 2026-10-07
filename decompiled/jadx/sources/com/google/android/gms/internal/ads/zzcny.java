package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import g6.l;
import h6.k0;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import n7.b;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcny implements zzaym, zzcxh, l, zzcxg {
    private final zzcnt zza;
    private final zzcnu zzb;
    private final zzbou zzd;
    private final Executor zze;
    private final n7.a zzf;
    private final Set zzc = new HashSet();
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcnx zzh = new zzcnx();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzcny(zzbor zzborVar, zzcnu zzcnuVar, Executor executor, zzcnt zzcntVar, n7.a aVar) {
        this.zza = zzcntVar;
        zzboc zzbocVar = zzbof.zza;
        this.zzd = zzborVar.zza("google.afma.activeView.handleUpdate", zzbocVar, zzbocVar);
        this.zzb = zzcnuVar;
        this.zze = executor;
        this.zzf = aVar;
    }

    private final void zzk() {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            this.zza.zzf((zzcfk) it.next());
        }
        this.zza.zze();
    }

    @Override // g6.l
    public final synchronized void zzdH() {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final synchronized void zzdj(Context context) {
        this.zzh.zze = "u";
        zzg();
        zzk();
        this.zzi = true;
    }

    @Override // g6.l
    public final synchronized void zzdk() {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final synchronized void zzdl(Context context) {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final synchronized void zzdm(Context context) {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final synchronized void zzdp(zzayl zzaylVar) {
        zzcnx zzcnxVar = this.zzh;
        zzcnxVar.zza = zzaylVar.zzj;
        zzcnxVar.zzf = zzaylVar;
        zzg();
    }

    public final synchronized void zzg() {
        try {
            if (this.zzj.get() == null) {
                zzj();
                return;
            }
            if (this.zzi || !this.zzg.get()) {
                return;
            }
            try {
                zzcnx zzcnxVar = this.zzh;
                ((b) this.zzf).getClass();
                zzcnxVar.zzd = SystemClock.elapsedRealtime();
                final JSONObject jSONObjectZza = this.zzb.zzb(this.zzh);
                for (final zzcfk zzcfkVar : this.zzc) {
                    this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnw
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcfkVar.zzl("AFMA_updateActiveView", jSONObjectZza);
                        }
                    });
                }
                zzcam.zzb(this.zzd.zzb(jSONObjectZza), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e) {
                k0.l("Failed to call ActiveViewJS", e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzh(zzcfk zzcfkVar) {
        this.zzc.add(zzcfkVar);
        this.zza.zzd(zzcfkVar);
    }

    public final void zzi(Object obj) {
        this.zzj = new WeakReference(obj);
    }

    public final synchronized void zzj() {
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final synchronized void zzr() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zzc(this);
            zzg();
        }
    }

    @Override // g6.l
    public final void zzdq() {
    }

    @Override // g6.l
    public final void zzdr() {
    }

    @Override // g6.l
    public final void zzdt() {
    }

    @Override // g6.l
    public final void zzdu(int i) {
    }
}
