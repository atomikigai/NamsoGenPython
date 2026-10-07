package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.i0;
import androidx.lifecycle.l;
import androidx.lifecycle.p;
import androidx.lifecycle.p0;
import androidx.lifecycle.r;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import da.v;
import f2.b;
import f2.d;
import f2.e;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f1185a;

    public Recreator(e eVar) {
        this.f1185a = eVar;
    }

    @Override // androidx.lifecycle.p
    public final void a(r rVar, l lVar) {
        if (lVar != l.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        rVar.l().f(this);
        e eVar = this.f1185a;
        Bundle bundleC = eVar.h().c("androidx.savedstate.Restarter");
        if (bundleC == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleC.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        int size = stringArrayList.size();
        int i = 0;
        while (i < size) {
            String str = stringArrayList.get(i);
            i++;
            String str2 = str;
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str2, false, Recreator.class.getClassLoader()).asSubclass(b.class);
                i.d(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        i.d(objNewInstance, "{\n                constr…wInstance()\n            }");
                        if (!(eVar instanceof u0)) {
                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                        }
                        t0 t0VarF = ((u0) eVar).f();
                        d dVarH = eVar.h();
                        t0VarF.getClass();
                        LinkedHashMap linkedHashMap = t0VarF.f1096a;
                        for (String str3 : new HashSet(linkedHashMap.keySet())) {
                            i.e(str3, "key");
                            p0 p0Var = (p0) linkedHashMap.get(str3);
                            i.b(p0Var);
                            i0.a(p0Var, dVarH, eVar.l());
                        }
                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                            dVarH.g();
                        }
                    } catch (Exception e) {
                        throw new RuntimeException(u3.b.b("Failed to instantiate ", str2), e);
                    }
                } catch (NoSuchMethodException e4) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
                }
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(v.i("Class ", str2, " wasn't found"), e10);
            }
        }
    }
}
