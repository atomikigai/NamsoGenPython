package x1;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.emoji2.text.g f10166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10169d;
    public boolean e;

    public p() {
        d();
    }

    public final void a() {
        this.f10168c = this.f10169d ? this.f10166a.i() : this.f10166a.m();
    }

    public final void b(View view, int i) {
        if (this.f10169d) {
            int iD = this.f10166a.d(view);
            androidx.emoji2.text.g gVar = this.f10166a;
            this.f10168c = (Integer.MIN_VALUE == gVar.f765a ? 0 : gVar.n() - gVar.f765a) + iD;
        } else {
            this.f10168c = this.f10166a.g(view);
        }
        this.f10167b = i;
    }

    public final void c(View view, int i) {
        androidx.emoji2.text.g gVar = this.f10166a;
        int iN = Integer.MIN_VALUE == gVar.f765a ? 0 : gVar.n() - gVar.f765a;
        if (iN >= 0) {
            b(view, i);
            return;
        }
        this.f10167b = i;
        if (!this.f10169d) {
            int iG = this.f10166a.g(view);
            int iM = iG - this.f10166a.m();
            this.f10168c = iG;
            if (iM > 0) {
                int i10 = (this.f10166a.i() - Math.min(0, (this.f10166a.i() - iN) - this.f10166a.d(view))) - (this.f10166a.e(view) + iG);
                if (i10 < 0) {
                    this.f10168c -= Math.min(iM, -i10);
                    return;
                }
                return;
            }
            return;
        }
        int i11 = (this.f10166a.i() - iN) - this.f10166a.d(view);
        this.f10168c = this.f10166a.i() - i11;
        if (i11 > 0) {
            int iE = this.f10168c - this.f10166a.e(view);
            int iM2 = this.f10166a.m();
            int iMin = iE - (Math.min(this.f10166a.g(view) - iM2, 0) + iM2);
            if (iMin < 0) {
                this.f10168c = Math.min(i11, -iMin) + this.f10168c;
            }
        }
    }

    public final void d() {
        this.f10167b = -1;
        this.f10168c = Integer.MIN_VALUE;
        this.f10169d = false;
        this.e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f10167b + ", mCoordinate=" + this.f10168c + ", mLayoutFromEnd=" + this.f10169d + ", mValid=" + this.e + '}';
    }
}
