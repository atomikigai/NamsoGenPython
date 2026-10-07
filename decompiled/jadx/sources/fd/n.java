package fd;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bd.o;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import l.l1;
import l.r;
import o6.h0;
import q0.j0;
import q0.v0;
import vb.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3960d;
    public Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f3961f;

    public n(bd.a aVar, ib.c cVar, i iVar) {
        List listK;
        jc.i.e(cVar, "routeDatabase");
        this.f3958b = aVar;
        this.f3959c = cVar;
        q qVar = q.f9297a;
        this.f3960d = qVar;
        this.e = qVar;
        this.f3961f = new ArrayList();
        o oVar = aVar.i;
        Proxy proxy = aVar.f1544g;
        jc.i.e(oVar, "url");
        if (proxy != null) {
            listK = jd.d.D(proxy);
        } else {
            URI uriF = oVar.f();
            if (uriF.getHost() == null) {
                listK = cd.b.k(Proxy.NO_PROXY);
            } else {
                List<Proxy> listSelect = aVar.h.select(uriF);
                listK = (listSelect == null || listSelect.isEmpty()) ? cd.b.k(Proxy.NO_PROXY) : cd.b.w(listSelect);
            }
        }
        this.f3960d = listK;
        this.f3957a = 0;
    }

    public void a() {
        View view = (View) this.f3958b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((bd.h) this.f3960d) != null) {
                if (((bd.h) this.f3961f) == null) {
                    this.f3961f = new bd.h();
                }
                bd.h hVar = (bd.h) this.f3961f;
                hVar.f1596c = null;
                hVar.f1595b = false;
                hVar.f1597d = null;
                hVar.f1594a = false;
                WeakHashMap weakHashMap = v0.f7946a;
                ColorStateList colorStateListG = j0.g(view);
                if (colorStateListG != null) {
                    hVar.f1595b = true;
                    hVar.f1596c = colorStateListG;
                }
                PorterDuff.Mode modeH = j0.h(view);
                if (modeH != null) {
                    hVar.f1594a = true;
                    hVar.f1597d = modeH;
                }
                if (hVar.f1595b || hVar.f1594a) {
                    r.e(background, hVar, view.getDrawableState());
                    return;
                }
            }
            bd.h hVar2 = (bd.h) this.e;
            if (hVar2 != null) {
                r.e(background, hVar2, view.getDrawableState());
                return;
            }
            bd.h hVar3 = (bd.h) this.f3960d;
            if (hVar3 != null) {
                r.e(background, hVar3, view.getDrawableState());
            }
        }
    }

    public boolean b(int i) {
        ArrayList arrayList = (ArrayList) this.f3959c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            x1.a aVar = (x1.a) arrayList.get(i10);
            int i11 = aVar.f10012a;
            if (i11 != 8) {
                if (i11 == 1) {
                    int i12 = aVar.f10013b;
                    int i13 = aVar.f10014c + i12;
                    while (i12 < i13) {
                        if (g(i12, i10 + 1) == i) {
                            return true;
                        }
                        i12++;
                    }
                } else {
                    continue;
                }
            } else {
                if (g(aVar.f10014c, i10 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.f3959c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((h0) this.f3960d).c((x1.a) arrayList.get(i));
        }
        r(arrayList);
        this.f3957a = 0;
    }

    public void d() {
        h0 h0Var = (h0) this.f3960d;
        c();
        ArrayList arrayList = (ArrayList) this.f3961f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            x1.a aVar = (x1.a) arrayList.get(i);
            int i10 = aVar.f10012a;
            if (i10 == 1) {
                h0Var.c(aVar);
                h0Var.h(aVar.f10013b, aVar.f10014c);
            } else if (i10 == 2) {
                h0Var.c(aVar);
                int i11 = aVar.f10013b;
                int i12 = aVar.f10014c;
                RecyclerView recyclerView = (RecyclerView) h0Var.f7621a;
                recyclerView.S(i11, i12, true);
                recyclerView.f1161v0 = true;
                recyclerView.f1155s0.f10195c += i12;
            } else if (i10 == 4) {
                h0Var.c(aVar);
                h0Var.f(aVar.f10013b, aVar.f10014c);
            } else if (i10 == 8) {
                h0Var.c(aVar);
                h0Var.i(aVar.f10013b, aVar.f10014c);
            }
        }
        r(arrayList);
        this.f3957a = 0;
    }

    public void e(x1.a aVar) {
        int i;
        p0.e eVar = (p0.e) this.f3958b;
        int i10 = aVar.f10012a;
        if (i10 == 1 || i10 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iV = v(aVar.f10013b, i10);
        int i11 = aVar.f10013b;
        int i12 = aVar.f10012a;
        if (i12 == 2) {
            i = 0;
        } else {
            if (i12 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + aVar);
            }
            i = 1;
        }
        int i13 = 1;
        for (int i14 = 1; i14 < aVar.f10014c; i14++) {
            int iV2 = v((i * i14) + aVar.f10013b, aVar.f10012a);
            int i15 = aVar.f10012a;
            if (i15 == 2 ? iV2 != iV : !(i15 == 4 && iV2 == iV + 1)) {
                x1.a aVarM = m(i15, iV, i13);
                f(aVarM, i11);
                eVar.b(aVarM);
                if (aVar.f10012a == 4) {
                    i11 += i13;
                }
                i13 = 1;
                iV = iV2;
            } else {
                i13++;
            }
        }
        eVar.b(aVar);
        if (i13 > 0) {
            x1.a aVarM2 = m(aVar.f10012a, iV, i13);
            f(aVarM2, i11);
            eVar.b(aVarM2);
        }
    }

    public void f(x1.a aVar, int i) {
        h0 h0Var = (h0) this.f3960d;
        h0Var.c(aVar);
        int i10 = aVar.f10012a;
        if (i10 != 2) {
            if (i10 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            h0Var.f(i, aVar.f10014c);
        } else {
            int i11 = aVar.f10014c;
            RecyclerView recyclerView = (RecyclerView) h0Var.f7621a;
            recyclerView.S(i, i11, true);
            recyclerView.f1161v0 = true;
            recyclerView.f1155s0.f10195c += i11;
        }
    }

    public int g(int i, int i10) {
        ArrayList arrayList = (ArrayList) this.f3959c;
        int size = arrayList.size();
        while (i10 < size) {
            x1.a aVar = (x1.a) arrayList.get(i10);
            int i11 = aVar.f10012a;
            if (i11 == 8) {
                int i12 = aVar.f10013b;
                if (i12 == i) {
                    i = aVar.f10014c;
                } else {
                    if (i12 < i) {
                        i--;
                    }
                    if (aVar.f10014c <= i) {
                        i++;
                    }
                }
            } else {
                int i13 = aVar.f10013b;
                if (i13 > i) {
                    continue;
                } else if (i11 == 2) {
                    int i14 = aVar.f10014c;
                    if (i < i13 + i14) {
                        return -1;
                    }
                    i -= i14;
                } else if (i11 == 1) {
                    i += aVar.f10014c;
                }
            }
            i10++;
        }
        return i;
    }

    public ColorStateList h() {
        bd.h hVar = (bd.h) this.e;
        if (hVar != null) {
            return (ColorStateList) hVar.f1596c;
        }
        return null;
    }

    public PorterDuff.Mode i() {
        bd.h hVar = (bd.h) this.e;
        if (hVar != null) {
            return (PorterDuff.Mode) hVar.f1597d;
        }
        return null;
    }

    public boolean j() {
        return this.f3957a < ((List) this.f3960d).size() || !((ArrayList) this.f3961f).isEmpty();
    }

    public boolean k() {
        return ((ArrayList) this.f3961f).size() > 0;
    }

    public void l(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListF;
        View view = (View) this.f3958b;
        Context context = view.getContext();
        int[] iArr = f.a.f3574z;
        a2.l lVarG = a2.l.G(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) lVarG.f44c;
        View view2 = (View) this.f3958b;
        v0.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) lVarG.f44c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f3957a = typedArray.getResourceId(0, -1);
                r rVar = (r) this.f3959c;
                Context context2 = view.getContext();
                int i10 = this.f3957a;
                synchronized (rVar) {
                    colorStateListF = rVar.f6405a.f(context2, i10);
                }
                if (colorStateListF != null) {
                    s(colorStateListF);
                }
            }
            if (typedArray.hasValue(1)) {
                j0.q(view, lVarG.t(1));
            }
            if (typedArray.hasValue(2)) {
                j0.r(view, l1.b(typedArray.getInt(2, -1), null));
            }
            lVarG.I();
        } catch (Throwable th) {
            lVarG.I();
            throw th;
        }
    }

    public x1.a m(int i, int i10, int i11) {
        x1.a aVar = (x1.a) ((p0.e) this.f3958b).c();
        if (aVar != null) {
            aVar.f10012a = i;
            aVar.f10013b = i10;
            aVar.f10014c = i11;
            return aVar;
        }
        x1.a aVar2 = new x1.a();
        aVar2.f10012a = i;
        aVar2.f10013b = i10;
        aVar2.f10014c = i11;
        return aVar2;
    }

    public void n() {
        this.f3957a = -1;
        s(null);
        a();
    }

    public void o(int i) {
        ColorStateList colorStateListF;
        this.f3957a = i;
        r rVar = (r) this.f3959c;
        if (rVar != null) {
            Context context = ((View) this.f3958b).getContext();
            synchronized (rVar) {
                colorStateListF = rVar.f6405a.f(context, i);
            }
        } else {
            colorStateListF = null;
        }
        s(colorStateListF);
        a();
    }

    public void p(x1.a aVar) {
        h0 h0Var = (h0) this.f3960d;
        ((ArrayList) this.f3959c).add(aVar);
        int i = aVar.f10012a;
        if (i == 1) {
            h0Var.h(aVar.f10013b, aVar.f10014c);
            return;
        }
        if (i == 2) {
            int i10 = aVar.f10013b;
            int i11 = aVar.f10014c;
            RecyclerView recyclerView = (RecyclerView) h0Var.f7621a;
            recyclerView.S(i10, i11, false);
            recyclerView.f1161v0 = true;
            return;
        }
        if (i == 4) {
            h0Var.f(aVar.f10013b, aVar.f10014c);
        } else if (i == 8) {
            h0Var.i(aVar.f10013b, aVar.f10014c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + aVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017e  */
    /* JADX WARN: Code duplicated, block: B:104:0x018c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0190  */
    /* JADX WARN: Code duplicated, block: B:187:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0082  */
    /* JADX WARN: Code duplicated, block: B:36:0x0097  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:76:0x0126  */
    /* JADX WARN: Code duplicated, block: B:77:0x0128  */
    /* JADX WARN: Code duplicated, block: B:79:0x012e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0139  */
    /* JADX WARN: Code duplicated, block: B:85:0x0144  */
    /* JADX WARN: Code duplicated, block: B:88:0x014f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0155  */
    /* JADX WARN: Code duplicated, block: B:90:0x0157  */
    /* JADX WARN: Code duplicated, block: B:92:0x015d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0168  */
    /* JADX WARN: Code duplicated, block: B:98:0x0173  */
    public void q() {
        int i;
        boolean z4;
        byte b10;
        x1.a aVarM;
        int i10;
        int i11;
        int i12;
        x1.a aVarM2;
        boolean z10;
        boolean z11;
        x1.a aVarM3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        p0.e eVar = (p0.e) this.f3958b;
        h0 h0Var = (h0) this.f3960d;
        q3.e eVar2 = (q3.e) this.e;
        ArrayList arrayList = (ArrayList) this.f3961f;
        eVar2.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z12 = false;
            while (true) {
                i = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((x1.a) arrayList.get(size)).f10012a != 8) {
                    z12 = true;
                } else if (z12) {
                    break;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i21 = size + 1;
            n nVar = (n) eVar2.f7990a;
            p0.e eVar3 = (p0.e) nVar.f3958b;
            x1.a aVar = (x1.a) arrayList.get(size);
            x1.a aVar2 = (x1.a) arrayList.get(i21);
            int i22 = aVar2.f10012a;
            if (i22 == 1) {
                int i23 = aVar.f10014c;
                int i24 = aVar2.f10013b;
                int i25 = i23 < i24 ? -1 : 0;
                int i26 = aVar.f10013b;
                if (i26 < i24) {
                    i25++;
                }
                if (i24 <= i26) {
                    aVar.f10013b = i26 + aVar2.f10014c;
                }
                int i27 = aVar2.f10013b;
                if (i27 <= i23) {
                    aVar.f10014c = i23 + aVar2.f10014c;
                }
                aVar2.f10013b = i27 + i25;
                arrayList.set(size, aVar2);
                arrayList.set(i21, aVar);
            } else if (i22 == 2) {
                int i28 = aVar.f10013b;
                int i29 = aVar.f10014c;
                if (i28 < i29) {
                    z10 = aVar2.f10013b == i28 && aVar2.f10014c == i29 - i28;
                    z11 = false;
                } else {
                    z10 = aVar2.f10013b == i29 + 1 && aVar2.f10014c == i28 - i29;
                    z11 = true;
                }
                int i30 = aVar2.f10013b;
                if (i29 < i30) {
                    aVar2.f10013b = i30 - 1;
                } else {
                    int i31 = aVar2.f10014c;
                    if (i29 < i30 + i31) {
                        aVar2.f10014c = i31 - 1;
                        aVar.f10012a = 2;
                        aVar.f10014c = 1;
                        if (aVar2.f10014c == 0) {
                            arrayList.remove(i21);
                            eVar3.b(aVar2);
                        }
                    }
                }
                int i32 = aVar.f10013b;
                int i33 = aVar2.f10013b;
                if (i32 <= i33) {
                    aVar2.f10013b = i33 + 1;
                } else {
                    int i34 = i33 + aVar2.f10014c;
                    if (i32 < i34) {
                        aVarM3 = nVar.m(2, i32 + 1, i34 - i32);
                        aVar2.f10014c = aVar.f10013b - aVar2.f10013b;
                    }
                    if (z10) {
                        arrayList.set(size, aVar2);
                        arrayList.remove(i21);
                        eVar3.b(aVar);
                    } else {
                        if (z11) {
                            if (aVarM3 != null) {
                                i19 = aVar.f10013b;
                                if (i19 > aVarM3.f10013b) {
                                    aVar.f10013b = i19 - aVarM3.f10014c;
                                }
                                i20 = aVar.f10014c;
                                if (i20 > aVarM3.f10013b) {
                                    aVar.f10014c = i20 - aVarM3.f10014c;
                                }
                            }
                            i17 = aVar.f10013b;
                            if (i17 > aVar2.f10013b) {
                                aVar.f10013b = i17 - aVar2.f10014c;
                            }
                            i18 = aVar.f10014c;
                            if (i18 > aVar2.f10013b) {
                                aVar.f10014c = i18 - aVar2.f10014c;
                            }
                        } else {
                            if (aVarM3 != null) {
                                i15 = aVar.f10013b;
                                if (i15 >= aVarM3.f10013b) {
                                    aVar.f10013b = i15 - aVarM3.f10014c;
                                }
                                i16 = aVar.f10014c;
                                if (i16 >= aVarM3.f10013b) {
                                    aVar.f10014c = i16 - aVarM3.f10014c;
                                }
                            }
                            i13 = aVar.f10013b;
                            if (i13 >= aVar2.f10013b) {
                                aVar.f10013b = i13 - aVar2.f10014c;
                            }
                            i14 = aVar.f10014c;
                            if (i14 >= aVar2.f10013b) {
                                aVar.f10014c = i14 - aVar2.f10014c;
                            }
                        }
                        arrayList.set(size, aVar2);
                        if (aVar.f10013b != aVar.f10014c) {
                            arrayList.set(i21, aVar);
                        } else {
                            arrayList.remove(i21);
                        }
                        if (aVarM3 != null) {
                            arrayList.add(size, aVarM3);
                        }
                    }
                }
                aVarM3 = null;
                if (z10) {
                    arrayList.set(size, aVar2);
                    arrayList.remove(i21);
                    eVar3.b(aVar);
                } else {
                    if (z11) {
                        if (aVarM3 != null) {
                            i19 = aVar.f10013b;
                            if (i19 > aVarM3.f10013b) {
                                aVar.f10013b = i19 - aVarM3.f10014c;
                            }
                            i20 = aVar.f10014c;
                            if (i20 > aVarM3.f10013b) {
                                aVar.f10014c = i20 - aVarM3.f10014c;
                            }
                        }
                        i17 = aVar.f10013b;
                        if (i17 > aVar2.f10013b) {
                            aVar.f10013b = i17 - aVar2.f10014c;
                        }
                        i18 = aVar.f10014c;
                        if (i18 > aVar2.f10013b) {
                            aVar.f10014c = i18 - aVar2.f10014c;
                        }
                    } else {
                        if (aVarM3 != null) {
                            i15 = aVar.f10013b;
                            if (i15 >= aVarM3.f10013b) {
                                aVar.f10013b = i15 - aVarM3.f10014c;
                            }
                            i16 = aVar.f10014c;
                            if (i16 >= aVarM3.f10013b) {
                                aVar.f10014c = i16 - aVarM3.f10014c;
                            }
                        }
                        i13 = aVar.f10013b;
                        if (i13 >= aVar2.f10013b) {
                            aVar.f10013b = i13 - aVar2.f10014c;
                        }
                        i14 = aVar.f10014c;
                        if (i14 >= aVar2.f10013b) {
                            aVar.f10014c = i14 - aVar2.f10014c;
                        }
                    }
                    arrayList.set(size, aVar2);
                    if (aVar.f10013b != aVar.f10014c) {
                        arrayList.set(i21, aVar);
                    } else {
                        arrayList.remove(i21);
                    }
                    if (aVarM3 != null) {
                        arrayList.add(size, aVarM3);
                    }
                }
            } else if (i22 == 4) {
                int i35 = aVar.f10014c;
                int i36 = aVar2.f10013b;
                if (i35 < i36) {
                    aVar2.f10013b = i36 - 1;
                } else {
                    int i37 = aVar2.f10014c;
                    if (i35 < i36 + i37) {
                        aVar2.f10014c = i37 - 1;
                        aVarM = nVar.m(4, aVar.f10013b, 1);
                    }
                    i10 = aVar.f10013b;
                    i11 = aVar2.f10013b;
                    if (i10 <= i11) {
                        aVar2.f10013b = i11 + 1;
                    } else {
                        i12 = i11 + aVar2.f10014c;
                        if (i10 < i12) {
                            int i38 = i12 - i10;
                            aVarM2 = nVar.m(4, i10 + 1, i38);
                            aVar2.f10014c -= i38;
                        }
                        arrayList.set(i21, aVar);
                        if (aVar2.f10014c > 0) {
                            arrayList.set(size, aVar2);
                        } else {
                            arrayList.remove(size);
                            eVar3.b(aVar2);
                        }
                        if (aVarM != null) {
                            arrayList.add(size, aVarM);
                        }
                        if (aVarM2 != null) {
                            arrayList.add(size, aVarM2);
                        }
                    }
                    aVarM2 = null;
                    arrayList.set(i21, aVar);
                    if (aVar2.f10014c > 0) {
                        arrayList.set(size, aVar2);
                    } else {
                        arrayList.remove(size);
                        eVar3.b(aVar2);
                    }
                    if (aVarM != null) {
                        arrayList.add(size, aVarM);
                    }
                    if (aVarM2 != null) {
                        arrayList.add(size, aVarM2);
                    }
                }
                aVarM = null;
                i10 = aVar.f10013b;
                i11 = aVar2.f10013b;
                if (i10 <= i11) {
                    aVar2.f10013b = i11 + 1;
                } else {
                    i12 = i11 + aVar2.f10014c;
                    if (i10 < i12) {
                        int i39 = i12 - i10;
                        aVarM2 = nVar.m(4, i10 + 1, i39);
                        aVar2.f10014c -= i39;
                    }
                    arrayList.set(i21, aVar);
                    if (aVar2.f10014c > 0) {
                        arrayList.set(size, aVar2);
                    } else {
                        arrayList.remove(size);
                        eVar3.b(aVar2);
                    }
                    if (aVarM != null) {
                        arrayList.add(size, aVarM);
                    }
                    if (aVarM2 != null) {
                        arrayList.add(size, aVarM2);
                    }
                }
                aVarM2 = null;
                arrayList.set(i21, aVar);
                if (aVar2.f10014c > 0) {
                    arrayList.set(size, aVar2);
                } else {
                    arrayList.remove(size);
                    eVar3.b(aVar2);
                }
                if (aVarM != null) {
                    arrayList.add(size, aVarM);
                }
                if (aVarM2 != null) {
                    arrayList.add(size, aVarM2);
                }
            }
        }
        int size2 = arrayList.size();
        int i40 = 0;
        while (i40 < size2) {
            x1.a aVarM4 = (x1.a) arrayList.get(i40);
            int i41 = aVarM4.f10012a;
            if (i41 == 1) {
                p(aVarM4);
            } else if (i41 == 2) {
                int i42 = aVarM4.f10013b;
                int i43 = aVarM4.f10014c + i42;
                int i44 = i42;
                byte b11 = -1;
                int i45 = 0;
                while (i44 < i43) {
                    if (h0Var.d(i44) != null || b(i44)) {
                        if (b11 == 0) {
                            e(m(2, i42, i45));
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        b10 = 1;
                    } else {
                        if (b11 == 1) {
                            p(m(2, i42, i45));
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        b10 = 0;
                    }
                    if (z4) {
                        i44 -= i45;
                        i43 -= i45;
                        i45 = 1;
                    } else {
                        i45++;
                    }
                    i44++;
                    b11 = b10;
                }
                if (i45 != aVarM4.f10014c) {
                    eVar.b(aVarM4);
                    aVarM4 = m(2, i42, i45);
                }
                if (b11 == 0) {
                    e(aVarM4);
                } else {
                    p(aVarM4);
                }
            } else if (i41 == 4) {
                int i46 = aVarM4.f10013b;
                int i47 = aVarM4.f10014c + i46;
                int i48 = i46;
                byte b12 = -1;
                int i49 = 0;
                while (i46 < i47) {
                    if (h0Var.d(i46) != null || b(i46)) {
                        if (b12 == 0) {
                            e(m(4, i48, i49));
                            i48 = i46;
                            i49 = 0;
                        }
                        b12 = 1;
                    } else {
                        if (b12 == 1) {
                            p(m(4, i48, i49));
                            i48 = i46;
                            i49 = 0;
                        }
                        b12 = 0;
                    }
                    i49++;
                    i46++;
                }
                if (i49 != aVarM4.f10014c) {
                    eVar.b(aVarM4);
                    aVarM4 = m(4, i48, i49);
                }
                if (b12 == 0) {
                    e(aVarM4);
                } else {
                    p(aVarM4);
                }
            } else if (i41 == i) {
                p(aVarM4);
            }
            i40++;
            i = 8;
        }
        arrayList.clear();
    }

    public void r(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            x1.a aVar = (x1.a) arrayList.get(i);
            aVar.getClass();
            ((p0.e) this.f3958b).b(aVar);
        }
        arrayList.clear();
    }

    public void s(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((bd.h) this.f3960d) == null) {
                this.f3960d = new bd.h();
            }
            bd.h hVar = (bd.h) this.f3960d;
            hVar.f1596c = colorStateList;
            hVar.f1595b = true;
        } else {
            this.f3960d = null;
        }
        a();
    }

    public void t(ColorStateList colorStateList) {
        if (((bd.h) this.e) == null) {
            this.e = new bd.h();
        }
        bd.h hVar = (bd.h) this.e;
        hVar.f1596c = colorStateList;
        hVar.f1595b = true;
        a();
    }

    public void u(PorterDuff.Mode mode) {
        if (((bd.h) this.e) == null) {
            this.e = new bd.h();
        }
        bd.h hVar = (bd.h) this.e;
        hVar.f1597d = mode;
        hVar.f1594a = true;
        a();
    }

    public int v(int i, int i10) {
        int i11;
        int i12;
        p0.e eVar = (p0.e) this.f3958b;
        ArrayList arrayList = (ArrayList) this.f3959c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            x1.a aVar = (x1.a) arrayList.get(size);
            int i13 = aVar.f10012a;
            if (i13 == 8) {
                int i14 = aVar.f10013b;
                int i15 = aVar.f10014c;
                if (i14 < i15) {
                    i12 = i14;
                    i11 = i15;
                } else {
                    i11 = i14;
                    i12 = i15;
                }
                if (i < i12 || i > i11) {
                    if (i < i14) {
                        if (i10 == 1) {
                            aVar.f10013b = i14 + 1;
                            aVar.f10014c = i15 + 1;
                        } else if (i10 == 2) {
                            aVar.f10013b = i14 - 1;
                            aVar.f10014c = i15 - 1;
                        }
                    }
                } else if (i12 == i14) {
                    if (i10 == 1) {
                        aVar.f10014c = i15 + 1;
                    } else if (i10 == 2) {
                        aVar.f10014c = i15 - 1;
                    }
                    i++;
                } else {
                    if (i10 == 1) {
                        aVar.f10013b = i14 + 1;
                    } else if (i10 == 2) {
                        aVar.f10013b = i14 - 1;
                    }
                    i--;
                }
            } else {
                int i16 = aVar.f10013b;
                if (i16 <= i) {
                    if (i13 == 1) {
                        i -= aVar.f10014c;
                    } else if (i13 == 2) {
                        i += aVar.f10014c;
                    }
                } else if (i10 == 1) {
                    aVar.f10013b = i16 + 1;
                } else if (i10 == 2) {
                    aVar.f10013b = i16 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            x1.a aVar2 = (x1.a) arrayList.get(size2);
            if (aVar2.f10012a == 8) {
                int i17 = aVar2.f10014c;
                if (i17 == aVar2.f10013b || i17 < 0) {
                    arrayList.remove(size2);
                    eVar.b(aVar2);
                }
            } else if (aVar2.f10014c <= 0) {
                arrayList.remove(size2);
                eVar.b(aVar2);
            }
        }
        return i;
    }

    public n(View view) {
        this.f3957a = -1;
        this.f3958b = view;
        this.f3959c = r.a();
    }

    public n(h0 h0Var) {
        this.f3958b = new p0.e(30);
        this.f3961f = new ArrayList();
        this.f3959c = new ArrayList();
        this.f3957a = 0;
        this.f3960d = h0Var;
        this.e = new q3.e(this);
    }
}
