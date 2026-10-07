package z7;

import android.os.Bundle;
import java.util.EnumMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j1 f11214c = new j1(null, null, 100);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumMap f11215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11216b;

    public j1(Boolean bool, Boolean bool2, int i) {
        EnumMap enumMap = new EnumMap(i1.class);
        this.f11215a = enumMap;
        enumMap.put(i1.AD_STORAGE, bool);
        enumMap.put(i1.ANALYTICS_STORAGE, bool2);
        this.f11216b = i;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    public static j1 a(int i, Bundle bundle) {
        Boolean bool;
        if (bundle == null) {
            return new j1(null, null, i);
        }
        EnumMap enumMap = new EnumMap(i1.class);
        for (i1 i1Var : i1.values()) {
            String string = bundle.getString(i1Var.f11202a);
            if (string == null) {
                bool = null;
            } else if (string.equals("granted")) {
                bool = Boolean.TRUE;
            } else if (string.equals("denied")) {
                bool = Boolean.FALSE;
            } else {
                bool = null;
            }
            enumMap.put(i1Var, bool);
        }
        return new j1(enumMap, i);
    }

    public static j1 b(int i, String str) {
        EnumMap enumMap = new EnumMap(i1.class);
        if (str != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                i1 i1Var = i1.f11201d[i10];
                int i11 = i10 + 2;
                if (i11 < str.length()) {
                    char cCharAt = str.charAt(i11);
                    Boolean bool = null;
                    if (cCharAt != '-') {
                        if (cCharAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (cCharAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put(i1Var, bool);
                }
            }
        }
        return new j1(enumMap, i);
    }

    public final j1 c(j1 j1Var) {
        EnumMap enumMap = new EnumMap(i1.class);
        for (i1 i1Var : i1.values()) {
            Boolean boolValueOf = (Boolean) this.f11215a.get(i1Var);
            Boolean bool = (Boolean) j1Var.f11215a.get(i1Var);
            if (boolValueOf == null) {
                boolValueOf = bool;
            } else if (bool != null) {
                boolValueOf = Boolean.valueOf(boolValueOf.booleanValue() && bool.booleanValue());
            }
            enumMap.put(i1Var, boolValueOf);
        }
        return new j1(enumMap, 100);
    }

    public final j1 d(j1 j1Var) {
        EnumMap enumMap = new EnumMap(i1.class);
        for (i1 i1Var : i1.values()) {
            Boolean bool = (Boolean) this.f11215a.get(i1Var);
            if (bool == null) {
                bool = (Boolean) j1Var.f11215a.get(i1Var);
            }
            enumMap.put(i1Var, bool);
        }
        return new j1(enumMap, this.f11216b);
    }

    public final String e() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (int i = 0; i < 2; i++) {
            Boolean bool = (Boolean) this.f11215a.get(i1.f11201d[i]);
            sb2.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        char c10;
        if (obj instanceof j1) {
            j1 j1Var = (j1) obj;
            i1[] i1VarArrValues = i1.values();
            int length = i1VarArrValues.length;
            int i = 0;
            while (true) {
                char c11 = 1;
                if (i < length) {
                    i1 i1Var = i1VarArrValues[i];
                    Boolean bool = (Boolean) this.f11215a.get(i1Var);
                    if (bool == null) {
                        c10 = 0;
                    } else {
                        c10 = bool.booleanValue() ? (char) 1 : (char) 2;
                    }
                    Boolean bool2 = (Boolean) j1Var.f11215a.get(i1Var);
                    if (bool2 == null) {
                        c11 = 0;
                    } else if (!bool2.booleanValue()) {
                        c11 = 2;
                    }
                    if (c10 != c11) {
                        break;
                    }
                    i++;
                } else if (this.f11216b == j1Var.f11216b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f(i1 i1Var) {
        Boolean bool = (Boolean) this.f11215a.get(i1Var);
        return bool == null || bool.booleanValue();
    }

    public final boolean g(j1 j1Var, i1... i1VarArr) {
        for (i1 i1Var : i1VarArr) {
            Boolean bool = (Boolean) this.f11215a.get(i1Var);
            Boolean bool2 = (Boolean) j1Var.f11215a.get(i1Var);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f11216b * 17;
        for (Boolean bool : this.f11215a.values()) {
            i = (i * 31) + (bool == null ? 0 : bool.booleanValue() ? 1 : 2);
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("settings: source=");
        sb2.append(this.f11216b);
        for (i1 i1Var : i1.values()) {
            sb2.append(", ");
            sb2.append(i1Var.name());
            sb2.append("=");
            Boolean bool = (Boolean) this.f11215a.get(i1Var);
            if (bool == null) {
                sb2.append("uninitialized");
            } else {
                sb2.append(true != bool.booleanValue() ? "denied" : "granted");
            }
        }
        return sb2.toString();
    }

    public j1(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(i1.class);
        this.f11215a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f11216b = i;
    }
}
