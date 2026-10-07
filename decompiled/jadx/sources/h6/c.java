package h6;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbce;
import com.google.android.gms.internal.ads.zzbcn;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f4977b;

    public /* synthetic */ c(j jVar, int i) {
        this.f4976a = i;
        this.f4977b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4976a) {
            case 0:
                j jVar = this.f4977b;
                jVar.c(jVar.f5010a);
                return;
            case 1:
                j jVar2 = this.f4977b;
                m mVar = d6.p.C.f2987n;
                String str = jVar2.f5013d;
                String str2 = jVar2.e;
                String str3 = jVar2.f5014f;
                boolean zN = mVar.n();
                Context context = jVar2.f5010a;
                boolean zL = mVar.l(context, str, str2);
                synchronized (mVar.f5031c) {
                    mVar.f5029a = zL;
                    break;
                }
                if (!mVar.n()) {
                    mVar.h(context, str, str2);
                    return;
                }
                if (!zN && !TextUtils.isEmpty(str3)) {
                    mVar.i(context, str2, str3, str);
                }
                i6.h.b("Device is linked for debug signals.");
                m.k(context, "The device is successfully linked for troubleshooting.", false, true);
                return;
            case 2:
                j jVar3 = this.f4977b;
                jVar3.f5015g = 4;
                jVar3.b();
                return;
            case 3:
                j jVar4 = this.f4977b;
                d6.p pVar = d6.p.C;
                m mVar2 = pVar.f2987n;
                Context context2 = jVar4.f5010a;
                String str4 = jVar4.f5013d;
                String str5 = jVar4.e;
                mVar2.getClass();
                zzbce zzbceVar = zzbcn.zzeK;
                e6.t tVar = e6.t.f3437d;
                String strP = m.p(context2, mVar2.q(context2, (String) tVar.f3440c.zza(zzbceVar), str4, str5).toString(), str5);
                if (!TextUtils.isEmpty(strP)) {
                    try {
                        JSONObject jSONObject = new JSONObject(strP.trim());
                        String strOptString = jSONObject.optString("gct");
                        mVar2.f5033f = jSONObject.optString("status");
                        if (((Boolean) tVar.f3440c.zza(zzbcn.zziO)).booleanValue()) {
                            boolean z4 = "0".equals((String) mVar2.f5033f) || "2".equals((String) mVar2.f5033f);
                            mVar2.j(z4);
                            ((n0) pVar.f2982g.zzi()).q(!z4 ? "" : str4);
                        }
                        synchronized (mVar2.f5031c) {
                            mVar2.e = strOptString;
                            break;
                        }
                        if ("2".equals((String) mVar2.f5033f)) {
                            i6.h.b("Creative is not pushed for this device.");
                            m.k(context2, "There was no creative pushed from DFP to the device.", false, false);
                            return;
                        } else if ("1".equals((String) mVar2.f5033f)) {
                            i6.h.b("The app is not linked for creative preview.");
                            mVar2.h(context2, str4, str5);
                            return;
                        } else {
                            if ("0".equals((String) mVar2.f5033f)) {
                                i6.h.b("Device is linked for in app preview.");
                                m.k(context2, "The device is successfully linked for creative preview.", false, true);
                                return;
                            }
                            return;
                        }
                    } catch (JSONException e) {
                        i6.h.h("Fail to get in app preview response json.", e);
                    }
                    break;
                } else {
                    i6.h.b("Not linked for in app preview.");
                }
                m.k(context2, "In-app preview failed to load because of a system error. Please try again later.", true, true);
                return;
            case 4:
                j jVar5 = this.f4977b;
                jVar5.getClass();
                d6.p.C.f2987n.g(jVar5.f5010a);
                return;
            case 5:
                j jVar6 = this.f4977b;
                jVar6.c(jVar6.f5010a);
                return;
            default:
                j jVar7 = this.f4977b;
                jVar7.getClass();
                d6.p.C.f2987n.g(jVar7.f5010a);
                return;
        }
    }
}
