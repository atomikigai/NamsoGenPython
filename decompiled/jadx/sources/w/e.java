package w;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import x.n;
import x.o;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends d {
    public int A0;
    public b[] B0;
    public b[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final x.b L0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ArrayList f9403q0 = new ArrayList();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final q5.d f9404r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final x.e f9405s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f9406t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public z.e f9407u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f9408v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final u.c f9409w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f9410x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f9411y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f9412z0;

    public e() {
        q5.d dVar = new q5.d();
        dVar.f8039a = new ArrayList();
        dVar.f8040b = new x.b();
        dVar.f8041c = this;
        this.f9404r0 = dVar;
        x.e eVar = new x.e();
        eVar.f9977b = true;
        eVar.f9978c = true;
        eVar.e = new ArrayList();
        new ArrayList();
        eVar.f9980f = null;
        eVar.f9981g = new x.b();
        eVar.h = new ArrayList();
        eVar.f9976a = this;
        eVar.f9979d = this;
        this.f9405s0 = eVar;
        this.f9407u0 = null;
        this.f9408v0 = false;
        this.f9409w0 = new u.c();
        this.f9412z0 = 0;
        this.A0 = 0;
        this.B0 = new b[4];
        this.C0 = new b[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new x.b();
    }

    public static void V(d dVar, z.e eVar, x.b bVar) {
        int i;
        int i10;
        if (eVar == null) {
            return;
        }
        int i11 = dVar.f9377g0;
        int[] iArr = dVar.f9396t;
        if (i11 == 8 || (dVar instanceof h) || (dVar instanceof a)) {
            bVar.e = 0;
            bVar.f9971f = 0;
            return;
        }
        int[] iArr2 = dVar.f9392p0;
        bVar.f9967a = iArr2[0];
        bVar.f9968b = iArr2[1];
        bVar.f9969c = dVar.q();
        bVar.f9970d = dVar.k();
        bVar.i = false;
        bVar.f9973j = 0;
        boolean z4 = bVar.f9967a == 3;
        boolean z10 = bVar.f9968b == 3;
        boolean z11 = z4 && dVar.W > 0.0f;
        boolean z12 = z10 && dVar.W > 0.0f;
        if (z4 && dVar.t(0) && dVar.f9394r == 0 && !z11) {
            bVar.f9967a = 2;
            if (z10 && dVar.f9395s == 0) {
                bVar.f9967a = 1;
            }
            z4 = false;
        }
        if (z10 && dVar.t(1) && dVar.f9395s == 0 && !z12) {
            bVar.f9968b = 2;
            if (z4 && dVar.f9394r == 0) {
                bVar.f9968b = 1;
            }
            z10 = false;
        }
        if (dVar.A()) {
            bVar.f9967a = 1;
            z4 = false;
        }
        if (dVar.B()) {
            bVar.f9968b = 1;
            z10 = false;
        }
        if (z11) {
            if (iArr[0] == 4) {
                bVar.f9967a = 1;
            } else if (!z10) {
                if (bVar.f9968b == 1) {
                    i10 = bVar.f9970d;
                } else {
                    bVar.f9967a = 2;
                    eVar.b(dVar, bVar);
                    i10 = bVar.f9971f;
                }
                bVar.f9967a = 1;
                bVar.f9969c = (int) (dVar.W * i10);
            }
        }
        if (z12) {
            if (iArr[1] == 4) {
                bVar.f9968b = 1;
            } else if (!z4) {
                if (bVar.f9967a == 1) {
                    i = bVar.f9969c;
                } else {
                    bVar.f9968b = 2;
                    eVar.b(dVar, bVar);
                    i = bVar.e;
                }
                bVar.f9968b = 1;
                if (dVar.X == -1) {
                    bVar.f9970d = (int) (i / dVar.W);
                } else {
                    bVar.f9970d = (int) (dVar.W * i);
                }
            }
        }
        eVar.b(dVar, bVar);
        dVar.O(bVar.e);
        dVar.L(bVar.f9971f);
        dVar.E = bVar.h;
        dVar.I(bVar.f9972g);
        bVar.f9973j = 0;
    }

    @Override // w.d
    public final void C() {
        this.f9409w0.t();
        this.f9410x0 = 0;
        this.f9411y0 = 0;
        this.f9403q0.clear();
        super.C();
    }

    @Override // w.d
    public final void F(q5.d dVar) {
        super.F(dVar);
        int size = this.f9403q0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.f9403q0.get(i)).F(dVar);
        }
    }

    @Override // w.d
    public final void P(boolean z4, boolean z10) {
        super.P(z4, z10);
        int size = this.f9403q0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.f9403q0.get(i)).P(z4, z10);
        }
    }

    public final void R(d dVar, int i) {
        if (i == 0) {
            int i10 = this.f9412z0 + 1;
            b[] bVarArr = this.C0;
            if (i10 >= bVarArr.length) {
                this.C0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.C0;
            int i11 = this.f9412z0;
            bVarArr2[i11] = new b(dVar, 0, this.f9408v0);
            this.f9412z0 = i11 + 1;
            return;
        }
        if (i == 1) {
            int i12 = this.A0 + 1;
            b[] bVarArr3 = this.B0;
            if (i12 >= bVarArr3.length) {
                this.B0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.B0;
            int i13 = this.A0;
            bVarArr4[i13] = new b(dVar, 1, this.f9408v0);
            this.A0 = i13 + 1;
        }
    }

    public final void S(u.c cVar) {
        e eVar;
        u.c cVar2;
        boolean zW = W(64);
        b(cVar, zW);
        int size = this.f9403q0.size();
        boolean z4 = false;
        for (int i = 0; i < size; i++) {
            d dVar = (d) this.f9403q0.get(i);
            boolean[] zArr = dVar.S;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof a) {
                z4 = true;
            }
        }
        if (z4) {
            for (int i10 = 0; i10 < size; i10++) {
                d dVar2 = (d) this.f9403q0.get(i10);
                if (dVar2 instanceof a) {
                    a aVar = (a) dVar2;
                    for (int i11 = 0; i11 < aVar.f9444r0; i11++) {
                        d dVar3 = aVar.f9443q0[i11];
                        if (aVar.f9342t0 || dVar3.c()) {
                            int i12 = aVar.f9341s0;
                            if (i12 == 0 || i12 == 1) {
                                dVar3.S[0] = true;
                            } else if (i12 == 2 || i12 == 3) {
                                dVar3.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i13 = 0; i13 < size; i13++) {
            d dVar4 = (d) this.f9403q0.get(i13);
            dVar4.getClass();
            boolean z10 = dVar4 instanceof g;
            if (z10 || (dVar4 instanceof h)) {
                if (z10) {
                    hashSet.add(dVar4);
                } else {
                    dVar4.b(cVar, zW);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                g gVar = (g) ((d) it.next());
                for (int i14 = 0; i14 < gVar.f9444r0; i14++) {
                    if (hashSet.contains(gVar.f9443q0[i14])) {
                        gVar.b(cVar, zW);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).b(cVar, zW);
                }
                hashSet.clear();
            }
        }
        if (u.c.f8724p) {
            HashSet<d> hashSet2 = new HashSet();
            for (int i15 = 0; i15 < size; i15++) {
                d dVar5 = (d) this.f9403q0.get(i15);
                dVar5.getClass();
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    hashSet2.add(dVar5);
                }
            }
            eVar = this;
            cVar2 = cVar;
            eVar.a(this, cVar2, hashSet2, this.f9392p0[0] == 2 ? 0 : 1, false);
            for (d dVar6 : hashSet2) {
                j.b(this, cVar2, dVar6);
                dVar6.b(cVar2, zW);
            }
        } else {
            eVar = this;
            cVar2 = cVar;
            for (int i16 = 0; i16 < size; i16++) {
                d dVar7 = (d) eVar.f9403q0.get(i16);
                if (dVar7 instanceof e) {
                    int[] iArr = dVar7.f9392p0;
                    int i17 = iArr[0];
                    int i18 = iArr[1];
                    if (i17 == 2) {
                        dVar7.M(1);
                    }
                    if (i18 == 2) {
                        dVar7.N(1);
                    }
                    dVar7.b(cVar2, zW);
                    if (i17 == 2) {
                        dVar7.M(i17);
                    }
                    if (i18 == 2) {
                        dVar7.N(i18);
                    }
                } else {
                    j.b(this, cVar2, dVar7);
                    if (!(dVar7 instanceof g) && !(dVar7 instanceof h)) {
                        dVar7.b(cVar2, zW);
                    }
                }
            }
        }
        if (eVar.f9412z0 > 0) {
            j.a(this, cVar2, null, 0);
        }
        if (eVar.A0 > 0) {
            j.a(this, cVar2, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a4 A[PHI: r16
      0x00a4: PHI (r16v3 int) = (r16v0 int), (r16v4 int) binds: [B:32:0x00a1, B:27:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean T(int i, boolean z4) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        x.e eVar = this.f9405s0;
        ArrayList arrayList = eVar.e;
        e eVar2 = eVar.f9976a;
        int iJ = eVar2.j(0);
        int[] iArr = eVar2.f9392p0;
        int iJ2 = eVar2.j(1);
        int iR = eVar2.r();
        int iS = eVar2.s();
        if (z4 && (iJ == 2 || iJ2 == 2)) {
            int size = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    z11 = z4;
                    break;
                }
                Object obj = arrayList.get(i12);
                i12++;
                o oVar = (o) obj;
                if (oVar.f10007f == i && !oVar.k()) {
                    z11 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z11 && iJ == 2) {
                    eVar2.M(1);
                    eVar2.O(eVar.d(eVar2, 0));
                    eVar2.f9371d.e.d(eVar2.q());
                }
            } else if (z11 && iJ2 == 2) {
                eVar2.N(1);
                eVar2.L(eVar.d(eVar2, 1));
                eVar2.e.e.d(eVar2.k());
            }
        }
        if (i == 0) {
            i10 = 0;
            int i13 = iArr[0];
            if (i13 == 1 || i13 == 4) {
                int iQ = eVar2.q() + iR;
                eVar2.f9371d.i.d(iQ);
                eVar2.f9371d.e.d(iQ - iR);
                i11 = 1;
            } else {
                i11 = i10;
            }
        } else {
            i10 = 0;
            int i14 = iArr[1];
            if (i14 == 1 || i14 == 4) {
                int iK = eVar2.k() + iS;
                eVar2.e.i.d(iK);
                eVar2.e.e.d(iK - iS);
                i11 = 1;
            } else {
                i11 = i10;
            }
        }
        eVar.g();
        int size2 = arrayList.size();
        int i15 = i10;
        while (i15 < size2) {
            Object obj2 = arrayList.get(i15);
            i15++;
            o oVar2 = (o) obj2;
            if (oVar2.f10007f == i && (oVar2.f10004b != eVar2 || oVar2.f10008g)) {
                oVar2.e();
            }
        }
        int size3 = arrayList.size();
        int i16 = i10;
        while (i16 < size3) {
            Object obj3 = arrayList.get(i16);
            i16++;
            o oVar3 = (o) obj3;
            if (oVar3.f10007f == i && (i11 != 0 || oVar3.f10004b != eVar2)) {
                if (!oVar3.h.f9988j || !oVar3.i.f9988j || (!(oVar3 instanceof x.c) && !oVar3.e.f9988j)) {
                    z10 = i10;
                    eVar2.M(iJ);
                    eVar2.N(iJ2);
                    return z10;
                }
            }
        }
        z10 = 1;
        eVar2.M(iJ);
        eVar2.N(iJ2);
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:339:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:341:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:349:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:350:0x0602  */
    /* JADX WARN: Code duplicated, block: B:356:0x0616  */
    /* JADX WARN: Code duplicated, block: B:362:0x062f  */
    /* JADX WARN: Code duplicated, block: B:365:0x0635  */
    /* JADX WARN: Code duplicated, block: B:367:0x063d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:370:0x064b  */
    /* JADX WARN: Code duplicated, block: B:376:0x065b  */
    /* JADX WARN: Code duplicated, block: B:380:0x0666  */
    /* JADX WARN: Code duplicated, block: B:383:0x0671 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:385:0x0677  */
    /* JADX WARN: Code duplicated, block: B:388:0x067f  */
    /* JADX WARN: Code duplicated, block: B:392:0x0686  */
    /* JADX WARN: Code duplicated, block: B:395:0x0690  */
    /* JADX WARN: Code duplicated, block: B:397:0x069c  */
    /* JADX WARN: Code duplicated, block: B:401:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:404:0x06bf A[Catch: Exception -> 0x06cd, LOOP:12: B:403:0x06bd->B:404:0x06bf, LOOP_END, TryCatch #3 {Exception -> 0x06cd, blocks: (B:402:0x06b1, B:404:0x06bf, B:407:0x06d6), top: B:538:0x06b1 }] */
    /* JADX WARN: Code duplicated, block: B:412:0x06e3 A[Catch: Exception -> 0x070c, TRY_LEAVE, TryCatch #4 {Exception -> 0x070c, blocks: (B:410:0x06dd, B:412:0x06e3), top: B:540:0x06dd }] */
    /* JADX WARN: Code duplicated, block: B:428:0x0710  */
    /* JADX WARN: Code duplicated, block: B:431:0x0718 A[Catch: Exception -> 0x0700, TryCatch #0 {Exception -> 0x0700, blocks: (B:417:0x06f9, B:429:0x0714, B:431:0x0718, B:433:0x071e, B:434:0x0738, B:436:0x073c, B:438:0x0742, B:442:0x0758, B:445:0x0763, B:447:0x0767, B:449:0x076d), top: B:532:0x06f9 }] */
    /* JADX WARN: Code duplicated, block: B:436:0x073c A[Catch: Exception -> 0x0700, TryCatch #0 {Exception -> 0x0700, blocks: (B:417:0x06f9, B:429:0x0714, B:431:0x0718, B:433:0x071e, B:434:0x0738, B:436:0x073c, B:438:0x0742, B:442:0x0758, B:445:0x0763, B:447:0x0767, B:449:0x076d), top: B:532:0x06f9 }] */
    /* JADX WARN: Code duplicated, block: B:447:0x0767 A[Catch: Exception -> 0x0700, TryCatch #0 {Exception -> 0x0700, blocks: (B:417:0x06f9, B:429:0x0714, B:431:0x0718, B:433:0x071e, B:434:0x0738, B:436:0x073c, B:438:0x0742, B:442:0x0758, B:445:0x0763, B:447:0x0767, B:449:0x076d), top: B:532:0x06f9 }] */
    /* JADX WARN: Code duplicated, block: B:461:0x0792  */
    /* JADX WARN: Code duplicated, block: B:469:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:471:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:473:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:475:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:478:0x0800  */
    /* JADX WARN: Code duplicated, block: B:480:0x0809 A[LOOP:15: B:479:0x0807->B:480:0x0809, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:484:0x081d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:489:0x082a A[LOOP:14: B:488:0x0828->B:489:0x082a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:492:0x085e  */
    /* JADX WARN: Code duplicated, block: B:496:0x0871  */
    /* JADX WARN: Code duplicated, block: B:501:0x0892  */
    /* JADX WARN: Code duplicated, block: B:502:0x089f  */
    /* JADX WARN: Code duplicated, block: B:505:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:506:0x08bb  */
    /* JADX WARN: Code duplicated, block: B:508:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:510:0x08c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:513:0x08ce  */
    /* JADX WARN: Code duplicated, block: B:516:0x08dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:522:0x08f4  */
    /* JADX WARN: Code duplicated, block: B:524:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:525:0x08fa  */
    /* JADX WARN: Code duplicated, block: B:529:0x090b  */
    /* JADX WARN: Code duplicated, block: B:540:0x06dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:0x06a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0127  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r32v0, types: [w.d, w.e] */
    /* JADX WARN: Type inference failed for: r4v55, types: [int] */
    /* JADX WARN: Type inference failed for: r5v57, types: [int] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v74, types: [int] */
    /* JADX WARN: Type inference failed for: r7v22, types: [int] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [boolean] */
    public final void U() {
        ?? r22;
        int i;
        int i10;
        int i11;
        int i12;
        c cVar;
        c cVar2;
        int i13;
        boolean z4;
        boolean z10;
        char c10;
        boolean z11;
        int i14;
        int i15;
        boolean zW;
        ?? r12;
        int i16;
        boolean z12;
        boolean z13;
        int i17;
        c cVar3;
        boolean z14;
        boolean z15;
        boolean[] zArr;
        boolean[] zArr2;
        int i18;
        boolean z16;
        int iMax;
        ?? r10;
        ?? r18;
        boolean z17;
        int iMax2;
        ?? r11;
        boolean z18;
        boolean z19;
        ?? r13;
        boolean z20;
        ?? r14;
        boolean z21;
        boolean z22;
        ?? r15;
        ?? r16;
        int i19;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        boolean zW2;
        int size;
        int i20;
        boolean z23;
        d dVar;
        boolean z24;
        int i21;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        c cVar4;
        d dVar2;
        int i22;
        int i23;
        int i24;
        int i25;
        char c11;
        n nVar;
        n nVar2;
        int i26;
        int iQ;
        int i27;
        int iK;
        int size2;
        int i28;
        int i29;
        n nVar3;
        int iB;
        int iB2;
        n nVar4;
        n nVar5;
        int i30;
        boolean z25;
        this.Y = 0;
        this.Z = 0;
        this.E0 = false;
        this.F0 = false;
        int size3 = this.f9403q0.size();
        int iMax7 = Math.max(0, q());
        int iMax8 = Math.max(0, k());
        int[] iArr = this.f9392p0;
        int i31 = iArr[1];
        int i32 = iArr[0];
        int i33 = this.f9406t0;
        c cVar5 = this.J;
        c cVar6 = this.I;
        if (i33 == 0 && j.c(this.D0, 1)) {
            z.e eVar = this.f9407u0;
            int i34 = iArr[0];
            int i35 = iArr[1];
            E();
            ArrayList arrayList = this.f9403q0;
            int size4 = arrayList.size();
            for (int i36 = 0; i36 < size4; i36++) {
                ((d) arrayList.get(i36)).E();
            }
            boolean z26 = this.f9408v0;
            if (i34 == 1) {
                J(0, q());
            } else {
                cVar6.l(0);
                this.Y = 0;
            }
            int i37 = 0;
            boolean z27 = false;
            boolean z28 = false;
            while (i37 < size4) {
                int[] iArr2 = iArr;
                d dVar3 = (d) arrayList.get(i37);
                int i38 = i37;
                if (dVar3 instanceof h) {
                    h hVar = (h) dVar3;
                    z25 = z27;
                    if (hVar.f9441u0 == 1) {
                        int i39 = hVar.f9438r0;
                        if (i39 != -1) {
                            hVar.R(i39);
                        } else if (hVar.f9439s0 != -1 && A()) {
                            hVar.R(q() - hVar.f9439s0);
                        } else if (A()) {
                            hVar.R((int) ((hVar.f9437q0 * q()) + 0.5f));
                        }
                        z25 = true;
                    }
                } else {
                    z25 = z27;
                    if ((dVar3 instanceof a) && ((a) dVar3).U() == 0) {
                        z27 = z25;
                        z28 = true;
                    }
                    i37 = i38 + 1;
                    iArr = iArr2;
                }
                z27 = z25;
                i37 = i38 + 1;
                iArr = iArr2;
            }
            r22 = iArr;
            if (z27) {
                for (int i40 = 0; i40 < size4; i40 = i30 + 1) {
                    d dVar4 = (d) arrayList.get(i40);
                    if (dVar4 instanceof h) {
                        h hVar2 = (h) dVar4;
                        i30 = i40;
                        if (hVar2.f9441u0 == 1) {
                            x.h.c(0, hVar2, eVar, z26);
                        }
                    } else {
                        i30 = i40;
                    }
                }
            }
            x.h.c(0, this, eVar, z26);
            if (z28) {
                for (int i41 = 0; i41 < size4; i41++) {
                    d dVar5 = (d) arrayList.get(i41);
                    if (dVar5 instanceof a) {
                        a aVar = (a) dVar5;
                        if (aVar.U() == 0 && aVar.T()) {
                            x.h.c(1, aVar, eVar, z26);
                        }
                    }
                }
            }
            if (i35 == 1) {
                K(0, k());
            } else {
                cVar5.l(0);
                this.Z = 0;
            }
            int i42 = 0;
            boolean z29 = false;
            boolean z30 = false;
            while (i42 < size4) {
                d dVar6 = (d) arrayList.get(i42);
                int i43 = i42;
                if (dVar6 instanceof h) {
                    h hVar3 = (h) dVar6;
                    if (hVar3.f9441u0 == 0) {
                        int i44 = hVar3.f9438r0;
                        if (i44 != -1) {
                            hVar3.R(i44);
                        } else if (hVar3.f9439s0 != -1 && B()) {
                            hVar3.R(k() - hVar3.f9439s0);
                        } else if (B()) {
                            hVar3.R((int) ((hVar3.f9437q0 * k()) + 0.5f));
                        }
                        z29 = true;
                    }
                } else if ((dVar6 instanceof a) && ((a) dVar6).U() == 1) {
                    z30 = true;
                }
                i42 = i43 + 1;
            }
            if (z29) {
                for (int i45 = 0; i45 < size4; i45++) {
                    d dVar7 = (d) arrayList.get(i45);
                    if (dVar7 instanceof h) {
                        h hVar4 = (h) dVar7;
                        if (hVar4.f9441u0 == 0) {
                            x.h.i(1, hVar4, eVar);
                        }
                    }
                }
            }
            x.h.i(0, this, eVar);
            if (z30) {
                for (int i46 = 0; i46 < size4; i46++) {
                    d dVar8 = (d) arrayList.get(i46);
                    if (dVar8 instanceof a) {
                        a aVar2 = (a) dVar8;
                        if (aVar2.U() == 1 && aVar2.T()) {
                            x.h.i(1, aVar2, eVar);
                        }
                    }
                }
            }
            for (int i47 = 0; i47 < size4; i47++) {
                d dVar9 = (d) arrayList.get(i47);
                if (dVar9.z() && x.h.a(dVar9)) {
                    V(dVar9, eVar, x.h.f9992a);
                    if (!(dVar9 instanceof h)) {
                        x.h.c(0, dVar9, eVar, z26);
                        x.h.i(0, dVar9, eVar);
                    } else if (((h) dVar9).f9441u0 == 0) {
                        x.h.i(0, dVar9, eVar);
                    } else {
                        x.h.c(0, dVar9, eVar, z26);
                    }
                }
            }
            for (int i48 = 0; i48 < size3; i48++) {
                d dVar10 = (d) this.f9403q0.get(i48);
                if (dVar10.z() && !(dVar10 instanceof h) && !(dVar10 instanceof a) && !(dVar10 instanceof g) && !dVar10.F) {
                    int iJ = dVar10.j(0);
                    int iJ2 = dVar10.j(1);
                    if (iJ != 3 || dVar10.f9394r == 1 || iJ2 != 3 || dVar10.f9395s == 1) {
                        V(dVar10, this.f9407u0, new x.b());
                    }
                }
            }
        } else {
            r22 = iArr;
        }
        u.c cVar7 = this.f9409w0;
        if (size3 <= 2 || !((i32 == 2 || i31 == 2) && j.c(this.D0, 1024))) {
            i = size3;
            i10 = iMax8;
            i11 = i31;
            i12 = i32;
            cVar = cVar5;
            cVar2 = cVar6;
            i13 = iMax7;
        } else {
            z.e eVar2 = this.f9407u0;
            ArrayList arrayList2 = this.f9403q0;
            int size5 = arrayList2.size();
            int i49 = 0;
            while (true) {
                if (i49 < size5) {
                    d dVar11 = (d) arrayList2.get(i49);
                    ?? r17 = r22[0];
                    ?? r19 = r22[1];
                    int i50 = i49;
                    int[] iArr3 = dVar11.f9392p0;
                    cVar2 = cVar6;
                    if (x.h.h(r17, r19, iArr3[0], iArr3[1]) && !(dVar11 instanceof g)) {
                        i49 = i50 + 1;
                        cVar6 = cVar2;
                    } else {
                        i22 = iMax7;
                        i = size3;
                        i23 = iMax8;
                        i24 = i31;
                        i25 = i32;
                        cVar = cVar5;
                    }
                } else {
                    cVar2 = cVar6;
                    i = size3;
                    cVar = cVar5;
                    int i51 = 0;
                    ArrayList arrayList3 = null;
                    ArrayList arrayList4 = null;
                    ArrayList arrayList5 = null;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    while (i51 < size5) {
                        int i52 = i51;
                        d dVar12 = (d) arrayList2.get(i51);
                        int i53 = iMax8;
                        ?? r20 = r22[0];
                        int i54 = i31;
                        ?? r21 = r22[1];
                        int i55 = iMax7;
                        int[] iArr4 = dVar12.f9392p0;
                        int i56 = i32;
                        if (!x.h.h(r20, r21, iArr4[0], iArr4[1])) {
                            V(dVar12, eVar2, this.L0);
                        }
                        boolean z31 = dVar12 instanceof h;
                        if (z31) {
                            h hVar5 = (h) dVar12;
                            if (hVar5.f9441u0 == 0) {
                                if (arrayList7 == null) {
                                    arrayList7 = new ArrayList();
                                }
                                arrayList7.add(hVar5);
                            }
                            if (hVar5.f9441u0 == 1) {
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                }
                                arrayList4.add(hVar5);
                            }
                        }
                        if (dVar12 instanceof i) {
                            if (dVar12 instanceof a) {
                                a aVar3 = (a) dVar12;
                                if (aVar3.U() == 0) {
                                    if (arrayList5 == null) {
                                        arrayList5 = new ArrayList();
                                    }
                                    arrayList5.add(aVar3);
                                }
                                if (aVar3.U() == 1) {
                                    if (arrayList8 == null) {
                                        arrayList8 = new ArrayList();
                                    }
                                    arrayList8.add(aVar3);
                                }
                            } else {
                                i iVar = (i) dVar12;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(iVar);
                                if (arrayList8 == null) {
                                    arrayList8 = new ArrayList();
                                }
                                arrayList8.add(iVar);
                            }
                        }
                        if (dVar12.I.f9363f == null && dVar12.K.f9363f == null && !z31 && !(dVar12 instanceof a)) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(dVar12);
                        }
                        if (dVar12.J.f9363f == null && dVar12.L.f9363f == null && dVar12.M.f9363f == null && !z31 && !(dVar12 instanceof a)) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(dVar12);
                        }
                        i51 = i52 + 1;
                        iMax8 = i53;
                        i31 = i54;
                        iMax7 = i55;
                        i32 = i56;
                    }
                    i22 = iMax7;
                    i23 = iMax8;
                    i24 = i31;
                    i25 = i32;
                    ArrayList arrayList9 = new ArrayList();
                    if (arrayList4 != null) {
                        int size6 = arrayList4.size();
                        int i57 = 0;
                        while (i57 < size6) {
                            Object obj = arrayList4.get(i57);
                            i57++;
                            x.h.b((h) obj, 0, arrayList9, null);
                        }
                    }
                    if (arrayList5 != null) {
                        int size7 = arrayList5.size();
                        int i58 = 0;
                        while (i58 < size7) {
                            Object obj2 = arrayList5.get(i58);
                            i58++;
                            i iVar2 = (i) obj2;
                            n nVarB = x.h.b(iVar2, 0, arrayList9, null);
                            iVar2.R(0, arrayList9, nVarB);
                            nVarB.a(arrayList9);
                        }
                    }
                    HashSet hashSet = i(2).f9359a;
                    if (hashSet != null) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            x.h.b(((c) it.next()).f9362d, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet2 = i(4).f9359a;
                    if (hashSet2 != null) {
                        Iterator it2 = hashSet2.iterator();
                        while (it2.hasNext()) {
                            x.h.b(((c) it2.next()).f9362d, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet3 = i(7).f9359a;
                    if (hashSet3 != null) {
                        Iterator it3 = hashSet3.iterator();
                        while (it3.hasNext()) {
                            x.h.b(((c) it3.next()).f9362d, 0, arrayList9, null);
                        }
                    }
                    if (arrayList6 != null) {
                        int size8 = arrayList6.size();
                        int i59 = 0;
                        while (i59 < size8) {
                            Object obj3 = arrayList6.get(i59);
                            i59++;
                            x.h.b((d) obj3, 0, arrayList9, null);
                        }
                    }
                    if (arrayList7 != null) {
                        int size9 = arrayList7.size();
                        int i60 = 0;
                        while (i60 < size9) {
                            Object obj4 = arrayList7.get(i60);
                            i60++;
                            x.h.b((h) obj4, 1, arrayList9, null);
                        }
                    }
                    if (arrayList8 != null) {
                        int size10 = arrayList8.size();
                        int i61 = 0;
                        while (i61 < size10) {
                            Object obj5 = arrayList8.get(i61);
                            i61++;
                            i iVar3 = (i) obj5;
                            n nVarB2 = x.h.b(iVar3, 1, arrayList9, null);
                            iVar3.R(1, arrayList9, nVarB2);
                            nVarB2.a(arrayList9);
                        }
                    }
                    HashSet hashSet4 = i(3).f9359a;
                    if (hashSet4 != null) {
                        Iterator it4 = hashSet4.iterator();
                        while (it4.hasNext()) {
                            x.h.b(((c) it4.next()).f9362d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet5 = i(6).f9359a;
                    if (hashSet5 != null) {
                        Iterator it5 = hashSet5.iterator();
                        while (it5.hasNext()) {
                            x.h.b(((c) it5.next()).f9362d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet6 = i(5).f9359a;
                    if (hashSet6 != null) {
                        Iterator it6 = hashSet6.iterator();
                        while (it6.hasNext()) {
                            x.h.b(((c) it6.next()).f9362d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet7 = i(7).f9359a;
                    if (hashSet7 != null) {
                        Iterator it7 = hashSet7.iterator();
                        while (it7.hasNext()) {
                            x.h.b(((c) it7.next()).f9362d, 1, arrayList9, null);
                        }
                    }
                    if (arrayList3 != null) {
                        int size11 = arrayList3.size();
                        int i62 = 0;
                        while (i62 < size11) {
                            Object obj6 = arrayList3.get(i62);
                            i62++;
                            x.h.b((d) obj6, 1, arrayList9, null);
                        }
                    }
                    char c12 = 1;
                    int i63 = 0;
                    while (i63 < size5) {
                        d dVar13 = (d) arrayList2.get(i63);
                        int[] iArr5 = dVar13.f9392p0;
                        if (iArr5[0] == 3 && iArr5[c12] == 3) {
                            int i64 = dVar13.f9388n0;
                            int size12 = arrayList9.size();
                            int i65 = 0;
                            while (true) {
                                if (i65 >= size12) {
                                    nVar4 = null;
                                    break;
                                }
                                nVar4 = (n) arrayList9.get(i65);
                                if (i64 == nVar4.f10000b) {
                                    break;
                                } else {
                                    i65++;
                                }
                            }
                            int i66 = dVar13.f9390o0;
                            int size13 = arrayList9.size();
                            int i67 = 0;
                            while (true) {
                                if (i67 >= size13) {
                                    nVar5 = null;
                                    break;
                                }
                                nVar5 = (n) arrayList9.get(i67);
                                if (i66 == nVar5.f10000b) {
                                    break;
                                } else {
                                    i67++;
                                }
                            }
                            if (nVar4 != null && nVar5 != null) {
                                nVar4.c(0, nVar5);
                                nVar5.f10001c = 2;
                                arrayList9.remove(nVar4);
                            }
                        }
                        i63++;
                        c12 = 1;
                    }
                    if (arrayList9.size() > 1) {
                        if (r22[0] == 2) {
                            int size14 = arrayList9.size();
                            int i68 = 0;
                            int i69 = 0;
                            nVar = null;
                            while (i69 < size14) {
                                Object obj7 = arrayList9.get(i69);
                                i69++;
                                n nVar6 = (n) obj7;
                                if (nVar6.f10001c != 1 && (iB2 = nVar6.b(cVar7, 0)) > i68) {
                                    nVar = nVar6;
                                    i68 = iB2;
                                }
                            }
                            c11 = 1;
                            if (nVar != null) {
                                M(1);
                                O(i68);
                            }
                            if (r22[c11] == 2) {
                                size2 = arrayList9.size();
                                i28 = 0;
                                i29 = 0;
                                nVar2 = null;
                                while (i29 < size2) {
                                    Object obj8 = arrayList9.get(i29);
                                    i29++;
                                    nVar3 = (n) obj8;
                                    if (nVar3.f10001c != 0 && (iB = nVar3.b(cVar7, 1)) > i28) {
                                        nVar2 = nVar3;
                                        i28 = iB;
                                    }
                                }
                                if (nVar2 != null) {
                                    N(1);
                                    L(i28);
                                } else {
                                    nVar2 = null;
                                }
                            } else {
                                nVar2 = null;
                            }
                            if (nVar == null || nVar2 != null) {
                                i12 = i25;
                                if (i12 == 2) {
                                    i26 = i22;
                                    if (i26 < q() || i26 <= 0) {
                                        iQ = q();
                                    } else {
                                        O(i26);
                                        this.E0 = true;
                                    }
                                    i11 = i24;
                                    if (i11 == 2) {
                                        i27 = i23;
                                        if (i27 < k() || i27 <= 0) {
                                            iK = k();
                                        } else {
                                            L(i27);
                                            this.F0 = true;
                                        }
                                        i10 = iK;
                                        i13 = iQ;
                                        z4 = true;
                                    } else {
                                        i27 = i23;
                                    }
                                    iK = i27;
                                    i10 = iK;
                                    i13 = iQ;
                                    z4 = true;
                                } else {
                                    i26 = i22;
                                }
                                iQ = i26;
                                i11 = i24;
                                if (i11 == 2) {
                                    i27 = i23;
                                    if (i27 < k()) {
                                    }
                                    iK = k();
                                    i10 = iK;
                                    i13 = iQ;
                                    z4 = true;
                                } else {
                                    i27 = i23;
                                }
                                iK = i27;
                                i10 = iK;
                                i13 = iQ;
                                z4 = true;
                            }
                            if (!W(64) || W(128)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            cVar7.getClass();
                            cVar7.f8731g = false;
                            if (this.D0 == 0 && z10) {
                                c10 = 1;
                                cVar7.f8731g = true;
                            } else {
                                c10 = 1;
                            }
                            ArrayList arrayList10 = this.f9403q0;
                            if (r22[0] != 2 || r22[c10] == 2) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.f9412z0 = 0;
                            this.A0 = 0;
                            i14 = i;
                            for (i15 = 0; i15 < i14; i15++) {
                                dVar2 = (d) this.f9403q0.get(i15);
                                if (dVar2 instanceof e) {
                                    ((e) dVar2).U();
                                }
                            }
                            zW = W(64);
                            r12 = z4;
                            i16 = 0;
                            z12 = true;
                            while (z12) {
                                i17 = i16 + 1;
                                try {
                                    cVar7.t();
                                    this.f9412z0 = 0;
                                    this.A0 = 0;
                                    g(cVar7);
                                    for (i21 = 0; i21 < i14; i21++) {
                                        ((d) this.f9403q0.get(i21)).g(cVar7);
                                    }
                                    S(cVar7);
                                    try {
                                        weakReference = this.G0;
                                        if (weakReference != null) {
                                            try {
                                                if (weakReference.get() != null) {
                                                    cVar3 = cVar;
                                                    try {
                                                        try {
                                                            z14 = z11;
                                                            try {
                                                                cVar7.f(cVar7.k((c) this.G0.get()), cVar7.k(cVar3), 0, 5);
                                                                this.G0 = null;
                                                            } catch (Exception e) {
                                                                e = e;
                                                                z24 = true;
                                                                e.printStackTrace();
                                                                System.out.println("EXCEPTION : " + e);
                                                                z15 = z24;
                                                                zArr = j.f9445a;
                                                                if (z15) {
                                                                    zArr[2] = false;
                                                                    zW2 = W(64);
                                                                    Q(cVar7, zW2);
                                                                    size = this.f9403q0.size();
                                                                    i20 = 0;
                                                                    z23 = false;
                                                                    while (i20 < size) {
                                                                        dVar = (d) this.f9403q0.get(i20);
                                                                        dVar.Q(cVar7, zW2);
                                                                        boolean[] zArr3 = zArr;
                                                                        boolean z32 = zW2;
                                                                        if (dVar.h == -1) {
                                                                            z23 = true;
                                                                        } else {
                                                                            z23 = true;
                                                                        }
                                                                        i20++;
                                                                        zArr = zArr3;
                                                                        zW2 = z32;
                                                                        z23 = z23;
                                                                    }
                                                                    zArr2 = zArr;
                                                                    z16 = z23;
                                                                } else {
                                                                    zArr2 = zArr;
                                                                    Q(cVar7, zW);
                                                                    for (i18 = 0; i18 < i14; i18++) {
                                                                        ((d) this.f9403q0.get(i18)).Q(cVar7, zW);
                                                                    }
                                                                    z16 = false;
                                                                }
                                                                if (z14) {
                                                                    iMax3 = 0;
                                                                    iMax4 = 0;
                                                                    for (i19 = 0; i19 < i14; i19++) {
                                                                        d dVar14 = (d) this.f9403q0.get(i19);
                                                                        iMax3 = Math.max(iMax3, dVar14.q() + dVar14.Y);
                                                                        iMax4 = Math.max(iMax4, dVar14.k() + dVar14.Z);
                                                                    }
                                                                    iMax5 = Math.max(this.f9368b0, iMax3);
                                                                    iMax6 = Math.max(this.f9370c0, iMax4);
                                                                    z16 = z16;
                                                                    r12 = r12;
                                                                    if (i12 == 2) {
                                                                        z16 = z16;
                                                                        r12 = r12;
                                                                        O(iMax5);
                                                                        r22[0] = 2;
                                                                        z16 = true;
                                                                        r12 = 1;
                                                                    }
                                                                    if (i11 == 2) {
                                                                        L(iMax6);
                                                                        r22[1] = 2;
                                                                        z16 = true;
                                                                        r12 = 1;
                                                                    }
                                                                }
                                                                iMax = Math.max(this.f9368b0, q());
                                                                if (iMax > q()) {
                                                                    O(iMax);
                                                                    r10 = 1;
                                                                    r22[0] = 1;
                                                                    z17 = true;
                                                                    r18 = 1;
                                                                } else {
                                                                    r10 = 1;
                                                                    r18 = r12;
                                                                    z17 = z16;
                                                                }
                                                                iMax2 = Math.max(this.f9370c0, k());
                                                                if (iMax2 > k()) {
                                                                    L(iMax2);
                                                                    r22[r10] = r10;
                                                                    r16 = r10;
                                                                    z18 = r16 == true ? 1 : 0;
                                                                } else {
                                                                    r11 = r18;
                                                                }
                                                                if (r11 == 0) {
                                                                    z18 = z17;
                                                                    if (r22[0] == 2) {
                                                                        r15 = r11;
                                                                        z22 = z18;
                                                                        if (q() > i13) {
                                                                            this.E0 = r10;
                                                                            r22[0] = r10;
                                                                            O(i13);
                                                                            ?? r23 = r10;
                                                                            z22 = r23 == true ? 1 : 0;
                                                                            r15 = r23;
                                                                        }
                                                                    }
                                                                    r11 = r16;
                                                                    r15 = r11;
                                                                    r15 = r11;
                                                                    z22 = z18;
                                                                    z22 = z18;
                                                                    r13 = r15;
                                                                    r13 = r15;
                                                                    z19 = z22;
                                                                    z19 = z22;
                                                                    if (r22[r10] != 2) {
                                                                    }
                                                                    if (i17 > 8) {
                                                                        z21 = false;
                                                                    } else {
                                                                        z21 = z20;
                                                                    }
                                                                    r12 = r14;
                                                                    i16 = i17;
                                                                    z11 = z14;
                                                                    cVar = cVar3;
                                                                    z12 = z21;
                                                                } else {
                                                                    z18 = z17;
                                                                    r11 = r16;
                                                                    r13 = r11;
                                                                    z19 = z18;
                                                                }
                                                                r13 = r15;
                                                                z19 = z22;
                                                                z20 = z19;
                                                                r14 = r13;
                                                                if (i17 > 8) {
                                                                    z21 = false;
                                                                } else {
                                                                    z21 = z20;
                                                                }
                                                                r12 = r14;
                                                                i16 = i17;
                                                                z11 = z14;
                                                                cVar = cVar3;
                                                                z12 = z21;
                                                            }
                                                        } catch (Exception e4) {
                                                            e = e4;
                                                            z14 = z11;
                                                            z24 = true;
                                                            e.printStackTrace();
                                                            System.out.println("EXCEPTION : " + e);
                                                            z15 = z24;
                                                            zArr = j.f9445a;
                                                            if (z15) {
                                                                zArr[2] = false;
                                                                zW2 = W(64);
                                                                Q(cVar7, zW2);
                                                                size = this.f9403q0.size();
                                                                i20 = 0;
                                                                z23 = false;
                                                                while (i20 < size) {
                                                                    dVar = (d) this.f9403q0.get(i20);
                                                                    dVar.Q(cVar7, zW2);
                                                                    boolean[] zArr4 = zArr;
                                                                    boolean z33 = zW2;
                                                                    if (dVar.h == -1) {
                                                                        z23 = true;
                                                                    } else {
                                                                        z23 = true;
                                                                    }
                                                                    i20++;
                                                                    zArr = zArr4;
                                                                    zW2 = z33;
                                                                    z23 = z23;
                                                                }
                                                                zArr2 = zArr;
                                                                z16 = z23;
                                                            } else {
                                                                zArr2 = zArr;
                                                                Q(cVar7, zW);
                                                                while (i18 < i14) {
                                                                    ((d) this.f9403q0.get(i18)).Q(cVar7, zW);
                                                                }
                                                                z16 = false;
                                                            }
                                                            if (z14) {
                                                                iMax3 = 0;
                                                                iMax4 = 0;
                                                                while (i19 < i14) {
                                                                    d dVar15 = (d) this.f9403q0.get(i19);
                                                                    iMax3 = Math.max(iMax3, dVar15.q() + dVar15.Y);
                                                                    iMax4 = Math.max(iMax4, dVar15.k() + dVar15.Z);
                                                                }
                                                                iMax5 = Math.max(this.f9368b0, iMax3);
                                                                iMax6 = Math.max(this.f9370c0, iMax4);
                                                                z16 = z16;
                                                                r12 = r12;
                                                                if (i12 == 2) {
                                                                    z16 = z16;
                                                                    r12 = r12;
                                                                    O(iMax5);
                                                                    r22[0] = 2;
                                                                    z16 = true;
                                                                    r12 = 1;
                                                                }
                                                                if (i11 == 2) {
                                                                    L(iMax6);
                                                                    r22[1] = 2;
                                                                    z16 = true;
                                                                    r12 = 1;
                                                                }
                                                            }
                                                            iMax = Math.max(this.f9368b0, q());
                                                            if (iMax > q()) {
                                                                O(iMax);
                                                                r10 = 1;
                                                                r22[0] = 1;
                                                                z17 = true;
                                                                r18 = 1;
                                                            } else {
                                                                r10 = 1;
                                                                r18 = r12;
                                                                z17 = z16;
                                                            }
                                                            iMax2 = Math.max(this.f9370c0, k());
                                                            if (iMax2 > k()) {
                                                                L(iMax2);
                                                                r22[r10] = r10;
                                                                r16 = r10;
                                                                z18 = r16 == true ? 1 : 0;
                                                            } else {
                                                                r11 = r18;
                                                            }
                                                            if (r11 == 0) {
                                                                z18 = z17;
                                                                if (r22[0] == 2) {
                                                                    r15 = r11;
                                                                    z22 = z18;
                                                                    if (q() > i13) {
                                                                        this.E0 = r10;
                                                                        r22[0] = r10;
                                                                        O(i13);
                                                                        ?? r24 = r10;
                                                                        z22 = r24 == true ? 1 : 0;
                                                                        r15 = r24;
                                                                    }
                                                                }
                                                                r11 = r16;
                                                                r15 = r11;
                                                                r15 = r11;
                                                                z22 = z18;
                                                                z22 = z18;
                                                                r13 = r15;
                                                                r13 = r15;
                                                                z19 = z22;
                                                                z19 = z22;
                                                                if (r22[r10] != 2) {
                                                                }
                                                                if (i17 > 8) {
                                                                    z21 = false;
                                                                } else {
                                                                    z21 = z20;
                                                                }
                                                                r12 = r14;
                                                                i16 = i17;
                                                                z11 = z14;
                                                                cVar = cVar3;
                                                                z12 = z21;
                                                            } else {
                                                                z18 = z17;
                                                                r11 = r16;
                                                                r13 = r11;
                                                                z19 = z18;
                                                            }
                                                            r13 = r15;
                                                            z19 = z22;
                                                            z20 = z19;
                                                            r14 = r13;
                                                            if (i17 > 8) {
                                                                z21 = false;
                                                            } else {
                                                                z21 = z20;
                                                            }
                                                            r12 = r14;
                                                            i16 = i17;
                                                            z11 = z14;
                                                            cVar = cVar3;
                                                            z12 = z21;
                                                        }
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                    }
                                                } else {
                                                    cVar3 = cVar;
                                                    z14 = z11;
                                                }
                                                weakReference2 = this.I0;
                                                if (weakReference2 != null && weakReference2.get() != null) {
                                                    cVar7.f(cVar7.k(this.L), cVar7.k((c) this.I0.get()), 0, 5);
                                                    this.I0 = null;
                                                }
                                                weakReference3 = this.H0;
                                                if (weakReference3 != null && weakReference3.get() != null) {
                                                    cVar4 = cVar2;
                                                    try {
                                                        cVar2 = cVar4;
                                                        cVar7.f(cVar7.k((c) this.H0.get()), cVar7.k(cVar4), 0, 5);
                                                        this.H0 = null;
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        cVar2 = cVar4;
                                                        z24 = true;
                                                        e.printStackTrace();
                                                        System.out.println("EXCEPTION : " + e);
                                                        z15 = z24;
                                                        zArr = j.f9445a;
                                                        if (z15) {
                                                            zArr[2] = false;
                                                            zW2 = W(64);
                                                            Q(cVar7, zW2);
                                                            size = this.f9403q0.size();
                                                            i20 = 0;
                                                            z23 = false;
                                                            while (i20 < size) {
                                                                dVar = (d) this.f9403q0.get(i20);
                                                                dVar.Q(cVar7, zW2);
                                                                boolean[] zArr5 = zArr;
                                                                boolean z34 = zW2;
                                                                if (dVar.h == -1) {
                                                                    z23 = true;
                                                                } else {
                                                                    z23 = true;
                                                                }
                                                                i20++;
                                                                zArr = zArr5;
                                                                zW2 = z34;
                                                                z23 = z23;
                                                            }
                                                            zArr2 = zArr;
                                                            z16 = z23;
                                                        } else {
                                                            zArr2 = zArr;
                                                            Q(cVar7, zW);
                                                            while (i18 < i14) {
                                                                ((d) this.f9403q0.get(i18)).Q(cVar7, zW);
                                                            }
                                                            z16 = false;
                                                        }
                                                        if (z14) {
                                                            iMax3 = 0;
                                                            iMax4 = 0;
                                                            while (i19 < i14) {
                                                                d dVar16 = (d) this.f9403q0.get(i19);
                                                                iMax3 = Math.max(iMax3, dVar16.q() + dVar16.Y);
                                                                iMax4 = Math.max(iMax4, dVar16.k() + dVar16.Z);
                                                            }
                                                            iMax5 = Math.max(this.f9368b0, iMax3);
                                                            iMax6 = Math.max(this.f9370c0, iMax4);
                                                            z16 = z16;
                                                            r12 = r12;
                                                            if (i12 == 2) {
                                                                z16 = z16;
                                                                r12 = r12;
                                                                O(iMax5);
                                                                r22[0] = 2;
                                                                z16 = true;
                                                                r12 = 1;
                                                            }
                                                            if (i11 == 2) {
                                                                L(iMax6);
                                                                r22[1] = 2;
                                                                z16 = true;
                                                                r12 = 1;
                                                            }
                                                        }
                                                        iMax = Math.max(this.f9368b0, q());
                                                        if (iMax > q()) {
                                                            O(iMax);
                                                            r10 = 1;
                                                            r22[0] = 1;
                                                            z17 = true;
                                                            r18 = 1;
                                                        } else {
                                                            r10 = 1;
                                                            r18 = r12;
                                                            z17 = z16;
                                                        }
                                                        iMax2 = Math.max(this.f9370c0, k());
                                                        if (iMax2 > k()) {
                                                            L(iMax2);
                                                            r22[r10] = r10;
                                                            r16 = r10;
                                                            z18 = r16 == true ? 1 : 0;
                                                        } else {
                                                            r11 = r18;
                                                        }
                                                        if (r11 == 0) {
                                                            z18 = z17;
                                                            if (r22[0] == 2) {
                                                                r15 = r11;
                                                                z22 = z18;
                                                                if (q() > i13) {
                                                                    this.E0 = r10;
                                                                    r22[0] = r10;
                                                                    O(i13);
                                                                    ?? r25 = r10;
                                                                    z22 = r25 == true ? 1 : 0;
                                                                    r15 = r25;
                                                                }
                                                            }
                                                            r11 = r16;
                                                            r15 = r11;
                                                            r15 = r11;
                                                            z22 = z18;
                                                            z22 = z18;
                                                            r13 = r15;
                                                            r13 = r15;
                                                            z19 = z22;
                                                            z19 = z22;
                                                            if (r22[r10] != 2) {
                                                            }
                                                            if (i17 > 8) {
                                                                z21 = false;
                                                            } else {
                                                                z21 = z20;
                                                            }
                                                            r12 = r14;
                                                            i16 = i17;
                                                            z11 = z14;
                                                            cVar = cVar3;
                                                            z12 = z21;
                                                        } else {
                                                            z18 = z17;
                                                            r11 = r16;
                                                            r13 = r11;
                                                            z19 = z18;
                                                        }
                                                        r13 = r15;
                                                        z19 = z22;
                                                        z20 = z19;
                                                        r14 = r13;
                                                        if (i17 > 8) {
                                                            z21 = false;
                                                        } else {
                                                            z21 = z20;
                                                        }
                                                        r12 = r14;
                                                        i16 = i17;
                                                        z11 = z14;
                                                        cVar = cVar3;
                                                        z12 = z21;
                                                    }
                                                }
                                                weakReference4 = this.J0;
                                                if (weakReference4 == null && weakReference4.get() != null) {
                                                    try {
                                                        try {
                                                            cVar7.f(cVar7.k(this.K), cVar7.k((c) this.J0.get()), 0, 5);
                                                            try {
                                                                this.J0 = null;
                                                            } catch (Exception e12) {
                                                                e = e12;
                                                                z24 = true;
                                                                e.printStackTrace();
                                                                System.out.println("EXCEPTION : " + e);
                                                                z15 = z24;
                                                            }
                                                        } catch (Exception e13) {
                                                            e = e13;
                                                            z24 = true;
                                                            e.printStackTrace();
                                                            System.out.println("EXCEPTION : " + e);
                                                            z15 = z24;
                                                            zArr = j.f9445a;
                                                            if (z15) {
                                                                zArr[2] = false;
                                                                zW2 = W(64);
                                                                Q(cVar7, zW2);
                                                                size = this.f9403q0.size();
                                                                i20 = 0;
                                                                z23 = false;
                                                                while (i20 < size) {
                                                                    dVar = (d) this.f9403q0.get(i20);
                                                                    dVar.Q(cVar7, zW2);
                                                                    boolean[] zArr6 = zArr;
                                                                    boolean z35 = zW2;
                                                                    if (dVar.h == -1) {
                                                                        z23 = true;
                                                                    } else {
                                                                        z23 = true;
                                                                    }
                                                                    i20++;
                                                                    zArr = zArr6;
                                                                    zW2 = z35;
                                                                    z23 = z23;
                                                                }
                                                                zArr2 = zArr;
                                                                z16 = z23;
                                                            } else {
                                                                zArr2 = zArr;
                                                                Q(cVar7, zW);
                                                                while (i18 < i14) {
                                                                    ((d) this.f9403q0.get(i18)).Q(cVar7, zW);
                                                                }
                                                                z16 = false;
                                                            }
                                                            if (z14) {
                                                                iMax3 = 0;
                                                                iMax4 = 0;
                                                                while (i19 < i14) {
                                                                    d dVar17 = (d) this.f9403q0.get(i19);
                                                                    iMax3 = Math.max(iMax3, dVar17.q() + dVar17.Y);
                                                                    iMax4 = Math.max(iMax4, dVar17.k() + dVar17.Z);
                                                                }
                                                                iMax5 = Math.max(this.f9368b0, iMax3);
                                                                iMax6 = Math.max(this.f9370c0, iMax4);
                                                                z16 = z16;
                                                                r12 = r12;
                                                                if (i12 == 2) {
                                                                    z16 = z16;
                                                                    r12 = r12;
                                                                    O(iMax5);
                                                                    r22[0] = 2;
                                                                    z16 = true;
                                                                    r12 = 1;
                                                                }
                                                                if (i11 == 2) {
                                                                    L(iMax6);
                                                                    r22[1] = 2;
                                                                    z16 = true;
                                                                    r12 = 1;
                                                                }
                                                            }
                                                            iMax = Math.max(this.f9368b0, q());
                                                            if (iMax > q()) {
                                                                O(iMax);
                                                                r10 = 1;
                                                                r22[0] = 1;
                                                                z17 = true;
                                                                r18 = 1;
                                                            } else {
                                                                r10 = 1;
                                                                r18 = r12;
                                                                z17 = z16;
                                                            }
                                                            iMax2 = Math.max(this.f9370c0, k());
                                                            if (iMax2 > k()) {
                                                                L(iMax2);
                                                                r22[r10] = r10;
                                                                r16 = r10;
                                                                z18 = r16 == true ? 1 : 0;
                                                            } else {
                                                                r11 = r18;
                                                            }
                                                            if (r11 == 0) {
                                                                z18 = z17;
                                                                if (r22[0] == 2) {
                                                                    r15 = r11;
                                                                    z22 = z18;
                                                                    if (q() > i13) {
                                                                        this.E0 = r10;
                                                                        r22[0] = r10;
                                                                        O(i13);
                                                                        ?? r26 = r10;
                                                                        z22 = r26 == true ? 1 : 0;
                                                                        r15 = r26;
                                                                    }
                                                                }
                                                                r11 = r16;
                                                                r15 = r11;
                                                                r15 = r11;
                                                                z22 = z18;
                                                                z22 = z18;
                                                                r13 = r15;
                                                                r13 = r15;
                                                                z19 = z22;
                                                                z19 = z22;
                                                                if (r22[r10] != 2) {
                                                                }
                                                                if (i17 > 8) {
                                                                    z21 = false;
                                                                } else {
                                                                    z21 = z20;
                                                                }
                                                                r12 = r14;
                                                                i16 = i17;
                                                                z11 = z14;
                                                                cVar = cVar3;
                                                                z12 = z21;
                                                            } else {
                                                                z18 = z17;
                                                                r11 = r16;
                                                                r13 = r11;
                                                                z19 = z18;
                                                            }
                                                            r13 = r15;
                                                            z19 = z22;
                                                            z20 = z19;
                                                            r14 = r13;
                                                            if (i17 > 8) {
                                                                z21 = false;
                                                            } else {
                                                                z21 = z20;
                                                            }
                                                            r12 = r14;
                                                            i16 = i17;
                                                            z11 = z14;
                                                            cVar = cVar3;
                                                            z12 = z21;
                                                        }
                                                    } catch (Exception e14) {
                                                        e = e14;
                                                    }
                                                }
                                                cVar7.p();
                                                z15 = true;
                                            } catch (Exception e15) {
                                                e = e15;
                                                cVar3 = cVar;
                                            }
                                        } else {
                                            cVar3 = cVar;
                                            z14 = z11;
                                            weakReference2 = this.I0;
                                            if (weakReference2 != null) {
                                                cVar7.f(cVar7.k(this.L), cVar7.k((c) this.I0.get()), 0, 5);
                                                this.I0 = null;
                                            }
                                            weakReference3 = this.H0;
                                            if (weakReference3 != null) {
                                                cVar4 = cVar2;
                                                cVar2 = cVar4;
                                                cVar7.f(cVar7.k((c) this.H0.get()), cVar7.k(cVar4), 0, 5);
                                                this.H0 = null;
                                            }
                                            weakReference4 = this.J0;
                                            if (weakReference4 == null) {
                                            }
                                            cVar7.p();
                                            z15 = true;
                                        }
                                    } catch (Exception e16) {
                                        e = e16;
                                        cVar3 = cVar;
                                        z14 = z11;
                                    }
                                } catch (Exception e17) {
                                    e = e17;
                                    cVar3 = cVar;
                                    z14 = z11;
                                    z24 = z12;
                                }
                                zArr = j.f9445a;
                                if (z15) {
                                    zArr[2] = false;
                                    zW2 = W(64);
                                    Q(cVar7, zW2);
                                    size = this.f9403q0.size();
                                    i20 = 0;
                                    z23 = false;
                                    while (i20 < size) {
                                        dVar = (d) this.f9403q0.get(i20);
                                        dVar.Q(cVar7, zW2);
                                        boolean[] zArr7 = zArr;
                                        boolean z36 = zW2;
                                        if (dVar.h == -1 || dVar.i != -1) {
                                            z23 = true;
                                        }
                                        i20++;
                                        zArr = zArr7;
                                        zW2 = z36;
                                        z23 = z23;
                                    }
                                    zArr2 = zArr;
                                    z16 = z23;
                                } else {
                                    zArr2 = zArr;
                                    Q(cVar7, zW);
                                    while (i18 < i14) {
                                        ((d) this.f9403q0.get(i18)).Q(cVar7, zW);
                                    }
                                    z16 = false;
                                }
                                if (z14 && i17 < 8 && zArr2[2]) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i19 < i14) {
                                        d dVar18 = (d) this.f9403q0.get(i19);
                                        iMax3 = Math.max(iMax3, dVar18.q() + dVar18.Y);
                                        iMax4 = Math.max(iMax4, dVar18.k() + dVar18.Z);
                                    }
                                    iMax5 = Math.max(this.f9368b0, iMax3);
                                    iMax6 = Math.max(this.f9370c0, iMax4);
                                    z16 = z16;
                                    r12 = r12;
                                    if (i12 == 2 && q() < iMax5) {
                                        z16 = z16;
                                        r12 = r12;
                                        O(iMax5);
                                        r22[0] = 2;
                                        z16 = true;
                                        r12 = 1;
                                    }
                                    if (i11 == 2 && k() < iMax6) {
                                        L(iMax6);
                                        r22[1] = 2;
                                        z16 = true;
                                        r12 = 1;
                                    }
                                }
                                iMax = Math.max(this.f9368b0, q());
                                if (iMax > q()) {
                                    O(iMax);
                                    r10 = 1;
                                    r22[0] = 1;
                                    z17 = true;
                                    r18 = 1;
                                } else {
                                    r10 = 1;
                                    r18 = r12;
                                    z17 = z16;
                                }
                                iMax2 = Math.max(this.f9370c0, k());
                                if (iMax2 > k()) {
                                    L(iMax2);
                                    r22[r10] = r10;
                                    r16 = r10;
                                    z18 = r16 == true ? 1 : 0;
                                } else {
                                    r11 = r18;
                                }
                                if (r11 == 0) {
                                    z18 = z17;
                                    if (r22[0] == 2 && i13 > 0) {
                                        r15 = r11;
                                        z22 = z18;
                                        if (q() > i13) {
                                            this.E0 = r10;
                                            r22[0] = r10;
                                            O(i13);
                                            ?? r27 = r10;
                                            z22 = r27 == true ? 1 : 0;
                                            r15 = r27;
                                        }
                                    }
                                    r11 = r16;
                                    r15 = r11;
                                    r15 = r11;
                                    z22 = z18;
                                    z22 = z18;
                                    r13 = r15;
                                    r13 = r15;
                                    z19 = z22;
                                    z19 = z22;
                                    if (r22[r10] != 2 && i10 > 0 && k() > i10) {
                                        r13 = r15;
                                        z19 = z22;
                                        this.F0 = r10;
                                        r22[r10] = r10;
                                        L(i10);
                                        r14 = 1;
                                        z20 = true;
                                    }
                                    if (i17 > 8) {
                                        z21 = false;
                                    } else {
                                        z21 = z20;
                                    }
                                    r12 = r14;
                                    i16 = i17;
                                    z11 = z14;
                                    cVar = cVar3;
                                    z12 = z21;
                                } else {
                                    z18 = z17;
                                    r11 = r16;
                                    r13 = r11;
                                    z19 = z18;
                                }
                                r13 = r15;
                                z19 = z22;
                                z20 = z19;
                                r14 = r13;
                                if (i17 > 8) {
                                    z21 = false;
                                } else {
                                    z21 = z20;
                                }
                                r12 = r14;
                                i16 = i17;
                                z11 = z14;
                                cVar = cVar3;
                                z12 = z21;
                            }
                            z13 = r12 == true ? 1 : 0;
                            this.f9403q0 = arrayList10;
                            if (z13) {
                                r22[0] = i12;
                                r22[1] = i11;
                            }
                            F(cVar7.f8734l);
                        }
                        c11 = 1;
                        nVar = null;
                        if (r22[c11] == 2) {
                            size2 = arrayList9.size();
                            i28 = 0;
                            i29 = 0;
                            nVar2 = null;
                            while (i29 < size2) {
                                Object obj9 = arrayList9.get(i29);
                                i29++;
                                nVar3 = (n) obj9;
                                if (nVar3.f10001c != 0) {
                                    nVar2 = nVar3;
                                    i28 = iB;
                                }
                            }
                            if (nVar2 != null) {
                                N(1);
                                L(i28);
                            } else {
                                nVar2 = null;
                            }
                        } else {
                            nVar2 = null;
                        }
                        if (nVar == null) {
                        }
                        i12 = i25;
                        if (i12 == 2) {
                            i26 = i22;
                            if (i26 < q()) {
                            }
                            iQ = q();
                            i11 = i24;
                            if (i11 == 2) {
                                i27 = i23;
                                if (i27 < k()) {
                                }
                                iK = k();
                                i10 = iK;
                                i13 = iQ;
                                z4 = true;
                                if (W(64)) {
                                    z10 = true;
                                } else {
                                    z10 = true;
                                }
                                cVar7.getClass();
                                cVar7.f8731g = false;
                                if (this.D0 == 0) {
                                    c10 = 1;
                                } else {
                                    c10 = 1;
                                }
                                ArrayList arrayList11 = this.f9403q0;
                                if (r22[0] != 2) {
                                    z11 = true;
                                } else {
                                    z11 = true;
                                }
                                this.f9412z0 = 0;
                                this.A0 = 0;
                                i14 = i;
                                while (i15 < i14) {
                                    dVar2 = (d) this.f9403q0.get(i15);
                                    if (dVar2 instanceof e) {
                                        ((e) dVar2).U();
                                    }
                                }
                                zW = W(64);
                                r12 = z4;
                                i16 = 0;
                                z12 = true;
                                while (z12) {
                                    i17 = i16 + 1;
                                    cVar7.t();
                                    this.f9412z0 = 0;
                                    this.A0 = 0;
                                    g(cVar7);
                                    while (i21 < i14) {
                                        ((d) this.f9403q0.get(i21)).g(cVar7);
                                    }
                                    S(cVar7);
                                    weakReference = this.G0;
                                    if (weakReference != null) {
                                        if (weakReference.get() != null) {
                                            cVar3 = cVar;
                                            z14 = z11;
                                            cVar7.f(cVar7.k((c) this.G0.get()), cVar7.k(cVar3), 0, 5);
                                            this.G0 = null;
                                        } else {
                                            cVar3 = cVar;
                                            z14 = z11;
                                        }
                                        weakReference2 = this.I0;
                                        if (weakReference2 != null) {
                                            cVar7.f(cVar7.k(this.L), cVar7.k((c) this.I0.get()), 0, 5);
                                            this.I0 = null;
                                        }
                                        weakReference3 = this.H0;
                                        if (weakReference3 != null) {
                                            cVar4 = cVar2;
                                            cVar2 = cVar4;
                                            cVar7.f(cVar7.k((c) this.H0.get()), cVar7.k(cVar4), 0, 5);
                                            this.H0 = null;
                                        }
                                        weakReference4 = this.J0;
                                        if (weakReference4 == null) {
                                        }
                                        cVar7.p();
                                        z15 = true;
                                    } else {
                                        cVar3 = cVar;
                                        z14 = z11;
                                        weakReference2 = this.I0;
                                        if (weakReference2 != null) {
                                            cVar7.f(cVar7.k(this.L), cVar7.k((c) this.I0.get()), 0, 5);
                                            this.I0 = null;
                                        }
                                        weakReference3 = this.H0;
                                        if (weakReference3 != null) {
                                            cVar4 = cVar2;
                                            cVar2 = cVar4;
                                            cVar7.f(cVar7.k((c) this.H0.get()), cVar7.k(cVar4), 0, 5);
                                            this.H0 = null;
                                        }
                                        weakReference4 = this.J0;
                                        if (weakReference4 == null) {
                                        }
                                        cVar7.p();
                                        z15 = true;
                                    }
                                    zArr = j.f9445a;
                                    if (z15) {
                                        zArr[2] = false;
                                        zW2 = W(64);
                                        Q(cVar7, zW2);
                                        size = this.f9403q0.size();
                                        i20 = 0;
                                        z23 = false;
                                        while (i20 < size) {
                                            dVar = (d) this.f9403q0.get(i20);
                                            dVar.Q(cVar7, zW2);
                                            boolean[] zArr8 = zArr;
                                            boolean z37 = zW2;
                                            if (dVar.h == -1) {
                                                z23 = true;
                                            } else {
                                                z23 = true;
                                            }
                                            i20++;
                                            zArr = zArr8;
                                            zW2 = z37;
                                            z23 = z23;
                                        }
                                        zArr2 = zArr;
                                        z16 = z23;
                                    } else {
                                        zArr2 = zArr;
                                        Q(cVar7, zW);
                                        while (i18 < i14) {
                                            ((d) this.f9403q0.get(i18)).Q(cVar7, zW);
                                        }
                                        z16 = false;
                                    }
                                    if (z14) {
                                        iMax3 = 0;
                                        iMax4 = 0;
                                        while (i19 < i14) {
                                            d dVar19 = (d) this.f9403q0.get(i19);
                                            iMax3 = Math.max(iMax3, dVar19.q() + dVar19.Y);
                                            iMax4 = Math.max(iMax4, dVar19.k() + dVar19.Z);
                                        }
                                        iMax5 = Math.max(this.f9368b0, iMax3);
                                        iMax6 = Math.max(this.f9370c0, iMax4);
                                        z16 = z16;
                                        r12 = r12;
                                        if (i12 == 2) {
                                            z16 = z16;
                                            r12 = r12;
                                            O(iMax5);
                                            r22[0] = 2;
                                            z16 = true;
                                            r12 = 1;
                                        }
                                        if (i11 == 2) {
                                            L(iMax6);
                                            r22[1] = 2;
                                            z16 = true;
                                            r12 = 1;
                                        }
                                    }
                                    iMax = Math.max(this.f9368b0, q());
                                    if (iMax > q()) {
                                        O(iMax);
                                        r10 = 1;
                                        r22[0] = 1;
                                        z17 = true;
                                        r18 = 1;
                                    } else {
                                        r10 = 1;
                                        r18 = r12;
                                        z17 = z16;
                                    }
                                    iMax2 = Math.max(this.f9370c0, k());
                                    if (iMax2 > k()) {
                                        L(iMax2);
                                        r22[r10] = r10;
                                        r16 = r10;
                                        z18 = r16 == true ? 1 : 0;
                                    } else {
                                        r11 = r18;
                                    }
                                    if (r11 == 0) {
                                        z18 = z17;
                                        if (r22[0] == 2) {
                                            r15 = r11;
                                            z22 = z18;
                                            if (q() > i13) {
                                                this.E0 = r10;
                                                r22[0] = r10;
                                                O(i13);
                                                ?? r28 = r10;
                                                z22 = r28 == true ? 1 : 0;
                                                r15 = r28;
                                            }
                                        }
                                        r11 = r16;
                                        r15 = r11;
                                        r15 = r11;
                                        z22 = z18;
                                        z22 = z18;
                                        r13 = r15;
                                        r13 = r15;
                                        z19 = z22;
                                        z19 = z22;
                                        if (r22[r10] != 2) {
                                        }
                                        if (i17 > 8) {
                                            z21 = false;
                                        } else {
                                            z21 = z20;
                                        }
                                        r12 = r14;
                                        i16 = i17;
                                        z11 = z14;
                                        cVar = cVar3;
                                        z12 = z21;
                                    } else {
                                        z18 = z17;
                                        r11 = r16;
                                        r13 = r11;
                                        z19 = z18;
                                    }
                                    r13 = r15;
                                    z19 = z22;
                                    z20 = z19;
                                    r14 = r13;
                                    if (i17 > 8) {
                                        z21 = false;
                                    } else {
                                        z21 = z20;
                                    }
                                    r12 = r14;
                                    i16 = i17;
                                    z11 = z14;
                                    cVar = cVar3;
                                    z12 = z21;
                                }
                                z13 = r12 == true ? 1 : 0;
                                this.f9403q0 = arrayList11;
                                if (z13) {
                                    r22[0] = i12;
                                    r22[1] = i11;
                                }
                                F(cVar7.f8734l);
                            }
                            i27 = i23;
                            iK = i27;
                            i10 = iK;
                            i13 = iQ;
                            z4 = true;
                            if (W(64)) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            cVar7.getClass();
                            cVar7.f8731g = false;
                            if (this.D0 == 0) {
                                c10 = 1;
                            } else {
                                c10 = 1;
                            }
                            ArrayList arrayList12 = this.f9403q0;
                            if (r22[0] != 2) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            this.f9412z0 = 0;
                            this.A0 = 0;
                            i14 = i;
                            while (i15 < i14) {
                                dVar2 = (d) this.f9403q0.get(i15);
                                if (dVar2 instanceof e) {
                                    ((e) dVar2).U();
                                }
                            }
                            zW = W(64);
                            r12 = z4;
                            i16 = 0;
                            z12 = true;
                            while (z12) {
                                i17 = i16 + 1;
                                cVar7.t();
                                this.f9412z0 = 0;
                                this.A0 = 0;
                                g(cVar7);
                                while (i21 < i14) {
                                    ((d) this.f9403q0.get(i21)).g(cVar7);
                                }
                                S(cVar7);
                                weakReference = this.G0;
                                if (weakReference != null) {
                                    if (weakReference.get() != null) {
                                        cVar3 = cVar;
                                        z14 = z11;
                                        cVar7.f(cVar7.k((c) this.G0.get()), cVar7.k(cVar3), 0, 5);
                                        this.G0 = null;
                                    } else {
                                        cVar3 = cVar;
                                        z14 = z11;
                                    }
                                    weakReference2 = this.I0;
                                    if (weakReference2 != null) {
                                        cVar7.f(cVar7.k(this.L), cVar7.k((c) this.I0.get()), 0, 5);
                                        this.I0 = null;
                                    }
                                    weakReference3 = this.H0;
                                    if (weakReference3 != null) {
                                        cVar4 = cVar2;
                                        cVar2 = cVar4;
                                        cVar7.f(cVar7.k((c) this.H0.get()), cVar7.k(cVar4), 0, 5);
                                        this.H0 = null;
                                    }
                                    weakReference4 = this.J0;
                                    if (weakReference4 == null) {
                                    }
                                    cVar7.p();
                                    z15 = true;
                                } else {
                                    cVar3 = cVar;
                                    z14 = z11;
                                    weakReference2 = this.I0;
                                    if (weakReference2 != null) {
                                        cVar7.f(cVar7.k(this.L), cVar7.k((c) this.I0.get()), 0, 5);
                                        this.I0 = null;
                                    }
                                    weakReference3 = this.H0;
                                    if (weakReference3 != null) {
                                        cVar4 = cVar2;
                                        cVar2 = cVar4;
                                        cVar7.f(cVar7.k((c) this.H0.get()), cVar7.k(cVar4), 0, 5);
                                        this.H0 = null;
                                    }
                                    weakReference4 = this.J0;
                                    if (weakReference4 == null) {
                                    }
                                    cVar7.p();
                                    z15 = true;
                                }
                                zArr = j.f9445a;
                                if (z15) {
                                    zArr[2] = false;
                                    zW2 = W(64);
                                    Q(cVar7, zW2);
                                    size = this.f9403q0.size();
                                    i20 = 0;
                                    z23 = false;
                                    while (i20 < size) {
                                        dVar = (d) this.f9403q0.get(i20);
                                        dVar.Q(cVar7, zW2);
                                        boolean[] zArr9 = zArr;
                                        boolean z38 = zW2;
                                        if (dVar.h == -1) {
                                            z23 = true;
                                        } else {
                                            z23 = true;
                                        }
                                        i20++;
                                        zArr = zArr9;
                                        zW2 = z38;
                                        z23 = z23;
                                    }
                                    zArr2 = zArr;
                                    z16 = z23;
                                } else {
                                    zArr2 = zArr;
                                    Q(cVar7, zW);
                                    while (i18 < i14) {
                                        ((d) this.f9403q0.get(i18)).Q(cVar7, zW);
                                    }
                                    z16 = false;
                                }
                                if (z14) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i19 < i14) {
                                        d dVar110 = (d) this.f9403q0.get(i19);
                                        iMax3 = Math.max(iMax3, dVar110.q() + dVar110.Y);
                                        iMax4 = Math.max(iMax4, dVar110.k() + dVar110.Z);
                                    }
                                    iMax5 = Math.max(this.f9368b0, iMax3);
                                    iMax6 = Math.max(this.f9370c0, iMax4);
                                    z16 = z16;
                                    r12 = r12;
                                    if (i12 == 2) {
                                        z16 = z16;
                                        r12 = r12;
                                        O(iMax5);
                                        r22[0] = 2;
                                        z16 = true;
                                        r12 = 1;
                                    }
                                    if (i11 == 2) {
                                        L(iMax6);
                                        r22[1] = 2;
                                        z16 = true;
                                        r12 = 1;
                                    }
                                }
                                iMax = Math.max(this.f9368b0, q());
                                if (iMax > q()) {
                                    O(iMax);
                                    r10 = 1;
                                    r22[0] = 1;
                                    z17 = true;
                                    r18 = 1;
                                } else {
                                    r10 = 1;
                                    r18 = r12;
                                    z17 = z16;
                                }
                                iMax2 = Math.max(this.f9370c0, k());
                                if (iMax2 > k()) {
                                    L(iMax2);
                                    r22[r10] = r10;
                                    r16 = r10;
                                    z18 = r16 == true ? 1 : 0;
                                } else {
                                    r11 = r18;
                                }
                                if (r11 == 0) {
                                    z18 = z17;
                                    if (r22[0] == 2) {
                                        r15 = r11;
                                        z22 = z18;
                                        if (q() > i13) {
                                            this.E0 = r10;
                                            r22[0] = r10;
                                            O(i13);
                                            ?? r29 = r10;
                                            z22 = r29 == true ? 1 : 0;
                                            r15 = r29;
                                        }
                                    }
                                    r11 = r16;
                                    r15 = r11;
                                    r15 = r11;
                                    z22 = z18;
                                    z22 = z18;
                                    r13 = r15;
                                    r13 = r15;
                                    z19 = z22;
                                    z19 = z22;
                                    if (r22[r10] != 2) {
                                    }
                                    if (i17 > 8) {
                                        z21 = false;
                                    } else {
                                        z21 = z20;
                                    }
                                    r12 = r14;
                                    i16 = i17;
                                    z11 = z14;
                                    cVar = cVar3;
                                    z12 = z21;
                                } else {
                                    z18 = z17;
                                    r11 = r16;
                                    r13 = r11;
                                    z19 = z18;
                                }
                                r13 = r15;
                                z19 = z22;
                                z20 = z19;
                                r14 = r13;
                                if (i17 > 8) {
                                    z21 = false;
                                } else {
                                    z21 = z20;
                                }
                                r12 = r14;
                                i16 = i17;
                                z11 = z14;
                                cVar = cVar3;
                                z12 = z21;
                            }
                            z13 = r12 == true ? 1 : 0;
                            this.f9403q0 = arrayList12;
                            if (z13) {
                                r22[0] = i12;
                                r22[1] = i11;
                            }
                            F(cVar7.f8734l);
                        }
                        i26 = i22;
                        iQ = i26;
                        i11 = i24;
                        if (i11 == 2) {
                            i27 = i23;
                            if (i27 < k()) {
                            }
                            iK = k();
                            i10 = iK;
                            i13 = iQ;
                            z4 = true;
                            if (W(64)) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            cVar7.getClass();
                            cVar7.f8731g = false;
                            if (this.D0 == 0) {
                                c10 = 1;
                            } else {
                                c10 = 1;
                            }
                            ArrayList arrayList13 = this.f9403q0;
                            if (r22[0] != 2) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            this.f9412z0 = 0;
                            this.A0 = 0;
                            i14 = i;
                            while (i15 < i14) {
                                dVar2 = (d) this.f9403q0.get(i15);
                                if (dVar2 instanceof e) {
                                    ((e) dVar2).U();
                                }
                            }
                            zW = W(64);
                            r12 = z4;
                            i16 = 0;
                            z12 = true;
                            while (z12) {
                                i17 = i16 + 1;
                                cVar7.t();
                                this.f9412z0 = 0;
                                this.A0 = 0;
                                g(cVar7);
                                while (i21 < i14) {
                                    ((d) this.f9403q0.get(i21)).g(cVar7);
                                }
                                S(cVar7);
                                weakReference = this.G0;
                                if (weakReference != null) {
                                    if (weakReference.get() != null) {
                                        cVar3 = cVar;
                                        z14 = z11;
                                        cVar7.f(cVar7.k((c) this.G0.get()), cVar7.k(cVar3), 0, 5);
                                        this.G0 = null;
                                    } else {
                                        cVar3 = cVar;
                                        z14 = z11;
                                    }
                                    weakReference2 = this.I0;
                                    if (weakReference2 != null) {
                                        cVar7.f(cVar7.k(this.L), cVar7.k((c) this.I0.get()), 0, 5);
                                        this.I0 = null;
                                    }
                                    weakReference3 = this.H0;
                                    if (weakReference3 != null) {
                                        cVar4 = cVar2;
                                        cVar2 = cVar4;
                                        cVar7.f(cVar7.k((c) this.H0.get()), cVar7.k(cVar4), 0, 5);
                                        this.H0 = null;
                                    }
                                    weakReference4 = this.J0;
                                    if (weakReference4 == null) {
                                    }
                                    cVar7.p();
                                    z15 = true;
                                } else {
                                    cVar3 = cVar;
                                    z14 = z11;
                                    weakReference2 = this.I0;
                                    if (weakReference2 != null) {
                                        cVar7.f(cVar7.k(this.L), cVar7.k((c) this.I0.get()), 0, 5);
                                        this.I0 = null;
                                    }
                                    weakReference3 = this.H0;
                                    if (weakReference3 != null) {
                                        cVar4 = cVar2;
                                        cVar2 = cVar4;
                                        cVar7.f(cVar7.k((c) this.H0.get()), cVar7.k(cVar4), 0, 5);
                                        this.H0 = null;
                                    }
                                    weakReference4 = this.J0;
                                    if (weakReference4 == null) {
                                    }
                                    cVar7.p();
                                    z15 = true;
                                }
                                zArr = j.f9445a;
                                if (z15) {
                                    zArr[2] = false;
                                    zW2 = W(64);
                                    Q(cVar7, zW2);
                                    size = this.f9403q0.size();
                                    i20 = 0;
                                    z23 = false;
                                    while (i20 < size) {
                                        dVar = (d) this.f9403q0.get(i20);
                                        dVar.Q(cVar7, zW2);
                                        boolean[] zArr10 = zArr;
                                        boolean z39 = zW2;
                                        if (dVar.h == -1) {
                                            z23 = true;
                                        } else {
                                            z23 = true;
                                        }
                                        i20++;
                                        zArr = zArr10;
                                        zW2 = z39;
                                        z23 = z23;
                                    }
                                    zArr2 = zArr;
                                    z16 = z23;
                                } else {
                                    zArr2 = zArr;
                                    Q(cVar7, zW);
                                    while (i18 < i14) {
                                        ((d) this.f9403q0.get(i18)).Q(cVar7, zW);
                                    }
                                    z16 = false;
                                }
                                if (z14) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i19 < i14) {
                                        d dVar111 = (d) this.f9403q0.get(i19);
                                        iMax3 = Math.max(iMax3, dVar111.q() + dVar111.Y);
                                        iMax4 = Math.max(iMax4, dVar111.k() + dVar111.Z);
                                    }
                                    iMax5 = Math.max(this.f9368b0, iMax3);
                                    iMax6 = Math.max(this.f9370c0, iMax4);
                                    z16 = z16;
                                    r12 = r12;
                                    if (i12 == 2) {
                                        z16 = z16;
                                        r12 = r12;
                                        O(iMax5);
                                        r22[0] = 2;
                                        z16 = true;
                                        r12 = 1;
                                    }
                                    if (i11 == 2) {
                                        L(iMax6);
                                        r22[1] = 2;
                                        z16 = true;
                                        r12 = 1;
                                    }
                                }
                                iMax = Math.max(this.f9368b0, q());
                                if (iMax > q()) {
                                    O(iMax);
                                    r10 = 1;
                                    r22[0] = 1;
                                    z17 = true;
                                    r18 = 1;
                                } else {
                                    r10 = 1;
                                    r18 = r12;
                                    z17 = z16;
                                }
                                iMax2 = Math.max(this.f9370c0, k());
                                if (iMax2 > k()) {
                                    L(iMax2);
                                    r22[r10] = r10;
                                    r16 = r10;
                                    z18 = r16 == true ? 1 : 0;
                                } else {
                                    r11 = r18;
                                }
                                if (r11 == 0) {
                                    z18 = z17;
                                    if (r22[0] == 2) {
                                        r15 = r11;
                                        z22 = z18;
                                        if (q() > i13) {
                                            this.E0 = r10;
                                            r22[0] = r10;
                                            O(i13);
                                            ?? r210 = r10;
                                            z22 = r210 == true ? 1 : 0;
                                            r15 = r210;
                                        }
                                    }
                                    r11 = r16;
                                    r15 = r11;
                                    r15 = r11;
                                    z22 = z18;
                                    z22 = z18;
                                    r13 = r15;
                                    r13 = r15;
                                    z19 = z22;
                                    z19 = z22;
                                    if (r22[r10] != 2) {
                                    }
                                    if (i17 > 8) {
                                        z21 = false;
                                    } else {
                                        z21 = z20;
                                    }
                                    r12 = r14;
                                    i16 = i17;
                                    z11 = z14;
                                    cVar = cVar3;
                                    z12 = z21;
                                } else {
                                    z18 = z17;
                                    r11 = r16;
                                    r13 = r11;
                                    z19 = z18;
                                }
                                r13 = r15;
                                z19 = z22;
                                z20 = z19;
                                r14 = r13;
                                if (i17 > 8) {
                                    z21 = false;
                                } else {
                                    z21 = z20;
                                }
                                r12 = r14;
                                i16 = i17;
                                z11 = z14;
                                cVar = cVar3;
                                z12 = z21;
                            }
                            z13 = r12 == true ? 1 : 0;
                            this.f9403q0 = arrayList13;
                            if (z13) {
                                r22[0] = i12;
                                r22[1] = i11;
                            }
                            F(cVar7.f8734l);
                        }
                        i27 = i23;
                        iK = i27;
                        i10 = iK;
                        i13 = iQ;
                        z4 = true;
                        if (W(64)) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        cVar7.getClass();
                        cVar7.f8731g = false;
                        if (this.D0 == 0) {
                            c10 = 1;
                        } else {
                            c10 = 1;
                        }
                        ArrayList arrayList14 = this.f9403q0;
                        if (r22[0] != 2) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        this.f9412z0 = 0;
                        this.A0 = 0;
                        i14 = i;
                        while (i15 < i14) {
                            dVar2 = (d) this.f9403q0.get(i15);
                            if (dVar2 instanceof e) {
                                ((e) dVar2).U();
                            }
                        }
                        zW = W(64);
                        r12 = z4;
                        i16 = 0;
                        z12 = true;
                        while (z12) {
                            i17 = i16 + 1;
                            cVar7.t();
                            this.f9412z0 = 0;
                            this.A0 = 0;
                            g(cVar7);
                            while (i21 < i14) {
                                ((d) this.f9403q0.get(i21)).g(cVar7);
                            }
                            S(cVar7);
                            weakReference = this.G0;
                            if (weakReference != null) {
                                if (weakReference.get() != null) {
                                    cVar3 = cVar;
                                    z14 = z11;
                                    cVar7.f(cVar7.k((c) this.G0.get()), cVar7.k(cVar3), 0, 5);
                                    this.G0 = null;
                                } else {
                                    cVar3 = cVar;
                                    z14 = z11;
                                }
                                weakReference2 = this.I0;
                                if (weakReference2 != null) {
                                    cVar7.f(cVar7.k(this.L), cVar7.k((c) this.I0.get()), 0, 5);
                                    this.I0 = null;
                                }
                                weakReference3 = this.H0;
                                if (weakReference3 != null) {
                                    cVar4 = cVar2;
                                    cVar2 = cVar4;
                                    cVar7.f(cVar7.k((c) this.H0.get()), cVar7.k(cVar4), 0, 5);
                                    this.H0 = null;
                                }
                                weakReference4 = this.J0;
                                if (weakReference4 == null) {
                                }
                                cVar7.p();
                                z15 = true;
                            } else {
                                cVar3 = cVar;
                                z14 = z11;
                                weakReference2 = this.I0;
                                if (weakReference2 != null) {
                                    cVar7.f(cVar7.k(this.L), cVar7.k((c) this.I0.get()), 0, 5);
                                    this.I0 = null;
                                }
                                weakReference3 = this.H0;
                                if (weakReference3 != null) {
                                    cVar4 = cVar2;
                                    cVar2 = cVar4;
                                    cVar7.f(cVar7.k((c) this.H0.get()), cVar7.k(cVar4), 0, 5);
                                    this.H0 = null;
                                }
                                weakReference4 = this.J0;
                                if (weakReference4 == null) {
                                }
                                cVar7.p();
                                z15 = true;
                            }
                            zArr = j.f9445a;
                            if (z15) {
                                zArr[2] = false;
                                zW2 = W(64);
                                Q(cVar7, zW2);
                                size = this.f9403q0.size();
                                i20 = 0;
                                z23 = false;
                                while (i20 < size) {
                                    dVar = (d) this.f9403q0.get(i20);
                                    dVar.Q(cVar7, zW2);
                                    boolean[] zArr11 = zArr;
                                    boolean z310 = zW2;
                                    if (dVar.h == -1) {
                                        z23 = true;
                                    } else {
                                        z23 = true;
                                    }
                                    i20++;
                                    zArr = zArr11;
                                    zW2 = z310;
                                    z23 = z23;
                                }
                                zArr2 = zArr;
                                z16 = z23;
                            } else {
                                zArr2 = zArr;
                                Q(cVar7, zW);
                                while (i18 < i14) {
                                    ((d) this.f9403q0.get(i18)).Q(cVar7, zW);
                                }
                                z16 = false;
                            }
                            if (z14) {
                                iMax3 = 0;
                                iMax4 = 0;
                                while (i19 < i14) {
                                    d dVar112 = (d) this.f9403q0.get(i19);
                                    iMax3 = Math.max(iMax3, dVar112.q() + dVar112.Y);
                                    iMax4 = Math.max(iMax4, dVar112.k() + dVar112.Z);
                                }
                                iMax5 = Math.max(this.f9368b0, iMax3);
                                iMax6 = Math.max(this.f9370c0, iMax4);
                                z16 = z16;
                                r12 = r12;
                                if (i12 == 2) {
                                    z16 = z16;
                                    r12 = r12;
                                    O(iMax5);
                                    r22[0] = 2;
                                    z16 = true;
                                    r12 = 1;
                                }
                                if (i11 == 2) {
                                    L(iMax6);
                                    r22[1] = 2;
                                    z16 = true;
                                    r12 = 1;
                                }
                            }
                            iMax = Math.max(this.f9368b0, q());
                            if (iMax > q()) {
                                O(iMax);
                                r10 = 1;
                                r22[0] = 1;
                                z17 = true;
                                r18 = 1;
                            } else {
                                r10 = 1;
                                r18 = r12;
                                z17 = z16;
                            }
                            iMax2 = Math.max(this.f9370c0, k());
                            if (iMax2 > k()) {
                                L(iMax2);
                                r22[r10] = r10;
                                r16 = r10;
                                z18 = r16 == true ? 1 : 0;
                            } else {
                                r11 = r18;
                            }
                            if (r11 == 0) {
                                z18 = z17;
                                if (r22[0] == 2) {
                                    r15 = r11;
                                    z22 = z18;
                                    if (q() > i13) {
                                        this.E0 = r10;
                                        r22[0] = r10;
                                        O(i13);
                                        ?? r211 = r10;
                                        z22 = r211 == true ? 1 : 0;
                                        r15 = r211;
                                    }
                                }
                                r11 = r16;
                                r15 = r11;
                                r15 = r11;
                                z22 = z18;
                                z22 = z18;
                                r13 = r15;
                                r13 = r15;
                                z19 = z22;
                                z19 = z22;
                                if (r22[r10] != 2) {
                                }
                                if (i17 > 8) {
                                    z21 = false;
                                } else {
                                    z21 = z20;
                                }
                                r12 = r14;
                                i16 = i17;
                                z11 = z14;
                                cVar = cVar3;
                                z12 = z21;
                            } else {
                                z18 = z17;
                                r11 = r16;
                                r13 = r11;
                                z19 = z18;
                            }
                            r13 = r15;
                            z19 = z22;
                            z20 = z19;
                            r14 = r13;
                            if (i17 > 8) {
                                z21 = false;
                            } else {
                                z21 = z20;
                            }
                            r12 = r14;
                            i16 = i17;
                            z11 = z14;
                            cVar = cVar3;
                            z12 = z21;
                        }
                        z13 = r12 == true ? 1 : 0;
                        this.f9403q0 = arrayList14;
                        if (z13) {
                            r22[0] = i12;
                            r22[1] = i11;
                        }
                        F(cVar7.f8734l);
                    }
                }
                i10 = i23;
                i11 = i24;
                i13 = i22;
                i12 = i25;
            }
        }
        z4 = false;
        if (W(64)) {
            z10 = true;
        } else {
            z10 = true;
        }
        cVar7.getClass();
        cVar7.f8731g = false;
        if (this.D0 == 0) {
            c10 = 1;
        } else {
            c10 = 1;
        }
        ArrayList arrayList15 = this.f9403q0;
        if (r22[0] != 2) {
            z11 = true;
        } else {
            z11 = true;
        }
        this.f9412z0 = 0;
        this.A0 = 0;
        i14 = i;
        while (i15 < i14) {
            dVar2 = (d) this.f9403q0.get(i15);
            if (dVar2 instanceof e) {
                ((e) dVar2).U();
            }
        }
        zW = W(64);
        r12 = z4;
        i16 = 0;
        z12 = true;
        while (z12) {
            i17 = i16 + 1;
            cVar7.t();
            this.f9412z0 = 0;
            this.A0 = 0;
            g(cVar7);
            while (i21 < i14) {
                ((d) this.f9403q0.get(i21)).g(cVar7);
            }
            S(cVar7);
            weakReference = this.G0;
            if (weakReference != null) {
                if (weakReference.get() != null) {
                    cVar3 = cVar;
                    z14 = z11;
                    cVar7.f(cVar7.k((c) this.G0.get()), cVar7.k(cVar3), 0, 5);
                    this.G0 = null;
                } else {
                    cVar3 = cVar;
                    z14 = z11;
                }
                weakReference2 = this.I0;
                if (weakReference2 != null) {
                    cVar7.f(cVar7.k(this.L), cVar7.k((c) this.I0.get()), 0, 5);
                    this.I0 = null;
                }
                weakReference3 = this.H0;
                if (weakReference3 != null) {
                    cVar4 = cVar2;
                    cVar2 = cVar4;
                    cVar7.f(cVar7.k((c) this.H0.get()), cVar7.k(cVar4), 0, 5);
                    this.H0 = null;
                }
                weakReference4 = this.J0;
                if (weakReference4 == null) {
                }
                cVar7.p();
                z15 = true;
            } else {
                cVar3 = cVar;
                z14 = z11;
                weakReference2 = this.I0;
                if (weakReference2 != null) {
                    cVar7.f(cVar7.k(this.L), cVar7.k((c) this.I0.get()), 0, 5);
                    this.I0 = null;
                }
                weakReference3 = this.H0;
                if (weakReference3 != null) {
                    cVar4 = cVar2;
                    cVar2 = cVar4;
                    cVar7.f(cVar7.k((c) this.H0.get()), cVar7.k(cVar4), 0, 5);
                    this.H0 = null;
                }
                weakReference4 = this.J0;
                if (weakReference4 == null) {
                }
                cVar7.p();
                z15 = true;
            }
            zArr = j.f9445a;
            if (z15) {
                zArr[2] = false;
                zW2 = W(64);
                Q(cVar7, zW2);
                size = this.f9403q0.size();
                i20 = 0;
                z23 = false;
                while (i20 < size) {
                    dVar = (d) this.f9403q0.get(i20);
                    dVar.Q(cVar7, zW2);
                    boolean[] zArr12 = zArr;
                    boolean z311 = zW2;
                    if (dVar.h == -1) {
                        z23 = true;
                    } else {
                        z23 = true;
                    }
                    i20++;
                    zArr = zArr12;
                    zW2 = z311;
                    z23 = z23;
                }
                zArr2 = zArr;
                z16 = z23;
            } else {
                zArr2 = zArr;
                Q(cVar7, zW);
                while (i18 < i14) {
                    ((d) this.f9403q0.get(i18)).Q(cVar7, zW);
                }
                z16 = false;
            }
            if (z14) {
                iMax3 = 0;
                iMax4 = 0;
                while (i19 < i14) {
                    d dVar113 = (d) this.f9403q0.get(i19);
                    iMax3 = Math.max(iMax3, dVar113.q() + dVar113.Y);
                    iMax4 = Math.max(iMax4, dVar113.k() + dVar113.Z);
                }
                iMax5 = Math.max(this.f9368b0, iMax3);
                iMax6 = Math.max(this.f9370c0, iMax4);
                z16 = z16;
                r12 = r12;
                if (i12 == 2) {
                    z16 = z16;
                    r12 = r12;
                    O(iMax5);
                    r22[0] = 2;
                    z16 = true;
                    r12 = 1;
                }
                if (i11 == 2) {
                    L(iMax6);
                    r22[1] = 2;
                    z16 = true;
                    r12 = 1;
                }
            }
            iMax = Math.max(this.f9368b0, q());
            if (iMax > q()) {
                O(iMax);
                r10 = 1;
                r22[0] = 1;
                z17 = true;
                r18 = 1;
            } else {
                r10 = 1;
                r18 = r12;
                z17 = z16;
            }
            iMax2 = Math.max(this.f9370c0, k());
            if (iMax2 > k()) {
                L(iMax2);
                r22[r10] = r10;
                r16 = r10;
                z18 = r16 == true ? 1 : 0;
            } else {
                r11 = r18;
            }
            if (r11 == 0) {
                z18 = z17;
                if (r22[0] == 2) {
                    r15 = r11;
                    z22 = z18;
                    if (q() > i13) {
                        this.E0 = r10;
                        r22[0] = r10;
                        O(i13);
                        ?? r212 = r10;
                        z22 = r212 == true ? 1 : 0;
                        r15 = r212;
                    }
                }
                r11 = r16;
                r15 = r11;
                r15 = r11;
                z22 = z18;
                z22 = z18;
                r13 = r15;
                r13 = r15;
                z19 = z22;
                z19 = z22;
                if (r22[r10] != 2) {
                }
                if (i17 > 8) {
                    z21 = false;
                } else {
                    z21 = z20;
                }
                r12 = r14;
                i16 = i17;
                z11 = z14;
                cVar = cVar3;
                z12 = z21;
            } else {
                z18 = z17;
                r11 = r16;
                r13 = r11;
                z19 = z18;
            }
            r13 = r15;
            z19 = z22;
            z20 = z19;
            r14 = r13;
            if (i17 > 8) {
                z21 = false;
            } else {
                z21 = z20;
            }
            r12 = r14;
            i16 = i17;
            z11 = z14;
            cVar = cVar3;
            z12 = z21;
        }
        z13 = r12 == true ? 1 : 0;
        this.f9403q0 = arrayList15;
        if (z13) {
            r22[0] = i12;
            r22[1] = i11;
        }
        F(cVar7.f8734l);
    }

    public final boolean W(int i) {
        return (this.D0 & i) == i;
    }

    @Override // w.d
    public final void n(StringBuilder sb2) {
        sb2.append(this.f9380j + ":{\n");
        StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(this.U);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.V);
        sb2.append("\n");
        ArrayList arrayList = this.f9403q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((d) obj).n(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }
}
