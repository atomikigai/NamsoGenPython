package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import app.namso_gen.spacehowen.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class r1 extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f6408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6411d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6412f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p1 f6413r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f6414s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f6415t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f6416u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public u0.g f6417v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public androidx.activity.i f6418w;

    public r1(Context context, boolean z4) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f6408a = new Rect();
        this.f6409b = 0;
        this.f6410c = 0;
        this.f6411d = 0;
        this.e = 0;
        this.f6415t = z4;
        setCacheColorHint(0);
    }

    public final int a(int i, int i10) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i11 = 0;
        View view = null;
        for (int i12 = 0; i12 < count; i12++) {
            int itemViewType = adapter.getItemViewType(i12);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            view = adapter.getView(i12, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i13 = layoutParams.height;
            view.measure(i, i13 > 0 ? View.MeasureSpec.makeMeasureSpec(i13, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i12 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i10) {
                return i10;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x014c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0161  */
    /* JADX WARN: Code duplicated, block: B:85:0x0166  */
    /* JADX WARN: Code duplicated, block: B:87:0x016a  */
    /* JADX WARN: Code duplicated, block: B:89:0x017c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0180  */
    /* JADX WARN: Code duplicated, block: B:93:0x0184  */
    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    public final boolean b(MotionEvent motionEvent, int i) {
        boolean z4;
        boolean zA;
        View childAt;
        View childAt2;
        u0.g gVar;
        int actionMasked = motionEvent.getActionMasked();
        boolean z10 = true;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z4 = true;
            } else if (actionMasked != 3) {
                z4 = true;
                z10 = false;
            } else {
                z4 = false;
                z10 = false;
            }
            if (z4 || z10) {
                this.f6416u = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f6412f - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z4) {
                if (this.f6417v == null) {
                    this.f6417v = new u0.g(this);
                }
                u0.g gVar2 = this.f6417v;
                boolean z11 = gVar2.A;
                gVar2.A = true;
                gVar2.onTouch(this, motionEvent);
            } else {
                gVar = this.f6417v;
                if (gVar != null) {
                    if (gVar.A) {
                        gVar.d();
                    }
                    gVar.A = false;
                }
            }
            return z4;
        }
        z4 = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z4 = false;
            z10 = false;
        } else {
            int x4 = (int) motionEvent.getX(iFindPointerIndex);
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x4, y10);
            if (iPointToPosition != -1) {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f10 = x4;
                float f11 = y10;
                this.f6416u = true;
                m1.a(this, f10, f11);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i10 = this.f6412f;
                if (i10 != -1 && (childAt = getChildAt(i10 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f6412f = iPointToPosition;
                m1.a(childAt3, f10 - childAt3.getLeft(), f11 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z12 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z12) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f6408a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f6409b;
                rect.top -= this.f6410c;
                rect.right += this.f6411d;
                rect.bottom += this.e;
                if (m0.b.c()) {
                    zA = o1.a(this);
                } else {
                    Field field = q1.f6401a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                            zA = false;
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z13 = !zA;
                    if (m0.b.c()) {
                        o1.b(this, z13);
                    } else {
                        Field field2 = q1.f6401a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z13));
                            } catch (IllegalAccessException e4) {
                                e4.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z12) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    i0.b.e(selector, fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    i0.b.e(selector2, f10, f11);
                }
                p1 p1Var = this.f6413r;
                if (p1Var != null) {
                    p1Var.f6393b = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z10 = false;
                z4 = true;
            }
        }
        if (z4) {
            this.f6416u = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f6412f - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f6416u = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f6412f - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z4) {
            if (this.f6417v == null) {
                this.f6417v = new u0.g(this);
            }
            u0.g gVar3 = this.f6417v;
            boolean z14 = gVar3.A;
            gVar3.A = true;
            gVar3.onTouch(this, motionEvent);
        } else {
            gVar = this.f6417v;
            if (gVar != null) {
                if (gVar.A) {
                    gVar.d();
                }
                gVar.A = false;
            }
        }
        return z4;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f6408a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f6418w != null) {
            return;
        }
        super.drawableStateChanged();
        p1 p1Var = this.f6413r;
        if (p1Var != null) {
            p1Var.f6393b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f6416u && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f6415t || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f6415t || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f6415t || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f6415t && this.f6414s) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f6418w = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f6418w == null) {
            androidx.activity.i iVar = new androidx.activity.i(this, 25);
            this.f6418w = iVar;
            post(iVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !n1.f6373d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        n1.f6370a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        n1.f6371b.invoke(this, Integer.valueOf(iPointToPosition));
                        n1.f6372c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        e4.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f6416u && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f6412f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        androidx.activity.i iVar = this.f6418w;
        if (iVar != null) {
            r1 r1Var = (r1) iVar.f358b;
            r1Var.f6418w = null;
            r1Var.removeCallbacks(iVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z4) {
        this.f6414s = z4;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        p1 p1Var = null;
        if (drawable != null) {
            p1 p1Var2 = new p1();
            Drawable drawable2 = p1Var2.f6392a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            p1Var2.f6392a = drawable;
            drawable.setCallback(p1Var2);
            p1Var2.f6393b = true;
            p1Var = p1Var2;
        }
        this.f6413r = p1Var;
        super.setSelector(p1Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f6409b = rect.left;
        this.f6410c = rect.top;
        this.f6411d = rect.right;
        this.e = rect.bottom;
    }
}
