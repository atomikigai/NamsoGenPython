package m4;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import app.namso_gen.spacehowen.R;
import java.util.ArrayList;
import p4.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f7052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f7053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Animatable f7054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7055d;

    public a(ImageView imageView, int i) {
        this.f7055d = i;
        f.c(imageView, "Argument must not be null");
        this.f7052a = imageView;
        this.f7053b = new d(imageView);
    }

    @Override // m4.c
    public final void a(l4.f fVar) throws Throwable {
        d dVar = this.f7053b;
        ArrayList arrayList = dVar.f7058b;
        View view = dVar.f7057a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = dVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iA2 = dVar.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            fVar.m(iA, iA2);
            return;
        }
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
        if (dVar.f7059c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            b0.f fVar2 = new b0.f(dVar);
            dVar.f7059c = fVar2;
            viewTreeObserver.addOnPreDrawListener(fVar2);
        }
    }

    @Override // m4.c
    public final void b(Object obj) {
        k(obj);
        if (!(obj instanceof Animatable)) {
            this.f7054c = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f7054c = animatable;
        animatable.start();
    }

    @Override // m4.c
    public final void c(l4.c cVar) {
        this.f7052a.setTag(R.id.glide_custom_view_target_tag, cVar);
    }

    @Override // m4.c
    public final void d(Drawable drawable) {
        k(null);
        this.f7054c = null;
        this.f7052a.setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.manager.i
    public final void e() {
        Animatable animatable = this.f7054c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // m4.c
    public final void f(Drawable drawable) {
        k(null);
        this.f7054c = null;
        this.f7052a.setImageDrawable(drawable);
    }

    @Override // m4.c
    public final void g(l4.f fVar) {
        this.f7053b.f7058b.remove(fVar);
    }

    @Override // m4.c
    public final l4.c h() {
        Object tag = this.f7052a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof l4.c) {
            return (l4.c) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // m4.c
    public final void i(Drawable drawable) {
        d dVar = this.f7053b;
        ViewTreeObserver viewTreeObserver = dVar.f7057a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(dVar.f7059c);
        }
        dVar.f7059c = null;
        dVar.f7058b.clear();
        Animatable animatable = this.f7054c;
        if (animatable != null) {
            animatable.stop();
        }
        k(null);
        this.f7054c = null;
        this.f7052a.setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.manager.i
    public final void j() {
        Animatable animatable = this.f7054c;
        if (animatable != null) {
            animatable.start();
        }
    }

    public final void k(Object obj) {
        switch (this.f7055d) {
            case 0:
                this.f7052a.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.f7052a.setImageDrawable((Drawable) obj);
                break;
        }
    }

    public final String toString() {
        return "Target for: " + this.f7052a;
    }

    @Override // com.bumptech.glide.manager.i
    public final void onDestroy() {
    }
}
