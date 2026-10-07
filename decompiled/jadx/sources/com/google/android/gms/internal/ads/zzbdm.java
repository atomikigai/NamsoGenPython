package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.text.TextUtils;
import b.b;
import e6.t;
import java.util.concurrent.atomic.AtomicBoolean;
import o.h;
import o.m;
import o.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbdm extends m {
    public static final /* synthetic */ int zza = 0;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private Context zzc;
    private zzdsm zzd;
    private n zze;
    private h zzf;

    private final void zzf(Context context) {
        String strA;
        if (this.zzf != null || context == null || (strA = h.a(context)) == null) {
            return;
        }
        setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(strA)) {
            intent.setPackage(strA);
        }
        context.bindService(intent, this, 33);
    }

    @Override // o.m
    public final void onCustomTabsServiceConnected(ComponentName componentName, h hVar) {
        this.zzf = hVar;
        hVar.getClass();
        try {
            ((b) hVar.f7428a).L();
        } catch (RemoteException unused) {
        }
        this.zze = hVar.b(new zzbdl(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    public final n zza() {
        if (this.zze == null) {
            zzcaj.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdk
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzc();
                }
            });
        }
        return this.zze;
    }

    public final void zzb(Context context, zzdsm zzdsmVar) {
        if (this.zzb.getAndSet(true)) {
            return;
        }
        this.zzc = context;
        this.zzd = zzdsmVar;
        zzf(context);
    }

    public final /* synthetic */ void zzc() {
        zzf(this.zzc);
    }

    public final /* synthetic */ void zzd(int i) {
        zzdsm zzdsmVar = this.zzd;
        if (zzdsmVar != null) {
            zzdsl zzdslVarZza = zzdsmVar.zza();
            zzdslVarZza.zzb("action", "cct_nav");
            zzdslVarZza.zzb("cct_navs", String.valueOf(i));
            zzdslVarZza.zzf();
        }
    }

    public final void zze(final int i) {
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzeE)).booleanValue() || this.zzd == null) {
            return;
        }
        zzcaj.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdj
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd(i);
            }
        });
    }
}
