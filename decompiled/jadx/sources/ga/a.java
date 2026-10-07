package ga;

import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import android.view.View;
import app.namso_gen.spacehowen.MainActivity;
import app.namso_gen.spacehowen.SettingsActivity;
import app.namso_gen.spacehowen.ui.browser.ProfileViewerActivity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import da.v;
import fa.k0;
import fa.n0;
import fa.s1;
import fa.t1;
import gb.o;
import gb.u;
import gb.x;
import i5.d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import jc.i;
import o3.f;
import o3.n;
import q0.d2;
import q0.t;
import q3.l;
import x9.e;
import x9.q;
import x9.s;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements b, Continuation, SuccessContinuation, va.a, e, d, l, t, androidx.activity.result.b, f, n, i5.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4426a;

    public /* synthetic */ a(int i) {
        this.f4426a = i;
    }

    @Override // i5.d
    public Object apply(Object obj) {
        switch (this.f4426a) {
            case 10:
                hb.e eVar = (hb.e) obj;
                eVar.getClass();
                q5.d dVar = o.f4485a;
                dVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    dVar.g(eVar, byteArrayOutputStream);
                    break;
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            default:
                ja.a.f5718b.getClass();
                return c.f4427a.f((s1) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    @Override // ga.b
    public Object b(JsonReader jsonReader) throws IOException {
        String strNextString = null;
        Long lValueOf = null;
        int i = 2;
        switch (this.f4426a) {
            case 0:
                jsonReader.beginObject();
                Integer numValueOf = null;
                t1 t1VarD = null;
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "frames":
                            t1VarD = c.d(jsonReader, new a(i));
                            continue;
                            break;
                        case "name":
                            strNextString = jsonReader.nextString();
                            if (strNextString == null) {
                                throw new NullPointerException("Null name");
                            }
                            break;
                        case "importance":
                            numValueOf = Integer.valueOf(jsonReader.nextInt());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                String strH = strNextString != null ? "" : " name";
                if (numValueOf == null) {
                    strH = strH.concat(" importance");
                }
                if (t1VarD == null) {
                    strH = v.h(strH, " frames");
                }
                if (strH.isEmpty()) {
                    return new n0(strNextString, numValueOf.intValue(), t1VarD);
                }
                throw new IllegalStateException("Missing required properties:".concat(strH));
            case 1:
                jsonReader.beginObject();
                Long lValueOf2 = null;
                String str = null;
                String str2 = null;
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    switch (strNextName2) {
                        case "name":
                            String strNextString2 = jsonReader.nextString();
                            if (strNextString2 == null) {
                                throw new NullPointerException("Null name");
                            }
                            str = strNextString2;
                            break;
                            break;
                        case "size":
                            lValueOf2 = Long.valueOf(jsonReader.nextLong());
                            break;
                        case "uuid":
                            str2 = new String(Base64.decode(jsonReader.nextString(), 2), s1.f3842a);
                            break;
                        case "baseAddress":
                            lValueOf = Long.valueOf(jsonReader.nextLong());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                String strH2 = lValueOf == null ? " baseAddress" : "";
                if (lValueOf2 == null) {
                    strH2 = strH2.concat(" size");
                }
                if (str == null) {
                    strH2 = v.h(strH2, " name");
                }
                if (strH2.isEmpty()) {
                    return new k0(str, str2, lValueOf.longValue(), lValueOf2.longValue());
                }
                throw new IllegalStateException("Missing required properties:".concat(strH2));
            default:
                return c.a(jsonReader);
        }
    }

    @Override // q3.l
    public void c(q3.n nVar) {
        Log.e("CheckerCache", "save_status.php error: " + nVar.getMessage());
    }

    @Override // x9.e
    public Object d(s sVar) {
        switch (this.f4426a) {
            case 9:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(sVar);
            default:
                Set setB = sVar.b(q.a(ib.a.class));
                ib.c cVar = ib.c.f5254c;
                if (cVar == null) {
                    synchronized (ib.c.class) {
                        try {
                            cVar = ib.c.f5254c;
                            if (cVar == null) {
                                cVar = new ib.c(0);
                                ib.c.f5254c = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return new ib.b(setB, cVar);
        }
    }

    @Override // androidx.activity.result.b
    public void e(Object obj) {
        int i = SettingsActivity.f1300e0;
        Log.d("SettingsLang", "Permiso de notificaciones concedido=" + ((Boolean) obj));
    }

    @Override // q0.t
    public d2 k(View view, d2 d2Var) {
        switch (this.f4426a) {
            case 17:
                int i = MainActivity.f1283j0;
                i.e(view, "v");
                h0.c cVarF = d2Var.f7892a.f(7);
                i.d(cVarF, "getInsets(...)");
                view.setPadding(cVarF.f4545a, cVarF.f4546b, cVarF.f4547c, cVarF.f4548d);
                break;
            default:
                ConcurrentHashMap concurrentHashMap = ProfileViewerActivity.P;
                i.e(view, "v");
                h0.c cVarF2 = d2Var.f7892a.f(7);
                i.d(cVarF2, "getInsets(...)");
                view.setPadding(cVarF2.f4545a, cVarF2.f4546b, cVarF2.f4547c, cVarF2.f4548d);
                break;
        }
        return d2Var;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i;
        switch (this.f4426a) {
            case 4:
                i = 403;
                break;
            default:
                i = -1;
                break;
        }
        return Integer.valueOf(i);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        switch (this.f4426a) {
            case 6:
                x xVar = (x) obj;
                ib.c cVar = FirebaseMessaging.f2726m;
                xVar.getClass();
                Task taskD = xVar.d(new u("S", "all"));
                xVar.f();
                return taskD;
            case 7:
                x xVar2 = (x) obj;
                ib.c cVar2 = FirebaseMessaging.f2726m;
                xVar2.getClass();
                Task taskD2 = xVar2.d(new u("U", "all"));
                xVar2.f();
                return taskD2;
            case 23:
                return Tasks.forResult(null);
            default:
                return Tasks.forResult(null);
        }
    }

    @Override // i5.f
    public void f(Exception exc) {
    }

    @Override // o3.f
    public void a(o3.e eVar, String str) {
    }

    @Override // o3.n
    public void j(o3.e eVar, List list) {
    }
}
