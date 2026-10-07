package g6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzdel;
import d6.p;
import e6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends zzbtf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdOverlayInfoParcel f4179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f4180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4181c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4182d = false;
    public boolean e = false;

    public b(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f4179a = adOverlayInfoParcel;
        this.f4180b = activity;
    }

    public final synchronized void y() {
        try {
            if (this.f4182d) {
                return;
            }
            l lVar = this.f4179a.f1965c;
            if (lVar != null) {
                lVar.zzdu(4);
            }
            this.f4182d = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final boolean zzH() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzl(Bundle bundle) {
        l lVar;
        boolean zBooleanValue = ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzix)).booleanValue();
        Activity activity = this.f4180b;
        if (zBooleanValue && !this.e) {
            activity.requestWindowFeature(1);
        }
        boolean z4 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z4 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f4179a;
        if (adOverlayInfoParcel == null) {
            activity.finish();
            return;
        }
        if (z4) {
            activity.finish();
            return;
        }
        if (bundle == null) {
            e6.a aVar = adOverlayInfoParcel.f1964b;
            if (aVar != null) {
                aVar.onAdClicked();
            }
            zzdel zzdelVar = adOverlayInfoParcel.F;
            if (zzdelVar != null) {
                zzdelVar.zzdG();
            }
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (lVar = adOverlayInfoParcel.f1965c) != null) {
                lVar.zzdr();
            }
        }
        b9.e eVar = p.C.f2977a;
        e eVar2 = adOverlayInfoParcel.f1963a;
        if (b9.e.A(activity, eVar2, adOverlayInfoParcel.f1970t, eVar2.f4190t)) {
            return;
        }
        activity.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzm() {
        if (this.f4180b.isFinishing()) {
            y();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzo() {
        l lVar = this.f4179a.f1965c;
        if (lVar != null) {
            lVar.zzdk();
        }
        if (this.f4180b.isFinishing()) {
            y();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzr() {
        if (this.f4181c) {
            this.f4180b.finish();
            return;
        }
        this.f4181c = true;
        l lVar = this.f4179a.f1965c;
        if (lVar != null) {
            lVar.zzdH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f4181c);
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzu() {
        if (this.f4180b.isFinishing()) {
            y();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzv() {
        l lVar = this.f4179a.f1965c;
        if (lVar != null) {
            lVar.zzdt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzx() {
        this.e = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzt() {
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzk(q7.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzh(int i, int i10, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzp(int i, String[] strArr, int[] iArr) {
    }
}
