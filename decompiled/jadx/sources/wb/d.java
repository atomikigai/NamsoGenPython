package wb;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends f1.c implements Iterator {
    public final /* synthetic */ int e;

    public d(f fVar, int i) {
        this.e = i;
        jc.i.e(fVar, "map");
        this.f3578d = fVar;
        this.f3576b = -1;
        this.f3577c = fVar.f9903s;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                b();
                int i = this.f3575a;
                f fVar = (f) this.f3578d;
                if (i >= fVar.f9901f) {
                    throw new NoSuchElementException();
                }
                this.f3575a = i + 1;
                this.f3576b = i;
                e eVar = new e(fVar, i);
                e();
                return eVar;
            case 1:
                b();
                int i10 = this.f3575a;
                f fVar2 = (f) this.f3578d;
                if (i10 >= fVar2.f9901f) {
                    throw new NoSuchElementException();
                }
                this.f3575a = i10 + 1;
                this.f3576b = i10;
                Object obj = fVar2.f9897a[i10];
                e();
                return obj;
            default:
                b();
                int i11 = this.f3575a;
                f fVar3 = (f) this.f3578d;
                if (i11 >= fVar3.f9901f) {
                    throw new NoSuchElementException();
                }
                this.f3575a = i11 + 1;
                this.f3576b = i11;
                Object[] objArr = fVar3.f9898b;
                jc.i.b(objArr);
                Object obj2 = objArr[this.f3576b];
                e();
                return obj2;
        }
    }
}
