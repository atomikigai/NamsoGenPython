package jc;

import android.view.View;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5758c;

    public /* synthetic */ a(Object obj, int i) {
        this.f5756a = i;
        this.f5758c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5756a) {
            case 0:
                return this.f5757b < ((Object[]) this.f5758c).length;
            case 1:
                Iterator it = (Iterator) this.f5758c;
                while (this.f5757b > 0 && it.hasNext()) {
                    it.next();
                    this.f5757b--;
                }
                return it.hasNext();
            case 2:
                return this.f5757b < ((ChipNavigationBar) this.f5758c).getChildCount();
            default:
                return this.f5757b < ((vb.c) this.f5758c).d();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5756a) {
            case 0:
                try {
                    Object[] objArr = (Object[]) this.f5758c;
                    int i = this.f5757b;
                    this.f5757b = i + 1;
                    return objArr[i];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f5757b--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 1:
                Iterator it = (Iterator) this.f5758c;
                while (this.f5757b > 0 && it.hasNext()) {
                    it.next();
                    this.f5757b--;
                }
                return it.next();
            case 2:
                ChipNavigationBar chipNavigationBar = (ChipNavigationBar) this.f5758c;
                int i10 = this.f5757b;
                this.f5757b = i10 + 1;
                View childAt = chipNavigationBar.getChildAt(i10);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                vb.c cVar = (vb.c) this.f5758c;
                int i11 = this.f5757b;
                this.f5757b = i11 + 1;
                return cVar.get(i11);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5756a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                ChipNavigationBar chipNavigationBar = (ChipNavigationBar) this.f5758c;
                int i = this.f5757b - 1;
                this.f5757b = i;
                chipNavigationBar.removeViewAt(i);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(Object[] objArr) {
        this.f5756a = 0;
        i.e(objArr, "array");
        this.f5758c = objArr;
    }

    public a(oc.b bVar) {
        this.f5756a = 1;
        this.f5758c = bVar.f7703a.iterator();
        this.f5757b = bVar.f7704b;
    }
}
