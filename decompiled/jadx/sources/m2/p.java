package m2;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f7015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f7016b;

    /* JADX WARN: Code duplicated, block: B:100:0x021d  */
    /* JADX WARN: Code duplicated, block: B:102:0x022b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0237  */
    /* JADX WARN: Code duplicated, block: B:107:0x024b  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f5 A[EDGE_INSN: B:134:0x01f5->B:90:0x01f5 BREAK  A[LOOP:1: B:18:0x0084->B:89:0x01eb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0053 A[LOOP:0: B:15:0x0051->B:16:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0089  */
    /* JADX WARN: Code duplicated, block: B:22:0x008d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    /* JADX WARN: Code duplicated, block: B:26:0x0093  */
    /* JADX WARN: Code duplicated, block: B:28:0x0096  */
    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:47:0x0104  */
    /* JADX WARN: Code duplicated, block: B:49:0x0119  */
    /* JADX WARN: Code duplicated, block: B:62:0x015e  */
    /* JADX WARN: Code duplicated, block: B:64:0x016e  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:93:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:95:0x020a  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        gb.r rVar;
        gb.r rVar2;
        r.e eVar;
        r.e eVar2;
        int i10;
        int[] iArr;
        boolean z4;
        int i11;
        int i12;
        r.e eVarN;
        int i13;
        Animator animator;
        k kVar;
        View view;
        s sVar;
        s sVar2;
        int i14;
        gb.r rVar3;
        boolean z10;
        int i15;
        View view2;
        s sVar3;
        r.e eVar3;
        int i16;
        int i17;
        View view3;
        View view4;
        SparseArray sparseArray;
        int size;
        int i18;
        View view5;
        View view6;
        r.h hVar;
        int iG;
        int i19;
        View view7;
        gb.r rVar4;
        int size2;
        int i20;
        m mVar = this.f7015a;
        ViewGroup viewGroup = this.f7016b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z11 = true;
        if (!q.f7019c.remove(viewGroup)) {
            return true;
        }
        r.e eVarB = q.b();
        ArrayList arrayList2 = (ArrayList) eVarB.get(viewGroup);
        if (arrayList2 != null) {
            arrayList = arrayList2.size() > 0 ? new ArrayList(arrayList2) : null;
            arrayList2.add(mVar);
            mVar.a(new o(this, eVarB));
            i = 0;
            mVar.g(viewGroup, false);
            if (arrayList != null) {
                size2 = arrayList.size();
                i20 = 0;
                while (i20 < size2) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    ((m) obj).v(viewGroup);
                }
            }
            mVar.f7008v = new ArrayList();
            mVar.f7009w = new ArrayList();
            rVar = mVar.f7004r;
            rVar2 = mVar.f7005s;
            eVar = new r.e((r.e) rVar.f4493a);
            eVar2 = new r.e((r.e) rVar2.f4493a);
            i10 = 0;
            while (true) {
                iArr = mVar.f7007u;
                if (i10 < iArr.length) {
                    break;
                }
                i14 = iArr[i10];
                if (i14 != z11) {
                    rVar3 = rVar2;
                    z10 = z11;
                    for (i15 = eVar.f8100c - 1; i15 >= 0; i15--) {
                        view2 = (View) eVar.f(i15);
                        if (view2 == null && mVar.r(view2) && (sVar3 = (s) eVar2.remove(view2)) != null && mVar.r(sVar3.f7024b)) {
                            mVar.f7008v.add((s) eVar.h(i15));
                            mVar.f7009w.add(sVar3);
                        }
                    }
                } else if (i14 != 2) {
                    rVar3 = rVar2;
                    z10 = z11;
                    eVar3 = (r.e) rVar.f4496d;
                    r.e eVar4 = (r.e) rVar3.f4496d;
                    i16 = eVar3.f8100c;
                    for (i17 = 0; i17 < i16; i17++) {
                        view3 = (View) eVar3.j(i17);
                        if (view3 == null && mVar.r(view3) && (view4 = (View) eVar4.get(eVar3.f(i17))) != null && mVar.r(view4)) {
                            s sVar4 = (s) eVar.get(view3);
                            s sVar5 = (s) eVar2.get(view4);
                            if (sVar4 != null && sVar5 != null) {
                                mVar.f7008v.add(sVar4);
                                mVar.f7009w.add(sVar5);
                                eVar.remove(view3);
                                eVar2.remove(view4);
                            }
                        }
                    }
                } else if (i14 != 3) {
                    z10 = z11;
                    sparseArray = (SparseArray) rVar.f4494b;
                    rVar3 = rVar2;
                    SparseArray sparseArray2 = (SparseArray) rVar3.f4494b;
                    size = sparseArray.size();
                    for (i18 = 0; i18 < size; i18++) {
                        view5 = (View) sparseArray.valueAt(i18);
                        if (view5 == null && mVar.r(view5) && (view6 = (View) sparseArray2.get(sparseArray.keyAt(i18))) != null && mVar.r(view6)) {
                            s sVar6 = (s) eVar.get(view5);
                            s sVar7 = (s) eVar2.get(view6);
                            if (sVar6 != null && sVar7 != null) {
                                mVar.f7008v.add(sVar6);
                                mVar.f7009w.add(sVar7);
                                eVar.remove(view5);
                                eVar2.remove(view6);
                            }
                        }
                    }
                } else if (i14 != 4) {
                    rVar3 = rVar2;
                    z10 = z11;
                } else {
                    hVar = (r.h) rVar.f4495c;
                    r.h hVar2 = (r.h) rVar2.f4495c;
                    iG = hVar.g();
                    i19 = i;
                    while (i19 < iG) {
                        view7 = (View) hVar.h(i19);
                        if (view7 == null && mVar.r(view7)) {
                            rVar4 = rVar2;
                            View view8 = (View) hVar2.b(hVar.d(i19));
                            if (view8 != null && mVar.r(view8)) {
                                s sVar8 = (s) eVar.get(view7);
                                s sVar9 = (s) eVar2.get(view8);
                                if (sVar8 != null && sVar9 != null) {
                                    mVar.f7008v.add(sVar8);
                                    mVar.f7009w.add(sVar9);
                                    eVar.remove(view7);
                                    eVar2.remove(view8);
                                }
                            }
                            i19++;
                            rVar2 = rVar4;
                            z11 = z11;
                        } else {
                            rVar4 = rVar2;
                        }
                        i19++;
                        rVar2 = rVar4;
                        z11 = z11;
                    }
                    z10 = z11;
                    rVar3 = rVar2;
                }
                i10++;
                rVar2 = rVar3;
                z11 = z10;
                i = 0;
            }
            z4 = z11;
            for (i11 = 0; i11 < eVar.f8100c; i11++) {
                sVar2 = (s) eVar.j(i11);
                if (mVar.r(sVar2.f7024b)) {
                    mVar.f7008v.add(sVar2);
                    mVar.f7009w.add(null);
                }
            }
            for (i12 = 0; i12 < eVar2.f8100c; i12++) {
                sVar = (s) eVar2.j(i12);
                if (mVar.r(sVar.f7024b)) {
                    mVar.f7009w.add(sVar);
                    mVar.f7008v.add(null);
                }
            }
            eVarN = m.n();
            int i21 = eVarN.f8100c;
            v vVar = t.f7026a;
            WindowId windowId = viewGroup.getWindowId();
            i13 = i21 - 1;
            while (i13 >= 0) {
                animator = (Animator) eVarN.f(i13);
                if (animator == null && (kVar = (k) eVarN.get(animator)) != null && (view = kVar.f6995a) != null && kVar.f6998d.f6980a.equals(windowId)) {
                    s sVar10 = kVar.f6997c;
                    boolean z12 = z4;
                    s sVarP = mVar.p(view, z12);
                    s sVarM = mVar.m(view, z12);
                    if (sVarP == null && sVarM == null) {
                        sVarM = (s) ((r.e) mVar.f7005s.f4493a).get(view);
                    }
                    if ((sVarP != null || sVarM != null) && kVar.e.q(sVar10, sVarM)) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            eVarN.remove(animator);
                        }
                    }
                }
                i13--;
                z4 = true;
            }
            mVar.k(viewGroup, mVar.f7004r, mVar.f7005s, mVar.f7008v, mVar.f7009w);
            mVar.w();
            return true;
        }
        arrayList2 = new ArrayList();
        eVarB.put(viewGroup, arrayList2);
        arrayList2.add(mVar);
        mVar.a(new o(this, eVarB));
        i = 0;
        mVar.g(viewGroup, false);
        if (arrayList != null) {
            size2 = arrayList.size();
            i20 = 0;
            while (i20 < size2) {
                Object obj2 = arrayList.get(i20);
                i20++;
                ((m) obj2).v(viewGroup);
            }
        }
        mVar.f7008v = new ArrayList();
        mVar.f7009w = new ArrayList();
        rVar = mVar.f7004r;
        rVar2 = mVar.f7005s;
        eVar = new r.e((r.e) rVar.f4493a);
        eVar2 = new r.e((r.e) rVar2.f4493a);
        i10 = 0;
        while (true) {
            iArr = mVar.f7007u;
            if (i10 < iArr.length) {
                break;
                break;
            }
            i14 = iArr[i10];
            if (i14 != z11) {
                rVar3 = rVar2;
                z10 = z11;
                while (i15 >= 0) {
                    view2 = (View) eVar.f(i15);
                    if (view2 == null) {
                    }
                }
            } else if (i14 != 2) {
                rVar3 = rVar2;
                z10 = z11;
                eVar3 = (r.e) rVar.f4496d;
                r.e eVar5 = (r.e) rVar3.f4496d;
                i16 = eVar3.f8100c;
                while (i17 < i16) {
                    view3 = (View) eVar3.j(i17);
                    if (view3 == null) {
                    }
                }
            } else if (i14 != 3) {
                z10 = z11;
                sparseArray = (SparseArray) rVar.f4494b;
                rVar3 = rVar2;
                SparseArray sparseArray3 = (SparseArray) rVar3.f4494b;
                size = sparseArray.size();
                while (i18 < size) {
                    view5 = (View) sparseArray.valueAt(i18);
                    if (view5 == null) {
                    }
                }
            } else if (i14 != 4) {
                rVar3 = rVar2;
                z10 = z11;
            } else {
                hVar = (r.h) rVar.f4495c;
                r.h hVar3 = (r.h) rVar2.f4495c;
                iG = hVar.g();
                i19 = i;
                while (i19 < iG) {
                    view7 = (View) hVar.h(i19);
                    if (view7 == null) {
                        rVar4 = rVar2;
                    } else {
                        rVar4 = rVar2;
                    }
                    i19++;
                    rVar2 = rVar4;
                    z11 = z11;
                }
                z10 = z11;
                rVar3 = rVar2;
            }
            i10++;
            rVar2 = rVar3;
            z11 = z10;
            i = 0;
        }
        z4 = z11;
        while (i11 < eVar.f8100c) {
            sVar2 = (s) eVar.j(i11);
            if (mVar.r(sVar2.f7024b)) {
                mVar.f7008v.add(sVar2);
                mVar.f7009w.add(null);
            }
        }
        while (i12 < eVar2.f8100c) {
            sVar = (s) eVar2.j(i12);
            if (mVar.r(sVar.f7024b)) {
                mVar.f7009w.add(sVar);
                mVar.f7008v.add(null);
            }
        }
        eVarN = m.n();
        int i22 = eVarN.f8100c;
        v vVar2 = t.f7026a;
        WindowId windowId2 = viewGroup.getWindowId();
        i13 = i22 - 1;
        while (i13 >= 0) {
            animator = (Animator) eVarN.f(i13);
            if (animator == null) {
            }
            i13--;
            z4 = true;
        }
        mVar.k(viewGroup, mVar.f7004r, mVar.f7005s, mVar.f7008v, mVar.f7009w);
        mVar.w();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f7016b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        q.f7019c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) q.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((m) obj).v(viewGroup);
            }
        }
        this.f7015a.h(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
