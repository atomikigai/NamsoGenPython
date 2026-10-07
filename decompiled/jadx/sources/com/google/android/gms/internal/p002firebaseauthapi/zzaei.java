package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaei {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzaei";

    private zzaei() {
    }

    public static Object zza(String str, Type type) throws zzaca {
        if (type != String.class) {
            if (type == Void.class) {
                return null;
            }
            try {
                try {
                    return ((zzaek) ((Class) type).getConstructor(null).newInstance(null)).zza(str);
                } catch (Exception e) {
                    throw new zzaca("Json conversion failed! ".concat(String.valueOf(e.getMessage())), e);
                }
            } catch (Exception e4) {
                throw new zzaca("Instantiation of JsonResponse failed! ".concat(type.toString()), e4);
            }
        }
        try {
            zzaga zzagaVar = new zzaga();
            zzagaVar.zzb(str);
            if (zzagaVar.zzd()) {
                return zzagaVar.zzc();
            }
            throw new zzaca("No error message: " + str);
        } catch (Exception e10) {
            throw new zzaca("Json conversion failed! ".concat(String.valueOf(e10.getMessage())), e10);
        }
    }
}
