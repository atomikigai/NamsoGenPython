package f9;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;
import q0.d0;
import q0.e0;
import q0.l0;
import q0.v0;
import q0.x;
import r0.k;
import u0.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends LinearLayout {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f3666w = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f3667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f3668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f3669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f3670d;
    public g8.a e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f3671f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f3672r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ImageView f3673s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Drawable f3674t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3675u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ TabLayout f3676v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TabLayout tabLayout, Context context) {
        super(context);
        this.f3676v = tabLayout;
        this.f3675u = 2;
        f(context);
        int i = tabLayout.e;
        int i10 = tabLayout.f2526f;
        int i11 = tabLayout.f2527r;
        int i12 = tabLayout.f2528s;
        WeakHashMap weakHashMap = v0.f7946a;
        e0.k(this, i, i10, i11, i12);
        setGravity(17);
        setOrientation(!tabLayout.O ? 1 : 0);
        setClickable(true);
        l0.d(this, x.b(getContext(), 1002));
    }

    private g8.a getBadge() {
        return this.e;
    }

    private g8.a getOrCreateBadge() {
        if (this.e == null) {
            this.e = new g8.a(getContext());
        }
        c();
        g8.a aVar = this.e;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    public final void a(View view) {
        if (this.e == null || view == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        g8.a aVar = this.e;
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.h(view, null);
        if (aVar.c() != null) {
            aVar.c().setForeground(aVar);
        } else {
            view.getOverlay().add(aVar);
        }
        this.f3670d = view;
    }

    public final void b() {
        if (this.e != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.f3670d;
            if (view != null) {
                g8.a aVar = this.e;
                if (aVar != null) {
                    if (aVar.c() != null) {
                        aVar.c().setForeground(null);
                    } else {
                        view.getOverlay().remove(aVar);
                    }
                }
                this.f3670d = null;
            }
        }
    }

    public final void c() {
        g gVar;
        if (this.e != null) {
            if (this.f3671f != null) {
                b();
                return;
            }
            ImageView imageView = this.f3669c;
            if (imageView != null && (gVar = this.f3667a) != null && gVar.f3658a != null) {
                if (this.f3670d == imageView) {
                    d(imageView);
                    return;
                } else {
                    b();
                    a(this.f3669c);
                    return;
                }
            }
            TextView textView = this.f3668b;
            if (textView == null || this.f3667a == null) {
                b();
            } else if (this.f3670d == textView) {
                d(textView);
            } else {
                b();
                a(this.f3668b);
            }
        }
    }

    public final void d(View view) {
        g8.a aVar = this.e;
        if (aVar == null || view != this.f3670d) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.h(view, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3674t;
        if ((drawable == null || !drawable.isStateful()) ? false : this.f3674t.setState(drawableState)) {
            invalidate();
            this.f3676v.invalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    public final void e() {
        boolean z4;
        g();
        g gVar = this.f3667a;
        if (gVar == null) {
            z4 = false;
        } else {
            TabLayout tabLayout = gVar.f3662f;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            if (selectedTabPosition == -1 || selectedTabPosition != gVar.f3661d) {
                z4 = false;
            } else {
                z4 = true;
            }
        }
        setSelected(z4);
    }

    public final void f(Context context) {
        GradientDrawable gradientDrawable;
        TabLayout tabLayout = this.f3676v;
        int i = tabLayout.E;
        if (i != 0) {
            Drawable drawableR = com.bumptech.glide.d.r(context, i);
            this.f3674t = drawableR;
            if (drawableR != null && drawableR.isStateful()) {
                this.f3674t.setState(getDrawableState());
            }
        } else {
            this.f3674t = null;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        Drawable rippleDrawable = gradientDrawable2;
        if (tabLayout.f2534y != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setCornerRadius(1.0E-5f);
            gradientDrawable3.setColor(-1);
            ColorStateList colorStateList = tabLayout.f2534y;
            int[] iArr = z8.a.f11524d;
            int iA = z8.a.a(colorStateList, z8.a.f11523c);
            int[] iArr2 = z8.a.f11522b;
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{iArr, iArr2, StateSet.NOTHING}, new int[]{iA, z8.a.a(colorStateList, iArr2), z8.a.a(colorStateList, z8.a.f11521a)});
            boolean z4 = tabLayout.S;
            if (z4) {
                gradientDrawable = gradientDrawable2;
                gradientDrawable = null;
            }
            rippleDrawable = new RippleDrawable(colorStateList2, gradientDrawable, z4 ? null : gradientDrawable3);
        }
        WeakHashMap weakHashMap = v0.f7946a;
        d0.q(this, rippleDrawable);
        tabLayout.invalidate();
    }

    public final void g() {
        int i;
        ViewParent parent;
        g gVar = this.f3667a;
        View view = gVar != null ? gVar.e : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.f3671f;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.f3671f);
                }
                addView(view);
            }
            this.f3671f = view;
            TextView textView = this.f3668b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.f3669c;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f3669c.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.f3672r = textView2;
            if (textView2 != null) {
                this.f3675u = n.b(textView2);
            }
            this.f3673s = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view3 = this.f3671f;
            if (view3 != null) {
                removeView(view3);
                this.f3671f = null;
            }
            this.f3672r = null;
            this.f3673s = null;
        }
        if (this.f3671f == null) {
            if (this.f3669c == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(app.namso_gen.spacehowen.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.f3669c = imageView2;
                addView(imageView2, 0);
            }
            if (this.f3668b == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(app.namso_gen.spacehowen.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.f3668b = textView3;
                addView(textView3);
                this.f3675u = n.b(this.f3668b);
            }
            TextView textView4 = this.f3668b;
            TabLayout tabLayout = this.f3676v;
            textView4.setTextAppearance(tabLayout.f2529t);
            if (!isSelected() || (i = tabLayout.f2531v) == -1) {
                this.f3668b.setTextAppearance(tabLayout.f2530u);
            } else {
                this.f3668b.setTextAppearance(i);
            }
            ColorStateList colorStateList = tabLayout.f2532w;
            if (colorStateList != null) {
                this.f3668b.setTextColor(colorStateList);
            }
            h(this.f3668b, this.f3669c, true);
            c();
            ImageView imageView3 = this.f3669c;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new h(this, imageView3));
            }
            TextView textView5 = this.f3668b;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new h(this, textView5));
            }
        } else {
            TextView textView6 = this.f3672r;
            if (textView6 != null || this.f3673s != null) {
                h(textView6, this.f3673s, false);
            }
        }
        if (gVar == null || TextUtils.isEmpty(gVar.f3660c)) {
            return;
        }
        setContentDescription(gVar.f3660c);
    }

    public int getContentHeight() {
        View[] viewArr = {this.f3668b, this.f3669c, this.f3671f};
        int iMax = 0;
        int iMin = 0;
        boolean z4 = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z4 ? Math.min(iMin, view.getTop()) : view.getTop();
                iMax = z4 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                z4 = true;
            }
        }
        return iMax - iMin;
    }

    public int getContentWidth() {
        View[] viewArr = {this.f3668b, this.f3669c, this.f3671f};
        int iMax = 0;
        int iMin = 0;
        boolean z4 = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z4 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                iMax = z4 ? Math.max(iMax, view.getRight()) : view.getRight();
                z4 = true;
            }
        }
        return iMax - iMin;
    }

    public g getTab() {
        return this.f3667a;
    }

    public final void h(TextView textView, ImageView imageView, boolean z4) {
        boolean z10;
        Drawable drawable;
        g gVar = this.f3667a;
        Drawable drawableMutate = (gVar == null || (drawable = gVar.f3658a) == null) ? null : drawable.mutate();
        TabLayout tabLayout = this.f3676v;
        if (drawableMutate != null) {
            i0.b.h(drawableMutate, tabLayout.f2533x);
            PorterDuff.Mode mode = tabLayout.B;
            if (mode != null) {
                i0.b.i(drawableMutate, mode);
            }
        }
        g gVar2 = this.f3667a;
        CharSequence charSequence = gVar2 != null ? gVar2.f3659b : null;
        if (imageView != null) {
            if (drawableMutate != null) {
                imageView.setImageDrawable(drawableMutate);
                imageView.setVisibility(0);
                setVisibility(0);
            } else {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (zIsEmpty) {
                z10 = false;
            } else {
                this.f3667a.getClass();
                z10 = true;
            }
            textView.setText(!zIsEmpty ? charSequence : null);
            textView.setVisibility(z10 ? 0 : 8);
            if (!zIsEmpty) {
                setVisibility(0);
            }
        } else {
            z10 = false;
        }
        if (z4 && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int iD = (z10 && imageView.getVisibility() == 0) ? (int) u8.n.d(getContext(), 8) : 0;
            if (tabLayout.O) {
                if (iD != q0.n.b(marginLayoutParams)) {
                    q0.n.g(marginLayoutParams, iD);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (iD != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iD;
                q0.n.g(marginLayoutParams, 0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        g gVar3 = this.f3667a;
        CharSequence charSequence2 = gVar3 != null ? gVar3.f3660c : null;
        if (zIsEmpty) {
            charSequence = charSequence2;
        }
        p3.a.s(this, charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        g8.a aVar = this.e;
        if (aVar != null && aVar.isVisible()) {
            CharSequence contentDescription = getContentDescription();
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) contentDescription);
            sb2.append(", ");
            g8.a aVar2 = this.e;
            g8.c cVar = aVar2.e;
            Object quantityString = null;
            if (aVar2.isVisible()) {
                g8.b bVar = cVar.f4311b;
                if (bVar.f4304u != null) {
                    quantityString = bVar.f4309z;
                    if (quantityString == null) {
                        quantityString = aVar2.e.f4311b.f4304u;
                    }
                } else if (!aVar2.f()) {
                    quantityString = bVar.A;
                } else if (bVar.B != 0 && (context = (Context) aVar2.f4284a.get()) != null) {
                    if (aVar2.f4290s != -2) {
                        int iD = aVar2.d();
                        int i = aVar2.f4290s;
                        if (iD <= i) {
                            quantityString = context.getResources().getQuantityString(bVar.B, aVar2.d(), Integer.valueOf(aVar2.d()));
                        } else {
                            quantityString = context.getString(bVar.C, Integer.valueOf(i));
                        }
                    } else {
                        quantityString = context.getResources().getQuantityString(bVar.B, aVar2.d(), Integer.valueOf(aVar2.d()));
                    }
                }
            }
            sb2.append(quantityString);
            accessibilityNodeInfo.setContentDescription(sb2.toString());
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) k.a(0, 1, this.f3667a.f3661d, 1, isSelected()).f8117a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) r0.f.e.f8113a);
        }
        r0.g.c(accessibilityNodeInfo).putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(app.namso_gen.spacehowen.R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.f3676v;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(tabLayout.F, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i10);
        if (this.f3668b != null) {
            float f10 = tabLayout.C;
            int i11 = this.f3675u;
            ImageView imageView = this.f3669c;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.f3668b;
                if (textView != null && textView.getLineCount() > 1) {
                    f10 = tabLayout.D;
                }
            } else {
                i11 = 1;
            }
            float textSize = this.f3668b.getTextSize();
            int lineCount = this.f3668b.getLineCount();
            int iB = n.b(this.f3668b);
            if (f10 != textSize || (iB >= 0 && i11 != iB)) {
                if (tabLayout.N == 1 && f10 > textSize && lineCount == 1) {
                    Layout layout = this.f3668b.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f10 / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.f3668b.setTextSize(0, f10);
                this.f3668b.setMaxLines(i11);
                super.onMeasure(i, i10);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.f3667a == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        g gVar = this.f3667a;
        TabLayout tabLayout = gVar.f3662f;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.g(gVar);
        return true;
    }

    @Override // android.view.View
    public void setSelected(boolean z4) {
        isSelected();
        super.setSelected(z4);
        TextView textView = this.f3668b;
        if (textView != null) {
            textView.setSelected(z4);
        }
        ImageView imageView = this.f3669c;
        if (imageView != null) {
            imageView.setSelected(z4);
        }
        View view = this.f3671f;
        if (view != null) {
            view.setSelected(z4);
        }
    }

    public void setTab(g gVar) {
        if (gVar != this.f3667a) {
            this.f3667a = gVar;
            e();
        }
    }
}
