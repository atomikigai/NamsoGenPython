package vb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends ac.h implements ic.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f9309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9310d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f9311f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Iterator f9312r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Iterator it, yb.d dVar) {
        super(dVar);
        this.f9312r = it;
    }

    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        w wVar = new w(this.f9312r, dVar);
        wVar.f9311f = obj;
        return wVar;
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((oc.f) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        oc.f fVar;
        ArrayList arrayList;
        Iterator it;
        int i;
        v vVar;
        oc.f fVar2;
        Object[] array;
        zb.a aVar = zb.a.f11555a;
        int i10 = this.e;
        if (i10 != 0) {
            if (i10 == 1) {
                i = this.f9310d;
                it = this.f9309c;
                fVar = (oc.f) this.f9311f;
                r7.g.G(obj);
                arrayList = new ArrayList(20);
            } else if (i10 == 2) {
                r7.g.G(obj);
            } else {
                if (i10 == 3) {
                    Iterator it2 = this.f9309c;
                    v vVar2 = (v) this.f9308b;
                    oc.f fVar3 = (oc.f) this.f9311f;
                    r7.g.G(obj);
                    vVar2.g();
                    while (true) {
                        int i11 = vVar2.f9305b;
                        Object[] objArr = vVar2.f9304a;
                        if (!it2.hasNext()) {
                            vVar = vVar2;
                            fVar2 = fVar3;
                            break;
                        }
                        Object next = it2.next();
                        if (vVar2.d() == i11) {
                            throw new IllegalStateException("ring buffer is full");
                        }
                        int i12 = vVar2.f9306c;
                        int i13 = vVar2.f9307d;
                        objArr[(i12 + i13) % i11] = next;
                        vVar2.f9307d = i13 + 1;
                        if (vVar2.d() == i11) {
                            if (vVar2.f9307d >= 20) {
                                ArrayList arrayList2 = new ArrayList(vVar2);
                                this.f9311f = fVar3;
                                this.f9308b = vVar2;
                                this.f9309c = it2;
                                this.e = 3;
                                fVar3.b(arrayList2, this);
                                zb.a aVar2 = zb.a.f11555a;
                                return aVar;
                            }
                            int i14 = i11 + (i11 >> 1) + 1;
                            if (i14 > 20) {
                                i14 = 20;
                            }
                            if (vVar2.f9306c == 0) {
                                array = Arrays.copyOf(objArr, i14);
                                jc.i.d(array, "copyOf(...)");
                            } else {
                                array = vVar2.toArray(new Object[i14]);
                            }
                            vVar2 = new v(array, vVar2.f9307d);
                        }
                    }
                } else if (i10 != 4) {
                    if (i10 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r7.g.G(obj);
                } else {
                    vVar = (v) this.f9308b;
                    fVar2 = (oc.f) this.f9311f;
                    r7.g.G(obj);
                    vVar.g();
                }
                if (vVar.f9307d > 20) {
                    ArrayList arrayList3 = new ArrayList(vVar);
                    this.f9311f = fVar2;
                    this.f9308b = vVar;
                    this.f9309c = null;
                    this.e = 4;
                    fVar2.b(arrayList3, this);
                    zb.a aVar3 = zb.a.f11555a;
                    return aVar;
                }
                if (!vVar.isEmpty()) {
                    this.f9311f = null;
                    this.f9308b = null;
                    this.f9309c = null;
                    this.e = 5;
                    fVar2.b(vVar, this);
                    zb.a aVar4 = zb.a.f11555a;
                    return aVar;
                }
            }
            return ub.k.f9073a;
        }
        r7.g.G(obj);
        fVar = (oc.f) this.f9311f;
        arrayList = new ArrayList(20);
        it = this.f9312r;
        i = 0;
        oc.f fVar4 = fVar;
        Iterator it3 = it;
        int i15 = i;
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (i > 0) {
                i--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.f9311f = fVar4;
                    this.f9308b = arrayList;
                    this.f9309c = it3;
                    this.f9310d = i15;
                    this.e = 1;
                    fVar4.b(arrayList, this);
                    zb.a aVar5 = zb.a.f11555a;
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f9311f = null;
            this.f9308b = null;
            this.f9309c = null;
            this.e = 2;
            fVar4.b(arrayList, this);
            zb.a aVar6 = zb.a.f11555a;
            return aVar;
        }
        return ub.k.f9073a;
    }
}
