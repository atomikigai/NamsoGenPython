package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import f.a;
import k.b;
import k.c;
import k.l;
import k.n;
import k.z;
import l.k;
import l.z0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends z0 implements z, View.OnClickListener, k {
    public final int A;
    public int B;
    public final int C;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n f422s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CharSequence f423t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Drawable f424u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public k.k f425v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b f426w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c f427x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f428y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f429z;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f428y = f();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f3554c, 0, 0);
        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.C = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.B = -1;
        setSaveEnabled(false);
    }

    @Override // l.k
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // l.k
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.f422s.getIcon() == null;
    }

    @Override // k.z
    public final void c(n nVar) {
        this.f422s = nVar;
        setIcon(nVar.getIcon());
        setTitle(nVar.getTitleCondensed());
        setId(nVar.f5878a);
        setVisibility(nVar.isVisible() ? 0 : 8);
        setEnabled(nVar.isEnabled());
        if (nVar.hasSubMenu() && this.f426w == null) {
            this.f426w = new b(this);
        }
    }

    public final boolean f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i10 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void g() {
        boolean z4 = true;
        boolean z10 = !TextUtils.isEmpty(this.f423t);
        if (this.f424u != null && ((this.f422s.J & 4) != 4 || (!this.f428y && !this.f429z))) {
            z4 = false;
        }
        boolean z11 = z10 & z4;
        setText(z11 ? this.f423t : null);
        CharSequence charSequence = this.f422s.B;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z11 ? null : this.f422s.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f422s.C;
        if (TextUtils.isEmpty(charSequence2)) {
            p3.a.s(this, z11 ? null : this.f422s.e);
        } else {
            p3.a.s(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // k.z
    public n getItemData() {
        return this.f422s;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k.k kVar = this.f425v;
        if (kVar != null) {
            kVar.a(this.f422s);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f428y = f();
        g();
    }

    @Override // l.z0, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i10) {
        int i11;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i11 = this.B) >= 0) {
            super.setPadding(i11, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i10);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i12 = this.A;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i12) : i12;
        if (mode != 1073741824 && i12 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i10);
        }
        if (!zIsEmpty || this.f424u == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f424u.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (this.f422s.hasSubMenu() && (bVar = this.f426w) != null && bVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z4) {
        if (this.f429z != z4) {
            this.f429z = z4;
            n nVar = this.f422s;
            if (nVar != null) {
                l lVar = nVar.f5890y;
                lVar.f5870v = true;
                lVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f424u = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.C;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        g();
    }

    public void setItemInvoker(k.k kVar) {
        this.f425v = kVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i10, int i11, int i12) {
        this.B = i;
        super.setPadding(i, i10, i11, i12);
    }

    public void setPopupCallback(c cVar) {
        this.f427x = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f423t = charSequence;
        g();
    }

    public void setCheckable(boolean z4) {
    }

    public void setChecked(boolean z4) {
    }
}
