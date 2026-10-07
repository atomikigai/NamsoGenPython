package d9;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import u8.n;
import u8.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f3041b;

    public /* synthetic */ d(h hVar, int i) {
        this.f3040a = i;
        this.f3041b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect rect;
        int i = this.f3040a;
        h hVar = this.f3041b;
        switch (i) {
            case 0:
                g gVar = hVar.i;
                if (gVar != null) {
                    Context context = hVar.h;
                    int i10 = n.f9043d;
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (Build.VERSION.SDK_INT >= 30) {
                        rect = q.a(windowManager);
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    int iHeight = rect.height();
                    int[] iArr = new int[2];
                    gVar.getLocationInWindow(iArr);
                    int height = (iHeight - (gVar.getHeight() + iArr[1])) + ((int) gVar.getTranslationY());
                    int i11 = hVar.f3072p;
                    if (height < i11) {
                        ViewGroup.LayoutParams layoutParams = gVar.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            Log.w(h.f3059z, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                        } else {
                            int i12 = hVar.f3072p;
                            hVar.f3073q = i12;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (i12 - height) + marginLayoutParams.bottomMargin;
                            gVar.requestLayout();
                        }
                    } else {
                        hVar.f3073q = i11;
                    }
                }
                break;
            case 1:
                hVar.c();
                break;
            default:
                g gVar2 = hVar.i;
                if (gVar2 != null) {
                    if (gVar2.getParent() != null) {
                        gVar2.setVisibility(0);
                    }
                    if (gVar2.getAnimationMode() != 1) {
                        int height2 = gVar2.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = gVar2.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height2 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        gVar2.setTranslationY(height2);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(height2, 0);
                        valueAnimator.setInterpolator(hVar.e);
                        valueAnimator.setDuration(hVar.f3062c);
                        valueAnimator.addListener(new a(hVar, 1));
                        valueAnimator.addUpdateListener(new b(hVar, height2));
                        valueAnimator.start();
                    } else {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setInterpolator(hVar.f3063d);
                        valueAnimatorOfFloat.addUpdateListener(new b(hVar, 0, (byte) 0));
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        valueAnimatorOfFloat2.setInterpolator(hVar.f3064f);
                        valueAnimatorOfFloat2.addUpdateListener(new b(hVar, 1, (byte) 0));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                        animatorSet.setDuration(hVar.f3060a);
                        animatorSet.addListener(new a(hVar, 3));
                        animatorSet.start();
                    }
                    break;
                }
                break;
        }
    }
}
