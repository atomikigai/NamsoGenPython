package a4;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements com.bumptech.glide.load.data.e, com.bumptech.glide.load.data.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0.d f120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.bumptech.glide.f f122d;
    public com.bumptech.glide.load.data.d e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f123f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f124r;

    public c0(ArrayList arrayList, p0.d dVar) {
        this.f120b = dVar;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f119a = arrayList;
        this.f121c = 0;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return ((com.bumptech.glide.load.data.e) this.f119a.get(0)).a();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b(Exception exc) {
        List list = this.f123f;
        p4.f.c(list, "Argument must not be null");
        list.add(exc);
        g();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c() {
        List list = this.f123f;
        if (list != null) {
            this.f120b.b(list);
        }
        this.f123f = null;
        ArrayList arrayList = this.f119a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((com.bumptech.glide.load.data.e) obj).c();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f124r = true;
        ArrayList arrayList = this.f119a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((com.bumptech.glide.load.data.e) obj).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int d() {
        return ((com.bumptech.glide.load.data.e) this.f119a.get(0)).d();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.f fVar, com.bumptech.glide.load.data.d dVar) {
        this.f122d = fVar;
        this.e = dVar;
        this.f123f = (List) this.f120b.c();
        ((com.bumptech.glide.load.data.e) this.f119a.get(this.f121c)).e(fVar, this);
        if (this.f124r) {
            cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void f(Object obj) {
        if (obj != null) {
            this.e.f(obj);
        } else {
            g();
        }
    }

    public final void g() {
        if (this.f124r) {
            return;
        }
        if (this.f121c < this.f119a.size() - 1) {
            this.f121c++;
            e(this.f122d, this.e);
        } else {
            p4.f.b(this.f123f);
            this.e.b(new w3.t("Fetch failed", new ArrayList(this.f123f)));
        }
    }
}
