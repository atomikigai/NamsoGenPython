package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import e6.j2;
import e6.q3;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcqw extends zzcpd {
    private final zzbhp zzc;
    private final Runnable zzd;
    private final Executor zze;

    public zzcqw(zzcrp zzcrpVar, zzbhp zzbhpVar, Runnable runnable, Executor executor) {
        super(zzcrpVar);
        this.zzc = zzbhpVar;
        this.zzd = runnable;
        this.zze = executor;
    }

    public static /* synthetic */ void zzj(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final View zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final j2 zze() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final zzfeu zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final zzfeu zzg() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcrq
    public final void zzk() {
        final zzcqu zzcquVar = new zzcqu(new AtomicReference(this.zzd));
        this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqv
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzl(zzcquVar);
            }
        });
    }

    public final void zzl(Runnable runnable) {
        try {
            if (this.zzc.zze(new b(runnable))) {
                return;
            }
            zzj(((zzcqu) runnable).zza);
        } catch (RemoteException unused) {
            zzj(((zzcqu) runnable).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final void zzi(ViewGroup viewGroup, q3 q3Var) {
    }
}
