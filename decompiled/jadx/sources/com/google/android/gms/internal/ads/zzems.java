package com.google.android.gms.internal.ads;

import android.util.Pair;
import e6.c0;
import e6.e1;
import e6.h2;
import e6.s3;
import e6.t;
import e6.y1;
import e6.z;
import e6.z0;
import i6.h;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import x5.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzems implements e, zzczj, zzcya, zzcwp, zzcxg, e6.a, zzcwm, zzcyx, zzcxc, zzdel {
    final zzdsm zza;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicBoolean zzh = new AtomicBoolean(true);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    private final AtomicBoolean zzj = new AtomicBoolean(false);
    final BlockingQueue zzb = new ArrayBlockingQueue(((Integer) t.f3437d.f3440c.zza(zzbcn.zziw)).intValue());

    public zzems(zzdsm zzdsmVar) {
        this.zza = zzdsmVar;
    }

    private final void zzo() {
        if (this.zzi.get() && this.zzj.get()) {
            for (final Pair pair : this.zzb) {
                zzfby.zza(this.zzd, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemd
                    @Override // com.google.android.gms.internal.ads.zzfbx
                    public final void zza(Object obj) {
                        Pair pair2 = pair;
                        ((z0) obj).zzc((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.zzb.clear();
            this.zzh.set(false);
        }
    }

    @Override // e6.a
    public final void onAdClicked() {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkt)).booleanValue()) {
            return;
        }
        zzfby.zza(this.zzc, new zzemq());
    }

    @Override // x5.e
    public final synchronized void onAppEvent(final String str, final String str2) {
        if (!this.zzh.get()) {
            zzfby.zza(this.zzd, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemk
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) {
                    ((z0) obj).zzc(str, str2);
                }
            });
            return;
        }
        if (!this.zzb.offer(new Pair(str, str2))) {
            h.b("The queue for app events is full, dropping the new event.");
            zzdsm zzdsmVar = this.zza;
            if (zzdsmVar != null) {
                zzdsl zzdslVarZza = zzdsmVar.zza();
                zzdslVarZza.zzb("action", "dae_action");
                zzdslVarZza.zzb("dae_name", str);
                zzdslVarZza.zzb("dae_data", str2);
                zzdslVarZza.zzf();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zza() {
        zzfby.zza(this.zzc, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzema
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((z) obj).zzd();
            }
        });
        zzfby.zza(this.zzg, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemb
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((e1) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzb() {
        zzfby.zza(this.zzc, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzeml
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((z) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzc() {
        zzfby.zza(this.zzc, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemn
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((z) obj).zzj();
            }
        });
        zzfby.zza(this.zzg, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemo
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((e1) obj).zzf();
            }
        });
        zzfby.zza(this.zzg, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemp
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((e1) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwp
    public final void zzdB(final h2 h2Var) {
        zzfby.zza(this.zzc, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzeme
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((z) obj).zzf(h2Var);
            }
        });
        zzfby.zza(this.zzc, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemf
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((z) obj).zze(h2Var.f3314a);
            }
        });
        zzfby.zza(this.zzf, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemg
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((c0) obj).zzb(h2Var);
            }
        });
        this.zzh.set(false);
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdG() {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkt)).booleanValue()) {
            zzfby.zza(this.zzc, new zzemq());
        }
        zzfby.zza(this.zzg, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemc
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((e1) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdf() {
        zzfby.zza(this.zzc, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemm
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((z) obj).zzk();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdo(zzfff zzfffVar) {
        this.zzh.set(true);
        this.zzj.set(false);
    }

    public final synchronized z zzg() {
        return (z) this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcyx
    public final void zzh(final s3 s3Var) {
        zzfby.zza(this.zze, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemr
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((y1) obj).B(s3Var);
            }
        });
    }

    public final synchronized z0 zzi() {
        return (z0) this.zzd.get();
    }

    public final void zzj(z zVar) {
        this.zzc.set(zVar);
    }

    public final void zzk(c0 c0Var) {
        this.zzf.set(c0Var);
    }

    public final void zzl(y1 y1Var) {
        this.zze.set(y1Var);
    }

    public final void zzm(z0 z0Var) {
        this.zzd.set(z0Var);
        this.zzi.set(true);
        zzo();
    }

    public final void zzn(e1 e1Var) {
        this.zzg.set(e1Var);
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzq(final h2 h2Var) {
        zzfby.zza(this.zzg, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemj
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((e1) obj).zzd(h2Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzr() {
        zzfby.zza(this.zzc, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzelz
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((z) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final synchronized void zzs() {
        zzfby.zza(this.zzc, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemh
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((z) obj).zzi();
            }
        });
        zzfby.zza(this.zzf, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemi
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((c0) obj).zzc();
            }
        });
        this.zzj.set(true);
        zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdn(zzbvx zzbvxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzds(zzbwj zzbwjVar, String str, String str2) {
    }
}
