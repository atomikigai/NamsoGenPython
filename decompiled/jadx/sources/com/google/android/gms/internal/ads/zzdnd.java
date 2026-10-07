package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.i0;
import d6.p;
import e6.j2;
import i6.h;
import java.util.Collections;
import java.util.Map;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdnd extends zzbmd implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbfk {
    private View zza;
    private j2 zzb;
    private zzdit zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdnd(zzdit zzditVar, zzdiy zzdiyVar) {
        this.zza = zzdiyVar.zzf();
        this.zzb = zzdiyVar.zzj();
        this.zzc = zzditVar;
        if (zzdiyVar.zzs() != null) {
            zzdiyVar.zzs().zzap(this);
        }
    }

    private final void zzg() {
        View view;
        zzdit zzditVar = this.zzc;
        if (zzditVar == null || (view = this.zza) == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        zzditVar.zzB(view, map, map, zzdit.zzY(view));
    }

    private final void zzh() {
        View view = this.zza;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.zza);
        }
    }

    private static final void zzi(zzbmh zzbmhVar, int i) {
        try {
            zzbmhVar.zze(i);
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzg();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final j2 zzb() throws RemoteException {
        i0.d("#008 Must be called on the main UI thread.");
        if (!this.zzd) {
            return this.zzb;
        }
        h.d("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final zzbfv zzc() {
        i0.d("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            h.d("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdit zzditVar = this.zzc;
        if (zzditVar == null || zzditVar.zzc() == null) {
            return null;
        }
        return zzditVar.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzd() throws RemoteException {
        i0.d("#008 Must be called on the main UI thread.");
        zzh();
        zzdit zzditVar = this.zzc;
        if (zzditVar != null) {
            zzditVar.zzb();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zze(q7.a aVar) throws RemoteException {
        i0.d("#008 Must be called on the main UI thread.");
        zzf(aVar, new zzdnc(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzf(q7.a aVar, zzbmh zzbmhVar) throws RemoteException {
        i0.d("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            h.d("Instream ad can not be shown after destroy().");
            zzi(zzbmhVar, 2);
            return;
        }
        View view = this.zza;
        if (view == null || this.zzb == null) {
            h.d("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            zzi(zzbmhVar, 0);
            return;
        }
        if (this.zze) {
            h.d("Instream ad should not be used again.");
            zzi(zzbmhVar, 1);
            return;
        }
        this.zze = true;
        zzh();
        ((ViewGroup) b.I(aVar)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
        zzcaw zzcawVar = p.C.B;
        zzcaw.zza(this.zza, this);
        zzcaw.zzb(this.zza, this);
        zzg();
        try {
            zzbmhVar.zzf();
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }
}
