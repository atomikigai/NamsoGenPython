package com.google.android.gms.internal.ads;

import a6.b;
import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.internal.i0;
import e6.g;
import e6.q;
import e6.s;
import e6.t;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbkx {
    private final Context zza;
    private final b zzb;
    private zzbkt zzc;

    public zzbkx(Context context, b bVar) {
        i0.i(context);
        i0.i(bVar);
        this.zza = context;
        this.zzb = bVar;
        zzbcn.zza(context);
    }

    public static final boolean zzc(String str) {
        zzbce zzbceVar = zzbcn.zzjC;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            i0.i(str);
            if (str.length() > ((Integer) tVar.f3440c.zza(zzbcn.zzjE)).intValue()) {
                h.b("H5 GMSG exceeds max length");
                return false;
            }
            Uri uri = Uri.parse(str);
            if ("gmsg".equals(uri.getScheme()) && "mobileads.google.com".equals(uri.getHost()) && "/h5ads".equals(uri.getPath())) {
                return true;
            }
        }
        return false;
    }

    private final void zzd() {
        if (this.zzc != null) {
            return;
        }
        Context context = this.zza;
        q qVar = s.f3427f.f3429b;
        zzbpc zzbpcVar = new zzbpc();
        b bVar = this.zzb;
        qVar.getClass();
        this.zzc = (zzbkt) new g(context, zzbpcVar, bVar).d(context, false);
    }

    public final void zza() {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzjC)).booleanValue()) {
            zzd();
            zzbkt zzbktVar = this.zzc;
            if (zzbktVar != null) {
                try {
                    zzbktVar.zze();
                } catch (RemoteException e) {
                    h.i("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final boolean zzb(String str) {
        if (!zzc(str)) {
            return false;
        }
        zzd();
        zzbkt zzbktVar = this.zzc;
        if (zzbktVar == null) {
            return false;
        }
        try {
            zzbktVar.zzf(str);
            return true;
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
            return true;
        }
    }
}
