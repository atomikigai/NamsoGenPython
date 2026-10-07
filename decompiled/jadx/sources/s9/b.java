package s9;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzja;
import com.google.android.gms.internal.measurement.zzjb;
import z7.k1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzjb f8456a = zzjb.zzi("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzja f8457b = zzja.zzj("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzja f8458c = zzja.zzi("auto", "app", "am");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzja f8459d = zzja.zzh("_r", "_dbg");
    public static final zzja e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zzja f8460f;

    static {
        zzix zzixVar = new zzix();
        zzixVar.zza(k1.i);
        zzixVar.zza(k1.f11235j);
        e = zzixVar.zzb();
        f8460f = zzja.zzh("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (c(str) && bundle != null) {
            zzja zzjaVar = f8459d;
            int size = zzjaVar.size();
            int i = 0;
            while (i < size) {
                boolean zContainsKey = bundle.containsKey((String) zzjaVar.get(i));
                i++;
                if (zContainsKey) {
                }
            }
            int iHashCode = str.hashCode();
            if (iHashCode != 101200) {
                if (iHashCode != 101230) {
                    if (iHashCode == 3142703 && str.equals("fiam")) {
                        bundle.putString("_cis", "fiam_integration");
                        return true;
                    }
                } else if (str.equals("fdl")) {
                    bundle.putString("_cis", "fdl_integration");
                    return true;
                }
            } else if (str.equals("fcm")) {
                bundle.putString("_cis", "fcm_integration");
                return true;
            }
        }
        return false;
    }

    public static boolean b(String str, Bundle bundle) {
        if (f8457b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        zzja zzjaVar = f8459d;
        int size = zzjaVar.size();
        int i = 0;
        while (i < size) {
            boolean zContainsKey = bundle.containsKey((String) zzjaVar.get(i));
            i++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(String str) {
        return !f8458c.contains(str);
    }

    public static boolean d(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            if (str.equals("fcm") || str.equals("frc")) {
                return true;
            }
        } else if ("_ln".equals(str2)) {
            if (str.equals("fcm") || str.equals("fiam")) {
                return true;
            }
        } else if (!e.contains(str2)) {
            zzja zzjaVar = f8460f;
            int size = zzjaVar.size();
            int i = 0;
            while (i < size) {
                boolean zMatches = str2.matches((String) zzjaVar.get(i));
                i++;
                if (zMatches) {
                }
            }
            return true;
        }
        return false;
    }
}
