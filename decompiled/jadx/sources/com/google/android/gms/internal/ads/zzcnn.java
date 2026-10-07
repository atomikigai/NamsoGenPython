package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.view.View;
import d6.p;
import e6.h2;
import e6.t;
import h6.r0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcnn implements zzcwm, zzcya, zzcxg, e6.a, zzcxc, zzdec {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzfff zze;
    private final zzfet zzf;
    private final zzfln zzg;
    private final zzfga zzh;
    private final zzavc zzi;
    private final zzbdu zzj;
    private final WeakReference zzk;
    private final WeakReference zzl;
    private final zzcvo zzm;
    private boolean zzn;
    private final AtomicBoolean zzo = new AtomicBoolean();

    public zzcnn(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfff zzfffVar, zzfet zzfetVar, zzfln zzflnVar, zzfga zzfgaVar, View view, zzcfk zzcfkVar, zzavc zzavcVar, zzbdu zzbduVar, zzbdw zzbdwVar, zzfkl zzfklVar, zzcvo zzcvoVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfffVar;
        this.zzf = zzfetVar;
        this.zzg = zzflnVar;
        this.zzh = zzfgaVar;
        this.zzi = zzavcVar;
        this.zzk = new WeakReference(view);
        this.zzl = new WeakReference(zzcfkVar);
        this.zzj = zzbduVar;
        this.zzm = zzcvoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List zzu() {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzla)).booleanValue()) {
            r0 r0Var = p.C.f2979c;
            if (r0.b(this.zza)) {
                Object systemService = this.zza.getSystemService("display");
                Integer numValueOf = systemService instanceof DisplayManager ? Integer.valueOf(((DisplayManager) systemService).getDisplays().length) : null;
                if (numValueOf != null) {
                    int iMin = Math.min(numValueOf.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.zzf.zzd.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(iMin)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.zzf.zzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv() {
        String strZzh;
        int i;
        List list = this.zzf.zzd;
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbce zzbceVar = zzbcn.zzdD;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            strZzh = this.zzi.zzc().zzh(this.zza, (View) this.zzk.get(), null);
        } else {
            strZzh = null;
        }
        if ((((Boolean) tVar.f3440c.zza(zzbcn.zzay)).booleanValue() && this.zze.zzb.zzb.zzh) || !((Boolean) zzbem.zzh.zze()).booleanValue()) {
            this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, false, strZzh, null, zzu()));
            return;
        }
        if (((Boolean) zzbem.zzg.zze()).booleanValue() && ((i = this.zzf.zzb) == 1 || i == 2 || i == 5)) {
        }
        zzgei.zzr((zzgdz) zzgei.zzo(zzgdz.zzu(zzgei.zzh(null)), ((Long) tVar.f3440c.zza(zzbcn.zzbc)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcnm(this, strZzh), this.zzb);
    }

    private final void zzw(final int i, final int i10) {
        View view;
        if (i <= 0 || !((view = (View) this.zzk.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzv();
        } else {
            this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnk
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzp(i, i10);
                }
            }, i10, TimeUnit.MILLISECONDS);
        }
    }

    @Override // e6.a
    public final void onAdClicked() {
        if (!(((Boolean) t.f3437d.f3440c.zza(zzbcn.zzay)).booleanValue() && this.zze.zzb.zzb.zzh) && ((Boolean) zzbem.zzd.zze()).booleanValue()) {
            zzgei.zzr((zzgdz) zzgei.zze(zzgdz.zzu(this.zzj.zza()), Throwable.class, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzcnh
                @Override // com.google.android.gms.internal.ads.zzfwh
                public final Object apply(Object obj) {
                    return "failure_click_attok";
                }
            }, zzcaj.zzf), new zzcnl(this), this.zzb);
            return;
        }
        zzfga zzfgaVar = this.zzh;
        zzfln zzflnVar = this.zzg;
        zzfff zzfffVar = this.zze;
        zzfet zzfetVar = this.zzf;
        zzfgaVar.zzc(zzflnVar.zzc(zzfffVar, zzfetVar, zzfetVar.zzc), true == p.C.f2982g.zzA(this.zza) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzds(zzbwj zzbwjVar, String str, String str2) {
        zzfga zzfgaVar = this.zzh;
        zzfln zzflnVar = this.zzg;
        zzfet zzfetVar = this.zzf;
        zzfgaVar.zza(zzflnVar.zze(zzfetVar, zzfetVar.zzh, zzbwjVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zze() {
        zzfga zzfgaVar = this.zzh;
        zzfln zzflnVar = this.zzg;
        zzfff zzfffVar = this.zze;
        zzfet zzfetVar = this.zzf;
        zzfgaVar.zza(zzflnVar.zzc(zzfffVar, zzfetVar, zzfetVar.zzi));
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzf() {
        zzfga zzfgaVar = this.zzh;
        zzfln zzflnVar = this.zzg;
        zzfff zzfffVar = this.zze;
        zzfet zzfetVar = this.zzf;
        zzfgaVar.zza(zzflnVar.zzc(zzfffVar, zzfetVar, zzfetVar.zzg));
    }

    public final /* synthetic */ void zzn() {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnj
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzv();
            }
        });
    }

    public final /* synthetic */ void zzo(int i, int i10) {
        zzw(i - 1, i10);
    }

    public final /* synthetic */ void zzp(final int i, final int i10) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcni
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzo(i, i10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzq(h2 h2Var) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbB)).booleanValue()) {
            this.zzh.zza(this.zzg.zzc(this.zze, this.zzf, zzfln.zzf(2, h2Var.f3314a, this.zzf.zzo)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzr() {
        if (this.zzo.compareAndSet(false, true)) {
            zzbce zzbceVar = zzbcn.zzdM;
            t tVar = t.f3437d;
            int iIntValue = ((Integer) tVar.f3440c.zza(zzbceVar)).intValue();
            if (iIntValue > 0) {
                zzw(iIntValue, ((Integer) tVar.f3440c.zza(zzbcn.zzdN)).intValue());
                return;
            }
            if (((Boolean) tVar.f3440c.zza(zzbcn.zzdL)).booleanValue()) {
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcng
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzn();
                    }
                });
            } else {
                zzv();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final synchronized void zzs() {
        zzcvo zzcvoVar;
        try {
            if (this.zzn) {
                ArrayList arrayList = new ArrayList(zzu());
                arrayList.addAll(this.zzf.zzf);
                this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, true, null, null, arrayList));
            } else {
                zzfga zzfgaVar = this.zzh;
                zzfln zzflnVar = this.zzg;
                zzfff zzfffVar = this.zze;
                zzfet zzfetVar = this.zzf;
                zzfgaVar.zza(zzflnVar.zzc(zzfffVar, zzfetVar, zzfetVar.zzm));
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdI)).booleanValue() && (zzcvoVar = this.zzm) != null) {
                    List listZzh = zzfln.zzh(zzfln.zzg(zzcvoVar.zzb().zzm, zzcvoVar.zza().zzg()), this.zzm.zza().zza());
                    zzfga zzfgaVar2 = this.zzh;
                    zzfln zzflnVar2 = this.zzg;
                    zzcvo zzcvoVar2 = this.zzm;
                    zzfgaVar2.zza(zzflnVar2.zzc(zzcvoVar2.zzc(), zzcvoVar2.zzb(), listZzh));
                }
                zzfga zzfgaVar3 = this.zzh;
                zzfln zzflnVar3 = this.zzg;
                zzfff zzfffVar2 = this.zze;
                zzfet zzfetVar2 = this.zzf;
                zzfgaVar3.zza(zzflnVar3.zzc(zzfffVar2, zzfetVar2, zzfetVar2.zzf));
            }
            this.zzn = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void zzt() {
        zzfga zzfgaVar = this.zzh;
        zzfln zzflnVar = this.zzg;
        zzfff zzfffVar = this.zze;
        zzfet zzfetVar = this.zzf;
        zzfgaVar.zza(zzflnVar.zzc(zzfffVar, zzfetVar, zzfetVar.zzau));
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzc() {
    }
}
