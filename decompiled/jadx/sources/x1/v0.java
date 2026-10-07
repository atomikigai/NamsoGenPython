package x1;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OverScroller f10221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Interpolator f10222d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10223f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f10224r;

    public v0(RecyclerView recyclerView) {
        this.f10224r = recyclerView;
        y yVar = RecyclerView.T0;
        this.f10222d = yVar;
        this.e = false;
        this.f10223f = false;
        this.f10221c = new OverScroller(recyclerView.getContext(), yVar);
    }

    public final void a(int i, int i10) {
        RecyclerView recyclerView = this.f10224r;
        recyclerView.setScrollState(2);
        this.f10220b = 0;
        this.f10219a = 0;
        Interpolator interpolator = this.f10222d;
        y yVar = RecyclerView.T0;
        if (interpolator != yVar) {
            this.f10222d = yVar;
            this.f10221c = new OverScroller(recyclerView.getContext(), yVar);
        }
        this.f10221c.fling(0, 0, i, i10, Integer.MIN_VALUE, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, Integer.MIN_VALUE, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
        b();
    }

    public final void b() {
        if (this.e) {
            this.f10223f = true;
            return;
        }
        RecyclerView recyclerView = this.f10224r;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = q0.v0.f7946a;
        q0.d0.m(recyclerView, this);
    }

    public final void c(int i, int i10, int i11, Interpolator interpolator) {
        RecyclerView recyclerView = this.f10224r;
        if (i11 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i10);
            boolean z4 = iAbs > iAbs2;
            int width = z4 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z4) {
                iAbs = iAbs2;
            }
            i11 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i12 = i11;
        if (interpolator == null) {
            interpolator = RecyclerView.T0;
        }
        if (this.f10222d != interpolator) {
            this.f10222d = interpolator;
            this.f10221c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f10220b = 0;
        this.f10219a = 0;
        recyclerView.setScrollState(2);
        this.f10221c.startScroll(0, 0, i, i10, i12);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i10;
        int i11;
        int i12;
        int i13;
        RecyclerView recyclerView = this.f10224r;
        int[] iArr = recyclerView.E0;
        if (recyclerView.f1166y == null) {
            recyclerView.removeCallbacks(this);
            this.f10221c.abortAnimation();
            return;
        }
        this.f10223f = false;
        this.e = true;
        recyclerView.p();
        OverScroller overScroller = this.f10221c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i14 = currX - this.f10219a;
            int i15 = currY - this.f10220b;
            this.f10219a = currX;
            this.f10220b = currY;
            int iO = RecyclerView.o(i14, recyclerView.T, recyclerView.V, recyclerView.getWidth());
            int iO2 = RecyclerView.o(i15, recyclerView.U, recyclerView.W, recyclerView.getHeight());
            int[] iArr2 = recyclerView.E0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.v(iO, iO2, 1, iArr2, null)) {
                iO -= iArr[0];
                iO2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(iO, iO2);
            }
            if (recyclerView.f1164x != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.f0(iArr, iO, iO2);
                int i16 = iArr[0];
                int i17 = iArr[1];
                int i18 = iO - i16;
                int i19 = iO2 - i17;
                t tVar = recyclerView.f1166y.e;
                if (tVar != null && !tVar.f10207d && tVar.e) {
                    int iB = recyclerView.f1155s0.b();
                    if (iB == 0) {
                        tVar.i();
                    } else if (tVar.f10204a >= iB) {
                        tVar.f10204a = iB - 1;
                        tVar.g(i16, i17);
                    } else {
                        tVar.g(i16, i17);
                    }
                }
                i = i18;
                i11 = i16;
                i10 = i19;
                i12 = i17;
            } else {
                i = iO;
                i10 = iO2;
                i11 = 0;
                i12 = 0;
            }
            if (!recyclerView.A.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.E0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.w(i11, i12, i, i10, null, 1, iArr3);
            int i20 = i - iArr[0];
            int i21 = i10 - iArr[1];
            if (i11 != 0 || i12 != 0) {
                recyclerView.x(i11, i12);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z4 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i20 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i21 != 0));
            t tVar2 = recyclerView.f1166y.e;
            if ((tVar2 == null || !tVar2.f10207d) && z4) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i20 < 0) {
                        i13 = -currVelocity;
                    } else {
                        i13 = i20 > 0 ? currVelocity : 0;
                    }
                    if (i21 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i21 <= 0) {
                        currVelocity = 0;
                    }
                    if (i13 < 0) {
                        recyclerView.z();
                        if (recyclerView.T.isFinished()) {
                            recyclerView.T.onAbsorb(-i13);
                        }
                    } else if (i13 > 0) {
                        recyclerView.A();
                        if (recyclerView.V.isFinished()) {
                            recyclerView.V.onAbsorb(i13);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.B();
                        if (recyclerView.U.isFinished()) {
                            recyclerView.U.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.y();
                        if (recyclerView.W.isFinished()) {
                            recyclerView.W.onAbsorb(currVelocity);
                        }
                    }
                    if (i13 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = q0.v0.f7946a;
                        q0.d0.k(recyclerView);
                    }
                }
                if (RecyclerView.R0) {
                    androidx.datastore.preferences.protobuf.h hVar = recyclerView.f1153r0;
                    int[] iArr4 = (int[]) hVar.f651d;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    hVar.f650c = 0;
                }
            } else {
                b();
                m mVar = recyclerView.f1151q0;
                if (mVar != null) {
                    mVar.a(recyclerView, i11, i12);
                }
            }
        }
        t tVar3 = recyclerView.f1166y.e;
        if (tVar3 != null && tVar3.f10207d) {
            tVar3.g(0, 0);
        }
        this.e = false;
        if (!this.f10223f) {
            recyclerView.setScrollState(0);
            recyclerView.m0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = q0.v0.f7946a;
            q0.d0.m(recyclerView, this);
        }
    }
}
