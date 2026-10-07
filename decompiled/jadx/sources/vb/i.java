package vb;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i extends o {
    public static Object Y(Iterable iterable) {
        jc.i.e(iterable, "<this>");
        if (iterable instanceof List) {
            return Z((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object Z(List list) {
        jc.i.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object a0(List list) {
        jc.i.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object b0(int i, List list) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static final void c0(Iterable iterable, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, ic.l lVar) {
        jc.i.e(iterable, "<this>");
        sb2.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb2.append(charSequence);
            }
            com.bumptech.glide.c.b(sb2, obj, lVar);
        }
        sb2.append(charSequence3);
    }

    public static String e0(Iterable iterable, String str, String str2, String str3, ic.l lVar, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            lVar = null;
        }
        jc.i.e(iterable, "<this>");
        StringBuilder sb2 = new StringBuilder();
        c0(iterable, sb2, str4, str5, str6, "...", lVar);
        return sb2.toString();
    }

    public static ArrayList f0(Collection collection, List list) {
        jc.i.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    public static ArrayList g0(List list, Object obj) {
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(obj);
        return arrayList;
    }

    public static List h0(Iterable iterable) {
        jc.i.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listP0 = p0(iterable);
            if (((ArrayList) listP0).size() > 1) {
                Collections.sort(listP0);
            }
            return listP0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return n0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        jc.i.e(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return h.H(array);
    }

    public static List i0(Iterable iterable, Comparator comparator) {
        jc.i.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listP0 = p0(iterable);
            n.V(listP0, comparator);
            return listP0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return n0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        jc.i.e(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return h.H(array);
    }

    public static List j0(int i, List list) {
        jc.i.e(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(q1.a.j(i, "Requested element count ", " is less than zero.").toString());
        }
        q qVar = q.f9297a;
        if (i == 0) {
            return qVar;
        }
        if (i >= list.size()) {
            return n0(list);
        }
        if (i == 1) {
            return jd.d.D(Y(list));
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i10++;
            if (i10 == i) {
                break;
            }
        }
        int size = arrayList.size();
        if (size != 0) {
            return size != 1 ? arrayList : jd.d.D(arrayList.get(0));
        }
        return qVar;
    }

    public static byte[] k0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            bArr[i] = ((Number) obj).byteValue();
            i++;
        }
        return bArr;
    }

    public static final void l0(Iterable iterable, AbstractCollection abstractCollection) {
        jc.i.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] m0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            iArr[i] = ((Number) obj).intValue();
            i++;
        }
        return iArr;
    }

    public static List n0(Iterable iterable) {
        jc.i.e(iterable, "<this>");
        boolean z4 = iterable instanceof Collection;
        q qVar = q.f9297a;
        if (!z4) {
            List listP0 = p0(iterable);
            ArrayList arrayList = (ArrayList) listP0;
            int size = arrayList.size();
            if (size != 0) {
                return size != 1 ? listP0 : jd.d.D(arrayList.get(0));
            }
            return qVar;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return qVar;
        }
        if (size2 != 1) {
            return new ArrayList(collection);
        }
        return jd.d.D(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static long[] o0(List list) {
        jc.i.e(list, "<this>");
        long[] jArr = new long[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static final List p0(Iterable iterable) {
        jc.i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        l0(iterable, arrayList);
        return arrayList;
    }

    public static Set q0(Iterable iterable) {
        jc.i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(t.A(collection.size()));
                    l0(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set setSingleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                jc.i.d(setSingleton, "singleton(...)");
                return setSingleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            l0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set setSingleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                jc.i.d(setSingleton2, "singleton(...)");
                return setSingleton2;
            }
        }
        return s.f9299a;
    }
}
