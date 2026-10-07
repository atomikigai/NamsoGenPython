package l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i3 implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Toolbar f6293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f6295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f6296d;
    public Drawable e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f6297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6298g;
    public CharSequence h;
    public CharSequence i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f6299j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Window.Callback f6300k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6301l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j f6302m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6303n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f6304o;

    public final void a(int i) {
        View view;
        Toolbar toolbar = this.f6293a;
        int i10 = this.f6294b ^ i;
        this.f6294b = i;
        if (i10 != 0) {
            if ((i10 & 4) != 0) {
                if ((i & 4) != 0) {
                    b();
                }
                if ((this.f6294b & 4) != 0) {
                    Drawable drawable = this.f6297f;
                    if (drawable == null) {
                        drawable = this.f6304o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i10 & 3) != 0) {
                c();
            }
            if ((i10 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.h);
                    toolbar.setSubtitle(this.i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) == 0 || (view = this.f6295c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f6293a;
        if ((this.f6294b & 4) != 0) {
            if (TextUtils.isEmpty(this.f6299j)) {
                toolbar.setNavigationContentDescription(this.f6303n);
            } else {
                toolbar.setNavigationContentDescription(this.f6299j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i = this.f6294b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.e) == null) {
            drawable = this.f6296d;
        }
        this.f6293a.setLogo(drawable);
    }
}
