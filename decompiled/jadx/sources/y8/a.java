package y8;

import android.graphics.Typeface;
import o6.h0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Typeface f10616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f10617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10618c;

    public a(h0 h0Var, Typeface typeface) {
        this.f10616a = typeface;
        this.f10617b = h0Var;
    }

    @Override // com.bumptech.glide.c
    public final void A(Typeface typeface, boolean z4) {
        if (this.f10618c) {
            return;
        }
        u8.c cVar = (u8.c) this.f10617b.f7621a;
        if (cVar.j(typeface)) {
            cVar.h(false);
        }
    }

    @Override // com.bumptech.glide.c
    public final void z(int i) {
        if (this.f10618c) {
            return;
        }
        u8.c cVar = (u8.c) this.f10617b.f7621a;
        if (cVar.j(this.f10616a)) {
            cVar.h(false);
        }
    }
}
