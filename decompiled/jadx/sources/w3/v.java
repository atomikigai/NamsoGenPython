package w3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0.d f9578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f9579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9580c;

    public v(Class cls, Class cls2, Class cls3, List list, p0.d dVar) {
        this.f9578a = dVar;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f9579b = list;
        this.f9580c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final x a(int i, int i10, com.bumptech.glide.load.data.g gVar, ea.j jVar, u3.i iVar) {
        p0.d dVar = this.f9578a;
        Object objC = dVar.c();
        p4.f.c(objC, "Argument must not be null");
        List list = (List) objC;
        try {
            List list2 = this.f9579b;
            int size = list2.size();
            x xVarA = null;
            for (int i11 = 0; i11 < size; i11++) {
                try {
                    xVarA = ((i) list2.get(i11)).a(i, i10, gVar, jVar, iVar);
                } catch (t e) {
                    list.add(e);
                }
                if (xVarA != null) {
                    break;
                }
            }
            if (xVarA == null) {
                throw new t(this.f9580c, new ArrayList(list));
            }
            dVar.b(list);
            return xVarA;
        } catch (Throwable th) {
            dVar.b(list);
            throw th;
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f9579b.toArray()) + '}';
    }
}
