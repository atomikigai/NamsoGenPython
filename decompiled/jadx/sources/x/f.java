package x;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f9985d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9987g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f9982a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9983b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9984c = false;
    public int e = 1;
    public int h = 1;
    public g i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9988j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f9989k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f9990l = new ArrayList();

    public f(o oVar) {
        this.f9985d = oVar;
    }

    @Override // x.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f9990l;
        int size = arrayList.size();
        int i = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (!((f) obj).f9988j) {
                return;
            }
        }
        this.f9984c = true;
        o oVar = this.f9982a;
        if (oVar != null) {
            oVar.a(this);
        }
        if (this.f9983b) {
            this.f9985d.a(this);
            return;
        }
        int size2 = arrayList.size();
        f fVar = null;
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            f fVar2 = (f) obj2;
            if (!(fVar2 instanceof g)) {
                i++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i == 1 && fVar.f9988j) {
            g gVar = this.i;
            if (gVar != null) {
                if (!gVar.f9988j) {
                    return;
                } else {
                    this.f9986f = this.h * gVar.f9987g;
                }
            }
            d(fVar.f9987g + this.f9986f);
        }
        o oVar2 = this.f9982a;
        if (oVar2 != null) {
            oVar2.a(this);
        }
    }

    public final void b(o oVar) {
        this.f9989k.add(oVar);
        if (this.f9988j) {
            oVar.a(oVar);
        }
    }

    public final void c() {
        this.f9990l.clear();
        this.f9989k.clear();
        this.f9988j = false;
        this.f9987g = 0;
        this.f9984c = false;
        this.f9983b = false;
    }

    public void d(int i) {
        if (this.f9988j) {
            return;
        }
        this.f9988j = true;
        this.f9987g = i;
        ArrayList arrayList = this.f9989k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            d dVar = (d) obj;
            dVar.a(dVar);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f9985d.f10004b.f9378h0);
        sb2.append(":");
        switch (this.e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        sb2.append("(");
        sb2.append(this.f9988j ? Integer.valueOf(this.f9987g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f9990l.size());
        sb2.append(":d=");
        sb2.append(this.f9989k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
