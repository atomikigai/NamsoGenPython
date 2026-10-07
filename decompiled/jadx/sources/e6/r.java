package e6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbei;
import com.google.android.gms.internal.ads.zzbew;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f3420a;

    static {
        b1 a1Var = null;
        try {
            Object objNewInstance = q.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                a1Var = iInterfaceQueryLocalInterface instanceof b1 ? (b1) iInterfaceQueryLocalInterface : new a1(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
            } else {
                i6.h.g("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            i6.h.g("Failed to instantiate ClientApi class.");
        }
        f3420a = a1Var;
    }

    public abstract Object a();

    public abstract Object b(b1 b1Var);

    public abstract Object c();

    public final Object d(Context context, boolean z4) {
        boolean z10;
        Object objC;
        Object objB;
        if (!z4) {
            i6.d dVar = s.f3427f.f3428a;
            if (g7.f.f4241b.d(context, 12451000) != 0) {
                i6.h.b("Google Play Services is not available.");
                z4 = true;
            }
        }
        boolean z11 = false;
        boolean z12 = !(r7.f.a(context, ModuleDescriptor.MODULE_ID) <= r7.f.d(context, ModuleDescriptor.MODULE_ID, false));
        zzbcn.zza(context);
        if (((Boolean) zzbei.zza.zze()).booleanValue()) {
            z10 = false;
        } else if (((Boolean) zzbei.zzb.zze()).booleanValue()) {
            z10 = true;
            z11 = true;
        } else {
            z11 = z4 | z12;
            z10 = false;
        }
        b1 b1Var = f3420a;
        Object objB2 = null;
        if (z11) {
            if (b1Var != null) {
                try {
                    objB = b(b1Var);
                } catch (RemoteException e) {
                    i6.h.h("Cannot invoke local loader using ClientApi class.", e);
                    objB = null;
                }
                if (objB == null && !z10) {
                    try {
                        objB2 = c();
                    } catch (RemoteException e4) {
                        i6.h.h("Cannot invoke remote loader.", e4);
                    }
                    objB = objB2;
                }
            } else {
                i6.h.g("ClientApi class cannot be loaded.");
            }
            objB = null;
            if (objB == null) {
                objB2 = c();
                objB = objB2;
            }
        } else {
            try {
                objC = c();
            } catch (RemoteException e10) {
                i6.h.h("Cannot invoke remote loader.", e10);
                objC = null;
            }
            if (objC == null) {
                int iIntValue = ((Long) zzbew.zza.zze()).intValue();
                s sVar = s.f3427f;
                if (sVar.e.nextInt(iIntValue) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    i6.d dVar2 = sVar.f3428a;
                    String str = sVar.f3431d.f5213a;
                    dVar2.getClass();
                    i6.d.n(context, str, bundle, new wa.d(dVar2));
                }
            }
            if (objC == null) {
                if (b1Var != null) {
                    try {
                        objB2 = b(b1Var);
                    } catch (RemoteException e11) {
                        i6.h.h("Cannot invoke local loader using ClientApi class.", e11);
                    }
                } else {
                    i6.h.g("ClientApi class cannot be loaded.");
                }
                objB = objB2;
            } else {
                objB = objC;
            }
        }
        return objB == null ? a() : objB;
    }
}
