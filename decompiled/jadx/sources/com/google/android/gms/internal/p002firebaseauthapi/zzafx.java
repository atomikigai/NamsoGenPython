package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n9.g;
import r.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzafx {
    private static final Map zza = new e(0);
    private static final Map zzb = new e(0);

    public static String zza(String str) {
        zzafv zzafvVar;
        Map map = zza;
        synchronized (map) {
            zzafvVar = (zzafv) map.get(str);
        }
        if (zzafvVar != null) {
            return zzh(zzafvVar.zzb(), zzafvVar.zza(), zzafvVar.zzb().contains(":")).concat("emulator/auth/handler");
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static String zzb(String str) {
        zzafv zzafvVar;
        Map map = zza;
        synchronized (map) {
            zzafvVar = (zzafv) map.get(str);
        }
        return (zzafvVar != null ? "".concat(zzh(zzafvVar.zzb(), zzafvVar.zza(), zzafvVar.zzb().contains(":"))) : "https://").concat("www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    public static String zzc(String str) {
        zzafv zzafvVar;
        Map map = zza;
        synchronized (map) {
            zzafvVar = (zzafv) map.get(str);
        }
        return (zzafvVar != null ? "".concat(zzh(zzafvVar.zzb(), zzafvVar.zza(), zzafvVar.zzb().contains(":"))) : "https://").concat("identitytoolkit.googleapis.com/v2");
    }

    public static String zzd(String str) {
        zzafv zzafvVar;
        Map map = zza;
        synchronized (map) {
            zzafvVar = (zzafv) map.get(str);
        }
        return (zzafvVar != null ? "".concat(zzh(zzafvVar.zzb(), zzafvVar.zza(), zzafvVar.zzb().contains(":"))) : "https://").concat("securetoken.googleapis.com/v1");
    }

    public static void zze(String str, zzafw zzafwVar) {
        Map map = zzb;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    ((List) map.get(str)).add(new WeakReference(zzafwVar));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new WeakReference(zzafwVar));
                    map.put(str, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void zzf(g gVar, String str, int i) {
        gVar.a();
        String str2 = gVar.f7361c.f7366a;
        Map map = zza;
        synchronized (map) {
            map.put(str2, new zzafv(str, i));
        }
        Map map2 = zzb;
        synchronized (map2) {
            try {
                if (map2.containsKey(str2)) {
                    Iterator it = ((List) map2.get(str2)).iterator();
                    boolean z4 = false;
                    while (it.hasNext()) {
                        zzafw zzafwVar = (zzafw) ((WeakReference) it.next()).get();
                        if (zzafwVar != null) {
                            zzafwVar.zzk();
                            z4 = true;
                        }
                    }
                    if (!z4) {
                        zza.remove(str2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean zzg(g gVar) {
        Map map = zza;
        gVar.a();
        return map.containsKey(gVar.f7361c.f7366a);
    }

    private static String zzh(String str, int i, boolean z4) {
        if (z4) {
            return "http://[" + str + "]:" + i + "/";
        }
        return "http://" + str + ":" + i + "/";
    }
}
