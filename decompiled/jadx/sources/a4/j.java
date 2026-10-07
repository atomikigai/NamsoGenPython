package a4;

import android.content.res.Resources;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements com.bumptech.glide.load.data.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources.Theme f153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f156d;
    public Object e;

    public j(Resources.Theme theme, Resources resources, k kVar, int i) {
        this.f153a = theme;
        this.f154b = resources;
        this.f155c = kVar;
        this.f156d = i;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return this.f155c.a();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c() {
        Object obj = this.e;
        if (obj != null) {
            try {
                this.f155c.d(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int d() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.f fVar, com.bumptech.glide.load.data.d dVar) {
        try {
            Object objB = this.f155c.b(this.f154b, this.f156d, this.f153a);
            this.e = objB;
            dVar.f(objB);
        } catch (Resources.NotFoundException e) {
            dVar.b(e);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }
}
