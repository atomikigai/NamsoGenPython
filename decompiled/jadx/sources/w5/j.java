package w5;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbel;
import e6.f2;
import e6.g3;
import e6.m0;
import e6.p2;
import e6.q2;
import e6.q3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q2 f9664a;

    public j(Context context) {
        super(context);
        this.f9664a = new q2(this, null);
    }

    public final void a() {
        zzbcn.zza(getContext());
        if (((Boolean) zzbel.zze.zze()).booleanValue()) {
            if (((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzkM)).booleanValue()) {
                i6.b.f5218b.execute(new y(this, 1));
                return;
            }
        }
        q2 q2Var = this.f9664a;
        q2Var.getClass();
        try {
            m0 m0Var = q2Var.i;
            if (m0Var != null) {
                m0Var.zzx();
            }
        } catch (RemoteException e) {
            i6.h.i("#007 Could not call remote method.", e);
        }
    }

    public final void b(g gVar) {
        i0.d("#008 Must be called on the main UI thread.");
        zzbcn.zza(getContext());
        if (((Boolean) zzbel.zzf.zze()).booleanValue()) {
            if (((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzkP)).booleanValue()) {
                i6.b.f5218b.execute(new a3.e(this, gVar, 27, false));
                return;
            }
        }
        this.f9664a.b(gVar.f9647a);
    }

    public c getAdListener() {
        return this.f9664a.f3400f;
    }

    public h getAdSize() {
        q3 q3VarZzg;
        q2 q2Var = this.f9664a;
        q2Var.getClass();
        try {
            m0 m0Var = q2Var.i;
            if (m0Var != null && (q3VarZzg = m0Var.zzg()) != null) {
                return new h(q3VarZzg.e, q3VarZzg.f3407b, q3VarZzg.f3406a);
            }
        } catch (RemoteException e) {
            i6.h.i("#007 Could not call remote method.", e);
        }
        h[] hVarArr = q2Var.f3401g;
        if (hVarArr != null) {
            return hVarArr[0];
        }
        return null;
    }

    public String getAdUnitId() {
        m0 m0Var;
        q2 q2Var = this.f9664a;
        if (q2Var.f3403k == null && (m0Var = q2Var.i) != null) {
            try {
                q2Var.f3403k = m0Var.zzr();
            } catch (RemoteException e) {
                i6.h.i("#007 Could not call remote method.", e);
            }
        }
        return q2Var.f3403k;
    }

    public p getOnPaidEventListener() {
        this.f9664a.getClass();
        return null;
    }

    public t getResponseInfo() {
        f2 f2VarZzk;
        q2 q2Var = this.f9664a;
        q2Var.getClass();
        try {
            m0 m0Var = q2Var.i;
            f2VarZzk = m0Var != null ? m0Var.zzk() : null;
        } catch (RemoteException e) {
            i6.h.i("#007 Could not call remote method.", e);
        }
        if (f2VarZzk != null) {
            return new t(f2VarZzk);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i10, int i11, int i12) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i13 = ((i11 - i) - measuredWidth) / 2;
        int i14 = ((i12 - i10) - measuredHeight) / 2;
        childAt.layout(i13, i14, measuredWidth + i13, measuredHeight + i14);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        h adSize;
        int measuredHeight;
        int iO;
        int iO2;
        int i11;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                i6.h.e("Unable to retrieve ad size.", e);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int i12 = adSize.f9656a;
                if (i12 == -3) {
                    iO = -1;
                } else if (i12 != -1) {
                    i6.d dVar = e6.s.f3427f.f3428a;
                    iO = i6.d.o(context, i12);
                } else {
                    iO = context.getResources().getDisplayMetrics().widthPixels;
                }
                int i13 = adSize.f9657b;
                if (i13 == -4 || i13 == -3) {
                    iO2 = -1;
                } else if (i13 != -2) {
                    i6.d dVar2 = e6.s.f3427f.f3428a;
                    iO2 = i6.d.o(context, i13);
                } else {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    float f10 = displayMetrics.heightPixels;
                    float f11 = displayMetrics.density;
                    int i14 = (int) (f10 / f11);
                    if (i14 <= 400) {
                        i11 = 32;
                    } else {
                        i11 = i14 <= 720 ? 50 : 90;
                    }
                    iO2 = (int) (i11 * f11);
                }
                measuredHeight = iO2;
                measuredWidth = iO;
            } else {
                measuredHeight = 0;
            }
        } else {
            measureChild(childAt, i, i10);
            measuredWidth = childAt.getMeasuredWidth();
            measuredHeight = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(measuredHeight, getSuggestedMinimumHeight()), i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(c cVar) {
        q2 q2Var = this.f9664a;
        q2Var.f3400f = cVar;
        p2 p2Var = q2Var.f3399d;
        synchronized (p2Var.f3386a) {
            p2Var.f3387b = cVar;
        }
        if (cVar == 0) {
            this.f9664a.c(null);
            return;
        }
        if (cVar instanceof e6.a) {
            this.f9664a.c((e6.a) cVar);
        }
        if (cVar instanceof x5.e) {
            this.f9664a.e((x5.e) cVar);
        }
    }

    public void setAdSize(h hVar) {
        h[] hVarArr = {hVar};
        q2 q2Var = this.f9664a;
        if (q2Var.f3401g != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        q2Var.d(hVarArr);
    }

    public void setAdUnitId(String str) {
        q2 q2Var = this.f9664a;
        if (q2Var.f3403k != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        q2Var.f3403k = str;
    }

    public void setOnPaidEventListener(p pVar) {
        q2 q2Var = this.f9664a;
        q2Var.getClass();
        try {
            m0 m0Var = q2Var.i;
            if (m0Var != null) {
                m0Var.zzP(new g3());
            }
        } catch (RemoteException e) {
            i6.h.i("#007 Could not call remote method.", e);
        }
    }

    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9664a = new q2(this, attributeSet);
    }
}
