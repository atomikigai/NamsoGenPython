package r;

import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f8096a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f8097b = new Object();

    public static final void a(f fVar, int i) {
        fVar.f8085a = new int[i];
        fVar.f8086b = new Object[i];
    }

    public static final int b(f fVar, Object obj, int i) {
        int i10 = fVar.f8087c;
        if (i10 == 0) {
            return -1;
        }
        try {
            int iA = s.a.a(fVar.f8085a, i10, i);
            if (iA < 0 || jc.i.a(obj, fVar.f8086b[iA])) {
                return iA;
            }
            int i11 = iA + 1;
            while (i11 < i10 && fVar.f8085a[i11] == i) {
                if (jc.i.a(obj, fVar.f8086b[i11])) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = iA - 1; i12 >= 0 && fVar.f8085a[i12] == i; i12--) {
                if (jc.i.a(obj, fVar.f8086b[i12])) {
                    return i12;
                }
            }
            return ~i11;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
