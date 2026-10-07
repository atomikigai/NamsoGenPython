package pc;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7850a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public mc.e f7853d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f7854f;

    public b(c cVar) {
        this.f7854f = cVar;
        int iG = jd.d.g(0, cVar.f7855a.length());
        this.f7851b = iG;
        this.f7852c = iG;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:18:0x0075  */
    public final void a() {
        ub.f fVar;
        int i = this.f7852c;
        if (i < 0) {
            this.f7850a = 0;
            this.f7853d = null;
            return;
        }
        c cVar = this.f7854f;
        int i10 = cVar.f7856b;
        if (i10 > 0) {
            int i11 = this.e + 1;
            this.e = i11;
            if (i11 >= i10) {
                this.f7853d = new mc.e(this.f7851b, g.h0(cVar.f7855a), 1);
                this.f7852c = -1;
            } else if (i > cVar.f7855a.length() && (fVar = (ub.f) cVar.f7857c.invoke(cVar.f7855a, Integer.valueOf(this.f7852c))) != null) {
                int iIntValue = ((Number) fVar.f9065a).intValue();
                int iIntValue2 = ((Number) fVar.f9066b).intValue();
                this.f7853d = jd.d.L(this.f7851b, iIntValue);
                int i12 = iIntValue + iIntValue2;
                this.f7851b = i12;
                this.f7852c = i12 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f7853d = new mc.e(this.f7851b, g.h0(cVar.f7855a), 1);
                this.f7852c = -1;
            }
        } else if (i > cVar.f7855a.length()) {
            this.f7853d = new mc.e(this.f7851b, g.h0(cVar.f7855a), 1);
            this.f7852c = -1;
        } else {
            int iIntValue3 = ((Number) fVar.f9065a).intValue();
            int iIntValue4 = ((Number) fVar.f9066b).intValue();
            this.f7853d = jd.d.L(this.f7851b, iIntValue3);
            int i13 = iIntValue3 + iIntValue4;
            this.f7851b = i13;
            this.f7852c = i13 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.f7850a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f7850a == -1) {
            a();
        }
        return this.f7850a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f7850a == -1) {
            a();
        }
        if (this.f7850a == 0) {
            throw new NoSuchElementException();
        }
        mc.e eVar = this.f7853d;
        jc.i.c(eVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f7853d = null;
        this.f7850a = -1;
        return eVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
