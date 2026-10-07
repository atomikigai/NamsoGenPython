package pd;

import jc.i;
import od.s;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f7867a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c10);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    public static final int b(s sVar, int i) {
        int i10;
        int[] iArr = sVar.f7765f;
        int i11 = i + 1;
        int length = sVar.e.length;
        i.e(iArr, "<this>");
        int i12 = length - 1;
        int i13 = 0;
        while (i13 <= i12) {
            i10 = (i13 + i12) >>> 1;
            int i14 = iArr[i10];
            if (i14 < i11) {
                i13 = i10 + 1;
            } else {
                if (i14 <= i11) {
                    if (i10 >= 0) {
                        return i10;
                    }
                    return ~i10;
                }
                i12 = i10 - 1;
            }
        }
        i10 = (-i13) - 1;
        if (i10 >= 0) {
            return i10;
        }
        return ~i10;
    }
}
