package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {
    public static boolean a(Object obj, h hVar) throws x {
        int iE = hVar.e();
        int i = iE >>> 3;
        int i10 = iE & 7;
        if (i10 == 0) {
            ((e1) obj).c(i << 3, Long.valueOf(hVar.z()));
            return true;
        }
        if (i10 == 1) {
            ((e1) obj).c((i << 3) | 1, Long.valueOf(hVar.q()));
            return true;
        }
        if (i10 == 2) {
            ((e1) obj).c((i << 3) | 2, hVar.h());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw x.b();
            }
            ((e1) obj).c((i << 3) | 5, Integer.valueOf(hVar.o()));
            return true;
        }
        e1 e1VarB = e1.b();
        int i11 = i << 3;
        int i12 = i11 | 4;
        while (hVar.d() != Integer.MAX_VALUE && a(e1VarB, hVar)) {
        }
        if (i12 != hVar.e()) {
            throw new x("Protocol message end-group tag did not match expected tag.");
        }
        e1VarB.e = false;
        ((e1) obj).c(i11 | 3, e1VarB);
        return true;
    }
}
