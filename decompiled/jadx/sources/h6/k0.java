package h6;

import android.util.Log;
import com.google.android.gms.internal.ads.zzbep;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 extends i6.h {
    public static void k(String str) {
        if (m()) {
            if (str == null || str.length() <= 4000) {
                Log.v("Ads", str);
                return;
            }
            boolean z4 = true;
            for (String str2 : i6.h.f5231a.zzc(str)) {
                if (z4) {
                    Log.v("Ads", str2);
                } else {
                    Log.v("Ads-cont", str2);
                }
                z4 = false;
            }
        }
    }

    public static void l(String str, Throwable th) {
        if (m()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean m() {
        return i6.h.j(2) && ((Boolean) zzbep.zza.zze()).booleanValue();
    }
}
