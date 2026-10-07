package x1;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f10026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f10027c;

    public /* synthetic */ c(i iVar, ArrayList arrayList, int i) {
        this.f10025a = i;
        this.f10027c = iVar;
        this.f10026b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10025a) {
            case 0:
                ArrayList arrayList = this.f10026b;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    i iVar = this.f10027c;
                    if (i >= size) {
                        arrayList.clear();
                        iVar.f10099m.remove(arrayList);
                    } else {
                        Object obj = arrayList.get(i);
                        i++;
                        h hVar = (h) obj;
                        w0 w0Var = hVar.f10078a;
                        int i10 = hVar.f10079b;
                        int i11 = hVar.f10080c;
                        int i12 = hVar.f10081d;
                        int i13 = hVar.e;
                        iVar.getClass();
                        View view = w0Var.f10230a;
                        int i14 = i12 - i10;
                        int i15 = i13 - i11;
                        if (i14 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i15 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        iVar.f10102p.add(w0Var);
                        viewPropertyAnimatorAnimate.setDuration(iVar.e).setListener(new e(iVar, w0Var, i14, view, i15, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = this.f10026b;
                int size2 = arrayList2.size();
                int i16 = 0;
                while (true) {
                    i iVar2 = this.f10027c;
                    if (i16 >= size2) {
                        arrayList2.clear();
                        iVar2.f10100n.remove(arrayList2);
                        break;
                    } else {
                        Object obj2 = arrayList2.get(i16);
                        i16++;
                        g gVar = (g) obj2;
                        ArrayList arrayList3 = iVar2.f10104r;
                        long j4 = iVar2.f10046f;
                        w0 w0Var2 = gVar.f10065a;
                        View view2 = w0Var2 == null ? null : w0Var2.f10230a;
                        w0 w0Var3 = gVar.f10066b;
                        View view3 = w0Var3 != null ? w0Var3.f10230a : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j4);
                            arrayList3.add(gVar.f10065a);
                            duration.translationX(gVar.e - gVar.f10067c);
                            duration.translationY(gVar.f10069f - gVar.f10068d);
                            duration.alpha(0.0f).setListener(new f(iVar2, gVar, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(gVar.f10066b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j4).alpha(1.0f).setListener(new f(iVar2, gVar, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
                break;
            default:
                ArrayList arrayList4 = this.f10026b;
                int size3 = arrayList4.size();
                int i17 = 0;
                while (true) {
                    i iVar3 = this.f10027c;
                    if (i17 >= size3) {
                        arrayList4.clear();
                        iVar3.f10098l.remove(arrayList4);
                    } else {
                        Object obj3 = arrayList4.get(i17);
                        i17++;
                        w0 w0Var4 = (w0) obj3;
                        iVar3.getClass();
                        View view4 = w0Var4.f10230a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        iVar3.f10101o.add(w0Var4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(iVar3.f10044c).setListener(new d(iVar3, w0Var4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
