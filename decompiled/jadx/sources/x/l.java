package x;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f9994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f9995b;

    public static long a(f fVar, long j4) {
        o oVar = fVar.f9985d;
        ArrayList arrayList = fVar.f9989k;
        if (oVar instanceof j) {
            return j4;
        }
        int size = arrayList.size();
        long jMin = j4;
        for (int i = 0; i < size; i++) {
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f9985d != oVar) {
                    jMin = Math.min(jMin, a(fVar2, ((long) fVar2.f9986f) + j4));
                }
            }
        }
        f fVar3 = oVar.i;
        f fVar4 = oVar.h;
        if (fVar != fVar3) {
            return jMin;
        }
        long j10 = j4 - oVar.j();
        return Math.min(Math.min(jMin, a(fVar4, j10)), j10 - ((long) fVar4.f9986f));
    }

    public static long b(f fVar, long j4) {
        o oVar = fVar.f9985d;
        ArrayList arrayList = fVar.f9989k;
        if (oVar instanceof j) {
            return j4;
        }
        int size = arrayList.size();
        long jMax = j4;
        for (int i = 0; i < size; i++) {
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f9985d != oVar) {
                    jMax = Math.max(jMax, b(fVar2, ((long) fVar2.f9986f) + j4));
                }
            }
        }
        f fVar3 = oVar.h;
        f fVar4 = oVar.i;
        if (fVar != fVar3) {
            return jMax;
        }
        long j10 = oVar.j() + j4;
        return Math.max(Math.max(jMax, b(fVar4, j10)), j10 - ((long) fVar4.f9986f));
    }
}
