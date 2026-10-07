package jd;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f5791c;

    public i(ArrayList arrayList) {
        this.f5789a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        jc.i.e(obj, "proxy");
        jc.i.e(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (jc.i.a(name, "supports") && jc.i.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (jc.i.a(name, "unsupported") && jc.i.a(Void.TYPE, returnType)) {
            this.f5790b = true;
            return null;
        }
        boolean zA = jc.i.a(name, "protocols");
        ArrayList arrayList = this.f5789a;
        if (zA && objArr.length == 0) {
            return arrayList;
        }
        if ((jc.i.a(name, "selectProtocol") || jc.i.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        Object obj3 = list.get(i);
                        jc.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (arrayList.contains(str)) {
                            this.f5791c = str;
                            return str;
                        }
                        if (i != size) {
                            i++;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f5791c = str2;
                return str2;
            }
        }
        if ((!jc.i.a(name, "protocolSelected") && !jc.i.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        jc.i.c(obj4, "null cannot be cast to non-null type kotlin.String");
        this.f5791c = (String) obj4;
        return null;
    }
}
