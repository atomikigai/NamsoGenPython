package id;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final od.i f5280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f5281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f5282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f5283d;

    static {
        od.i iVar = od.i.f7735d;
        f5280a = z9.c.l("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f5281b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f5282c = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            jc.i.d(binaryString, "toBinaryString(it)");
            String strReplace = cd.b.h("%8s", binaryString).replace(' ', '0');
            jc.i.d(strReplace, "replace(...)");
            strArr[i] = strReplace;
        }
        f5283d = strArr;
        String[] strArr2 = f5282c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i10 = iArr[0];
        strArr2[i10 | 8] = q1.a.m(new StringBuilder(), strArr2[i10], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr2[i11];
            int i13 = iArr[0];
            String[] strArr3 = f5282c;
            int i14 = i13 | i12;
            strArr3[i14] = strArr3[i13] + '|' + strArr3[i12];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i13]);
            sb2.append('|');
            strArr3[i14 | 8] = q1.a.m(sb2, strArr3[i12], "|PADDED");
        }
        int length = f5282c.length;
        for (int i15 = 0; i15 < length; i15++) {
            String[] strArr4 = f5282c;
            if (strArr4[i15] == null) {
                strArr4[i15] = f5283d[i15];
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    public static String a(int i, int i10, int i11, int i12, boolean z4) {
        String strC0;
        String str;
        String[] strArr = f5281b;
        String strH = i11 < strArr.length ? strArr[i11] : cd.b.h("0x%02x", Integer.valueOf(i11));
        if (i12 == 0) {
            strC0 = "";
        } else {
            String[] strArr2 = f5283d;
            if (i11 == 2 || i11 == 3) {
                strC0 = strArr2[i12];
            } else if (i11 == 4 || i11 == 6) {
                strC0 = i12 == 1 ? "ACK" : strArr2[i12];
            } else if (i11 == 7 || i11 == 8) {
                strC0 = strArr2[i12];
            } else {
                String[] strArr3 = f5282c;
                if (i12 < strArr3.length) {
                    str = strArr3[i12];
                    jc.i.b(str);
                } else {
                    str = strArr2[i12];
                }
                if (i11 != 5 || (i12 & 4) == 0) {
                    strC0 = (i11 != 0 || (i12 & 32) == 0) ? str : pc.o.c0(str, "PRIORITY", "COMPRESSED");
                } else {
                    strC0 = pc.o.c0(str, "HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return cd.b.h("%s 0x%08x %5d %-13s %s", z4 ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i10), strH, strC0);
    }
}
