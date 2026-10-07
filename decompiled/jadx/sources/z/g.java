package z;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f10773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f10774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f10776d;
    public float[] e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f10778g;
    public String[] h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f10779j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f10780k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10781l;

    public final void a(int i, float f10) {
        int i10 = this.f10777f;
        int[] iArr = this.f10776d;
        if (i10 >= iArr.length) {
            this.f10776d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.e;
            this.e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f10776d;
        int i11 = this.f10777f;
        iArr2[i11] = i;
        float[] fArr2 = this.e;
        this.f10777f = i11 + 1;
        fArr2[i11] = f10;
    }

    public final void b(int i, int i10) {
        int i11 = this.f10775c;
        int[] iArr = this.f10773a;
        if (i11 >= iArr.length) {
            this.f10773a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f10774b;
            this.f10774b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f10773a;
        int i12 = this.f10775c;
        iArr3[i12] = i;
        int[] iArr4 = this.f10774b;
        this.f10775c = i12 + 1;
        iArr4[i12] = i10;
    }

    public final void c(int i, String str) {
        int i10 = this.i;
        int[] iArr = this.f10778g;
        if (i10 >= iArr.length) {
            this.f10778g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f10778g;
        int i11 = this.i;
        iArr2[i11] = i;
        String[] strArr2 = this.h;
        this.i = i11 + 1;
        strArr2[i11] = str;
    }

    public final void d(int i, boolean z4) {
        int i10 = this.f10781l;
        int[] iArr = this.f10779j;
        if (i10 >= iArr.length) {
            this.f10779j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f10780k;
            this.f10780k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f10779j;
        int i11 = this.f10781l;
        iArr2[i11] = i;
        boolean[] zArr2 = this.f10780k;
        this.f10781l = i11 + 1;
        zArr2[i11] = z4;
    }
}
