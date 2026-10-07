package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import i6.h;
import k6.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbpc extends zzbpf {
    @Override // com.google.android.gms.internal.ads.zzbpg
    public final zzbpj zzb(String str) throws RemoteException {
        try {
            try {
                Class<?> cls = Class.forName(str, false, zzbpc.class.getClassLoader());
                if (e.class.isAssignableFrom(cls)) {
                    return new zzbqh((e) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (k6.a.class.isAssignableFrom(cls)) {
                    return new zzbqh((k6.a) cls.getDeclaredConstructor(null).newInstance(null));
                }
                h.g("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable th) {
                h.h("Could not instantiate mediation adapter: " + str + ". ", th);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            h.b("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new zzbqh(new AdMobAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new zzbqh(new CustomEventAdapter());
            }
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpg
    public final zzbrf zzc(String str) throws RemoteException {
        try {
            return new zzbrs((RtbAdapter) Class.forName(str, false, zzbrj.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpg
    public final boolean zzd(String str) throws RemoteException {
        try {
            return k6.a.class.isAssignableFrom(Class.forName(str, false, zzbpc.class.getClassLoader()));
        } catch (Throwable unused) {
            h.g("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpg
    public final boolean zze(String str) throws RemoteException {
        try {
            return l6.a.class.isAssignableFrom(Class.forName(str, false, zzbpc.class.getClassLoader()));
        } catch (Throwable unused) {
            h.g("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }
}
