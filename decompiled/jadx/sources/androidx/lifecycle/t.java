package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    public final WeakReference e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1095g;
    public boolean h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AtomicReference f1090a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1091b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n.a f1092c = new n.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f1093d = m.f1066b;
    public final ArrayList i = new ArrayList();

    public t(r rVar) {
        this.e = new WeakReference(rVar);
    }

    public final void a(q qVar) {
        p reflectiveGenericLifecycleObserver;
        Object obj;
        r rVar;
        l lVar;
        c("addObserver");
        m mVar = this.f1093d;
        m mVar2 = m.f1065a;
        if (mVar != mVar2) {
            mVar2 = m.f1066b;
        }
        s sVar = new s();
        HashMap map = v.f1098a;
        boolean z4 = qVar instanceof p;
        boolean z10 = qVar instanceof d;
        if (z4 && z10) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((d) qVar, (p) qVar);
        } else if (z10) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((d) qVar, null);
        } else if (z4) {
            reflectiveGenericLifecycleObserver = (p) qVar;
        } else {
            Class<?> cls = qVar.getClass();
            if (v.b(cls) == 2) {
                Object obj2 = v.f1099b.get(cls);
                jc.i.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    v.a((Constructor) list.get(0), qVar);
                    throw null;
                }
                int size = list.size();
                g[] gVarArr = new g[size];
                if (size > 0) {
                    v.a((Constructor) list.get(0), qVar);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(gVarArr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(qVar);
            }
        }
        sVar.f1089b = reflectiveGenericLifecycleObserver;
        sVar.f1088a = mVar2;
        n.a aVar = this.f1092c;
        n.c cVarD = aVar.d(qVar);
        if (cVarD != null) {
            obj = cVarD.f7121b;
        } else {
            HashMap map2 = aVar.e;
            n.c cVar = new n.c(qVar, sVar);
            aVar.f7130d++;
            n.c cVar2 = aVar.f7128b;
            if (cVar2 == null) {
                aVar.f7127a = cVar;
                aVar.f7128b = cVar;
            } else {
                cVar2.f7122c = cVar;
                cVar.f7123d = cVar2;
                aVar.f7128b = cVar;
            }
            map2.put(qVar, cVar);
            obj = null;
        }
        if (((s) obj) == null && (rVar = (r) this.e.get()) != null) {
            boolean z11 = this.f1094f != 0 || this.f1095g;
            m mVarB = b(qVar);
            this.f1094f++;
            while (sVar.f1088a.compareTo(mVarB) < 0 && this.f1092c.e.containsKey(qVar)) {
                m mVar3 = sVar.f1088a;
                ArrayList arrayList = this.i;
                arrayList.add(mVar3);
                j jVar = l.Companion;
                m mVar4 = sVar.f1088a;
                jVar.getClass();
                jc.i.e(mVar4, "state");
                int iOrdinal = mVar4.ordinal();
                if (iOrdinal == 1) {
                    lVar = l.ON_CREATE;
                } else if (iOrdinal != 2) {
                    lVar = iOrdinal != 3 ? null : l.ON_RESUME;
                } else {
                    lVar = l.ON_START;
                }
                if (lVar == null) {
                    throw new IllegalStateException("no event up from " + sVar.f1088a);
                }
                sVar.a(rVar, lVar);
                arrayList.remove(arrayList.size() - 1);
                mVarB = b(qVar);
            }
            if (!z11) {
                h();
            }
            this.f1094f--;
        }
    }

    public final m b(q qVar) {
        s sVar;
        HashMap map = this.f1092c.e;
        n.c cVar = map.containsKey(qVar) ? ((n.c) map.get(qVar)).f7123d : null;
        m mVar = (cVar == null || (sVar = (s) cVar.f7121b) == null) ? null : sVar.f1088a;
        ArrayList arrayList = this.i;
        m mVar2 = arrayList.isEmpty() ? null : (m) arrayList.get(arrayList.size() - 1);
        m mVar3 = this.f1093d;
        jc.i.e(mVar3, "state1");
        if (mVar == null || mVar.compareTo(mVar3) >= 0) {
            mVar = mVar3;
        }
        return (mVar2 == null || mVar2.compareTo(mVar) >= 0) ? mVar : mVar2;
    }

    public final void c(String str) {
        if (this.f1091b) {
            m.a.V().f6959a.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(da.v.i("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(l lVar) {
        jc.i.e(lVar, "event");
        c("handleLifecycleEvent");
        e(lVar.a());
    }

    public final void e(m mVar) {
        m mVar2 = this.f1093d;
        if (mVar2 == mVar) {
            return;
        }
        m mVar3 = m.f1066b;
        m mVar4 = m.f1065a;
        if (mVar2 == mVar3 && mVar == mVar4) {
            throw new IllegalStateException(("no event down from " + this.f1093d + " in component " + this.e.get()).toString());
        }
        this.f1093d = mVar;
        if (this.f1095g || this.f1094f != 0) {
            this.h = true;
            return;
        }
        this.f1095g = true;
        h();
        this.f1095g = false;
        if (this.f1093d == mVar4) {
            this.f1092c = new n.a();
        }
    }

    public final void f(q qVar) {
        jc.i.e(qVar, "observer");
        c("removeObserver");
        this.f1092c.g(qVar);
    }

    public final void g() {
        c("setCurrentState");
        e(m.f1067c);
    }

    public final void h() {
        l lVar;
        l lVar2;
        r rVar = (r) this.e.get();
        if (rVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            n.a aVar = this.f1092c;
            if (aVar.f7130d != 0) {
                n.c cVar = aVar.f7127a;
                jc.i.b(cVar);
                m mVar = ((s) cVar.f7121b).f1088a;
                n.c cVar2 = this.f1092c.f7128b;
                jc.i.b(cVar2);
                m mVar2 = ((s) cVar2.f7121b).f1088a;
                if (mVar == mVar2 && this.f1093d == mVar2) {
                    break;
                }
                this.h = false;
                m mVar3 = this.f1093d;
                n.c cVar3 = this.f1092c.f7127a;
                jc.i.b(cVar3);
                int iCompareTo = mVar3.compareTo(((s) cVar3.f7121b).f1088a);
                ArrayList arrayList = this.i;
                if (iCompareTo < 0) {
                    n.a aVar2 = this.f1092c;
                    n.b bVar = new n.b(aVar2.f7128b, aVar2.f7127a, 1);
                    aVar2.f7129c.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.h) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        jc.i.d(entry, "next()");
                        q qVar = (q) entry.getKey();
                        s sVar = (s) entry.getValue();
                        while (sVar.f1088a.compareTo(this.f1093d) > 0 && !this.h && this.f1092c.e.containsKey(qVar)) {
                            j jVar = l.Companion;
                            m mVar4 = sVar.f1088a;
                            jVar.getClass();
                            jc.i.e(mVar4, "state");
                            int iOrdinal = mVar4.ordinal();
                            if (iOrdinal == 2) {
                                lVar2 = l.ON_DESTROY;
                            } else if (iOrdinal != 3) {
                                lVar2 = iOrdinal != 4 ? null : l.ON_PAUSE;
                            } else {
                                lVar2 = l.ON_STOP;
                            }
                            if (lVar2 == null) {
                                throw new IllegalStateException("no event down from " + sVar.f1088a);
                            }
                            arrayList.add(lVar2.a());
                            sVar.a(rVar, lVar2);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                n.c cVar4 = this.f1092c.f7128b;
                if (!this.h && cVar4 != null && this.f1093d.compareTo(((s) cVar4.f7121b).f1088a) > 0) {
                    n.a aVar3 = this.f1092c;
                    aVar3.getClass();
                    n.d dVar = new n.d(aVar3);
                    aVar3.f7129c.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.h) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        q qVar2 = (q) entry2.getKey();
                        s sVar2 = (s) entry2.getValue();
                        while (sVar2.f1088a.compareTo(this.f1093d) < 0 && !this.h && this.f1092c.e.containsKey(qVar2)) {
                            arrayList.add(sVar2.f1088a);
                            j jVar2 = l.Companion;
                            m mVar5 = sVar2.f1088a;
                            jVar2.getClass();
                            jc.i.e(mVar5, "state");
                            int iOrdinal2 = mVar5.ordinal();
                            if (iOrdinal2 == 1) {
                                lVar = l.ON_CREATE;
                            } else if (iOrdinal2 != 2) {
                                lVar = iOrdinal2 != 3 ? null : l.ON_RESUME;
                            } else {
                                lVar = l.ON_START;
                            }
                            if (lVar == null) {
                                throw new IllegalStateException("no event up from " + sVar2.f1088a);
                            }
                            sVar2.a(rVar, lVar);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.h = false;
    }
}
