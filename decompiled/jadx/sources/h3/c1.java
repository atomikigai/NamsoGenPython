package h3;

import android.util.Log;
import android.widget.Toast;
import app.namso_gen.spacehowen.R;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c1 implements ic.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4647c;

    public /* synthetic */ c1(int i, Object obj, Object obj2) {
        this.f4645a = i;
        this.f4646b = obj;
        this.f4647c = obj2;
    }

    @Override // ic.l
    public final Object invoke(Object obj) {
        switch (this.f4645a) {
            case 0:
                e1 e1Var = (e1) this.f4646b;
                String str = (String) this.f4647c;
                String str2 = (String) obj;
                Log.d("PremiumGate", "Gate seleccionado: " + str2);
                e1Var.A0 = str2;
                FirebaseAuth firebaseAuth = e1Var.f4680u0;
                if (firebaseAuth == null) {
                    jc.i.i("auth");
                    throw null;
                }
                if (firebaseAuth.f2702f == null) {
                    Toast.makeText(e1Var.U(), e1Var.v(R.string.error_sign_in_premium), 0).show();
                    e1Var.p0();
                } else {
                    List listW0 = pc.g.w0(pc.g.B0(str).toString(), new String[]{"\n"});
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listW0) {
                        if (!pc.g.m0((String) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        Toast.makeText(e1Var.U(), e1Var.v(R.string.error_no_cards), 0).show();
                    } else {
                        e1Var.q0();
                        e1Var.v0(arrayList, true);
                    }
                }
                return ub.k.f9073a;
            case 1:
                i3.r rVar = (i3.r) this.f4646b;
                i3.q qVar = (i3.q) this.f4647c;
                g2.a aVar = (g2.a) obj;
                jc.i.e(aVar, "_connection");
                rVar.f5199b.f(aVar, qVar);
                break;
            case 2:
                String str3 = (String) this.f4647c;
                List list = (List) this.f4646b;
                g2.a aVar2 = (g2.a) obj;
                jc.i.e(aVar2, "_connection");
                g2.c cVarR = aVar2.R(str3);
                try {
                    Iterator it = list.iterator();
                    int i = 1;
                    while (it.hasNext()) {
                        cVarR.q(i, (String) it.next());
                        i++;
                    }
                    cVarR.O();
                } finally {
                    cVarR.close();
                }
                break;
            default:
                g.f fVar = (g.f) this.f4646b;
                ic.l lVar = (ic.l) this.f4647c;
                jc.i.e((n3.b) obj, "pr");
                fVar.dismiss();
                lVar.invoke(Boolean.FALSE);
                break;
        }
        return ub.k.f9073a;
    }

    public /* synthetic */ c1(String str, List list) {
        this.f4645a = 2;
        this.f4647c = str;
        this.f4646b = list;
    }
}
