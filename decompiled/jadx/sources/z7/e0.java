package z7;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference f11100b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f11101c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference f11102d = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f11103a;

    public e0(s0 s0Var) {
        this.f11103a = s0Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        com.google.android.gms.common.internal.i0.i(atomicReference);
        com.google.android.gms.common.internal.i0.b(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            Object obj = strArr[i];
            if (str == obj || str.equals(obj)) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbB = u.e.b("[");
        for (Object obj : objArr) {
            String strB = obj instanceof Bundle ? b((Bundle) obj) : String.valueOf(obj);
            if (strB != null) {
                if (sbB.length() != 1) {
                    sbB.append(", ");
                }
                sbB.append(strB);
            }
        }
        sbB.append("]");
        return sbB.toString();
    }

    public final String b(Bundle bundle) {
        String strA;
        if (bundle == null) {
            return null;
        }
        if (!this.f11103a.b()) {
            return bundle.toString();
        }
        StringBuilder sbB = u.e.b("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbB.length() != 8) {
                sbB.append(", ");
            }
            sbB.append(e(str));
            sbB.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strA = a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strA = a((Object[]) obj);
            } else {
                strA = obj instanceof ArrayList ? a(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sbB.append(strA);
        }
        sbB.append("}]");
        return sbB.toString();
    }

    public final String c(q qVar) {
        String string;
        s0 s0Var = this.f11103a;
        if (!s0Var.b()) {
            return qVar.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(qVar.f11304c);
        sb2.append(",name=");
        sb2.append(d(qVar.f11302a));
        sb2.append(",params=");
        p pVar = qVar.f11303b;
        if (pVar == null) {
            string = null;
        } else {
            string = !s0Var.b() ? pVar.f11292a.toString() : b(pVar.g());
        }
        sb2.append(string);
        return sb2.toString();
    }

    public final String d(String str) {
        if (str == null) {
            return null;
        }
        return !this.f11103a.b() ? str : g(str, k1.f11231c, k1.f11229a, f11100b);
    }

    public final String e(String str) {
        if (str == null) {
            return null;
        }
        return !this.f11103a.b() ? str : g(str, k1.f11233f, k1.e, f11101c);
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        if (this.f11103a.b()) {
            return str.startsWith("_exp_") ? da.v.i("experiment_id(", str, ")") : g(str, k1.f11235j, k1.i, f11102d);
        }
        return str;
    }
}
