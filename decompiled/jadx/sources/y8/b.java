package y8;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g0.b {
    public final /* synthetic */ com.bumptech.glide.c h;
    public final /* synthetic */ d i;

    public b(d dVar, com.bumptech.glide.c cVar) {
        this.i = dVar;
        this.h = cVar;
    }

    @Override // g0.b
    public final void g(int i) {
        this.i.f10632m = true;
        this.h.z(i);
    }

    @Override // g0.b
    public final void h(Typeface typeface) {
        d dVar = this.i;
        dVar.f10633n = Typeface.create(typeface, dVar.f10625c);
        dVar.f10632m = true;
        this.h.A(dVar.f10633n, false);
    }
}
