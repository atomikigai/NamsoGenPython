package l;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d3 implements k.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k.l f6257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k.n f6258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f6259c;

    public d3(Toolbar toolbar) {
        this.f6259c = toolbar;
    }

    @Override // k.y
    public final boolean c(k.n nVar) {
        Toolbar toolbar = this.f6259c;
        toolbar.c();
        ViewParent parent = toolbar.f524s.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f524s);
            }
            toolbar.addView(toolbar.f524s);
        }
        View actionView = nVar.getActionView();
        toolbar.f525t = actionView;
        this.f6258b = nVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f525t);
            }
            e3 e3VarH = Toolbar.h();
            e3VarH.f6263a = (toolbar.f530y & 112) | 8388611;
            e3VarH.f6264b = 2;
            toolbar.f525t.setLayoutParams(e3VarH);
            toolbar.addView(toolbar.f525t);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((e3) childAt.getLayoutParams()).f6264b != 2 && childAt != toolbar.f513a) {
                toolbar.removeViewAt(childCount);
                toolbar.P.add(childAt);
            }
        }
        toolbar.requestLayout();
        nVar.N = true;
        nVar.f5890y.p(false);
        KeyEvent.Callback callback = toolbar.f525t;
        if (callback instanceof j.b) {
            ((j.b) callback).onActionViewExpanded();
        }
        toolbar.u();
        return true;
    }

    @Override // k.y
    public final boolean d(k.e0 e0Var) {
        return false;
    }

    @Override // k.y
    public final boolean e(k.n nVar) {
        Toolbar toolbar = this.f6259c;
        KeyEvent.Callback callback = toolbar.f525t;
        if (callback instanceof j.b) {
            ((j.b) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f525t);
        toolbar.removeView(toolbar.f524s);
        toolbar.f525t = null;
        ArrayList arrayList = toolbar.P;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f6258b = null;
        toolbar.requestLayout();
        nVar.N = false;
        nVar.f5890y.p(false);
        toolbar.u();
        return true;
    }

    @Override // k.y
    public final boolean g() {
        return false;
    }

    @Override // k.y
    public final void i() {
        if (this.f6258b != null) {
            k.l lVar = this.f6257a;
            if (lVar != null) {
                int size = lVar.f5865f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f6257a.getItem(i) == this.f6258b) {
                        return;
                    }
                }
            }
            e(this.f6258b);
        }
    }

    @Override // k.y
    public final void k(Context context, k.l lVar) {
        k.n nVar;
        k.l lVar2 = this.f6257a;
        if (lVar2 != null && (nVar = this.f6258b) != null) {
            lVar2.d(nVar);
        }
        this.f6257a = lVar;
    }

    @Override // k.y
    public final void b(k.l lVar, boolean z4) {
    }
}
