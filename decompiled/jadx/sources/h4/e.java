package h4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import p4.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements m4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l4.c f4946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f4947d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f4948f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Bitmap f4949r;

    public e(Handler handler, int i, long j4) {
        if (!n.i(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f4944a = Integer.MIN_VALUE;
        this.f4945b = Integer.MIN_VALUE;
        this.f4947d = handler;
        this.e = i;
        this.f4948f = j4;
    }

    @Override // m4.c
    public final void a(l4.f fVar) throws Throwable {
        fVar.m(this.f4944a, this.f4945b);
    }

    @Override // m4.c
    public final void b(Object obj) {
        this.f4949r = (Bitmap) obj;
        Handler handler = this.f4947d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f4948f);
    }

    @Override // m4.c
    public final void c(l4.c cVar) {
        this.f4946c = cVar;
    }

    @Override // m4.c
    public final l4.c h() {
        return this.f4946c;
    }

    @Override // m4.c
    public final void i(Drawable drawable) {
        this.f4949r = null;
    }

    @Override // com.bumptech.glide.manager.i
    public final void e() {
    }

    @Override // com.bumptech.glide.manager.i
    public final void j() {
    }

    @Override // com.bumptech.glide.manager.i
    public final void onDestroy() {
    }

    @Override // m4.c
    public final void d(Drawable drawable) {
    }

    @Override // m4.c
    public final void f(Drawable drawable) {
    }

    @Override // m4.c
    public final void g(l4.f fVar) {
    }
}
