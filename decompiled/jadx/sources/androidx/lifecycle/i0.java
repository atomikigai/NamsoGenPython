package androidx.lifecycle;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import rc.r1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f1054a = new q0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f1055b = new q0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q0 f1056c = new q0();

    public static final void a(p0 p0Var, f2.d dVar, t tVar) {
        Object obj;
        jc.i.e(dVar, "registry");
        jc.i.e(tVar, "lifecycle");
        HashMap map = p0Var.f1081a;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = p0Var.f1081a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController == null || savedStateHandleController.f1030c) {
            return;
        }
        savedStateHandleController.b(tVar, dVar);
        m mVar = tVar.f1093d;
        if (mVar == m.f1066b || mVar.compareTo(m.f1068d) >= 0) {
            dVar.g();
        } else {
            tVar.a(new LegacySavedStateHandleController$tryToAddRecreator$1(tVar, dVar));
        }
    }

    public static h0 b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new h0();
            }
            HashMap map = new HashMap();
            for (String str : bundle2.keySet()) {
                jc.i.d(str, "key");
                map.put(str, bundle2.get(str));
            }
            return new h0(map);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = parcelableArrayList.get(i);
            jc.i.c(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
        }
        return new h0(linkedHashMap);
    }

    public static final h0 c(l1.b bVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.f159a;
        f2.e eVar = (f2.e) linkedHashMap.get(f1054a);
        if (eVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        u0 u0Var = (u0) linkedHashMap.get(f1055b);
        if (u0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f1056c);
        String str = (String) linkedHashMap.get(q0.f1085b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        f2.c cVarD = eVar.h().d();
        k0 k0Var = cVarD instanceof k0 ? (k0) cVarD : null;
        if (k0Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = f(u0Var).f1064d;
        h0 h0Var = (h0) linkedHashMap2.get(str);
        if (h0Var != null) {
            return h0Var;
        }
        Class[] clsArr = h0.f1049f;
        if (!k0Var.f1061b) {
            k0Var.f1062c = k0Var.f1060a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
            k0Var.f1061b = true;
        }
        Bundle bundle2 = k0Var.f1062c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = k0Var.f1062c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = k0Var.f1062c;
        if (bundle5 != null && bundle5.isEmpty()) {
            k0Var.f1062c = null;
        }
        h0 h0VarB = b(bundle3, bundle);
        linkedHashMap2.put(str, h0VarB);
        return h0VarB;
    }

    public static final a4.l d(u0 u0Var) {
        jc.i.e(u0Var, "owner");
        return u0Var instanceof h ? ((h) u0Var).d() : l1.a.f6509b;
    }

    public static final LifecycleCoroutineScopeImpl e(r rVar) {
        jc.i.e(rVar, "<this>");
        t tVarL = rVar.l();
        jc.i.e(tVarL, "<this>");
        AtomicReference atomicReference = tVarL.f1090a;
        while (true) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) atomicReference.get();
            if (lifecycleCoroutineScopeImpl != null) {
                return lifecycleCoroutineScopeImpl;
            }
            r1 r1VarC = rc.b0.c();
            yc.d dVar = rc.k0.f8292a;
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = new LifecycleCoroutineScopeImpl(tVarL, com.bumptech.glide.d.x(r1VarC, wc.o.f9950a.e));
            do {
                yb.d dVar2 = null;
                if (atomicReference.compareAndSet(null, lifecycleCoroutineScopeImpl2)) {
                    yc.d dVar3 = rc.k0.f8292a;
                    rc.b0.q(lifecycleCoroutineScopeImpl2, wc.o.f9950a.e, new a2.y(lifecycleCoroutineScopeImpl2, dVar2, 1), 2);
                    return lifecycleCoroutineScopeImpl2;
                }
            } while (atomicReference.get() == null);
        }
    }

    public static final l0 f(u0 u0Var) {
        ArrayList arrayList = new ArrayList();
        Class clsA = jc.r.a(l0.class).a();
        jc.i.c(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        arrayList.add(new l1.c(clsA));
        l1.c[] cVarArr = (l1.c[]) arrayList.toArray(new l1.c[0]);
        return (l0) new a2.l(u0Var.f(), new a4.b((l1.c[]) Arrays.copyOf(cVarArr, cVarArr.length)), d(u0Var)).r(l0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
