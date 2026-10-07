package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import e6.t;
import h6.k0;
import h6.m0;
import h6.n0;
import java.util.concurrent.Executor;
import q7.b;
import r7.g;
import z5.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdjy {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final m0 zzb;
    private final zzffo zzc;
    private final zzdjd zzd;
    private final zzdiy zze;
    private final zzdkk zzf;
    private final zzdks zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbfn zzj;
    private final zzdiv zzk;

    public zzdjy(m0 m0Var, zzffo zzffoVar, zzdjd zzdjdVar, zzdiy zzdiyVar, zzdkk zzdkkVar, zzdks zzdksVar, Executor executor, Executor executor2, zzdiv zzdivVar) {
        this.zzb = m0Var;
        this.zzc = zzffoVar;
        this.zzj = zzffoVar.zzi;
        this.zzd = zzdjdVar;
        this.zze = zzdiyVar;
        this.zzf = zzdkkVar;
        this.zzg = zzdksVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdivVar;
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z4) {
        View viewZzf = z4 ? this.zze.zzf() : this.zze.zzg();
        if (viewZzf == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewZzf.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewZzf.getParent()).removeView(viewZzf);
        }
        viewGroup.addView(viewZzf, ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdU)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    public final /* synthetic */ void zza(ViewGroup viewGroup) {
        zzdiy zzdiyVar = this.zze;
        if (zzdiyVar.zzf() != null) {
            boolean z4 = viewGroup != null;
            if (zzdiyVar.zzc() == 2 || zzdiyVar.zzc() == 1) {
                m0 m0Var = this.zzb;
                n0 n0Var = (n0) m0Var;
                n0Var.e(this.zzc.zzf, String.valueOf(zzdiyVar.zzc()), z4);
                return;
            }
            if (zzdiyVar.zzc() == 6) {
                ((n0) this.zzb).e(this.zzc.zzf, "2", z4);
                ((n0) this.zzb).e(this.zzc.zzf, "1", z4);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0195  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzb(zzdku zzdkuVar) {
        ViewGroup viewGroup;
        View viewZze;
        final ViewGroup viewGroup2;
        zzbfv zzbfvVarZza;
        Drawable drawable;
        if (!this.zzd.zzf() && !this.zzd.zze()) {
            viewGroup = null;
            break;
        }
        String[] strArr = {"1098", "3011"};
        int i = 0;
        while (true) {
            if (i >= 2) {
                viewGroup = null;
                break;
            }
            View viewZzg = zzdkuVar.zzg(strArr[i]);
            if (viewZzg != null && (viewZzg instanceof ViewGroup)) {
                viewGroup = (ViewGroup) viewZzg;
                break;
            }
            i++;
        }
        Context context = zzdkuVar.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdiy zzdiyVar = this.zze;
        if (zzdiyVar.zze() != null) {
            zzbfn zzbfnVar = this.zzj;
            viewZze = zzdiyVar.zze();
            if (zzbfnVar != null && viewGroup == null) {
                zzh(layoutParams, zzbfnVar.zze);
                viewZze.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (zzdiyVar.zzl() instanceof zzbfi) {
            zzbfi zzbfiVar = (zzbfi) zzdiyVar.zzl();
            if (viewGroup == null) {
                zzh(layoutParams, zzbfiVar.zzc());
                viewGroup = null;
            }
            View zzbfjVar = new zzbfj(context, zzbfiVar, layoutParams);
            zzbfjVar.setContentDescription((CharSequence) t.f3437d.f3440c.zza(zzbcn.zzdS));
            viewZze = zzbfjVar;
        } else {
            viewZze = null;
        }
        if (viewZze != null) {
            if (viewZze.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewZze.getParent()).removeView(viewZze);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(viewZze);
            } else {
                h hVar = new h(zzdkuVar.zzf().getContext());
                hVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                hVar.addView(viewZze);
                FrameLayout frameLayoutZzh = zzdkuVar.zzh();
                if (frameLayoutZzh != null) {
                    frameLayoutZzh.addView(hVar);
                }
            }
            zzdkuVar.zzq(zzdkuVar.zzk(), viewZze, true);
        }
        zzfzo zzfzoVar = zzdju.zza;
        int size = zzfzoVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                viewGroup2 = null;
                break;
            }
            View viewZzg2 = zzdkuVar.zzg((String) zzfzoVar.get(i10));
            i10++;
            if (viewZzg2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) viewZzg2;
                break;
            }
        }
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjv
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzi(viewGroup2, true)) {
            zzdiy zzdiyVar2 = this.zze;
            if (zzdiyVar2.zzs() != null) {
                zzdiyVar2.zzs().zzar(new zzdjx(zzdkuVar, viewGroup2));
                return;
            }
            return;
        }
        zzbce zzbceVar = zzbcn.zzjH;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() && zzi(viewGroup2, false)) {
            zzdiy zzdiyVar3 = this.zze;
            if (zzdiyVar3.zzq() != null) {
                zzdiyVar3.zzq().zzar(new zzdjx(zzdkuVar, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View viewZzf = zzdkuVar.zzf();
        Context context2 = viewZzf != null ? viewZzf.getContext() : null;
        if (context2 == null || (zzbfvVarZza = this.zzk.zza()) == null) {
            return;
        }
        try {
            q7.a aVarZzi = zzbfvVarZza.zzi();
            if (aVarZzi == null || (drawable = (Drawable) b.I(aVarZzi)) == null) {
                return;
            }
            ImageView imageView = new ImageView(context2);
            imageView.setImageDrawable(drawable);
            q7.a aVarZzj = zzdkuVar.zzj();
            if (aVarZzj == null) {
                imageView.setScaleType(zza);
            } else if (((Boolean) tVar.f3440c.zza(zzbcn.zzgb)).booleanValue()) {
                imageView.setScaleType((ImageView.ScaleType) b.I(aVarZzj));
            } else {
                imageView.setScaleType(zza);
            }
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView);
        } catch (RemoteException unused) {
            i6.h.g("Could not get main image drawable");
        }
    }

    public final void zzc(zzdku zzdkuVar) {
        if (zzdkuVar == null || this.zzf == null || zzdkuVar.zzh() == null || !this.zzd.zzg()) {
            return;
        }
        try {
            zzdkuVar.zzh().addView(this.zzf.zza());
        } catch (zzcfw e) {
            k0.l("web view can not be obtained", e);
        }
    }

    public final void zzd(zzdku zzdkuVar) {
        if (zzdkuVar == null) {
            return;
        }
        Context context = zzdkuVar.zzf().getContext();
        if (g.R(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                i6.h.b("Activity context is needed for policy validator.");
                return;
            }
            if (this.zzg == null || zzdkuVar.zzh() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.zzg.zza(zzdkuVar.zzh(), windowManager), g.K());
            } catch (zzcfw e) {
                k0.l("web view can not be obtained", e);
            }
        }
    }

    public final void zze(final zzdku zzdkuVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjw
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(zzdkuVar);
            }
        });
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    public final boolean zzg(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }
}
