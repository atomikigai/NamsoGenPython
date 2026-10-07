package id;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class q {
    public static int a(int i, int i10, int i11) throws IOException {
        if ((i10 & 8) != 0) {
            i--;
        }
        if (i11 <= i) {
            return i - i11;
        }
        throw new IOException(q1.a.i(i11, i, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
