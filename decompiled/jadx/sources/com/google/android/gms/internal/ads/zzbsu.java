package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import e6.x2;
import i6.h;
import java.util.List;
import n6.d;
import n6.j;
import n6.m;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbsu implements m {
    private final zzbgs zza;
    private j zzb;

    public zzbsu(zzbgs zzbgsVar) {
        this.zza = zzbgsVar;
    }

    public final void destroy() {
        try {
            this.zza.zzl();
        } catch (RemoteException e) {
            h.e("", e);
        }
    }

    public final List<String> getAvailableAssetNames() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e) {
            h.e("", e);
            return null;
        }
    }

    public final String getCustomFormatId() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e) {
            h.e("", e);
            return null;
        }
    }

    public final j getDisplayOpenMeasurement() {
        try {
            if (this.zzb == null && this.zza.zzq()) {
                this.zzb = new zzbsn(this.zza);
            }
        } catch (RemoteException e) {
            h.e("", e);
        }
        return this.zzb;
    }

    public final d getImage(String str) {
        try {
            zzbfy zzbfyVarZzg = this.zza.zzg(str);
            if (zzbfyVarZzg != null) {
                return new zzbso(zzbfyVarZzg);
            }
            return null;
        } catch (RemoteException e) {
            h.e("", e);
            return null;
        }
    }

    public final w5.m getMediaContent() {
        try {
            if (this.zza.zzf() != null) {
                return new x2(this.zza.zzf(), this.zza);
            }
            return null;
        } catch (RemoteException e) {
            h.e("", e);
            return null;
        }
    }

    public final CharSequence getText(String str) {
        try {
            return this.zza.zzj(str);
        } catch (RemoteException e) {
            h.e("", e);
            return null;
        }
    }

    public final void performClick(String str) {
        try {
            this.zza.zzn(str);
        } catch (RemoteException e) {
            h.e("", e);
        }
    }

    public final void recordImpression() {
        try {
            this.zza.zzo();
        } catch (RemoteException e) {
            h.e("", e);
        }
    }
}
