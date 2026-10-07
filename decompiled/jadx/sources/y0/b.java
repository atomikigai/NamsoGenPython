package y0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.common.api.f;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import n8.e;
import q0.d0;
import q0.e0;
import q0.v0;
import r0.l;
import r0.p;
import r7.i;
import r7.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends q0.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Rect f10361n = new Rect(f.API_PRIORITY_OTHER, f.API_PRIORITY_OTHER, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final i f10362o = new i();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final j f10363p = new j();
    public final AccessibilityManager h;
    public final Chip i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f10367j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f10364d = new Rect();
    public final Rect e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f10365f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f10366g = new int[2];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10368k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10369l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10370m = Integer.MIN_VALUE;

    public b(Chip chip) {
        this.i = chip;
        this.h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = v0.f7946a;
        if (d0.c(chip) == 0) {
            d0.s(chip, 1);
        }
    }

    @Override // q0.c
    public final a4.b b(View view) {
        if (this.f10367j == null) {
            this.f10367j = new a(this);
        }
        return this.f10367j;
    }

    @Override // q0.c
    public final void d(View view, l lVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = lVar.f8119a;
        this.f7886a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((n8.c) this).f7319q;
        e eVar = chip.e;
        accessibilityNodeInfo.setCheckable(eVar != null && eVar.f7321b0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        accessibilityNodeInfo.setClassName(chip.getAccessibilityClassName());
        lVar.p(chip.getText());
    }

    public final boolean j(int i) {
        if (this.f10369l != i) {
            return false;
        }
        this.f10369l = Integer.MIN_VALUE;
        n8.c cVar = (n8.c) this;
        if (i == 1) {
            Chip chip = cVar.f7319q;
            chip.f2398y = false;
            chip.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    public final l k(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        l lVar = new l(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        accessibilityNodeInfoObtain.setClassName("android.view.View");
        Rect rect = f10361n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        Chip chip = this.i;
        accessibilityNodeInfoObtain.setParent(chip);
        o(i, lVar);
        if (lVar.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.e;
        lVar.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        lVar.f8120b = i;
        accessibilityNodeInfoObtain.setSource(chip, i);
        if (this.f10368k == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            lVar.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            lVar.a(64);
        }
        boolean z4 = this.f10369l == i;
        if (z4) {
            lVar.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            lVar.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z4);
        int[] iArr = this.f10366g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f10364d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            lVar.f(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f10365f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                accessibilityNodeInfoObtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (parent instanceof View) {
                        View view = (View) parent;
                        if (view.getAlpha() > 0.0f && view.getVisibility() == 0) {
                            parent = view.getParent();
                        }
                    }
                    if (parent != null) {
                        accessibilityNodeInfoObtain.setVisibleToUser(true);
                    }
                }
            }
        }
        return lVar;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Code duplicated, block: B:115:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00df  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:51:0x0103  */
    /* JADX WARN: Code duplicated, block: B:54:0x010c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0119  */
    /* JADX WARN: Code duplicated, block: B:66:0x012e  */
    /* JADX WARN: Code duplicated, block: B:68:0x014c  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a4  */
    public final boolean m(int i, Rect rect) {
        int i10;
        int i11;
        Object obj;
        l lVar;
        int i12;
        int i13;
        int i14;
        Rect rect2;
        int i15;
        Rect rect3;
        int i16;
        l lVar2;
        int i17;
        int iV;
        int iW;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        r.l lVar3 = new r.l();
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            lVar3.c(((Integer) arrayList.get(i18)).intValue(), k(((Integer) arrayList.get(i18)).intValue()));
        }
        int i19 = this.f10369l;
        l lVar4 = i19 == Integer.MIN_VALUE ? null : (l) lVar3.b(i19);
        i iVar = f10362o;
        j jVar = f10363p;
        Chip chip = this.i;
        if (i == 1 || i == 2) {
            i10 = -1;
            i11 = 0;
            WeakHashMap weakHashMap = v0.f7946a;
            boolean z4 = e0.d(chip) == 1;
            jVar.getClass();
            int i20 = lVar3.f8103c;
            ArrayList arrayList2 = new ArrayList(i20);
            for (int i21 = 0; i21 < i20; i21++) {
                arrayList2.add((l) lVar3.f8102b[i21]);
            }
            Collections.sort(arrayList2, new c(z4, iVar));
            if (i == 1) {
                int size = arrayList2.size();
                if (lVar4 != null) {
                    size = arrayList2.indexOf(lVar4);
                }
                int i22 = size - 1;
                if (i22 >= 0) {
                    obj = arrayList2.get(i22);
                } else {
                    obj = null;
                }
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (lVar4 == null ? -1 : arrayList2.lastIndexOf(lVar4)) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList2.get(iLastIndexOf);
                } else {
                    obj = null;
                }
            }
            lVar = (l) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect4 = new Rect();
            int i23 = this.f10369l;
            if (i23 != Integer.MIN_VALUE) {
                n(i23).f(rect4);
            } else {
                if (rect != null) {
                    rect4.set(rect);
                } else {
                    int width = chip.getWidth();
                    int height = chip.getHeight();
                    if (i == 17) {
                        i14 = -1;
                        rect4.set(width, 0, width, height);
                    } else if (i == 33) {
                        i14 = -1;
                        rect4.set(0, height, width, height);
                    } else if (i == 66) {
                        i14 = -1;
                        rect4.set(-1, 0, -1, height);
                    } else {
                        if (i != 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        i14 = -1;
                        rect4.set(0, -1, width, -1);
                    }
                }
                rect2 = new Rect(rect4);
                if (i != 17) {
                    i11 = 0;
                    rect2.offset(rect4.width() + 1, 0);
                } else if (i != 33) {
                    i11 = 0;
                    rect2.offset(0, rect4.height() + 1);
                } else if (i != 66) {
                    i11 = 0;
                    rect2.offset(-(rect4.width() + 1), 0);
                } else {
                    if (i == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i11 = 0;
                    rect2.offset(0, -(rect4.height() + 1));
                }
                jVar.getClass();
                i15 = lVar3.f8103c;
                rect3 = new Rect();
                lVar = null;
                for (i16 = i11; i16 < i15; i16++) {
                    lVar2 = (l) lVar3.f8102b[i16];
                    if (lVar2 == lVar4) {
                        iVar.getClass();
                        lVar2.f(rect3);
                        if (qd.b.s(i, rect4, rect3)) {
                            if (qd.b.s(i, rect4, rect2) || qd.b.b(i, rect4, rect3, rect2)) {
                                rect2.set(rect3);
                                lVar = lVar2;
                            } else if (qd.b.b(i, rect4, rect2, rect3)) {
                                int iV2 = qd.b.v(i, rect4, rect3);
                                int iW2 = qd.b.w(i, rect4, rect3);
                                i17 = (iW2 * iW2) + (iV2 * 13 * iV2);
                                iV = qd.b.v(i, rect4, rect2);
                                iW = qd.b.w(i, rect4, rect2);
                                if (i17 < (iW * iW) + (iV * 13 * iV)) {
                                    rect2.set(rect3);
                                    lVar = lVar2;
                                }
                            }
                        }
                    }
                }
                i10 = i14;
            }
            i14 = -1;
            rect2 = new Rect(rect4);
            if (i != 17) {
                i11 = 0;
                rect2.offset(rect4.width() + 1, 0);
            } else if (i != 33) {
                i11 = 0;
                rect2.offset(0, rect4.height() + 1);
            } else if (i != 66) {
                i11 = 0;
                rect2.offset(-(rect4.width() + 1), 0);
            } else {
                if (i == 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                i11 = 0;
                rect2.offset(0, -(rect4.height() + 1));
            }
            jVar.getClass();
            i15 = lVar3.f8103c;
            rect3 = new Rect();
            lVar = null;
            while (i16 < i15) {
                lVar2 = (l) lVar3.f8102b[i16];
                if (lVar2 == lVar4) {
                    iVar.getClass();
                    lVar2.f(rect3);
                    if (qd.b.s(i, rect4, rect3)) {
                        if (qd.b.s(i, rect4, rect2)) {
                            rect2.set(rect3);
                            lVar = lVar2;
                        } else if (qd.b.b(i, rect4, rect2, rect3)) {
                            int iV3 = qd.b.v(i, rect4, rect3);
                            int iW3 = qd.b.w(i, rect4, rect3);
                            i17 = (iW3 * iW3) + (iV3 * 13 * iV3);
                            iV = qd.b.v(i, rect4, rect2);
                            iW = qd.b.w(i, rect4, rect2);
                            if (i17 < (iW * iW) + (iV * 13 * iV)) {
                                rect2.set(rect3);
                                lVar = lVar2;
                            }
                        }
                    }
                }
            }
            i10 = i14;
        }
        l lVar5 = lVar;
        if (lVar5 == null) {
            i13 = Integer.MIN_VALUE;
        } else {
            int i24 = lVar3.f8103c;
            int i25 = i11;
            while (true) {
                if (i25 >= i24) {
                    i12 = i10;
                    break;
                }
                if (lVar3.f8102b[i25] == lVar5) {
                    i12 = i25;
                    break;
                }
                i25++;
            }
            i13 = lVar3.f8101a[i12];
        }
        return p(i13);
    }

    public final l n(int i) {
        if (i != -1) {
            return k(i);
        }
        Chip chip = this.i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        l lVar = new l(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = v0.f7946a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            lVar.f8119a.addChild(chip, ((Integer) arrayList.get(i10)).intValue());
        }
        return lVar;
    }

    public abstract void o(int i, l lVar);

    public final boolean p(int i) {
        int i10;
        Chip chip = this.i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i10 = this.f10369l) == i) {
            return false;
        }
        if (i10 != Integer.MIN_VALUE) {
            j(i10);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f10369l = i;
        n8.c cVar = (n8.c) this;
        if (i == 1) {
            Chip chip2 = cVar.f7319q;
            chip2.f2398y = true;
            chip2.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    public final void q(int i, int i10) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i10);
            l lVarN = n(i);
            accessibilityEventObtain.getText().add(lVarN.g());
            AccessibilityNodeInfo accessibilityNodeInfo = lVarN.f8119a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            p.a(accessibilityEventObtain, view, i);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i10);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
