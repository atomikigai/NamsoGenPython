package m2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;
import q0.g0;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends m {
    public static final String[] H = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final b I;
    public static final b J;
    public static final b K;
    public static final b L;
    public static final b M;

    static {
        new e8.d(PointF.class, "boundsOrigin").f3497b = new Rect();
        I = new b(PointF.class, "topLeft", 0);
        J = new b(PointF.class, "bottomRight", 1);
        K = new b(PointF.class, "bottomRight", 2);
        L = new b(PointF.class, "topLeft", 3);
        M = new b(PointF.class, "position", 4);
    }

    public static void F(s sVar) {
        View view = sVar.f7024b;
        HashMap map = sVar.f7023a;
        WeakHashMap weakHashMap = v0.f7946a;
        if (!g0.c(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // m2.m
    public final void c(s sVar) {
        F(sVar);
    }

    @Override // m2.m
    public final void f(s sVar) {
        F(sVar);
    }

    @Override // m2.m
    public final Animator j(ViewGroup viewGroup, s sVar, s sVar2) {
        int i;
        f fVar;
        Animator animatorOfObject;
        if (sVar != null) {
            HashMap map = sVar.f7023a;
            if (sVar2 != null) {
                HashMap map2 = sVar2.f7023a;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = sVar2.f7024b;
                    Rect rect = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                    int i10 = rect.left;
                    int i11 = rect2.left;
                    int i12 = rect.top;
                    int i13 = rect2.top;
                    int i14 = rect.right;
                    int i15 = rect2.right;
                    int i16 = rect.bottom;
                    int i17 = rect2.bottom;
                    int i18 = i14 - i10;
                    int i19 = i16 - i12;
                    int i20 = i15 - i11;
                    int i21 = i17 - i13;
                    Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i18 == 0 || i19 == 0) && (i20 == 0 || i21 == 0)) {
                        i = 0;
                    } else {
                        i = (i10 == i11 && i12 == i13) ? 0 : 1;
                        if (i14 != i15 || i16 != i17) {
                            i++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i++;
                    }
                    int i22 = i;
                    if (i22 > 0) {
                        t.a(view, i10, i12, i14, i16);
                        if (i22 != 2) {
                            fVar = this;
                            if (i10 == i11 && i12 == i13) {
                                fVar.D.getClass();
                                animatorOfObject = ObjectAnimator.ofObject(view, K, (TypeConverter) null, wa.d.c(i14, i16, i15, i17));
                            } else {
                                fVar.D.getClass();
                                animatorOfObject = ObjectAnimator.ofObject(view, L, (TypeConverter) null, wa.d.c(i10, i12, i11, i13));
                            }
                        } else if (i18 == i20 && i19 == i21) {
                            fVar = this;
                            fVar.D.getClass();
                            animatorOfObject = ObjectAnimator.ofObject(view, M, (TypeConverter) null, wa.d.c(i10, i12, i11, i13));
                        } else {
                            fVar = this;
                            e eVar = new e();
                            eVar.e = view;
                            fVar.D.getClass();
                            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(eVar, I, (TypeConverter) null, wa.d.c(i10, i12, i11, i13));
                            fVar.D.getClass();
                            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(eVar, J, (TypeConverter) null, wa.d.c(i14, i16, i15, i17));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorOfObject, objectAnimatorOfObject2);
                            animatorSet.addListener(new c(eVar));
                            animatorOfObject = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            gb.p.c(viewGroup4, true);
                            fVar.a(new d(viewGroup4));
                        }
                        return animatorOfObject;
                    }
                }
            }
        }
        return null;
    }

    @Override // m2.m
    public final String[] o() {
        return H;
    }
}
