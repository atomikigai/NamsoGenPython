package b9;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f1513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f1514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f1515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1516d;
    public float e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f1517f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f1518g = new ArrayList();

    public u() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f10) {
        float f11 = this.f1516d;
        if (f11 == f10) {
            return;
        }
        float f12 = ((f10 - f11) + 360.0f) % 360.0f;
        if (f12 > 180.0f) {
            return;
        }
        float f13 = this.f1514b;
        float f14 = this.f1515c;
        q qVar = new q(f13, f14, f13, f14);
        qVar.f1506f = this.f1516d;
        qVar.f1507g = f12;
        this.f1518g.add(new o(qVar));
        this.f1516d = f10;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f1517f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((s) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f10, float f11) {
        r rVar = new r();
        rVar.f1508b = f10;
        rVar.f1509c = f11;
        this.f1517f.add(rVar);
        p pVar = new p(rVar, this.f1514b, this.f1515c);
        float fB = pVar.b() + 270.0f;
        float fB2 = pVar.b() + 270.0f;
        a(fB);
        this.f1518g.add(pVar);
        this.f1516d = fB2;
        this.f1514b = f10;
        this.f1515c = f11;
    }

    public final void d(float f10, float f11, float f12) {
        this.f1513a = f10;
        this.f1514b = 0.0f;
        this.f1515c = f10;
        this.f1516d = f11;
        this.e = (f11 + f12) % 360.0f;
        this.f1517f.clear();
        this.f1518g.clear();
    }
}
