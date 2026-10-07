package w3;

import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements f, com.bumptech.glide.load.data.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f9488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f9489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9490d = -1;
    public u3.f e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f9491f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9492r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile a4.w f9493s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public File f9494t;

    public c(List list, g gVar, e eVar) {
        this.f9487a = list;
        this.f9488b = gVar;
        this.f9489c = eVar;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b(Exception exc) {
        this.f9489c.a(this.e, exc, this.f9493s.f182c, 3);
    }

    @Override // w3.f
    public final boolean c() {
        while (true) {
            List list = this.f9491f;
            boolean z4 = false;
            if (list != null && this.f9492r < list.size()) {
                this.f9493s = null;
                while (!z4 && this.f9492r < this.f9491f.size()) {
                    List list2 = this.f9491f;
                    int i = this.f9492r;
                    this.f9492r = i + 1;
                    a4.x xVar = (a4.x) list2.get(i);
                    File file = this.f9494t;
                    g gVar = this.f9488b;
                    this.f9493s = xVar.b(file, gVar.e, gVar.f9501f, gVar.i);
                    if (this.f9493s != null && this.f9488b.c(this.f9493s.f182c.a()) != null) {
                        this.f9493s.f182c.e(this.f9488b.f9508o, this);
                        z4 = true;
                    }
                }
                return z4;
            }
            int i10 = this.f9490d + 1;
            this.f9490d = i10;
            if (i10 >= this.f9487a.size()) {
                return false;
            }
            u3.f fVar = (u3.f) this.f9487a.get(this.f9490d);
            g gVar2 = this.f9488b;
            File fileI = gVar2.h.a().i(new d(fVar, gVar2.f9507n));
            this.f9494t = fileI;
            if (fileI != null) {
                this.e = fVar;
                this.f9491f = this.f9488b.f9499c.a().f(fileI);
                this.f9492r = 0;
            }
        }
    }

    @Override // w3.f
    public final void cancel() {
        a4.w wVar = this.f9493s;
        if (wVar != null) {
            wVar.f182c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void f(Object obj) {
        this.f9489c.b(this.e, obj, this.f9493s.f182c, 3, this.e);
    }
}
