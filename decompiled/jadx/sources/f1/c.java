package f1;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import q0.v0;
import wb.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3578d;

    public c() {
        if (z9.c.f11530a == null) {
            z9.c.f11530a = new z9.c();
        }
    }

    public int a(int i) {
        if (i < this.f3577c) {
            return ((ByteBuffer) this.f3578d).getShort(this.f3576b + i);
        }
        return 0;
    }

    public void b() {
        if (((f) this.f3578d).f9903s != this.f3577c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.f3575a;
            f fVar = (f) this.f3578d;
            if (i >= fVar.f9901f || fVar.f9899c[i] >= 0) {
                return;
            } else {
                this.f3575a = i + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        q0.c cVar;
        if (Build.VERSION.SDK_INT >= this.f3576b) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f3576b) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f3575a);
            if (!((Class) this.f3578d).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateC = v0.c(view);
            if (accessibilityDelegateC == null) {
                cVar = null;
            } else {
                cVar = accessibilityDelegateC instanceof q0.a ? ((q0.a) accessibilityDelegateC).f7877a : new q0.c(accessibilityDelegateC);
            }
            if (cVar == null) {
                cVar = new q0.c();
            }
            v0.l(view, cVar);
            view.setTag(this.f3575a, obj);
            v0.g(view, this.f3577c);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f3575a < ((f) this.f3578d).f9901f;
    }

    public void remove() {
        f fVar = (f) this.f3578d;
        b();
        if (this.f3576b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        fVar.b();
        fVar.k(this.f3576b);
        this.f3576b = -1;
        this.f3577c = fVar.f9903s;
    }
}
