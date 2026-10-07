package jc;

import ic.u;
import ic.v;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements nc.b, d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f5765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f5766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f5767d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f5768a;

    static {
        List listS = vb.j.S(ic.a.class, ic.l.class, ic.p.class, ic.q.class, i2.a.class, ic.r.class, ic.s.class, ic.t.class, u.class, v.class, ic.b.class, ic.c.class, ic.d.class, ic.e.class, ic.f.class, ic.g.class, ic.h.class, ic.i.class, ic.j.class, ic.k.class, ic.m.class, ic.n.class, ic.o.class);
        ArrayList arrayList = new ArrayList(vb.k.U(listS));
        int i = 0;
        for (Object obj : listS) {
            int i10 = i + 1;
            if (i < 0) {
                vb.j.T();
                throw null;
            }
            arrayList.add(new ub.f((Class) obj, Integer.valueOf(i)));
            i = i10;
        }
        f5765b = vb.t.D(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        i.d(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb2 = new StringBuilder("kotlin.jvm.internal.");
            i.b(str);
            sb2.append(pc.g.y0(str, str));
            sb2.append("CompanionObject");
            map3.put(sb2.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f5765b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        f5766c = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(vb.t.A(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            i.b(str2);
            linkedHashMap.put(key, pc.g.y0(str2, str2));
        }
        f5767d = linkedHashMap;
    }

    public e(Class cls) {
        i.e(cls, "jClass");
        this.f5768a = cls;
    }

    @Override // jc.d
    public final Class a() {
        return this.f5768a;
    }

    public final String b() {
        String str;
        Class cls = this.f5768a;
        i.e(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        boolean zIsArray = cls.isArray();
        HashMap map = f5766c;
        if (!zIsArray) {
            String str2 = (String) map.get(cls.getName());
            return str2 == null ? cls.getCanonicalName() : str2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (str = (String) map.get(componentType.getName())) != null) {
            strConcat = str.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final String c() {
        String str;
        Class cls = this.f5768a;
        i.e(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean zIsArray = cls.isArray();
            LinkedHashMap linkedHashMap = f5767d;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(cls.getName());
                return str2 == null ? cls.getSimpleName() : str2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return pc.g.x0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return pc.g.x0(simpleName, enclosingConstructor.getName() + '$');
        }
        int iJ0 = pc.g.j0(simpleName, '$', 0, 6);
        if (iJ0 == -1) {
            return simpleName;
        }
        String strSubstring = simpleName.substring(iJ0 + 1, simpleName.length());
        i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean d(Object obj) {
        Class clsS = this.f5768a;
        i.e(clsS, "jClass");
        Map map = f5765b;
        i.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(clsS);
        if (num != null) {
            return t.b(num.intValue(), obj);
        }
        if (clsS.isPrimitive()) {
            clsS = jd.d.s(r.a(clsS));
        }
        return clsS.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && jd.d.s(this).equals(jd.d.s((nc.b) obj));
    }

    public final int hashCode() {
        return jd.d.s(this).hashCode();
    }

    public final String toString() {
        return this.f5768a + " (Kotlin reflection is not available)";
    }
}
