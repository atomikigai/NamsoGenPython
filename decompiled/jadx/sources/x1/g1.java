package x1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10077d;
    public int e;

    public final boolean a() {
        int i;
        int i10;
        int i11;
        int i12 = this.f10074a;
        int i13 = 2;
        if ((i12 & 7) != 0) {
            int i14 = this.f10077d;
            int i15 = this.f10075b;
            if (i14 > i15) {
                i11 = 1;
            } else {
                i11 = i14 == i15 ? 2 : 4;
            }
            if ((i11 & i12) == 0) {
                return false;
            }
        }
        if ((i12 & 112) != 0) {
            int i16 = this.f10077d;
            int i17 = this.f10076c;
            if (i16 > i17) {
                i10 = 1;
            } else {
                i10 = i16 == i17 ? 2 : 4;
            }
            if (((i10 << 4) & i12) == 0) {
                return false;
            }
        }
        if ((i12 & 1792) != 0) {
            int i18 = this.e;
            int i19 = this.f10075b;
            if (i18 > i19) {
                i = 1;
            } else {
                i = i18 == i19 ? 2 : 4;
            }
            if (((i << 8) & i12) == 0) {
                return false;
            }
        }
        if ((i12 & 28672) != 0) {
            int i20 = this.e;
            int i21 = this.f10076c;
            if (i20 > i21) {
                i13 = 1;
            } else if (i20 != i21) {
                i13 = 4;
            }
            if ((i12 & (i13 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
