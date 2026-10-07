package q0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gb.n f7917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f7918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f7919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f7920d;

    public m1(gb.n nVar) {
        super(0);
        this.f7920d = new HashMap();
        this.f7917a = nVar;
    }

    public final p1 a(WindowInsetsAnimation windowInsetsAnimation) {
        p1 p1Var = (p1) this.f7920d.get(windowInsetsAnimation);
        if (p1Var == null) {
            p1Var = new p1(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                p1Var.f7929a = new n1(windowInsetsAnimation);
            }
            this.f7920d.put(windowInsetsAnimation, p1Var);
        }
        return p1Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        ((View) this.f7917a.f4484d).setTranslationY(0.0f);
        this.f7920d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        gb.n nVar = this.f7917a;
        View view = (View) nVar.f4484d;
        int[] iArr = (int[]) nVar.e;
        view.getLocationOnScreen(iArr);
        nVar.f4481a = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f7919c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f7919c = arrayList2;
            this.f7918b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            p1 p1VarA = a(windowInsetsAnimation);
            p1VarA.f7929a.d(windowInsetsAnimation.getFraction());
            this.f7919c.add(p1VarA);
        }
        d2 d2VarG = d2.g(null, windowInsets);
        this.f7917a.e(d2VarG, this.f7918b);
        return d2VarG.f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a(windowInsetsAnimation);
        h0.c cVarF = n1.f(bounds);
        h0.c cVarE = n1.e(bounds);
        gb.n nVar = this.f7917a;
        View view = (View) nVar.f4484d;
        int[] iArr = (int[]) nVar.e;
        view.getLocationOnScreen(iArr);
        int i = nVar.f4481a - iArr[1];
        nVar.f4482b = i;
        view.setTranslationY(i);
        l1.c();
        return l1.a(cVarF.d(), cVarE.d());
    }
}
