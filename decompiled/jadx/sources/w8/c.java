package w8;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n2.b f9729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f9731c;

    public /* synthetic */ c(View view, int i) {
        this.f9730b = i;
        this.f9731c = view;
    }

    public final void a(Drawable drawable) {
        switch (this.f9730b) {
            case 0:
                d dVar = (d) this.f9731c;
                dVar.setIndeterminate(false);
                dVar.b(dVar.f9733b, dVar.f9734c);
                break;
            case 1:
                d dVar2 = (d) this.f9731c;
                if (!dVar2.f9737r) {
                    dVar2.setVisibility(dVar2.f9738s);
                }
                break;
            default:
                ColorStateList colorStateList = ((m8.b) this.f9731c).f7082z;
                if (colorStateList != null) {
                    i0.b.h(drawable, colorStateList);
                }
                break;
        }
    }

    public void b(Drawable drawable) {
        switch (this.f9730b) {
            case 2:
                m8.b bVar = (m8.b) this.f9731c;
                ColorStateList colorStateList = bVar.f7082z;
                if (colorStateList != null) {
                    i0.b.g(drawable, colorStateList.getColorForState(bVar.D, colorStateList.getDefaultColor()));
                }
                break;
        }
    }

    public final void c(Drawable drawable) {
    }
}
