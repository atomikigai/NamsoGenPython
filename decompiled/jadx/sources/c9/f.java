package c9;

import android.view.View;
import androidx.activity.i;
import com.google.android.gms.common.api.internal.r0;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.internal.i0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import q0.d0;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1818d;
    public Object e;

    public r0 a() {
        i0.a("execute parameter required", ((t) this.f1818d) != null);
        return new r0(this, (g7.d[]) this.e, this.f1816b, this.f1817c);
    }

    public void b(int i) {
        switch (this.f1815a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.e;
                WeakReference weakReference = sideSheetBehavior.f2505p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f1817c = i;
                    if (!this.f1816b) {
                        View view = (View) sideSheetBehavior.f2505p.get();
                        androidx.activity.d dVar = (androidx.activity.d) this.f1818d;
                        WeakHashMap weakHashMap = v0.f7946a;
                        d0.m(view, dVar);
                        this.f1816b = true;
                    }
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.e;
                WeakReference weakReference2 = bottomSheetBehavior.U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f1817c = i;
                    if (!this.f1816b) {
                        View view2 = (View) bottomSheetBehavior.U.get();
                        i iVar = (i) this.f1818d;
                        WeakHashMap weakHashMap2 = v0.f7946a;
                        d0.m(view2, iVar);
                        this.f1816b = true;
                    }
                    break;
                }
                break;
        }
    }

    public f(SideSheetBehavior sideSheetBehavior) {
        this.f1815a = 0;
        this.e = sideSheetBehavior;
        this.f1818d = new androidx.activity.d(this, 6);
    }

    public f(BottomSheetBehavior bottomSheetBehavior) {
        this.f1815a = 2;
        this.e = bottomSheetBehavior;
        this.f1818d = new i(this, 23);
    }
}
