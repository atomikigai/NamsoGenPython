package q0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewParent f7925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f7926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f7927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7928d;
    public int[] e;

    public p(ViewGroup viewGroup) {
        this.f7927c = viewGroup;
    }

    public final boolean a(float f10, float f11, boolean z4) {
        ViewParent viewParentE;
        if (this.f7928d && (viewParentE = e(0)) != null) {
            try {
                return b1.a(viewParentE, this.f7927c, f10, f11, z4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedFling", e);
            }
        }
        return false;
    }

    public final boolean b(float f10, float f11) {
        ViewParent viewParentE;
        if (this.f7928d && (viewParentE = e(0)) != null) {
            try {
                return b1.b(viewParentE, this.f7927c, f10, f11);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreFling", e);
            }
        }
        return false;
    }

    public final boolean c(int i, int i10, int i11, int[] iArr, int[] iArr2) {
        ViewParent viewParentE;
        int i12;
        int i13;
        int[] iArr3;
        if (!this.f7928d || (viewParentE = e(i11)) == null) {
            return false;
        }
        if (i == 0 && i10 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f7927c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i12 = iArr2[0];
            i13 = iArr2[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            iArr3 = this.e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentE instanceof q) {
            ((q) viewParentE).f(viewGroup, i, i10, iArr3, i11);
        } else if (i11 == 0) {
            try {
                b1.c(viewParentE, viewGroup, i, i10, iArr3);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i12;
            iArr2[1] = iArr2[1] - i13;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        ViewParent viewParentE;
        int i14;
        int i15;
        int[] iArr3;
        if (this.f7928d && (viewParentE = e(i13)) != null) {
            if (i != 0 || i10 != 0 || i11 != 0 || i12 != 0) {
                ViewGroup viewGroup = this.f7927c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i14 = iArr[0];
                    i15 = iArr[1];
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                if (iArr2 == null) {
                    if (this.e == null) {
                        this.e = new int[2];
                    }
                    int[] iArr4 = this.e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentE instanceof r) {
                    ((r) viewParentE).a(viewGroup, i, i10, i11, i12, i13, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i11;
                    iArr3[1] = iArr3[1] + i12;
                    if (viewParentE instanceof q) {
                        ((q) viewParentE).b(viewGroup, i, i10, i11, i12, i13);
                    } else if (i13 == 0) {
                        try {
                            b1.d(viewParentE, viewGroup, i, i10, i11, i12);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedScroll", e);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i14;
                    iArr[1] = iArr[1] - i15;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i) {
        if (i == 0) {
            return this.f7925a;
        }
        if (i != 1) {
            return null;
        }
        return this.f7926b;
    }

    public final boolean f(int i) {
        return e(i) != null;
    }

    public final boolean g(int i, int i10) {
        boolean zF;
        if (!f(i10)) {
            if (this.f7928d) {
                ViewGroup viewGroup = this.f7927c;
                View view = viewGroup;
                for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z4 = parent instanceof q;
                    if (z4) {
                        zF = ((q) parent).c(view, viewGroup, i, i10);
                    } else if (i10 == 0) {
                        try {
                            zF = b1.f(parent, view, viewGroup, i);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                            zF = false;
                        }
                    } else {
                        zF = false;
                    }
                    if (zF) {
                        if (i10 == 0) {
                            this.f7925a = parent;
                        } else if (i10 == 1) {
                            this.f7926b = parent;
                        }
                        if (z4) {
                            ((q) parent).d(view, viewGroup, i, i10);
                        } else if (i10 == 0) {
                            try {
                                b1.e(parent, view, viewGroup, i);
                            } catch (AbstractMethodError e4) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e4);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i) {
        ViewParent viewParentE = e(i);
        if (viewParentE != null) {
            boolean z4 = viewParentE instanceof q;
            ViewGroup viewGroup = this.f7927c;
            if (z4) {
                ((q) viewParentE).e(viewGroup, i);
            } else if (i == 0) {
                try {
                    b1.g(viewParentE, viewGroup);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                this.f7925a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f7926b = null;
            }
        }
    }
}
