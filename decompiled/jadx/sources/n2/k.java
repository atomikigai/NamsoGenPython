package n2;

import fa.c1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h0.f[] f7194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f7195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7196c;

    public k() {
        this.f7194a = null;
        this.f7196c = 0;
    }

    public h0.f[] getPathData() {
        return this.f7194a;
    }

    public String getPathName() {
        return this.f7195b;
    }

    public void setPathData(h0.f[] fVarArr) {
        h0.f[] fVarArr2 = this.f7194a;
        boolean z4 = false;
        if (fVarArr2 != null && fVarArr != null && fVarArr2.length == fVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= fVarArr2.length) {
                    z4 = true;
                    break;
                }
                h0.f fVar = fVarArr2[i];
                char c10 = fVar.f4550a;
                h0.f fVar2 = fVarArr[i];
                if (c10 != fVar2.f4550a || fVar.f4551b.length != fVar2.f4551b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z4) {
            this.f7194a = c1.p(fVarArr);
            return;
        }
        h0.f[] fVarArr3 = this.f7194a;
        for (int i10 = 0; i10 < fVarArr.length; i10++) {
            fVarArr3[i10].f4550a = fVarArr[i10].f4550a;
            int i11 = 0;
            while (true) {
                float[] fArr = fVarArr[i10].f4551b;
                if (i11 < fArr.length) {
                    fVarArr3[i10].f4551b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public k(k kVar) {
        this.f7194a = null;
        this.f7196c = 0;
        this.f7195b = kVar.f7195b;
        this.f7194a = c1.p(kVar.f7194a);
    }
}
