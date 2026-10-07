package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzgdi extends zzgdn {
    private static final zzger zza = new zzger(zzgdi.class);
    private zzfzj zzb;
    private final boolean zzc;
    private final boolean zzf;

    public zzgdi(zzfzj zzfzjVar, boolean z4, boolean z10) {
        super(zzfzjVar.size());
        this.zzb = zzfzjVar;
        this.zzc = z4;
        this.zzf = z10;
    }

    private final void zzG(int i, Future future) {
        try {
            zzf(i, zzgfj.zza(future));
        } catch (ExecutionException e) {
            zzI(e.getCause());
        } catch (Throwable th) {
            zzI(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzx(zzfzj zzfzjVar) {
        int iZzA = zzA();
        int i = 0;
        zzfwq.zzl(iZzA >= 0, "Less than 0 remaining futures");
        if (iZzA == 0) {
            if (zzfzjVar != null) {
                zzgbu it = zzfzjVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i, future);
                    }
                    i++;
                }
            }
            zzF();
            zzu();
            zzy(2);
        }
    }

    private final void zzI(Throwable th) {
        th.getClass();
        if (this.zzc && !zzd(th) && zzL(zzC(), th)) {
            zzJ(th);
        } else if (th instanceof Error) {
            zzJ(th);
        }
    }

    private static void zzJ(Throwable th) {
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzK, reason: merged with bridge method [inline-methods] */
    public final void zzw(int i, m9.a aVar) {
        try {
            if (aVar.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i, aVar);
            }
        } finally {
            zzx(null);
        }
    }

    private static boolean zzL(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgcy
    public final String zza() {
        zzfzj zzfzjVar = this.zzb;
        return zzfzjVar != null ? "futures=".concat(zzfzjVar.toString()) : super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgcy
    public final void zzb() {
        zzfzj zzfzjVar = this.zzb;
        zzy(1);
        if ((zzfzjVar != null) && isCancelled()) {
            boolean zZzt = zzt();
            zzgbu it = zzfzjVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zZzt);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdn
    public final void zze(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thZzl = zzl();
        Objects.requireNonNull(thZzl);
        zzL(set, thZzl);
    }

    public abstract void zzf(int i, Object obj);

    public abstract void zzu();

    public final void zzv() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzu();
            return;
        }
        if (!this.zzc) {
            final zzfzj zzfzjVar = this.zzf ? this.zzb : null;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzgdh
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzx(zzfzjVar);
                }
            };
            zzgbu it = this.zzb.iterator();
            while (it.hasNext()) {
                m9.a aVar = (m9.a) it.next();
                if (aVar.isDone()) {
                    zzx(zzfzjVar);
                } else {
                    aVar.addListener(runnable, zzgdw.INSTANCE);
                }
            }
            return;
        }
        zzgbu it2 = this.zzb.iterator();
        final int i = 0;
        while (it2.hasNext()) {
            final m9.a aVar2 = (m9.a) it2.next();
            int i10 = i + 1;
            if (aVar2.isDone()) {
                zzw(i, aVar2);
            } else {
                aVar2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgdg
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzw(i, aVar2);
                    }
                }, zzgdw.INSTANCE);
            }
            i = i10;
        }
    }

    public void zzy(int i) {
        this.zzb = null;
    }
}
