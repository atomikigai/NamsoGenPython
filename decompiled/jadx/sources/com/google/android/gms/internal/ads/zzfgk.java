package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import d6.p;
import e6.g1;
import e6.h1;
import e6.w2;
import h6.r0;
import i6.h;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfgk {
    private static zzfgk zza;
    private final Context zzb;
    private final h1 zzc;
    private final AtomicReference zzd = new AtomicReference();

    public zzfgk(Context context, h1 h1Var) {
        this.zzb = context;
        this.zzc = h1Var;
    }

    public static h1 zza(Context context) {
        try {
            return g1.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            h.e("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    public static zzfgk zzd(Context context) {
        synchronized (zzfgk.class) {
            try {
                zzfgk zzfgkVar = zza;
                if (zzfgkVar != null) {
                    return zzfgkVar;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) zzbeo.zzb.zze()).longValue();
                h1 h1VarZza = null;
                if (jLongValue > 0 && jLongValue <= 243799202) {
                    h1VarZza = zza(applicationContext);
                }
                zzfgk zzfgkVar2 = new zzfgk(applicationContext, h1VarZza);
                zza = zzfgkVar2;
                return zzfgkVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final w2 zzg() {
        h1 h1Var = this.zzc;
        if (h1Var != null) {
            try {
                return h1Var.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final zzbpg zzb() {
        return (zzbpg) this.zzd.get();
    }

    public final i6.a zzc(int i, boolean z4, int i10) {
        w2 w2VarZzg;
        r0 r0Var = p.C.f2979c;
        boolean zD = r0.d(this.zzb);
        i6.a aVar = new i6.a(243799000, i10, 0, true, zD);
        return (((Boolean) zzbeo.zzc.zze()).booleanValue() && (w2VarZzg = zzg()) != null) ? new i6.a(243799000, w2VarZzg.f3459b, 0, true, zD) : aVar;
    }

    public final String zze() {
        w2 w2VarZzg = zzg();
        if (w2VarZzg != null) {
            return w2VarZzg.f3460c;
        }
        return null;
    }

    public final void zzf(zzbpg zzbpgVar) {
        zzbpg adapterCreator;
        if (!((Boolean) zzbeo.zza.zze()).booleanValue()) {
            zzfgj.zza(this.zzd, null, zzbpgVar);
            return;
        }
        h1 h1Var = this.zzc;
        if (h1Var == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = h1Var.getAdapterCreator();
            } catch (RemoteException unused) {
                adapterCreator = null;
            }
        }
        AtomicReference atomicReference = this.zzd;
        if (adapterCreator != null) {
            zzbpgVar = adapterCreator;
        }
        zzfgj.zza(atomicReference, null, zzbpgVar);
    }
}
