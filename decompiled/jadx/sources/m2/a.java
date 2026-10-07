package m2;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends m {
    public ArrayList H;
    public boolean I;
    public int J;
    public boolean K;
    public int L;

    @Override // m2.m
    public final void A(wa.d dVar) {
        super.A(dVar);
        this.L |= 4;
        if (this.H != null) {
            for (int i = 0; i < this.H.size(); i++) {
                ((m) this.H.get(i)).A(dVar);
            }
        }
    }

    @Override // m2.m
    public final void B() {
        this.L |= 2;
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            ((m) this.H.get(i)).B();
        }
    }

    @Override // m2.m
    public final void C(long j4) {
        this.f7000b = j4;
    }

    @Override // m2.m
    public final String E(String str) {
        String strE = super.E(str);
        for (int i = 0; i < this.H.size(); i++) {
            StringBuilder sbC = u.e.c(strE, "\n");
            sbC.append(((m) this.H.get(i)).E(str + "  "));
            strE = sbC.toString();
        }
        return strE;
    }

    public final void F(m mVar) {
        this.H.add(mVar);
        mVar.f7006t = this;
        long j4 = this.f7001c;
        if (j4 >= 0) {
            mVar.x(j4);
        }
        if ((this.L & 1) != 0) {
            mVar.z(this.f7002d);
        }
        if ((this.L & 2) != 0) {
            mVar.B();
        }
        if ((this.L & 4) != 0) {
            mVar.A(this.D);
        }
        if ((this.L & 8) != 0) {
            mVar.y(null);
        }
    }

    @Override // m2.m
    public final void c(s sVar) {
        View view = sVar.f7024b;
        if (r(view)) {
            ArrayList arrayList = this.H;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                m mVar = (m) obj;
                if (mVar.r(view)) {
                    mVar.c(sVar);
                    sVar.f7025c.add(mVar);
                }
            }
        }
    }

    @Override // m2.m
    public final void e(s sVar) {
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            ((m) this.H.get(i)).e(sVar);
        }
    }

    @Override // m2.m
    public final void f(s sVar) {
        View view = sVar.f7024b;
        if (r(view)) {
            ArrayList arrayList = this.H;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                m mVar = (m) obj;
                if (mVar.r(view)) {
                    mVar.f(sVar);
                    sVar.f7025c.add(mVar);
                }
            }
        }
    }

    @Override // m2.m
    /* JADX INFO: renamed from: i */
    public final m clone() {
        a aVar = (a) super.clone();
        aVar.H = new ArrayList();
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            m mVarClone = ((m) this.H.get(i)).clone();
            aVar.H.add(mVarClone);
            mVarClone.f7006t = aVar;
        }
        return aVar;
    }

    @Override // m2.m
    public final void k(ViewGroup viewGroup, gb.r rVar, gb.r rVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j4 = this.f7000b;
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            m mVar = (m) this.H.get(i);
            if (j4 > 0 && (this.I || i == 0)) {
                long j10 = mVar.f7000b;
                if (j10 > 0) {
                    mVar.C(j10 + j4);
                } else {
                    mVar.C(j4);
                }
            }
            mVar.k(viewGroup, rVar, rVar2, arrayList, arrayList2);
        }
    }

    @Override // m2.m
    public final void t(View view) {
        super.t(view);
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            ((m) this.H.get(i)).t(view);
        }
    }

    @Override // m2.m
    public final void v(View view) {
        super.v(view);
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            ((m) this.H.get(i)).v(view);
        }
    }

    @Override // m2.m
    public final void w() {
        if (this.H.isEmpty()) {
            D();
            l();
            return;
        }
        g gVar = new g();
        gVar.f6991b = this;
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((m) obj).a(gVar);
        }
        this.J = this.H.size();
        if (this.I) {
            ArrayList arrayList2 = this.H;
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((m) obj2).w();
            }
            return;
        }
        for (int i11 = 1; i11 < this.H.size(); i11++) {
            ((m) this.H.get(i11 - 1)).a(new g((m) this.H.get(i11), 1));
        }
        m mVar = (m) this.H.get(0);
        if (mVar != null) {
            mVar.w();
        }
    }

    @Override // m2.m
    public final void x(long j4) {
        ArrayList arrayList;
        this.f7001c = j4;
        if (j4 < 0 || (arrayList = this.H) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((m) this.H.get(i)).x(j4);
        }
    }

    @Override // m2.m
    public final void y(com.bumptech.glide.d dVar) {
        this.L |= 8;
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            ((m) this.H.get(i)).y(dVar);
        }
    }

    @Override // m2.m
    public final void z(TimeInterpolator timeInterpolator) {
        this.L |= 1;
        ArrayList arrayList = this.H;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((m) this.H.get(i)).z(timeInterpolator);
            }
        }
        this.f7002d = timeInterpolator;
    }
}
