package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.i0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcbu {
    private final Context zza;
    private final zzccf zzb;
    private final ViewGroup zzc;
    private zzcbt zzd;

    public zzcbu(Context context, ViewGroup viewGroup, zzcfk zzcfkVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcfkVar;
        this.zzd = null;
    }

    public final zzcbt zza() {
        return this.zzd;
    }

    public final Integer zzb() {
        zzcbt zzcbtVar = this.zzd;
        if (zzcbtVar != null) {
            return zzcbtVar.zzl();
        }
        return null;
    }

    public final void zzc(int i, int i10, int i11, int i12) {
        i0.d("The underlay may only be modified from the UI thread.");
        zzcbt zzcbtVar = this.zzd;
        if (zzcbtVar != null) {
            zzcbtVar.zzF(i, i10, i11, i12);
        }
    }

    public final void zzd(int i, int i10, int i11, int i12, int i13, boolean z4, zzcce zzcceVar) {
        if (this.zzd != null) {
            return;
        }
        zzbcu.zza(this.zzb.zzm().zza(), this.zzb.zzk(), "vpr2");
        Context context = this.zza;
        zzccf zzccfVar = this.zzb;
        zzcbt zzcbtVar = new zzcbt(context, zzccfVar, i13, z4, zzccfVar.zzm().zza(), zzcceVar);
        this.zzd = zzcbtVar;
        this.zzc.addView(zzcbtVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zzd.zzF(i, i10, i11, i12);
        this.zzb.zzz(false);
    }

    public final void zze() {
        i0.d("onDestroy must be called from the UI thread.");
        zzcbt zzcbtVar = this.zzd;
        if (zzcbtVar != null) {
            zzcbtVar.zzo();
            this.zzc.removeView(this.zzd);
            this.zzd = null;
        }
    }

    public final void zzf() {
        i0.d("onPause must be called from the UI thread.");
        zzcbt zzcbtVar = this.zzd;
        if (zzcbtVar != null) {
            zzcbtVar.zzu();
        }
    }

    public final void zzg(int i) {
        zzcbt zzcbtVar = this.zzd;
        if (zzcbtVar != null) {
            zzcbtVar.zzC(i);
        }
    }
}
