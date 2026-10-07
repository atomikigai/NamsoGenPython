package k3;

import android.util.Log;
import bd.s;
import bd.u;
import bd.v;
import bd.x;
import bd.z;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import rc.a0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends ac.i implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5940b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, yb.d dVar, int i10) {
        super(i, dVar);
        this.f5939a = i10;
    }

    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        switch (this.f5939a) {
            case 0:
                g gVar = new g(2, dVar, 0);
                gVar.f5940b = obj;
                return gVar;
            case 1:
                g gVar2 = new g(2, dVar, 1);
                gVar2.f5940b = obj;
                return gVar2;
            case 2:
                g gVar3 = new g(2, dVar, 2);
                gVar3.f5940b = obj;
                return gVar3;
            default:
                g gVar4 = new g(2, dVar, 3);
                gVar4.f5940b = obj;
                return gVar4;
        }
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5939a) {
            case 0:
                return ((g) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 1:
                return ((g) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 2:
                return ((g) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            default:
                g gVar = (g) create((String) obj, (yb.d) obj2);
                ub.k kVar = ub.k.f9073a;
                gVar.invokeSuspend(kVar);
                return kVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        Object objM;
        Object objM2;
        ?? M;
        ?? arrayList;
        Object objM3;
        switch (this.f5939a) {
            case 0:
                zb.a aVar = zb.a.f11555a;
                r7.g.G(obj);
                try {
                    objM = (Void) Tasks.await(FirebaseMessaging.c().i.onSuccessTask(new ga.a(6)));
                    break;
                } catch (Throwable th) {
                    objM = r7.g.m(th);
                }
                return new ub.h(objM);
            case 1:
                zb.a aVar2 = zb.a.f11555a;
                r7.g.G(obj);
                try {
                    objM2 = (Void) Tasks.await(FirebaseMessaging.c().i.onSuccessTask(new ga.a(7)));
                    break;
                } catch (Throwable th2) {
                    objM2 = r7.g.m(th2);
                }
                return new ub.h(objM2);
            case 2:
                vb.q qVar = vb.q.f9297a;
                zb.a aVar3 = zb.a.f11555a;
                r7.g.G(obj);
                try {
                    u uVar = new u();
                    uVar.j("https://api.spacehowen.com/users-proxys/countries.php");
                    uVar.h("GET", null);
                    v vVarA = uVar.a();
                    s sVar = o.f5963a;
                    sVar.getClass();
                    x xVarC = new fd.i(sVar, vVarA).c();
                    try {
                        z zVar = xVarC.f1701r;
                        if (zVar != null) {
                            String strO = zVar.o();
                            if (xVarC.d()) {
                                JSONArray jSONArray = new JSONArray(strO);
                                arrayList = new ArrayList(jSONArray.length());
                                int length = jSONArray.length();
                                for (int i = 0; i < length; i++) {
                                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                                    if (jSONObjectOptJSONObject != null) {
                                        String strOptString = jSONObjectOptJSONObject.optString("code");
                                        String strOptString2 = jSONObjectOptJSONObject.optString("name");
                                        jc.i.b(strOptString);
                                        if (strOptString.length() > 0) {
                                            jc.i.b(strOptString2);
                                            if (strOptString2.length() > 0) {
                                                try {
                                                    String displayCountry = new Locale("", strOptString).getDisplayCountry(Locale.getDefault());
                                                    int length2 = displayCountry.length();
                                                    objM3 = displayCountry;
                                                    if (length2 == 0) {
                                                        objM3 = strOptString2;
                                                    }
                                                } catch (Throwable th3) {
                                                    objM3 = r7.g.m(th3);
                                                }
                                                arrayList.add(new m(strOptString, (String) (objM3 instanceof ub.g ? strOptString2 : objM3)));
                                            }
                                        }
                                    }
                                }
                            } else {
                                arrayList = qVar;
                            }
                        } else {
                            arrayList = qVar;
                        }
                        xVarC.close();
                        M = arrayList;
                        Throwable thA = ub.h.a(M);
                        if (thA == null) {
                            return M;
                        }
                        Log.e("PremiumProxyApi", "Error al cargar países: " + thA.getMessage());
                        return qVar;
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            r7.g.h(xVarC, th4);
                            throw th5;
                        }
                    }
                } catch (Throwable th6) {
                    M = r7.g.m(th6);
                }
                break;
            default:
                zb.a aVar4 = zb.a.f11555a;
                r7.g.G(obj);
                Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f5940b));
                return ub.k.f9073a;
        }
    }
}
