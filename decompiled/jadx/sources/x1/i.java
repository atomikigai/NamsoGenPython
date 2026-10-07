package x1;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends e0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f10094s;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10095g;
    public ArrayList h;
    public ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f10096j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f10097k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f10098l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f10099m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f10100n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f10101o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f10102p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f10103q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f10104r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((w0) arrayList.get(size)).f10230a.animate().cancel();
        }
    }

    @Override // x1.e0
    public final boolean a(w0 w0Var, w0 w0Var2, q0.s sVar, q0.s sVar2) {
        int i;
        int i10;
        int i11 = sVar.f7938a;
        int i12 = sVar.f7939b;
        if (w0Var2.o()) {
            int i13 = sVar.f7938a;
            i10 = sVar.f7939b;
            i = i13;
        } else {
            i = sVar2.f7938a;
            i10 = sVar2.f7939b;
        }
        if (w0Var == w0Var2) {
            return g(w0Var, i11, i12, i, i10);
        }
        View view = w0Var.f10230a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(w0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = w0Var2.f10230a;
        l(w0Var2);
        view2.setTranslationX(-((int) ((i - i11) - translationX)));
        view2.setTranslationY(-((int) ((i10 - i12) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f10097k;
        g gVar = new g();
        gVar.f10065a = w0Var;
        gVar.f10066b = w0Var2;
        gVar.f10067c = i11;
        gVar.f10068d = i12;
        gVar.e = i;
        gVar.f10069f = i10;
        arrayList.add(gVar);
        return true;
    }

    @Override // x1.e0
    public final void d(w0 w0Var) {
        ArrayList arrayList = this.f10098l;
        ArrayList arrayList2 = this.f10099m;
        ArrayList arrayList3 = this.f10100n;
        View view = w0Var.f10230a;
        view.animate().cancel();
        ArrayList arrayList4 = this.f10096j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((h) arrayList4.get(size)).f10078a == w0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(w0Var);
                arrayList4.remove(size);
            }
        }
        j(this.f10097k, w0Var);
        if (this.h.remove(w0Var)) {
            view.setAlpha(1.0f);
            c(w0Var);
        }
        if (this.i.remove(w0Var)) {
            view.setAlpha(1.0f);
            c(w0Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, w0Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            for (int size4 = arrayList6.size() - 1; size4 >= 0; size4--) {
                if (((h) arrayList6.get(size4)).f10078a == w0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(w0Var);
                    arrayList6.remove(size4);
                    if (!arrayList6.isEmpty()) {
                        break;
                    }
                    arrayList2.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(w0Var)) {
                view.setAlpha(1.0f);
                c(w0Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f10103q.remove(w0Var);
        this.f10101o.remove(w0Var);
        this.f10104r.remove(w0Var);
        this.f10102p.remove(w0Var);
        i();
    }

    @Override // x1.e0
    public final void e() {
        ArrayList arrayList = this.f10100n;
        ArrayList arrayList2 = this.f10098l;
        ArrayList arrayList3 = this.f10099m;
        ArrayList arrayList4 = this.f10097k;
        ArrayList arrayList5 = this.i;
        ArrayList arrayList6 = this.h;
        ArrayList arrayList7 = this.f10096j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            h hVar = (h) arrayList7.get(size);
            View view = hVar.f10078a.f10230a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(hVar.f10078a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((w0) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            w0 w0Var = (w0) arrayList5.get(size3);
            w0Var.f10230a.setAlpha(1.0f);
            c(w0Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            g gVar = (g) arrayList4.get(size4);
            w0 w0Var2 = gVar.f10065a;
            if (w0Var2 != null) {
                k(gVar, w0Var2);
            }
            w0 w0Var3 = gVar.f10066b;
            if (w0Var3 != null) {
                k(gVar, w0Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    h hVar2 = (h) arrayList8.get(size6);
                    View view2 = hVar2.f10078a.f10230a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(hVar2.f10078a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    w0 w0Var4 = (w0) arrayList9.get(size8);
                    w0Var4.f10230a.setAlpha(1.0f);
                    c(w0Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    g gVar2 = (g) arrayList10.get(size10);
                    w0 w0Var5 = gVar2.f10065a;
                    if (w0Var5 != null) {
                        k(gVar2, w0Var5);
                    }
                    w0 w0Var6 = gVar2.f10066b;
                    if (w0Var6 != null) {
                        k(gVar2, w0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            h(this.f10103q);
            h(this.f10102p);
            h(this.f10101o);
            h(this.f10104r);
            ArrayList arrayList11 = this.f10043b;
            if (arrayList11.size() > 0) {
                throw da.v.e(arrayList11, 0);
            }
            arrayList11.clear();
        }
    }

    @Override // x1.e0
    public final boolean f() {
        return (this.i.isEmpty() && this.f10097k.isEmpty() && this.f10096j.isEmpty() && this.h.isEmpty() && this.f10102p.isEmpty() && this.f10103q.isEmpty() && this.f10101o.isEmpty() && this.f10104r.isEmpty() && this.f10099m.isEmpty() && this.f10098l.isEmpty() && this.f10100n.isEmpty()) ? false : true;
    }

    public final boolean g(w0 w0Var, int i, int i10, int i11, int i12) {
        View view = w0Var.f10230a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i10 + ((int) w0Var.f10230a.getTranslationY());
        l(w0Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            c(w0Var);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        ArrayList arrayList = this.f10096j;
        h hVar = new h();
        hVar.f10078a = w0Var;
        hVar.f10079b = translationX;
        hVar.f10080c = translationY;
        hVar.f10081d = i11;
        hVar.e = i12;
        arrayList.add(hVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f10043b;
        if (arrayList.size() > 0) {
            throw da.v.e(arrayList, 0);
        }
        arrayList.clear();
    }

    public final void j(ArrayList arrayList, w0 w0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g gVar = (g) arrayList.get(size);
            if (k(gVar, w0Var) && gVar.f10065a == null && gVar.f10066b == null) {
                arrayList.remove(gVar);
            }
        }
    }

    public final boolean k(g gVar, w0 w0Var) {
        if (gVar.f10066b == w0Var) {
            gVar.f10066b = null;
        } else {
            if (gVar.f10065a != w0Var) {
                return false;
            }
            gVar.f10065a = null;
        }
        View view = w0Var.f10230a;
        View view2 = w0Var.f10230a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(w0Var);
        return true;
    }

    public final void l(w0 w0Var) {
        if (f10094s == null) {
            f10094s = new ValueAnimator().getInterpolator();
        }
        w0Var.f10230a.animate().setInterpolator(f10094s);
        d(w0Var);
    }
}
