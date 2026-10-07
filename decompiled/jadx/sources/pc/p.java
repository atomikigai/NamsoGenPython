package pc;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7865b;

    public /* synthetic */ p(Object obj, int i) {
        this.f7864a = i;
        this.f7865b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a7 A[LOOP:0: B:27:0x0076->B:38:0x00a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x003a A[SYNTHETIC] */
    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        int i;
        Object next;
        ub.f fVar;
        Object next2;
        String str;
        String str2;
        switch (this.f7864a) {
            case 0:
                char[] cArr = (char[]) this.f7865b;
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                jc.i.e(charSequence, "$this$DelimitedRangesSequence");
                int iL0 = g.l0(charSequence, cArr, iIntValue, false);
                if (iL0 < 0) {
                    return null;
                }
                return new ub.f(Integer.valueOf(iL0), 1);
            default:
                List list = (List) this.f7865b;
                CharSequence charSequence2 = (CharSequence) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                jc.i.e(charSequence2, "$this$DelimitedRangesSequence");
                if (list.size() == 1) {
                    int size = list.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str3 = (String) list.get(0);
                    int iK0 = g.k0(charSequence2, str3, iIntValue2, false, 4);
                    if (iK0 < 0) {
                        fVar = null;
                    } else {
                        fVar = new ub.f(Integer.valueOf(iK0), str3);
                    }
                } else {
                    if (iIntValue2 < 0) {
                        iIntValue2 = 0;
                    }
                    mc.e eVar = new mc.e(iIntValue2, charSequence2.length(), 1);
                    boolean z4 = charSequence2 instanceof String;
                    int i10 = eVar.f7108c;
                    int i11 = eVar.f7107b;
                    if (z4) {
                        if ((i10 <= 0 || iIntValue2 > i11) && (i10 >= 0 || i11 > iIntValue2)) {
                            fVar = null;
                        } else {
                            int i12 = iIntValue2;
                            while (true) {
                                Iterator it = list.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        str2 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str = (String) next2;
                                    if (str != null) {
                                        fVar = new ub.f(Integer.valueOf(i12), str);
                                    } else if (i12 != i11) {
                                        i12 += i10;
                                    } else {
                                        fVar = null;
                                    }
                                } while (!o.b0(0, i12, str2.length(), str2, (String) charSequence2, false));
                                str = (String) next2;
                                if (str != null) {
                                    fVar = new ub.f(Integer.valueOf(i12), str);
                                } else if (i12 != i11) {
                                    i12 += i10;
                                } else {
                                    fVar = null;
                                }
                            }
                        }
                    } else if ((i10 <= 0 || iIntValue2 > i11) && (i10 >= 0 || i11 > iIntValue2)) {
                        fVar = null;
                    } else {
                        int i13 = iIntValue2;
                        while (true) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    String str4 = (String) next;
                                    i = i11;
                                    if (!g.q0(str4, 0, charSequence2, i13, str4.length(), false)) {
                                        i11 = i;
                                    }
                                } else {
                                    i = i11;
                                    next = null;
                                }
                            }
                            String str5 = (String) next;
                            if (str5 != null) {
                                fVar = new ub.f(Integer.valueOf(i13), str5);
                            } else if (i13 != i) {
                                i13 += i10;
                                i11 = i;
                            } else {
                                fVar = null;
                            }
                        }
                    }
                }
                if (fVar != null) {
                    return new ub.f(fVar.f9065a, Integer.valueOf(((String) fVar.f9066b).length()));
                }
                return null;
        }
    }
}
