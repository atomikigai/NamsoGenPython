package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f1049f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1053d;
    public final f2.c e;

    public h0(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f1050a = linkedHashMap;
        this.f1051b = new LinkedHashMap();
        this.f1052c = new LinkedHashMap();
        this.f1053d = new LinkedHashMap();
        this.e = new androidx.activity.e(this, 1);
        linkedHashMap.putAll(map);
    }

    public static Bundle a(h0 h0Var) {
        LinkedHashMap linkedHashMap = h0Var.f1050a;
        LinkedHashMap linkedHashMap2 = h0Var.f1051b;
        jc.i.e(linkedHashMap2, "<this>");
        int size = linkedHashMap2.size();
        Iterator it = (size != 0 ? size != 1 ? new LinkedHashMap(linkedHashMap2) : vb.t.E(linkedHashMap2) : vb.r.f9298a).entrySet().iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Set<String> setKeySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(setKeySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : setKeySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                ub.f[] fVarArr = {new ub.f("keys", arrayList), new ub.f("values", arrayList2)};
                Bundle bundle = new Bundle(2);
                while (i < 2) {
                    ub.f fVar = fVarArr[i];
                    String str2 = (String) fVar.f9065a;
                    Object obj = fVar.f9066b;
                    if (obj == null) {
                        bundle.putString(str2, null);
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Byte) {
                        bundle.putByte(str2, ((Number) obj).byteValue());
                    } else if (obj instanceof Character) {
                        bundle.putChar(str2, ((Character) obj).charValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str2, ((Number) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(str2, ((Number) obj).floatValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str2, ((Number) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str2, ((Number) obj).longValue());
                    } else if (obj instanceof Short) {
                        bundle.putShort(str2, ((Number) obj).shortValue());
                    } else if (obj instanceof Bundle) {
                        bundle.putBundle(str2, (Bundle) obj);
                    } else if (obj instanceof CharSequence) {
                        bundle.putCharSequence(str2, (CharSequence) obj);
                    } else if (obj instanceof Parcelable) {
                        bundle.putParcelable(str2, (Parcelable) obj);
                    } else if (obj instanceof boolean[]) {
                        bundle.putBooleanArray(str2, (boolean[]) obj);
                    } else if (obj instanceof byte[]) {
                        bundle.putByteArray(str2, (byte[]) obj);
                    } else if (obj instanceof char[]) {
                        bundle.putCharArray(str2, (char[]) obj);
                    } else if (obj instanceof double[]) {
                        bundle.putDoubleArray(str2, (double[]) obj);
                    } else if (obj instanceof float[]) {
                        bundle.putFloatArray(str2, (float[]) obj);
                    } else if (obj instanceof int[]) {
                        bundle.putIntArray(str2, (int[]) obj);
                    } else if (obj instanceof long[]) {
                        bundle.putLongArray(str2, (long[]) obj);
                    } else if (obj instanceof short[]) {
                        bundle.putShortArray(str2, (short[]) obj);
                    } else if (obj instanceof Object[]) {
                        Class<?> componentType = obj.getClass().getComponentType();
                        jc.i.b(componentType);
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            bundle.putParcelableArray(str2, (Parcelable[]) obj);
                        } else if (String.class.isAssignableFrom(componentType)) {
                            bundle.putStringArray(str2, (String[]) obj);
                        } else if (CharSequence.class.isAssignableFrom(componentType)) {
                            bundle.putCharSequenceArray(str2, (CharSequence[]) obj);
                        } else {
                            if (!Serializable.class.isAssignableFrom(componentType)) {
                                throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str2 + '\"');
                            }
                            bundle.putSerializable(str2, (Serializable) obj);
                        }
                    } else if (obj instanceof Serializable) {
                        bundle.putSerializable(str2, (Serializable) obj);
                    } else if (obj instanceof IBinder) {
                        m0.c.a(bundle, str2, (IBinder) obj);
                    } else if (obj instanceof Size) {
                        m0.d.a(bundle, str2, (Size) obj);
                    } else {
                        if (!(obj instanceof SizeF)) {
                            throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str2 + '\"');
                        }
                        m0.d.b(bundle, str2, (SizeF) obj);
                    }
                    i++;
                }
                return bundle;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str3 = (String) entry.getKey();
            Object objA = ((f2.c) entry.getValue()).a();
            jc.i.e(str3, "key");
            if (objA != null) {
                while (true) {
                    if (i >= 29) {
                        throw new IllegalArgumentException("Can't put value with type " + objA.getClass() + " into saved state");
                    }
                    Class cls = f1049f[i];
                    jc.i.b(cls);
                    if (cls.isInstance(objA)) {
                        break;
                    }
                    i++;
                }
            }
            Object obj2 = h0Var.f1052c.get(str3);
            y yVar = obj2 instanceof y ? (y) obj2 : null;
            if (yVar != null) {
                yVar.j(objA);
            } else {
                linkedHashMap.put(str3, objA);
            }
            uc.g gVar = (uc.g) h0Var.f1053d.get(str3);
            if (gVar != null) {
                uc.i iVar = (uc.i) gVar;
                if (objA == null) {
                    objA = vc.c.f9318b;
                }
                iVar.g(null, objA);
            }
        }
    }

    public h0() {
        this.f1050a = new LinkedHashMap();
        this.f1051b = new LinkedHashMap();
        this.f1052c = new LinkedHashMap();
        this.f1053d = new LinkedHashMap();
        this.e = new androidx.activity.e(this, 1);
    }
}
