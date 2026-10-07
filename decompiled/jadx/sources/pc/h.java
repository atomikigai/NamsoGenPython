package pc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import vb.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends com.bumptech.glide.c {
    public static String V(String str) {
        jc.i.e(str, "<this>");
        int i = 2;
        return oc.g.T(new oc.k(new oc.d(str, i), new l3.g("    ", i)), "\n");
    }

    public static String W(String str) {
        List listD;
        Comparable comparable;
        String strSubstring;
        jc.i.e(str, "<this>");
        d dVar = new d(str);
        if (dVar.hasNext()) {
            Object next = dVar.next();
            if (dVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (dVar.hasNext()) {
                    arrayList.add(dVar.next());
                }
                listD = arrayList;
            } else {
                listD = jd.d.D(next);
            }
        } else {
            listD = q.f9297a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listD) {
            if (!g.m0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(vb.k.U(arrayList2));
        int size = arrayList2.size();
        int i = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                if (!android.support.v4.media.session.a.o(str2.charAt(length2))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList3.add(Integer.valueOf(length2));
        }
        Iterator it = arrayList3.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listD.size();
        int iR = vb.j.R(listD);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : listD) {
            int i11 = i + 1;
            if (i < 0) {
                vb.j.T();
                throw null;
            }
            String str3 = (String) obj3;
            if ((i == 0 || i == iR) && g.m0(str3)) {
                strSubstring = null;
            } else {
                jc.i.e(str3, "<this>");
                if (iIntValue < 0) {
                    throw new IllegalArgumentException(q1.a.j(iIntValue, "Requested character count ", " is less than zero.").toString());
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
                jc.i.d(strSubstring, "substring(...)");
            }
            if (strSubstring != null) {
                arrayList4.add(strSubstring);
            }
            i = i11;
        }
        StringBuilder sb2 = new StringBuilder(length3);
        vb.i.c0(arrayList4, sb2, "\n", "", "", "...", null);
        return sb2.toString();
    }

    public static String X(String str) {
        List listD;
        jc.i.e(str, "<this>");
        if (g.m0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        d dVar = new d(str);
        if (dVar.hasNext()) {
            Object next = dVar.next();
            if (dVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (dVar.hasNext()) {
                    arrayList.add(dVar.next());
                }
                listD = arrayList;
            } else {
                listD = jd.d.D(next);
            }
        } else {
            listD = q.f9297a;
        }
        int length = str.length();
        listD.size();
        int iR = vb.j.R(listD);
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : listD) {
            int i10 = i + 1;
            String strSubstring = null;
            if (i < 0) {
                vb.j.T();
                throw null;
            }
            String str2 = (String) obj;
            if ((i != 0 && i != iR) || !g.m0(str2)) {
                int length2 = str2.length();
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        i11 = -1;
                        break;
                    }
                    if (!android.support.v4.media.session.a.o(str2.charAt(i11))) {
                        break;
                    }
                    i11++;
                }
                if (i11 != -1 && o.d0(str2, i11, "|", false)) {
                    strSubstring = str2.substring("|".length() + i11);
                    jc.i.d(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList2.add(strSubstring);
            }
            i = i10;
        }
        StringBuilder sb2 = new StringBuilder(length);
        vb.i.c0(arrayList2, sb2, "\n", "", "", "...", null);
        return sb2.toString();
    }
}
