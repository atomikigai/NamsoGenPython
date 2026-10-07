package s2;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import da.v;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import x1.i0;
import x1.k0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.viewpager2.adapter.a f8349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewPager2 f8350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f8351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayoutManager f8352d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f8354g;
    public int h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8355j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8356k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8357l;

    public d(ViewPager2 viewPager2) {
        this.f8350b = viewPager2;
        l lVar = viewPager2.f1216u;
        this.f8351c = lVar;
        this.f8352d = (LinearLayoutManager) lVar.getLayoutManager();
        this.f8354g = new c();
        d();
    }

    @Override // x1.k0
    public final void a(RecyclerView recyclerView, int i) {
        androidx.viewpager2.adapter.a aVar;
        androidx.viewpager2.adapter.a aVar2;
        int i10 = this.e;
        if (!(i10 == 1 && this.f8353f == 1) && i == 1) {
            this.e = 1;
            int i11 = this.i;
            if (i11 != -1) {
                this.h = i11;
                this.i = -1;
            } else if (this.h == -1) {
                this.h = this.f8352d.M0();
            }
            c(1);
            return;
        }
        if ((i10 == 1 || i10 == 4) && i == 2) {
            if (this.f8356k) {
                c(2);
                this.f8355j = true;
                return;
            }
            return;
        }
        c cVar = this.f8354g;
        if ((i10 == 1 || i10 == 4) && i == 0) {
            e();
            if (!this.f8356k) {
                int i12 = cVar.f8346a;
                if (i12 != -1 && (aVar2 = this.f8349a) != null) {
                    aVar2.b(i12, 0.0f, 0);
                }
            } else if (cVar.f8348c == 0) {
                int i13 = this.h;
                int i14 = cVar.f8346a;
                if (i13 != i14 && (aVar = this.f8349a) != null) {
                    aVar.c(i14);
                }
            }
            c(0);
            d();
        }
        if (this.e == 2 && i == 0 && this.f8357l) {
            e();
            if (cVar.f8348c == 0) {
                int i15 = this.i;
                int i16 = cVar.f8346a;
                if (i15 != i16) {
                    if (i16 == -1) {
                        i16 = 0;
                    }
                    androidx.viewpager2.adapter.a aVar3 = this.f8349a;
                    if (aVar3 != null) {
                        aVar3.c(i16);
                    }
                }
                c(0);
                d();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    @Override // x1.k0
    public final void b(RecyclerView recyclerView, int i, int i10) {
        int i11;
        androidx.viewpager2.adapter.a aVar;
        this.f8356k = true;
        e();
        boolean z4 = this.f8355j;
        c cVar = this.f8354g;
        if (z4) {
            this.f8355j = false;
            if (i10 <= 0) {
                if (i10 == 0) {
                    if ((i < 0) == (this.f8350b.f1213r.A() == 1)) {
                        if (cVar.f8348c != 0) {
                            i11 = cVar.f8346a + 1;
                        }
                    }
                }
                i11 = cVar.f8346a;
            } else if (cVar.f8348c != 0) {
                i11 = cVar.f8346a + 1;
            } else {
                i11 = cVar.f8346a;
            }
            this.i = i11;
            if (this.h != i11 && (aVar = this.f8349a) != null) {
                aVar.c(i11);
            }
        } else if (this.e == 0) {
            int i12 = cVar.f8346a;
            if (i12 == -1) {
                i12 = 0;
            }
            androidx.viewpager2.adapter.a aVar2 = this.f8349a;
            if (aVar2 != null) {
                aVar2.c(i12);
            }
        }
        int i13 = cVar.f8346a;
        if (i13 == -1) {
            i13 = 0;
        }
        float f10 = cVar.f8347b;
        int i14 = cVar.f8348c;
        androidx.viewpager2.adapter.a aVar3 = this.f8349a;
        if (aVar3 != null) {
            aVar3.b(i13, f10, i14);
        }
        int i15 = cVar.f8346a;
        int i16 = this.i;
        if ((i15 == i16 || i16 == -1) && cVar.f8348c == 0 && this.f8353f != 1) {
            c(0);
            d();
        }
    }

    public final void c(int i) {
        if ((this.e == 3 && this.f8353f == 0) || this.f8353f == i) {
            return;
        }
        this.f8353f = i;
        androidx.viewpager2.adapter.a aVar = this.f8349a;
        if (aVar != null) {
            aVar.a(i);
        }
    }

    public final void d() {
        this.e = 0;
        this.f8353f = 0;
        c cVar = this.f8354g;
        cVar.f8346a = -1;
        cVar.f8347b = 0.0f;
        cVar.f8348c = 0;
        this.h = -1;
        this.i = -1;
        this.f8355j = false;
        this.f8356k = false;
        this.f8357l = false;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0133  */
    /* JADX WARN: Code duplicated, block: B:65:0x013f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0149 A[LOOP:2: B:64:0x013d->B:67:0x0149, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x014c A[SYNTHETIC] */
    public final void e() {
        int top;
        int iV;
        int top2;
        int i;
        int bottom;
        int i10;
        LinearLayoutManager linearLayoutManager = this.f8352d;
        int iM0 = linearLayoutManager.M0();
        c cVar = this.f8354g;
        cVar.f8346a = iM0;
        if (iM0 == -1) {
            cVar.f8346a = -1;
            cVar.f8347b = 0.0f;
            cVar.f8348c = 0;
            return;
        }
        View viewQ = linearLayoutManager.q(iM0);
        if (viewQ == null) {
            cVar.f8346a = -1;
            cVar.f8347b = 0.0f;
            cVar.f8348c = 0;
            return;
        }
        int i11 = ((i0) viewQ.getLayoutParams()).f10106b.left;
        int i12 = ((i0) viewQ.getLayoutParams()).f10106b.right;
        int i13 = ((i0) viewQ.getLayoutParams()).f10106b.top;
        int i14 = ((i0) viewQ.getLayoutParams()).f10106b.bottom;
        ViewGroup.LayoutParams layoutParams = viewQ.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i11 += marginLayoutParams.leftMargin;
            i12 += marginLayoutParams.rightMargin;
            i13 += marginLayoutParams.topMargin;
            i14 += marginLayoutParams.bottomMargin;
        }
        int height = viewQ.getHeight() + i13 + i14;
        int width = viewQ.getWidth() + i11 + i12;
        int i15 = linearLayoutManager.f1120p;
        l lVar = this.f8351c;
        if (i15 == 0) {
            top = (viewQ.getLeft() - i11) - lVar.getPaddingLeft();
            if (this.f8350b.f1213r.A() == 1) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewQ.getTop() - i13) - lVar.getPaddingTop();
        }
        int i16 = -top;
        cVar.f8348c = i16;
        if (i16 >= 0) {
            cVar.f8347b = height != 0 ? i16 / height : 0.0f;
            return;
        }
        int iV2 = linearLayoutManager.v();
        if (iV2 != 0) {
            boolean z4 = linearLayoutManager.f1120p == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iV2, 2);
            for (int i17 = 0; i17 < iV2; i17++) {
                View viewU = linearLayoutManager.u(i17);
                if (viewU == null) {
                    throw new IllegalStateException("null view contained in the view hierarchy");
                }
                ViewGroup.LayoutParams layoutParams2 = viewU.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : a.f8345a;
                int[] iArr2 = iArr[i17];
                if (z4) {
                    top2 = viewU.getLeft();
                    i = marginLayoutParams2.leftMargin;
                } else {
                    top2 = viewU.getTop();
                    i = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top2 - i;
                int[] iArr3 = iArr[i17];
                if (z4) {
                    bottom = viewU.getRight();
                    i10 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = viewU.getBottom();
                    i10 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i10;
            }
            Arrays.sort(iArr, new b0.h(11));
            int i18 = 1;
            while (true) {
                if (i18 >= iV2) {
                    int[] iArr4 = iArr[0];
                    int i19 = iArr4[1];
                    int i20 = iArr4[0];
                    int i21 = i19 - i20;
                    if (i20 <= 0 && iArr[iV2 - 1][1] >= i21) {
                        if (linearLayoutManager.v() <= 1) {
                        }
                    }
                } else if (iArr[i18 - 1][1] == iArr[i18][0]) {
                    i18++;
                }
                iV = linearLayoutManager.v();
                for (int i22 = 0; i22 < iV; i22++) {
                    if (!a.a(linearLayoutManager.u(i22))) {
                        throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                    }
                }
            }
        } else if (linearLayoutManager.v() <= 1) {
            iV = linearLayoutManager.v();
            while (i22 < iV) {
                if (!a.a(linearLayoutManager.u(i22))) {
                    throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                }
            }
        }
        Locale locale = Locale.US;
        throw new IllegalStateException(v.f(cVar.f8348c, "Page can only be offset by a positive amount, not by "));
    }
}
