package d9;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;
import java.util.WeakHashMap;
import q0.g0;
import q0.v0;
import w3.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3039a;

    public /* synthetic */ c(int i) {
        this.f3039a = i;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        switch (this.f3039a) {
            case 0:
                int i = message.what;
                if (i == 0) {
                    h hVar = (h) message.obj;
                    g gVar = hVar.i;
                    if (gVar.getParent() == null) {
                        ViewGroup.LayoutParams layoutParams = gVar.getLayoutParams();
                        if (layoutParams instanceof b0.e) {
                            b0.e eVar = (b0.e) layoutParams;
                            BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                            a4.b bVar = baseTransientBottomBar$Behavior.i;
                            bVar.getClass();
                            bVar.f113b = hVar.f3076t;
                            baseTransientBottomBar$Behavior.f2335b = new a5.b(hVar, 11);
                            eVar.b(baseTransientBottomBar$Behavior);
                            eVar.f1324g = 80;
                        }
                        ViewGroup viewGroup = hVar.f3065g;
                        gVar.f3053v = true;
                        viewGroup.addView(gVar);
                        gVar.f3053v = false;
                        hVar.f();
                        gVar.setVisibility(4);
                    }
                    WeakHashMap weakHashMap = v0.f7946a;
                    if (g0.c(gVar)) {
                        hVar.e();
                        return true;
                    }
                    hVar.f3074r = true;
                    return true;
                }
                if (i != 1) {
                    return false;
                }
                h hVar2 = (h) message.obj;
                int i10 = message.arg1;
                g gVar2 = hVar2.i;
                AccessibilityManager accessibilityManager = hVar2.f3075s;
                if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || gVar2.getVisibility() != 0) {
                    hVar2.c();
                    return true;
                }
                if (gVar2.getAnimationMode() == 1) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat.setInterpolator(hVar2.f3063d);
                    valueAnimatorOfFloat.addUpdateListener(new b(hVar2, 0, (byte) 0));
                    valueAnimatorOfFloat.setDuration(hVar2.f3061b);
                    valueAnimatorOfFloat.addListener(new a(hVar2, i10, 0));
                    valueAnimatorOfFloat.start();
                    return true;
                }
                ValueAnimator valueAnimator = new ValueAnimator();
                g gVar3 = hVar2.i;
                int height = gVar3.getHeight();
                ViewGroup.LayoutParams layoutParams2 = gVar3.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                }
                valueAnimator.setIntValues(0, height);
                valueAnimator.setInterpolator(hVar2.e);
                valueAnimator.setDuration(hVar2.f3062c);
                valueAnimator.addListener(new a(hVar2, i10, 2));
                valueAnimator.addUpdateListener(new b(hVar2, 3, (byte) 0));
                valueAnimator.start();
                return true;
            default:
                if (message.what != 1) {
                    return false;
                }
                ((x) message.obj).b();
                return true;
        }
    }
}
