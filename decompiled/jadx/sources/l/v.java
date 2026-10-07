package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class v extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fd.n f6438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bb.b f6439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6440c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z2.a(context);
        this.f6440c = false;
        y2.a(getContext(), this);
        fd.n nVar = new fd.n(this);
        this.f6438a = nVar;
        nVar.l(attributeSet, i);
        bb.b bVar = new bb.b(this);
        this.f6439b = bVar;
        bVar.e(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        fd.n nVar = this.f6438a;
        if (nVar != null) {
            nVar.a();
        }
        bb.b bVar = this.f6439b;
        if (bVar != null) {
            bVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        fd.n nVar = this.f6438a;
        if (nVar != null) {
            return nVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        fd.n nVar = this.f6438a;
        if (nVar != null) {
            return nVar.i();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        bd.h hVar;
        bb.b bVar = this.f6439b;
        if (bVar == null || (hVar = (bd.h) bVar.f1526d) == null) {
            return null;
        }
        return (ColorStateList) hVar.f1596c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        bd.h hVar;
        bb.b bVar = this.f6439b;
        if (bVar == null || (hVar = (bd.h) bVar.f1526d) == null) {
            return null;
        }
        return (PorterDuff.Mode) hVar.f1597d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f6439b.f1525c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fd.n nVar = this.f6438a;
        if (nVar != null) {
            nVar.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fd.n nVar = this.f6438a;
        if (nVar != null) {
            nVar.o(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        bb.b bVar = this.f6439b;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        bb.b bVar = this.f6439b;
        if (bVar != null && drawable != null && !this.f6440c) {
            bVar.f1524b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (bVar != null) {
            bVar.a();
            if (this.f6440c) {
                return;
            }
            ImageView imageView = (ImageView) bVar.f1525c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(bVar.f1524b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f6440c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f6439b.f(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        bb.b bVar = this.f6439b;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        fd.n nVar = this.f6438a;
        if (nVar != null) {
            nVar.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        fd.n nVar = this.f6438a;
        if (nVar != null) {
            nVar.u(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        bb.b bVar = this.f6439b;
        if (bVar != null) {
            if (((bd.h) bVar.f1526d) == null) {
                bVar.f1526d = new bd.h();
            }
            bd.h hVar = (bd.h) bVar.f1526d;
            hVar.f1596c = colorStateList;
            hVar.f1595b = true;
            bVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        bb.b bVar = this.f6439b;
        if (bVar != null) {
            if (((bd.h) bVar.f1526d) == null) {
                bVar.f1526d = new bd.h();
            }
            bd.h hVar = (bd.h) bVar.f1526d;
            hVar.f1597d = mode;
            hVar.f1594a = true;
            bVar.a();
        }
    }
}
