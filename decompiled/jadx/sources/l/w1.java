package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w1 extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6462d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6463f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f6464r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f6465s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f6466t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int[] f6467u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f6468v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f6469w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6470x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6471y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f6472z;

    public w1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6459a = true;
        this.f6460b = -1;
        this.f6461c = 0;
        this.e = 8388659;
        int[] iArr = f.a.f3562n;
        a2.l lVarG = a2.l.G(context, attributeSet, iArr, i);
        q0.v0.k(this, context, iArr, attributeSet, (TypedArray) lVarG.f44c, i);
        TypedArray typedArray = (TypedArray) lVarG.f44c;
        int i10 = typedArray.getInt(1, -1);
        if (i10 >= 0) {
            setOrientation(i10);
        }
        int i11 = typedArray.getInt(0, -1);
        if (i11 >= 0) {
            setGravity(i11);
        }
        boolean z4 = typedArray.getBoolean(2, true);
        if (!z4) {
            setBaselineAligned(z4);
        }
        this.f6464r = typedArray.getFloat(4, -1.0f);
        this.f6460b = typedArray.getInt(3, -1);
        this.f6465s = typedArray.getBoolean(7, false);
        setDividerDrawable(lVarG.u(5));
        this.f6471y = typedArray.getInt(8, 0);
        this.f6472z = typedArray.getDimensionPixelSize(6, 0);
        lVarG.I();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof v1;
    }

    public final void d(Canvas canvas, int i) {
        this.f6468v.setBounds(getPaddingLeft() + this.f6472z, i, (getWidth() - getPaddingRight()) - this.f6472z, this.f6470x + i);
        this.f6468v.draw(canvas);
    }

    public final void e(Canvas canvas, int i) {
        this.f6468v.setBounds(i, getPaddingTop() + this.f6472z, this.f6469w + i, (getHeight() - getPaddingBottom()) - this.f6472z);
        this.f6468v.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public v1 generateDefaultLayoutParams() {
        int i = this.f6462d;
        if (i == 0) {
            return new v1(-2, -2);
        }
        if (i == 1) {
            return new v1(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public v1 generateLayoutParams(AttributeSet attributeSet) {
        return new v1(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f6460b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i10 = this.f6460b;
        if (childCount <= i10) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i10);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f6460b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f6461c;
        if (this.f6462d == 1 && (i = this.e & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f6463f) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f6463f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((v1) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f6460b;
    }

    public Drawable getDividerDrawable() {
        return this.f6468v;
    }

    public int getDividerPadding() {
        return this.f6472z;
    }

    public int getDividerWidth() {
        return this.f6469w;
    }

    public int getGravity() {
        return this.e;
    }

    public int getOrientation() {
        return this.f6462d;
    }

    public int getShowDividers() {
        return this.f6471y;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f6464r;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public v1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new v1(layoutParams);
    }

    public final boolean i(int i) {
        if (i == 0) {
            return (this.f6471y & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f6471y & 4) != 0;
        }
        if ((this.f6471y & 2) != 0) {
            for (int i10 = i - 1; i10 >= 0; i10--) {
                if (getChildAt(i10).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        int bottom;
        if (this.f6468v == null) {
            return;
        }
        int i10 = 0;
        if (this.f6462d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i10 < virtualChildCount) {
                View childAt = getChildAt(i10);
                if (childAt != null && childAt.getVisibility() != 8 && i(i10)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((v1) childAt.getLayoutParams())).topMargin) - this.f6470x);
                }
                i10++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f6470x;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((v1) childAt2.getLayoutParams())).bottomMargin;
                }
                d(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zA = p3.a(this);
        while (i10 < virtualChildCount2) {
            View childAt3 = getChildAt(i10);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i10)) {
                v1 v1Var = (v1) childAt3.getLayoutParams();
                e(canvas, zA ? childAt3.getRight() + ((LinearLayout.LayoutParams) v1Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) v1Var).leftMargin) - this.f6469w);
            }
            i10++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                v1 v1Var2 = (v1) childAt4.getLayoutParams();
                if (zA) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) v1Var2).leftMargin;
                    i = this.f6469w;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) v1Var2).rightMargin;
                }
            } else if (zA) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f6469w;
                right = left - i;
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0157  */
    /* JADX WARN: Code duplicated, block: B:61:0x0160  */
    /* JADX WARN: Code duplicated, block: B:63:0x0164  */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    /* JADX WARN: Code duplicated, block: B:66:0x016c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0174  */
    /* JADX WARN: Code duplicated, block: B:70:0x0180  */
    /* JADX WARN: Code duplicated, block: B:72:0x0187  */
    /* JADX WARN: Code duplicated, block: B:73:0x018e  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a6  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i, int i10, int i11, int i12) {
        int paddingLeft;
        int i13;
        int i14;
        int i15;
        int i16;
        int baseline;
        int i17;
        int i18;
        int i19;
        int measuredHeight;
        int i20;
        int paddingTop;
        int i21;
        int i22;
        int i23;
        int i24 = 8;
        char c10 = 2;
        if (this.f6462d == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i25 = i11 - i;
            int paddingRight = i25 - getPaddingRight();
            int paddingRight2 = (i25 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i26 = this.e;
            int i27 = i26 & 112;
            int i28 = 8388615 & i26;
            if (i27 != 16) {
                paddingTop = i27 != 80 ? getPaddingTop() : ((getPaddingTop() + i12) - i10) - this.f6463f;
            } else {
                paddingTop = getPaddingTop() + (((i12 - i10) - this.f6463f) / 2);
            }
            int i29 = 0;
            while (i29 < virtualChildCount) {
                View childAt = getChildAt(i29);
                if (childAt != null && childAt.getVisibility() != i24) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    v1 v1Var = (v1) childAt.getLayoutParams();
                    int i30 = ((LinearLayout.LayoutParams) v1Var).gravity;
                    if (i30 < 0) {
                        i30 = i28;
                    }
                    WeakHashMap weakHashMap = q0.v0.f7946a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i30, q0.e0.d(this)) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i23 = ((LinearLayout.LayoutParams) v1Var).leftMargin + paddingLeft2;
                        } else {
                            i21 = paddingRight - measuredWidth;
                            i22 = ((LinearLayout.LayoutParams) v1Var).rightMargin;
                        }
                        if (i(i29)) {
                            paddingTop += this.f6470x;
                        }
                        int i31 = paddingTop + ((LinearLayout.LayoutParams) v1Var).topMargin;
                        childAt.layout(i23, i31, measuredWidth + i23, i31 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) v1Var).bottomMargin + i31;
                    } else {
                        i21 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) v1Var).leftMargin;
                        i22 = ((LinearLayout.LayoutParams) v1Var).rightMargin;
                    }
                    i23 = i21 - i22;
                    if (i(i29)) {
                        paddingTop += this.f6470x;
                    }
                    int i32 = paddingTop + ((LinearLayout.LayoutParams) v1Var).topMargin;
                    childAt.layout(i23, i32, measuredWidth + i23, i32 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) v1Var).bottomMargin + i32;
                }
                i29++;
                c10 = c10;
                i24 = 8;
            }
            return;
        }
        boolean zA = p3.a(this);
        int paddingTop2 = getPaddingTop();
        int i33 = i12 - i10;
        int paddingBottom = i33 - getPaddingBottom();
        int paddingBottom2 = (i33 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i34 = this.e;
        int i35 = 8388615 & i34;
        int i36 = i34 & 112;
        boolean z10 = this.f6459a;
        int[] iArr = this.f6466t;
        int[] iArr2 = this.f6467u;
        WeakHashMap weakHashMap2 = q0.v0.f7946a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i35, q0.e0.d(this));
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i11) - i) - this.f6463f;
        } else {
            paddingLeft = getPaddingLeft() + (((i11 - i) - this.f6463f) / 2);
        }
        if (zA) {
            i14 = virtualChildCount2 - 1;
            i13 = -1;
        } else {
            i13 = 1;
            i14 = 0;
        }
        int i37 = 0;
        while (i37 < virtualChildCount2) {
            int i38 = (i13 * i37) + i14;
            View childAt2 = getChildAt(i38);
            if (childAt2 == null) {
                i15 = i14;
            } else {
                i15 = i14;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    v1 v1Var2 = (v1) childAt2.getLayoutParams();
                    int i39 = paddingLeft;
                    if (z10) {
                        i16 = paddingTop2;
                        baseline = ((LinearLayout.LayoutParams) v1Var2).height != -1 ? childAt2.getBaseline() : -1;
                        i17 = ((LinearLayout.LayoutParams) v1Var2).gravity;
                        if (i17 < 0) {
                            i17 = i36;
                        }
                        i18 = i17 & 112;
                        if (i18 != 16) {
                            if (i18 != 48) {
                                i19 = i16 + ((LinearLayout.LayoutParams) v1Var2).topMargin;
                                if (baseline != -1) {
                                    i19 = (iArr[1] - baseline) + i19;
                                }
                            } else if (i18 != 80) {
                                i19 = i16;
                            } else {
                                i19 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) v1Var2).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                            }
                            if (i(i38)) {
                                i20 = i39 + this.f6469w;
                            } else {
                                i20 = i39;
                            }
                            int i40 = i20 + ((LinearLayout.LayoutParams) v1Var2).leftMargin;
                            childAt2.layout(i40, i19, i40 + measuredWidth2, i19 + measuredHeight3);
                            paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) v1Var2).rightMargin + i40;
                        } else {
                            i19 = ((paddingBottom2 - measuredHeight3) / 2) + i16 + ((LinearLayout.LayoutParams) v1Var2).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) v1Var2).bottomMargin;
                        }
                        i19 -= measuredHeight;
                        if (i(i38)) {
                            i20 = i39 + this.f6469w;
                        } else {
                            i20 = i39;
                        }
                        int i41 = i20 + ((LinearLayout.LayoutParams) v1Var2).leftMargin;
                        childAt2.layout(i41, i19, i41 + measuredWidth2, i19 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) v1Var2).rightMargin + i41;
                    } else {
                        i16 = paddingTop2;
                    }
                    i17 = ((LinearLayout.LayoutParams) v1Var2).gravity;
                    if (i17 < 0) {
                        i17 = i36;
                    }
                    i18 = i17 & 112;
                    if (i18 != 16) {
                        if (i18 != 48) {
                            i19 = i16 + ((LinearLayout.LayoutParams) v1Var2).topMargin;
                            if (baseline != -1) {
                                i19 = (iArr[1] - baseline) + i19;
                            }
                        } else if (i18 != 80) {
                            i19 = i16;
                        } else {
                            i19 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) v1Var2).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (i(i38)) {
                            i20 = i39 + this.f6469w;
                        } else {
                            i20 = i39;
                        }
                        int i42 = i20 + ((LinearLayout.LayoutParams) v1Var2).leftMargin;
                        childAt2.layout(i42, i19, i42 + measuredWidth2, i19 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) v1Var2).rightMargin + i42;
                    } else {
                        i19 = ((paddingBottom2 - measuredHeight3) / 2) + i16 + ((LinearLayout.LayoutParams) v1Var2).topMargin;
                        measuredHeight = ((LinearLayout.LayoutParams) v1Var2).bottomMargin;
                    }
                    i19 -= measuredHeight;
                    if (i(i38)) {
                        i20 = i39 + this.f6469w;
                    } else {
                        i20 = i39;
                    }
                    int i43 = i20 + ((LinearLayout.LayoutParams) v1Var2).leftMargin;
                    childAt2.layout(i43, i19, i43 + measuredWidth2, i19 + measuredHeight3);
                    paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) v1Var2).rightMargin + i43;
                }
                i37++;
                i14 = i15;
                paddingTop2 = i16;
            }
            i16 = paddingTop2;
            i37++;
            i14 = i15;
            paddingTop2 = i16;
        }
    }

    /* JADX WARN: Code duplicated, block: B:228:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:231:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:233:0x0501  */
    /* JADX WARN: Code duplicated, block: B:235:0x0505  */
    /* JADX WARN: Code duplicated, block: B:237:0x0526  */
    /* JADX WARN: Code duplicated, block: B:243:0x0536  */
    /* JADX WARN: Code duplicated, block: B:246:0x053d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:248:0x0540  */
    /* JADX WARN: Code duplicated, block: B:250:0x0547 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:252:0x054a  */
    /* JADX WARN: Code duplicated, block: B:366:0x079c  */
    /* JADX WARN: Code duplicated, block: B:64:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0142  */
    /* JADX WARN: Code duplicated, block: B:68:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x014b  */
    @Override // android.view.View
    public void onMeasure(int i, int i10) {
        int i11;
        int i12;
        int i13;
        int iMax;
        int i14;
        int baseline;
        int i15;
        int i16;
        int[] iArr;
        int i17;
        int i18;
        boolean z4;
        boolean z10;
        v1 v1Var;
        View view;
        int i19;
        int[] iArr2;
        int i20;
        int i21;
        boolean z11;
        int i22;
        int measuredHeight;
        boolean z12;
        boolean z13;
        int iMax2;
        int i23;
        int baseline2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z14;
        int i29;
        int i30;
        int i31;
        View view2;
        boolean z15;
        w1 w1Var = this;
        int i32 = -2;
        int iMax3 = 0;
        int i33 = 1073741824;
        int i34 = 8;
        if (w1Var.f6462d == 1) {
            w1Var.f6463f = 0;
            int virtualChildCount = w1Var.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i10);
            int i35 = w1Var.f6460b;
            boolean z16 = w1Var.f6465s;
            int i36 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            boolean z17 = false;
            int i37 = 0;
            boolean z18 = false;
            boolean z19 = true;
            float f10 = 0.0f;
            int iMax6 = 0;
            while (i36 < virtualChildCount) {
                int i38 = mode;
                View childAt = w1Var.getChildAt(i36);
                if (childAt == null) {
                    w1Var.f6463f = w1Var.f6463f;
                } else {
                    if (childAt.getVisibility() != i34) {
                        if (w1Var.i(i36)) {
                            w1Var.f6463f += w1Var.f6470x;
                        }
                        v1 v1Var2 = (v1) childAt.getLayoutParams();
                        float f11 = ((LinearLayout.LayoutParams) v1Var2).weight;
                        f10 += f11;
                        if (mode2 == i33 && ((LinearLayout.LayoutParams) v1Var2).height == 0 && f11 > 0.0f) {
                            int i39 = w1Var.f6463f;
                            w1Var.f6463f = Math.max(i39, ((LinearLayout.LayoutParams) v1Var2).topMargin + i39 + ((LinearLayout.LayoutParams) v1Var2).bottomMargin);
                            view2 = childAt;
                            i28 = mode2;
                            i29 = i35;
                            z14 = z16;
                            i30 = i36;
                            z17 = true;
                            i31 = i38;
                        } else {
                            if (((LinearLayout.LayoutParams) v1Var2).height != 0 || f11 <= 0.0f) {
                                i27 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) v1Var2).height = i32;
                                i27 = 0;
                            }
                            i28 = mode2;
                            z14 = z16;
                            i29 = i35;
                            i30 = i36;
                            i31 = i38;
                            w1Var.measureChildWithMargins(childAt, i, 0, i10, f10 == 0.0f ? w1Var.f6463f : 0);
                            if (i27 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) v1Var2).height = i27;
                            }
                            int measuredHeight2 = childAt.getMeasuredHeight();
                            int i40 = w1Var.f6463f;
                            view2 = childAt;
                            w1Var.f6463f = Math.max(i40, i40 + measuredHeight2 + ((LinearLayout.LayoutParams) v1Var2).topMargin + ((LinearLayout.LayoutParams) v1Var2).bottomMargin);
                            if (z14) {
                                iMax6 = Math.max(measuredHeight2, iMax6);
                            }
                        }
                        if (i29 >= 0 && i29 == i30 + 1) {
                            w1Var.f6461c = w1Var.f6463f;
                        }
                        if (i30 < i29 && ((LinearLayout.LayoutParams) v1Var2).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (i31 == 1073741824 || ((LinearLayout.LayoutParams) v1Var2).width != -1) {
                            z15 = false;
                        } else {
                            z15 = true;
                            z18 = true;
                        }
                        int i41 = ((LinearLayout.LayoutParams) v1Var2).leftMargin + ((LinearLayout.LayoutParams) v1Var2).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i41;
                        iMax3 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z20 = z15;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i37, measuredState);
                        if (z19) {
                            i37 = iCombineMeasuredStates;
                            boolean z21 = ((LinearLayout.LayoutParams) v1Var2).width == -1;
                            if (((LinearLayout.LayoutParams) v1Var2).weight > 0.0f) {
                                if (!z20) {
                                    i41 = measuredWidth;
                                }
                                iMax5 = Math.max(iMax5, i41);
                            } else {
                                if (!z20) {
                                    i41 = measuredWidth;
                                }
                                iMax4 = Math.max(iMax4, i41);
                            }
                            z19 = z21;
                        } else {
                            i37 = iCombineMeasuredStates;
                        }
                        if (((LinearLayout.LayoutParams) v1Var2).weight > 0.0f) {
                            if (!z20) {
                                i41 = measuredWidth;
                            }
                            iMax5 = Math.max(iMax5, i41);
                        } else {
                            if (!z20) {
                                i41 = measuredWidth;
                            }
                            iMax4 = Math.max(iMax4, i41);
                        }
                        z19 = z21;
                    }
                    i36 = i30 + 1;
                    i35 = i29;
                    mode = i31;
                    z16 = z14;
                    mode2 = i28;
                    i32 = -2;
                    i33 = 1073741824;
                    i34 = 8;
                }
                i28 = mode2;
                i29 = i35;
                z14 = z16;
                i30 = i36;
                i31 = i38;
                i36 = i30 + 1;
                i35 = i29;
                mode = i31;
                z16 = z14;
                mode2 = i28;
                i32 = -2;
                i33 = 1073741824;
                i34 = 8;
            }
            int i42 = mode;
            int i43 = mode2;
            boolean z22 = z16;
            int i44 = i37;
            int i45 = i10;
            if (w1Var.f6463f > 0 && w1Var.i(virtualChildCount)) {
                w1Var.f6463f += w1Var.f6470x;
            }
            if (z22 && (i43 == Integer.MIN_VALUE || i43 == 0)) {
                w1Var.f6463f = 0;
                for (int i46 = 0; i46 < virtualChildCount; i46++) {
                    View childAt2 = w1Var.getChildAt(i46);
                    if (childAt2 == null) {
                        w1Var.f6463f = w1Var.f6463f;
                    } else if (childAt2.getVisibility() != 8) {
                        v1 v1Var3 = (v1) childAt2.getLayoutParams();
                        int i47 = w1Var.f6463f;
                        w1Var.f6463f = Math.max(i47, i47 + iMax6 + ((LinearLayout.LayoutParams) v1Var3).topMargin + ((LinearLayout.LayoutParams) v1Var3).bottomMargin);
                    }
                }
            }
            int paddingBottom = w1Var.getPaddingBottom() + w1Var.getPaddingTop() + w1Var.f6463f;
            w1Var.f6463f = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, w1Var.getSuggestedMinimumHeight()), i45, 0);
            int i48 = (iResolveSizeAndState & 16777215) - w1Var.f6463f;
            if (z17 || (i48 != 0 && f10 > 0.0f)) {
                float f12 = w1Var.f6464r;
                if (f12 > 0.0f) {
                    f10 = f12;
                }
                w1Var.f6463f = 0;
                int iCombineMeasuredStates2 = i44;
                int i49 = 0;
                while (i49 < virtualChildCount) {
                    View childAt3 = w1Var.getChildAt(i49);
                    if (childAt3.getVisibility() == 8) {
                        i49 = i49;
                    } else {
                        v1 v1Var4 = (v1) childAt3.getLayoutParams();
                        float f13 = ((LinearLayout.LayoutParams) v1Var4).weight;
                        if (f13 > 0.0f) {
                            int i50 = (int) ((i48 * f13) / f10);
                            f10 -= f13;
                            i48 -= i50;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, w1Var.getPaddingRight() + w1Var.getPaddingLeft() + ((LinearLayout.LayoutParams) v1Var4).leftMargin + ((LinearLayout.LayoutParams) v1Var4).rightMargin, ((LinearLayout.LayoutParams) v1Var4).width);
                            if (((LinearLayout.LayoutParams) v1Var4).height == 0) {
                                i26 = 1073741824;
                                if (i43 == 1073741824) {
                                    if (i50 <= 0) {
                                        i50 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i50, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            } else {
                                i26 = 1073741824;
                            }
                            int measuredHeight3 = childAt3.getMeasuredHeight() + i50;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i26));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                        }
                        int i51 = ((LinearLayout.LayoutParams) v1Var4).leftMargin + ((LinearLayout.LayoutParams) v1Var4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i51;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i42 != 1073741824) {
                            i25 = -1;
                            if (((LinearLayout.LayoutParams) v1Var4).width == -1) {
                                measuredWidth2 = i51;
                            }
                        } else {
                            i25 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z23 = z19 && ((LinearLayout.LayoutParams) v1Var4).width == i25;
                        int i52 = w1Var.f6463f;
                        w1Var.f6463f = Math.max(i52, childAt3.getMeasuredHeight() + i52 + ((LinearLayout.LayoutParams) v1Var4).topMargin + ((LinearLayout.LayoutParams) v1Var4).bottomMargin);
                        z19 = z23;
                    }
                    i49++;
                }
                w1Var.f6463f = w1Var.getPaddingBottom() + w1Var.getPaddingTop() + w1Var.f6463f;
                i44 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z22 && i43 != 1073741824) {
                    for (int i53 = 0; i53 < virtualChildCount; i53++) {
                        View childAt4 = w1Var.getChildAt(i53);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((v1) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z19 || i42 == 1073741824) {
                iMax4 = iMax3;
            }
            w1Var.setMeasuredDimension(View.resolveSizeAndState(Math.max(w1Var.getPaddingRight() + w1Var.getPaddingLeft() + iMax4, w1Var.getSuggestedMinimumWidth()), i, i44), iResolveSizeAndState);
            if (z18) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(w1Var.getMeasuredWidth(), 1073741824);
                int i54 = 0;
                while (i54 < virtualChildCount) {
                    View childAt5 = w1Var.getChildAt(i54);
                    if (childAt5.getVisibility() != 8) {
                        v1 v1Var5 = (v1) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) v1Var5).width == -1) {
                            int i55 = ((LinearLayout.LayoutParams) v1Var5).height;
                            ((LinearLayout.LayoutParams) v1Var5).height = childAt5.getMeasuredHeight();
                            w1Var.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i45, 0);
                            ((LinearLayout.LayoutParams) v1Var5).height = i55;
                        }
                    }
                    i54++;
                    i45 = i10;
                }
                return;
            }
            return;
        }
        int i56 = i;
        w1Var.f6463f = 0;
        int virtualChildCount2 = w1Var.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i56);
        int mode4 = View.MeasureSpec.getMode(i10);
        if (w1Var.f6466t == null || w1Var.f6467u == null) {
            w1Var.f6466t = new int[4];
            w1Var.f6467u = new int[4];
        }
        int[] iArr3 = w1Var.f6466t;
        int[] iArr4 = w1Var.f6467u;
        iArr3[3] = -1;
        char c10 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z24 = w1Var.f6459a;
        boolean z25 = w1Var.f6465s;
        boolean z26 = mode3 == 1073741824;
        float f14 = 0.0f;
        boolean z27 = true;
        int i57 = 0;
        int i58 = 0;
        int i59 = 0;
        int iMax7 = 0;
        int iMax8 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z28 = false;
        boolean z29 = false;
        while (i57 < virtualChildCount2) {
            char c11 = c10;
            View childAt6 = w1Var.getChildAt(i57);
            if (childAt6 == null) {
                w1Var.f6463f = w1Var.f6463f;
                i18 = i57;
                i23 = i59;
                iArr2 = iArr3;
                iArr = iArr4;
                z4 = z24;
                z10 = z25;
            } else {
                int i60 = i58;
                if (childAt6.getVisibility() == 8) {
                    i56 = i;
                    i18 = i57;
                    i23 = i59;
                    iArr = iArr4;
                    z4 = z24;
                    z10 = z25;
                    i58 = i60;
                    iArr2 = iArr3;
                } else {
                    if (w1Var.i(i57)) {
                        w1Var.f6463f += w1Var.f6469w;
                    }
                    v1 v1Var6 = (v1) childAt6.getLayoutParams();
                    float f15 = ((LinearLayout.LayoutParams) v1Var6).weight;
                    f14 += f15;
                    int i61 = i57;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) v1Var6).width == 0 && f15 > 0.0f) {
                        if (z26) {
                            w1Var.f6463f = ((LinearLayout.LayoutParams) v1Var6).leftMargin + ((LinearLayout.LayoutParams) v1Var6).rightMargin + w1Var.f6463f;
                        } else {
                            int i62 = w1Var.f6463f;
                            w1Var.f6463f = Math.max(i62, ((LinearLayout.LayoutParams) v1Var6).leftMargin + i62 + ((LinearLayout.LayoutParams) v1Var6).rightMargin);
                        }
                        if (z24) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z4 = z24;
                            z10 = z25;
                            i19 = i60;
                            i18 = i61;
                            v1Var = v1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i56 = i;
                            i20 = i59;
                            i17 = iMax7;
                        } else {
                            view = childAt6;
                            z4 = z24;
                            z10 = z25;
                            z29 = true;
                            i19 = i60;
                            i18 = i61;
                            i21 = 1073741824;
                            v1Var = v1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i56 = i;
                            i20 = i59;
                            i17 = iMax7;
                        }
                        if (mode4 == i21 && ((LinearLayout.LayoutParams) v1Var).height == -1) {
                            z11 = true;
                            z28 = true;
                        } else {
                            z11 = false;
                        }
                        i22 = ((LinearLayout.LayoutParams) v1Var).topMargin + ((LinearLayout.LayoutParams) v1Var).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i22;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z4) {
                            baseline2 = view.getBaseline();
                            z12 = z11;
                            if (baseline2 != -1) {
                                i24 = ((LinearLayout.LayoutParams) v1Var).gravity;
                                if (i24 < 0) {
                                    i24 = w1Var.e;
                                }
                                int i63 = (((i24 & 112) >> 4) & (-2)) >> 1;
                                iArr2[i63] = Math.max(iArr2[i63], baseline2);
                                iArr[i63] = Math.max(iArr[i63], measuredHeight - baseline2);
                            }
                        } else {
                            z12 = z11;
                        }
                        int iMax9 = Math.max(i19, measuredHeight);
                        if (z27 || ((LinearLayout.LayoutParams) v1Var).height != -1) {
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        if (((LinearLayout.LayoutParams) v1Var).weight > 0.0f) {
                            if (!z12) {
                                i22 = measuredHeight;
                            }
                            iMax7 = Math.max(i17, i22);
                            iMax2 = i20;
                        } else {
                            if (!z12) {
                                i22 = measuredHeight;
                            }
                            iMax2 = Math.max(i20, i22);
                            iMax7 = i17;
                        }
                        int i64 = iMax2;
                        i58 = iMax9;
                        i23 = i64;
                        z27 = z13;
                    } else {
                        if (((LinearLayout.LayoutParams) v1Var6).width != 0 || f15 <= 0.0f) {
                            i16 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) v1Var6).width = -2;
                            i16 = 0;
                        }
                        iArr = iArr4;
                        i17 = iMax7;
                        i18 = i61;
                        z4 = z24;
                        z10 = z25;
                        int i65 = i16;
                        v1Var = v1Var6;
                        view = childAt6;
                        i19 = i60;
                        i56 = i;
                        iArr2 = iArr3;
                        i20 = i59;
                        w1Var.measureChildWithMargins(view, i56, f14 == 0.0f ? w1Var.f6463f : 0, i10, 0);
                        if (i65 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) v1Var).width = i65;
                        }
                        int measuredWidth3 = view.getMeasuredWidth();
                        if (z26) {
                            w1Var.f6463f = ((LinearLayout.LayoutParams) v1Var).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) v1Var).rightMargin + w1Var.f6463f;
                        } else {
                            int i66 = w1Var.f6463f;
                            w1Var.f6463f = Math.max(i66, i66 + measuredWidth3 + ((LinearLayout.LayoutParams) v1Var).leftMargin + ((LinearLayout.LayoutParams) v1Var).rightMargin);
                        }
                        if (z10) {
                            iMax8 = Math.max(measuredWidth3, iMax8);
                        }
                    }
                    i21 = 1073741824;
                    if (mode4 == i21) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    i22 = ((LinearLayout.LayoutParams) v1Var).topMargin + ((LinearLayout.LayoutParams) v1Var).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i22;
                    iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                    if (z4) {
                        baseline2 = view.getBaseline();
                        z12 = z11;
                        if (baseline2 != -1) {
                            i24 = ((LinearLayout.LayoutParams) v1Var).gravity;
                            if (i24 < 0) {
                                i24 = w1Var.e;
                            }
                            int i67 = (((i24 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i67] = Math.max(iArr2[i67], baseline2);
                            iArr[i67] = Math.max(iArr[i67], measuredHeight - baseline2);
                        }
                    } else {
                        z12 = z11;
                    }
                    int iMax10 = Math.max(i19, measuredHeight);
                    if (z27) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    if (((LinearLayout.LayoutParams) v1Var).weight > 0.0f) {
                        if (!z12) {
                            i22 = measuredHeight;
                        }
                        iMax7 = Math.max(i17, i22);
                        iMax2 = i20;
                    } else {
                        if (!z12) {
                            i22 = measuredHeight;
                        }
                        iMax2 = Math.max(i20, i22);
                        iMax7 = i17;
                    }
                    int i68 = iMax2;
                    i58 = iMax10;
                    i23 = i68;
                    z27 = z13;
                }
            }
            i59 = i23;
            i57 = i18 + 1;
            c10 = c11;
            iArr3 = iArr2;
            iArr4 = iArr;
            z24 = z4;
            z25 = z10;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c12 = c10;
        boolean z30 = z24;
        boolean z31 = z25;
        int i69 = i58;
        int i70 = i59;
        int i71 = iMax7;
        if (w1Var.f6463f > 0 && w1Var.i(virtualChildCount2)) {
            w1Var.f6463f += w1Var.f6469w;
        }
        int i72 = iArr5[1];
        int iMax11 = (i72 == -1 && iArr5[0] == -1 && iArr5[c12] == -1 && iArr5[3] == -1) ? i69 : Math.max(i69, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c12]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i72, iArr5[c12]))));
        if (z31 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            w1Var.f6463f = 0;
            for (int i73 = 0; i73 < virtualChildCount2; i73++) {
                View childAt7 = w1Var.getChildAt(i73);
                if (childAt7 == null) {
                    w1Var.f6463f = w1Var.f6463f;
                } else if (childAt7.getVisibility() != 8) {
                    v1 v1Var7 = (v1) childAt7.getLayoutParams();
                    if (z26) {
                        w1Var.f6463f = ((LinearLayout.LayoutParams) v1Var7).leftMargin + iMax8 + ((LinearLayout.LayoutParams) v1Var7).rightMargin + w1Var.f6463f;
                    } else {
                        int i74 = w1Var.f6463f;
                        w1Var.f6463f = Math.max(i74, i74 + iMax8 + ((LinearLayout.LayoutParams) v1Var7).leftMargin + ((LinearLayout.LayoutParams) v1Var7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = w1Var.getPaddingRight() + w1Var.getPaddingLeft() + w1Var.f6463f;
        w1Var.f6463f = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, w1Var.getSuggestedMinimumWidth()), i56, 0);
        int i75 = (iResolveSizeAndState2 & 16777215) - w1Var.f6463f;
        if (z29 || (i75 != 0 && f14 > 0.0f)) {
            float f16 = w1Var.f6464r;
            if (f16 > 0.0f) {
                f14 = f16;
            }
            iArr5[3] = -1;
            iArr5[c12] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c12] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            w1Var.f6463f = 0;
            iMax11 = -1;
            int i76 = 0;
            while (i76 < virtualChildCount2) {
                View childAt8 = w1Var.getChildAt(i76);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    iResolveSizeAndState2 = iResolveSizeAndState2;
                } else {
                    v1 v1Var8 = (v1) childAt8.getLayoutParams();
                    float f17 = ((LinearLayout.LayoutParams) v1Var8).weight;
                    if (f17 > 0.0f) {
                        int i77 = (int) ((i75 * f17) / f14);
                        f14 -= f17;
                        i75 -= i77;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, w1Var.getPaddingBottom() + w1Var.getPaddingTop() + ((LinearLayout.LayoutParams) v1Var8).topMargin + ((LinearLayout.LayoutParams) v1Var8).bottomMargin, ((LinearLayout.LayoutParams) v1Var8).height);
                        if (((LinearLayout.LayoutParams) v1Var8).width == 0) {
                            i15 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i77 <= 0) {
                                    i77 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i77, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i15 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i77;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i15), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    }
                    if (z26) {
                        w1Var.f6463f = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) v1Var8).leftMargin + ((LinearLayout.LayoutParams) v1Var8).rightMargin + w1Var.f6463f;
                    } else {
                        int i78 = w1Var.f6463f;
                        w1Var.f6463f = Math.max(i78, childAt8.getMeasuredWidth() + i78 + ((LinearLayout.LayoutParams) v1Var8).leftMargin + ((LinearLayout.LayoutParams) v1Var8).rightMargin);
                    }
                    boolean z32 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) v1Var8).height == -1;
                    int i79 = ((LinearLayout.LayoutParams) v1Var8).topMargin + ((LinearLayout.LayoutParams) v1Var8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i79;
                    iMax11 = Math.max(iMax11, measuredHeight4);
                    if (!z32) {
                        i79 = measuredHeight4;
                    }
                    int iMax12 = Math.max(i70, i79);
                    if (z27) {
                        i14 = -1;
                        boolean z33 = ((LinearLayout.LayoutParams) v1Var8).height == -1;
                        if (!z30 && (baseline = childAt8.getBaseline()) != i14) {
                            int i80 = ((LinearLayout.LayoutParams) v1Var8).gravity;
                            if (i80 < 0) {
                                i80 = w1Var.e;
                            }
                            int i81 = (((i80 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i81] = Math.max(iArr5[i81], baseline);
                            iArr6[i81] = Math.max(iArr6[i81], measuredHeight4 - baseline);
                        }
                        z27 = z33;
                        i70 = iMax12;
                    } else {
                        i14 = -1;
                    }
                    if (!z30) {
                    }
                    z27 = z33;
                    i70 = iMax12;
                }
                i76++;
                iResolveSizeAndState2 = iResolveSizeAndState2;
            }
            i11 = iResolveSizeAndState2;
            i12 = -16777216;
            w1Var.f6463f = w1Var.getPaddingRight() + w1Var.getPaddingLeft() + w1Var.f6463f;
            int i82 = iArr5[1];
            if (i82 == -1 && iArr5[0] == -1 && iArr5[c12] == -1 && iArr5[3] == -1) {
                i13 = 0;
            } else {
                i13 = 0;
                iMax11 = Math.max(iMax11, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c12]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i82, iArr5[c12]))));
            }
            iMax = i70;
        } else {
            iMax = Math.max(i70, i71);
            if (z31 && mode3 != 1073741824) {
                for (int i83 = 0; i83 < virtualChildCount2; i83++) {
                    View childAt9 = w1Var.getChildAt(i83);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((v1) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax8, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i11 = iResolveSizeAndState2;
            i12 = -16777216;
            i13 = 0;
        }
        if (!z27 && mode4 != 1073741824) {
            iMax11 = iMax;
        }
        w1Var.setMeasuredDimension(i11 | (iCombineMeasuredStates3 & i12), View.resolveSizeAndState(Math.max(w1Var.getPaddingBottom() + w1Var.getPaddingTop() + iMax11, w1Var.getSuggestedMinimumHeight()), i10, iCombineMeasuredStates3 << 16));
        if (z28) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(w1Var.getMeasuredHeight(), 1073741824);
            int i84 = i13;
            while (i84 < virtualChildCount2) {
                View childAt10 = w1Var.getChildAt(i84);
                if (childAt10.getVisibility() != 8) {
                    v1 v1Var9 = (v1) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) v1Var9).height == -1) {
                        int i85 = ((LinearLayout.LayoutParams) v1Var9).width;
                        ((LinearLayout.LayoutParams) v1Var9).width = childAt10.getMeasuredWidth();
                        w1Var.measureChildWithMargins(childAt10, i56, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) v1Var9).width = i85;
                    }
                }
                i84++;
                w1Var = this;
                i56 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z4) {
        this.f6459a = z4;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f6460b = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f6468v) {
            return;
        }
        this.f6468v = drawable;
        if (drawable != null) {
            this.f6469w = drawable.getIntrinsicWidth();
            this.f6470x = drawable.getIntrinsicHeight();
        } else {
            this.f6469w = 0;
            this.f6470x = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f6472z = i;
    }

    public void setGravity(int i) {
        if (this.e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i10 = i & 8388615;
        int i11 = this.e;
        if ((8388615 & i11) != i10) {
            this.e = i10 | ((-8388616) & i11);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z4) {
        this.f6465s = z4;
    }

    public void setOrientation(int i) {
        if (this.f6462d != i) {
            this.f6462d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f6471y) {
            requestLayout();
        }
        this.f6471y = i;
    }

    public void setVerticalGravity(int i) {
        int i10 = i & 112;
        int i11 = this.e;
        if ((i11 & 112) != i10) {
            this.e = i10 | (i11 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f6464r = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
