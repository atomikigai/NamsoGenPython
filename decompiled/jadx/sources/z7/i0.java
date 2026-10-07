package z7;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzpe;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public char f11188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f11189d;
    public String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fd.b f11190f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fd.b f11191r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final fd.b f11192s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fd.b f11193t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final fd.b f11194u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final fd.b f11195v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final fd.b f11196w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final fd.b f11197x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final fd.b f11198y;

    public i0(a1 a1Var) {
        super(a1Var);
        this.f11188c = (char) 0;
        this.f11189d = -1L;
        this.f11190f = new fd.b(this, 6, false, false);
        this.f11191r = new fd.b(this, 6, true, false);
        this.f11192s = new fd.b(this, 6, false, true);
        this.f11193t = new fd.b(this, 5, false, false);
        this.f11194u = new fd.b(this, 5, true, false);
        this.f11195v = new fd.b(this, 5, false, true);
        this.f11196w = new fd.b(this, 4, false, false);
        this.f11197x = new fd.b(this, 3, false, false);
        this.f11198y = new fd.b(this, 2, false, false);
    }

    public static h0 k(String str) {
        if (str == null) {
            return null;
        }
        return new h0(str);
    }

    public static String l(boolean z4, String str, Object obj, Object obj2, Object obj3) {
        String strM = m(obj, z4);
        String strM2 = m(obj2, z4);
        String strM3 = m(obj3, z4);
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strM)) {
            sb2.append(str2);
            sb2.append(strM);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strM2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(strM2);
        }
        if (!TextUtils.isEmpty(strM3)) {
            sb2.append(str3);
            sb2.append(strM3);
        }
        return sb2.toString();
    }

    public static String m(Object obj, boolean z4) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z4) {
                return obj.toString();
            }
            Long l2 = (Long) obj;
            if (Math.abs(l2.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l2.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            StringBuilder sb2 = new StringBuilder();
            String str = cCharAt == '-' ? "-" : "";
            sb2.append(str);
            sb2.append(jRound);
            sb2.append("...");
            sb2.append(str);
            sb2.append(jRound2);
            return sb2.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof h0) {
                return ((h0) obj).f11153a;
            }
            return z4 ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb3 = new StringBuilder(z4 ? th.getClass().getName() : th.toString());
        String strN = n(a1.class.getCanonicalName());
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && n(className).equals(strN)) {
                sb3.append(": ");
                sb3.append(stackTraceElement);
                break;
            }
        }
        return sb3.toString();
    }

    public static String n(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            return str.substring(0, iLastIndexOf);
        }
        zzpe.zzc();
        return ((Boolean) z.f11478r0.a(null)).booleanValue() ? "" : str;
    }

    @Override // z7.f1
    public final boolean d() {
        return false;
    }

    public final fd.b g() {
        return this.f11190f;
    }

    public final fd.b h() {
        return this.f11198y;
    }

    public final fd.b j() {
        return this.f11193t;
    }

    public final String o() {
        String str;
        synchronized (this) {
            try {
                if (this.e == null) {
                    a1 a1Var = (a1) this.f159a;
                    String str2 = a1Var.f11003d;
                    if (str2 != null) {
                        this.e = str2;
                    } else {
                        ((a1) a1Var.f11005r.f159a).getClass();
                        this.e = "FA";
                    }
                }
                com.google.android.gms.common.internal.i0.i(this.e);
                str = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final void p(int i, boolean z4, boolean z10, String str, Object obj, Object obj2, Object obj3) {
        if (!z4 && Log.isLoggable(o(), i)) {
            Log.println(i, o(), l(false, str, obj, obj2, obj3));
        }
        if (z10 || i < 5) {
            return;
        }
        com.google.android.gms.common.internal.i0.i(str);
        z0 z0Var = ((a1) this.f159a).f11008u;
        if (z0Var == null) {
            Log.println(6, o(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!z0Var.f11115b) {
                Log.println(6, o(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            z0Var.l(new g0(this, i, str, obj, obj2, obj3));
        }
    }
}
