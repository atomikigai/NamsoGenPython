package x9;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import da.v;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements ya.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10322b;

    public /* synthetic */ d(Object obj, int i) {
        this.f10321a = i;
        this.f10322b = obj;
    }

    @Override // ya.b
    public final Object get() {
        switch (this.f10321a) {
            case 0:
                String str = (String) this.f10322b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new l("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new l(v.i("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e4) {
                    throw new l(v.i("Could not instantiate ", str, "."), e4);
                } catch (NoSuchMethodException e10) {
                    throw new l(u3.b.b("Could not instantiate ", str), e10);
                } catch (InvocationTargetException e11) {
                    throw new l(u3.b.b("Could not instantiate ", str), e11);
                }
            case 1:
                return (ComponentRegistrar) this.f10322b;
            default:
                return new ab.c((n9.g) this.f10322b);
        }
    }
}
