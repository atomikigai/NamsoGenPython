package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import i6.h;
import q7.b;
import z5.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbfz extends c {
    private final zzbfy zza;
    private final Drawable zzb;
    private final Uri zzc;
    private final double zzd;
    private final int zze;
    private final int zzf;

    public zzbfz(zzbfy zzbfyVar) {
        Drawable drawable;
        double dZzb;
        int iZzd;
        this.zza = zzbfyVar;
        Uri uriZze = null;
        try {
            q7.a aVarZzf = zzbfyVar.zzf();
            drawable = aVarZzf != null ? (Drawable) b.I(aVarZzf) : null;
        } catch (RemoteException e) {
            h.e("", e);
        }
        this.zzb = drawable;
        try {
            uriZze = this.zza.zze();
        } catch (RemoteException e4) {
            h.e("", e4);
        }
        this.zzc = uriZze;
        try {
            dZzb = this.zza.zzb();
        } catch (RemoteException e10) {
            h.e("", e10);
            dZzb = 1.0d;
        }
        this.zzd = dZzb;
        int iZzc = -1;
        try {
            iZzd = this.zza.zzd();
        } catch (RemoteException e11) {
            h.e("", e11);
            iZzd = -1;
        }
        this.zze = iZzd;
        try {
            iZzc = this.zza.zzc();
        } catch (RemoteException e12) {
            h.e("", e12);
        }
        this.zzf = iZzc;
    }

    @Override // z5.c
    public final Drawable getDrawable() {
        return this.zzb;
    }

    @Override // z5.c
    public final double getScale() {
        return this.zzd;
    }

    @Override // z5.c
    public final Uri getUri() {
        return this.zzc;
    }

    @Override // z5.c
    public final int zza() {
        return this.zzf;
    }

    @Override // z5.c
    public final int zzb() {
        return this.zze;
    }
}
