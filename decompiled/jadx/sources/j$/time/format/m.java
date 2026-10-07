package j$.time.format;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.q f5461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f5462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f5463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile i f5464d;

    public m(j$.time.temporal.q qVar, v vVar, b bVar) {
        this.f5461a = qVar;
        this.f5462b = vVar;
        this.f5463c = bVar;
    }

    @Override // j$.time.format.f
    public final boolean u(p pVar, StringBuilder sb2) {
        String strA;
        Long lA = pVar.a(this.f5461a);
        if (lA == null) {
            return false;
        }
        j$.time.chrono.m mVar = (j$.time.chrono.m) pVar.f5474a.b(j$.time.temporal.r.f5535b);
        if (mVar == null || mVar == j$.time.chrono.t.f5416c) {
            b bVar = this.f5463c;
            long jLongValue = lA.longValue();
            v vVar = this.f5462b;
            Locale locale = pVar.f5475b.f5438b;
            strA = bVar.f5443a.a(jLongValue, vVar);
        } else {
            b bVar2 = this.f5463c;
            long jLongValue2 = lA.longValue();
            v vVar2 = this.f5462b;
            Locale locale2 = pVar.f5475b.f5438b;
            strA = bVar2.f5443a.a(jLongValue2, vVar2);
        }
        if (strA != null) {
            sb2.append(strA);
            return true;
        }
        if (this.f5464d == null) {
            this.f5464d = new i(this.f5461a, 1, 19, u.NORMAL);
        }
        return this.f5464d.u(pVar, sb2);
    }

    public final String toString() {
        v vVar = v.FULL;
        j$.time.temporal.q qVar = this.f5461a;
        v vVar2 = this.f5462b;
        if (vVar2 == vVar) {
            return "Text(" + qVar + ")";
        }
        return "Text(" + qVar + "," + vVar2 + ")";
    }
}
