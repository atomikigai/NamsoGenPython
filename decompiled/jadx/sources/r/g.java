package r;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f8088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8091d;

    public g() {
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f8091d = iHighestOneBit - 1;
        this.f8088a = new int[iHighestOneBit];
    }

    public final void a(int i) {
        int[] iArr = this.f8088a;
        int i10 = this.f8090c;
        iArr[i10] = i;
        int i11 = this.f8091d & (i10 + 1);
        this.f8090c = i11;
        int i12 = this.f8089b;
        if (i11 == i12) {
            int length = iArr.length;
            int i13 = length - i12;
            int i14 = length << 1;
            if (i14 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i14];
            vb.h.I(0, i12, length, iArr, iArr2);
            vb.h.I(i13, 0, this.f8089b, this.f8088a, iArr2);
            this.f8088a = iArr2;
            this.f8089b = 0;
            this.f8090c = length;
            this.f8091d = i14 - 1;
        }
    }
}
