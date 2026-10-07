package m2;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends m {
    public static final String[] I = {"android:visibility:visibility", "android:visibility:parent"};
    public final int H;

    public h(int i) {
        this();
        this.H = i;
    }

    public static void F(s sVar) {
        View view = sVar.f7024b;
        int visibility = view.getVisibility();
        HashMap map = sVar.f7023a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static z H(s sVar, s sVar2) {
        z zVar = new z();
        zVar.f7041a = false;
        zVar.f7042b = false;
        if (sVar != null) {
            HashMap map = sVar.f7023a;
            if (map.containsKey("android:visibility:visibility")) {
                zVar.f7043c = ((Integer) map.get("android:visibility:visibility")).intValue();
                zVar.e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                zVar.f7043c = -1;
                zVar.e = null;
            }
        } else {
            zVar.f7043c = -1;
            zVar.e = null;
        }
        if (sVar2 != null) {
            HashMap map2 = sVar2.f7023a;
            if (map2.containsKey("android:visibility:visibility")) {
                zVar.f7044d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                zVar.f7045f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                zVar.f7044d = -1;
                zVar.f7045f = null;
            }
        } else {
            zVar.f7044d = -1;
            zVar.f7045f = null;
        }
        if (sVar != null && sVar2 != null) {
            int i = zVar.f7043c;
            int i10 = zVar.f7044d;
            if (i != i10 || zVar.e != zVar.f7045f) {
                if (i != i10) {
                    if (i == 0) {
                        zVar.f7042b = false;
                        zVar.f7041a = true;
                        return zVar;
                    }
                    if (i10 == 0) {
                        zVar.f7042b = true;
                        zVar.f7041a = true;
                        return zVar;
                    }
                } else {
                    if (zVar.f7045f == null) {
                        zVar.f7042b = false;
                        zVar.f7041a = true;
                        return zVar;
                    }
                    if (zVar.e == null) {
                        zVar.f7042b = true;
                        zVar.f7041a = true;
                        return zVar;
                    }
                }
            }
        } else {
            if (sVar == null && zVar.f7044d == 0) {
                zVar.f7042b = true;
                zVar.f7041a = true;
                return zVar;
            }
            if (sVar2 == null && zVar.f7043c == 0) {
                zVar.f7042b = false;
                zVar.f7041a = true;
            }
        }
        return zVar;
    }

    public final ObjectAnimator G(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        t.f7026a.I(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, t.f7027b, f11);
        objectAnimatorOfFloat.addListener(new j9.c(view));
        a(new g(view, 0));
        return objectAnimatorOfFloat;
    }

    @Override // m2.m
    public final void c(s sVar) {
        F(sVar);
    }

    @Override // m2.m
    public final void f(s sVar) {
        F(sVar);
        sVar.f7023a.put("android:fade:transitionAlpha", Float.valueOf(t.f7026a.H(sVar.f7024b)));
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f1  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (H(m(r3, false), p(r3, false)).f7041a != false) goto L9;
     */
    @Override // m2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator j(android.view.ViewGroup r18, m2.s r19, m2.s r20) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.h.j(android.view.ViewGroup, m2.s, m2.s):android.animation.Animator");
    }

    @Override // m2.m
    public final String[] o() {
        return I;
    }

    @Override // m2.m
    public final boolean q(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f7023a.containsKey("android:visibility:visibility") != sVar.f7023a.containsKey("android:visibility:visibility")) {
            return false;
        }
        z zVarH = H(sVar, sVar2);
        if (zVarH.f7041a) {
            return zVarH.f7043c == 0 || zVarH.f7044d == 0;
        }
        return false;
    }

    public h() {
        this.H = 3;
    }
}
