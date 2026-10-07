package y8;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f10619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextPaint f10620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.c f10621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f10622d;

    public c(d dVar, Context context, TextPaint textPaint, com.bumptech.glide.c cVar) {
        this.f10622d = dVar;
        this.f10619a = context;
        this.f10620b = textPaint;
        this.f10621c = cVar;
    }

    @Override // com.bumptech.glide.c
    public final void A(Typeface typeface, boolean z4) {
        this.f10622d.g(this.f10619a, this.f10620b, typeface);
        this.f10621c.A(typeface, z4);
    }

    @Override // com.bumptech.glide.c
    public final void z(int i) {
        this.f10621c.z(i);
    }
}
