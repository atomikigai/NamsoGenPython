package l7;

import android.util.Base64;
import com.google.android.gms.common.internal.i0;
import da.v;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final void b(StringBuilder sb2, a aVar, Object obj) {
        int i = aVar.f6844b;
        if (i == 11) {
            Class cls = aVar.f6849s;
            i0.i(cls);
            sb2.append(((b) cls.cast(obj)).toString());
        } else {
            if (i != 7) {
                sb2.append(obj);
                return;
            }
            sb2.append("\"");
            sb2.append(n7.d.a((String) obj));
            sb2.append("\"");
        }
    }

    public static final Object zaD(a aVar, Object obj) {
        k7.a aVar2 = aVar.f6852v;
        if (aVar2 != null) {
            obj = (String) aVar2.f6062c.get(((Integer) obj).intValue());
            if (obj == null && aVar2.f6061b.containsKey("gms_unknown")) {
                return "gms_unknown";
            }
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(a aVar, Object obj) {
        int i = aVar.f6846d;
        k7.a aVar2 = aVar.f6852v;
        i0.i(aVar2);
        HashMap map = aVar2.f6061b;
        Integer num = (Integer) map.get((String) obj);
        Integer num2 = num;
        if (num == null) {
            num2 = (Integer) map.get("gms_unknown");
        }
        i0.i(num2);
        String str = aVar.f6847f;
        switch (i) {
            case 0:
                setIntegerInternal(aVar, str, num2.intValue());
                return;
            case 1:
                zaf(aVar, str, (BigInteger) num2);
                return;
            case 2:
                setLongInternal(aVar, str, ((Long) num2).longValue());
                return;
            case 3:
            default:
                throw new IllegalStateException(v.f(i, "Unsupported type for conversion: "));
            case 4:
                zan(aVar, str, ((Double) num2).doubleValue());
                return;
            case 5:
                zab(aVar, str, (BigDecimal) num2);
                return;
            case 6:
                setBooleanInternal(aVar, str, ((Boolean) num2).booleanValue());
                return;
            case 7:
                setStringInternal(aVar, str, (String) num2);
                return;
            case 8:
            case 9:
                setDecodedBytesInternal(aVar, str, (byte[]) num2);
                return;
        }
    }

    public <T extends b> void addConcreteTypeArrayInternal(a aVar, String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends b> void addConcreteTypeInternal(a aVar, String str, T t10) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    public abstract Map<String, a> getFieldMappings();

    public Object getFieldValue(a aVar) {
        String str = aVar.f6847f;
        if (aVar.f6849s == null) {
            return getValueObject(str);
        }
        boolean z4 = getValueObject(str) == null;
        String str2 = aVar.f6847f;
        if (!z4) {
            throw new IllegalStateException(u3.b.b("Concrete field shouldn't be value object: ", str2));
        }
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), null).invoke(this, null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public abstract Object getValueObject(String str);

    public boolean isFieldSet(a aVar) {
        if (aVar.f6846d != 11) {
            return isPrimitiveFieldSet(aVar.f6847f);
        }
        if (aVar.e) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public abstract boolean isPrimitiveFieldSet(String str);

    public void setBooleanInternal(a aVar, String str, boolean z4) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    public void setDecodedBytesInternal(a aVar, String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    public void setIntegerInternal(a aVar, String str, int i) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    public void setLongInternal(a aVar, String str, long j4) {
        throw new UnsupportedOperationException("Long not supported");
    }

    public void setStringInternal(a aVar, String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    public void setStringMapInternal(a aVar, String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    public void setStringsInternal(a aVar, String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    public String toString() {
        Map<String, a> fieldMappings = getFieldMappings();
        StringBuilder sb2 = new StringBuilder(100);
        for (String str : fieldMappings.keySet()) {
            a aVar = fieldMappings.get(str);
            if (isFieldSet(aVar)) {
                Object objZaD = zaD(aVar, getFieldValue(aVar));
                if (sb2.length() == 0) {
                    sb2.append("{");
                } else {
                    sb2.append(",");
                }
                sb2.append("\"");
                sb2.append(str);
                sb2.append("\":");
                if (objZaD != null) {
                    switch (aVar.f6846d) {
                        case 8:
                            sb2.append("\"");
                            sb2.append(Base64.encodeToString((byte[]) objZaD, 0));
                            sb2.append("\"");
                            break;
                        case 9:
                            sb2.append("\"");
                            sb2.append(Base64.encodeToString((byte[]) objZaD, 10));
                            sb2.append("\"");
                            break;
                        case 10:
                            n7.c.o(sb2, (HashMap) objZaD);
                            break;
                        default:
                            if (aVar.f6845c) {
                                ArrayList arrayList = (ArrayList) objZaD;
                                sb2.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb2.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        b(sb2, aVar, obj);
                                    }
                                }
                                sb2.append("]");
                            } else {
                                b(sb2, aVar, objZaD);
                            }
                            break;
                    }
                } else {
                    sb2.append("null");
                }
            }
        }
        if (sb2.length() > 0) {
            sb2.append("}");
        } else {
            sb2.append("{}");
        }
        return sb2.toString();
    }

    public final void zaA(a aVar, String str) {
        if (aVar.f6852v != null) {
            a(aVar, str);
        } else {
            setStringInternal(aVar, aVar.f6847f, str);
        }
    }

    public final void zaB(a aVar, Map map) {
        if (aVar.f6852v != null) {
            a(aVar, map);
        } else {
            setStringMapInternal(aVar, aVar.f6847f, map);
        }
    }

    public final void zaC(a aVar, ArrayList arrayList) {
        if (aVar.f6852v != null) {
            a(aVar, arrayList);
        } else {
            setStringsInternal(aVar, aVar.f6847f, arrayList);
        }
    }

    public final void zaa(a aVar, BigDecimal bigDecimal) {
        if (aVar.f6852v != null) {
            a(aVar, bigDecimal);
        } else {
            zab(aVar, aVar.f6847f, bigDecimal);
        }
    }

    public void zab(a aVar, String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(a aVar, ArrayList arrayList) {
        if (aVar.f6852v != null) {
            a(aVar, arrayList);
        } else {
            zad(aVar, aVar.f6847f, arrayList);
        }
    }

    public void zad(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(a aVar, BigInteger bigInteger) {
        if (aVar.f6852v != null) {
            a(aVar, bigInteger);
        } else {
            zaf(aVar, aVar.f6847f, bigInteger);
        }
    }

    public void zaf(a aVar, String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(a aVar, ArrayList arrayList) {
        if (aVar.f6852v != null) {
            a(aVar, arrayList);
        } else {
            zah(aVar, aVar.f6847f, arrayList);
        }
    }

    public void zah(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(a aVar, boolean z4) {
        if (aVar.f6852v != null) {
            a(aVar, Boolean.valueOf(z4));
        } else {
            setBooleanInternal(aVar, aVar.f6847f, z4);
        }
    }

    public final void zaj(a aVar, ArrayList arrayList) {
        if (aVar.f6852v != null) {
            a(aVar, arrayList);
        } else {
            zak(aVar, aVar.f6847f, arrayList);
        }
    }

    public void zak(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(a aVar, byte[] bArr) {
        if (aVar.f6852v != null) {
            a(aVar, bArr);
        } else {
            setDecodedBytesInternal(aVar, aVar.f6847f, bArr);
        }
    }

    public final void zam(a aVar, double d10) {
        if (aVar.f6852v != null) {
            a(aVar, Double.valueOf(d10));
        } else {
            zan(aVar, aVar.f6847f, d10);
        }
    }

    public void zan(a aVar, String str, double d10) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void zao(a aVar, ArrayList arrayList) {
        if (aVar.f6852v != null) {
            a(aVar, arrayList);
        } else {
            zap(aVar, aVar.f6847f, arrayList);
        }
    }

    public void zap(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(a aVar, float f10) {
        if (aVar.f6852v != null) {
            a(aVar, Float.valueOf(f10));
        } else {
            zar(aVar, aVar.f6847f, f10);
        }
    }

    public void zar(a aVar, String str, float f10) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void zas(a aVar, ArrayList arrayList) {
        if (aVar.f6852v != null) {
            a(aVar, arrayList);
        } else {
            zat(aVar, aVar.f6847f, arrayList);
        }
    }

    public void zat(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void zau(a aVar, int i) {
        if (aVar.f6852v != null) {
            a(aVar, Integer.valueOf(i));
        } else {
            setIntegerInternal(aVar, aVar.f6847f, i);
        }
    }

    public final void zav(a aVar, ArrayList arrayList) {
        if (aVar.f6852v != null) {
            a(aVar, arrayList);
        } else {
            zaw(aVar, aVar.f6847f, arrayList);
        }
    }

    public void zaw(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(a aVar, long j4) {
        if (aVar.f6852v != null) {
            a(aVar, Long.valueOf(j4));
        } else {
            setLongInternal(aVar, aVar.f6847f, j4);
        }
    }

    public final void zay(a aVar, ArrayList arrayList) {
        if (aVar.f6852v != null) {
            a(aVar, arrayList);
        } else {
            zaz(aVar, aVar.f6847f, arrayList);
        }
    }

    public void zaz(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }
}
