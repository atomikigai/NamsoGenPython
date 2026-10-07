package com.google.android.gms.internal.consent_sdk;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import h3.p1;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import jd.d;
import l9.b;
import l9.c;
import l9.i;
import l9.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzay implements c {
    private final Application zzb;
    private final zzbt zzc;
    private final zzam zzd;
    private final zzbm zze;
    private final zzdp zzf;
    private Dialog zzg;
    private zzbr zzh;
    private final AtomicBoolean zzi = new AtomicBoolean();
    private final AtomicReference zzj = new AtomicReference();
    private final AtomicReference zzk = new AtomicReference();
    private final AtomicReference zzl = new AtomicReference();
    boolean zza = false;

    public zzay(Application application, zzab zzabVar, zzbt zzbtVar, zzam zzamVar, zzbm zzbmVar, zzdp zzdpVar) {
        this.zzb = application;
        this.zzc = zzbtVar;
        this.zzd = zzamVar;
        this.zze = zzbmVar;
        this.zzf = zzdpVar;
    }

    private final void zzk() {
        Dialog dialog = this.zzg;
        if (dialog != null) {
            dialog.dismiss();
            this.zzg = null;
        }
        this.zzc.zza(null);
        zzav zzavVar = (zzav) this.zzl.getAndSet(null);
        if (zzavVar != null) {
            zzavVar.zzb();
        }
    }

    @Override // l9.c
    public final void show(Activity activity, b bVar) {
        zzco.zza();
        if (!this.zzi.compareAndSet(false, true)) {
            ((p1) bVar).a(new zzg(3, true != this.zza ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.").zza());
            return;
        }
        this.zzh.zzc();
        zzav zzavVar = new zzav(this, activity);
        this.zzb.registerActivityLifecycleCallbacks(zzavVar);
        this.zzl.set(zzavVar);
        this.zzc.zza(activity);
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.zzh);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            ((p1) bVar).a(new zzg(3, "Activity with null windows is passed in.").zza());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        d.F(window, false);
        this.zzk.set(bVar);
        dialog.show();
        this.zzg = dialog;
        this.zzh.zzd("UMP_messagePresented", "");
    }

    public final zzbr zzc() {
        return this.zzh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzf(j jVar, i iVar) {
        zzbr zzbrVarZzb = ((zzbs) this.zzf).zza();
        this.zzh = zzbrVarZzb;
        zzbrVarZzb.setBackgroundColor(0);
        zzbrVarZzb.getSettings().setJavaScriptEnabled(true);
        zzbrVarZzb.setWebViewClient(new zzbp(zzbrVarZzb, null));
        this.zzj.set(new zzaw(jVar, iVar, 0 == true ? 1 : 0));
        zzbr zzbrVar = this.zzh;
        zzbm zzbmVar = this.zze;
        zzbrVar.loadDataWithBaseURL(zzbmVar.zza(), zzbmVar.zzb(), "text/html", "UTF-8", null);
        zzco.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzau
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj(new zzg(4, "Web view timed out."));
            }
        }, 10000L);
    }

    public final void zzg(int i) {
        zzk();
        b bVar = (b) this.zzk.getAndSet(null);
        if (bVar == null) {
            return;
        }
        this.zzd.zzg(3);
        ((p1) bVar).a(null);
    }

    public final void zzh(zzg zzgVar) {
        zzk();
        b bVar = (b) this.zzk.getAndSet(null);
        if (bVar == null) {
            return;
        }
        ((p1) bVar).a(zzgVar.zza());
    }

    public final void zzi() {
        zzaw zzawVar = (zzaw) this.zzj.getAndSet(null);
        if (zzawVar == null) {
            return;
        }
        zzawVar.onConsentFormLoadSuccess(this);
    }

    public final void zzj(zzg zzgVar) {
        zzaw zzawVar = (zzaw) this.zzj.getAndSet(null);
        if (zzawVar == null) {
            return;
        }
        zzawVar.onConsentFormLoadFailure(zzgVar.zza());
    }
}
