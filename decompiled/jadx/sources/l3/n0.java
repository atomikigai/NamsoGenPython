package l3;

import java.util.ArrayList;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n0 implements ic.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jc.o f6614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g.f f6615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.a f6616d;

    public /* synthetic */ n0(ArrayList arrayList, jc.o oVar, g.f fVar, ic.a aVar) {
        this.f6613a = arrayList;
        this.f6614b = oVar;
        this.f6615c = fVar;
        this.f6616d = aVar;
    }

    @Override // ic.l
    public final Object invoke(Object obj) throws JSONException {
        ArrayList arrayList = this.f6613a;
        jc.o oVar = this.f6614b;
        g.f fVar = this.f6615c;
        ic.a aVar = this.f6616d;
        if (((Boolean) obj).booleanValue()) {
            int i = i3.p.b().getInt("proxy_type", 0);
            String strC = i3.p.c();
            int i10 = i3.p.b().getInt("proxy_port", 0);
            String strD = i3.p.d();
            String string = i3.p.b().getString("proxy_pass", "");
            b1 b1Var = new b1(new n3.c(i, i10, 992, strC, strD, string == null ? "" : string, (String) null, (String) null, (String) null, false));
            b1Var.f6524b = 2;
            vb.o.X(arrayList, new s0(b1Var, 0));
            arrayList.add(b1Var);
            android.support.v4.media.session.a.x(arrayList);
            i3.p.b().edit().putString("proxy_active_iso", "").apply();
            i3.p.b().edit().putString("proxy_active_ip", "").apply();
            oVar.f5774a = true;
            fVar.dismiss();
            aVar.a();
        }
        return ub.k.f9073a;
    }
}
