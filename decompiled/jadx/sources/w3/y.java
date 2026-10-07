package w3;

import a4.b0;
import h6.o0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements f, com.bumptech.glide.load.data.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f9585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f9586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9588d = -1;
    public u3.f e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f9589f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9590r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile a4.w f9591s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public File f9592t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public z f9593u;

    public y(g gVar, h hVar) {
        this.f9586b = gVar;
        this.f9585a = hVar;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b(Exception exc) {
        this.f9585a.a(this.f9593u, exc, this.f9591s.f182c, 4);
    }

    @Override // w3.f
    public final boolean c() {
        List list;
        boolean z4;
        List list2;
        boolean z10;
        ArrayList arrayListC;
        ArrayList arrayListA = this.f9586b.a();
        if (arrayListA.isEmpty()) {
            return false;
        }
        g gVar = this.f9586b;
        com.bumptech.glide.h hVarA = gVar.f9499c.a();
        Class<?> cls = gVar.f9500d.getClass();
        Class cls2 = gVar.f9502g;
        Class cls3 = gVar.f9504k;
        o0 o0Var = hVarA.h;
        p4.l lVar = (p4.l) ((AtomicReference) o0Var.f5061b).getAndSet(null);
        if (lVar == null) {
            lVar = new p4.l(cls, cls2, cls3);
        } else {
            lVar.f7807a = cls;
            lVar.f7808b = cls2;
            lVar.f7809c = cls3;
        }
        synchronized (((r.e) o0Var.f5062c)) {
            list = (List) ((r.e) o0Var.f5062c).get(lVar);
        }
        ((AtomicReference) o0Var.f5061b).set(lVar);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            b0 b0Var = hVarA.f1866a;
            synchronized (b0Var) {
                arrayListC = b0Var.f114a.c(cls);
            }
            int size = arrayListC.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListC.get(i);
                i++;
                ArrayList arrayListK = hVarA.f1868c.k((Class) obj, cls2);
                int size2 = arrayListK.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj2 = arrayListK.get(i10);
                    i10++;
                    Class cls4 = (Class) obj2;
                    if (!hVarA.f1870f.b(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            z4 = false;
            o0 o0Var2 = hVarA.h;
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (((r.e) o0Var2.f5062c)) {
                ((r.e) o0Var2.f5062c).put(new p4.l(cls, cls2, cls3), listUnmodifiableList);
            }
            list2 = arrayList;
        } else {
            z4 = false;
            list2 = list;
        }
        if (list2.isEmpty()) {
            if (File.class.equals(this.f9586b.f9504k)) {
                return z4;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f9586b.f9500d.getClass() + " to " + this.f9586b.f9504k);
        }
        while (true) {
            List list3 = this.f9589f;
            if (list3 != null && this.f9590r < list3.size()) {
                this.f9591s = null;
                boolean z11 = z4;
                while (!z11 && this.f9590r < this.f9589f.size()) {
                    List list4 = this.f9589f;
                    int i11 = this.f9590r;
                    this.f9590r = i11 + 1;
                    a4.x xVar = (a4.x) list4.get(i11);
                    File file = this.f9592t;
                    g gVar2 = this.f9586b;
                    this.f9591s = xVar.b(file, gVar2.e, gVar2.f9501f, gVar2.i);
                    if (this.f9591s != null && this.f9586b.c(this.f9591s.f182c.a()) != null) {
                        this.f9591s.f182c.e(this.f9586b.f9508o, this);
                        z11 = true;
                    }
                }
                return z11;
            }
            int i12 = this.f9588d + 1;
            this.f9588d = i12;
            if (i12 >= list2.size()) {
                int i13 = this.f9587c + 1;
                this.f9587c = i13;
                if (i13 >= arrayListA.size()) {
                    return z4;
                }
                this.f9588d = z4 ? 1 : 0;
            }
            u3.f fVar = (u3.f) arrayListA.get(this.f9587c);
            Class cls5 = (Class) list2.get(this.f9588d);
            u3.m mVarE = this.f9586b.e(cls5);
            g gVar3 = this.f9586b;
            this.f9593u = new z(gVar3.f9499c.f1855a, fVar, gVar3.f9507n, gVar3.e, gVar3.f9501f, mVarE, cls5, gVar3.i);
            File fileI = gVar3.h.a().i(this.f9593u);
            this.f9592t = fileI;
            if (fileI != null) {
                this.e = fVar;
                this.f9589f = this.f9586b.f9499c.a().f(fileI);
                z10 = false;
                this.f9590r = 0;
            } else {
                z10 = false;
            }
            z4 = z10;
        }
    }

    @Override // w3.f
    public final void cancel() {
        a4.w wVar = this.f9591s;
        if (wVar != null) {
            wVar.f182c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void f(Object obj) {
        this.f9585a.b(this.e, obj, this.f9591s.f182c, 4, this.f9593u);
    }
}
