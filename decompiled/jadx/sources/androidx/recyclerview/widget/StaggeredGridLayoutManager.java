package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.datastore.preferences.protobuf.h;
import androidx.emoji2.text.g;
import com.bumptech.glide.d;
import com.google.android.gms.common.api.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import q0.d0;
import q0.v0;
import s5.j;
import v9.i0;
import x1.a1;
import x1.b1;
import x1.d1;
import x1.e1;
import x1.f1;
import x1.g0;
import x1.h0;
import x1.n0;
import x1.o;
import x1.r0;
import x1.s0;
import x1.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends h0 implements r0 {
    public final j B;
    public final int C;
    public boolean D;
    public boolean E;
    public e1 F;
    public final Rect G;
    public final a1 H;
    public final boolean I;
    public int[] J;
    public final i0 K;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f1170p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f1[] f1171q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f1172r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f1173s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f1174t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1175u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o f1176v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1177w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final BitSet f1179y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1178x = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f1180z = -1;
    public int A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i10) {
        this.f1170p = -1;
        this.f1177w = false;
        j jVar = new j(12, false);
        this.B = jVar;
        this.C = 2;
        this.G = new Rect();
        this.H = new a1(this);
        this.I = true;
        this.K = new i0(this, 3);
        g0 g0VarG = h0.G(context, attributeSet, i, i10);
        int i11 = g0VarG.f10070a;
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i11 != this.f1174t) {
            this.f1174t = i11;
            g gVar = this.f1172r;
            this.f1172r = this.f1173s;
            this.f1173s = gVar;
            n0();
        }
        int i12 = g0VarG.f10071b;
        c(null);
        if (i12 != this.f1170p) {
            jVar.e();
            n0();
            this.f1170p = i12;
            this.f1179y = new BitSet(this.f1170p);
            this.f1171q = new f1[this.f1170p];
            for (int i13 = 0; i13 < this.f1170p; i13++) {
                this.f1171q[i13] = new f1(this, i13);
            }
            n0();
        }
        boolean z4 = g0VarG.f10072c;
        c(null);
        e1 e1Var = this.F;
        if (e1Var != null && e1Var.f10053s != z4) {
            e1Var.f10053s = z4;
        }
        this.f1177w = z4;
        n0();
        o oVar = new o();
        oVar.f10160a = true;
        oVar.f10164f = 0;
        oVar.f10165g = 0;
        this.f1176v = oVar;
        this.f1172r = g.b(this, this.f1174t);
        this.f1173s = g.b(this, 1 - this.f1174t);
    }

    public static int c1(int i, int i10, int i11) {
        int mode;
        return (!(i10 == 0 && i11 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i10) - i11), mode) : i;
    }

    @Override // x1.h0
    public final boolean B0() {
        return this.F == null;
    }

    public final boolean C0() {
        int iJ0;
        if (v() != 0 && this.C != 0 && this.f10087g) {
            if (this.f1178x) {
                iJ0 = K0();
                J0();
            } else {
                iJ0 = J0();
                K0();
            }
            if (iJ0 == 0 && O0() != null) {
                this.B.e();
                this.f10086f = true;
                n0();
                return true;
            }
        }
        return false;
    }

    public final int D0(s0 s0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z4 = !this.I;
        return d.d(s0Var, this.f1172r, G0(z4), F0(z4), this, this.I, this.f1178x);
    }

    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    public final int E0(n0 n0Var, o oVar, s0 s0Var) {
        f1 f1Var;
        ?? r10;
        int iH;
        int iE;
        int iM;
        int iE2;
        int i;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 1;
        this.f1179y.set(0, this.f1170p, true);
        o oVar2 = this.f1176v;
        int i14 = oVar2.i ? oVar.e == 1 ? f.API_PRIORITY_OTHER : Integer.MIN_VALUE : oVar.e == 1 ? oVar.f10165g + oVar.f10161b : oVar.f10164f - oVar.f10161b;
        int i15 = oVar.e;
        for (int i16 = 0; i16 < this.f1170p; i16++) {
            if (!this.f1171q[i16].f10060a.isEmpty()) {
                b1(this.f1171q[i16], i15, i14);
            }
        }
        int i17 = this.f1178x ? this.f1172r.i() : this.f1172r.m();
        boolean z4 = false;
        while (true) {
            int i18 = oVar.f10162c;
            if (i18 < 0 || i18 >= s0Var.b() || (!oVar2.i && this.f1179y.isEmpty())) {
                break;
            }
            View view = n0Var.k(oVar.f10162c, Long.MAX_VALUE).f10230a;
            oVar.f10162c += oVar.f10163d;
            b1 b1Var = (b1) view.getLayoutParams();
            int iB = b1Var.f10105a.b();
            j jVar = this.B;
            int[] iArr = (int[]) jVar.f8445b;
            int i19 = (iArr == null || iB >= iArr.length) ? -1 : iArr[iB];
            if (i19 == -1) {
                if (S0(oVar.e)) {
                    i11 = this.f1170p - i13;
                    i10 = -1;
                    i = -1;
                } else {
                    i = i13;
                    i10 = this.f1170p;
                    i11 = i12;
                }
                f1 f1Var2 = null;
                if (oVar.e == i13) {
                    int iM2 = this.f1172r.m();
                    int i20 = f.API_PRIORITY_OTHER;
                    while (i11 != i10) {
                        f1 f1Var3 = this.f1171q[i11];
                        int iF = f1Var3.f(iM2);
                        if (iF < i20) {
                            i20 = iF;
                            f1Var2 = f1Var3;
                        }
                        i11 += i;
                    }
                } else {
                    int i21 = this.f1172r.i();
                    int i22 = Integer.MIN_VALUE;
                    while (i11 != i10) {
                        f1 f1Var4 = this.f1171q[i11];
                        int iH2 = f1Var4.h(i21);
                        if (iH2 > i22) {
                            f1Var2 = f1Var4;
                            i22 = iH2;
                        }
                        i11 += i;
                    }
                }
                f1Var = f1Var2;
                jVar.g(iB);
                ((int[]) jVar.f8445b)[iB] = f1Var.e;
            } else {
                f1Var = this.f1171q[i19];
            }
            b1Var.e = f1Var;
            if (oVar.e == 1) {
                r10 = 0;
                b(view, false, -1);
            } else {
                r10 = 0;
                b(view, false, 0);
            }
            if (this.f1174t == 1) {
                Q0(view, h0.w(this.f1175u, this.f10090l, r10, ((ViewGroup.MarginLayoutParams) b1Var).width, r10), h0.w(this.f10093o, this.f10091m, B() + E(), ((ViewGroup.MarginLayoutParams) b1Var).height, true));
            } else {
                Q0(view, h0.w(this.f10092n, this.f10090l, D() + C(), ((ViewGroup.MarginLayoutParams) b1Var).width, true), h0.w(this.f1175u, this.f10091m, 0, ((ViewGroup.MarginLayoutParams) b1Var).height, false));
            }
            if (oVar.e == 1) {
                iE = f1Var.f(i17);
                iH = this.f1172r.e(view) + iE;
            } else {
                iH = f1Var.h(i17);
                iE = iH - this.f1172r.e(view);
            }
            if (oVar.e == 1) {
                f1 f1Var5 = b1Var.e;
                f1Var5.getClass();
                b1 b1Var2 = (b1) view.getLayoutParams();
                b1Var2.e = f1Var5;
                ArrayList arrayList = f1Var5.f10060a;
                arrayList.add(view);
                f1Var5.f10062c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    f1Var5.f10061b = Integer.MIN_VALUE;
                }
                if (b1Var2.f10105a.h() || b1Var2.f10105a.k()) {
                    f1Var5.f10063d = f1Var5.f10064f.f1172r.e(view) + f1Var5.f10063d;
                }
            } else {
                f1 f1Var6 = b1Var.e;
                f1Var6.getClass();
                b1 b1Var3 = (b1) view.getLayoutParams();
                b1Var3.e = f1Var6;
                ArrayList arrayList2 = f1Var6.f10060a;
                arrayList2.add(0, view);
                f1Var6.f10061b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    f1Var6.f10062c = Integer.MIN_VALUE;
                }
                if (b1Var3.f10105a.h() || b1Var3.f10105a.k()) {
                    f1Var6.f10063d = f1Var6.f10064f.f1172r.e(view) + f1Var6.f10063d;
                }
            }
            if (P0() && this.f1174t == 1) {
                iE2 = this.f1173s.i() - (((this.f1170p - 1) - f1Var.e) * this.f1175u);
                iM = iE2 - this.f1173s.e(view);
            } else {
                iM = this.f1173s.m() + (f1Var.e * this.f1175u);
                iE2 = this.f1173s.e(view) + iM;
            }
            if (this.f1174t == 1) {
                h0.L(view, iM, iE, iE2, iH);
            } else {
                h0.L(view, iE, iM, iH, iE2);
            }
            b1(f1Var, oVar2.e, i14);
            U0(n0Var, oVar2);
            if (oVar2.h && view.hasFocusable()) {
                this.f1179y.set(f1Var.e, false);
            }
            i13 = 1;
            z4 = true;
            i12 = 0;
        }
        if (!z4) {
            U0(n0Var, oVar2);
        }
        int iM3 = oVar2.e == -1 ? this.f1172r.m() - M0(this.f1172r.m()) : L0(this.f1172r.i()) - this.f1172r.i();
        if (iM3 > 0) {
            return Math.min(oVar.f10161b, iM3);
        }
        return 0;
    }

    public final View F0(boolean z4) {
        int iM = this.f1172r.m();
        int i = this.f1172r.i();
        View view = null;
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            int iG = this.f1172r.g(viewU);
            int iD = this.f1172r.d(viewU);
            if (iD > iM && iG < i) {
                if (iD <= i || !z4) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final View G0(boolean z4) {
        int iM = this.f1172r.m();
        int i = this.f1172r.i();
        int iV = v();
        View view = null;
        for (int i10 = 0; i10 < iV; i10++) {
            View viewU = u(i10);
            int iG = this.f1172r.g(viewU);
            if (this.f1172r.d(viewU) > iM && iG < i) {
                if (iG >= iM || !z4) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final void H0(n0 n0Var, s0 s0Var, boolean z4) {
        int i;
        int iL0 = L0(Integer.MIN_VALUE);
        if (iL0 != Integer.MIN_VALUE && (i = this.f1172r.i() - iL0) > 0) {
            int i10 = i - (-Y0(-i, n0Var, s0Var));
            if (!z4 || i10 <= 0) {
                return;
            }
            this.f1172r.q(i10);
        }
    }

    public final void I0(n0 n0Var, s0 s0Var, boolean z4) {
        int iM;
        int iM0 = M0(f.API_PRIORITY_OTHER);
        if (iM0 != Integer.MAX_VALUE && (iM = iM0 - this.f1172r.m()) > 0) {
            int iY0 = iM - Y0(iM, n0Var, s0Var);
            if (!z4 || iY0 <= 0) {
                return;
            }
            this.f1172r.q(-iY0);
        }
    }

    @Override // x1.h0
    public final boolean J() {
        return this.C != 0;
    }

    public final int J0() {
        if (v() == 0) {
            return 0;
        }
        return h0.F(u(0));
    }

    public final int K0() {
        int iV = v();
        if (iV == 0) {
            return 0;
        }
        return h0.F(u(iV - 1));
    }

    public final int L0(int i) {
        int iF = this.f1171q[0].f(i);
        for (int i10 = 1; i10 < this.f1170p; i10++) {
            int iF2 = this.f1171q[i10].f(i);
            if (iF2 > iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    @Override // x1.h0
    public final void M(int i) {
        super.M(i);
        for (int i10 = 0; i10 < this.f1170p; i10++) {
            f1 f1Var = this.f1171q[i10];
            int i11 = f1Var.f10061b;
            if (i11 != Integer.MIN_VALUE) {
                f1Var.f10061b = i11 + i;
            }
            int i12 = f1Var.f10062c;
            if (i12 != Integer.MIN_VALUE) {
                f1Var.f10062c = i12 + i;
            }
        }
    }

    public final int M0(int i) {
        int iH = this.f1171q[0].h(i);
        for (int i10 = 1; i10 < this.f1170p; i10++) {
            int iH2 = this.f1171q[i10].h(i);
            if (iH2 < iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    @Override // x1.h0
    public final void N(int i) {
        super.N(i);
        for (int i10 = 0; i10 < this.f1170p; i10++) {
            f1 f1Var = this.f1171q[i10];
            int i11 = f1Var.f10061b;
            if (i11 != Integer.MIN_VALUE) {
                f1Var.f10061b = i11 + i;
            }
            int i12 = f1Var.f10062c;
            if (i12 != Integer.MIN_VALUE) {
                f1Var.f10062c = i12 + i;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0039  */
    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050 A[LOOP:0: B:25:0x003f->B:29:0x0050, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053 A[EDGE_INSN: B:30:0x0053->B:31:0x0054 BREAK  A[LOOP:0: B:25:0x003f->B:29:0x0050]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077 A[LOOP:1: B:34:0x0066->B:38:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0092  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00db  */
    /* JADX WARN: Code duplicated, block: B:63:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0054 A[EDGE_INSN: B:64:0x0054->B:31:0x0054 BREAK  A[LOOP:0: B:25:0x003f->B:29:0x0050], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x007b A[EDGE_INSN: B:66:0x007b->B:40:0x007b BREAK  A[LOOP:1: B:34:0x0066->B:38:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public final void N0(int i, int i10, int i11) {
        int i12;
        int i13;
        j jVar;
        int[] iArr;
        int iK0;
        ArrayList arrayList;
        d1 d1Var;
        int size;
        int i14;
        int i15;
        int size2;
        int iK1 = this.f1178x ? K0() : J0();
        if (i11 == 8) {
            if (i < i10) {
                i12 = i10 + 1;
            } else {
                i12 = i + 1;
                i13 = i10;
            }
            jVar = this.B;
            iArr = (int[]) jVar.f8445b;
            if (iArr != null && i13 < iArr.length) {
                arrayList = (ArrayList) jVar.f8446c;
                if (arrayList != null) {
                    if (arrayList == null) {
                        size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                d1Var = null;
                                break;
                            }
                            d1Var = (d1) ((ArrayList) jVar.f8446c).get(size2);
                            if (d1Var.f10033a == i13) {
                                break;
                            } else {
                                size2--;
                            }
                        }
                    } else {
                        d1Var = null;
                        break;
                    }
                    if (d1Var != null) {
                        ((ArrayList) jVar.f8446c).remove(d1Var);
                    }
                    size = ((ArrayList) jVar.f8446c).size();
                    i14 = 0;
                    while (true) {
                        if (i14 < size) {
                            i14 = -1;
                            break;
                        } else if (((d1) ((ArrayList) jVar.f8446c).get(i14)).f10033a >= i13) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                    if (i14 != -1) {
                        d1 d1Var2 = (d1) ((ArrayList) jVar.f8446c).get(i14);
                        ((ArrayList) jVar.f8446c).remove(i14);
                        i15 = d1Var2.f10033a;
                    } else {
                        i15 = -1;
                    }
                } else {
                    i15 = -1;
                }
                if (i15 == -1) {
                    int[] iArr2 = (int[]) jVar.f8445b;
                    Arrays.fill(iArr2, i13, iArr2.length, -1);
                    int length = ((int[]) jVar.f8445b).length;
                } else {
                    Arrays.fill((int[]) jVar.f8445b, i13, Math.min(i15 + 1, ((int[]) jVar.f8445b).length), -1);
                }
            }
            if (i11 != 1) {
                jVar.r(i, i10);
            } else if (i11 != 2) {
                jVar.s(i, i10);
            } else if (i11 == 8) {
                jVar.s(i, 1);
                jVar.r(i10, 1);
            }
            if (i12 <= iK1) {
                return;
            }
            if (this.f1178x) {
                iK0 = J0();
            } else {
                iK0 = K0();
            }
            if (i13 <= iK0) {
                n0();
            }
        }
        i12 = i + i10;
        i13 = i;
        jVar = this.B;
        iArr = (int[]) jVar.f8445b;
        if (iArr != null) {
            arrayList = (ArrayList) jVar.f8446c;
            if (arrayList != null) {
                if (arrayList == null) {
                    size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 >= 0) {
                            d1Var = null;
                            break;
                        }
                        d1Var = (d1) ((ArrayList) jVar.f8446c).get(size2);
                        if (d1Var.f10033a == i13) {
                            break;
                            break;
                        }
                        size2--;
                    }
                } else {
                    d1Var = null;
                    break;
                }
                if (d1Var != null) {
                    ((ArrayList) jVar.f8446c).remove(d1Var);
                }
                size = ((ArrayList) jVar.f8446c).size();
                i14 = 0;
                while (true) {
                    if (i14 < size) {
                        i14 = -1;
                        break;
                    } else {
                        if (((d1) ((ArrayList) jVar.f8446c).get(i14)).f10033a >= i13) {
                            break;
                            break;
                        }
                        i14++;
                    }
                }
                if (i14 != -1) {
                    d1 d1Var3 = (d1) ((ArrayList) jVar.f8446c).get(i14);
                    ((ArrayList) jVar.f8446c).remove(i14);
                    i15 = d1Var3.f10033a;
                } else {
                    i15 = -1;
                }
            } else {
                i15 = -1;
            }
            if (i15 == -1) {
                int[] iArr3 = (int[]) jVar.f8445b;
                Arrays.fill(iArr3, i13, iArr3.length, -1);
                int length2 = ((int[]) jVar.f8445b).length;
            } else {
                Arrays.fill((int[]) jVar.f8445b, i13, Math.min(i15 + 1, ((int[]) jVar.f8445b).length), -1);
            }
        }
        if (i11 != 1) {
            jVar.r(i, i10);
        } else if (i11 != 2) {
            jVar.s(i, i10);
        } else if (i11 == 8) {
            jVar.s(i, 1);
            jVar.r(i10, 1);
        }
        if (i12 <= iK1) {
            return;
        }
        if (this.f1178x) {
            iK0 = J0();
        } else {
            iK0 = K0();
        }
        if (i13 <= iK0) {
            n0();
        }
    }

    @Override // x1.h0
    public final void O() {
        this.B.e();
        for (int i = 0; i < this.f1170p; i++) {
            this.f1171q[i].b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002c A[SYNTHETIC] */
    public final View O0() {
        boolean z4;
        boolean z10;
        int iV = v();
        int i = iV - 1;
        BitSet bitSet = new BitSet(this.f1170p);
        bitSet.set(0, this.f1170p, true);
        byte b10 = (this.f1174t == 1 && P0()) ? (byte) 1 : (byte) -1;
        if (this.f1178x) {
            iV = -1;
        } else {
            i = 0;
        }
        int i10 = i < iV ? 1 : -1;
        while (i != iV) {
            View viewU = u(i);
            b1 b1Var = (b1) viewU.getLayoutParams();
            if (bitSet.get(b1Var.e.e)) {
                f1 f1Var = b1Var.e;
                if (this.f1178x) {
                    int i11 = f1Var.f10062c;
                    if (i11 == Integer.MIN_VALUE) {
                        f1Var.a();
                        i11 = f1Var.f10062c;
                    }
                    if (i11 < this.f1172r.i()) {
                        ArrayList arrayList = f1Var.f10060a;
                        ((b1) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return viewU;
                    }
                } else {
                    int i12 = f1Var.f10061b;
                    ArrayList arrayList2 = f1Var.f10060a;
                    if (i12 == Integer.MIN_VALUE) {
                        View view = (View) arrayList2.get(0);
                        b1 b1Var2 = (b1) view.getLayoutParams();
                        f1Var.f10061b = f1Var.f10064f.f1172r.g(view);
                        b1Var2.getClass();
                        i12 = f1Var.f10061b;
                    }
                    if (i12 > this.f1172r.m()) {
                        ((b1) ((View) arrayList2.get(0)).getLayoutParams()).getClass();
                        return viewU;
                    }
                }
                bitSet.clear(b1Var.e.e);
            }
            i += i10;
            if (i != iV) {
                View viewU2 = u(i);
                if (this.f1178x) {
                    int iD = this.f1172r.d(viewU);
                    int iD2 = this.f1172r.d(viewU2);
                    if (iD >= iD2) {
                        if (iD == iD2) {
                            if (b1Var.e.e - ((b1) viewU2.getLayoutParams()).e.e < 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (b10 < 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z4 != z10) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return viewU;
                }
                int iG = this.f1172r.g(viewU);
                int iG2 = this.f1172r.g(viewU2);
                if (iG <= iG2) {
                    if (iG == iG2) {
                        if (b1Var.e.e - ((b1) viewU2.getLayoutParams()).e.e < 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (b10 < 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z4 != z10) {
                        }
                    } else {
                        continue;
                    }
                }
                return viewU;
            }
        }
        return null;
    }

    public final boolean P0() {
        return A() == 1;
    }

    @Override // x1.h0
    public final void Q(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f10083b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.f1170p; i++) {
            this.f1171q[i].b();
        }
        recyclerView.requestLayout();
    }

    public final void Q0(View view, int i, int i10) {
        RecyclerView recyclerView = this.f10083b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.N(view));
        }
        b1 b1Var = (b1) view.getLayoutParams();
        int iC1 = c1(i, ((ViewGroup.MarginLayoutParams) b1Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) b1Var).rightMargin + rect.right);
        int iC2 = c1(i10, ((ViewGroup.MarginLayoutParams) b1Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) b1Var).bottomMargin + rect.bottom);
        if (w0(view, iC1, iC2, b1Var)) {
            view.measure(iC1, iC2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0046  */
    /* JADX WARN: Code duplicated, block: B:37:0x0051  */
    @Override // x1.h0
    public final View R(View view, int i, n0 n0Var, s0 s0Var) {
        View viewE;
        int i10;
        if (v() != 0) {
            RecyclerView recyclerView = this.f10083b;
            if (recyclerView == null || (viewE = recyclerView.E(view)) == null || this.f10082a.f10023c.contains(viewE)) {
                viewE = null;
            }
            if (viewE != null) {
                X0();
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i == 66 ? this.f1174t == 0 : !(i != 130 || this.f1174t != 1)) {
                                    i10 = 1;
                                }
                            } else if (this.f1174t == 1) {
                                i10 = -1;
                            }
                            i10 = Integer.MIN_VALUE;
                        } else if (this.f1174t == 0) {
                            i10 = -1;
                        } else {
                            i10 = Integer.MIN_VALUE;
                        }
                    } else if (this.f1174t != 1 && P0()) {
                        i10 = -1;
                    } else {
                        i10 = 1;
                    }
                } else if (this.f1174t != 1 && P0()) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                if (i10 != Integer.MIN_VALUE) {
                    b1 b1Var = (b1) viewE.getLayoutParams();
                    b1Var.getClass();
                    f1 f1Var = b1Var.e;
                    int iK0 = i10 == 1 ? K0() : J0();
                    a1(iK0, s0Var);
                    Z0(i10);
                    o oVar = this.f1176v;
                    oVar.f10162c = oVar.f10163d + iK0;
                    oVar.f10161b = (int) (this.f1172r.n() * 0.33333334f);
                    oVar.h = true;
                    oVar.f10160a = false;
                    E0(n0Var, oVar, s0Var);
                    this.D = this.f1178x;
                    View viewG = f1Var.g(iK0, i10);
                    if (viewG != null && viewG != viewE) {
                        return viewG;
                    }
                    if (S0(i10)) {
                        for (int i11 = this.f1170p - 1; i11 >= 0; i11--) {
                            View viewG2 = this.f1171q[i11].g(iK0, i10);
                            if (viewG2 != null && viewG2 != viewE) {
                                return viewG2;
                            }
                        }
                    } else {
                        for (int i12 = 0; i12 < this.f1170p; i12++) {
                            View viewG3 = this.f1171q[i12].g(iK0, i10);
                            if (viewG3 != null && viewG3 != viewE) {
                                return viewG3;
                            }
                        }
                    }
                    boolean z4 = (this.f1177w ^ true) == (i10 == -1);
                    View viewQ = q(z4 ? f1Var.c() : f1Var.d());
                    if (viewQ != null && viewQ != viewE) {
                        return viewQ;
                    }
                    if (S0(i10)) {
                        for (int i13 = this.f1170p - 1; i13 >= 0; i13--) {
                            if (i13 != f1Var.e) {
                                View viewQ2 = q(z4 ? this.f1171q[i13].c() : this.f1171q[i13].d());
                                if (viewQ2 != null && viewQ2 != viewE) {
                                    return viewQ2;
                                }
                            }
                        }
                    } else {
                        for (int i14 = 0; i14 < this.f1170p; i14++) {
                            View viewQ3 = q(z4 ? this.f1171q[i14].c() : this.f1171q[i14].d());
                            if (viewQ3 != null && viewQ3 != viewE) {
                                return viewQ3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:123:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:133:0x0209  */
    /* JADX WARN: Code duplicated, block: B:254:0x0417  */
    /* JADX WARN: Code duplicated, block: B:265:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x01fc A[SYNTHETIC] */
    public final void R0(n0 n0Var, s0 s0Var, boolean z4) {
        boolean z10;
        e1 e1Var;
        int iV;
        int i;
        int iF;
        int iF2;
        int iV2;
        int i10;
        boolean z11;
        e1 e1Var2 = this.F;
        a1 a1Var = this.H;
        if (!(e1Var2 == null && this.f1180z == -1) && s0Var.b() == 0) {
            h0(n0Var);
            a1Var.a();
            return;
        }
        boolean z12 = a1Var.e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = a1Var.f10020g;
        boolean z13 = (z12 && this.f1180z == -1 && this.F == null) ? false : true;
        j jVar = this.B;
        if (z13) {
            a1Var.a();
            e1 e1Var3 = this.F;
            if (e1Var3 != null) {
                int i11 = e1Var3.f10049c;
                if (i11 > 0) {
                    if (i11 == this.f1170p) {
                        for (int i12 = 0; i12 < this.f1170p; i12++) {
                            this.f1171q[i12].b();
                            e1 e1Var4 = this.F;
                            int i13 = e1Var4.f10050d[i12];
                            if (i13 != Integer.MIN_VALUE) {
                                i13 += e1Var4.f10054t ? this.f1172r.i() : this.f1172r.m();
                            }
                            f1 f1Var = this.f1171q[i12];
                            f1Var.f10061b = i13;
                            f1Var.f10062c = i13;
                        }
                    } else {
                        e1Var3.f10050d = null;
                        e1Var3.f10049c = 0;
                        e1Var3.e = 0;
                        e1Var3.f10051f = null;
                        e1Var3.f10052r = null;
                        e1Var3.f10047a = e1Var3.f10048b;
                    }
                }
                e1 e1Var5 = this.F;
                this.E = e1Var5.f10055u;
                boolean z14 = e1Var5.f10053s;
                c(null);
                e1 e1Var6 = this.F;
                if (e1Var6 != null && e1Var6.f10053s != z14) {
                    e1Var6.f10053s = z14;
                }
                this.f1177w = z14;
                n0();
                X0();
                e1 e1Var7 = this.F;
                int i14 = e1Var7.f10047a;
                if (i14 != -1) {
                    this.f1180z = i14;
                    a1Var.f10017c = e1Var7.f10054t;
                } else {
                    a1Var.f10017c = this.f1178x;
                }
                if (e1Var7.e > 1) {
                    jVar.f8445b = e1Var7.f10051f;
                    jVar.f8446c = e1Var7.f10052r;
                }
            } else {
                X0();
                a1Var.f10017c = this.f1178x;
            }
            if (s0Var.f10198g || (i10 = this.f1180z) == -1) {
                if (this.D) {
                    int iB = s0Var.b();
                    iV2 = v() - 1;
                    while (true) {
                        if (iV2 < 0) {
                            iF2 = 0;
                            break;
                        }
                        iF2 = h0.F(u(iV2));
                        if (iF2 < 0 && iF2 < iB) {
                            break;
                        } else {
                            iV2--;
                        }
                    }
                } else {
                    int iB2 = s0Var.b();
                    iV = v();
                    i = 0;
                    while (true) {
                        if (i >= iV) {
                            iF2 = 0;
                            break;
                        }
                        iF = h0.F(u(i));
                        if (iF < 0 && iF < iB2) {
                            iF2 = iF;
                            break;
                        }
                        i++;
                    }
                }
                a1Var.f10015a = iF2;
                a1Var.f10016b = Integer.MIN_VALUE;
            } else if (i10 < 0 || i10 >= s0Var.b()) {
                this.f1180z = -1;
                this.A = Integer.MIN_VALUE;
                if (this.D) {
                    int iB3 = s0Var.b();
                    iV2 = v() - 1;
                    while (true) {
                        if (iV2 < 0) {
                            iF2 = 0;
                            break;
                        } else {
                            iF2 = h0.F(u(iV2));
                            if (iF2 < 0) {
                            }
                            iV2--;
                        }
                    }
                } else {
                    int iB4 = s0Var.b();
                    iV = v();
                    i = 0;
                    while (true) {
                        if (i >= iV) {
                            iF2 = 0;
                            break;
                        } else {
                            iF = h0.F(u(i));
                            if (iF < 0) {
                            }
                            i++;
                        }
                    }
                }
                a1Var.f10015a = iF2;
                a1Var.f10016b = Integer.MIN_VALUE;
            } else {
                e1 e1Var8 = this.F;
                if (e1Var8 == null || e1Var8.f10047a == -1 || e1Var8.f10049c < 1) {
                    View viewQ = q(this.f1180z);
                    if (viewQ != null) {
                        a1Var.f10015a = this.f1178x ? K0() : J0();
                        if (this.A != Integer.MIN_VALUE) {
                            if (a1Var.f10017c) {
                                a1Var.f10016b = (this.f1172r.i() - this.A) - this.f1172r.d(viewQ);
                            } else {
                                a1Var.f10016b = (this.f1172r.m() + this.A) - this.f1172r.g(viewQ);
                            }
                        } else if (this.f1172r.e(viewQ) > this.f1172r.n()) {
                            a1Var.f10016b = a1Var.f10017c ? this.f1172r.i() : this.f1172r.m();
                        } else {
                            int iG = this.f1172r.g(viewQ) - this.f1172r.m();
                            if (iG < 0) {
                                a1Var.f10016b = -iG;
                            } else {
                                int i15 = this.f1172r.i() - this.f1172r.d(viewQ);
                                if (i15 < 0) {
                                    a1Var.f10016b = i15;
                                } else {
                                    a1Var.f10016b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i16 = this.f1180z;
                        a1Var.f10015a = i16;
                        int i17 = this.A;
                        if (i17 == Integer.MIN_VALUE) {
                            if (v() != 0) {
                                if ((i16 < J0()) != this.f1178x) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                            } else if (this.f1178x) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            a1Var.f10017c = z11;
                            a1Var.f10016b = z11 ? staggeredGridLayoutManager.f1172r.i() : staggeredGridLayoutManager.f1172r.m();
                        } else if (a1Var.f10017c) {
                            a1Var.f10016b = staggeredGridLayoutManager.f1172r.i() - i17;
                        } else {
                            a1Var.f10016b = staggeredGridLayoutManager.f1172r.m() + i17;
                        }
                        a1Var.f10018d = true;
                    }
                } else {
                    a1Var.f10016b = Integer.MIN_VALUE;
                    a1Var.f10015a = this.f1180z;
                }
            }
            a1Var.e = true;
        }
        if (this.F == null && this.f1180z == -1 && (a1Var.f10017c != this.D || P0() != this.E)) {
            jVar.e();
            a1Var.f10018d = true;
        }
        if (v() > 0 && ((e1Var = this.F) == null || e1Var.f10049c < 1)) {
            if (a1Var.f10018d) {
                for (int i18 = 0; i18 < this.f1170p; i18++) {
                    this.f1171q[i18].b();
                    int i19 = a1Var.f10016b;
                    if (i19 != Integer.MIN_VALUE) {
                        f1 f1Var2 = this.f1171q[i18];
                        f1Var2.f10061b = i19;
                        f1Var2.f10062c = i19;
                    }
                }
            } else if (z13 || a1Var.f10019f == null) {
                for (int i20 = 0; i20 < this.f1170p; i20++) {
                    f1 f1Var3 = this.f1171q[i20];
                    boolean z15 = this.f1178x;
                    int i21 = a1Var.f10016b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = f1Var3.f10064f;
                    int iF3 = z15 ? f1Var3.f(Integer.MIN_VALUE) : f1Var3.h(Integer.MIN_VALUE);
                    f1Var3.b();
                    if (iF3 != Integer.MIN_VALUE && ((!z15 || iF3 >= staggeredGridLayoutManager2.f1172r.i()) && (z15 || iF3 <= staggeredGridLayoutManager2.f1172r.m()))) {
                        if (i21 != Integer.MIN_VALUE) {
                            iF3 += i21;
                        }
                        f1Var3.f10062c = iF3;
                        f1Var3.f10061b = iF3;
                    }
                }
                f1[] f1VarArr = this.f1171q;
                int length = f1VarArr.length;
                int[] iArr = a1Var.f10019f;
                if (iArr == null || iArr.length < length) {
                    a1Var.f10019f = new int[staggeredGridLayoutManager.f1171q.length];
                }
                for (int i22 = 0; i22 < length; i22++) {
                    a1Var.f10019f[i22] = f1VarArr[i22].h(Integer.MIN_VALUE);
                }
            } else {
                for (int i23 = 0; i23 < this.f1170p; i23++) {
                    f1 f1Var4 = this.f1171q[i23];
                    f1Var4.b();
                    int i24 = a1Var.f10019f[i23];
                    f1Var4.f10061b = i24;
                    f1Var4.f10062c = i24;
                }
            }
        }
        p(n0Var);
        o oVar = this.f1176v;
        oVar.f10160a = false;
        int iN = this.f1173s.n();
        this.f1175u = iN / this.f1170p;
        View.MeasureSpec.makeMeasureSpec(iN, this.f1173s.k());
        a1(a1Var.f10015a, s0Var);
        if (a1Var.f10017c) {
            Z0(-1);
            E0(n0Var, oVar, s0Var);
            Z0(1);
            oVar.f10162c = a1Var.f10015a + oVar.f10163d;
            E0(n0Var, oVar, s0Var);
        } else {
            Z0(1);
            E0(n0Var, oVar, s0Var);
            Z0(-1);
            oVar.f10162c = a1Var.f10015a + oVar.f10163d;
            E0(n0Var, oVar, s0Var);
        }
        if (this.f1173s.k() != 1073741824) {
            int iV3 = v();
            float fMax = 0.0f;
            for (int i25 = 0; i25 < iV3; i25++) {
                View viewU = u(i25);
                float fE = this.f1173s.e(viewU);
                if (fE >= fMax) {
                    ((b1) viewU.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fE);
                }
            }
            int i26 = this.f1175u;
            int iRound = Math.round(fMax * this.f1170p);
            if (this.f1173s.k() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f1173s.n());
            }
            this.f1175u = iRound / this.f1170p;
            View.MeasureSpec.makeMeasureSpec(iRound, this.f1173s.k());
            if (this.f1175u != i26) {
                for (int i27 = 0; i27 < iV3; i27++) {
                    View viewU2 = u(i27);
                    b1 b1Var = (b1) viewU2.getLayoutParams();
                    b1Var.getClass();
                    if (P0() && this.f1174t == 1) {
                        int i28 = -((this.f1170p - 1) - b1Var.e.e);
                        viewU2.offsetLeftAndRight((this.f1175u * i28) - (i28 * i26));
                    } else {
                        int i29 = b1Var.e.e;
                        int i30 = this.f1175u * i29;
                        int i31 = i29 * i26;
                        if (this.f1174t == 1) {
                            viewU2.offsetLeftAndRight(i30 - i31);
                        } else {
                            viewU2.offsetTopAndBottom(i30 - i31);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.f1178x) {
                H0(n0Var, s0Var, true);
                I0(n0Var, s0Var, false);
            } else {
                I0(n0Var, s0Var, true);
                H0(n0Var, s0Var, false);
            }
        }
        if (z4 && !s0Var.f10198g && this.C != 0 && v() > 0 && O0() != null) {
            RecyclerView recyclerView = this.f10083b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.K);
            }
            z10 = C0();
        }
        if (s0Var.f10198g) {
            a1Var.a();
        }
        this.D = a1Var.f10017c;
        this.E = P0();
        if (z10) {
            a1Var.a();
            R0(n0Var, s0Var, false);
        }
    }

    @Override // x1.h0
    public final void S(AccessibilityEvent accessibilityEvent) {
        super.S(accessibilityEvent);
        if (v() > 0) {
            View viewG0 = G0(false);
            View viewF0 = F0(false);
            if (viewG0 == null || viewF0 == null) {
                return;
            }
            int iF = h0.F(viewG0);
            int iF2 = h0.F(viewF0);
            if (iF < iF2) {
                accessibilityEvent.setFromIndex(iF);
                accessibilityEvent.setToIndex(iF2);
            } else {
                accessibilityEvent.setFromIndex(iF2);
                accessibilityEvent.setToIndex(iF);
            }
        }
    }

    public final boolean S0(int i) {
        if (this.f1174t == 0) {
            return (i == -1) != this.f1178x;
        }
        return ((i == -1) == this.f1178x) == P0();
    }

    public final void T0(int i, s0 s0Var) {
        int iJ0;
        int i10;
        if (i > 0) {
            iJ0 = K0();
            i10 = 1;
        } else {
            iJ0 = J0();
            i10 = -1;
        }
        o oVar = this.f1176v;
        oVar.f10160a = true;
        a1(iJ0, s0Var);
        Z0(i10);
        oVar.f10162c = iJ0 + oVar.f10163d;
        oVar.f10161b = Math.abs(i);
    }

    public final void U0(n0 n0Var, o oVar) {
        int iMin;
        if (!oVar.f10160a || oVar.i) {
            return;
        }
        if (oVar.f10161b == 0) {
            if (oVar.e == -1) {
                V0(oVar.f10165g, n0Var);
                return;
            } else {
                W0(oVar.f10164f, n0Var);
                return;
            }
        }
        int i = 1;
        if (oVar.e == -1) {
            int i10 = oVar.f10164f;
            int iH = this.f1171q[0].h(i10);
            while (i < this.f1170p) {
                int iH2 = this.f1171q[i].h(i10);
                if (iH2 > iH) {
                    iH = iH2;
                }
                i++;
            }
            int i11 = i10 - iH;
            V0(i11 < 0 ? oVar.f10165g : oVar.f10165g - Math.min(i11, oVar.f10161b), n0Var);
            return;
        }
        int i12 = oVar.f10165g;
        int iF = this.f1171q[0].f(i12);
        while (i < this.f1170p) {
            int iF2 = this.f1171q[i].f(i12);
            if (iF2 < iF) {
                iF = iF2;
            }
            i++;
        }
        int i13 = iF - oVar.f10165g;
        if (i13 < 0) {
            iMin = oVar.f10164f;
        } else {
            iMin = Math.min(i13, oVar.f10161b) + oVar.f10164f;
        }
        W0(iMin, n0Var);
    }

    public final void V0(int i, n0 n0Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            if (this.f1172r.g(viewU) < i || this.f1172r.p(viewU) < i) {
                return;
            }
            b1 b1Var = (b1) viewU.getLayoutParams();
            b1Var.getClass();
            if (b1Var.e.f10060a.size() == 1) {
                return;
            }
            f1 f1Var = b1Var.e;
            ArrayList arrayList = f1Var.f10060a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            b1 b1Var2 = (b1) view.getLayoutParams();
            b1Var2.e = null;
            if (b1Var2.f10105a.h() || b1Var2.f10105a.k()) {
                f1Var.f10063d -= f1Var.f10064f.f1172r.e(view);
            }
            if (size == 1) {
                f1Var.f10061b = Integer.MIN_VALUE;
            }
            f1Var.f10062c = Integer.MIN_VALUE;
            j0(viewU, n0Var);
        }
    }

    @Override // x1.h0
    public final void W(int i, int i10) {
        N0(i, i10, 1);
    }

    public final void W0(int i, n0 n0Var) {
        while (v() > 0) {
            View viewU = u(0);
            if (this.f1172r.d(viewU) > i || this.f1172r.o(viewU) > i) {
                return;
            }
            b1 b1Var = (b1) viewU.getLayoutParams();
            b1Var.getClass();
            if (b1Var.e.f10060a.size() == 1) {
                return;
            }
            f1 f1Var = b1Var.e;
            ArrayList arrayList = f1Var.f10060a;
            View view = (View) arrayList.remove(0);
            b1 b1Var2 = (b1) view.getLayoutParams();
            b1Var2.e = null;
            if (arrayList.size() == 0) {
                f1Var.f10062c = Integer.MIN_VALUE;
            }
            if (b1Var2.f10105a.h() || b1Var2.f10105a.k()) {
                f1Var.f10063d -= f1Var.f10064f.f1172r.e(view);
            }
            f1Var.f10061b = Integer.MIN_VALUE;
            j0(viewU, n0Var);
        }
    }

    @Override // x1.h0
    public final void X() {
        this.B.e();
        n0();
    }

    public final void X0() {
        if (this.f1174t == 1 || !P0()) {
            this.f1178x = this.f1177w;
        } else {
            this.f1178x = !this.f1177w;
        }
    }

    @Override // x1.h0
    public final void Y(int i, int i10) {
        N0(i, i10, 8);
    }

    public final int Y0(int i, n0 n0Var, s0 s0Var) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        T0(i, s0Var);
        o oVar = this.f1176v;
        int iE0 = E0(n0Var, oVar, s0Var);
        if (oVar.f10161b >= iE0) {
            i = i < 0 ? -iE0 : iE0;
        }
        this.f1172r.q(-i);
        this.D = this.f1178x;
        oVar.f10161b = 0;
        U0(n0Var, oVar);
        return i;
    }

    @Override // x1.h0
    public final void Z(int i, int i10) {
        N0(i, i10, 2);
    }

    public final void Z0(int i) {
        o oVar = this.f1176v;
        oVar.e = i;
        oVar.f10163d = this.f1178x != (i == -1) ? -1 : 1;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    @Override // x1.r0
    public final PointF a(int i) {
        int i10 = -1;
        if (v() != 0) {
            if ((i < J0()) == this.f1178x) {
                i10 = 1;
            }
        } else if (this.f1178x) {
            i10 = 1;
        }
        PointF pointF = new PointF();
        if (i10 == 0) {
            return null;
        }
        if (this.f1174t == 0) {
            pointF.x = i10;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i10;
        return pointF;
    }

    @Override // x1.h0
    public final void a0(int i, int i10) {
        N0(i, i10, 4);
    }

    public final void a1(int i, s0 s0Var) {
        int iN;
        int iN2;
        int i10;
        o oVar = this.f1176v;
        boolean z4 = false;
        oVar.f10161b = 0;
        oVar.f10162c = i;
        t tVar = this.e;
        if (tVar == null || !tVar.e || (i10 = s0Var.f10193a) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.f1178x == (i10 < i)) {
                iN = this.f1172r.n();
                iN2 = 0;
            } else {
                iN2 = this.f1172r.n();
                iN = 0;
            }
        }
        RecyclerView recyclerView = this.f10083b;
        if (recyclerView == null || !recyclerView.f1154s) {
            oVar.f10165g = this.f1172r.h() + iN;
            oVar.f10164f = -iN2;
        } else {
            oVar.f10164f = this.f1172r.m() - iN2;
            oVar.f10165g = this.f1172r.i() + iN;
        }
        oVar.h = false;
        oVar.f10160a = true;
        if (this.f1172r.k() == 0 && this.f1172r.h() == 0) {
            z4 = true;
        }
        oVar.i = z4;
    }

    @Override // x1.h0
    public final void b0(n0 n0Var, s0 s0Var) {
        R0(n0Var, s0Var, true);
    }

    public final void b1(f1 f1Var, int i, int i10) {
        int i11 = f1Var.f10063d;
        int i12 = f1Var.e;
        if (i != -1) {
            int i13 = f1Var.f10062c;
            if (i13 == Integer.MIN_VALUE) {
                f1Var.a();
                i13 = f1Var.f10062c;
            }
            if (i13 - i11 >= i10) {
                this.f1179y.set(i12, false);
                return;
            }
            return;
        }
        int i14 = f1Var.f10061b;
        if (i14 == Integer.MIN_VALUE) {
            View view = (View) f1Var.f10060a.get(0);
            b1 b1Var = (b1) view.getLayoutParams();
            f1Var.f10061b = f1Var.f10064f.f1172r.g(view);
            b1Var.getClass();
            i14 = f1Var.f10061b;
        }
        if (i14 + i11 <= i10) {
            this.f1179y.set(i12, false);
        }
    }

    @Override // x1.h0
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // x1.h0
    public final void c0(s0 s0Var) {
        this.f1180z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override // x1.h0
    public final boolean d() {
        return this.f1174t == 0;
    }

    @Override // x1.h0
    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof e1) {
            e1 e1Var = (e1) parcelable;
            this.F = e1Var;
            if (this.f1180z != -1) {
                e1Var.f10047a = -1;
                e1Var.f10048b = -1;
                e1Var.f10050d = null;
                e1Var.f10049c = 0;
                e1Var.e = 0;
                e1Var.f10051f = null;
                e1Var.f10052r = null;
            }
            n0();
        }
    }

    @Override // x1.h0
    public final boolean e() {
        return this.f1174t == 1;
    }

    @Override // x1.h0
    public final Parcelable e0() {
        int iH;
        int iM;
        int[] iArr;
        e1 e1Var = this.F;
        if (e1Var != null) {
            e1 e1Var2 = new e1();
            e1Var2.f10049c = e1Var.f10049c;
            e1Var2.f10047a = e1Var.f10047a;
            e1Var2.f10048b = e1Var.f10048b;
            e1Var2.f10050d = e1Var.f10050d;
            e1Var2.e = e1Var.e;
            e1Var2.f10051f = e1Var.f10051f;
            e1Var2.f10053s = e1Var.f10053s;
            e1Var2.f10054t = e1Var.f10054t;
            e1Var2.f10055u = e1Var.f10055u;
            e1Var2.f10052r = e1Var.f10052r;
            return e1Var2;
        }
        e1 e1Var3 = new e1();
        e1Var3.f10053s = this.f1177w;
        e1Var3.f10054t = this.D;
        e1Var3.f10055u = this.E;
        j jVar = this.B;
        if (jVar == null || (iArr = (int[]) jVar.f8445b) == null) {
            e1Var3.e = 0;
        } else {
            e1Var3.f10051f = iArr;
            e1Var3.e = iArr.length;
            e1Var3.f10052r = (ArrayList) jVar.f8446c;
        }
        if (v() <= 0) {
            e1Var3.f10047a = -1;
            e1Var3.f10048b = -1;
            e1Var3.f10049c = 0;
            return e1Var3;
        }
        e1Var3.f10047a = this.D ? K0() : J0();
        View viewF0 = this.f1178x ? F0(true) : G0(true);
        e1Var3.f10048b = viewF0 != null ? h0.F(viewF0) : -1;
        int i = this.f1170p;
        e1Var3.f10049c = i;
        e1Var3.f10050d = new int[i];
        for (int i10 = 0; i10 < this.f1170p; i10++) {
            if (this.D) {
                iH = this.f1171q[i10].f(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iM = this.f1172r.i();
                    iH -= iM;
                }
            } else {
                iH = this.f1171q[i10].h(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iM = this.f1172r.m();
                    iH -= iM;
                }
            }
            e1Var3.f10050d[i10] = iH;
        }
        return e1Var3;
    }

    @Override // x1.h0
    public final boolean f(x1.i0 i0Var) {
        return i0Var instanceof b1;
    }

    @Override // x1.h0
    public final void f0(int i) {
        if (i == 0) {
            C0();
        }
    }

    @Override // x1.h0
    public final void h(int i, int i10, s0 s0Var, h hVar) {
        o oVar;
        int iF;
        int iH;
        if (this.f1174t != 0) {
            i = i10;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        T0(i, s0Var);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.f1170p) {
            this.J = new int[this.f1170p];
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = this.f1170p;
            oVar = this.f1176v;
            if (i11 >= i13) {
                break;
            }
            if (oVar.f10163d == -1) {
                iF = oVar.f10164f;
                iH = this.f1171q[i11].h(iF);
            } else {
                iF = this.f1171q[i11].f(oVar.f10165g);
                iH = oVar.f10165g;
            }
            int i14 = iF - iH;
            if (i14 >= 0) {
                this.J[i12] = i14;
                i12++;
            }
            i11++;
        }
        Arrays.sort(this.J, 0, i12);
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = oVar.f10162c;
            if (i16 < 0 || i16 >= s0Var.b()) {
                return;
            }
            hVar.b(oVar.f10162c, this.J[i15]);
            oVar.f10162c += oVar.f10163d;
        }
    }

    @Override // x1.h0
    public final int j(s0 s0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z4 = !this.I;
        return d.c(s0Var, this.f1172r, G0(z4), F0(z4), this, this.I);
    }

    @Override // x1.h0
    public final int k(s0 s0Var) {
        return D0(s0Var);
    }

    @Override // x1.h0
    public final int l(s0 s0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z4 = !this.I;
        return d.e(s0Var, this.f1172r, G0(z4), F0(z4), this, this.I);
    }

    @Override // x1.h0
    public final int m(s0 s0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z4 = !this.I;
        return d.c(s0Var, this.f1172r, G0(z4), F0(z4), this, this.I);
    }

    @Override // x1.h0
    public final int n(s0 s0Var) {
        return D0(s0Var);
    }

    @Override // x1.h0
    public final int o(s0 s0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z4 = !this.I;
        return d.e(s0Var, this.f1172r, G0(z4), F0(z4), this, this.I);
    }

    @Override // x1.h0
    public final int o0(int i, n0 n0Var, s0 s0Var) {
        return Y0(i, n0Var, s0Var);
    }

    @Override // x1.h0
    public final void p0(int i) {
        e1 e1Var = this.F;
        if (e1Var != null && e1Var.f10047a != i) {
            e1Var.f10050d = null;
            e1Var.f10049c = 0;
            e1Var.f10047a = -1;
            e1Var.f10048b = -1;
        }
        this.f1180z = i;
        this.A = Integer.MIN_VALUE;
        n0();
    }

    @Override // x1.h0
    public final int q0(int i, n0 n0Var, s0 s0Var) {
        return Y0(i, n0Var, s0Var);
    }

    @Override // x1.h0
    public final x1.i0 r() {
        return this.f1174t == 0 ? new b1(-2, -1) : new b1(-1, -2);
    }

    @Override // x1.h0
    public final x1.i0 s(Context context, AttributeSet attributeSet) {
        return new b1(context, attributeSet);
    }

    @Override // x1.h0
    public final x1.i0 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b1((ViewGroup.MarginLayoutParams) layoutParams) : new b1(layoutParams);
    }

    @Override // x1.h0
    public final void t0(Rect rect, int i, int i10) {
        int iG;
        int iG2;
        int iD = D() + C();
        int iB = B() + E();
        int i11 = this.f1174t;
        int i12 = this.f1170p;
        if (i11 == 1) {
            int iHeight = rect.height() + iB;
            RecyclerView recyclerView = this.f10083b;
            WeakHashMap weakHashMap = v0.f7946a;
            iG2 = h0.g(i10, iHeight, d0.d(recyclerView));
            iG = h0.g(i, (this.f1175u * i12) + iD, d0.e(this.f10083b));
        } else {
            int iWidth = rect.width() + iD;
            RecyclerView recyclerView2 = this.f10083b;
            WeakHashMap weakHashMap2 = v0.f7946a;
            iG = h0.g(i, iWidth, d0.e(recyclerView2));
            iG2 = h0.g(i10, (this.f1175u * i12) + iB, d0.d(this.f10083b));
        }
        this.f10083b.setMeasuredDimension(iG, iG2);
    }

    @Override // x1.h0
    public final void z0(RecyclerView recyclerView, int i) {
        t tVar = new t(recyclerView.getContext());
        tVar.f10204a = i;
        A0(tVar);
    }
}
