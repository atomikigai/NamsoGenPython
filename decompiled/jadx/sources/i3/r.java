package i3;

import h3.c1;
import java.util.List;
import y1.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f5198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f5199b = new c(3);

    public r(v vVar) {
        this.f5198a = vVar;
    }

    public final Object a(List list, a2.g gVar) {
        StringBuilder sbB = u.e.b("DELETE FROM temp_mail_history WHERE email IN (");
        android.support.v4.media.session.a.a(sbB, list.size());
        sbB.append(")");
        String string = sbB.toString();
        jc.i.d(string, "toString(...)");
        Object objW = n9.b.w(new c1(string, list), this.f5198a, gVar, false, true);
        return objW == zb.a.f11555a ? objW : ub.k.f9073a;
    }
}
