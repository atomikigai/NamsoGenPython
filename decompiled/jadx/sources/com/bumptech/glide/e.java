package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.manager.r;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ContextWrapper {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f1854k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x3.f f1855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g7.i f1856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z9.c f1857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wa.d f1858d;
    public final List e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r.e f1859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w3.k f1860g;
    public final a5.b h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l4.e f1861j;

    static {
        a aVar = new a();
        aVar.f1836a = n4.b.f7278a;
        f1854k = aVar;
    }

    public e(Context context, x3.f fVar, r rVar, z9.c cVar, wa.d dVar, r.e eVar, List list, w3.k kVar, a5.b bVar) {
        super(context.getApplicationContext());
        this.f1855a = fVar;
        this.f1857c = cVar;
        this.f1858d = dVar;
        this.e = list;
        this.f1859f = eVar;
        this.f1860g = kVar;
        this.h = bVar;
        this.i = 4;
        this.f1856b = new g7.i(rVar);
    }

    public final h a() {
        return (h) this.f1856b.get();
    }
}
