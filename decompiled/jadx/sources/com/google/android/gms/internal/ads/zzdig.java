package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import e6.j2;
import i6.h;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdig extends zzbfu {
    private final zzdiy zza;
    private q7.a zzb;

    public zzdig(zzdiy zzdiyVar) {
        this.zza = zzdiyVar;
    }

    private static float zzb(q7.a aVar) {
        Drawable drawable;
        if (aVar == null || (drawable = (Drawable) b.I(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final float zze() throws RemoteException {
        if (this.zza.zzb() != 0.0f) {
            return this.zza.zzb();
        }
        if (this.zza.zzj() != null) {
            try {
                return this.zza.zzj().zze();
            } catch (RemoteException e) {
                h.e("Remote exception getting video controller aspect ratio.", e);
                return 0.0f;
            }
        }
        q7.a aVar = this.zzb;
        if (aVar != null) {
            return zzb(aVar);
        }
        zzbfy zzbfyVarZzm = this.zza.zzm();
        if (zzbfyVarZzm == null) {
            return 0.0f;
        }
        float fZzd = (zzbfyVarZzm.zzd() == -1 || zzbfyVarZzm.zzc() == -1) ? 0.0f : zzbfyVarZzm.zzd() / zzbfyVarZzm.zzc();
        return fZzd == 0.0f ? zzb(zzbfyVarZzm.zzf()) : fZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final float zzf() throws RemoteException {
        if (this.zza.zzj() != null) {
            return this.zza.zzj().zzf();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final float zzg() throws RemoteException {
        if (this.zza.zzj() != null) {
            return this.zza.zzj().zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final j2 zzh() throws RemoteException {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final q7.a zzi() throws RemoteException {
        q7.a aVar = this.zzb;
        if (aVar != null) {
            return aVar;
        }
        zzbfy zzbfyVarZzm = this.zza.zzm();
        if (zzbfyVarZzm == null) {
            return null;
        }
        return zzbfyVarZzm.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final void zzj(q7.a aVar) {
        this.zzb = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final boolean zzk() throws RemoteException {
        return this.zza.zzaf();
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final boolean zzl() throws RemoteException {
        return this.zza.zzj() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final void zzm(zzbhg zzbhgVar) {
        if (this.zza.zzj() instanceof zzcgm) {
            ((zzcgm) this.zza.zzj()).zzv(zzbhgVar);
        }
    }
}
