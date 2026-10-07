package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f1070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f1071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f1072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f1073d;
    public final f2.d e;

    public m0(Application application, f2.e eVar, Bundle bundle) {
        r0 r0Var;
        this.e = eVar.h();
        this.f1073d = eVar.l();
        this.f1072c = bundle;
        this.f1070a = application;
        if (application != null) {
            if (r0.e == null) {
                r0.e = new r0(application);
            }
            r0Var = r0.e;
            jc.i.b(r0Var);
        } else {
            r0Var = new r0(null);
        }
        this.f1071b = r0Var;
    }

    @Override // androidx.lifecycle.s0
    public final p0 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p0 b(Class cls, String str) {
        Object obj;
        Application application;
        t tVar = this.f1073d;
        if (tVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = d5.f.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || this.f1070a == null) ? n0.a(cls, n0.f1075b) : n0.a(cls, n0.f1074a);
        if (constructorA == null) {
            if (this.f1070a != null) {
                return this.f1071b.a(cls);
            }
            if (q0.f1086c == null) {
                q0.f1086c = new q0();
            }
            q0 q0Var = q0.f1086c;
            jc.i.b(q0Var);
            return q0Var.a(cls);
        }
        f2.d dVar = this.e;
        jc.i.b(dVar);
        Bundle bundle = this.f1072c;
        Bundle bundleC = dVar.c(str);
        Class[] clsArr = h0.f1049f;
        h0 h0VarB = i0.b(bundleC, bundle);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, h0VarB);
        savedStateHandleController.b(tVar, dVar);
        m mVar = tVar.f1093d;
        if (mVar == m.f1066b || mVar.compareTo(m.f1068d) >= 0) {
            dVar.g();
        } else {
            tVar.a(new LegacySavedStateHandleController$tryToAddRecreator$1(tVar, dVar));
        }
        p0 p0VarB = (!zIsAssignableFrom || (application = this.f1070a) == null) ? n0.b(cls, constructorA, h0VarB) : n0.b(cls, constructorA, application, h0VarB);
        synchronized (p0VarB.f1081a) {
            try {
                obj = p0VarB.f1081a.get("androidx.lifecycle.savedstate.vm.tag");
                if (obj == null) {
                    p0VarB.f1081a.put("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            savedStateHandleController = obj;
        }
        if (p0VarB.f1083c) {
            p0.a(savedStateHandleController);
        }
        return p0VarB;
    }

    @Override // androidx.lifecycle.s0
    public final p0 d(Class cls, l1.b bVar) {
        q0 q0Var = q0.f1085b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.f159a;
        String str = (String) linkedHashMap.get(q0Var);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(i0.f1054a) == null || linkedHashMap.get(i0.f1055b) == null) {
            if (this.f1073d != null) {
                return b(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(q0.f1084a);
        boolean zIsAssignableFrom = d5.f.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? n0.a(cls, n0.f1075b) : n0.a(cls, n0.f1074a);
        if (constructorA == null) {
            return this.f1071b.d(cls, bVar);
        }
        return (!zIsAssignableFrom || application == null) ? n0.b(cls, constructorA, i0.c(bVar)) : n0.b(cls, constructorA, application, i0.c(bVar));
    }
}
