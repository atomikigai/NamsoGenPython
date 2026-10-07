package com.google.android.gms.internal.ads;

import d6.p;
import e6.t;
import h6.n0;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfhy {
    private final zzfhc zza;
    private final zzfhw zzb;
    private final zzfgy zzc;
    private zzfie zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzfhy(zzfhc zzfhcVar, zzfgy zzfgyVar, zzfhw zzfhwVar) {
        this.zza = zzfhcVar;
        this.zzc = zzfgyVar;
        this.zzb = zzfhwVar;
        zzfgyVar.zzb(new zzfht(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzh() {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzgf)).booleanValue() && !((n0) p.C.f2982g.zzi()).n().zzh()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (!this.zzd.isEmpty()) {
                zzfhx zzfhxVar = (zzfhx) this.zzd.pollFirst();
                if (zzfhxVar == null || (zzfhxVar.zza() != null && this.zza.zze(zzfhxVar.zza()))) {
                    zzfie zzfieVar = new zzfie(this.zza, this.zzb, zzfhxVar);
                    this.zze = zzfieVar;
                    zzfieVar.zzd(new zzfhu(this, zzfhxVar));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized m9.a zza(zzfhx zzfhxVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zza(zzfhxVar);
    }

    public final synchronized void zze(zzfhx zzfhxVar) {
        this.zzd.add(zzfhxVar);
    }

    public final /* synthetic */ void zzf() {
        synchronized (this) {
            this.zzf = 1;
            zzh();
        }
    }
}
