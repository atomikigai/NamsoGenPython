package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzva {
    public final int zza;
    public final zzur zzb;
    private final CopyOnWriteArrayList zzc;

    private zzva(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzur zzurVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzurVar;
    }

    public final zzva zza(int i, zzur zzurVar) {
        return new zzva(this.zzc, 0, zzurVar);
    }

    public final void zzb(Handler handler, zzvb zzvbVar) {
        this.zzc.add(new zzuz(handler, zzvbVar));
    }

    public final void zzc(final zzun zzunVar) {
        for (zzuz zzuzVar : this.zzc) {
            final zzvb zzvbVar = zzuzVar.zzb;
            zzen.zzN(zzuzVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzuu
                @Override // java.lang.Runnable
                public final void run() {
                    zzvbVar.zzaf(0, this.zza.zzb, zzunVar);
                }
            });
        }
    }

    public final void zzd(final zzui zzuiVar, final zzun zzunVar) {
        for (zzuz zzuzVar : this.zzc) {
            final zzvb zzvbVar = zzuzVar.zzb;
            zzen.zzN(zzuzVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzuy
                @Override // java.lang.Runnable
                public final void run() {
                    zzvbVar.zzag(0, this.zza.zzb, zzuiVar, zzunVar);
                }
            });
        }
    }

    public final void zze(final zzui zzuiVar, final zzun zzunVar) {
        for (zzuz zzuzVar : this.zzc) {
            final zzvb zzvbVar = zzuzVar.zzb;
            zzen.zzN(zzuzVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzuw
                @Override // java.lang.Runnable
                public final void run() {
                    zzvbVar.zzah(0, this.zza.zzb, zzuiVar, zzunVar);
                }
            });
        }
    }

    public final void zzf(final zzui zzuiVar, final zzun zzunVar, final IOException iOException, final boolean z4) {
        for (zzuz zzuzVar : this.zzc) {
            final zzvb zzvbVar = zzuzVar.zzb;
            zzen.zzN(zzuzVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzux
                @Override // java.lang.Runnable
                public final void run() {
                    zzvbVar.zzai(0, this.zza.zzb, zzuiVar, zzunVar, iOException, z4);
                }
            });
        }
    }

    public final void zzg(final zzui zzuiVar, final zzun zzunVar) {
        for (zzuz zzuzVar : this.zzc) {
            final zzvb zzvbVar = zzuzVar.zzb;
            zzen.zzN(zzuzVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzuv
                @Override // java.lang.Runnable
                public final void run() {
                    zzvbVar.zzaj(0, this.zza.zzb, zzuiVar, zzunVar);
                }
            });
        }
    }

    public final void zzh(zzvb zzvbVar) {
        for (zzuz zzuzVar : this.zzc) {
            if (zzuzVar.zzb == zzvbVar) {
                this.zzc.remove(zzuzVar);
            }
        }
    }

    public zzva() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
